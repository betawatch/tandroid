package y7;

import a8.za;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
