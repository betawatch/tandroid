// default package

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class uo {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static qb6 b(Configuration configuration) {
        return qb6.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(qb6 qb6Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(qb6Var.a.a()));
    }

    public static void d(Configuration configuration, qb6 qb6Var) {
        configuration.setLocales(LocaleList.forLanguageTags(qb6Var.a.a()));
    }
}
