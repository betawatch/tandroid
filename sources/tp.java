// default package

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class tp {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static lb6 b(Configuration configuration) {
        return lb6.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(lb6 lb6Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(lb6Var.a.a()));
    }

    public static void d(Configuration configuration, lb6 lb6Var) {
        configuration.setLocales(LocaleList.forLanguageTags(lb6Var.a.a()));
    }
}
