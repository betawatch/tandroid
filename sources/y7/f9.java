package y7;

import a8.ab;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
