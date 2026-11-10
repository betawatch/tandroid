package x2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class r0 implements f3.j0 {
    public final a1 a;
    public final a1 b;
    public final f3.n c = new f3.n();
    public final AtomicReference d = new AtomicReference(q0.a);

    public r0(a1 a1Var) {
        this.a = a1Var;
        this.b = a1Var;
    }

    @Override // f3.j0
    public final void a(h2.x xVar, int i7, int i10) {
        h().a(xVar, i7, i10);
    }

    @Override // f3.j0
    public final void b(int i7, h2.x xVar) {
        h().b(i7, xVar);
    }

    @Override // f3.j0
    public final void c(long j3, int i7, int i10, int i11, f3.i0 i0Var) {
        h().c(j3, i7, i10, i11, i0Var);
        AtomicReference atomicReference = this.d;
        if (atomicReference.get() == q0.b) {
            this.b.G(false);
            atomicReference.set(q0.c);
        }
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z9) {
        return h().e(nVar, i7, z9);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z9) {
        return h().f(nVar, i7, z9);
    }

    @Override // f3.j0
    public final void g(e2.u uVar) {
        this.a.g(uVar);
    }

    public final f3.j0 h() {
        return this.d.get() == q0.c ? this.c : this.b;
    }

    @Override // f3.j0
    public final void d(long j3) {
    }
}
