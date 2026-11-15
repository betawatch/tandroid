package x2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.ld0;
import tg.z1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 implements e0 {
    public final j2.g a;
    public final z1 b;
    public final ld0 c;
    public final qb.a d;
    public final int e;

    public w0(j2.g gVar, f3.m mVar) {
        z1 z1Var = new z1(mVar, 14);
        ld0 ld0Var = new ld0(7);
        qb.a aVar = new qb.a(4);
        this.a = gVar;
        this.b = z1Var;
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
