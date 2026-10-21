package v7;

import android.os.Build;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public abstract class c9 {
    public static t7.r a;

    public static boolean a(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }

    public static synchronized y8 b(v8 v8Var) {
        y8 y8Var;
        synchronized (c9.class) {
            try {
                if (a == null) {
                    a = new t7.r(1);
                }
                y8Var = (y8) a.R0(v8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y8Var;
    }
}
