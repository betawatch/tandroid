package w7;

import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class h7 {
    public static int a(int i10) {
        if (i10 >= 100 || i10 < 0) {
            return i10;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", c3.i0.m(2, 0, String.valueOf(hb.a.k0().get(1))), Integer.valueOf(i10)));
    }
}
