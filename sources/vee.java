// default package

import java.util.Calendar;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class vee {
    public static int a(int i) {
        if (i >= 100 || i < 0) {
            return i;
        }
        if (k1f.G == null) {
            k1f.G = new k1f((byte) 15);
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", ts2.m(2, 0, String.valueOf(Calendar.getInstance().get(1))), Integer.valueOf(i)));
    }
}
