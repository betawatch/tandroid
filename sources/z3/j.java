package z3;

import java.util.List;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    public final int e(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(j3 - this.b);
    }

    @Override // z3.d
    public final long l(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.l(i10) + this.b;
    }

    @Override // z3.d
    public final List p(long j3) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.p(j3 - this.b);
    }

    @Override // z3.d
    public final int w() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.w();
    }
}
