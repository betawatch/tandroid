package y7;

import a8.za;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class g9 {
    public static za a;

    public static synchronized e9 a(b9 b9Var) {
        e9 e9Var;
        synchronized (g9.class) {
            try {
                if (a == null) {
                    a = new za(3);
                }
                e9Var = (e9) a.R0(b9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e9Var;
    }
}
