package u2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class s0 implements c3.j0 {
    public final c1 a;
    public final c1 b;
    public final c3.n c = new c3.n();
    public final AtomicReference d = new AtomicReference(r0.a);

    public s0(c1 c1Var) {
        this.a = c1Var;
        this.b = c1Var;
    }

    @Override // c3.j0
    public final int a(b2.p pVar, int i10, boolean z10) {
        return h().a(pVar, i10, z10);
    }

    @Override // c3.j0
    public final void b(b2.x xVar) {
        this.a.b(xVar);
    }

    @Override // c3.j0
    public final void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        h().c(j10, i10, i11, i12, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == r0.b) {
            this.b.G(false);
            atomicReference.set(r0.c);
        }
    }

    @Override // c3.j0
    public final void d(int i10, e2.x xVar) {
        h().d(i10, xVar);
    }

    @Override // c3.j0
    public final int f(b2.p pVar, int i10, boolean z10) {
        return h().f(pVar, i10, z10);
    }

    @Override // c3.j0
    public final void g(e2.x xVar, int i10, int i11) {
        h().g(xVar, i10, i11);
    }

    public final c3.j0 h() {
        return this.d.get() == r0.c ? this.c : this.b;
    }

    @Override // c3.j0
    public final void e(long j10) {
    }
}
