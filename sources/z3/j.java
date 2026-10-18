package z3;

import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
    public final int i() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.i();
    }
}
