// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pq7 {
    public int a;
    public int b;

    public pq7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static String a(int i) {
        int i2 = i % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i - i2) / 60) % 24, i2);
        k96 D0 = k96.D0();
        if (D0.c == null) {
            synchronized (D0) {
                if (D0.c == null) {
                    Locale locale = D0.y;
                    if (locale == null) {
                        locale = Locale.getDefault();
                    }
                    String language = locale.getLanguage();
                    if (language == null) {
                        language = "en";
                    }
                    String lowerCase = language.toLowerCase();
                    if (!lowerCase.toLowerCase().equals("ar") && !lowerCase.toLowerCase().equals("ko")) {
                        locale = Locale.US;
                    }
                    boolean z = k96.c0;
                    D0.c = k96.k(locale, z ? "HH:mm" : "h:mm a", z ? "HH:mm" : "h:mm a");
                }
            }
        }
        String format = D0.c.format(calendar.getTime());
        return i > 1440 ? k96.a0(null, null, 2131752736, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
