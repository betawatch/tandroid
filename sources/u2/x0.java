package u2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class x0 implements f0 {
    public final g2.g a;
    public final org.telegram.ui.Components.voip.j1 b;
    public final k6.c c;
    public final u7.s d;
    public final int e;

    public x0(g2.g gVar, c3.m mVar) {
        org.telegram.ui.Components.voip.j1 j1Var = new org.telegram.ui.Components.voip.j1(mVar, 22);
        k6.c cVar = new k6.c(8);
        u7.s sVar = new u7.s(26);
        this.a = gVar;
        this.b = j1Var;
        this.c = cVar;
        this.d = sVar;
        this.e = 1048576;
    }

    @Override // u2.f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y0 a(b2.p0 p0Var) {
        p0Var.b.getClass();
        return new y0(p0Var, this.a, this.b, this.c.u(p0Var), this.d, this.e, null);
    }

    @Override // u2.f0
    public final f0 b(qb.a aVar) {
        return this;
    }

    @Override // u2.f0
    public final f0 c(boolean z10) {
        return this;
    }

    @Override // u2.f0
    public final f0 d(int i10) {
        return this;
    }
}
