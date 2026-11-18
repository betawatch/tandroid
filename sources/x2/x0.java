package x2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.md0;
import tg.z1;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class x0 implements f0 {
    public final j2.g a;
    public final z1 b;
    public final md0 c;
    public final qb.a d;
    public final int e;

    public x0(j2.g gVar, f3.m mVar) {
        z1 z1Var = new z1(mVar, 15);
        md0 md0Var = new md0(7);
        qb.a aVar = new qb.a(4);
        this.a = gVar;
        this.b = z1Var;
        this.c = md0Var;
        this.d = aVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // x2.f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y0 b(e2.l0 l0Var) {
        l0Var.b.getClass();
        return new y0(l0Var, this.a, this.b, this.c.s(l0Var), this.d, this.e, null);
    }

    @Override // x2.f0
    public final f0 a(nb.a aVar) {
        return this;
    }

    @Override // x2.f0
    public final f0 c(boolean z10) {
        return this;
    }

    @Override // x2.f0
    public final f0 d(int i7) {
        return this;
    }
}
