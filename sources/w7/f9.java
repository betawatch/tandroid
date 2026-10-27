package w7;

import a8.qg;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public abstract class f9 {
    public static qg a;

    public static synchronized d9 a(a9 a9Var) {
        d9 d9Var;
        synchronized (f9.class) {
            try {
                if (a == null) {
                    a = new qg(2);
                }
                d9Var = (d9) a.R0(a9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d9Var;
    }
}
