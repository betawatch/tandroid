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
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class v0 implements d0, f3.q, b3.j, b3.m, z0 {
    public static final Map i0;
    public static final e2.u j0;
    public final ly0 D;
    public final h2.i E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public s3.b J;
    public r0[] K;
    public a1[] L;
    public u0[] M;
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
    public final x0 h;
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

    public v0(Uri uri, j2.h hVar, ly0 ly0Var, q2.m mVar, q2.j jVar, pb.b bVar, wa waVar, x0 x0Var, h6.m mVar2, String str, int i7, e2.u uVar, long j3, c3.a aVar) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = bVar;
        this.e = waVar;
        this.h = x0Var;
        this.n = mVar2;
        this.r = str;
        this.s = i7;
        this.w = uVar;
        this.y = aVar != null ? new b3.o(aVar) : new b3.o("ProgressiveMediaPeriod");
        this.D = ly0Var;
        this.x = j3;
        this.E = new h2.i();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = h2.m0.q(null);
        this.M = new u0[0];
        this.L = new a1[0];
        this.K = new r0[0];
        this.d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final boolean A() {
        return this.Y || t();
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        s0 s0Var = (s0) lVar;
        j2.c0 c0Var = s0Var.b;
        this.e.t(i7 == 0 ? new t(s0Var.s, j3) : new t(s0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b), 1, -1, null, 0, null, s0Var.r, this.T, i7);
    }

    @Override // f3.q
    public final f3.j0 O1(int i7, int i10) {
        return x(new u0(i7, false));
    }

    @Override // f3.q
    public final void U0() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override // x2.z0
    public final void a() {
        this.H.post(this.F);
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        a3.u uVar;
        l();
        ui.e eVar = this.R;
        p1 p1Var = (p1) eVar.b;
        boolean[] zArr3 = (boolean[]) eVar.d;
        int i7 = this.a0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((t0) b1Var).a;
                ia.p(zArr3[i12]);
                this.a0--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        boolean z9 = !this.X ? j3 == 0 || this.Q : i7 != 0;
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                ia.p(uVar.length() == 1);
                ia.p(uVar.i(0) == 0);
                int b10 = p1Var.b(uVar.c());
                ia.p(!zArr3[b10]);
                this.a0++;
                zArr3[b10] = true;
                this.Z = uVar.n().y | this.Z;
                b1VarArr[i13] = new t0(this, b10);
                zArr2[i13] = true;
                if (!z9) {
                    a1 a1Var = this.L[b10];
                    z9 = (a1Var.v() == 0 || a1Var.J(j3, true)) ? false : true;
                }
            }
        }
        if (this.a0 == 0) {
            this.e0 = false;
            this.Y = false;
            this.Z = false;
            b3.o oVar = this.y;
            if (oVar.d()) {
                a1[] a1VarArr = this.L;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].l();
                    i10++;
                }
                oVar.b();
            } else {
                this.g0 = false;
                for (a1 a1Var2 : this.L) {
                    a1Var2.G(false);
                }
            }
        } else if (z9) {
            j3 = j(j3);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.X = true;
        return j3;
    }

    @Override // x2.d1
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
        for (a1 a1Var : this.L) {
            a1Var.G(true);
            q2.g gVar = a1Var.h;
            if (gVar != null) {
                gVar.c(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        ly0 ly0Var = this.D;
        f3.o oVar = (f3.o) ly0Var.c;
        if (oVar != null) {
            oVar.release();
            ly0Var.c = null;
        }
        ly0Var.d = null;
    }

    @Override // x2.d1
    public final long e() {
        return p();
    }

    @Override // f3.q
    public final void f(f3.c0 c0Var) {
        this.H.post(new u9.f(29, this, c0Var));
    }

    @Override // x2.d1
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

    @Override // x2.d0
    public final long h(long j3, t1 t1Var) {
        l();
        if (!this.S.d()) {
            return 0L;
        }
        f3.b0 f10 = this.S.f(j3);
        return t1Var.a(j3, f10.a.a, f10.b.a);
    }

    @Override // x2.d0
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
    @Override // x2.d0
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
                a1 a1Var = this.L[i10];
                if (this.K[i10].d.get() == q0.a && (a1Var.v() != 0 || !z10)) {
                    if (!(this.Q ? a1Var.I(a1Var.q) : a1Var.J(j3, this.g0)) && (zArr[i10] || !this.P)) {
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
            for (a1 a1Var2 : this.L) {
                a1Var2.l();
            }
            oVar.b();
            return j3;
        }
        oVar.c = null;
        for (a1 a1Var3 : this.L) {
            a1Var3.G(false);
        }
        return j3;
    }

    @Override // x2.d0
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
        for (a1 a1Var : this.L) {
            i7 += a1Var.q + a1Var.p;
        }
        return i7;
    }

    @Override // x2.d0
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

    @Override // x2.d0
    public final p1 o() {
        l();
        return (p1) this.R.b;
    }

    @Override // b3.j
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        f3.c0 c0Var;
        s0 s0Var = (s0) lVar;
        j2.c0 c0Var2 = s0Var.b;
        t tVar = new t(s0Var.s, c0Var2.c, c0Var2.d, j3, j10, c0Var2.b);
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
                for (a1 a1Var : this.L) {
                    a1Var.G(false);
                }
                s0Var.f.a = 0L;
                s0Var.r = 0L;
                s0Var.n = true;
                s0Var.x = false;
            } else {
                this.e0 = true;
                iVar = b3.o.e;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.e.q(tVar, 1, -1, null, 0, null, s0Var.r, this.T, iOException, !iVar.a());
        return iVar;
    }

    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        s0 s0Var = (s0) lVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long s5 = s(true);
            long j11 = s5 == Long.MIN_VALUE ? 0L : s5 + 10000;
            this.T = j11;
            this.h.v(j11, this.S, this.U);
        }
        j2.c0 c0Var = s0Var.b;
        t tVar = new t(s0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.d.getClass();
        this.e.p(tVar, 1, -1, null, 0, null, s0Var.r, this.T);
        this.g0 = true;
        c0 c0Var2 = this.I;
        c0Var2.getClass();
        c0Var2.d(this);
    }

    @Override // x2.d1
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
                    a1 a1Var = this.L[i7];
                    synchronized (a1Var) {
                        z9 = a1Var.y;
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

    @Override // x2.d0
    public final void q(c0 c0Var, long j3) {
        this.I = c0Var;
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
        s0 s0Var = (s0) lVar;
        j2.c0 c0Var = s0Var.b;
        t tVar = new t(s0Var.s, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, s0Var.r, this.T);
        if (z9) {
            return;
        }
        for (a1 a1Var : this.L) {
            a1Var.G(false);
        }
        if (this.a0 > 0) {
            c0 c0Var2 = this.I;
            c0Var2.getClass();
            c0Var2.d(this);
        }
    }

    @Override // x2.d1
    public final void r(long j3) {
        if (this.a0 <= 0 || t()) {
            return;
        }
        int i7 = 0;
        if (this.W != Long.MIN_VALUE) {
            l();
            int i10 = 1;
            while (true) {
                a1[] a1VarArr = this.L;
                if (i7 >= a1VarArr.length) {
                    break;
                }
                ui.e eVar = this.R;
                if (((boolean[]) eVar.d)[i7] && (((boolean[]) eVar.c)[i7] || !this.P)) {
                    i10 &= a1VarArr[i7].z() ? 1 : 0;
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
        for (a1 a1Var : this.L) {
            if (a1Var.y() == null) {
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
        this.R = new ui.e(new p1(m1VarArr), zArr);
        if (this.Q && this.T == -9223372036854775807L) {
            this.T = j3;
            this.S = new p0(this, this.S);
        }
        this.h.v(this.T, this.S, this.U);
        this.O = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.a(this);
    }

    public final void v(int i7) {
        l();
        ui.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.e;
        if (zArr[i7]) {
            return;
        }
        e2.u uVar = ((p1) eVar.b).a(i7).d[0];
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
                for (a1 a1Var : this.L) {
                    a1Var.G(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.d(this);
            }
        }
    }

    public final f3.j0 x(u0 u0Var) {
        int length = this.L.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (u0Var.equals(this.M[i7])) {
                return this.L[i7];
            }
        }
        if (this.N) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.m mVar = this.c;
        mVar.getClass();
        a1 a1Var = new a1(this.n, mVar, this.f);
        r0 r0Var = new r0(a1Var);
        a1Var.f = this;
        int i10 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.M, i10);
        u0VarArr[length] = u0Var;
        this.M = u0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.L, i10);
        a1VarArr[length] = a1Var;
        this.L = a1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.K, i10);
        r0VarArr[length] = r0Var;
        this.K = r0VarArr;
        return r0Var;
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
        s0 s0Var = new s0(this, this.a, this.b, this.D, this, this.E);
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
            s0Var.f.a = j10;
            s0Var.r = j11;
            s0Var.n = true;
            s0Var.x = false;
            for (a1 a1Var : this.L) {
                a1Var.t = this.d0;
            }
            this.d0 = -9223372036854775807L;
        }
        this.f0 = m();
        this.y.f(s0Var, this, this.d.X0(this.V));
    }
}
