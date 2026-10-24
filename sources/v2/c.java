package v2;

import b2.o;
import b2.w;
import c3.k0;
import c3.l0;
import c3.p;
import e2.m0;
import e2.x;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class c implements l0 {
    public final int a;
    public final w b;
    public final p c = new p();
    public final d d;
    public w e;
    public l0 f;
    public long g;

    public c(int i10, int i11, w wVar, d dVar) {
        this.a = i11;
        this.b = wVar;
        this.d = dVar;
    }

    @Override // c3.l0
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override // c3.l0
    public final void b(w wVar) {
        this.d.getClass();
        w wVar2 = this.b;
        if (wVar2 != null) {
            wVar = wVar.d(wVar2);
        }
        this.e = wVar;
        l0 l0Var = this.f;
        String str = m0.a;
        l0Var.b(wVar);
    }

    @Override // c3.l0
    public final void c(long j10, int i10, int i11, int i12, k0 k0Var) {
        long j11 = this.g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f = this.c;
        }
        l0 l0Var = this.f;
        String str = m0.a;
        l0Var.c(j10, i10, i11, i12, k0Var);
    }

    @Override // c3.l0
    public final /* synthetic */ void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.l0
    public final int f(o oVar, int i10, boolean z10) {
        l0 l0Var = this.f;
        String str = m0.a;
        return l0Var.a(oVar, i10, z10);
    }

    @Override // c3.l0
    public final void g(x xVar, int i10, int i11) {
        l0 l0Var = this.f;
        String str = m0.a;
        l0Var.d(i10, xVar);
    }

    @Override // c3.l0
    public final /* synthetic */ void e(long j10) {
    }
}
