package uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(sc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != sc.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // sc.c
    public final sc.h getContext() {
        return sc.i.a;
    }
}
