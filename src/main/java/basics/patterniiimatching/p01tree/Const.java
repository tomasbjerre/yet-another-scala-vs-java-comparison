package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Const$;
import basics.patterniiimatching.p01tree.Tree;
import scala.Function1;
import scala.Option;
import scala.Product;
import scala.Serializable;
import scala.collection.Iterator;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxesRunTime;
import scala.runtime.ScalaRunTime$;
import scala.runtime.Statics;

public class Const
extends Tree
implements Product,
Serializable {
    private final int v;

    public static Option<Object> unapply(Const const_) {
        return Const$.MODULE$.unapply(const_);
    }

    public static Const apply(int n) {
        return Const$.MODULE$.apply(n);
    }

    public static <A> Function1<Object, A> andThen(Function1<Const, A> function1) {
        return Const$.MODULE$.andThen(function1);
    }

    public static <A> Function1<A, Const> compose(Function1<A, Object> function1) {
        return Const$.MODULE$.compose(function1);
    }

    public int v() {
        return this.v;
    }

    public Const copy(int v) {
        return new Const(v);
    }

    public int copy$default$1() {
        return this.v();
    }

    public String productPrefix() {
        return "Const";
    }

    public int productArity() {
        return 1;
    }

    public Object productElement(int x$1) {
        int n = x$1;
        switch (n) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger((int)x$1).toString());
            }
            case 0: 
        }
        return BoxesRunTime.boxToInteger((int)this.v());
    }

    public Iterator<Object> productIterator() {
        return ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }

    public boolean canEqual(Object x$1) {
        return x$1 instanceof Const;
    }

    public int hashCode() {
        int n = -889275714;
        n = Statics.mix((int)n, (int)this.v());
        return Statics.finalizeHash((int)n, (int)1);
    }

    public String toString() {
        return ScalaRunTime$.MODULE$._toString((Product)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object x$1) {
        if (this == x$1) return true;
        Object object = x$1;
        if (!(object instanceof Const)) return false;
        boolean bl = true;
        if (!bl) return false;
        Const const_ = (Const)x$1;
        if (this.v() != const_.v()) return false;
        if (!const_.canEqual(this)) return false;
        return true;
    }

    public Const(int v) {
        this.v = v;
        Product.class.$init$((Product)this);
    }
}
