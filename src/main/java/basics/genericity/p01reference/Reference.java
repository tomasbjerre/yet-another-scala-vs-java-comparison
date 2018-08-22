package basics.genericity.p01reference;

import scala.reflect.ScalaSignature;

public class Reference<T> {
    private T contents;

    private T contents() {
        return this.contents;
    }

    private void contents_$eq(T x$1) {
        this.contents = x$1;
    }

    public void set(T value) {
        this.contents_$eq(value);
    }

    public T get() {
        return this.contents();
    }
}
