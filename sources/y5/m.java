package y5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // y5.k
    public Object c(com.google.android.gms.common.api.q qVar) {
        x7.d dVar = (x7.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
