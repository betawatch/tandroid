package x7;

import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class h0 {
    public static int a(int i3) {
        if (i3 >= 100 || i3 < 0) {
            return i3;
        }
        return Integer.parseInt(String.format(Locale.US, "%s%02d", com.google.android.recaptcha.internal.a.j(String.valueOf(v7.s.C0().get(1)), 2, 0), Integer.valueOf(i3)));
    }
}
