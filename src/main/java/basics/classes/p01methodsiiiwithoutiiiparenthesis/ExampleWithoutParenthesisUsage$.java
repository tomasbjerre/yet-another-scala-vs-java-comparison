package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleWithoutParenthesis;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class ExampleWithoutParenthesisUsage$ {
    public static final ExampleWithoutParenthesisUsage$ MODULE$;

    public static {
        new basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleWithoutParenthesisUsage$();
    }

    public void main(String[] args) {
        ExampleWithoutParenthesis c = new ExampleWithoutParenthesis(1.2, 3.4);
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"imaginary part: ").append((Object)BoxesRunTime.boxToDouble((double)c.im())).toString());
    }

    private ExampleWithoutParenthesisUsage$() {
        MODULE$ = this;
    }
}
