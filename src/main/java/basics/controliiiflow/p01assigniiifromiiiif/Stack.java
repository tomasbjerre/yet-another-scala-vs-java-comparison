package basics.controliiiflow.p01assigniiifromiiiif;

import scala.collection.immutable.List;
import scala.collection.immutable.Nil$;
import scala.reflect.ScalaSignature;

@ScalaSignature(
    bytes =
        "\u0006\u0001\u00153A!\u0001\u0002\u0001\u0013\t)1\u000b^1dW*\u00111\u0001B\u0001\u0016aB\n\u0014m]:jO:L\u0017.\u001b4s_6L\u0017.[5g\u0015\t)a!\u0001\bd_:$(o\u001c7jS&4Gn\\<\u000b\u0003\u001d\taAY1tS\u000e\u001c8\u0001A\u000b\u0003\u0015a\u0019\"\u0001A\u0006\u0011\u00051yQ\"A\u0007\u000b\u00039\tQa]2bY\u0006L!\u0001E\u0007\u0003\r\u0005s\u0017PU3g\u0011\u0015\u0011\u0002\u0001\"\u0001\u0014\u0003\u0019a\u0014N\\5u}Q\tA\u0003E\u0002\u0016\u0001Yi\u0011A\u0001\t\u0003/aa\u0001\u0001B\u0003\u001a\u0001\t\u0007!DA\u0001B#\tYb\u0004\u0005\u0002\r9%\u0011Q$\u0004\u0002\b\u001d>$\b.\u001b8h!\taq$\u0003\u0002!\u001b\t\u0019\u0011I\\=\t\u000f\t\u0002\u0001\u0019!C\u0005G\u0005AQ\r\\3nK:$8/F\u0001%!\r)SF\u0006\b\u0003M-r!a\n\u0016\u000e\u0003!R!!\u000b\u0005\u0002\rq\u0012xn\u001c;?\u0013\u0005q\u0011B\u0001\u0017\u000e\u0003\u001d\u0001\u0018mY6bO\u0016L!AL\u0018\u0003\t1K7\u000f\u001e\u0006\u0003Y5Aq!\r\u0001A\u0002\u0013%!'\u0001\u0007fY\u0016lWM\u001c;t?\u0012*\u0017\u000f\u0006\u00024mA\u0011A\u0002N\u0005\u0003k5\u0011A!\u00168ji\"9q\u0007MA\u0001\u0002\u0004!\u0013a\u0001=%c!1\u0011\b\u0001Q!\n\u0011\n\u0011\"\u001a7f[\u0016tGo\u001d\u0011\t\u000bm\u0002A\u0011\u0001\u001f\u0002\tA,8\u000f\u001b\u000b\u0003guBQA\u0010\u001eA\u0002Y\t\u0011\u0001\u001f\u0005\u0006\u0001\u0002!\t!Q\u0001\u0005a\u0016,7.F\u0001\u0017\u0011\u0015\u0019\u0005\u0001\"\u0001E\u0003\r\u0001x\u000e\u001d\u000b\u0002-\u0001")
public class Stack<A> {
  private List<A> elements = Nil$.MODULE$;

  private List<A> elements() {
    return this.elements;
  }

  private void elements_$eq(List<A> x$1) {
    this.elements = x$1;
  }

  public void push(A x) {
    A a = x;
    this.elements_$eq(this.elements().$colon$colon(a));
  }

  public A peek() {
    return (A) this.elements().head();
  }

  public A pop() {
    A currentTop = this.peek();
    this.elements_$eq((List) this.elements().tail());
    return currentTop;
  }
}
