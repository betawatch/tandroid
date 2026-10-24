package v7;

import android.os.Build;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class k {
    public static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 28 || i11 > 29;
    }
}
