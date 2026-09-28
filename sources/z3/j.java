package z3;

import java.util.List;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final int d(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j3 - this.b);
    }

    @Override // z3.d
    public final long g(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(i10) + this.b;
    }

    @Override // z3.d
    public final List s(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.s(j3 - this.b);
    }

    @Override // z3.d
    public final int v() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.v();
    }
}
