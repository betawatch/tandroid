package z7;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public abstract class oa {
    public static a8.za a;

    public static synchronized ma a(ja jaVar) {
        ma maVar;
        synchronized (oa.class) {
            try {
                if (a == null) {
                    a = new a8.za(4);
                }
                maVar = (ma) a.R0(jaVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return maVar;
    }
}
