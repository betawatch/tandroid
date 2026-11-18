package y7;

import a8.ab;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
