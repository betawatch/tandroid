// default package

import android.content.res.Configuration;
import android.os.LocaleList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class to {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static m96 b(Configuration configuration) {
        return m96.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(m96 m96Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(m96Var.a.a()));
    }

    public static void d(Configuration configuration, m96 m96Var) {
        configuration.setLocales(LocaleList.forLanguageTags(m96Var.a.a()));
    }
}
