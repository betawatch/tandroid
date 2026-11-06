package q6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
