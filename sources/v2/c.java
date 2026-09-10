package v2;

import b2.s;
import c3.g0;
import c3.h0;
import c3.n;
import e2.d0;
import e2.v;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c implements h0 {
    public final int a;
    public final s b;
    public final n c = new n();
    public s d;
    public h0 e;
    public long f;

    public c(int i10, int i11, s sVar) {
        this.a = i11;
        this.b = sVar;
    }

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void b(s sVar) {
        s sVar2 = this.b;
        if (sVar2 != null) {
            sVar = sVar.d(sVar2);
        }
        this.d = sVar;
        h0 h0Var = this.e;
        String str = d0.a;
        h0Var.b(sVar);
    }

    @Override // c3.h0
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long j10 = this.f;
        if (j10 != -9223372036854775807L && j3 >= j10) {
            this.e = this.c;
        }
        h0 h0Var = this.e;
        String str = d0.a;
        h0Var.c(j3, i10, i11, i12, g0Var);
    }

    @Override // c3.h0
    public final /* synthetic */ void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        h0 h0Var = this.e;
        String str = d0.a;
        return h0Var.a(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void f(v vVar, int i10, int i11) {
        h0 h0Var = this.e;
        String str = d0.a;
        h0Var.d(i10, vVar);
    }
}
