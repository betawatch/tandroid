package v2;

import b2.p;
import b2.x;
import c3.h0;
import c3.i0;
import e2.m0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class c implements i0 {
    public final int a;
    public final x b;
    public final c3.n c = new c3.n();
    public final d d;
    public x e;
    public i0 f;
    public long g;

    public c(int i10, int i11, x xVar, d dVar) {
        this.a = i11;
        this.b = xVar;
        this.d = dVar;
    }

    @Override // c3.i0
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.i0
    public final void b(x xVar) {
        this.d.getClass();
        x xVar2 = this.b;
        if (xVar2 != null) {
            xVar = xVar.d(xVar2);
        }
        this.e = xVar;
        i0 i0Var = this.f;
        String str = m0.a;
        i0Var.b(xVar);
    }

    @Override // c3.i0
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        long j11 = this.g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f = this.c;
        }
        i0 i0Var = this.f;
        String str = m0.a;
        i0Var.c(j10, i10, i11, i12, h0Var);
    }

    @Override // c3.i0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.i0
    public final int f(p pVar, int i10, boolean z10) {
        i0 i0Var = this.f;
        String str = m0.a;
        return i0Var.a(pVar, i10, z10);
    }

    @Override // c3.i0
    public final void g(e2.x xVar, int i10, int i11) {
        i0 i0Var = this.f;
        String str = m0.a;
        i0Var.d(i10, xVar);
    }

    @Override // c3.i0
    public final /* synthetic */ void e(long j10) {
    }
}
