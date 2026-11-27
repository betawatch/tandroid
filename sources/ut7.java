// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ut7 {
    public int a;
    public int b;

    public ut7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static String a(int i) {
        int i2 = i % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i - i2) / 60) % 24, i2);
        ob6 D0 = ob6.D0();
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
                    boolean z = ob6.c0;
                    D0.c = ob6.k(z ? "HH:mm" : "h:mm a", z ? "HH:mm" : "h:mm a", locale);
                }
            }
        }
        String format = D0.c.format(calendar.getTime());
        return i > 1440 ? ob6.a0(null, null, 2131752729, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
