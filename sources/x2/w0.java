package x2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import l2.t1;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w0 implements e0, f3.q, b3.j, b3.m, a1 {
    public static final Map i0;
    public static final e2.u j0;
    public final hy0 D;
    public final h2.i E;
    public final p0 F;
    public final p0 G;
    public final Handler H;
    public d0 I;
    public s3.b J;
    public s0[] K;
    public b1[] L;
    public v0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public ui.e R;
    public f3.c0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public int a0;
    public final j2.h b;
    public boolean b0;
    public final q2.m c;
    public long c0;
    public final pb.b d;
    public long d0;
    public final wa e;
    public boolean e0;
    public final q2.j f;
    public int f0;
    public boolean g0;
    public final y0 h;
    public boolean h0;
    public final h6.m n;
    public final String r;
    public final long s;
    public final e2.u w;
    public final long x;
    public final b3.o y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        i0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.a = "icy";
        tVar.r = e2.s0.n("application/x-icy");
        j0 = new e2.u(tVar);
    }

    public w0(Uri uri, j2.h hVar, hy0 hy0Var, q2.m mVar, q2.j jVar, pb.b bVar, wa waVar, y0 y0Var, h6.m mVar2, String str, int i7, e2.u uVar, long j3, c3.a aVar) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = bVar;
        this.e = waVar;
        this.h = y0Var;
        this.n = mVar2;
        this.r = str;
        this.s = i7;
        this.w = uVar;
        this.y = aVar != null ? new b3.o(aVar) : new b3.o("ProgressiveMediaPeriod");
        this.D = hy0Var;
        this.x = j3;
        this.E = new h2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = h2.m0.q(null);
        this.M = new v0[0];
        this.L = new b1[0];
        this.K = new s0[0];
        this.d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final boolean A() {
        return this.Y || t();
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var = t0Var.b;
        this.e.t(i7 == 0 ? new u(t0Var.s, j3) : new u(t0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b), 1, -1, null, 0, null, t0Var.r, this.T, i7);
    }

    @Override // f3.q
    public final f3.j0 O1(int i7, int i10) {
        return x(new v0(i7, false));
    }

    @Override // f3.q
    public final void U0() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override // x2.a1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j3) {
        a3.u uVar;
        l();
        ui.e eVar = this.R;
        q1 q1Var = (q1) eVar.b;
        boolean[] zArr3 = (boolean[]) eVar.d;
        int i7 = this.a0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            c1 c1Var = c1VarArr[i11];
            if (c1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) c1Var).a;
                ia.p(zArr3[i12]);
                this.a0--;
                zArr3[i12] = false;
                c1VarArr[i11] = null;
            }
        }
        boolean z9 = !this.X ? j3 == 0 || this.Q : i7 != 0;
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (c1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                ia.p(uVar.length() == 1);
                ia.p(uVar.i(0) == 0);
                int b10 = q1Var.b(uVar.c());
                ia.p(!zArr3[b10]);
                this.a0++;
                zArr3[b10] = true;
                this.Z = uVar.n().y | this.Z;
                c1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z9) {
                    b1 b1Var = this.L[b10];
                    z9 = (b1Var.v() == 0 || b1Var.J(j3, true)) ? false : true;
                }
            }
        }
        if (this.a0 == 0) {
            this.e0 = false;
            this.Y = false;
            this.Z = false;
            b3.o oVar = this.y;
            if (oVar.d()) {
                b1[] b1VarArr = this.L;
                int length = b1VarArr.length;
                while (i10 < length) {
                    b1VarArr[i10].l();
                    i10++;
                }
                oVar.b();
            } else {
                this.g0 = false;
                for (b1 b1Var2 : this.L) {
                    b1Var2.G(false);
                }
            }
        } else if (z9) {
            j3 = j(j3);
            while (i10 < c1VarArr.length) {
                if (c1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.X = true;
        return j3;
    }

    @Override // x2.e1
    public final boolean c(l2.v0 v0Var) {
        if (this.g0) {
            return false;
        }
        b3.o oVar = this.y;
        if (oVar.c() || this.e0) {
            return false;
        }
        if ((this.O || this.w != null) && this.a0 == 0) {
            return false;
        }
        boolean e10 = this.E.e();
        if (oVar.d()) {
            return e10;
        }
        z();
        return true;
    }

    @Override // b3.m
    public final void d() {
        for (b1 b1Var : this.L) {
            b1Var.G(true);
            q2.g gVar = b1Var.h;
            if (gVar != null) {
                gVar.c(b1Var.e);
                b1Var.h = null;
                b1Var.g = null;
            }
        }
        hy0 hy0Var = this.D;
        f3.o oVar = (f3.o) hy0Var.c;
        if (oVar != null) {
            oVar.release();
            hy0Var.c = null;
        }
        hy0Var.d = null;
    }

    @Override // x2.e1
    public final long e() {
        return p();
    }

    @Override // f3.q
    public final void f(f3.c0 c0Var) {
        this.H.post(new wi.q(3, this, c0Var));
    }

    @Override // x2.e1
    public final boolean g() {
        boolean z9;
        if (this.g0 || !this.y.d()) {
            return false;
        }
        h2.i iVar = this.E;
        synchronized (iVar) {
            z9 = iVar.b;
        }
        return z9;
    }

    @Override // x2.e0
    public final long h(long j3, t1 t1Var) {
        l();
        if (!this.S.d()) {
            return 0L;
        }
        f3.b0 f10 = this.S.f(j3);
        return t1Var.a(j3, f10.a.a, f10.b.a);
    }

    @Override // x2.e0
    public final void i() {
        int X0 = this.d.X0(this.V);
        b3.o oVar = this.y;
        IOException iOException = oVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.k kVar = oVar.b;
        if (kVar != null) {
            if (X0 == Integer.MIN_VALUE) {
                X0 = kVar.a;
            }
            IOException iOException2 = kVar.e;
            if (iOException2 != null && kVar.f > X0) {
                throw iOException2;
            }
        }
        if (this.g0 && !this.O) {
            throw e2.t0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(long j3) {
        l();
        boolean[] zArr = (boolean[]) this.R.c;
        if (!this.S.d()) {
            j3 = 0;
        }
        this.Y = false;
        boolean z9 = true;
        boolean z10 = this.c0 == j3;
        this.c0 = j3;
        if (t()) {
            this.d0 = j3;
            return j3;
        }
        int i7 = this.V;
        b3.o oVar = this.y;
        if (i7 != 7 && (this.g0 || oVar.d())) {
            int length = this.L.length;
            for (int i10 = 0; i10 < length; i10++) {
                b1 b1Var = this.L[i10];
                if (this.K[i10].d.get() == r0.a && (b1Var.v() != 0 || !z10)) {
                    if (!(this.Q ? b1Var.I(b1Var.q) : b1Var.J(j3, this.g0)) && (zArr[i10] || !this.P)) {
                        z9 = false;
                        break;
                    }
                }
            }
        }
        this.e0 = false;
        this.d0 = j3;
        this.g0 = false;
        this.Z = false;
        if (oVar.d()) {
            for (b1 b1Var2 : this.L) {
                b1Var2.l();
            }
            oVar.b();
            return j3;
        }
        oVar.c = null;
        for (b1 b1Var3 : this.L) {
            b1Var3.G(false);
        }
        return j3;
    }

    @Override // x2.e0
    public final void k(long j3) {
        if (this.Q) {
            return;
        }
        l();
        if (t()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.R.d;
        int length = this.L.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.L[i7].k(j3, zArr[i7]);
        }
    }

    public final void l() {
        ia.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int m() {
        int i7 = 0;
        for (b1 b1Var : this.L) {
            i7 += b1Var.q + b1Var.p;
        }
        return i7;
    }

    @Override // x2.e0
    public final long n() {
        if (this.Z) {
            this.Z = false;
            return this.c0;
        }
        if (!this.Y) {
            return -9223372036854775807L;
        }
        if (!this.g0 && m() <= this.f0) {
            return -9223372036854775807L;
        }
        this.Y = false;
        return this.c0;
    }

    @Override // x2.e0
    public final q1 o() {
        l();
        return (q1) this.R.b;
    }

    @Override // b3.j
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        f3.c0 c0Var;
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var2 = t0Var.b;
        u uVar = new u(t0Var.s, c0Var2.c, c0Var2.d, j3, j10, c0Var2.b);
        String str = h2.m0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.v) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f;
        } else {
            int m10 = m();
            int i10 = m10 > this.f0 ? 1 : 0;
            if (this.b0 || !((c0Var = this.S) == null || c0Var.h() == -9223372036854775807L)) {
                this.f0 = m10;
            } else if (!this.O || A()) {
                this.Y = this.O;
                this.c0 = 0L;
                this.f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                t0Var.f.a = 0L;
                t0Var.r = 0L;
                t0Var.n = true;
                t0Var.x = false;
            } else {
                this.e0 = true;
                iVar = b3.o.e;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.r, this.T, iOException, !iVar.a());
        return iVar;
    }

    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        t0 t0Var = (t0) lVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long s5 = s(true);
            long j11 = s5 == Long.MIN_VALUE ? 0L : s5 + 10000;
            this.T = j11;
            this.h.v(j11, this.S, this.U);
        }
        j2.c0 c0Var = t0Var.b;
        u uVar = new u(t0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.r, this.T);
        this.g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.d(this);
    }

    @Override // x2.e1
    public final long p() {
        long j3;
        boolean z9;
        l();
        if (this.g0 || this.a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (t()) {
            return this.d0;
        }
        if (this.P) {
            int length = this.L.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ui.e eVar = this.R;
                if (((boolean[]) eVar.c)[i7] && ((boolean[]) eVar.d)[i7]) {
                    b1 b1Var = this.L[i7];
                    synchronized (b1Var) {
                        z9 = b1Var.y;
                    }
                    if (!z9) {
                        j3 = Math.min(j3, this.L[i7].s());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = s(false);
        }
        return j3 == Long.MIN_VALUE ? this.c0 : j3;
    }

    @Override // x2.e0
    public final void q(d0 d0Var, long j3) {
        this.I = d0Var;
        e2.u uVar = this.w;
        if (uVar == null) {
            this.E.e();
            z();
        } else {
            O1(0, 3).g(uVar);
            y(new f3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            U0();
            this.d0 = j3;
        }
    }

    @Override // b3.j
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        t0 t0Var = (t0) lVar;
        j2.c0 c0Var = t0Var.b;
        u uVar = new u(t0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.d.getClass();
        this.e.o(uVar, 1, -1, null, 0, null, t0Var.r, this.T);
        if (z9) {
            return;
        }
        for (b1 b1Var : this.L) {
            b1Var.G(false);
        }
        if (this.a0 > 0) {
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.d(this);
        }
    }

    @Override // x2.e1
    public final void r(long j3) {
        if (this.a0 <= 0 || t()) {
            return;
        }
        int i7 = 0;
        if (this.W != Long.MIN_VALUE) {
            l();
            int i10 = 1;
            while (true) {
                b1[] b1VarArr = this.L;
                if (i7 >= b1VarArr.length) {
                    break;
                }
                ui.e eVar = this.R;
                if (((boolean[]) eVar.d)[i7] && (((boolean[]) eVar.c)[i7] || !this.P)) {
                    i10 &= b1VarArr[i7].z() ? 1 : 0;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            this.g0 = true;
        }
    }

    public final long s(boolean z9) {
        int i7;
        long j3 = Long.MIN_VALUE;
        while (i7 < this.L.length) {
            if (!z9) {
                ui.e eVar = this.R;
                eVar.getClass();
                i7 = ((boolean[]) eVar.d)[i7] ? 0 : i7 + 1;
            }
            j3 = Math.max(j3, this.L[i7].s());
        }
        return j3;
    }

    public final boolean t() {
        return this.d0 != -9223372036854775807L;
    }

    public final void u() {
        e2.q0 a10;
        long j3 = this.x;
        if (this.h0 || this.O || !this.N || this.S == null) {
            return;
        }
        boolean z9 = false;
        for (b1 b1Var : this.L) {
            if (b1Var.y() == null) {
                return;
            }
        }
        h2.i iVar = this.E;
        synchronized (iVar) {
            iVar.b = false;
        }
        int length = this.L.length;
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char c10 = 1;
            if (i10 >= length) {
                break;
            }
            e2.u y10 = this.L[i10].y();
            y10.getClass();
            int h = e2.s0.h(y10.s);
            char c11 = h != 1 ? h != 2 ? h != 3 ? h != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i7 == 1) {
                c10 = 3;
            } else if (i7 == 2) {
                c10 = 4;
            } else if (i7 != 3) {
                c10 = i7 != 4 ? (char) 0 : (char) 2;
            }
            if (c11 > c10) {
                i11 = i10;
                i7 = h;
            }
            i10++;
        }
        e2.m1[] m1VarArr = new e2.m1[length];
        boolean[] zArr = new boolean[length];
        int i12 = 0;
        while (i12 < length) {
            e2.u y11 = this.L[i12].y();
            y11.getClass();
            String str = y11.s;
            boolean i13 = e2.s0.i(str);
            boolean z10 = (i13 || e2.s0.m(str)) ? true : z9;
            zArr[i12] = z10;
            boolean z11 = z9;
            this.P |= z10;
            this.Q = (j3 != -9223372036854775807L && length == 1 && e2.s0.k(str)) ? true : z11 ? 1 : 0;
            s3.b bVar = this.J;
            if (bVar != null) {
                int i14 = bVar.a;
                if (i13 || this.M[i12].b) {
                    e2.q0 q0Var = y11.l;
                    if (q0Var == null) {
                        e2.p0[] p0VarArr = new e2.p0[1];
                        p0VarArr[z11 ? 1 : 0] = bVar;
                        a10 = new e2.q0(p0VarArr);
                    } else {
                        e2.p0[] p0VarArr2 = new e2.p0[1];
                        p0VarArr2[z11 ? 1 : 0] = bVar;
                        a10 = q0Var.a(p0VarArr2);
                    }
                    e2.t a11 = y11.a();
                    a11.k = a10;
                    y11 = new e2.u(a11);
                }
                if (i13 && y11.h == -1 && y11.i == -1 && i14 != -1) {
                    e2.t a12 = y11.a();
                    a12.h = i14;
                    y11 = new e2.u(a12);
                }
            }
            int F = this.c.F(y11);
            e2.t a13 = y11.a();
            a13.S = F;
            e2.u uVar = new e2.u(a13);
            if (i12 != i11) {
                e2.t a14 = uVar.a();
                a14.l = Integer.toString(i11);
                uVar = new e2.u(a14);
            }
            String num = Integer.toString(i12);
            e2.u[] uVarArr = new e2.u[1];
            uVarArr[z11 ? 1 : 0] = uVar;
            m1VarArr[i12] = new e2.m1(num, uVarArr);
            this.Z = uVar.y | this.Z;
            this.L[i12].K(this.W);
            i12++;
            z9 = z11 ? 1 : 0;
        }
        this.R = new ui.e(new q1(m1VarArr), zArr);
        if (this.Q && this.T == -9223372036854775807L) {
            this.T = j3;
            this.S = new q0(this, this.S);
        }
        this.h.v(this.T, this.S, this.U);
        this.O = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.a(this);
    }

    public final void v(int i7) {
        l();
        ui.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.e;
        if (zArr[i7]) {
            return;
        }
        e2.u uVar = ((q1) eVar.b).a(i7).d[0];
        this.e.j(e2.s0.h(uVar.s), uVar, 0, null, this.c0);
        zArr[i7] = true;
    }

    public final void w(int i7) {
        l();
        if (this.e0) {
            if ((!this.P || ((boolean[]) this.R.c)[i7]) && !this.L[i7].A(false)) {
                this.d0 = 0L;
                this.e0 = false;
                this.Y = true;
                this.c0 = 0L;
                this.f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.d(this);
            }
        }
    }

    public final f3.j0 x(v0 v0Var) {
        int length = this.L.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (v0Var.equals(this.M[i7])) {
                return this.L[i7];
            }
        }
        if (this.N) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.m mVar = this.c;
        mVar.getClass();
        b1 b1Var = new b1(this.n, mVar, this.f);
        s0 s0Var = new s0(b1Var);
        b1Var.f = this;
        int i10 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.M, i10);
        v0VarArr[length] = v0Var;
        this.M = v0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.L, i10);
        b1VarArr[length] = b1Var;
        this.L = b1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.K, i10);
        s0VarArr[length] = s0Var;
        this.K = s0VarArr;
        return s0Var;
    }

    public final void y(f3.c0 c0Var) {
        this.S = this.J == null ? c0Var : new f3.t(-9223372036854775807L);
        this.T = c0Var.h();
        boolean z9 = !this.b0 && c0Var.h() == -9223372036854775807L;
        this.U = z9;
        this.V = z9 ? 7 : 1;
        if (this.O) {
            this.h.v(this.T, c0Var, z9);
        } else {
            u();
        }
    }

    public final void z() {
        t0 t0Var = new t0(this, this.a, this.b, this.D, this, this.E);
        if (this.O) {
            ia.p(t());
            long j3 = this.W;
            if (j3 == Long.MIN_VALUE) {
                j3 = this.T;
            }
            if (j3 != -9223372036854775807L && this.d0 > j3) {
                this.g0 = true;
                this.d0 = -9223372036854775807L;
                return;
            }
            f3.c0 c0Var = this.S;
            c0Var.getClass();
            long j10 = c0Var.f(this.d0).a.b;
            long j11 = this.d0;
            t0Var.f.a = j10;
            t0Var.r = j11;
            t0Var.n = true;
            t0Var.x = false;
            for (b1 b1Var : this.L) {
                b1Var.t = this.d0;
            }
            this.d0 = -9223372036854775807L;
        }
        this.f0 = m();
        this.y.f(t0Var, this, this.d.X0(this.V));
    }
}
