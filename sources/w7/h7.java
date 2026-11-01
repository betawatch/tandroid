package w7;

import java.util.Locale;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class h7 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", c3.i0.m(2, 0, String.valueOf(hb.a.k0().get(1))), Integer.valueOf(i10)));
    }
}
