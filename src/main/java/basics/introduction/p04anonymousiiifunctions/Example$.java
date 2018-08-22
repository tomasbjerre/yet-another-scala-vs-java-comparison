package basics.introduction.p04anonymousiiifunctions;

import basics.introduction.p04anonymousiiifunctions.Example$;
import scala.Function0;
import scala.Serializable;
import scala.runtime.BoxedUnit;

public final class Example$ {
    public static final Example$ MODULE$;

    public static {
        new basics.introduction.p04anonymousiiifunctions.Example$();
    }

    public void oncePerSecond(Function0<BoxedUnit> callback) {
        do {
            callback.apply$mcV$sp();
            Thread.sleep(1000L);
        } while (true);
    }

    public void main(String[] args) {
        this.oncePerSecond((Function0<BoxedUnit>)new Serializable(){
            public static final long serialVersionUID = 0L;

            public final void apply() {
                this.apply$mcV$sp();
            }

            public void apply$mcV$sp() {
                scala.Predef$.MODULE$.println((Object)"time flies like an arrow...");
            }
        });
    }

    private Example$() {
        MODULE$ = this;
    }
}
