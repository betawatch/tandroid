package z3;

import java.util.List;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
    public final long e(int i10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.e(i10) + this.b;
    }

    @Override // z3.d
    public final List g(long j10) {
        d dVar = this.a;
        dVar.getClass();
        return dVar.g(j10 - this.b);
    }

    @Override // z3.d
    public final int k() {
        d dVar = this.a;
        dVar.getClass();
        return dVar.k();
    }
}
