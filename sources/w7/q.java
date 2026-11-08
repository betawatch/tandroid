package w7;

import a8.za;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class q {
    public static za a;

    public static synchronized p a(o oVar) {
        p pVar;
        synchronized (q.class) {
            try {
                if (a == null) {
                    a = new za(2);
                }
                pVar = (p) a.R0(oVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return pVar;
    }
}
