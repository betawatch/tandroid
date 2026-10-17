package z3;

import java.util.List;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class j extends h2.j implements d {
    public d a;
    public long b;

    @Override // z3.d
    public final int c(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.c(j10 - this.b);
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        this.a = null;
    }

    @Override // z3.d
    public final long d(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.d(i10) + this.b;
    }

    @Override // z3.d
    public final List e(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(j10 - this.b);
    }

    @Override // z3.d
    public final int h() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.h();
    }
}
