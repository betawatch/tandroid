package z3;

import java.util.List;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
