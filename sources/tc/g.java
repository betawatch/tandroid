package tc;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class g extends a {
    public g(rc.c cVar) {
        super(cVar);
        if (cVar != null && cVar.getContext() != rc.i.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // rc.c
    public final rc.h getContext() {
        return rc.i.a;
    }
}
