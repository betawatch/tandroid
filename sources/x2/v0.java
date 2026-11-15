package x2;

import a8.ja;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.ld0;
import ug.t1;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class v0 implements d0, f3.q, b3.j, b3.m, z0 {
    public static final Map j0;
    public static final e2.u k0;
    public final ld0 E;
    public final h2.i F;
    public final o0 G;
    public final o0 H;
    public final Handler I;
    public c0 J;
    public s3.b K;
    public r0[] L;
    public a1[] M;
    public u0[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public ab.c0 S;
    public f3.b0 T;
    public long U;
    public boolean V;
    public int W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final j2.h b;
    public int b0;
    public final q2.n c;
    public boolean c0;
    public final qb.a d;
    public long d0;
    public final xa e;
    public long e0;
    public final q2.k f;
    public boolean f0;
    public int g0;
    public final x0 h;
    public boolean h0;
    public boolean i0;
    public final h6.m n;
    public final String r;
    public final long s;
    public final e2.u w;
    public final long x;
    public final b3.o y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        j0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.a = "icy";
        tVar.r = e2.s0.n("application/x-icy");
        k0 = new e2.u(tVar);
    }

    public v0(Uri uri, j2.h hVar, ld0 ld0Var, q2.n nVar, q2.k kVar, qb.a aVar, xa xaVar, x0 x0Var, h6.m mVar, String str, int i7, e2.u uVar, long j3, c3.a aVar2) {
        this.a = uri;
        this.b = hVar;
        this.c = nVar;
        this.f = kVar;
        this.d = aVar;
        this.e = xaVar;
        this.h = x0Var;
        this.n = mVar;
        this.r = str;
        this.s = i7;
        this.w = uVar;
        this.y = aVar2 != null ? new b3.o(aVar2) : new b3.o("ProgressiveMediaPeriod");
        this.E = ld0Var;
        this.x = j3;
        this.F = new h2.i();
        this.G = new o0(this, 1);
        this.H = new o0(this, 2);
        this.I = h2.l0.q(null);
        this.N = new u0[0];
        this.M = new a1[0];
        this.L = new r0[0];
        this.e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(int i7) {
        n();
        if (this.f0) {
            if ((!this.Q || ((boolean[]) this.S.c)[i7]) && !this.M[i7].A(false)) {
                this.e0 = 0L;
                this.f0 = false;
                this.Z = true;
                this.d0 = 0L;
                this.g0 = 0;
                for (a1 a1Var : this.M) {
                    a1Var.G(false);
                }
                c0 c0Var = this.J;
                c0Var.getClass();
                c0Var.f0(this);
            }
        }
    }

    public final f3.i0 B(u0 u0Var) {
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (u0Var.equals(this.N[i7])) {
                return this.M[i7];
            }
        }
        if (this.O) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.n nVar = this.c;
        nVar.getClass();
        a1 a1Var = new a1(this.n, nVar, this.f);
        r0 r0Var = new r0(a1Var);
        a1Var.f = this;
        int i10 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.N, i10);
        u0VarArr[length] = u0Var;
        this.N = u0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.M, i10);
        a1VarArr[length] = a1Var;
        this.M = a1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.L, i10);
        r0VarArr[length] = r0Var;
        this.L = r0VarArr;
        return r0Var;
    }

    public final void C(f3.b0 b0Var) {
        this.T = this.K == null ? b0Var : new f3.t(-9223372036854775807L);
        this.U = b0Var.h();
        boolean z10 = !this.c0 && b0Var.h() == -9223372036854775807L;
        this.V = z10;
        this.W = z10 ? 7 : 1;
        if (this.P) {
            this.h.v(this.U, b0Var, z10);
        } else {
            y();
        }
    }

    public final void D() {
        s0 s0Var = new s0(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            ja.p(x());
            long j3 = this.X;
            if (j3 == Long.MIN_VALUE) {
                j3 = this.U;
            }
            if (j3 != -9223372036854775807L && this.e0 > j3) {
                this.h0 = true;
                this.e0 = -9223372036854775807L;
                return;
            }
            f3.b0 b0Var = this.T;
            b0Var.getClass();
            long j10 = b0Var.f(this.e0).a.b;
            long j11 = this.e0;
            s0Var.f.a = j10;
            s0Var.r = j11;
            s0Var.n = true;
            s0Var.x = false;
            for (a1 a1Var : this.M) {
                a1Var.t = this.e0;
            }
            this.e0 = -9223372036854775807L;
        }
        this.g0 = q();
        this.y.f(s0Var, this, this.d.R4(this.W));
    }

    public final boolean E() {
        return this.Z || x();
    }

    @Override // x2.z0
    public final void a() {
        this.I.post(this.G);
    }

    @Override // x2.d0
    public final long b(a3.u[] uVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        a3.u uVar;
        n();
        ab.c0 c0Var = this.S;
        q1 q1Var = (q1) c0Var.b;
        boolean[] zArr3 = (boolean[]) c0Var.d;
        int i7 = this.b0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            b1 b1Var = b1VarArr[i11];
            if (b1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((t0) b1Var).a;
                ja.p(zArr3[i12]);
                this.b0--;
                zArr3[i12] = false;
                b1VarArr[i11] = null;
            }
        }
        boolean z10 = !this.Y ? j3 == 0 || this.R : i7 != 0;
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (b1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                ja.p(uVar.length() == 1);
                ja.p(uVar.i(0) == 0);
                int b10 = q1Var.b(uVar.c());
                ja.p(!zArr3[b10]);
                this.b0++;
                zArr3[b10] = true;
                this.a0 = uVar.n().y | this.a0;
                b1VarArr[i13] = new t0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    a1 a1Var = this.M[b10];
                    z10 = (a1Var.v() == 0 || a1Var.J(j3, true)) ? false : true;
                }
            }
        }
        if (this.b0 == 0) {
            this.f0 = false;
            this.Z = false;
            this.a0 = false;
            b3.o oVar = this.y;
            if (oVar.d()) {
                a1[] a1VarArr = this.M;
                int length = a1VarArr.length;
                while (i10 < length) {
                    a1VarArr[i10].l();
                    i10++;
                }
                oVar.b();
            } else {
                this.h0 = false;
                for (a1 a1Var2 : this.M) {
                    a1Var2.G(false);
                }
            }
        } else if (z10) {
            j3 = j(j3);
            while (i10 < b1VarArr.length) {
                if (b1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j3;
    }

    @Override // x2.d1
    public final boolean c(l2.s0 s0Var) {
        if (this.h0) {
            return false;
        }
        b3.o oVar = this.y;
        if (oVar.c() || this.f0) {
            return false;
        }
        if ((this.P || this.w != null) && this.b0 == 0) {
            return false;
        }
        boolean e10 = this.F.e();
        if (oVar.d()) {
            return e10;
        }
        D();
        return true;
    }

    @Override // b3.m
    public final void d() {
        for (a1 a1Var : this.M) {
            a1Var.G(true);
            q2.h hVar = a1Var.h;
            if (hVar != null) {
                hVar.c(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        ld0 ld0Var = this.E;
        f3.o oVar = (f3.o) ld0Var.c;
        if (oVar != null) {
            oVar.release();
            ld0Var.c = null;
        }
        ld0Var.d = null;
    }

    @Override // f3.q
    public final void d1() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override // f3.q
    public final f3.i0 d2(int i7, int i10) {
        return B(new u0(i7, false));
    }

    @Override // x2.d1
    public final long e() {
        return s();
    }

    @Override // f3.q
    public final void f(f3.b0 b0Var) {
        this.I.post(new t1(17, this, b0Var));
    }

    @Override // x2.d1
    public final boolean g() {
        boolean z10;
        if (this.h0 || !this.y.d()) {
            return false;
        }
        h2.i iVar = this.F;
        synchronized (iVar) {
            z10 = iVar.b;
        }
        return z10;
    }

    @Override // x2.d0
    public final long h(long j3, l2.p1 p1Var) {
        n();
        if (!this.T.d()) {
            return 0L;
        }
        f3.a0 f10 = this.T.f(j3);
        return p1Var.a(j3, f10.a.a, f10.b.a);
    }

    @Override // x2.d0
    public final void i() {
        int R4 = this.d.R4(this.W);
        b3.o oVar = this.y;
        IOException iOException = oVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.k kVar = oVar.b;
        if (kVar != null) {
            if (R4 == Integer.MIN_VALUE) {
                R4 = kVar.a;
            }
            IOException iOException2 = kVar.e;
            if (iOException2 != null && kVar.f > R4) {
                throw iOException2;
            }
        }
        if (this.h0 && !this.P) {
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
        n();
        boolean[] zArr = (boolean[]) this.S.c;
        if (!this.T.d()) {
            j3 = 0;
        }
        this.Z = false;
        boolean z10 = true;
        boolean z11 = this.d0 == j3;
        this.d0 = j3;
        if (x()) {
            this.e0 = j3;
            return j3;
        }
        int i7 = this.W;
        b3.o oVar = this.y;
        if (i7 != 7 && (this.h0 || oVar.d())) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                a1 a1Var = this.M[i10];
                if (this.L[i10].d.get() == q0.a && (a1Var.v() != 0 || !z11)) {
                    if (!(this.R ? a1Var.I(a1Var.q) : a1Var.J(j3, this.h0)) && (zArr[i10] || !this.Q)) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        this.f0 = false;
        this.e0 = j3;
        this.h0 = false;
        this.a0 = false;
        if (oVar.d()) {
            for (a1 a1Var2 : this.M) {
                a1Var2.l();
            }
            oVar.b();
            return j3;
        }
        oVar.c = null;
        for (a1 a1Var3 : this.M) {
            a1Var3.G(false);
        }
        return j3;
    }

    @Override // b3.j
    public final b3.i k(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        f3.b0 b0Var;
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var2 = s0Var.b;
        t tVar = new t(s0Var.s, b0Var2.c, b0Var2.d, j3, j10, b0Var2.b);
        String str = h2.l0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.n) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.o.f;
        } else {
            int q10 = q();
            int i10 = q10 > this.g0 ? 1 : 0;
            if (this.c0 || !((b0Var = this.T) == null || b0Var.h() == -9223372036854775807L)) {
                this.g0 = q10;
            } else if (!this.P || E()) {
                this.Z = this.P;
                this.d0 = 0L;
                this.g0 = 0;
                for (a1 a1Var : this.M) {
                    a1Var.G(false);
                }
                s0Var.f.a = 0L;
                s0Var.r = 0L;
                s0Var.n = true;
                s0Var.x = false;
            } else {
                this.f0 = true;
                iVar = b3.o.e;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.e.p(tVar, 1, -1, null, 0, null, s0Var.r, this.U, iOException, !iVar.a());
        return iVar;
    }

    @Override // x2.d0
    public final void l(long j3) {
        if (this.R) {
            return;
        }
        n();
        if (x()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.d;
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.M[i7].k(j3, zArr[i7]);
        }
    }

    @Override // b3.j
    public final void m(b3.l lVar, long j3, long j10, boolean z10) {
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var = s0Var.b;
        t tVar = new t(s0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.n(tVar, 1, -1, null, 0, null, s0Var.r, this.U);
        if (z10) {
            return;
        }
        for (a1 a1Var : this.M) {
            a1Var.G(false);
        }
        if (this.b0 > 0) {
            c0 c0Var = this.J;
            c0Var.getClass();
            c0Var.f0(this);
        }
    }

    public final void n() {
        ja.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // x2.d0
    public final long o() {
        if (this.a0) {
            this.a0 = false;
            return this.d0;
        }
        if (!this.Z) {
            return -9223372036854775807L;
        }
        if (!this.h0 && q() <= this.g0) {
            return -9223372036854775807L;
        }
        this.Z = false;
        return this.d0;
    }

    @Override // x2.d0
    public final q1 p() {
        n();
        return (q1) this.S.b;
    }

    public final int q() {
        int i7 = 0;
        for (a1 a1Var : this.M) {
            i7 += a1Var.q + a1Var.p;
        }
        return i7;
    }

    @Override // b3.j
    public final void r(b3.l lVar, long j3, long j10, int i7) {
        s0 s0Var = (s0) lVar;
        j2.b0 b0Var = s0Var.b;
        this.e.s(i7 == 0 ? new t(s0Var.s, j3) : new t(s0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b), 1, -1, null, 0, null, s0Var.r, this.U, i7);
    }

    @Override // x2.d1
    public final long s() {
        long j3;
        boolean z10;
        n();
        if (this.h0 || this.b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.c)[i7] && ((boolean[]) c0Var.d)[i7]) {
                    a1 a1Var = this.M[i7];
                    synchronized (a1Var) {
                        z10 = a1Var.y;
                    }
                    if (!z10) {
                        j3 = Math.min(j3, this.M[i7].s());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = v(false);
        }
        return j3 == Long.MIN_VALUE ? this.d0 : j3;
    }

    @Override // x2.d0
    public final void t(c0 c0Var, long j3) {
        this.J = c0Var;
        e2.u uVar = this.w;
        if (uVar == null) {
            this.F.e();
            D();
        } else {
            d2(0, 3).g(uVar);
            C(new f3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            d1();
            this.e0 = j3;
        }
    }

    @Override // x2.d1
    public final void u(long j3) {
        if (this.b0 <= 0 || x()) {
            return;
        }
        int i7 = 0;
        if (this.X != Long.MIN_VALUE) {
            n();
            int i10 = 1;
            while (true) {
                a1[] a1VarArr = this.M;
                if (i7 >= a1VarArr.length) {
                    break;
                }
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.d)[i7] && (((boolean[]) c0Var.c)[i7] || !this.Q)) {
                    i10 &= a1VarArr[i7].z() ? 1 : 0;
                }
                i7++;
            }
            i7 = i10;
        }
        if (i7 != 0) {
            this.h0 = true;
        }
    }

    public final long v(boolean z10) {
        int i7;
        long j3 = Long.MIN_VALUE;
        while (i7 < this.M.length) {
            if (!z10) {
                ab.c0 c0Var = this.S;
                c0Var.getClass();
                i7 = ((boolean[]) c0Var.d)[i7] ? 0 : i7 + 1;
            }
            j3 = Math.max(j3, this.M[i7].s());
        }
        return j3;
    }

    @Override // b3.j
    public final void w(b3.l lVar, long j3, long j10) {
        s0 s0Var = (s0) lVar;
        if (this.U == -9223372036854775807L && this.T != null) {
            long v = v(true);
            long j11 = v == Long.MIN_VALUE ? 0L : v + 10000;
            this.U = j11;
            this.h.v(j11, this.T, this.V);
        }
        j2.b0 b0Var = s0Var.b;
        t tVar = new t(s0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.o(tVar, 1, -1, null, 0, null, s0Var.r, this.U);
        this.h0 = true;
        c0 c0Var = this.J;
        c0Var.getClass();
        c0Var.f0(this);
    }

    public final boolean x() {
        return this.e0 != -9223372036854775807L;
    }

    public final void y() {
        e2.q0 a10;
        long j3 = this.x;
        if (this.i0 || this.P || !this.O || this.T == null) {
            return;
        }
        boolean z10 = false;
        for (a1 a1Var : this.M) {
            if (a1Var.y() == null) {
                return;
            }
        }
        h2.i iVar = this.F;
        synchronized (iVar) {
            iVar.b = false;
        }
        int length = this.M.length;
        int i7 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char c10 = 1;
            if (i10 >= length) {
                break;
            }
            e2.u y10 = this.M[i10].y();
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
            e2.u y11 = this.M[i12].y();
            y11.getClass();
            String str = y11.s;
            boolean i13 = e2.s0.i(str);
            boolean z11 = (i13 || e2.s0.m(str)) ? true : z10;
            zArr[i12] = z11;
            boolean z12 = z10;
            this.Q |= z11;
            this.R = (j3 != -9223372036854775807L && length == 1 && e2.s0.k(str)) ? true : z12 ? 1 : 0;
            s3.b bVar = this.K;
            if (bVar != null) {
                int i14 = bVar.a;
                if (i13 || this.N[i12].b) {
                    e2.q0 q0Var = y11.l;
                    if (q0Var == null) {
                        e2.p0[] p0VarArr = new e2.p0[1];
                        p0VarArr[z12 ? 1 : 0] = bVar;
                        a10 = new e2.q0(p0VarArr);
                    } else {
                        e2.p0[] p0VarArr2 = new e2.p0[1];
                        p0VarArr2[z12 ? 1 : 0] = bVar;
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
            int E1 = this.c.E1(y11);
            e2.t a13 = y11.a();
            a13.S = E1;
            e2.u uVar = new e2.u(a13);
            if (i12 != i11) {
                e2.t a14 = uVar.a();
                a14.l = Integer.toString(i11);
                uVar = new e2.u(a14);
            }
            String num = Integer.toString(i12);
            e2.u[] uVarArr = new e2.u[1];
            uVarArr[z12 ? 1 : 0] = uVar;
            m1VarArr[i12] = new e2.m1(num, uVarArr);
            this.a0 = uVar.y | this.a0;
            this.M[i12].K(this.X);
            i12++;
            z10 = z12 ? 1 : 0;
        }
        this.S = new ab.c0(new q1(m1VarArr), zArr);
        if (this.R && this.U == -9223372036854775807L) {
            this.U = j3;
            this.T = new p0(this, this.T);
        }
        this.h.v(this.U, this.T, this.V);
        this.P = true;
        c0 c0Var = this.J;
        c0Var.getClass();
        c0Var.k(this);
    }

    public final void z(int i7) {
        n();
        ab.c0 c0Var = this.S;
        boolean[] zArr = (boolean[]) c0Var.e;
        if (zArr[i7]) {
            return;
        }
        e2.u uVar = ((q1) c0Var.b).a(i7).d[0];
        this.e.i(e2.s0.h(uVar.s), uVar, 0, null, this.d0);
        zArr[i7] = true;
    }
}
