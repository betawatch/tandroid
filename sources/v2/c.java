package v2;

import b2.p;
import b2.x;
import c3.i0;
import c3.j0;
import c3.k0;
import e2.l0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c implements k0 {
    public final int a;
    public final x b;
    public final c3.n c = new c3.n();
    public final d d;
    public x e;
    public k0 f;
    public long g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.a = i11;
        this.b = xVar;
        this.d = dVar;
    }

    @Override // c3.k0
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.k0
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        k0 k0Var = this.f;
        String str = l0.a;
        k0Var.b(xVar);
    }

    @Override // c3.k0
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
        long j11 = this.g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f = this.c;
        }
        k0 k0Var = this.f;
        String str = l0.a;
        k0Var.c(j10, i10, i11, i12, j0Var);
    }

    @Override // c3.k0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override // c3.k0
    public final int f(p pVar, int i10, boolean z10) {
        k0 k0Var = this.f;
        String str = l0.a;
        return k0Var.a(pVar, i10, z10);
    }

    @Override // c3.k0
    public final void g(e2.x xVar, int i10, int i11) {
        k0 k0Var = this.f;
        String str = l0.a;
        k0Var.d(i10, xVar);
    }

    @Override // c3.k0
    public final /* synthetic */ void e(long j10) {
    }
}
