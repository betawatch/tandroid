package z3;

import java.util.List;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
    public final int d(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(j10 - this.b);
    }

    @Override // z3.d
    public final long k(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k(i10) + this.b;
    }

    @Override // z3.d
    public final List r(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.r(j10 - this.b);
    }

    @Override // z3.d
    public final int v() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.v();
    }
}
