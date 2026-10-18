package v2;

import b2.o;
import b2.w;
import c3.i0;
import c3.j0;
import e2.m0;
import e2.x;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class c implements j0 {
    public final int a;
    public final w b;
    public final c3.n c = new c3.n();
    public final d d;
    public w e;
    public j0 f;
    public long g;

    public c(int i10, int i11, w wVar, d dVar) {
        this.a = i11;
        this.b = wVar;
        this.d = dVar;
    }

    @Override // c3.j0
    public final int a(o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void b(w wVar) {
        this.d.getClass();
        w wVar2 = this.b;
        if (wVar2 != null) {
            wVar = wVar.d(wVar2);
        }
        this.e = wVar;
        j0 j0Var = this.f;
        String str = m0.a;
        j0Var.b(wVar);
    }

    @Override // c3.j0
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11 = this.g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f = this.c;
        }
        j0 j0Var = this.f;
        String str = m0.a;
        j0Var.c(j10, i10, i11, i12, i0Var);
    }

    @Override // c3.j0
    public final /* synthetic */ void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.j0
    public final int f(o oVar, int i10, boolean z10) {
        j0 j0Var = this.f;
        String str = m0.a;
        return j0Var.a(oVar, i10, z10);
    }

    @Override // c3.j0
    public final void g(x xVar, int i10, int i11) {
        j0 j0Var = this.f;
        String str = m0.a;
        j0Var.d(i10, xVar);
    }

    @Override // c3.j0
    public final /* synthetic */ void e(long j10) {
    }
}
