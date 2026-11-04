package w2;

import android.net.Uri;
import android.os.Handler;
import b8.kg;
import b8.zb;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 implements e0, e3.q, a3.k, a3.n, b1 {
    public static final Map j0;
    public static final d2.v k0;
    public final p7.d E;
    public final g2.j F;
    public final p0 G;
    public final p0 H;
    public final Handler I;
    public d0 J;
    public r3.b K;
    public s0[] L;
    public c1[] M;
    public v0[] N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public za.p S;
    public e3.b0 T;
    public long U;
    public boolean V;
    public int W;
    public final long X = Long.MIN_VALUE;
    public boolean Y;
    public boolean Z;
    public final Uri a;
    public boolean a0;
    public final i2.h b;
    public int b0;
    public final p2.m c;
    public boolean c0;
    public final kb.a d;
    public long d0;
    public final kg e;
    public long e0;
    public final p2.j f;
    public boolean f0;
    public int g0;
    public final y0 h;
    public boolean h0;
    public boolean i0;
    public final android.support.v4.media.session.a0 n;
    public final String r;
    public final long s;
    public final d2.v w;
    public final long x;
    public final a3.q y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        j0 = DesugarCollections.unmodifiableMap(hashMap);
        d2.u uVar = new d2.u();
        uVar.a = "icy";
        uVar.r = d2.u0.n("application/x-icy");
        k0 = new d2.v(uVar);
    }

    public w0(Uri uri, i2.h hVar, p7.d dVar, p2.m mVar, p2.j jVar, kb.a aVar, kg kgVar, y0 y0Var, android.support.v4.media.session.a0 a0Var, String str, int i3, d2.v vVar, long j10, b3.a aVar2) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = aVar;
        this.e = kgVar;
        this.h = y0Var;
        this.n = a0Var;
        this.r = str;
        this.s = i3;
        this.w = vVar;
        this.y = aVar2 != null ? new a3.q(aVar2) : new a3.q("ProgressiveMediaPeriod");
        this.E = dVar;
        this.x = j10;
        this.F = new g2.j();
        this.G = new p0(this, 1);
        this.H = new p0(this, 2);
        this.I = g2.n0.q(null);
        this.N = new v0[0];
        this.M = new c1[0];
        this.L = new s0[0];
        this.e0 = -9223372036854775807L;
        this.W = 1;
    }

    public final void A(e3.b0 b0Var) {
        this.T = this.K == null ? b0Var : new e3.t(-9223372036854775807L);
        this.U = b0Var.h();
        boolean z10 = !this.c0 && b0Var.h() == -9223372036854775807L;
        this.V = z10;
        this.W = z10 ? 7 : 1;
        if (this.P) {
            this.h.v(this.U, b0Var, z10);
        } else {
            w();
        }
    }

    public final void B() {
        t0 t0Var = new t0(this, this.a, this.b, this.E, this, this.F);
        if (this.P) {
            zb.p(v());
            long j10 = this.X;
            if (j10 == Long.MIN_VALUE) {
                j10 = this.U;
            }
            if (j10 != -9223372036854775807L && this.e0 > j10) {
                this.h0 = true;
                this.e0 = -9223372036854775807L;
                return;
            }
            e3.b0 b0Var = this.T;
            b0Var.getClass();
            long j11 = b0Var.f(this.e0).a.b;
            long j12 = this.e0;
            t0Var.f.a = j11;
            t0Var.r = j12;
            t0Var.n = true;
            t0Var.x = false;
            for (c1 c1Var : this.M) {
                c1Var.t = this.e0;
            }
            this.e0 = -9223372036854775807L;
        }
        this.g0 = o();
        this.y.f(t0Var, this, this.d.F4(this.W));
    }

    public final boolean C() {
        return this.Z || v();
    }

    @Override // e3.q
    public final void L() {
        this.O = true;
        this.I.post(this.G);
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.b;
        this.e.u(i3 == 0 ? new u(t0Var.s, j10) : new u(t0Var.s, c0Var.c, c0Var.d, j10, j11, c0Var.b), 1, -1, null, 0, null, t0Var.r, this.U, i3);
    }

    @Override // w2.b1
    public final void a() {
        this.I.post(this.G);
    }

    @Override // a3.n
    public final void b() {
        for (c1 c1Var : this.M) {
            c1Var.G(true);
            p2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.b(c1Var.e);
                c1Var.h = null;
                c1Var.g = null;
            }
        }
        p7.d dVar = this.E;
        e3.o oVar = (e3.o) dVar.d;
        if (oVar != null) {
            oVar.release();
            dVar.d = null;
        }
        dVar.c = null;
    }

    @Override // w2.f1
    public final boolean c(k2.v0 v0Var) {
        if (this.h0) {
            return false;
        }
        a3.q qVar = this.y;
        if (qVar.c() || this.f0) {
            return false;
        }
        if ((this.P || this.w != null) && this.b0 == 0) {
            return false;
        }
        boolean e10 = this.F.e();
        if (qVar.d()) {
            return e10;
        }
        B();
        return true;
    }

    @Override // w2.f1
    public final boolean d() {
        boolean z10;
        if (this.h0 || !this.y.d()) {
            return false;
        }
        g2.j jVar = this.F;
        synchronized (jVar) {
            z10 = jVar.b;
        }
        return z10;
    }

    @Override // w2.f1
    public final long e() {
        return q();
    }

    @Override // e3.q
    public final void f(e3.b0 b0Var) {
        this.I.post(new u9.a(15, this, b0Var));
    }

    @Override // w2.e0
    public final void g() {
        int F4 = this.d.F4(this.W);
        a3.q qVar = this.y;
        IOException iOException = qVar.c;
        if (iOException != null) {
            throw iOException;
        }
        a3.l lVar = qVar.b;
        if (lVar != null) {
            if (F4 == Integer.MIN_VALUE) {
                F4 = lVar.a;
            }
            IOException iOException2 = lVar.e;
            if (iOException2 != null && lVar.f > F4) {
                throw iOException2;
            }
        }
        if (this.h0 && !this.P) {
            throw d2.v0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        t0 t0Var = (t0) mVar;
        if (this.U == -9223372036854775807L && this.T != null) {
            long u10 = u(true);
            long j12 = u10 == Long.MIN_VALUE ? 0L : u10 + 10000;
            this.U = j12;
            this.h.v(j12, this.T, this.V);
        }
        i2.c0 c0Var = t0Var.b;
        u uVar = new u(t0Var.s, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.d.getClass();
        this.e.q(uVar, 1, -1, null, 0, null, t0Var.r, this.U);
        this.h0 = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.k(this);
    }

    @Override // w2.e0
    public final void i(d0 d0Var, long j10) {
        this.J = d0Var;
        d2.v vVar = this.w;
        if (vVar == null) {
            this.F.e();
            B();
        } else {
            i0(0, 3).g(vVar);
            A(new e3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            L();
            this.e0 = j10;
        }
    }

    @Override // e3.q
    public final e3.i0 i0(int i3, int i10) {
        return z(new v0(i3, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // w2.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long j(long j10) {
        m();
        boolean[] zArr = (boolean[]) this.S.b;
        if (!this.T.d()) {
            j10 = 0;
        }
        this.Z = false;
        boolean z10 = true;
        boolean z11 = this.d0 == j10;
        this.d0 = j10;
        if (v()) {
            this.e0 = j10;
            return j10;
        }
        int i3 = this.W;
        a3.q qVar = this.y;
        if (i3 != 7 && (this.h0 || qVar.d())) {
            int length = this.M.length;
            for (int i10 = 0; i10 < length; i10++) {
                c1 c1Var = this.M[i10];
                if (this.L[i10].d.get() == r0.a && (c1Var.v() != 0 || !z11)) {
                    if (!(this.R ? c1Var.I(c1Var.q) : c1Var.J(j10, this.h0)) && (zArr[i10] || !this.Q)) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        this.f0 = false;
        this.e0 = j10;
        this.h0 = false;
        this.a0 = false;
        if (qVar.d()) {
            for (c1 c1Var2 : this.M) {
                c1Var2.l();
            }
            qVar.b();
            return j10;
        }
        qVar.c = null;
        for (c1 c1Var3 : this.M) {
            c1Var3.G(false);
        }
        return j10;
    }

    @Override // a3.k
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        long min;
        a3.i iVar;
        e3.b0 b0Var;
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.b;
        u uVar = new u(t0Var.s, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        String str = g2.n0.a;
        this.d.getClass();
        for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
            if ((th2 instanceof d2.v0) || (th2 instanceof FileNotFoundException) || (th2 instanceof i2.v) || (th2 instanceof a3.p) || ((th2 instanceof i2.k) && ((i2.k) th2).a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i3 - 1) * 1000, 5000);
        if (min == -9223372036854775807L) {
            iVar = a3.q.f;
        } else {
            int o10 = o();
            int i10 = o10 > this.g0 ? 1 : 0;
            if (this.c0 || !((b0Var = this.T) == null || b0Var.h() == -9223372036854775807L)) {
                this.g0 = o10;
            } else if (!this.P || C()) {
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
                iVar = a3.q.e;
            }
            iVar = new a3.i(i10, min, false);
        }
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.r, this.U, iOException, !iVar.a());
        return iVar;
    }

    @Override // w2.e0
    public final void l(long j10) {
        if (this.R) {
            return;
        }
        m();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.S.c;
        int length = this.M.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.M[i3].k(j10, zArr[i3]);
        }
    }

    public final void m() {
        zb.p(this.P);
        this.S.getClass();
        this.T.getClass();
    }

    @Override // w2.e0
    public final long n() {
        if (this.a0) {
            this.a0 = false;
            return this.d0;
        }
        if (!this.Z) {
            return -9223372036854775807L;
        }
        if (!this.h0 && o() <= this.g0) {
            return -9223372036854775807L;
        }
        this.Z = false;
        return this.d0;
    }

    public final int o() {
        int i3 = 0;
        for (c1 c1Var : this.M) {
            i3 += c1Var.q + c1Var.p;
        }
        return i3;
    }

    @Override // w2.e0
    public final r1 p() {
        m();
        return (r1) this.S.a;
    }

    @Override // w2.f1
    public final long q() {
        long j10;
        boolean z10;
        m();
        if (this.h0 || this.b0 == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.e0;
        }
        if (this.Q) {
            int length = this.M.length;
            j10 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < length; i3++) {
                za.p pVar = this.S;
                if (((boolean[]) pVar.b)[i3] && ((boolean[]) pVar.c)[i3]) {
                    c1 c1Var = this.M[i3];
                    synchronized (c1Var) {
                        z10 = c1Var.y;
                    }
                    if (!z10) {
                        j10 = Math.min(j10, this.M[i3].s());
                    }
                }
            }
        } else {
            j10 = Long.MAX_VALUE;
        }
        if (j10 == Long.MAX_VALUE) {
            j10 = u(false);
        }
        return j10 == Long.MIN_VALUE ? this.d0 : j10;
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) mVar;
        i2.c0 c0Var = t0Var.b;
        u uVar = new u(t0Var.s, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        this.d.getClass();
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.r, this.U);
        if (z10) {
            return;
        }
        for (c1 c1Var : this.M) {
            c1Var.G(false);
        }
        if (this.b0 > 0) {
            d0 d0Var = this.J;
            d0Var.getClass();
            d0Var.k(this);
        }
    }

    @Override // w2.e0
    public final long r(long j10, k2.t1 t1Var) {
        m();
        if (!this.T.d()) {
            return 0L;
        }
        e3.a0 f10 = this.T.f(j10);
        return t1Var.a(j10, f10.a.a, f10.b.a);
    }

    @Override // w2.e0
    public final long s(z2.p[] pVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        z2.p pVar;
        m();
        za.p pVar2 = this.S;
        r1 r1Var = (r1) pVar2.a;
        boolean[] zArr3 = (boolean[]) pVar2.c;
        int i3 = this.b0;
        int i10 = 0;
        for (int i11 = 0; i11 < pVarArr.length; i11++) {
            d1 d1Var = d1VarArr[i11];
            if (d1Var != null && (pVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((u0) d1Var).a;
                zb.p(zArr3[i12]);
                this.b0--;
                zArr3[i12] = false;
                d1VarArr[i11] = null;
            }
        }
        boolean z10 = !this.Y ? j10 == 0 || this.R : i3 != 0;
        for (int i13 = 0; i13 < pVarArr.length; i13++) {
            if (d1VarArr[i13] == null && (pVar = pVarArr[i13]) != null) {
                zb.p(pVar.length() == 1);
                zb.p(pVar.i(0) == 0);
                int b10 = r1Var.b(pVar.b());
                zb.p(!zArr3[b10]);
                this.b0++;
                zArr3[b10] = true;
                this.a0 = pVar.n().y | this.a0;
                d1VarArr[i13] = new u0(this, b10);
                zArr2[i13] = true;
                if (!z10) {
                    c1 c1Var = this.M[b10];
                    z10 = (c1Var.v() == 0 || c1Var.J(j10, true)) ? false : true;
                }
            }
        }
        if (this.b0 == 0) {
            this.f0 = false;
            this.Z = false;
            this.a0 = false;
            a3.q qVar = this.y;
            if (qVar.d()) {
                c1[] c1VarArr = this.M;
                int length = c1VarArr.length;
                while (i10 < length) {
                    c1VarArr[i10].l();
                    i10++;
                }
                qVar.b();
            } else {
                this.h0 = false;
                for (c1 c1Var2 : this.M) {
                    c1Var2.G(false);
                }
            }
        } else if (z10) {
            j10 = j(j10);
            while (i10 < d1VarArr.length) {
                if (d1VarArr[i10] != null) {
                    zArr2[i10] = true;
                }
                i10++;
            }
        }
        this.Y = true;
        return j10;
    }

    @Override // w2.f1
    public final void t(long j10) {
        if (this.b0 <= 0 || v()) {
            return;
        }
        int i3 = 0;
        if (this.X != Long.MIN_VALUE) {
            m();
            int i10 = 1;
            while (true) {
                c1[] c1VarArr = this.M;
                if (i3 >= c1VarArr.length) {
                    break;
                }
                za.p pVar = this.S;
                if (((boolean[]) pVar.c)[i3] && (((boolean[]) pVar.b)[i3] || !this.Q)) {
                    i10 &= c1VarArr[i3].z() ? 1 : 0;
                }
                i3++;
            }
            i3 = i10;
        }
        if (i3 != 0) {
            this.h0 = true;
        }
    }

    public final long u(boolean z10) {
        int i3;
        long j10 = Long.MIN_VALUE;
        while (i3 < this.M.length) {
            if (!z10) {
                za.p pVar = this.S;
                pVar.getClass();
                i3 = ((boolean[]) pVar.c)[i3] ? 0 : i3 + 1;
            }
            j10 = Math.max(j10, this.M[i3].s());
        }
        return j10;
    }

    public final boolean v() {
        return this.e0 != -9223372036854775807L;
    }

    public final void w() {
        d2.s0 a10;
        long j10 = this.x;
        if (this.i0 || this.P || !this.O || this.T == null) {
            return;
        }
        boolean z10 = false;
        for (c1 c1Var : this.M) {
            if (c1Var.y() == null) {
                return;
            }
        }
        g2.j jVar = this.F;
        synchronized (jVar) {
            jVar.b = false;
        }
        int length = this.M.length;
        int i3 = -1;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            char c2 = 1;
            if (i10 >= length) {
                break;
            }
            d2.v y9 = this.M[i10].y();
            y9.getClass();
            int h = d2.u0.h(y9.s);
            char c10 = h != 1 ? h != 2 ? h != 3 ? h != 4 ? (char) 0 : (char) 2 : (char) 1 : (char) 4 : (char) 3;
            if (i3 == 1) {
                c2 = 3;
            } else if (i3 == 2) {
                c2 = 4;
            } else if (i3 != 3) {
                c2 = i3 != 4 ? (char) 0 : (char) 2;
            }
            if (c10 > c2) {
                i11 = i10;
                i3 = h;
            }
            i10++;
        }
        d2.o1[] o1VarArr = new d2.o1[length];
        boolean[] zArr = new boolean[length];
        int i12 = 0;
        while (i12 < length) {
            d2.v y10 = this.M[i12].y();
            y10.getClass();
            String str = y10.s;
            boolean i13 = d2.u0.i(str);
            boolean z11 = (i13 || d2.u0.m(str)) ? true : z10;
            zArr[i12] = z11;
            boolean z12 = z10;
            this.Q |= z11;
            this.R = (j10 != -9223372036854775807L && length == 1 && d2.u0.k(str)) ? true : z12 ? 1 : 0;
            r3.b bVar = this.K;
            if (bVar != null) {
                int i14 = bVar.a;
                if (i13 || this.N[i12].b) {
                    d2.s0 s0Var = y10.l;
                    if (s0Var == null) {
                        d2.r0[] r0VarArr = new d2.r0[1];
                        r0VarArr[z12 ? 1 : 0] = bVar;
                        a10 = new d2.s0(r0VarArr);
                    } else {
                        d2.r0[] r0VarArr2 = new d2.r0[1];
                        r0VarArr2[z12 ? 1 : 0] = bVar;
                        a10 = s0Var.a(r0VarArr2);
                    }
                    d2.u a11 = y10.a();
                    a11.k = a10;
                    y10 = new d2.v(a11);
                }
                if (i13 && y10.h == -1 && y10.i == -1 && i14 != -1) {
                    d2.u a12 = y10.a();
                    a12.h = i14;
                    y10 = new d2.v(a12);
                }
            }
            int u10 = this.c.u(y10);
            d2.u a13 = y10.a();
            a13.S = u10;
            d2.v vVar = new d2.v(a13);
            if (i12 != i11) {
                d2.u a14 = vVar.a();
                a14.l = Integer.toString(i11);
                vVar = new d2.v(a14);
            }
            String num = Integer.toString(i12);
            d2.v[] vVarArr = new d2.v[1];
            vVarArr[z12 ? 1 : 0] = vVar;
            o1VarArr[i12] = new d2.o1(num, vVarArr);
            this.a0 = vVar.y | this.a0;
            this.M[i12].K(this.X);
            i12++;
            z10 = z12 ? 1 : 0;
        }
        r1 r1Var = new r1(o1VarArr);
        za.p pVar = new za.p();
        pVar.a = r1Var;
        pVar.b = zArr;
        int i15 = r1Var.a;
        pVar.c = new boolean[i15];
        pVar.d = new boolean[i15];
        this.S = pVar;
        if (this.R && this.U == -9223372036854775807L) {
            this.U = j10;
            this.T = new q0(this, this.T);
        }
        this.h.v(this.U, this.T, this.V);
        this.P = true;
        d0 d0Var = this.J;
        d0Var.getClass();
        d0Var.b(this);
    }

    public final void x(int i3) {
        m();
        za.p pVar = this.S;
        boolean[] zArr = (boolean[]) pVar.d;
        if (zArr[i3]) {
            return;
        }
        d2.v vVar = ((r1) pVar.a).a(i3).d[0];
        this.e.k(d2.u0.h(vVar.s), vVar, 0, null, this.d0);
        zArr[i3] = true;
    }

    public final void y(int i3) {
        m();
        if (this.f0) {
            if ((!this.Q || ((boolean[]) this.S.b)[i3]) && !this.M[i3].A(false)) {
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
                d0Var.k(this);
            }
        }
    }

    public final e3.i0 z(v0 v0Var) {
        int length = this.M.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (v0Var.equals(this.N[i3])) {
                return this.M[i3];
            }
        }
        if (this.O) {
            g2.a.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.a + ") after finishing tracks.");
            return new e3.n();
        }
        p2.m mVar = this.c;
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
}
