package wc;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
