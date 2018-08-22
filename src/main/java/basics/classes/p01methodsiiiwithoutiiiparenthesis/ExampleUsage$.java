package basics.classes.p01methodsiiiwithoutiiiparenthesis;

import basics.classes.p01methodsiiiwithoutiiiparenthesis.Example;
import scala.Predef$;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class ExampleUsage$ {
    public static final ExampleUsage$ MODULE$;

    public static {
        new basics.classes.p01methodsiiiwithoutiiiparenthesis.ExampleUsage$();
    }

    public void main(String[] args) {
        Example c = new Example(1.2, 3.4);
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"imaginary part: ").append((Object)BoxesRunTime.boxToDouble((double)c.im())).toString());
    }

    private ExampleUsage$() {
        MODULE$ = this;
    }
}
