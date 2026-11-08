package p4;

import a8.ia;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import e2.q1;
import e2.s1;
import e2.x1;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class g1 implements e2.c1 {
    public final e2.c1 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public g1(e2.c1 c1Var) {
        this.a = c1Var;
    }

    @Override // e2.c1
    public final long A() {
        V0();
        return this.a.A();
    }

    @Override // e2.c1
    public final Looper A0() {
        return this.a.A0();
    }

    @Override // e2.c1
    public final int B() {
        V0();
        return this.a.B();
    }

    @Override // e2.c1
    public final void B0() {
        V0();
        this.a.B0();
    }

    @Override // e2.c1
    public final x1 C() {
        V0();
        return this.a.C();
    }

    @Override // e2.c1
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // e2.c1
    public final void D(e2.e eVar, boolean z9) {
        this.a.D(eVar, z9);
    }

    @Override // e2.c1
    public final boolean D0() {
        V0();
        return this.a.D0();
    }

    @Override // e2.c1
    public final void E() {
        V0();
        this.a.E();
    }

    @Override // e2.c1
    public final q1 E0() {
        V0();
        return this.a.E0();
    }

    @Override // e2.c1
    public final float F() {
        V0();
        return this.a.F();
    }

    @Override // e2.c1
    public final long F0() {
        V0();
        return this.a.F0();
    }

    @Override // e2.c1
    public final void G() {
        V0();
        this.a.G();
    }

    @Override // e2.c1
    public final void G0(int i7) {
        V0();
        this.a.G0(i7);
    }

    @Override // e2.c1
    public final e2.e H() {
        V0();
        return this.a.H();
    }

    @Override // e2.c1
    public final void H0() {
        V0();
        this.a.H0();
    }

    @Override // e2.c1
    public final void I(e2.l0 l0Var) {
        V0();
        this.a.I(l0Var);
    }

    @Override // e2.c1
    public final void I0(e2.a1 a1Var) {
        V0();
        synchronized (this.b) {
            try {
                e2.v vVar = (e2.v) this.b.get(a1Var);
                if (vVar == null) {
                    vVar = new e2.v(this, a1Var);
                }
                this.a.I0(vVar);
                this.b.put(a1Var, vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e2.c1
    public final void J(int i7, boolean z9) {
        V0();
        this.a.J(i7, z9);
    }

    @Override // e2.c1
    public final void J0() {
        V0();
        this.a.J0();
    }

    @Override // e2.c1
    public final e2.o K() {
        V0();
        return this.a.K();
    }

    @Override // e2.c1
    public final void K0(e2.o0 o0Var) {
        V0();
        this.a.K0(o0Var);
    }

    @Override // e2.c1
    public final void L() {
        V0();
        this.a.L();
    }

    @Override // e2.c1
    public final void L0() {
        V0();
        this.a.L0();
    }

    @Override // e2.c1
    public final void M(int i7, int i10) {
        V0();
        this.a.M(i7, i10);
    }

    @Override // e2.c1
    public final e2.o0 M0() {
        V0();
        return this.a.M0();
    }

    @Override // e2.c1
    public final void N(int i7) {
        V0();
        this.a.N(i7);
    }

    @Override // e2.c1
    public final void N0(List list) {
        V0();
        this.a.N0(list);
    }

    @Override // e2.c1
    public final int O() {
        V0();
        return this.a.O();
    }

    @Override // e2.c1
    public final long O0() {
        V0();
        return this.a.O0();
    }

    @Override // e2.c1
    public final boolean P() {
        return this.a.P();
    }

    @Override // e2.c1
    public final boolean P0() {
        V0();
        return this.a.P0();
    }

    @Override // e2.c1
    public final void Q(int i7) {
        V0();
        this.a.Q(i7);
    }

    public final e2.b1 Q0() {
        boolean p02 = p0(16);
        boolean p03 = p0(17);
        int o02 = p03 ? o0() : 0;
        ia.p(o02 >= 0);
        int B = p03 ? B() : 0;
        ia.p(B >= 0);
        if (p03) {
            e2.l1 y02 = y0();
            if (!y02.p()) {
                ia.p(o02 < y02.o());
                e2.k1 m10 = y02.m(o02, new e2.k1(), 0L);
                ia.p(B == h2.m0.i(B, m10.n, m10.o));
            }
        }
        long j3 = 0;
        e2.l0 w10 = p02 ? w() : null;
        long l10 = p02 ? l() : 0L;
        if (p02) {
            j3 = a0();
        }
        return new e2.b1(null, o02, w10, null, B, l10, j3, p02 ? n0() : -1, p02 ? O() : -1);
    }

    @Override // e2.c1
    public final void R(int i7, int i10) {
        V0();
        this.a.R(i7, i10);
    }

    public final l1 R0() {
        boolean p02 = p0(16);
        return new l1(Q0(), p02 && p(), SystemClock.elapsedRealtime(), p02 ? getDuration() : -9223372036854775807L, p02 ? d0() : 0L, p02 ? y() : 0, p02 ? r() : 0L, p02 ? q() : -9223372036854775807L, p02 ? A() : -9223372036854775807L, p02 ? F0() : 0L);
    }

    @Override // e2.c1
    public final void S(SurfaceHolder surfaceHolder) {
        V0();
        this.a.S(surfaceHolder);
    }

    public final e2.l0 S0() {
        if (p0(16)) {
            return w();
        }
        return null;
    }

    @Override // e2.c1
    public final void T(float f10) {
        V0();
        this.a.T(f10);
    }

    public final e2.l1 T0() {
        return p0(17) ? y0() : S0() != null ? new f1(this) : e2.l1.a;
    }

    @Override // e2.c1
    public final void U() {
        V0();
        this.a.U();
    }

    public final e2.o0 U0() {
        return p0(18) ? M0() : e2.o0.L;
    }

    @Override // e2.c1
    public final void V(List list, int i7, long j3) {
        V0();
        this.a.V(list, i7, j3);
    }

    public final void V0() {
        ia.p(Looper.myLooper() == this.a.A0());
    }

    @Override // e2.c1
    public final e2.v0 W() {
        V0();
        return this.a.W();
    }

    @Override // e2.c1
    public final void X(boolean z9) {
        V0();
        this.a.X(z9);
    }

    @Override // e2.c1
    public final void Y(int i7) {
        V0();
        this.a.Y(i7);
    }

    @Override // e2.c1
    public final long Z() {
        V0();
        return this.a.Z();
    }

    @Override // e2.c1
    public final void a() {
        V0();
        this.a.a();
    }

    @Override // e2.c1
    public final long a0() {
        V0();
        return this.a.a0();
    }

    @Override // e2.c1
    public final void b() {
        V0();
        this.a.b();
    }

    @Override // e2.c1
    public final void b0(int i7, List list) {
        V0();
        this.a.b0(i7, list);
    }

    @Override // e2.c1
    public final void c(long j3) {
        V0();
        this.a.c(j3);
    }

    @Override // e2.c1
    public final void c0() {
        V0();
        this.a.c0();
    }

    @Override // e2.c1
    public final void d(float f10) {
        V0();
        this.a.d(f10);
    }

    @Override // e2.c1
    public final long d0() {
        V0();
        return this.a.d0();
    }

    @Override // e2.c1
    public final void e(e2.w0 w0Var) {
        V0();
        this.a.e(w0Var);
    }

    @Override // e2.c1
    public final boolean e0() {
        V0();
        return this.a.e0();
    }

    @Override // e2.c1
    public final void f() {
        V0();
        this.a.f();
    }

    @Override // e2.c1
    public final void f0(e2.l0 l0Var, long j3) {
        V0();
        this.a.f0(l0Var, j3);
    }

    @Override // e2.c1
    public final boolean g() {
        V0();
        return this.a.g();
    }

    @Override // e2.c1
    public final void g0() {
        V0();
        this.a.g0();
    }

    @Override // e2.c1
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    @Override // e2.c1
    public final boolean h() {
        V0();
        return this.a.h();
    }

    @Override // e2.c1
    public final void h0(e2.a1 a1Var) {
        V0();
        synchronized (this.b) {
            e2.a1 a1Var2 = (e2.a1) this.b.remove(a1Var);
            e2.c1 c1Var = this.a;
            if (a1Var2 != null) {
                a1Var = a1Var2;
            }
            c1Var.h0(a1Var);
        }
    }

    @Override // e2.c1
    public final int i() {
        V0();
        return this.a.i();
    }

    @Override // e2.c1
    public final void i0(int i7) {
        V0();
        this.a.i0(i7);
    }

    @Override // e2.c1
    public final e2.w0 j() {
        V0();
        return this.a.j();
    }

    @Override // e2.c1
    public final s1 j0() {
        V0();
        return this.a.j0();
    }

    @Override // e2.c1
    public final void k(int i7) {
        V0();
        this.a.k(i7);
    }

    @Override // e2.c1
    public final e2.o0 k0() {
        V0();
        return this.a.k0();
    }

    @Override // e2.c1
    public final long l() {
        V0();
        return this.a.l();
    }

    @Override // e2.c1
    public final g2.d l0() {
        V0();
        return this.a.l0();
    }

    @Override // e2.c1
    public final int m() {
        V0();
        return this.a.m();
    }

    @Override // e2.c1
    public final void m0(e2.l0 l0Var) {
        V0();
        this.a.m0(l0Var);
    }

    @Override // e2.c1
    public final int n() {
        V0();
        return this.a.n();
    }

    @Override // e2.c1
    public final int n0() {
        V0();
        return this.a.n0();
    }

    @Override // e2.c1
    public final void o(int i7, e2.l0 l0Var) {
        V0();
        this.a.o(i7, l0Var);
    }

    @Override // e2.c1
    public final int o0() {
        V0();
        return this.a.o0();
    }

    @Override // e2.c1
    public final boolean p() {
        V0();
        return this.a.p();
    }

    @Override // e2.c1
    public final boolean p0(int i7) {
        V0();
        return this.a.p0(i7);
    }

    @Override // e2.c1
    public final long q() {
        V0();
        return this.a.q();
    }

    @Override // e2.c1
    public final void q0(q1 q1Var) {
        V0();
        this.a.q0(q1Var);
    }

    @Override // e2.c1
    public final long r() {
        V0();
        return this.a.r();
    }

    @Override // e2.c1
    public final void r0(boolean z9) {
        V0();
        this.a.r0(z9);
    }

    @Override // e2.c1
    public final void s(int i7, long j3) {
        V0();
        this.a.s(i7, j3);
    }

    @Override // e2.c1
    public final void s0(List list, int i7, int i10) {
        V0();
        this.a.s0(list, i7, i10);
    }

    @Override // e2.c1
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // e2.c1
    public final e2.y0 t() {
        V0();
        return this.a.t();
    }

    @Override // e2.c1
    public final void t0(int i7, int i10) {
        V0();
        this.a.t0(i7, i10);
    }

    @Override // e2.c1
    public final boolean u() {
        V0();
        return this.a.u();
    }

    @Override // e2.c1
    public final void u0(int i7, int i10, int i11) {
        V0();
        this.a.u0(i7, i10, i11);
    }

    @Override // e2.c1
    public final void v() {
        V0();
        this.a.v();
    }

    @Override // e2.c1
    public final boolean v0() {
        V0();
        return this.a.v0();
    }

    @Override // e2.c1
    public final e2.l0 w() {
        V0();
        return this.a.w();
    }

    @Override // e2.c1
    public final int w0() {
        V0();
        return this.a.w0();
    }

    @Override // e2.c1
    public final void x(boolean z9) {
        V0();
        this.a.x(z9);
    }

    @Override // e2.c1
    public final void x0(List list) {
        V0();
        this.a.x0(list);
    }

    @Override // e2.c1
    public final int y() {
        V0();
        return this.a.y();
    }

    @Override // e2.c1
    public final e2.l1 y0() {
        V0();
        return this.a.y0();
    }

    @Override // e2.c1
    public final long z() {
        V0();
        return this.a.z();
    }

    @Override // e2.c1
    public final boolean z0() {
        V0();
        return this.a.z0();
    }
}
