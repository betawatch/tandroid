package w2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.e3;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class x0 implements f0 {
    public final i2.g a;
    public final e3 b;
    public final k4.j c;
    public final kb.a d;
    public final int e;

    public x0(i2.g gVar, e3.m mVar) {
        e3 e3Var = new e3(mVar, 27);
        k4.j jVar = new k4.j(28);
        kb.a aVar = new kb.a(1);
        this.a = gVar;
        this.b = e3Var;
        this.c = jVar;
        this.d = aVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // w2.f0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final y0 c(d2.n0 n0Var) {
        n0Var.b.getClass();
        return new y0(n0Var, this.a, this.b, this.c.x(n0Var), this.d, this.e, null);
    }

    @Override // w2.f0
    public final f0 a(mb.b bVar) {
        return this;
    }

    @Override // w2.f0
    public final f0 b(boolean z10) {
        return this;
    }

    @Override // w2.f0
    public final f0 d(int i3) {
        return this;
    }
}
