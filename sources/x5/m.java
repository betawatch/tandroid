package x5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class m implements k {
    public static m b;
    public static final n c = new n(0, 0, 0, false, false);
    public Object a;

    public /* synthetic */ m(Object obj) {
        this.a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (b == null) {
                    b = new m();
                }
                mVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mVar;
    }

    @Override // x5.k
    public Object d(com.google.android.gms.common.api.q qVar) {
        w7.d dVar = (w7.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
