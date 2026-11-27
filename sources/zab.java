// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
