package x7;

import b8.ng;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class d9 {
    public static ng a;

    public static synchronized b9 a(y8 y8Var) {
        b9 b9Var;
        synchronized (d9.class) {
            try {
                if (a == null) {
                    a = new ng(2);
                }
                b9Var = (b9) a.R0(y8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b9Var;
    }
}
