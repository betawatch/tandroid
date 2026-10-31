package u2;

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class x0 implements f0 {
    public final g2.g a;
    public final rh.d0 b;
    public final li.k c;
    public final hb.a d;
    public final int e;

    public x0(g2.g gVar, c3.m mVar) {
        rh.d0 d0Var = new rh.d0(mVar, 19);
        li.k kVar = new li.k(7);
        hb.a aVar = new hb.a(27);
        this.a = gVar;
        this.b = d0Var;
        this.c = kVar;
        this.d = aVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // u2.f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y0 a(b2.p0 p0Var) {
        p0Var.b.getClass();
        return new y0(p0Var, this.a, this.b, this.c.u(p0Var), this.d, this.e, null);
    }

    @Override // u2.f0
    public final f0 b(boolean z10) {
        return this;
    }

    @Override // u2.f0
    public final f0 c(int i10) {
        return this;
    }

    @Override // u2.f0
    public final f0 d(t7.u uVar) {
        return this;
    }
}
