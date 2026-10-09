package u2;

import android.net.Uri;
import android.os.Handler;
import i2.q1;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u0 implements d0, c3.q, y2.g, y2.j, z0 {
    public static final Map g0;
    public static final b2.s h0;
    public final e2.g E;
    public final o0 F;
    public final o0 G;
    public final Handler H;
    public c0 I;
    public p3.b J;
    public a1[] K;
    public t0[] L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public com.google.firebase.messaging.s Q;
    public c3.b0 R;
    public long S;
    public boolean T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public boolean Z;
    public final Uri a;
    public long a0;
    public final g2.h b;
    public long b0;
    public final n2.m c;
    public boolean c0;
    public final rb.a d;
    public int d0;
    public final a5.a e;
    public boolean e0;
    public final n2.j f;
    public boolean f0;
    public final w0 h;
    public final y2.d n;
    public final String r;
    public final long s;
    public final b2.s v;
    public final long w;
    public final y2.l x;
    public final la.h y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.a = "icy";
        rVar.q = b2.r0.n("application/x-icy");
        h0 = new b2.s(rVar);
    }

    public u0(Uri uri, g2.h hVar, la.h hVar2, n2.m mVar, n2.j jVar, rb.a aVar, a5.a aVar2, w0 w0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar3) {
        this.a = uri;
        this.b = hVar;
        this.c = mVar;
        this.f = jVar;
        this.d = aVar;
        this.e = aVar2;
        this.h = w0Var;
        this.n = dVar;
        this.r = str;
        this.s = i10;
        this.v = sVar;
        this.x = aVar3 != null ? new y2.l(aVar3) : new y2.l("ProgressiveMediaPeriod");
        this.y = hVar2;
        this.w = j3;
        this.E = new e2.g();
        this.F = new o0(this, 1);
        this.G = new o0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new t0[0];
        this.K = new a1[0];
        this.b0 = -9223372036854775807L;
        this.U = 1;
    }

    public final boolean A() {
        return this.W || m();
    }

    @Override // y2.g
    public final void C(y2.i iVar, long j3, long j10, int i10) {
        t tVar;
        r0 r0Var = (r0) iVar;
        g2.b0 b0Var = r0Var.b;
        if (i10 == 0) {
            tVar = new t(r0Var.s);
        } else {
            Uri uri = b0Var.c;
            tVar = new t(j10);
        }
        this.e.u(tVar, 1, -1, null, 0, null, r0Var.r, this.S, i10);
    }

    @Override // y2.g
    public final void F(y2.i iVar, long j3, long j10) {
        r0 r0Var = (r0) iVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long j11 = j(true);
            long j12 = j11 == Long.MIN_VALUE ? 0L : j11 + 10000;
            this.S = j12;
            this.h.v(j12, this.R, this.T);
        }
        Uri uri = r0Var.b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.q(tVar, 1, -1, null, 0, null, r0Var.r, this.S);
        this.e0 = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.D(this);
    }

    @Override // y2.g
    public final void O0(y2.i iVar, long j3, long j10, boolean z10) {
        r0 r0Var = (r0) iVar;
        Uri uri = r0Var.b.c;
        t tVar = new t(j10);
        this.d.getClass();
        this.e.p(tVar, 1, -1, null, 0, null, r0Var.r, this.S);
        if (z10) {
            return;
        }
        for (a1 a1Var : this.K) {
            a1Var.D(false);
        }
        if (this.Y > 0) {
            c0 c0Var = this.I;
            c0Var.getClass();
            c0Var.D(this);
        }
    }

    @Override // u2.z0
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.j
    public final void b() {
        for (a1 a1Var : this.K) {
            a1Var.D(true);
            n2.g gVar = a1Var.h;
            if (gVar != null) {
                gVar.a(a1Var.e);
                a1Var.h = null;
                a1Var.g = null;
            }
        }
        la.h hVar = this.y;
        c3.o oVar = (c3.o) hVar.c;
        if (oVar != null) {
            oVar.release();
            hVar.c = null;
        }
        hVar.d = null;
    }

    @Override // u2.d1
    public final boolean c() {
        boolean z10;
        if (!this.x.d()) {
            return false;
        }
        e2.g gVar = this.E;
        synchronized (gVar) {
            z10 = gVar.b;
        }
        return z10;
    }

    @Override // u2.d1
    public final long d() {
        return q();
    }

    @Override // c3.q
    public final void d2(c3.b0 b0Var) {
        this.H.post(new p0(0, this, b0Var));
    }

    public final void e() {
        e2.d.g(this.N);
        this.Q.getClass();
        this.R.getClass();
    }

    public final int f() {
        int i10 = 0;
        for (a1 a1Var : this.K) {
            i10 += a1Var.q + a1Var.p;
        }
        return i10;
    }

    @Override // c3.q
    public final c3.h0 f2(int i10, int i11) {
        return w(new t0(i10, false));
    }

    @Override // u2.d0
    public final void g() {
        int m32 = this.d.m3(this.U);
        y2.l lVar = this.x;
        IOException iOException = lVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.h hVar = lVar.b;
        if (hVar != null) {
            if (m32 == Integer.MIN_VALUE) {
                m32 = hVar.a;
            }
            IOException iOException2 = hVar.e;
            if (iOException2 != null && hVar.f > m32) {
                throw iOException2;
            }
        }
        if (this.e0 && !this.N) {
            throw b2.s0.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r3 != false) goto L49;
     */
    @Override // u2.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long h(long j3) {
        e();
        boolean[] zArr = (boolean[]) this.Q.c;
        if (!this.R.f()) {
            j3 = 0;
        }
        this.W = false;
        boolean z10 = true;
        boolean z11 = this.a0 == j3;
        this.a0 = j3;
        if (m()) {
            this.b0 = j3;
            return j3;
        }
        int i10 = this.U;
        y2.l lVar = this.x;
        if (i10 != 7 && (this.e0 || lVar.d())) {
            int length = this.K.length;
            for (int i11 = 0; i11 < length; i11++) {
                a1 a1Var = this.K[i11];
                if (a1Var.t() != 0 || !z11) {
                    if (!(this.P ? a1Var.F(a1Var.q) : a1Var.G(j3, this.e0)) && (zArr[i11] || !this.O)) {
                        z10 = false;
                        break;
                    }
                }
            }
        }
        this.c0 = false;
        this.b0 = j3;
        this.e0 = false;
        this.X = false;
        if (lVar.d()) {
            for (a1 a1Var2 : this.K) {
                a1Var2.k();
            }
            lVar.b();
            return j3;
        }
        lVar.c = null;
        for (a1 a1Var3 : this.K) {
            a1Var3.D(false);
        }
        return j3;
    }

    @Override // u2.d0
    public final void i(long j3) {
        if (this.P) {
            return;
        }
        e();
        if (m()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.Q.d;
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.K[i10].j(j3, zArr[i10]);
        }
    }

    public final long j(boolean z10) {
        int i10;
        long j3 = Long.MIN_VALUE;
        while (i10 < this.K.length) {
            if (!z10) {
                com.google.firebase.messaging.s sVar = this.Q;
                sVar.getClass();
                i10 = ((boolean[]) sVar.d)[i10] ? 0 : i10 + 1;
            }
            j3 = Math.max(j3, this.K[i10].q());
        }
        return j3;
    }

    @Override // u2.d0
    public final void k(c0 c0Var, long j3) {
        this.I = c0Var;
        b2.s sVar = this.v;
        if (sVar == null) {
            this.E.e();
            z();
        } else {
            f2(0, 3).b(sVar);
            x(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            k1();
            this.b0 = j3;
        }
    }

    @Override // c3.q
    public final void k1() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override // u2.d0
    public final long l() {
        if (this.X) {
            this.X = false;
            return this.a0;
        }
        if (!this.W) {
            return -9223372036854775807L;
        }
        if (!this.e0 && f() <= this.d0) {
            return -9223372036854775807L;
        }
        this.W = false;
        return this.a0;
    }

    public final boolean m() {
        return this.b0 != -9223372036854775807L;
    }

    @Override // u2.d1
    public final boolean n(i2.s0 s0Var) {
        if (this.e0) {
            return false;
        }
        y2.l lVar = this.x;
        if (lVar.c() || this.c0) {
            return false;
        }
        if ((this.N || this.v != null) && this.Y == 0) {
            return false;
        }
        boolean e7 = this.E.e();
        if (lVar.d()) {
            return e7;
        }
        z();
        return true;
    }

    @Override // u2.d0
    public final long o(x2.r[] rVarArr, boolean[] zArr, b1[] b1VarArr, boolean[] zArr2, long j3) {
        x2.r rVar;
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        o1 o1Var = (o1) sVar.b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            b1 b1Var = b1VarArr[i12];
            if (b1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((s0) b1Var).a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                b1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.V ? j3 == 0 || this.P : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (b1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                e2.d.g(rVar.length() == 1);
                e2.d.g(rVar.h(0) == 0);
                int b10 = o1Var.b(rVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = rVar.m().x | this.X;
                b1VarArr[i14] = new s0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    a1 a1Var = this.K[b10];
                    z10 = (a1Var.t() == 0 || a1Var.G(j3, true)) ? false : true;
                }
            }
        }
        if (this.Y == 0) {
            this.c0 = false;
            this.W = false;
            this.X = false;
            y2.l lVar = this.x;
            if (lVar.d()) {
                a1[] a1VarArr = this.K;
                int length = a1VarArr.length;
                while (i11 < length) {
                    a1VarArr[i11].k();
                    i11++;
                }
                lVar.b();
            } else {
                this.e0 = false;
                for (a1 a1Var2 : this.K) {
                    a1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
            while (i11 < b1VarArr.length) {
                if (b1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override // u2.d0
    public final o1 p() {
        e();
        return (o1) this.Q.b;
    }

    @Override // u2.d1
    public final long q() {
        long j3;
        boolean z10;
        e();
        if (this.e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.Q;
                if (((boolean[]) sVar.c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    a1 a1Var = this.K[i10];
                    synchronized (a1Var) {
                        z10 = a1Var.w;
                    }
                    if (!z10) {
                        j3 = Math.min(j3, this.K[i10].q());
                    }
                }
            }
        } else {
            j3 = Long.MAX_VALUE;
        }
        if (j3 == Long.MAX_VALUE) {
            j3 = j(false);
        }
        return j3 == Long.MIN_VALUE ? this.a0 : j3;
    }

    @Override // u2.d0
    public final long r(long j3, q1 q1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return q1Var.a(j3, j10.a.a, j10.b.a);
    }

    public final void t() {
        long j3 = this.w;
        if (this.f0 || this.N || !this.M || this.R == null) {
            return;
        }
        for (a1 a1Var : this.K) {
            if (a1Var.w() == null) {
                return;
            }
        }
        e2.g gVar = this.E;
        synchronized (gVar) {
            gVar.b = false;
        }
        int length = this.K.length;
        b2.l1[] l1VarArr = new b2.l1[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            b2.s w10 = this.K[i10].w();
            w10.getClass();
            String str = w10.r;
            boolean i11 = b2.r0.i(str);
            boolean z10 = i11 || b2.r0.m(str);
            zArr[i10] = z10;
            this.O = z10 | this.O;
            this.P = j3 != -9223372036854775807L && length == 1 && b2.r0.k(str);
            p3.b bVar = this.J;
            if (bVar != null) {
                int i12 = bVar.a;
                if (i11 || this.L[i10].b) {
                    b2.p0 p0Var = w10.l;
                    b2.p0 p0Var2 = p0Var == null ? new b2.p0(bVar) : p0Var.a(bVar);
                    b2.r a2 = w10.a();
                    a2.k = p0Var2;
                    w10 = new b2.s(a2);
                }
                if (i11 && w10.h == -1 && w10.i == -1 && i12 != -1) {
                    b2.r a10 = w10.a();
                    a10.h = i12;
                    w10 = new b2.s(a10);
                }
            }
            int Q0 = this.c.Q0(w10);
            b2.r a11 = w10.a();
            a11.R = Q0;
            b2.s sVar = new b2.s(a11);
            l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
            this.X = sVar.x | this.X;
        }
        this.Q = new com.google.firebase.messaging.s(new o1(l1VarArr), zArr);
        if (this.P && this.S == -9223372036854775807L) {
            this.S = j3;
            this.R = new q0(this, this.R);
        }
        this.h.v(this.S, this.R, this.T);
        this.N = true;
        c0 c0Var = this.I;
        c0Var.getClass();
        c0Var.m(this);
    }

    public final void u(int i10) {
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        boolean[] zArr = (boolean[]) sVar.e;
        if (zArr[i10]) {
            return;
        }
        b2.s sVar2 = ((o1) sVar.b).a(i10).d[0];
        this.e.l(b2.r0.h(sVar2.r), sVar2, 0, null, this.a0);
        zArr[i10] = true;
    }

    public final void v(int i10) {
        e();
        if (this.c0) {
            if ((!this.O || ((boolean[]) this.Q.c)[i10]) && !this.K[i10].x(false)) {
                this.b0 = 0L;
                this.c0 = false;
                this.W = true;
                this.a0 = 0L;
                this.d0 = 0;
                for (a1 a1Var : this.K) {
                    a1Var.D(false);
                }
                c0 c0Var = this.I;
                c0Var.getClass();
                c0Var.D(this);
            }
        }
    }

    public final c3.h0 w(t0 t0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (t0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + t0Var.a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.m mVar = this.c;
        mVar.getClass();
        a1 a1Var = new a1(this.n, mVar, this.f);
        a1Var.f = this;
        int i11 = length + 1;
        t0[] t0VarArr = (t0[]) Arrays.copyOf(this.L, i11);
        t0VarArr[length] = t0Var;
        String str = e2.d0.a;
        this.L = t0VarArr;
        a1[] a1VarArr = (a1[]) Arrays.copyOf(this.K, i11);
        a1VarArr[length] = a1Var;
        this.K = a1VarArr;
        return a1Var;
    }

    public final void x(c3.b0 b0Var) {
        this.R = this.J == null ? b0Var : new c3.t(-9223372036854775807L);
        this.S = b0Var.l();
        boolean z10 = !this.Z && b0Var.l() == -9223372036854775807L;
        this.T = z10;
        this.U = z10 ? 7 : 1;
        if (this.N) {
            this.h.v(this.S, b0Var, z10);
        } else {
            t();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // y2.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d y(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        k4.d dVar;
        c3.b0 b0Var;
        r0 r0Var = (r0) iVar;
        Uri uri = r0Var.b.c;
        t tVar = new t(j10);
        String str = e2.d0.a;
        this.d.getClass();
        if (!(iOException instanceof b2.s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.k)) {
            int i11 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j11 != -9223372036854775807L) {
                dVar = y2.l.f;
            } else {
                int f7 = f();
                int i12 = f7 > this.d0 ? 1 : 0;
                if (this.Z || !((b0Var = this.R) == null || b0Var.l() == -9223372036854775807L)) {
                    this.d0 = f7;
                } else if (!this.N || A()) {
                    this.W = this.N;
                    this.a0 = 0L;
                    this.d0 = 0;
                    for (a1 a1Var : this.K) {
                        a1Var.D(false);
                    }
                    r0Var.f.a = 0L;
                    r0Var.r = 0L;
                    r0Var.n = true;
                    r0Var.w = false;
                } else {
                    this.c0 = true;
                    dVar = y2.l.e;
                }
                dVar = new k4.d(i12, j11, false);
            }
            k4.d dVar2 = dVar;
            this.e.r(tVar, 1, -1, null, 0, null, r0Var.r, this.S, iOException, !dVar2.a());
            return dVar2;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        k4.d dVar22 = dVar;
        this.e.r(tVar, 1, -1, null, 0, null, r0Var.r, this.S, iOException, !dVar22.a());
        return dVar22;
    }

    public final void z() {
        r0 r0Var = new r0(this, this.a, this.b, this.y, this, this.E);
        if (this.N) {
            e2.d.g(m());
            long j3 = this.S;
            if (j3 != -9223372036854775807L && this.b0 > j3) {
                this.e0 = true;
                this.b0 = -9223372036854775807L;
                return;
            }
            c3.b0 b0Var = this.R;
            b0Var.getClass();
            long j10 = b0Var.j(this.b0).a.b;
            long j11 = this.b0;
            r0Var.f.a = j10;
            r0Var.r = j11;
            r0Var.n = true;
            r0Var.w = false;
            for (a1 a1Var : this.K) {
                a1Var.t = this.b0;
            }
            this.b0 = -9223372036854775807L;
        }
        this.d0 = f();
        this.x.f(r0Var, this, this.d.m3(this.U));
    }

    @Override // u2.d1
    public final void s(long j3) {
    }
}
