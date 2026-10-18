package u2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class r0 implements c3.j0 {
    public final b1 a;
    public final b1 b;
    public final c3.n c = new c3.n();
    public final AtomicReference d = new AtomicReference(q0.a);

    public r0(b1 b1Var) {
        this.a = b1Var;
        this.b = b1Var;
    }

    @Override // c3.j0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void b(b2.w wVar) {
        this.a.b(wVar);
    }

    @Override // c3.j0
    public final void c(long j10, int i10, int i11, int i12, c3.i0 i0Var) {
        h().c(j10, i10, i11, i12, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == q0.b) {
            this.b.G(false);
            atomicReference.set(q0.c);
        }
    }

    @Override // c3.j0
    public final void d(int i10, e2.x xVar) {
        h().d(i10, xVar);
    }

    @Override // c3.j0
    public final int f(b2.o oVar, int i10, boolean z10) {
        return h().f(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void g(e2.x xVar, int i10, int i11) {
        h().g(xVar, i10, i11);
    }

    public final c3.j0 h() {
        return this.d.get() == q0.c ? this.c : this.b;
    }

    @Override // c3.j0
    public final void e(long j10) {
    }
}
