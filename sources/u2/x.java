package u2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class x implements d0, c0 {
    public final f0 a;
    public final long b;
    public final y2.d c;
    public a d;
    public d0 e;
    public c0 f;
    public long h = -9223372036854775807L;

    public x(f0 f0Var, y2.d dVar, long j3) {
        this.a = f0Var;
        this.c = dVar;
        this.b = j3;
    }

    public final void a(f0 f0Var) {
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            j3 = this.b;
        }
        a aVar = this.d;
        aVar.getClass();
        d0 c10 = aVar.c(f0Var, this.c, j3);
        this.e = c10;
        if (this.f != null) {
            c10.k(this, j3);
        }
    }

    @Override // u2.c0
    public final void b(d0 d0Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.b(this);
    }

    @Override // u2.e1
    public final boolean c() {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.c();
    }

    @Override // u2.e1
    public final long d() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.d();
    }

    @Override // u2.d0
    public final void g() {
        d0 d0Var = this.e;
        if (d0Var != null) {
            d0Var.g();
            return;
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // u2.d0
    public final long h(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.h(j3);
    }

    @Override // u2.d0
    public final void i(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.i(j3);
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.f = c0Var;
        d0 d0Var = this.e;
        if (d0Var != null) {
            long j10 = this.h;
            if (j10 == -9223372036854775807L) {
                j10 = this.b;
            }
            d0Var.k(this, j10);
        }
    }

    @Override // u2.d0
    public final long l() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.l();
    }

    @Override // u2.d1
    public final void m(e1 e1Var) {
        c0 c0Var = this.f;
        String str = e2.d0.a;
        c0Var.m(this);
    }

    @Override // u2.e1
    public final boolean p(i2.r0 r0Var) {
        d0 d0Var = this.e;
        return d0Var != null && d0Var.p(r0Var);
    }

    @Override // u2.d0
    public final long q(x2.s[] sVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        long j10 = this.h;
        long j11 = (j10 == -9223372036854775807L || j3 != this.b) ? j3 : j10;
        this.h = -9223372036854775807L;
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.q(sVarArr, zArr, c1VarArr, zArr2, j11);
    }

    @Override // u2.d0
    public final p1 r() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.r();
    }

    @Override // u2.e1
    public final long s() {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.s();
    }

    @Override // u2.d0
    public final long t(long j3, i2.p1 p1Var) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        return d0Var.t(j3, p1Var);
    }

    @Override // u2.e1
    public final void u(long j3) {
        d0 d0Var = this.e;
        String str = e2.d0.a;
        d0Var.u(j3);
    }
}
