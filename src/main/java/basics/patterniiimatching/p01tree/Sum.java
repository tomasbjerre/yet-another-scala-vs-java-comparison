package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Sum$;
import basics.patterniiimatching.p01tree.Tree;
import scala.Function1;
import scala.Option;
import scala.Product;
import scala.Serializable;
import scala.Tuple2;
import scala.collection.Iterator;
import scala.reflect.ScalaSignature;
import scala.runtime.BoxesRunTime;
import scala.runtime.ScalaRunTime$;

public class Sum
extends Tree
implements Product,
Serializable {
    private final Tree l;
    private final Tree r;

    public static Option<Tuple2<Tree, Tree>> unapply(Sum sum) {
        return Sum$.MODULE$.unapply(sum);
    }

    public static Sum apply(Tree tree, Tree tree2) {
        return Sum$.MODULE$.apply(tree, tree2);
    }

    public static Function1<Tuple2<Tree, Tree>, Sum> tupled() {
        return Sum$.MODULE$.tupled();
    }

    public static Function1<Tree, Function1<Tree, Sum>> curried() {
        return Sum$.MODULE$.curried();
    }

    public Tree l() {
        return this.l;
    }

    public Tree r() {
        return this.r;
    }

    public Sum copy(Tree l, Tree r) {
        return new Sum(l, r);
    }

    public Tree copy$default$1() {
        return this.l();
    }

    public Tree copy$default$2() {
        return this.r();
    }

    public String productPrefix() {
        return "Sum";
    }

    public int productArity() {
        return 2;
    }

    public Object productElement(int x$1) {
        Tree tree;
        int n = x$1;
        switch (n) {
            default: {
                throw new IndexOutOfBoundsException(BoxesRunTime.boxToInteger((int)x$1).toString());
            }
            case 1: {
                tree = this.r();
                break;
            }
            case 0: {
                tree = this.l();
            }
        }
        return tree;
    }

    public Iterator<Object> productIterator() {
        return ScalaRunTime$.MODULE$.typedProductIterator((Product)this);
    }

    public boolean canEqual(Object x$1) {
        return x$1 instanceof Sum;
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
        if (!(object instanceof Sum)) return false;
        boolean bl = true;
        if (!bl) return false;
        Sum sum = (Sum)x$1;
        Tree tree = this.l();
        Tree tree2 = sum.l();
        if (tree == null) {
            if (tree2 != null) {
                return false;
            }
        } else if (!tree.equals(tree2)) return false;
        Tree tree3 = this.r();
        Tree tree4 = sum.r();
        if (tree3 == null) {
            if (tree4 != null) {
                return false;
            }
        } else if (!tree3.equals(tree4)) return false;
        if (!sum.canEqual(this)) return false;
        return true;
    }

    public Sum(Tree l, Tree r) {
        this.l = l;
        this.r = r;
        Product.class.$init$((Product)this);
    }
}
