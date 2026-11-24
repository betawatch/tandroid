// default package

import android.os.Build;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class zod {
    public static int a(hk0 hk0Var, gk0 gk0Var) {
        byte b = hk0Var.d;
        if (b != 0) {
            return b;
        }
        if (gk0Var != null) {
            return 15;
        }
        return nm7.d4;
    }

    public static boolean b(int i) {
        return (i & 32768) != 0;
    }

    public static boolean c(int i) {
        if (i == 15 || i == 255) {
            return true;
        }
        if (i == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i != 32783) {
            return i == 33023 || i == 0;
        }
        int i2 = Build.VERSION.SDK_INT;
        return i2 < 28 || i2 > 29;
    }
}
