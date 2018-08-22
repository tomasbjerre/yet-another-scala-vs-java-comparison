#!/bin/bash
rm -rf doc
rm -rf src/main/java
./gradlew build -i || exit
find build/classes/scala/main/ | grep class$ | xargs java -jar lib/cfr_0_132.jar --outputdir src/main/java || exit
find src/main/java -regex ".*\.java$" -exec sed -i '/@ScalaSignature/ d' {} \;
find src/main/java -regex ".*\.java$" -exec sed -i '/^\/\*/ d' {} \;
find src/main/java -regex ".*\.java$" -exec sed -i '/^ \*/ d' {} \;
find src/main/java -regex ".*\.java$" -exec sed -i '/^ \*\// d' {} \;
./gradlew generateComparison || exit
