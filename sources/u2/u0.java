package u2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class u0 implements c3.l0 {
    public final e1 a;
    public final e1 b;
    public final c3.p c = new c3.p();
    public final AtomicReference d = new AtomicReference(t0.a);

    public u0(e1 e1Var) {
        this.a = e1Var;
        this.b = e1Var;
    }

    @Override // c3.l0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return h().a(oVar, i10, z10);
    }

    @Override // c3.l0
    public final void b(b2.w wVar) {
        this.a.b(wVar);
    }

    @Override // c3.l0
    public final void c(long j10, int i10, int i11, int i12, c3.k0 k0Var) {
        h().c(j10, i10, i11, i12, k0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == t0.b) {
            this.b.G(false);
            atomicReference.set(t0.c);
        }
    }

    @Override // c3.l0
    public final void d(int i10, e2.x xVar) {
        h().d(i10, xVar);
    }

    @Override // c3.l0
    public final int f(b2.o oVar, int i10, boolean z10) {
        return h().f(oVar, i10, z10);
    }

    @Override // c3.l0
    public final void g(e2.x xVar, int i10, int i11) {
        h().g(xVar, i10, i11);
    }

    public final c3.l0 h() {
        return this.d.get() == t0.c ? this.c : this.b;
    }

    @Override // c3.l0
    public final void e(long j10) {
    }
}
