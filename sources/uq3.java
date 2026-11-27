// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uq3 implements mx2 {
    public final /* synthetic */ mx2 a;
    public final Throwable b;

    public uq3(mx2 mx2Var, Throwable th) {
        this.a = mx2Var;
        this.b = th;
    }

    @Override // mx2
    public final Object fold(Object obj, is4 is4Var) {
        return this.a.fold(obj, is4Var);
    }

    @Override // mx2
    public final kx2 get(lx2 lx2Var) {
        return this.a.get(lx2Var);
    }

    @Override // mx2
    public final mx2 minusKey(lx2 lx2Var) {
        return this.a.minusKey(lx2Var);
    }

    @Override // mx2
    public final mx2 plus(mx2 mx2Var) {
        return this.a.plus(mx2Var);
    }
}
