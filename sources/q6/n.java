package q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
    public Object q(com.google.android.gms.common.api.r rVar) {
        p8.d dVar = (p8.d) this.a;
        dVar.a = rVar;
        return dVar;
    }
}
