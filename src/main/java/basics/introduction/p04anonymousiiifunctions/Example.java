package basics.introduction.p04anonymousiiifunctions;

import basics.introduction.p04anonymousiiifunctions.Example$;
import scala.Function0;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxedUnit;

public final class Example {
    public static void main(String[] arrstring) {
        Example$.MODULE$.main(arrstring);
    }

    public static void oncePerSecond(Function0<BoxedUnit> function0) {
        Example$.MODULE$.oncePerSecond(function0);
    }
}
