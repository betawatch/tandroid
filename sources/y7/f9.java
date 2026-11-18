package y7;

import a8.ab;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public abstract class f9 {
    public static ab a;

    public static synchronized d9 a(a9 a9Var) {
        d9 d9Var;
        synchronized (f9.class) {
            try {
                if (a == null) {
                    a = new ab(3);
                }
                d9Var = (d9) a.R0(a9Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d9Var;
    }
}
