
[<< back](https://github.com/tomasbjerre/yet-another-scala-vs-java-comparison)

-----------------------------

# Tree

## Scala

**Example.scala**

```scala
package basics.patterniiimatching.p01tree

abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree


object Usage {

  type Environment = String => Int

  def eval(t: Tree, env: Environment): Int = t match {
    case Sum(l, r) => eval(l, env) + eval(r, env)
    case Var(n)    => env(n)
    case Const(v)  => v
  }

  def derive(t: Tree, v: String): Tree = t match {
    case Sum(l, r) => Sum(derive(l, v), derive(r, v))
    case Var(n) if (v == n) => Const(1)
    case _ => Const(0)
  }

  def main(args: Array[String]) {
    val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env: Environment = { case "x" => 5 case "y" => 7 }
    println("Expression: " + exp)
    println("Evaluation with x=5, y=7: " + eval(exp, env))
    println("Derivative relative to x:\n " + derive(exp, "x"))
    println("Derivative relative to y:\n " + derive(exp, "y"))
  }
}
```

## Java

**Const.java**

```java
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

```

**Usage.java**

```java
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

```

**Var$.java**

```java
package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Var;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.runtime.AbstractFunction1;

public final class Var$
extends AbstractFunction1<String, Var>
implements Serializable {
    public static final Var$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Var$();
    }

    public final String toString() {
        return "Var";
    }

    public Var apply(String n) {
        return new Var(n);
    }

    public Option<String> unapply(Var x$0) {
        return x$0 == null ? None$.MODULE$ : new Some((Object)x$0.n());
    }

    private Object readResolve() {
        return MODULE$;
    }

    private Var$() {
        MODULE$ = this;
    }
}

```

**Sum.java**

```java
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

```

**Var.java**

```java
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

```

**Const$.java**

```java
package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Const;
import scala.None$;
import scala.Option;
import scala.Serializable;
import scala.Some;
import scala.runtime.AbstractFunction1;
import scala.runtime.BoxesRunTime;

public final class Const$
extends AbstractFunction1<Object, Const>
implements Serializable {
    public static final Const$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Const$();
    }

    public final String toString() {
        return "Const";
    }

    public Const apply(int v) {
        return new Const(v);
    }

    public Option<Object> unapply(Const x$0) {
        return x$0 == null ? None$.MODULE$ : new Some((Object)BoxesRunTime.boxToInteger((int)x$0.v()));
    }

    private Object readResolve() {
        return MODULE$;
    }

    private Const$() {
        MODULE$ = this;
    }
}

```

**Tree.java**

```java
package basics.patterniiimatching.p01tree;

import scala.reflect.ScalaSignature;

public abstract class Tree {
}

```

**Usage$.java**

```java
package basics.patterniiimatching.p01tree;

import basics.patterniiimatching.p01tree.Const;
import basics.patterniiimatching.p01tree.Sum;
import basics.patterniiimatching.p01tree.Tree;
import basics.patterniiimatching.p01tree.Usage$;
import basics.patterniiimatching.p01tree.Var;
import scala.Function1;
import scala.MatchError;
import scala.Predef$;
import scala.Serializable;
import scala.collection.mutable.StringBuilder;
import scala.runtime.BoxesRunTime;

public final class Usage$ {
    public static final Usage$ MODULE$;

    public static {
        new basics.patterniiimatching.p01tree.Usage$();
    }

    public int eval(Tree t, Function1<String, Object> env) {
        Tree tree;
        block5 : {
            int n;
            block3 : {
                int v;
                block4 : {
                    block2 : {
                        tree = t;
                        if (!(tree instanceof Sum)) break block2;
                        Sum sum = (Sum)tree;
                        Tree l = sum.l();
                        Tree r = sum.r();
                        n = this.eval(l, env) + this.eval(r, env);
                        break block3;
                    }
                    if (!(tree instanceof Var)) break block4;
                    Var var = (Var)tree;
                    String n2 = var.n();
                    n = BoxesRunTime.unboxToInt((Object)env.apply((Object)n2));
                    break block3;
                }
                if (!(tree instanceof Const)) break block5;
                Const const_ = (Const)tree;
                n = v = const_.v();
            }
            return n;
        }
        throw new MatchError((Object)tree);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Tree derive(Tree t, String v) {
        void var7_10;
        Tree tree = t;
        if (tree instanceof Sum) {
            Sum sum = (Sum)tree;
            Tree l = sum.l();
            Tree r = sum.r();
            Sum sum2 = new Sum(this.derive(l, v), this.derive(r, v));
            return var7_10;
        }
        if (tree instanceof Var) {
            Var var = (Var)tree;
            String n = var.n();
            String string = v;
            String string2 = n;
            if (!(string != null ? !string.equals(string2) : string2 != null)) {
                Const const_ = new Const(1);
                return var7_10;
            }
        }
        Const const_ = new Const(0);
        return var7_10;
    }

    public void main(String[] args) {
        Sum exp = new Sum(new Sum(new Var("x"), new Var("x")), new Sum(new Const(7), new Var("y")));
        Serializable env = new Serializable(){
            public static final long serialVersionUID = 0L;

            public final int apply(String x0$1) {
                String string;
                block4 : {
                    int n;
                    block3 : {
                        block2 : {
                            string = x0$1;
                            if (!"x".equals(string)) break block2;
                            n = 5;
                            break block3;
                        }
                        if (!"y".equals(string)) break block4;
                        n = 7;
                    }
                    return n;
                }
                throw new MatchError((Object)string);
            }
        };
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"Expression: ").append((Object)exp).toString());
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"Evaluation with x=5, y=7: ").append((Object)BoxesRunTime.boxToInteger((int)this.eval(exp, (Function1<String, Object>)env))).toString());
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"Derivative relative to x:\n ").append((Object)this.derive(exp, "x")).toString());
        Predef$.MODULE$.println((Object)new StringBuilder().append((Object)"Derivative relative to y:\n ").append((Object)this.derive(exp, "y")).toString());
    }

    private Usage$() {
        MODULE$ = this;
    }
}

```

**Sum$.java**

```java
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

```
