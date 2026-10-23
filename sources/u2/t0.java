package u2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes.dex */
public final class t0 implements c3.j0 {
    public final d1 a;
    public final d1 b;
    public final c3.n c = new c3.n();
    public final AtomicReference d = new AtomicReference(s0.a);

    public t0(d1 d1Var) {
        this.a = d1Var;
        this.b = d1Var;
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
        if (atomicReference.get() == s0.b) {
            this.b.G(false);
            atomicReference.set(s0.c);
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
        return this.d.get() == s0.c ? this.c : this.b;
    }

    @Override // c3.j0
    public final void e(long j10) {
    }
}
