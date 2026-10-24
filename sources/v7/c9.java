package v7;

import android.os.Build;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
