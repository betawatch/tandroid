package wc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(uc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != uc.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // uc.c
    public final uc.h getContext() {
        return uc.i.a;
    }
}
