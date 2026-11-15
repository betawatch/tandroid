package x2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.ld0;
import tg.a2;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class w0 implements e0 {
    public final j2.g a;
    public final a2 b;
    public final ld0 c;
    public final qb.a d;
    public final int e;

    public w0(j2.g gVar, f3.m mVar) {
        a2 a2Var = new a2(mVar, 14);
        ld0 ld0Var = new ld0(7);
        qb.a aVar = new qb.a(4);
        this.a = gVar;
        this.b = a2Var;
        this.c = ld0Var;
        this.d = aVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // x2.e0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final x0 b(e2.l0 l0Var) {
        l0Var.b.getClass();
        return new x0(l0Var, this.a, this.b, this.c.s(l0Var), this.d, this.e, null);
    }

    @Override // x2.e0
    public final e0 a(nb.a aVar) {
        return this;
    }

    @Override // x2.e0
    public final e0 c(boolean z10) {
        return this;
    }

    @Override // x2.e0
    public final e0 d(int i7) {
        return this;
    }
}
