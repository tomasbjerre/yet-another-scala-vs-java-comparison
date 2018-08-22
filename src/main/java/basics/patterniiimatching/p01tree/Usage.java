package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Tree;
import basics.patterniiimatching.p01tree.Usage$;
import scala.Function1;
import scala.reflect.ScalaSignature;

public final class Usage {
    public static void main(String[] arrstring) {
        Usage$.MODULE$.main(arrstring);
    }

    public static Tree derive(Tree tree, String string) {
        return Usage$.MODULE$.derive(tree, string);
    }

    public static int eval(Tree tree, Function1<String, Object> function1) {
        return Usage$.MODULE$.eval(tree, function1);
    }
}
