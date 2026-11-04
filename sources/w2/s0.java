package w2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class s0 implements e3.i0 {
    public final c1 a;
    public final c1 b;
    public final e3.n c = new e3.n();
    public final AtomicReference d = new AtomicReference(r0.a);

    public s0(c1 c1Var) {
        this.a = c1Var;
        this.b = c1Var;
    }

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return h().a(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        return h().c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final void d(long j10, int i3, int i10, int i11, e3.h0 h0Var) {
        h().d(j10, i3, i10, i11, h0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.b) {
            this.b.G(false);
            atomicReference.set(r0.c);
        }
    }

    @Override // e3.i0
    public final void e(int i3, g2.y yVar) {
        h().e(i3, yVar);
    }

    @Override // e3.i0
    public final void f(g2.y yVar, int i3, int i10) {
        h().f(yVar, i3, i10);
    }

    @Override // e3.i0
    public final void g(d2.v vVar) {
        this.a.g(vVar);
    }

    public final e3.i0 h() {
        return this.d.get() == r0.c ? this.c : this.b;
    }

    @Override // e3.i0
    public final void b(long j10) {
    }
}
