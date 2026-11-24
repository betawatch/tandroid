// default package

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class t01 {
    public static final /* synthetic */ int a = 0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            tga.f(30);
            tga.f(31);
            tga.f(33);
            tga.f(1000000);
        }
    }

    public static final boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i >= 32) {
            String str = Build.VERSION.CODENAME;
            str.getClass();
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                upperCase.getClass();
                Integer num = upperCase.equals("BAKLAVA") ? r1 : null;
                String upperCase2 = "Tiramisu".toUpperCase(locale);
                upperCase2.getClass();
                r1 = upperCase2.equals("BAKLAVA") ? 0 : null;
                if (num != null) {
                    if (r1 == null || num.intValue() >= r1.intValue()) {
                        return true;
                    }
                } else if (r1 == null) {
                    String upperCase3 = str.toUpperCase(locale);
                    upperCase3.getClass();
                    String upperCase4 = "Tiramisu".toUpperCase(locale);
                    upperCase4.getClass();
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
