package w7;

import a8.za;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
