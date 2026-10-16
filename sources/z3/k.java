package z3;

import java.util.List;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    public final long h(int i10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.h(i10) + this.b;
    }

    @Override // z3.e
    public final List o(long j10) {
        e eVar = this.a;
        eVar.getClass();
        return eVar.o(j10 - this.b);
    }

    @Override // z3.e
    public final int u() {
        e eVar = this.a;
        eVar.getClass();
        return eVar.u();
    }
}
