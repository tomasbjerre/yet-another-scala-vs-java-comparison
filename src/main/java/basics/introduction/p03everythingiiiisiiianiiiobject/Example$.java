package basics.introduction.p03everythingiiiisiiianiiiobject;

import scala.Predef$;
import scala.runtime.BoxesRunTime;

public final class Example$ {
    public static final Example$ MODULE$;

    public static {
        new basics.introduction.p03everythingiiiisiiianiiiobject.Example$();
    }

    public void main(int x) {
        int y = 1 + 6 / x;
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToInteger((int)y));
        int y2 = 1 + 6 / x;
        Predef$.MODULE$.println((Object)BoxesRunTime.boxToInteger((int)y2));
    }

    private Example$() {
        MODULE$ = this;
    }
}
