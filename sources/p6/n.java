package p6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // p6.l
    public Object m(com.google.android.gms.common.api.q qVar) {
        o8.d dVar = (o8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
