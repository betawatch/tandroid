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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class w0 implements e0, c3.q, y2.g, y2.j, b1 {
    public static final Map i0;
    public static final b2.x j0;
    public final e2.i E;
    public final p0 F;
    public final p0 G;
    public final Handler H;
    public d0 I;
    public p3.b J;
    public s0[] K;
    public c1[] L;
    public v0[] M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public pi.e R;
    public c3.b0 S;
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
    public final n2.m c;
    public long c0;
    public final oa.d d;
    public long d0;
    public final a5.a e;
    public boolean e0;
    public final n2.j f;
    public int f0;
    public boolean g0;
    public final y0 h;
    public boolean h0;
    public final androidx.biometric.e n;
    public final String r;
    public final long s;
    public final b2.x v;
    public final long w;
    public final y2.l x;
    public final c y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        i0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.w wVar = new b2.w();
        wVar.a = "icy";
        wVar.r = b2.w0.n("application/x-icy");
        j0 = new b2.x(wVar);
    }

    public w0(Uri uri, g2.h hVar, c cVar, n2.m mVar, n2.j jVar, oa.d dVar, a5.a aVar, y0 y0Var, androidx.biometric.e eVar, String str, int i10, b2.x xVar, long j10, z2.a aVar2) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = dVar;
        this.e = aVar;
        this.h = y0Var;
        this.n = eVar;
        this.r = str;
        this.s = i10;
        this.v = xVar;
        this.x = aVar2 != null ? new y2.l(aVar2) : new y2.l("ProgressiveMediaPeriod");
        this.y = cVar;
        this.w = j10;
        this.E = new e2.i();
        this.F = new p0(this, 1);
        this.G = new p0(this, 2);
        this.H = e2.m0.q(null);
        this.M = new v0[0];
        this.L = new c1[0];
        this.K = new s0[0];
        this.d0 = -9223372036854775807L;
        this.V = 1;
    }

    @Override // y2.g
    public final void A(y2.i iVar, long j10, long j11) {
        t0 t0Var = (t0) iVar;
        if (this.T == -9223372036854775807L && this.S != null) {
            long j12 = j(true);
            long j13 = j12 == Long.MIN_VALUE ? 0L : j12 + 10000;
            this.T = j13;
            this.h.v(j13, this.S, this.U);
        }
        g2.b0 b0Var = t0Var.b;
        u uVar = new u(t0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.r, this.T);
        this.g0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.F(this);
    }

    public final void B() {
        t0 t0Var = new t0(this, this.a, this.b, this.y, this, this.E);
        if (this.O) {
            u6.p(q());
            long j10 = this.W;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.T;
            }
            if (j10 != -9223372036854775807L && this.d0 > j10) {
                this.g0 = true;
                this.d0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.S;
            b0Var.getClass();
            long j11 = b0Var.f(this.d0).a.b;
            long j12 = this.d0;
            t0Var.f.a = j11;
            t0Var.r = j12;
            t0Var.n = true;
            t0Var.w = false;
            for (c1 c1Var : this.L) {
                c1Var.t = this.d0;
            }
            this.d0 = -9223372036854775807L;
        }
        this.f0 = f();
        this.x.f(t0Var, this, this.d.y3(this.V));
    }

    public final boolean C() {
        return this.Y || q();
    }

    @Override // c3.q
    public final void D() {
        this.N = true;
        this.H.post(this.F);
    }

    @Override // c3.q
    public final void K(c3.b0 b0Var) {
        this.H.post(new s9.b(8, this, b0Var));
    }

    @Override // c3.q
    public final c3.i0 W(int i10, int i11) {
        return x(new v0(i10, false));
    }

    @Override // y2.g
    public final void X0(y2.i iVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.b;
        u uVar = new u(t0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.r, this.T);
        if (z10) {
            return;
        }
        for (c1 c1Var : this.L) {
            c1Var.G(false);
        }
        if (this.a0 > 0) {
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.F(this);
        }
    }

    @Override // y2.j
    public final void a() {
        for (c1 c1Var : this.L) {
            c1Var.G(true);
            n2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.g = null;
            }
        }
        c cVar = this.y;
        c3.o oVar = (c3.o) cVar.c;
        if (oVar != null) {
            oVar.release();
            cVar.c = null;
        }
        cVar.d = null;
    }

    @Override // u2.b1
    public final void b() {
        this.H.post(this.F);
    }

    @Override // u2.f1
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

    @Override // u2.f1
    public final long d() {
        return p();
    }

    public final void e() {
        u6.p(this.O);
        this.R.getClass();
        this.S.getClass();
    }

    public final int f() {
        int i10 = 0;
        for (c1 c1Var : this.L) {
            i10 += c1Var.q + c1Var.p;
        }
        return i10;
    }

    @Override // u2.e0
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
            throw b2.x0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // u2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j10) {
        e();
        boolean[] zArr = (boolean[]) this.R.b;
        if (!this.S.d()) {
            j10 = 0;
        }
        this.Y = false;
        boolean z10 = true;
        boolean z11 = this.c0 == j10;
        this.c0 = j10;
        if (q()) {
            this.d0 = j10;
            return j10;
        }
        int i10 = this.V;
        y2.l lVar = this.x;
        if (i10 != 7 && (this.g0 || lVar.d())) {
            int length = this.L.length;
            for (int i11 = 0; i11 < length; i11++) {
                c1 c1Var = this.L[i11];
                if (this.K[i11].d.get() == r0.a && (c1Var.v() != 0 || !z11)) {
                    if (!(this.Q ? c1Var.I(c1Var.q) : c1Var.J(j10, this.g0)) && (zArr[i11] || !this.P)) {
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
            for (c1 c1Var2 : this.L) {
                c1Var2.l();
            }
            lVar.a();
            return j10;
        }
        lVar.c = null;
        for (c1 c1Var3 : this.L) {
            c1Var3.G(false);
        }
        return j10;
    }

    @Override // u2.e0
    public final void i(long j10) {
        if (this.Q) {
            return;
        }
        e();
        if (q()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.R.c;
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.L[i10].k(j10, zArr[i10]);
        }
    }

    public final long j(boolean z10) {
        int i10;
        long j10 = Long.MIN_VALUE;
        while (i10 < this.L.length) {
            if (!z10) {
                pi.e eVar = this.R;
                eVar.getClass();
                i10 = ((boolean[]) eVar.c)[i10] ? 0 : i10 + 1;
            }
            j10 = Math.max(j10, this.L[i10].s());
        }
        return j10;
    }

    @Override // u2.e0
    public final void k(d0 d0Var, long j10) {
        this.I = d0Var;
        b2.x xVar = this.v;
        if (xVar == null) {
            this.E.e();
            B();
        } else {
            W(0, 3).b(xVar);
            z(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            D();
            this.d0 = j10;
        }
    }

    @Override // u2.e0
    public final long l() {
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

    @Override // u2.f1
    public final boolean m(i2.v0 v0Var) {
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

    @Override // u2.e0
    public final long n(x2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        x2.p pVar;
        e();
        pi.e eVar = this.R;
        r1 r1Var = (r1) eVar.a;
        boolean[] zArr3 = (boolean[]) eVar.c;
        int i10 = this.a0;
        int i11 = 0;
        for (int i12 = 0; i12 < pVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (pVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).a;
                u6.p(zArr3[i13]);
                this.a0--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.X ? j10 == 0 || this.Q : i10 != 0;
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (pVar = pVarArr[i14]) != null) {
                u6.p(pVar.length() == 1);
                u6.p(pVar.h(0) == 0);
                int b10 = r1Var.b(pVar.b());
                u6.p(!zArr3[b10]);
                this.a0++;
                zArr3[b10] = true;
                this.Z = pVar.m().y | this.Z;
                d1VarArr[i14] = new u0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    c1 c1Var = this.L[b10];
                    z10 = (c1Var.v() == 0 || c1Var.J(j10, true)) ? false : true;
                }
            }
        }
        if (this.a0 == 0) {
            this.e0 = false;
            this.Y = false;
            this.Z = false;
            y2.l lVar = this.x;
            if (lVar.d()) {
                c1[] c1VarArr = this.L;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].l();
                    i11++;
                }
                lVar.a();
            } else {
                this.g0 = false;
                for (c1 c1Var2 : this.L) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = h(j10);
            while (i11 < d1VarArr.length) {
                if (d1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.X = true;
        return j10;
    }

    @Override // u2.e0
    public final r1 o() {
        e();
        return (r1) this.R.a;
    }

    @Override // u2.f1
    public final long p() {
        long j10;
        boolean z10;
        e();
        if (this.g0 || this.a0 == 0) {
            return Long.MIN_VALUE;
        }
        if (q()) {
            return this.d0;
        }
        if (this.P) {
            int length = this.L.length;
            j10 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                pi.e eVar = this.R;
                if (((boolean[]) eVar.b)[i10] && ((boolean[]) eVar.c)[i10]) {
                    c1 c1Var = this.L[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.y;
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
            j10 = j(false);
        }
        return j10 == Long.MIN_VALUE ? this.c0 : j10;
    }

    public final boolean q() {
        return this.d0 != -9223372036854775807L;
    }

    @Override // u2.e0
    public final long r(long j10, i2.t1 t1Var) {
        e();
        if (!this.S.d()) {
            return 0L;
        }
        c3.a0 f7 = this.S.f(j10);
        return t1Var.a(j10, f7.a.a, f7.b.a);
    }

    @Override // u2.f1
    public final void s(long j10) {
        if (this.a0 <= 0 || q()) {
            return;
        }
        int i10 = 0;
        if (this.W != Long.MIN_VALUE) {
            e();
            int i11 = 1;
            while (true) {
                c1[] c1VarArr = this.L;
                if (i10 >= c1VarArr.length) {
                    break;
                }
                pi.e eVar = this.R;
                if (((boolean[]) eVar.c)[i10] && (((boolean[]) eVar.b)[i10] || !this.P)) {
                    i11 &= c1VarArr[i10].z() ? 1 : 0;
                }
                i10++;
            }
            i10 = i11;
        }
        if (i10 != 0) {
            this.g0 = true;
        }
    }

    public final void t() {
        b2.u0 a2;
        long j10 = this.w;
        if (this.h0 || this.O || !this.N || this.S == null) {
            return;
        }
        boolean z10 = false;
        for (c1 c1Var : this.L) {
            if (c1Var.y() == null) {
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
            b2.x y3 = this.L[i11].y();
            y3.getClass();
            int h = b2.w0.h(y3.s);
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
        b2.q1[] q1VarArr = new b2.q1[length];
        boolean[] zArr = new boolean[length];
        int i13 = 0;
        while (i13 < length) {
            b2.x y10 = this.L[i13].y();
            y10.getClass();
            String str = y10.s;
            boolean i14 = b2.w0.i(str);
            boolean z11 = (i14 || b2.w0.m(str)) ? true : z10;
            zArr[i13] = z11;
            boolean z12 = z10;
            this.P |= z11;
            this.Q = (j10 != -9223372036854775807L && length == 1 && b2.w0.k(str)) ? true : z12 ? 1 : 0;
            p3.b bVar = this.J;
            if (bVar != null) {
                int i15 = bVar.a;
                if (i14 || this.M[i13].b) {
                    b2.u0 u0Var = y10.l;
                    if (u0Var == null) {
                        b2.t0[] t0VarArr = new b2.t0[1];
                        t0VarArr[z12 ? 1 : 0] = bVar;
                        a2 = new b2.u0(t0VarArr);
                    } else {
                        b2.t0[] t0VarArr2 = new b2.t0[1];
                        t0VarArr2[z12 ? 1 : 0] = bVar;
                        a2 = u0Var.a(t0VarArr2);
                    }
                    b2.w a10 = y10.a();
                    a10.k = a2;
                    y10 = new b2.x(a10);
                }
                if (i14 && y10.h == -1 && y10.i == -1 && i15 != -1) {
                    b2.w a11 = y10.a();
                    a11.h = i15;
                    y10 = new b2.x(a11);
                }
            }
            int J0 = this.c.J0(y10);
            b2.w a12 = y10.a();
            a12.S = J0;
            b2.x xVar = new b2.x(a12);
            if (i13 != i12) {
                b2.w a13 = xVar.a();
                a13.l = Integer.toString(i12);
                xVar = new b2.x(a13);
            }
            String num = Integer.toString(i13);
            b2.x[] xVarArr = new b2.x[1];
            xVarArr[z12 ? 1 : 0] = xVar;
            q1VarArr[i13] = new b2.q1(num, xVarArr);
            this.Z = xVar.y | this.Z;
            this.L[i13].K(this.W);
            i13++;
            z10 = z12 ? 1 : 0;
        }
        r1 r1Var = new r1(q1VarArr);
        pi.e eVar = new pi.e();
        eVar.a = r1Var;
        eVar.b = zArr;
        int i16 = r1Var.a;
        eVar.c = new boolean[i16];
        eVar.d = new boolean[i16];
        this.R = eVar;
        if (this.Q && this.T == -9223372036854775807L) {
            this.T = j10;
            this.S = new q0(this, this.S);
        }
        this.h.v(this.T, this.S, this.U);
        this.O = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.q(this);
    }

    public final void u(int i10) {
        e();
        pi.e eVar = this.R;
        boolean[] zArr = (boolean[]) eVar.d;
        if (zArr[i10]) {
            return;
        }
        b2.x xVar = ((r1) eVar.a).a(i10).d[0];
        this.e.m(b2.w0.h(xVar.s), xVar, 0, null, this.c0);
        zArr[i10] = true;
    }

    public final void v(int i10) {
        e();
        if (this.e0) {
            if ((!this.P || ((boolean[]) this.R.b)[i10]) && !this.L[i10].A(false)) {
                this.d0 = 0L;
                this.e0 = false;
                this.Y = true;
                this.c0 = 0L;
                this.f0 = 0;
                for (c1 c1Var : this.L) {
                    c1Var.G(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.F(this);
            }
        }
    }

    @Override // y2.g
    public final k4.d w(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        long min;
        k4.d dVar;
        c3.b0 b0Var;
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var2 = t0Var.b;
        u uVar = new u(t0Var.s, b0Var2.c, b0Var2.d, j10, j11, b0Var2.b);
        String str = e2.m0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof b2.x0) || (th2 instanceof FileNotFoundException) || (th2 instanceof g2.u) || (th2 instanceof y2.k) || ((th2 instanceof g2.j) && ((g2.j) th2).a == 2008)) {
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
            if (this.b0 || !((b0Var = this.S) == null || b0Var.h() == -9223372036854775807L)) {
                this.f0 = f7;
            } else if (!this.O || C()) {
                this.Y = this.O;
                this.c0 = 0L;
                this.f0 = 0;
                for (c1 c1Var : this.L) {
                    c1Var.G(false);
                }
                t0Var.f.a = 0L;
                t0Var.r = 0L;
                t0Var.n = true;
                t0Var.w = false;
            } else {
                this.e0 = true;
                dVar = y2.l.e;
            }
            dVar = new k4.d(i11, min, false);
        }
        this.e.s(uVar, 1, -1, null, 0, null, t0Var.r, this.T, iOException, !dVar.a());
        return dVar;
    }

    public final c3.i0 x(v0 v0Var) {
        int length = this.L.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.M[i10])) {
                return this.L[i10];
            }
        }
        if (this.N) {
            e2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.c;
        mVar.getClass();
        c1 c1Var = new c1(this.n, mVar, this.f);
        s0 s0Var = new s0(c1Var);
        c1Var.f = this;
        int i11 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.M, i11);
        v0VarArr[length] = v0Var;
        this.M = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.L, i11);
        c1VarArr[length] = c1Var;
        this.L = c1VarArr;
        s0[] s0VarArr = (s0[]) Arrays.copyOf(this.K, i11);
        s0VarArr[length] = s0Var;
        this.K = s0VarArr;
        return s0Var;
    }

    @Override // y2.g
    public final void y(y2.i iVar, long j10, long j11, int i10) {
        t0 t0Var = (t0) iVar;
        g2.b0 b0Var = t0Var.b;
        this.e.v(i10 == 0 ? new u(t0Var.s, j10) : new u(t0Var.s, b0Var.c, b0Var.d, j10, j11, b0Var.b), 1, -1, null, 0, null, t0Var.r, this.T, i10);
    }

    public final void z(c3.b0 b0Var) {
        this.S = this.J == null ? b0Var : new c3.t(-9223372036854775807L);
        this.T = b0Var.h();
        boolean z10 = !this.b0 && b0Var.h() == -9223372036854775807L;
        this.U = z10;
        this.V = z10 ? 7 : 1;
        if (this.O) {
            this.h.v(this.T, b0Var, z10);
        } else {
            t();
        }
    }
}
