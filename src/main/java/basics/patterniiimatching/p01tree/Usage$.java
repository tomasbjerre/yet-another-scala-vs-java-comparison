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
