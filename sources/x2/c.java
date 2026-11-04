package x2;

import d2.o;
import d2.v;
import e3.h0;
import e3.i0;
import g2.n0;
import g2.y;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements i0 {
    public final int a;
    public final v b;
    public final e3.n c = new e3.n();
    public final d d;
    public v e;
    public i0 f;
    public long g;

    public c(int i3, int i10, v vVar, d dVar) {
        this.a = i10;
        this.b = vVar;
        this.d = dVar;
    }

    @Override // e3.i0
    public final int a(o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(o oVar, int i3, boolean z10) {
        i0 i0Var = this.f;
        String str = n0.a;
        return i0Var.a(oVar, i3, z10);
    }

    @Override // e3.i0
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        long j11 = this.g;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            this.f = this.c;
        }
        i0 i0Var = this.f;
        String str = n0.a;
        i0Var.d(j10, i3, i10, i11, h0Var);
    }

    @Override // e3.i0
    public final /* synthetic */ void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override // e3.i0
    public final void f(y yVar, int i3, int i10) {
        i0 i0Var = this.f;
        String str = n0.a;
        i0Var.e(i3, yVar);
    }

    @Override // e3.i0
    public final void g(v vVar) {
        this.d.getClass();
        v vVar2 = this.b;
        if (vVar2 != null) {
            vVar = vVar.d(vVar2);
        }
        this.e = vVar;
        i0 i0Var = this.f;
        String str = n0.a;
        i0Var.g(vVar);
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }
}
