package basics.introduction.p01helloiiifworld;

import scala.Predef$;

public final class HelloWorld$ {
    public static final HelloWorld$ MODULE$;

    public static {
        new basics.introduction.p01helloiiifworld.HelloWorld$();
    }

    public void main(String[] args) {
        Predef$.MODULE$.println((Object)"Hello, world!");
    }

    private HelloWorld$() {
        MODULE$ = this;
    }
}
