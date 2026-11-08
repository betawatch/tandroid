package q6;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class n implements l {
    public static n b;
    public static final o c = new o(0, 0, 0, false, false);
    public Object a;

    public /* synthetic */ n(Object obj) {
        this.a = obj;
    }

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (b == null) {
                    b = new n();
                }
                nVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // q6.l
    public Object b(com.google.android.gms.common.api.q qVar) {
        p8.d dVar = (p8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
