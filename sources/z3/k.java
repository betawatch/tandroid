package z3;

import java.util.List;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class k extends h2.j implements e {
    public e a;
    public long b;

    @Override // z3.e
    public final int c(long j10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.c(j10 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.e
    public final long d(int i10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.d(i10) + this.b;
    }

    @Override // z3.e
    public final List f(long j10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.f(j10 - this.b);
    }

    @Override // z3.e
    public final int j() {
        e eVar = this.a;
        eVar.getClass();
        return eVar.j();
    }
}
