package w7;

import java.util.Locale;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class p8 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.i(2, 0, String.valueOf(ob.a.D2().get(1))), Integer.valueOf(i10)));
    }
}
