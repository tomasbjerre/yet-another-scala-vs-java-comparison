package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Sum;
import basics.patterniiimatching.p01tree.Tree;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.Tuple2;
import scala.runtime.AbstractFunction2;

public final class Sum$
extends AbstractFunction2<Tree, Tree, Sum>
implements Serializable {
    public static final Sum$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Sum$();
    }

    public final String toString() {
        return "Sum";
    }

    public Sum apply(Tree l, Tree r) {
        return new Sum(l, r);
    }

    public Option<Tuple2<Tree, Tree>> unapply(Sum x$0) {
        return x$0 == null ? None$.MODULE$ : new Some((Object)new Tuple2((Object)x$0.l(), (Object)x$0.r()));
    }

    private Object readResolve() {
        return MODULE$;
    }

    private Sum$() {
        MODULE$ = this;
    }
}
