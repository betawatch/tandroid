package x2;

import org.telegram.tgnet.TLObject;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class w0 implements e0 {
    public final j2.g a;
    public final u5.e b;
    public final ly0 c;
    public final pb.b d;
    public final int e;

    public w0(j2.g gVar, f3.m mVar) {
        u5.e eVar = new u5.e(mVar, 10);
        ly0 ly0Var = new ly0(6);
        pb.b bVar = new pb.b(4);
        this.a = gVar;
        this.b = eVar;
        this.c = ly0Var;
        this.d = bVar;
        this.e = TLObject.FLAG_20;
    }

    @Override // x2.e0
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final x0 b(e2.l0 l0Var) {
        l0Var.b.getClass();
        return new x0(l0Var, this.a, this.b, this.c.t(l0Var), this.d, this.e, null);
    }

    @Override // x2.e0
    public final e0 a(w7.s sVar) {
        return this;
    }

    @Override // x2.e0
    public final e0 c(boolean z9) {
        return this;
    }

    @Override // x2.e0
    public final e0 d(int i7) {
        return this;
    }
}
