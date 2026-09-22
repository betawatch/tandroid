package w7;

import java.util.Locale;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public abstract class q8 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.gms.internal.vision.e2.i(2, 0, String.valueOf(ob.a.D2().get(1))), Integer.valueOf(i10)));
    }
}
