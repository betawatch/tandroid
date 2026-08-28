package pf;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x0 {
    public int a;
    public int b;

    public x0(int i9, int i10) {
        this.a = i9;
        this.b = i10;
    }

    public static String a(int i9) {
        int i10 = i9 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i9 - i10) / 60) % 24, i10);
        String format = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        return i9 > 1440 ? LocaleController.formatString(R.string.BusinessHoursNextDay, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
