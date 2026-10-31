package z3;

import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int a(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.a(j10 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long g(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(i10) + this.b;
    }

    @Override // z3.d
    public final List p(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.p(j10 - this.b);
    }

    @Override // z3.d
    public final int s() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.s();
    }
}
