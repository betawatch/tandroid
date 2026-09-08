package z3;

import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
    public final long e(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(i10) + this.b;
    }

    @Override // z3.d
    public final List h(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h(j3 - this.b);
    }

    @Override // z3.d
    public final int k() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k();
    }
}
