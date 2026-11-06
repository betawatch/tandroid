package x2;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class s0 implements f3.j0 {
    public final b1 a;
    public final b1 b;
    public final f3.n c = new f3.n();
    public final AtomicReference d = new AtomicReference(r0.a);

    public s0(b1 b1Var) {
        this.a = b1Var;
        this.b = b1Var;
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
        if (atomicReference.get() == r0.b) {
            this.b.G(false);
            atomicReference.set(r0.c);
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
        return this.d.get() == r0.c ? this.c : this.b;
    }

    @Override // f3.j0
    public final void d(long j3) {
    }
}
