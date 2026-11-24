// default package

import android.os.Build;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class wmd {
    public static int a(hj0 hj0Var, gj0 gj0Var) {
        byte b = hj0Var.d;
        if (b != 0) {
            return b;
        }
        if (gj0Var != null) {
            return 15;
        }
        return kk7.d4;
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
