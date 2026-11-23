package p4;

import a8.ma;
import android.os.Looper;
import android.os.SystemClock;
import android.view.SurfaceHolder;
import e2.q1;
import e2.s1;
import e2.x1;
import java.util.IdentityHashMap;
import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class h1 implements e2.c1 {
    public final e2.c1 a;
    public final IdentityHashMap b = new IdentityHashMap();

    public h1(e2.c1 c1Var) {
        this.a = c1Var;
    }

    @Override // e2.c1
    public final long A() {
        V0();
        return this.a.A();
    }

    @Override // e2.c1
    public final boolean A0() {
        V0();
        return this.a.A0();
    }

    @Override // e2.c1
    public final long B() {
        V0();
        return this.a.B();
    }

    @Override // e2.c1
    public final Looper B0() {
        return this.a.B0();
    }

    @Override // e2.c1
    public final int C() {
        V0();
        return this.a.C();
    }

    @Override // e2.c1
    public final void C0() {
        V0();
        this.a.C0();
    }

    @Override // e2.c1
    public final x1 D() {
        V0();
        return this.a.D();
    }

    @Override // e2.c1
    public final void D0() {
        V0();
        this.a.D0();
    }

    @Override // e2.c1
    public final void E(e2.e eVar, boolean z10) {
        this.a.E(eVar, z10);
    }

    @Override // e2.c1
    public final boolean E0() {
        V0();
        return this.a.E0();
    }

    @Override // e2.c1
    public final void F() {
        V0();
        this.a.F();
    }

    @Override // e2.c1
    public final q1 F0() {
        V0();
        return this.a.F0();
    }

    @Override // e2.c1
    public final float G() {
        V0();
        return this.a.G();
    }

    @Override // e2.c1
    public final long G0() {
        V0();
        return this.a.G0();
    }

    @Override // e2.c1
    public final void H() {
        V0();
        this.a.H();
    }

    @Override // e2.c1
    public final void H0(int i7) {
        V0();
        this.a.H0(i7);
    }

    @Override // e2.c1
    public final e2.e I() {
        V0();
        return this.a.I();
    }

    @Override // e2.c1
    public final void I0() {
        V0();
        this.a.I0();
    }

    @Override // e2.c1
    public final void J(e2.l0 l0Var) {
        V0();
        this.a.J(l0Var);
    }

    @Override // e2.c1
    public final void J0(e2.a1 a1Var) {
        V0();
        synchronized (this.b) {
            try {
                e2.v vVar = (e2.v) this.b.get(a1Var);
                if (vVar == null) {
                    vVar = new e2.v(this, a1Var);
                }
                this.a.J0(vVar);
                this.b.put(a1Var, vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // e2.c1
    public final void K(int i7, boolean z10) {
        V0();
        this.a.K(i7, z10);
    }

    @Override // e2.c1
    public final void K0() {
        V0();
        this.a.K0();
    }

    @Override // e2.c1
    public final e2.o L() {
        V0();
        return this.a.L();
    }

    @Override // e2.c1
    public final void L0(e2.o0 o0Var) {
        V0();
        this.a.L0(o0Var);
    }

    @Override // e2.c1
    public final void M() {
        V0();
        this.a.M();
    }

    @Override // e2.c1
    public final void M0() {
        V0();
        this.a.M0();
    }

    @Override // e2.c1
    public final void N(int i7, int i10) {
        V0();
        this.a.N(i7, i10);
    }

    @Override // e2.c1
    public final e2.o0 N0() {
        V0();
        return this.a.N0();
    }

    @Override // e2.c1
    public final void O(int i7) {
        V0();
        this.a.O(i7);
    }

    @Override // e2.c1
    public final void O0(List list) {
        V0();
        this.a.O0(list);
    }

    @Override // e2.c1
    public final int P() {
        V0();
        return this.a.P();
    }

    @Override // e2.c1
    public final long P0() {
        V0();
        return this.a.P0();
    }

    @Override // e2.c1
    public final boolean Q() {
        return this.a.Q();
    }

    @Override // e2.c1
    public final boolean Q0() {
        V0();
        return this.a.Q0();
    }

    @Override // e2.c1
    public final void R(int i7) {
        V0();
        this.a.R(i7);
    }

    public final m1 R0() {
        boolean q02 = q0(16);
        return new m1(h(), q02 && q(), SystemClock.elapsedRealtime(), q02 ? getDuration() : -9223372036854775807L, q02 ? e0() : 0L, q02 ? z() : 0, q02 ? s() : 0L, q02 ? r() : -9223372036854775807L, q02 ? B() : -9223372036854775807L, q02 ? G0() : 0L);
    }

    @Override // e2.c1
    public final void S(int i7, int i10) {
        V0();
        this.a.S(i7, i10);
    }

    public final e2.l0 S0() {
        if (q0(16)) {
            return x();
        }
        return null;
    }

    @Override // e2.c1
    public final void T(SurfaceHolder surfaceHolder) {
        V0();
        this.a.T(surfaceHolder);
    }

    public final e2.l1 T0() {
        return q0(17) ? z0() : S0() != null ? new g1(this) : e2.l1.a;
    }

    @Override // e2.c1
    public final void U(float f10) {
        V0();
        this.a.U(f10);
    }

    public final e2.o0 U0() {
        return q0(18) ? N0() : e2.o0.L;
    }

    @Override // e2.c1
    public final void V() {
        V0();
        this.a.V();
    }

    public final void V0() {
        ma.p(Looper.myLooper() == this.a.B0());
    }

    @Override // e2.c1
    public final void W(List list, int i7, long j3) {
        V0();
        this.a.W(list, i7, j3);
    }

    @Override // e2.c1
    public final e2.v0 X() {
        V0();
        return this.a.X();
    }

    @Override // e2.c1
    public final void Y(boolean z10) {
        V0();
        this.a.Y(z10);
    }

    @Override // e2.c1
    public final void Z(int i7) {
        V0();
        this.a.Z(i7);
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
    public final long b0() {
        V0();
        return this.a.b0();
    }

    @Override // e2.c1
    public final void c(long j3) {
        V0();
        this.a.c(j3);
    }

    @Override // e2.c1
    public final void c0(int i7, List list) {
        V0();
        this.a.c0(i7, list);
    }

    @Override // e2.c1
    public final void d(float f10) {
        V0();
        this.a.d(f10);
    }

    @Override // e2.c1
    public final void d0() {
        V0();
        this.a.d0();
    }

    @Override // e2.c1
    public final void e(e2.w0 w0Var) {
        V0();
        this.a.e(w0Var);
    }

    @Override // e2.c1
    public final long e0() {
        V0();
        return this.a.e0();
    }

    @Override // e2.c1
    public final void f() {
        V0();
        this.a.f();
    }

    @Override // e2.c1
    public final boolean f0() {
        V0();
        return this.a.f0();
    }

    @Override // e2.c1
    public final boolean g() {
        V0();
        return this.a.g();
    }

    @Override // e2.c1
    public final void g0(e2.l0 l0Var, long j3) {
        V0();
        this.a.g0(l0Var, j3);
    }

    @Override // e2.c1
    public final long getDuration() {
        V0();
        return this.a.getDuration();
    }

    public final e2.b1 h() {
        boolean q02 = q0(16);
        boolean q03 = q0(17);
        int p02 = q03 ? p0() : 0;
        ma.p(p02 >= 0);
        int C = q03 ? C() : 0;
        ma.p(C >= 0);
        if (q03) {
            e2.l1 z02 = z0();
            if (!z02.p()) {
                ma.p(p02 < z02.o());
                e2.k1 m10 = z02.m(p02, new e2.k1(), 0L);
                ma.p(C == h2.l0.i(C, m10.n, m10.o));
            }
        }
        long j3 = 0;
        e2.l0 x10 = q02 ? x() : null;
        long n10 = q02 ? n() : 0L;
        if (q02) {
            j3 = b0();
        }
        return new e2.b1(null, p02, x10, null, C, n10, j3, q02 ? o0() : -1, q02 ? P() : -1);
    }

    @Override // e2.c1
    public final void h0() {
        V0();
        this.a.h0();
    }

    @Override // e2.c1
    public final int i() {
        V0();
        return this.a.i();
    }

    @Override // e2.c1
    public final void i0(e2.a1 a1Var) {
        V0();
        synchronized (this.b) {
            e2.a1 a1Var2 = (e2.a1) this.b.remove(a1Var);
            e2.c1 c1Var = this.a;
            if (a1Var2 != null) {
                a1Var = a1Var2;
            }
            c1Var.i0(a1Var);
        }
    }

    @Override // e2.c1
    public final boolean j() {
        V0();
        return this.a.j();
    }

    @Override // e2.c1
    public final void j0(int i7) {
        V0();
        this.a.j0(i7);
    }

    @Override // e2.c1
    public final void k(int i7) {
        V0();
        this.a.k(i7);
    }

    @Override // e2.c1
    public final s1 k0() {
        V0();
        return this.a.k0();
    }

    @Override // e2.c1
    public final e2.w0 l() {
        V0();
        return this.a.l();
    }

    @Override // e2.c1
    public final e2.o0 l0() {
        V0();
        return this.a.l0();
    }

    @Override // e2.c1
    public final int m() {
        V0();
        return this.a.m();
    }

    @Override // e2.c1
    public final g2.c m0() {
        V0();
        return this.a.m0();
    }

    @Override // e2.c1
    public final long n() {
        V0();
        return this.a.n();
    }

    @Override // e2.c1
    public final void n0(e2.l0 l0Var) {
        V0();
        this.a.n0(l0Var);
    }

    @Override // e2.c1
    public final int o() {
        V0();
        return this.a.o();
    }

    @Override // e2.c1
    public final int o0() {
        V0();
        return this.a.o0();
    }

    @Override // e2.c1
    public final void p(int i7, e2.l0 l0Var) {
        V0();
        this.a.p(i7, l0Var);
    }

    @Override // e2.c1
    public final int p0() {
        V0();
        return this.a.p0();
    }

    @Override // e2.c1
    public final boolean q() {
        V0();
        return this.a.q();
    }

    @Override // e2.c1
    public final boolean q0(int i7) {
        V0();
        return this.a.q0(i7);
    }

    @Override // e2.c1
    public final long r() {
        V0();
        return this.a.r();
    }

    @Override // e2.c1
    public final void r0(q1 q1Var) {
        V0();
        this.a.r0(q1Var);
    }

    @Override // e2.c1
    public final long s() {
        V0();
        return this.a.s();
    }

    @Override // e2.c1
    public final void s0(boolean z10) {
        V0();
        this.a.s0(z10);
    }

    @Override // e2.c1
    public final void stop() {
        V0();
        this.a.stop();
    }

    @Override // e2.c1
    public final void t(int i7, long j3) {
        V0();
        this.a.t(i7, j3);
    }

    @Override // e2.c1
    public final void t0(List list, int i7, int i10) {
        V0();
        this.a.t0(list, i7, i10);
    }

    @Override // e2.c1
    public final e2.y0 u() {
        V0();
        return this.a.u();
    }

    @Override // e2.c1
    public final void u0(int i7, int i10) {
        V0();
        this.a.u0(i7, i10);
    }

    @Override // e2.c1
    public final boolean v() {
        V0();
        return this.a.v();
    }

    @Override // e2.c1
    public final void v0(int i7, int i10, int i11) {
        V0();
        this.a.v0(i7, i10, i11);
    }

    @Override // e2.c1
    public final void w() {
        V0();
        this.a.w();
    }

    @Override // e2.c1
    public final boolean w0() {
        V0();
        return this.a.w0();
    }

    @Override // e2.c1
    public final e2.l0 x() {
        V0();
        return this.a.x();
    }

    @Override // e2.c1
    public final int x0() {
        V0();
        return this.a.x0();
    }

    @Override // e2.c1
    public final void y(boolean z10) {
        V0();
        this.a.y(z10);
    }

    @Override // e2.c1
    public final void y0(List list) {
        V0();
        this.a.y0(list);
    }

    @Override // e2.c1
    public final int z() {
        V0();
        return this.a.z();
    }

    @Override // e2.c1
    public final e2.l1 z0() {
        V0();
        return this.a.z0();
    }
}
