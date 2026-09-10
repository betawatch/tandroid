package u2;

import android.net.Uri;
import android.os.Handler;
import j$.util.DesugarCollections;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import m.e3;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class w0 implements e0, c3.q, y2.i, y2.l, b1 {
    public static final Map g0;
    public static final b2.s h0;
    public final e2.g E;
    public final r0 F;
    public final r0 G;
    public final Handler H;
    public d0 I;
    public p3.b J;
    public c1[] K;
    public v0[] L;
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
    public final n2.n c;
    public boolean c0;
    public final rb.a d;
    public int d0;
    public final a5.a e;
    public boolean e0;
    public final n2.j f;
    public boolean f0;
    public final y0 h;
    public final y2.d n;
    public final String r;
    public final long s;
    public final b2.s v;
    public final long w;
    public final y2.n x;
    public final e3 y;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        g0 = DesugarCollections.unmodifiableMap(hashMap);
        b2.r rVar = new b2.r();
        rVar.a = "icy";
        rVar.q = b2.r0.n("application/x-icy");
        h0 = new b2.s(rVar);
    }

    public w0(Uri uri, g2.h hVar, e3 e3Var, n2.n nVar, n2.j jVar, rb.a aVar, a5.a aVar2, y0 y0Var, y2.d dVar, String str, int i10, b2.s sVar, long j3, z2.a aVar3) {
        this.a = uri;
        this.b = hVar;
        this.c = nVar;
        this.f = jVar;
        this.d = aVar;
        this.e = aVar2;
        this.h = y0Var;
        this.n = dVar;
        this.r = str;
        this.s = i10;
        this.v = sVar;
        this.x = aVar3 != null ? new y2.n(aVar3) : new y2.n("ProgressiveMediaPeriod");
        this.y = e3Var;
        this.w = j3;
        this.E = new e2.g();
        this.F = new r0(this, 1);
        this.G = new r0(this, 2);
        this.H = e2.d0.o(null);
        this.L = new v0[0];
        this.K = new c1[0];
        this.b0 = -9223372036854775807L;
        this.U = 1;
    }

    public final void A(c3.b0 b0Var) {
        this.R = this.J == null ? b0Var : new c3.t(-9223372036854775807L);
        this.S = b0Var.l();
        boolean z10 = !this.Z && b0Var.l() == -9223372036854775807L;
        this.T = z10;
        this.U = z10 ? 7 : 1;
        if (this.N) {
            this.h.v(this.S, b0Var, z10);
        } else {
            w();
        }
    }

    @Override // c3.q
    public final void B() {
        this.M = true;
        this.H.post(this.F);
    }

    @Override // y2.i
    public final void C(y2.k kVar, long j3, long j10, boolean z10) {
        t0 t0Var = (t0) kVar;
        Uri uri = t0Var.b.c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.m(uVar, 1, -1, null, 0, null, t0Var.r, this.S);
        if (z10) {
            return;
        }
        for (c1 c1Var : this.K) {
            c1Var.D(false);
        }
        if (this.Y > 0) {
            d0 d0Var = this.I;
            d0Var.getClass();
            d0Var.g(this);
        }
    }

    public final void D() {
        t0 t0Var = new t0(this, this.a, this.b, this.y, this, this.E);
        if (this.N) {
            e2.d.g(v());
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
            t0Var.f.a = j10;
            t0Var.r = j11;
            t0Var.n = true;
            t0Var.w = false;
            for (c1 c1Var : this.K) {
                c1Var.t = this.b0;
            }
            this.b0 = -9223372036854775807L;
        }
        this.d0 = g();
        this.x.f(t0Var, this, this.d.o3(this.U));
    }

    public final boolean E() {
        return this.W || v();
    }

    @Override // c3.q
    public final void G(c3.b0 b0Var) {
        this.H.post(new k0(1, this, b0Var));
    }

    @Override // c3.q
    public final c3.h0 I(int i10, int i11) {
        return z(new v0(i10, false));
    }

    @Override // u2.b1
    public final void a() {
        this.H.post(this.F);
    }

    @Override // y2.l
    public final void b() {
        for (c1 c1Var : this.K) {
            c1Var.D(true);
            n2.g gVar = c1Var.h;
            if (gVar != null) {
                gVar.a(c1Var.e);
                c1Var.h = null;
                c1Var.g = null;
            }
        }
        e3 e3Var = this.y;
        c3.o oVar = (c3.o) e3Var.c;
        if (oVar != null) {
            oVar.release();
            e3Var.c = null;
        }
        e3Var.d = null;
    }

    @Override // u2.f1
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

    @Override // u2.f1
    public final long d() {
        return r();
    }

    public final void e() {
        e2.d.g(this.N);
        this.Q.getClass();
        this.R.getClass();
    }

    @Override // u2.e0
    public final void f() {
        int o32 = this.d.o3(this.U);
        y2.n nVar = this.x;
        IOException iOException = nVar.c;
        if (iOException != null) {
            throw iOException;
        }
        y2.j jVar = nVar.b;
        if (jVar != null) {
            if (o32 == Integer.MIN_VALUE) {
                o32 = jVar.a;
            }
            IOException iOException2 = jVar.e;
            if (iOException2 != null && jVar.f > o32) {
                throw iOException2;
            }
        }
        if (this.e0 && !this.N) {
            throw b2.s0.a(null, "Loading finished before preparation is complete.");
        }
    }

    public final int g() {
        int i10 = 0;
        for (c1 c1Var : this.K) {
            i10 += c1Var.q + c1Var.p;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r4 != false) goto L49;
     */
    @Override // u2.e0
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
        if (v()) {
            this.b0 = j3;
            return j3;
        }
        int i10 = this.U;
        y2.n nVar = this.x;
        if (i10 != 7 && (this.e0 || nVar.d())) {
            int length = this.K.length;
            for (int i11 = 0; i11 < length; i11++) {
                c1 c1Var = this.K[i11];
                if (c1Var.t() != 0 || !z11) {
                    if (!(this.P ? c1Var.F(c1Var.q) : c1Var.G(j3, this.e0)) && (zArr[i11] || !this.O)) {
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
        if (nVar.d()) {
            for (c1 c1Var2 : this.K) {
                c1Var2.k();
            }
            nVar.b();
            return j3;
        }
        nVar.c = null;
        for (c1 c1Var3 : this.K) {
            c1Var3.D(false);
        }
        return j3;
    }

    @Override // u2.e0
    public final void i(long j3) {
        if (this.P) {
            return;
        }
        e();
        if (v()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.Q.d;
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.K[i10].j(j3, zArr[i10]);
        }
    }

    @Override // u2.e0
    public final void j(d0 d0Var, long j3) {
        this.I = d0Var;
        b2.s sVar = this.v;
        if (sVar == null) {
            this.E.e();
            D();
        } else {
            I(0, 3).b(sVar);
            A(new c3.y(-9223372036854775807L, new long[]{0}, new long[]{0}));
            B();
            this.b0 = j3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    @Override // y2.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k4.d k(y2.k kVar, long j3, long j10, IOException iOException, int i10) {
        long j11;
        k4.d dVar;
        c3.b0 b0Var;
        t0 t0Var = (t0) kVar;
        Uri uri = t0Var.b.c;
        u uVar = new u(j10);
        String str = e2.d0.a;
        this.d.getClass();
        if (!(iOException instanceof b2.s0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof g2.u) && !(iOException instanceof y2.m)) {
            int i11 = g2.j.b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof g2.j) || ((g2.j) th2).a != 2008) {
                }
            }
            j11 = Math.min((i10 - 1) * MediaDataController.MAX_STYLE_RUNS_COUNT, 5000);
            if (j11 != -9223372036854775807L) {
                dVar = y2.n.f;
            } else {
                int g10 = g();
                int i12 = g10 > this.d0 ? 1 : 0;
                if (this.Z || !((b0Var = this.R) == null || b0Var.l() == -9223372036854775807L)) {
                    this.d0 = g10;
                } else if (!this.N || E()) {
                    this.W = this.N;
                    this.a0 = 0L;
                    this.d0 = 0;
                    for (c1 c1Var : this.K) {
                        c1Var.D(false);
                    }
                    t0Var.f.a = 0L;
                    t0Var.r = 0L;
                    t0Var.n = true;
                    t0Var.w = false;
                } else {
                    this.c0 = true;
                    dVar = y2.n.e;
                }
                dVar = new k4.d(i12, j11, false);
            }
            k4.d dVar2 = dVar;
            this.e.p(uVar, 1, -1, null, 0, null, t0Var.r, this.S, iOException, !dVar2.a());
            return dVar2;
        }
        j11 = -9223372036854775807L;
        if (j11 != -9223372036854775807L) {
        }
        k4.d dVar22 = dVar;
        this.e.p(uVar, 1, -1, null, 0, null, t0Var.r, this.S, iOException, !dVar22.a());
        return dVar22;
    }

    @Override // y2.i
    public final void l(y2.k kVar, long j3, long j10, int i10) {
        u uVar;
        t0 t0Var = (t0) kVar;
        g2.b0 b0Var = t0Var.b;
        if (i10 == 0) {
            uVar = new u(t0Var.s);
        } else {
            Uri uri = b0Var.c;
            uVar = new u(j10);
        }
        this.e.r(uVar, 1, -1, null, 0, null, t0Var.r, this.S, i10);
    }

    @Override // u2.e0
    public final long m() {
        if (this.X) {
            this.X = false;
            return this.a0;
        }
        if (!this.W) {
            return -9223372036854775807L;
        }
        if (!this.e0 && g() <= this.d0) {
            return -9223372036854775807L;
        }
        this.W = false;
        return this.a0;
    }

    @Override // u2.f1
    public final boolean n(i2.q0 q0Var) {
        if (this.e0) {
            return false;
        }
        y2.n nVar = this.x;
        if (nVar.c() || this.c0) {
            return false;
        }
        if ((this.N || this.v != null) && this.Y == 0) {
            return false;
        }
        boolean e = this.E.e();
        if (nVar.d()) {
            return e;
        }
        D();
        return true;
    }

    @Override // u2.e0
    public final long o(x2.r[] rVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j3) {
        x2.r rVar;
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        q1 q1Var = (q1) sVar.b;
        boolean[] zArr3 = (boolean[]) sVar.d;
        int i10 = this.Y;
        int i11 = 0;
        for (int i12 = 0; i12 < rVarArr.length; i12++) {
            d1 d1Var = d1VarArr[i12];
            if (d1Var != null && (rVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((u0) d1Var).a;
                e2.d.g(zArr3[i13]);
                this.Y--;
                zArr3[i13] = false;
                d1VarArr[i12] = null;
            }
        }
        boolean z10 = !this.V ? j3 == 0 || this.P : i10 != 0;
        for (int i14 = 0; i14 < rVarArr.length; i14++) {
            if (d1VarArr[i14] == null && (rVar = rVarArr[i14]) != null) {
                e2.d.g(rVar.length() == 1);
                e2.d.g(rVar.h(0) == 0);
                int b10 = q1Var.b(rVar.b());
                e2.d.g(!zArr3[b10]);
                this.Y++;
                zArr3[b10] = true;
                this.X = rVar.m().x | this.X;
                d1VarArr[i14] = new u0(this, b10);
                zArr2[i14] = true;
                if (!z10) {
                    c1 c1Var = this.K[b10];
                    z10 = (c1Var.t() == 0 || c1Var.G(j3, true)) ? false : true;
                }
            }
        }
        if (this.Y == 0) {
            this.c0 = false;
            this.W = false;
            this.X = false;
            y2.n nVar = this.x;
            if (nVar.d()) {
                c1[] c1VarArr = this.K;
                int length = c1VarArr.length;
                while (i11 < length) {
                    c1VarArr[i11].k();
                    i11++;
                }
                nVar.b();
            } else {
                this.e0 = false;
                for (c1 c1Var2 : this.K) {
                    c1Var2.D(false);
                }
            }
        } else if (z10) {
            j3 = h(j3);
            while (i11 < d1VarArr.length) {
                if (d1VarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.V = true;
        return j3;
    }

    @Override // y2.i
    public final void p(y2.k kVar, long j3, long j10) {
        t0 t0Var = (t0) kVar;
        if (this.S == -9223372036854775807L && this.R != null) {
            long t10 = t(true);
            long j11 = t10 == Long.MIN_VALUE ? 0L : t10 + 10000;
            this.S = j11;
            this.h.v(j11, this.R, this.T);
        }
        Uri uri = t0Var.b.c;
        u uVar = new u(j10);
        this.d.getClass();
        this.e.o(uVar, 1, -1, null, 0, null, t0Var.r, this.S);
        this.e0 = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.g(this);
    }

    @Override // u2.e0
    public final q1 q() {
        e();
        return (q1) this.Q.b;
    }

    @Override // u2.f1
    public final long r() {
        long j3;
        boolean z10;
        e();
        if (this.e0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (v()) {
            return this.b0;
        }
        if (this.O) {
            int length = this.K.length;
            j3 = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                com.google.firebase.messaging.s sVar = this.Q;
                if (((boolean[]) sVar.c)[i10] && ((boolean[]) sVar.d)[i10]) {
                    c1 c1Var = this.K[i10];
                    synchronized (c1Var) {
                        z10 = c1Var.w;
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
            j3 = t(false);
        }
        return j3 == Long.MIN_VALUE ? this.a0 : j3;
    }

    @Override // u2.e0
    public final long s(long j3, i2.o1 o1Var) {
        e();
        if (!this.R.f()) {
            return 0L;
        }
        c3.a0 j10 = this.R.j(j3);
        return o1Var.a(j3, j10.a.a, j10.b.a);
    }

    public final long t(boolean z10) {
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

    public final boolean v() {
        return this.b0 != -9223372036854775807L;
    }

    public final void w() {
        long j3 = this.w;
        if (this.f0 || this.N || !this.M || this.R == null) {
            return;
        }
        for (c1 c1Var : this.K) {
            if (c1Var.w() == null) {
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
            int L0 = this.c.L0(w10);
            b2.r a11 = w10.a();
            a11.R = L0;
            b2.s sVar = new b2.s(a11);
            l1VarArr[i10] = new b2.l1(Integer.toString(i10), sVar);
            this.X = sVar.x | this.X;
        }
        this.Q = new com.google.firebase.messaging.s(new q1(l1VarArr), zArr);
        if (this.P && this.S == -9223372036854775807L) {
            this.S = j3;
            this.R = new s0(this, this.R);
        }
        this.h.v(this.S, this.R, this.T);
        this.N = true;
        d0 d0Var = this.I;
        d0Var.getClass();
        d0Var.b(this);
    }

    public final void x(int i10) {
        e();
        com.google.firebase.messaging.s sVar = this.Q;
        boolean[] zArr = (boolean[]) sVar.e;
        if (zArr[i10]) {
            return;
        }
        b2.s sVar2 = ((q1) sVar.b).a(i10).d[0];
        this.e.i(b2.r0.h(sVar2.r), sVar2, 0, null, this.a0);
        zArr[i10] = true;
    }

    public final void y(int i10) {
        e();
        if (this.c0) {
            if ((!this.O || ((boolean[]) this.Q.c)[i10]) && !this.K[i10].x(false)) {
                this.b0 = 0L;
                this.c0 = false;
                this.W = true;
                this.a0 = 0L;
                this.d0 = 0;
                for (c1 c1Var : this.K) {
                    c1Var.D(false);
                }
                d0 d0Var = this.I;
                d0Var.getClass();
                d0Var.g(this);
            }
        }
    }

    public final c3.h0 z(v0 v0Var) {
        int length = this.K.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (v0Var.equals(this.L[i10])) {
                return this.K[i10];
            }
        }
        if (this.M) {
            e2.a.n("ProgressiveMediaPeriod", "Extractor added new track (id=" + v0Var.a + ") after finishing tracks.");
            return new c3.n();
        }
        n2.n nVar = this.c;
        nVar.getClass();
        c1 c1Var = new c1(this.n, nVar, this.f);
        c1Var.f = this;
        int i11 = length + 1;
        v0[] v0VarArr = (v0[]) Arrays.copyOf(this.L, i11);
        v0VarArr[length] = v0Var;
        String str = e2.d0.a;
        this.L = v0VarArr;
        c1[] c1VarArr = (c1[]) Arrays.copyOf(this.K, i11);
        c1VarArr[length] = c1Var;
        this.K = c1VarArr;
        return c1Var;
    }

    @Override // u2.f1
    public final void u(long j3) {
    }
}
