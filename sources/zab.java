// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class zab implements qk4 {
    public final /* synthetic */ rbb a;

    public zab(rbb rbbVar) {
        this.a = rbbVar;
    }

    @Override // qk4
    public final void setInvert(float f) {
        rbb rbbVar = this.a;
        hl.j3(rbbVar.n, f > 0.5f);
        hl.m3(rbbVar.n, f > 0.5f);
    }

    @Override // qk4
    public final void invalidate() {
    }
}
