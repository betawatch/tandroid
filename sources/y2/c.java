package y2;

import com.google.android.gms.internal.vision.e2;
import e2.u;
import f3.i0;
import f3.j0;
import h2.l0;
import h2.x;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class c implements j0 {
    public final int a;
    public final u b;
    public final f3.n c = new f3.n();
    public final d d;
    public u e;
    public j0 f;
    public long g;

    public c(int i7, int i10, u uVar, d dVar) {
        this.a = i10;
        this.b = uVar;
        this.d = dVar;
    }

    @Override // f3.j0
    public final void a(x xVar, int i7, int i10) {
        j0 j0Var = this.f;
        String str = l0.a;
        j0Var.b(i7, xVar);
    }

    @Override // f3.j0
    public final /* synthetic */ void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    @Override // f3.j0
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        long j10 = this.g;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.f = this.c;
        }
        j0 j0Var = this.f;
        String str = l0.a;
        j0Var.c(j3, i7, i10, i11, i0Var);
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z10) {
        j0 j0Var = this.f;
        String str = l0.a;
        return j0Var.e(nVar, i7, z10);
    }

    @Override // f3.j0
    public final void g(u uVar) {
        this.d.getClass();
        u uVar2 = this.b;
        if (uVar2 != null) {
            uVar = uVar.d(uVar2);
        }
        this.e = uVar;
        j0 j0Var = this.f;
        String str = l0.a;
        j0Var.g(uVar);
    }

    @Override // f3.j0
    public final /* synthetic */ void d(long j3) {
    }
}
