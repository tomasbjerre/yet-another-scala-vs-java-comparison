package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Tree;
import basics.patterniiimatching.p01tree.Var$;
import scala.Function1;
import scala.Option;
import scala.Product;
import scala.Serializable;
import scala.collection.Iterator;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxesRunTime;
import scala.runtime.ScalaRunTime$;

public class Var
extends Tree
implements Product,
Serializable {
    private final String n;

    public static Option<String> unapply(Var var) {
        return Var$.MODULE$.unapply(var);
    }

    public static Var apply(String string) {
        return Var$.MODULE$.apply(string);
    }

    public static <A> Function1<String, A> andThen(Function1<Var, A> function1) {
        return Var$.MODULE$.andThen(function1);
    }

    public static <A> Function1<A, Var> compose(Function1<A, String> function1) {
        return Var$.MODULE$.compose(function1);
    }

    public String n() {
        return this.n;
    }

    public Var copy(String n) {
        return new Var(n);
    }

    public String copy$default$1() {
        return this.n();
    }

    public String productPrefix() {
        return "Var";
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
        return this.n();
    }

    public Iterator<Object> productIterator() {
        return ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }

    public boolean canEqual(Object x$1) {
        return x$1 instanceof Var;
    }

    public int hashCode() {
        return ScalaRunTime$.MODULE$._hashCode((Product)this);
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
        if (!(object instanceof Var)) return false;
        boolean bl = true;
        if (!bl) return false;
        Var var = (Var)x$1;
        String string = this.n();
        String string2 = var.n();
        if (string == null) {
            if (string2 != null) {
                return false;
            }
        } else if (!string.equals(string2)) return false;
        if (!var.canEqual(this)) return false;
        return true;
    }

    public Var(String n) {
        this.n = n;
        Product.class.$init$((Product)this);
    }
}
