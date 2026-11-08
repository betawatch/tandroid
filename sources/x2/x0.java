package x2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class x0 implements f0 {
    public final j2.g a;
    public final u5.e b;
    public final hy0 c;
    public final pb.b d;
    public final int e;

    public x0(j2.g gVar, f3.m mVar) {
        u5.e eVar = new u5.e(mVar, 10);
        hy0 hy0Var = new hy0(6);
        pb.b bVar = new pb.b(4);
        this.a = gVar;
        this.b = eVar;
        this.c = hy0Var;
        this.d = bVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // x2.f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y0 b(e2.l0 l0Var) {
        l0Var.b.getClass();
        return new y0(l0Var, this.a, this.b, this.c.t(l0Var), this.d, this.e, null);
    }

    @Override // x2.f0
    public final f0 a(w7.s sVar) {
        return this;
    }

    @Override // x2.f0
    public final f0 c(boolean z9) {
        return this;
    }

    @Override // x2.f0
    public final f0 d(int i7) {
        return this;
    }
}
