package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MediaDataController;
import v7.u6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class v0 implements d0, c3.q, y2.g, y2.j, a1 {
    public static final Map i0;
    public static final b2.w j0;
    public final e2.i E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public r0[] K;
    public b1[] L;
    public u0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public qi.e R;
    public c3.c0 S;
    public long T;
    public boolean U;
    public int V;
    public final long W = Long.MIN_VALUE;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public int a0;
    public final g2.h b;
    public boolean b0;
    public final n2.n c;
    public long c0;
    public final oa.d d;
    public long d0;
    public final a5.a e;
    public boolean e0;
    public final n2.k f;
    public int f0;
    public boolean g0;
    public final x0 h;
    public boolean h0;
    public final androidx.biometric.e n;
    public final String r;
    public final long s;
    public final b2.w v;
    public final long w;
    public final y2.l x;
    public final t0.h y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.v vVar = new b2.v();
        vVar.a = "icy";
        vVar.r = b2.v0.n("application/x-icy");
        j0 = new b2.w(vVar);
    }

    public v0(Uri uri, g2.h hVar, t0.h hVar2, n2.n nVar, n2.k kVar, oa.d dVar, a5.a aVar, x0 x0Var, androidx.biometric.e eVar, String str, int i10, b2.w wVar, long j10, z2.a aVar2) {
        this.a = uri;
        this.b = hVar;
        this.c = nVar;
        this.f = kVar;
        this.d = dVar;
        this.e = aVar;
        this.h = x0Var;
        this.n = eVar;
        this.r = str;
        this.s = i10;
        this.v = wVar;
        this.x = aVar2 != null ? new y2.l(aVar2) : new y2.l("ProgressiveMediaPeriod");
        this.y = hVar2;
        this.w = j10;
        this.E = new e2.i();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.m0.q(null);
        this.M = new u0[0];
        this.L = new b1[0];
        this.K = new r0[0];
        this.d0 = -9223372036854775807L;
        this.V = 1;
    }

    public final void A(c3.c0 c0Var) {
        this.S = this.J == null ? c0Var : new c3.t(-9223372036854775807L);
        this.T = c0Var.h();
        boolean z10 = !this.b0 && c0Var.h() == -9223372036854775807L;
        this.U = z10;
        this.V = z10 ? 7 : 1;
        if (this.O) {
            this.h.v(this.T, c0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        s0 s0Var = new s0(this, this.a, this.b, this.y, this, this.E);
        if (this.O) {
            u6.p(v());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.d0 > j10) {
                this.g0 = true;
                this.d0 = -9223372036854775807L;
                return;
            }
            c3.c0 c0Var = this.S;
            c0Var.getClass();
            long j11 = c0Var.f(this.d0).a.b;
            long j12 = this.d0;
            s0Var.f.a = j11;
            s0Var.r = j12;
            s0Var.n = true;
            s0Var.w = false;
            for (b1 b1Var : this.L) {
                b1Var.t = this.d0;
            }
            this.d0 = -9223372036854775807L;
        }
        this.f0 = f();
        this.x.f(s0Var, this, this.d.y3(this.V));
    }

    public final boolean C() {
        return this.Y || v();
    }

    @Override // c3.q
    public final void H() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override // y2.g
    public final void I(y2.i iVar, long j10, long j11, boolean z10) {
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.b;
        t tVar = new t(s0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.q(tVar, 1, -1, null, 0, null, s0Var.r, this.T);
        if (z10) {
            return;
        }
        for (b1 b1Var : this.L) {
            b1Var.G(false);
        }
        if (this.a0 > 0) {
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.v(this);
        }
    }

    @Override // u2.a1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.j
    public final void b() {
        for (b1 b1Var : this.L) {
            b1Var.G(true);
            n2.h hVar = b1Var.h;
            if (hVar != null) {
                hVar.a(b1Var.e);
                b1Var.h = null;
                b1Var.g = null;
            }
        }
        t0.h hVar2 = this.y;
        c3.o oVar = (c3.o) hVar2.c;
        if (oVar != null) {
            oVar.release();
            hVar2.c = null;
        }
        hVar2.d = null;
    }

    @Override // u2.e1
    public final boolean c() {
        boolean z10;
        if (this.g0 || !this.x.d()) {
            return false;
        }
        e2.i iVar = this.E;
        synchronized (iVar) {
            z10 = iVar.b;
        }
        return z10;
    }

    @Override // u2.e1
    public final long d() {
        return s();
    }

    public final void e() {
        u6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int f() {
        int i10 = 0;
        for (b1 b1Var : this.L) {
            i10 += b1Var.q + b1Var.p;
        }
        return i10;
    }

    @Override // u2.d0
    public final void g() {
        int y3 = this.d.y3(this.V);
        y2.l lVar = this.x;
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (y3 == Integer.MIN_VALUE) {
                y3 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > y3) {
                throw iOException2;
            }
        }
        if (this.g0 && !this.O) {
            throw b2.w0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // c3.q
    public final void g0(c3.c0 c0Var) {
        this.H.post(new p2.b(29, this, c0Var));
    }

    public final long h(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (i10 < this.L.length) {
            if (!z10) {
                qi.e eVar = this.R;
                eVar.getClass();
                i10 = ((boolean[]) eVar.c)[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j10) {
        e();
        boolean[] zArr = (boolean[]) this.R.b;
        if (!this.S.d()) {
            j10 = 0;
        }
        this.Y = false;
        boolean z10 = true;
        boolean z11 = this.c0 == j10;
        this.c0 = j10;
        if (v()) {
            this.d0 = j10;
            return j10;
        }
        int i10 = this.V;
        y2.l lVar = this.x;
        if (i10 != 7 && (this.g0 || lVar.d())) {
            int length = this.L.length;
            for (int i11 = 0; i11 < length; i11++) {
                b1 b1Var = this.L[i11];
                if (this.K[i11].d.get() == q0.a && (b1Var.v() != 0 || !z11)) {
                    if (!(this.Q ? b1Var.I(b1Var.q) : b1Var.J(j10, this.g0)) && (zArr[i11] || !this.P)) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        this.e0 = false;
        this.d0 = j10;
        this.g0 = false;
        this.Z = false;
        if (lVar.d()) {
            for (b1 b1Var2 : this.L) {
                b1Var2.l();
            }
            lVar.b();
            return j10;
        }
        lVar.c = null;
        for (b1 b1Var3 : this.L) {
            b1Var3.G(false);
        }
        return j10;
    }

    @Override // y2.g
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        c3.c0 c0Var;
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.b;
        t tVar = new t(s0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        String str = e2.m0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.w0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
        if (min == -9223372036854775807L) {
            dVar = y2.l.f;
        } else {
            int f7 = f();
            int i11 = f7 > this.f0 ? 1 : 0;
            if (this.b0 || !((c0Var = this.S) == null || c0Var.h() == -9223372036854775807L)) {
                this.f0 = f7;
            } else if (!this.O || C()) {
                this.Y = this.O;
                this.c0 = 0L;
                this.f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                s0Var.f.a = 0L;
                s0Var.r = 0L;
                s0Var.n = true;
                s0Var.w = false;
            } else {
                this.e0 = true;
                dVar = y2.l.e;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.s(tVar, 1, -1, null, 0, null, s0Var.r, this.T, iOException, !dVar.a());
        return dVar;
    }

    @Override // c3.q
    public final c3.j0 j0(int i10, int i11) {
        return z(new u0(i10, false));
    }

    @Override // u2.d0
    public final void k(long j10) {
        if (this.Q) {
            return;
        }
        e();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.R.c;
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.L[i10].k(j10, zArr[i10]);
        }
    }

    @Override // y2.g
    public final void l(y2.i iVar, long j10, long j11, int i10) {
        s0 s0Var = (s0) iVar;
        g2.b0 b0Var = s0Var.b;
        this.e.v(i10 == 0 ? new t(s0Var.s, j10) : new t(s0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b), 1, -1, null, 0, null, s0Var.r, this.T, i10);
    }

    @Override // u2.d0
    public final void m(c0 c0Var, long j10) {
        this.I = c0Var;
        b2.w wVar = this.v;
        if (wVar == null) {
            this.E.e();
            B();
        } else {
            j0(0, 3).b(wVar);
            A(new c3.z(-9223372036854775807L, new long[]{0}, new long[]{0}));
            H();
            this.d0 = j10;
        }
    }

    @Override // y2.g
    public final void n(y2.i iVar, long j10, long j11) {
        s0 s0Var = (s0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long h = h(true);
            long j12 = h == Long.MIN_VALUE ? 0L : h + 10000;
            this.T = j12;
            this.h.v(j12, this.S, this.U);
        }
        g2.b0 b0Var = s0Var.b;
        t tVar = new t(s0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.r(tVar, 1, -1, null, 0, null, s0Var.r, this.T);
        this.g0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.v(this);
    }

    @Override // u2.d0
    public final long o() {
        if (this.Z) {
            this.Z = false;
            return this.c0;
        }
        if (!this.Y) {
            return -9223372036854775807L;
        }
        if (!this.g0 && f() <= this.f0) {
            return -9223372036854775807L;
        }
        this.Y = false;
        return this.c0;
    }

    @Override // u2.e1
    public final boolean p(i2.u0 u0Var) {
        if (this.g0) {
            return false;
        }
        y2.l lVar = this.x;
        if (lVar.c() || this.e0) {
            return false;
        }
        if ((this.O || this.v != null) && this.a0 == 0) {
            return false;
        }
        boolean e = this.E.e();
        if (lVar.d()) {
            return e;
        }
        B();
        return true;
    }

    @Override // u2.d0
    public final long q(x2.p[] pVarArr, boolean[] zArr, c1[] c1VarArr, boolean[] zArr2, long j10) {
        x2.p pVar;
        e();
        qi.e eVar = this.R;
        q1 q1Var = (q1) eVar.a;
        boolean[] zArr3 = (boolean[]) eVar.c;
        int i10 = this.a0;
        int i11 = 0;
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            c1 c1Var = c1VarArr[i12];
            if (c1Var != null && (pVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((t0) c1Var).a;
                u6.p(zArr3[i13]);
                this.a0--;
                zArr3[i13] = false;
                c1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.X ? j10 == 0 || this.Q : i10 != 0;
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (c1VarArr[i14] == null && (pVar = pVarArr[i14]) != null) {
                u6.p(pVar.length() == 1);
                u6.p(pVar.h(0) == 0);
                int b10 = q1Var.b(pVar.b());
                u6.p(!zArr3[b10]);
                this.a0++;
                zArr3[b10] = true;
                this.Z = pVar.m().y | this.Z;
                c1VarArr[i14] = new t0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    b1 b1Var = this.L[b10];
                    z10 = (b1Var.v() == 0 || b1Var.J(j10, true)) ? false : true;
                }
            }
        }
        if (this.a0 == 0) {
            this.e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.x;
            if (lVar.d()) {
                b1[] b1VarArr = this.L;
                int length = b1VarArr.length;
                while (i11 < length) {
                    b1VarArr[i11].l();
                    i11++;
                }
                lVar.b();
            } else {
                this.g0 = false;
                for (b1 b1Var2 : this.L) {
                    b1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = i(j10);
            while (i11 < c1VarArr.length) {
                if (c1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j10;
    }

    @Override // u2.d0
    public final q1 r() {
        e();
        return (q1) this.R.a;
    }

    @Override // u2.e1
    public final long s() {
        long j10;
        boolean z10;
        e();
        if (this.g0 || this.a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                qi.e eVar = this.R;
                if (((boolean[]) eVar.b)[i10] && ((boolean[]) eVar.c)[i10]) {
                    b1 b1Var = this.L[i10];
                    synchronized (b1Var) {
                        z10 = b1Var.y;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.L[i10].s());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = h(false);
        }
        return j10 == Long.MIN_VALUE ? this.c0 : j10;
    }

    @Override // u2.d0
    public final long t(long j10, i2.r1 r1Var) {
        e();
        if (!this.S.d()) {
            return 0L;
        }
        c3.b0 f7 = this.S.f(j10);
        return r1Var.a(j10, f7.a.a, f7.b.a);
    }

    @Override // u2.e1
    public final void u(long j10) {
        if (this.a0 <= 0 || v()) {
            return;
        }
        int i10 = 0;
        if (this.W != Long.MIN_VALUE) {
            e();
            int i11 = 1;
            while (true) {
                b1[] b1VarArr = this.L;
                if (i10 >= b1VarArr.length) {
                    break;
                }
                qi.e eVar = this.R;
                if (((boolean[]) eVar.c)[i10] && (((boolean[]) eVar.b)[i10] || !this.P)) {
                    i11 &= b1VarArr[i10].z() ? 1 : 0;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            this.g0 = true;
        }
    }

    public final boolean v() {
        return this.d0 != -9223372036854775807L;
    }

    public final void w() {
        b2.t0 a2;
        long j10 = this.w;
        if (this.h0 || this.O || !this.N || this.S == null) {
            return;
        }
        boolean z10 = false;
        for (b1 b1Var : this.L) {
            if (b1Var.y() == null) {
                return;
            }
        }
        e2.i iVar = this.E;
        synchronized (iVar) {
            iVar.b = false;
        }
        int length = this.L.length;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            char c10 = 1;
            if (i11 >= length) {
                break;
            }
            b2.w y3 = this.L[i11].y();
            y3.getClass();
            int h = b2.v0.h(y3.s);
            char c11 = h != 1 ? h != 2 ? h != 3 ? h != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i10 == 1) {
                c10 = 3;
            } else if (i10 == 2) {
                c10 = 4;
            } else if (i10 != 3) {
                c10 = i10 != 4 ? (char) 0 : (char) 2;
            }
            if (c11 > c10) {
                i12 = i11;
                i10 = h;
            }
            i11++;
        }
        b2.p1[] p1VarArr = new b2.p1[length];
        boolean[] zArr = new boolean[length];
        int i13 = 0;
        while (i13 < length) {
            b2.w y10 = this.L[i13].y();
            y10.getClass();
            String str = y10.s;
            boolean i14 = b2.v0.i(str);
            boolean z11 = (i14 || b2.v0.m(str)) ? true : z10;
            zArr[i13] = z11;
            boolean z12 = z10;
            this.P |= z11;
            this.Q = (j10 != -9223372036854775807L && length == 1 && b2.v0.k(str)) ? true : z12 ? 1 : 0;
            p3.b bVar = this.J;
            if (bVar != null) {
                int i15 = bVar.a;
                if (i14 || this.M[i13].b) {
                    b2.t0 t0Var = y10.l;
                    if (t0Var == null) {
                        b2.s0[] s0VarArr = new b2.s0[1];
                        s0VarArr[z12 ? 1 : 0] = bVar;
                        a2 = new b2.t0(s0VarArr);
                    } else {
                        b2.s0[] s0VarArr2 = new b2.s0[1];
                        s0VarArr2[z12 ? 1 : 0] = bVar;
                        a2 = t0Var.a(s0VarArr2);
                    }
                    b2.v a10 = y10.a();
                    a10.k = a2;
                    y10 = new b2.w(a10);
                }
                if (i14 && y10.h == -1 && y10.i == -1 && i15 != -1) {
                    b2.v a11 = y10.a();
                    a11.h = i15;
                    y10 = new b2.w(a11);
                }
            }
            int I0 = this.c.I0(y10);
            b2.v a12 = y10.a();
            a12.S = I0;
            b2.w wVar = new b2.w(a12);
            if (i13 != i12) {
                b2.v a13 = wVar.a();
                a13.l = Integer.toString(i12);
                wVar = new b2.w(a13);
            }
            String num = Integer.toString(i13);
            b2.w[] wVarArr = new b2.w[1];
            wVarArr[z12 ? 1 : 0] = wVar;
            p1VarArr[i13] = new b2.p1(num, wVarArr);
            this.Z = wVar.y | this.Z;
            this.L[i13].K(this.W);
            i13++;
            z10 = z12 ? 1 : 0;
        }
        q1 q1Var = new q1(p1VarArr);
        qi.e eVar = new qi.e();
        eVar.a = q1Var;
        eVar.b = zArr;
        int i16 = q1Var.a;
        eVar.c = new boolean[i16];
        eVar.d = new boolean[i16];
        this.R = eVar;
        if (this.Q && this.T == -9223372036854775807L) {
            this.T = j10;
            this.S = new p0(this, this.S);
        }
        this.h.v(this.T, this.S, this.U);
        this.O = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.h(this);
    }

    public final void x(int i10) {
        e();
        qi.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.d;
        if (zArr[i10]) {
            return;
        }
        b2.w wVar = ((q1) eVar.a).a(i10).d[0];
        this.e.m(b2.v0.h(wVar.s), wVar, 0, null, this.c0);
        zArr[i10] = true;
    }

    public final void y(int i10) {
        e();
        if (this.e0) {
            if ((!this.P || ((boolean[]) this.R.b)[i10]) && !this.L[i10].A(false)) {
                this.d0 = 0L;
                this.e0 = false;
                this.Y = true;
                this.c0 = 0L;
                this.f0 = 0;
                for (b1 b1Var : this.L) {
                    b1Var.G(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.v(this);
            }
        }
    }

    public final c3.j0 z(u0 u0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (u0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + u0Var.a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.c;
        nVar.getClass();
        b1 b1Var = new b1(this.n, nVar, this.f);
        r0 r0Var = new r0(b1Var);
        b1Var.f = this;
        int i11 = length + 1;
        u0[] u0VarArr = (u0[]) Arrays.copyOf(this.M, i11);
        u0VarArr[length] = u0Var;
        this.M = u0VarArr;
        b1[] b1VarArr = (b1[]) Arrays.copyOf(this.L, i11);
        b1VarArr[length] = b1Var;
        this.L = b1VarArr;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.K, i11);
        r0VarArr[length] = r0Var;
        this.K = r0VarArr;
        return r0Var;
    }
}
