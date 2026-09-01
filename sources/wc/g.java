package wc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
