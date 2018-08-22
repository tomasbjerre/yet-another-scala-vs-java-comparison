package basics.introduction.p01helloiiiworld;

import scala.Predef$;

public final class HelloWorld$ {
    public static final HelloWorld$ MODULE$;

    public static {
        new basics.introduction.p01helloiiiworld.HelloWorld$();
    }

    public void main(String[] args) {
        Predef$.MODULE$.println((Object)"Hello, world!");
    }

    private HelloWorld$() {
        MODULE$ = this;
    }
}
