package x2;

import a8.la;
import a8.xa;
import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class w0 implements e0, f3.q, b3.k, b3.n, b1 {
    public static final Map j0;
    public static final e2.u k0;
    public final md0 E;
    public final h2.i F;
    public final p0 G;
    public final p0 H;
    public final Handler I;
    public d0 J;
    public s3.b K;
    public s0[] L;
    public c1[] M;
    public v0[] N;
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
    public final q2.m c;
    public boolean c0;
    public final qb.a d;
    public long d0;
    public final xa e;
    public long e0;
    public final q2.j f;
    public boolean f0;
    public int g0;
    public final y0 h;
    public boolean h0;
    public boolean i0;
    public final h6.m n;
    public final String r;
    public final long s;
    public final e2.u w;
    public final long x;
    public final b3.p y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        j0 = DesugarCollections.unmodifiableMap(hashMap);
        e2.t tVar = new e2.t();
        tVar.a = "icy";
        tVar.r = e2.s0.n("application/x-icy");
        k0 = new e2.u(tVar);
    }

    public w0(Uri uri, j2.h hVar, md0 md0Var, q2.m mVar, q2.j jVar, qb.a aVar, xa xaVar, y0 y0Var, h6.m mVar2, String str, int i7, e2.u uVar, long j3, c3.a aVar2) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = aVar;
        this.e = xaVar;
        this.h = y0Var;
        this.n = mVar2;
        this.r = str;
        this.s = i7;
        this.w = uVar;
        this.y = aVar2 != null ? new b3.p(aVar2) : new b3.p("ProgressiveMediaPeriod");
        this.E = md0Var;
        this.x = j3;
        this.F = new h2.i();
        this.G = new p0(this, 1);
        this.H = new p0(this, 2);
        this.I = h2.l0.q(null);
        this.N = new v0[0];
        this.M = new c1[0];
        this.L = new s0[0];
        this.e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(int i7) {
        h();
        if (this.f0) {
            if ((!this.Q || ((boolean[]) this.S.c)[i7]) && !this.M[i7].A(false)) {
                this.e0 = 0L;
                this.f0 = false;
                this.Z = true;
                this.d0 = 0L;
                this.g0 = 0;
                for (c1 c1Var : this.M) {
                    c1Var.G(false);
                }
                d0 d0Var = this.J;
                d0Var.getClass();
                d0Var.c0(this);
            }
        }
    }

    public final f3.i0 B(v0 v0Var) {
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (v0Var.equals(this.N[i7])) {
                return this.M[i7];
            }
        }
        if (this.O) {
            h2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.a + ") after finishing tracks.");
            return new f3.n();
        }
        q2.m mVar = this.c;
        mVar.getClass();
        c1 c1Var = new c1(this.n, mVar, this.f);
        s0 s0Var = new s0(c1Var);
        c1Var.f = this;
        int i10 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.N, i10);
        v0VarArr[length] = v0Var;
        this.N = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.M, i10);
        c1VarArr[length] = c1Var;
        this.M = c1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.L, i10);
        s0VarArr[length] = s0Var;
        this.L = s0VarArr;
        return s0Var;
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
            x();
        }
    }

    public final void D() {
        t0 t0Var = new t0(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            la.p(w());
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
            t0Var.f.a = j10;
            t0Var.r = j11;
            t0Var.n = true;
            t0Var.x = false;
            for (c1 c1Var : this.M) {
                c1Var.t = this.e0;
            }
            this.e0 = -9223372036854775807L;
        }
        this.g0 = m();
        this.y.f(t0Var, this, this.d.R4(this.W));
    }

    public final boolean E() {
        return this.Z || w();
    }

    @Override // x2.b1
    public final void a() {
        this.I.post(this.G);
    }

    @Override // x2.e0
    public final long b(a3.u[] uVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        a3.u uVar;
        h();
        ab.c0 c0Var = this.S;
        r1 r1Var = (r1) c0Var.b;
        boolean[] zArr3 = (boolean[]) c0Var.d;
        int i7 = this.b0;
        int i10 = 0;
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            d1 d1Var = d1VarArr[i11];
            if (d1Var != null && (uVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) d1Var).a;
                la.p(zArr3[i12]);
                this.b0--;
                zArr3[i12] = false;
                d1VarArr[i11] = null;
            }
        }
        boolean z10 = !this.Y ? j3 == 0 || this.R : i7 != 0;
        for (int i13 = 0; i13 < uVarArr.length; i13++) {
            if (d1VarArr[i13] == null && (uVar = uVarArr[i13]) != null) {
                la.p(uVar.length() == 1);
                la.p(uVar.i(0) == 0);
                int b10 = r1Var.b(uVar.c());
                la.p(!zArr3[b10]);
                this.b0++;
                zArr3[b10] = true;
                this.a0 = uVar.n().y | this.a0;
                d1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    c1 c1Var = this.M[b10];
                    z10 = (c1Var.v() == 0 || c1Var.J(j3, true)) ? false : true;
                }
            }
        }
        if (this.b0 == 0) {
            this.f0 = false;
            this.Z = false;
            this.a0 = false;
            b3.p pVar = this.y;
            if (pVar.d()) {
                c1[] c1VarArr = this.M;
                int length = c1VarArr.length;
                while (i10 < length) {
                    c1VarArr[i10].l();
                    i10++;
                }
                pVar.b();
            } else {
                this.h0 = false;
                for (c1 c1Var2 : this.M) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j3 = k(j3);
            while (i10 < d1VarArr.length) {
                if (d1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j3;
    }

    @Override // x2.f1
    public final boolean c(l2.s0 s0Var) {
        if (this.h0) {
            return false;
        }
        b3.p pVar = this.y;
        if (pVar.c() || this.f0) {
            return false;
        }
        if ((this.P || this.w != null) && this.b0 == 0) {
            return false;
        }
        boolean e10 = this.F.e();
        if (pVar.d()) {
            return e10;
        }
        D();
        return true;
    }

    @Override // b3.n
    public final void d() {
        for (c1 c1Var : this.M) {
            c1Var.G(true);
            q2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.c(c1Var.e);
                c1Var.h = null;
                c1Var.g = null;
            }
        }
        md0 md0Var = this.E;
        f3.o oVar = (f3.o) md0Var.c;
        if (oVar != null) {
            oVar.release();
            md0Var.c = null;
        }
        md0Var.d = null;
    }

    @Override // f3.q
    public final void d1() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override // f3.q
    public final f3.i0 d2(int i7, int i10) {
        return B(new v0(i7, false));
    }

    @Override // x2.f1
    public final long e() {
        return r();
    }

    @Override // x2.e0
    public final long f(long j3, l2.p1 p1Var) {
        h();
        if (!this.T.d()) {
            return 0L;
        }
        f3.a0 f10 = this.T.f(j3);
        return p1Var.a(j3, f10.a.a, f10.b.a);
    }

    @Override // x2.f1
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

    public final void h() {
        la.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // x2.e0
    public final void i() {
        int R4 = this.d.R4(this.W);
        b3.p pVar = this.y;
        IOException iOException = pVar.c;
        if (iOException != null) {
            throw iOException;
        }
        b3.l lVar = pVar.b;
        if (lVar != null) {
            if (R4 == Integer.MIN_VALUE) {
                R4 = lVar.a;
            }
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > R4) {
                throw iOException2;
            }
        }
        if (this.h0 && !this.P) {
            throw e2.t0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // f3.q
    public final void j(f3.b0 b0Var) {
        this.I.post(new wg.q(11, this, b0Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // x2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(long j3) {
        h();
        boolean[] zArr = (boolean[]) this.S.c;
        if (!this.T.d()) {
            j3 = 0;
        }
        this.Z = false;
        boolean z10 = true;
        boolean z11 = this.d0 == j3;
        this.d0 = j3;
        if (w()) {
            this.e0 = j3;
            return j3;
        }
        int i7 = this.W;
        b3.p pVar = this.y;
        if (i7 != 7 && (this.h0 || pVar.d())) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                c1 c1Var = this.M[i10];
                if (this.L[i10].d.get() == r0.a && (c1Var.v() != 0 || !z11)) {
                    if (!(this.R ? c1Var.I(c1Var.q) : c1Var.J(j3, this.h0)) && (zArr[i10] || !this.Q)) {
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
        if (pVar.d()) {
            for (c1 c1Var2 : this.M) {
                c1Var2.l();
            }
            pVar.b();
            return j3;
        }
        pVar.c = null;
        for (c1 c1Var3 : this.M) {
            c1Var3.G(false);
        }
        return j3;
    }

    @Override // b3.k
    public final b3.i l(b3.m mVar, long j3, long j10, IOException iOException, int i7) {
        long min;
        b3.i iVar;
        f3.b0 b0Var;
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var2 = t0Var.b;
        u uVar = new u(t0Var.s, b0Var2.c, b0Var2.d, j3, j10, b0Var2.b);
        String str = h2.l0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof e2.t0) || (th2 instanceof FileNotFoundException) || (th2 instanceof j2.u) || (th2 instanceof b3.o) || ((th2 instanceof j2.j) && ((j2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i7 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = b3.p.f;
        } else {
            int m10 = m();
            int i10 = m10 > this.g0 ? 1 : 0;
            if (this.c0 || !((b0Var = this.T) == null || b0Var.h() == -9223372036854775807L)) {
                this.g0 = m10;
            } else if (!this.P || E()) {
                this.Z = this.P;
                this.d0 = 0L;
                this.g0 = 0;
                for (c1 c1Var : this.M) {
                    c1Var.G(false);
                }
                t0Var.f.a = 0L;
                t0Var.r = 0L;
                t0Var.n = true;
                t0Var.x = false;
            } else {
                this.f0 = true;
                iVar = b3.p.e;
            }
            iVar = new b3.i(i10, min, false);
        }
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.r, this.U, iOException, !iVar.a());
        return iVar;
    }

    public final int m() {
        int i7 = 0;
        for (c1 c1Var : this.M) {
            i7 += c1Var.q + c1Var.p;
        }
        return i7;
    }

    @Override // x2.e0
    public final void n(long j3) {
        if (this.R) {
            return;
        }
        h();
        if (w()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.d;
        int length = this.M.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.M[i7].k(j3, zArr[i7]);
        }
    }

    @Override // x2.e0
    public final long o() {
        if (this.a0) {
            this.a0 = false;
            return this.d0;
        }
        if (!this.Z) {
            return -9223372036854775807L;
        }
        if (!this.h0 && m() <= this.g0) {
            return -9223372036854775807L;
        }
        this.Z = false;
        return this.d0;
    }

    @Override // b3.k
    public final void p(b3.m mVar, long j3, long j10, boolean z10) {
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var = t0Var.b;
        u uVar = new u(t0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.o(uVar, 1, -1, null, 0, null, t0Var.r, this.U);
        if (z10) {
            return;
        }
        for (c1 c1Var : this.M) {
            c1Var.G(false);
        }
        if (this.b0 > 0) {
            d0 d0Var = this.J;
            d0Var.getClass();
            d0Var.c0(this);
        }
    }

    @Override // x2.e0
    public final r1 q() {
        h();
        return (r1) this.S.b;
    }

    @Override // x2.f1
    public final long r() {
        long j3;
        boolean z10;
        h();
        if (this.h0 || this.b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (w()) {
            return this.e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j3 = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.c)[i7] && ((boolean[]) c0Var.d)[i7]) {
                    c1 c1Var = this.M[i7];
                    synchronized (c1Var) {
                        z10 = c1Var.y;
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

    @Override // b3.k
    public final void s(b3.m mVar, long j3, long j10, int i7) {
        t0 t0Var = (t0) mVar;
        j2.b0 b0Var = t0Var.b;
        this.e.u(i7 == 0 ? new u(t0Var.s, j3) : new u(t0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b), 1, -1, null, 0, null, t0Var.r, this.U, i7);
    }

    @Override // x2.e0
    public final void t(d0 d0Var, long j3) {
        this.J = d0Var;
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

    @Override // x2.f1
    public final void u(long j3) {
        if (this.b0 <= 0 || w()) {
            return;
        }
        int i7 = 0;
        if (this.X != Long.MIN_VALUE) {
            h();
            int i10 = 1;
            while (true) {
                c1[] c1VarArr = this.M;
                if (i7 >= c1VarArr.length) {
                    break;
                }
                ab.c0 c0Var = this.S;
                if (((boolean[]) c0Var.d)[i7] && (((boolean[]) c0Var.c)[i7] || !this.Q)) {
                    i10 &= c1VarArr[i7].z() ? 1 : 0;
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

    public final boolean w() {
        return this.e0 != -9223372036854775807L;
    }

    public final void x() {
        e2.q0 a10;
        long j3 = this.x;
        if (this.i0 || this.P || !this.O || this.T == null) {
            return;
        }
        boolean z10 = false;
        for (c1 c1Var : this.M) {
            if (c1Var.y() == null) {
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
        this.S = new ab.c0(new r1(m1VarArr), zArr);
        if (this.R && this.U == -9223372036854775807L) {
            this.U = j3;
            this.T = new q0(this, this.T);
        }
        this.h.v(this.U, this.T, this.V);
        this.P = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.m(this);
    }

    public final void y(int i7) {
        h();
        ab.c0 c0Var = this.S;
        boolean[] zArr = (boolean[]) c0Var.e;
        if (zArr[i7]) {
            return;
        }
        e2.u uVar = ((r1) c0Var.b).a(i7).d[0];
        this.e.j(e2.s0.h(uVar.s), uVar, 0, null, this.d0);
        zArr[i7] = true;
    }

    @Override // b3.k
    public final void z(b3.m mVar, long j3, long j10) {
        t0 t0Var = (t0) mVar;
        if (this.U == -9223372036854775807L && this.T != null) {
            long v = v(true);
            long j11 = v == Long.MIN_VALUE ? 0L : v + 10000;
            this.U = j11;
            this.h.v(j11, this.T, this.V);
        }
        j2.b0 b0Var = t0Var.b;
        u uVar = new u(t0Var.s, b0Var.c, b0Var.d, j3, j10, b0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.r, this.U);
        this.h0 = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.c0(this);
    }
}
