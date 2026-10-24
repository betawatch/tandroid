package u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class z implements f0, e0 {
    public final h0 a;
    public final long b;
    public final androidx.biometric.e c;
    public a d;
    public f0 e;
    public e0 f;
    public long h = -9223372036854775807L;

    public z(h0 h0Var, androidx.biometric.e eVar, long j10) {
        this.a = h0Var;
        this.c = eVar;
        this.b = j10;
    }

    @Override // u2.e0
    public final void a(f0 f0Var) {
        e0 e0Var = this.f;
        String str = e2.m0.a;
        e0Var.a(this);
    }

    @Override // u2.g1
    public final void b(h1 h1Var) {
        e0 e0Var = this.f;
        String str = e2.m0.a;
        e0Var.b(this);
    }

    @Override // u2.h1
    public final boolean c() {
        f0 f0Var = this.e;
        return f0Var != null && f0Var.c();
    }

    @Override // u2.h1
    public final long d() {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.d();
    }

    public final void e(h0 h0Var) {
        long j10 = this.h;
        if (j10 == -9223372036854775807L) {
            j10 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        f0 c10 = aVar.c(h0Var, this.c, j10);
        this.e = c10;
        if (this.f != null) {
            c10.n(this, j10);
        }
    }

    @Override // u2.f0
    public final void h() {
        f0 f0Var = this.e;
        if (f0Var != null) {
            f0Var.h();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // u2.f0
    public final long i(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.i(j10);
    }

    @Override // u2.f0
    public final void l(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        f0Var.l(j10);
    }

    @Override // u2.f0
    public final void n(e0 e0Var, long j10) {
        this.f = e0Var;
        f0 f0Var = this.e;
        if (f0Var != null) {
            long j11 = this.h;
            if (j11 == -9223372036854775807L) {
                j11 = this.b;
            }
            f0Var.n(this, j11);
        }
    }

    @Override // u2.f0
    public final long o() {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.o();
    }

    @Override // u2.h1
    public final boolean p(i2.u0 u0Var) {
        f0 f0Var = this.e;
        return f0Var != null && f0Var.p(u0Var);
    }

    @Override // u2.f0
    public final long q(x2.p[] pVarArr, boolean[] zArr, f1[] f1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.h;
        long j12 = (j11 == -9223372036854775807L || j10 != this.b) ? j10 : j11;
        this.h = -9223372036854775807L;
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.q(pVarArr, zArr, f1VarArr, zArr2, j12);
    }

    @Override // u2.f0
    public final t1 r() {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.r();
    }

    @Override // u2.h1
    public final long s() {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.s();
    }

    @Override // u2.f0
    public final long t(long j10, i2.s1 s1Var) {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        return f0Var.t(j10, s1Var);
    }

    @Override // u2.h1
    public final void u(long j10) {
        f0 f0Var = this.e;
        String str = e2.m0.a;
        f0Var.u(j10);
    }
}
