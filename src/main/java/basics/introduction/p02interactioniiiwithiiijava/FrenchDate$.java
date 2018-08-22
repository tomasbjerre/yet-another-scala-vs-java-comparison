package basics.introduction.p02interactioniiiwithiiijava;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import scala.Predef$;

public final class FrenchDate$ {
    public static final FrenchDate$ MODULE$;

    public static {
        new basics.introduction.p02interactioniiiwithiiijava.FrenchDate$();
    }

    public void main(String[] args) {
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance(1, Locale.FRANCE);
        Predef$.MODULE$.println((Object)df.format(now));
    }

    private FrenchDate$() {
        MODULE$ = this;
    }
}
