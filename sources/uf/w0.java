package uf;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w0 {
    public int a;
    public int b;

    public w0(int i10, int i11) {
        this.a = i10;
        this.b = i11;
    }

    public static String a(int i10) {
        int i11 = i10 % 60;
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, 0, 0, ((i10 - i11) / 60) % 24, i11);
        String format = LocaleController.getInstance().getFormatterConstDay().format(calendar.getTime());
        return i10 > 1440 ? LocaleController.formatString(R.string.BusinessHoursNextDay, format) : format;
    }

    public final String toString() {
        return a(this.a) + " - " + a(this.b);
    }
}
