package r7;

import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class p {
    public static final StringBuilder a;

    static {
        Locale locale = Locale.ROOT;
        new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        a = new StringBuilder(33);
    }

    public static void a(StringBuilder sb2, long j3) {
        if (j3 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j3 < 0) {
            sb2.append("-");
            if (j3 != Long.MIN_VALUE) {
                j3 = -j3;
            } else {
                j3 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j3 >= 86400000) {
            sb2.append(j3 / 86400000);
            sb2.append("d");
            j3 %= 86400000;
        }
        if (true == z10) {
            j3 = 25975808;
        }
        if (j3 >= 3600000) {
            sb2.append(j3 / 3600000);
            sb2.append("h");
            j3 %= 3600000;
        }
        if (j3 >= 60000) {
            sb2.append(j3 / 60000);
            sb2.append("m");
            j3 %= 60000;
        }
        if (j3 >= 1000) {
            sb2.append(j3 / 1000);
            sb2.append("s");
            j3 %= 1000;
        }
        if (j3 > 0) {
            sb2.append(j3);
            sb2.append("ms");
        }
    }
}
