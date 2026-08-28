package sc;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(qc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != qc.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // qc.c
    public final qc.h getContext() {
        return qc.i.a;
    }
}
