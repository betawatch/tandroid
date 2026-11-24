// default package

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r74 implements Handler.Callback, st6, vcc {
    public static final long x0 = hac.i0(10000);
    public final ArrayList E;
    public final bfb F;
    public final y64 G;
    public final wt6 H;
    public final e07 I;
    public final vc3 J;
    public final short K;
    public final we8 L;
    public final boolean M;
    public final xa3 N;
    public final dfb O;
    public final boolean P;
    public final c10 Q;
    public boolean R;
    public jx9 S;
    public ot9 T;
    public boolean U;
    public boolean V;
    public q74 W;
    public int X;
    public be8 Y;
    public o74 Z;
    public final g99[] a;
    public boolean a0;
    public final uh0[] b;
    public boolean b0;
    public final boolean[] c;
    public boolean c0;
    public final fe3 d;
    public boolean d0;
    public final e0c e;
    public long e0;
    public final xc3 f;
    public boolean f0;
    public int g0;
    public final dfb h;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public q74 m0;
    public final jif n;
    public long n0;
    public long o0;
    public int p0;
    public boolean q0;
    public final Looper r;
    public u64 r0;
    public final aqb s;
    public long s0;
    public w64 t0;
    public long u0;
    public boolean v0;
    public final ypb w;
    public float w0;
    public final long x;
    public final yc3 y;

    /* JADX WARN: Type inference failed for: r9v5, types: [int, short] */
    public r74(Context context, uh0[] uh0VarArr, uh0[] uh0VarArr2, fe3 fe3Var, e0c e0cVar, xc3 xc3Var, eb3 eb3Var, int i, boolean z, xa3 xa3Var, jx9 jx9Var, vc3 vc3Var, long j, boolean z2, Looper looper, bfb bfbVar, y64 y64Var, we8 we8Var, final vcc vccVar, boolean z3) {
        w64 w64Var = w64.a;
        this.u0 = -9223372036854775807L;
        this.G = y64Var;
        this.d = fe3Var;
        this.e = e0cVar;
        this.f = xc3Var;
        this.g0 = i;
        this.h0 = z;
        this.S = jx9Var;
        this.J = vc3Var;
        this.K = (int) j;
        this.b0 = false;
        this.M = z2;
        this.F = bfbVar;
        this.L = we8Var;
        this.t0 = w64Var;
        this.N = xa3Var;
        this.w0 = 1.0f;
        this.T = ot9.b;
        this.R = z3;
        this.s0 = -9223372036854775807L;
        this.e0 = -9223372036854775807L;
        this.x = xc3Var.m;
        xpb xpbVar = bqb.a;
        be8 k = be8.k(e0cVar);
        this.Y = k;
        this.Z = new o74(k);
        this.b = new uh0[uh0VarArr.length];
        this.c = new boolean[uh0VarArr.length];
        fe3Var.getClass();
        this.a = new g99[uh0VarArr.length];
        boolean z4 = false;
        for (int i2 = 0; i2 < uh0VarArr.length; i2++) {
            uh0 uh0Var = uh0VarArr[i2];
            uh0Var.e = i2;
            uh0Var.f = we8Var;
            uh0Var.h = bfbVar;
            this.b[i2] = uh0Var;
            uh0 uh0Var2 = this.b[i2];
            synchronized (uh0Var2.a) {
                uh0Var2.J = fe3Var;
            }
            uh0 uh0Var3 = uh0VarArr2[i2];
            if (uh0Var3 != null) {
                uh0Var3.e = i2;
                uh0Var3.f = we8Var;
                uh0Var3.h = bfbVar;
                z4 = true;
            }
            this.a[i2] = new g99(uh0VarArr[i2], uh0Var3, i2);
        }
        this.P = z4;
        this.y = new yc3(this, bfbVar);
        this.E = new ArrayList();
        this.s = new aqb();
        this.w = new ypb();
        jte.p(fe3Var.a == null);
        fe3Var.a = this;
        fe3Var.b = eb3Var;
        fe3Var.g = fe3Var.f;
        this.q0 = true;
        dfb a = bfbVar.a(looper, null);
        this.O = a;
        this.H = new wt6(xa3Var, a, new yu3(this, (byte) 15), uh0VarArr.length);
        this.I = new e07(this, xa3Var, a, we8Var, eb3Var);
        jif jifVar = new jif((byte) 2);
        this.n = jifVar;
        Looper p = jifVar.p();
        this.r = p;
        dfb a2 = bfbVar.a(p, this);
        this.h = a2;
        this.Q = new c10(context, p, this);
        a2.c(35, new vcc() { // from class: j74
            @Override // vcc
            public final void c(long j2, long j3, go4 go4Var, MediaFormat mediaFormat) {
                vccVar.c(j2, j3, go4Var, mediaFormat);
                r74.this.c(j2, j3, go4Var, mediaFormat);
            }
        }).b();
        a2.c(39, new k74(this)).b();
    }

    public static Pair S(bqb bqbVar, q74 q74Var, boolean z, int i, boolean z2, aqb aqbVar, ypb ypbVar) {
        int T;
        bqb bqbVar2 = q74Var.a;
        if (bqbVar.p()) {
            return null;
        }
        bqb bqbVar3 = bqbVar2.p() ? bqbVar : bqbVar2;
        try {
            Pair i2 = bqbVar3.i(aqbVar, ypbVar, q74Var.b, q74Var.c);
            if (!bqbVar.equals(bqbVar3)) {
                if (bqbVar.b(i2.first) == -1) {
                    if (!z || (T = T(aqbVar, ypbVar, i, z2, i2.first, bqbVar3, bqbVar)) == -1) {
                        return null;
                    }
                    return bqbVar.i(aqbVar, ypbVar, T, -9223372036854775807L);
                }
                if (bqbVar3.g(i2.first, ypbVar).f && bqbVar3.m(ypbVar.c, aqbVar, 0L).m == bqbVar3.b(i2.first)) {
                    return bqbVar.i(aqbVar, ypbVar, bqbVar.g(i2.first, ypbVar).c, q74Var.c);
                }
            }
            return i2;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int T(aqb aqbVar, ypb ypbVar, int i, boolean z, Object obj, bqb bqbVar, bqb bqbVar2) {
        aqb aqbVar2 = aqbVar;
        bqb bqbVar3 = bqbVar;
        Object obj2 = bqbVar3.m(bqbVar3.g(obj, ypbVar).c, aqbVar, 0L).a;
        for (int i2 = 0; i2 < bqbVar2.o(); i2++) {
            if (bqbVar2.m(i2, aqbVar, 0L).a.equals(obj2)) {
                return i2;
            }
        }
        int b = bqbVar3.b(obj);
        int h = bqbVar3.h();
        int i3 = -1;
        int i4 = 0;
        while (i4 < h && i3 == -1) {
            bqb bqbVar4 = bqbVar3;
            int d = bqbVar4.d(b, ypbVar, aqbVar2, i, z);
            if (d == -1) {
                break;
            }
            i3 = bqbVar2.b(bqbVar4.l(d));
            i4++;
            bqbVar3 = bqbVar4;
            b = d;
            aqbVar2 = aqbVar;
        }
        if (i3 == -1) {
            return -1;
        }
        return bqbVar2.f(i3, ypbVar, false).c;
    }

    public static boolean y(ut6 ut6Var) {
        if (ut6Var != null) {
            try {
                hl6 hl6Var = ut6Var.a;
                if (ut6Var.e) {
                    for (jr9 jr9Var : ut6Var.c) {
                        if (jr9Var != null) {
                            jr9Var.d();
                        }
                    }
                } else {
                    hl6Var.j();
                }
                if ((!ut6Var.e ? 0L : hl6Var.g()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A(int i, rz6 rz6Var) {
        wt6 wt6Var = this.H;
        ut6 ut6Var = wt6Var.k[i];
        if (ut6Var == null || !ut6Var.g.a.equals(rz6Var)) {
            return false;
        }
        return this.a[i].h(wt6Var.k[i]);
    }

    public final void A0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.U;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        be8 be8Var = this.Y;
        if (be8Var.l == z2 && be8Var.n == i2 && be8Var.m == i3) {
            return;
        }
        this.Y = be8Var.e(i3, i2, z2);
        D0(false, false);
        wt6 wt6Var = this.H;
        for (ut6 ut6Var = wt6Var.i; ut6Var != null; ut6Var = ut6Var.m) {
            for (t74 t74Var : (t74[]) ut6Var.o.d) {
                if (t74Var != null) {
                    t74Var.h(z2);
                }
            }
        }
        if (!s0()) {
            w0();
            B0();
            be8 be8Var2 = this.Y;
            if (be8Var2.p) {
                this.Y = be8Var2.i(false);
            }
            wt6Var.r(this.n0);
            return;
        }
        int i4 = this.Y.e;
        dfb dfbVar = this.h;
        if (i4 != 3) {
            if (i4 == 2) {
                dfbVar.h(2);
            }
        } else {
            yc3 yc3Var = this.y;
            yc3Var.b = true;
            ((tf2) yc3Var.c).c();
            u0();
            dfbVar.h(2);
        }
    }

    public final boolean B() {
        ut6 ut6Var = this.H.i;
        long j = ut6Var.g.e;
        if (ut6Var.e) {
            return j == -9223372036854775807L || this.Y.s < j || !s0();
        }
        return false;
    }

    public final void B0() {
        long j;
        float f;
        long j2;
        ut6 ut6Var = this.H.i;
        if (ut6Var != null) {
            long n = ut6Var.e ? ut6Var.a.n() : -9223372036854775807L;
            if (n != -9223372036854775807L) {
                if (!ut6Var.g()) {
                    this.H.s(ut6Var);
                    g();
                    t(false);
                    C();
                }
                Q(n, true);
                if (n != this.Y.s) {
                    be8 be8Var = this.Y;
                    this.Y = x(be8Var.b, n, be8Var.c, n, true, 5);
                }
            } else {
                yc3 yc3Var = this.y;
                boolean z = z();
                tf2 tf2Var = (tf2) yc3Var.c;
                uh0 uh0Var = (uh0) yc3Var.e;
                if (uh0Var == null || uh0Var.n() || ((z && ((uh0) yc3Var.e).n != 2) || (!((uh0) yc3Var.e).o() && (z || ((uh0) yc3Var.e).m())))) {
                    yc3Var.a = true;
                    if (yc3Var.b) {
                        tf2Var.c();
                    }
                } else {
                    fm6 fm6Var = (fm6) yc3Var.f;
                    fm6Var.getClass();
                    long h = fm6Var.h();
                    if (yc3Var.a) {
                        if (h >= tf2Var.h()) {
                            yc3Var.a = false;
                            if (yc3Var.b) {
                                tf2Var.c();
                            }
                        } else if (tf2Var.c) {
                            tf2Var.a(tf2Var.h());
                            tf2Var.c = false;
                        }
                    }
                    tf2Var.a(h);
                    ce8 g = fm6Var.g();
                    if (!g.equals((ce8) tf2Var.e)) {
                        tf2Var.b(g);
                        ((r74) yc3Var.d).h.c(16, g).b();
                    }
                }
                long h2 = yc3Var.h();
                this.n0 = h2;
                long j3 = h2 - ut6Var.p;
                long j4 = this.Y.s;
                if (!this.E.isEmpty() && !this.Y.b.c()) {
                    if (this.q0) {
                        this.q0 = false;
                    }
                    be8 be8Var2 = this.Y;
                    be8Var2.a.b(be8Var2.b.a);
                    int min = Math.min(this.p0, this.E.size());
                    if (min > 0 && this.E.get(min - 1) != null) {
                        rjb.p();
                        return;
                    } else {
                        if (min < this.E.size() && this.E.get(min) != null) {
                            rjb.p();
                            return;
                        }
                        this.p0 = min;
                    }
                }
                if (this.y.i()) {
                    boolean z2 = !this.Z.d;
                    be8 be8Var3 = this.Y;
                    this.Y = x(be8Var3.b, j3, be8Var3.c, j3, z2, 6);
                } else {
                    be8 be8Var4 = this.Y;
                    be8Var4.s = j3;
                    be8Var4.t = SystemClock.elapsedRealtime();
                }
            }
            this.Y.q = this.H.l.d();
            be8 be8Var5 = this.Y;
            be8Var5.r = o(be8Var5.q);
            be8 be8Var6 = this.Y;
            if (be8Var6.l && be8Var6.e == 3 && t0(be8Var6.a, be8Var6.b)) {
                be8 be8Var7 = this.Y;
                float f2 = 1.0f;
                if (be8Var7.o.a == 1.0f) {
                    vc3 vc3Var = this.J;
                    long l = l(be8Var7.a, be8Var7.b.a, be8Var7.s);
                    long j5 = this.Y.r;
                    if (vc3Var.c != -9223372036854775807L) {
                        long j6 = l - j5;
                        long j7 = vc3Var.m;
                        if (j7 == -9223372036854775807L) {
                            vc3Var.m = j6;
                            vc3Var.n = 0L;
                        } else {
                            vc3Var.m = Math.max(j6, (long) ((j6 * 9.999871E-4f) + (j7 * 0.999f)));
                            vc3Var.n = (long) ((9.999871E-4f * Math.abs(j6 - r9)) + (vc3Var.n * 0.999f));
                        }
                        if (vc3Var.l != -9223372036854775807L) {
                            j = 1000;
                            if (SystemClock.elapsedRealtime() - vc3Var.l < 1000) {
                                f2 = vc3Var.k;
                            }
                        } else {
                            j = 1000;
                        }
                        vc3Var.l = SystemClock.elapsedRealtime();
                        long j8 = (vc3Var.n * 3) + vc3Var.m;
                        if (vc3Var.h > j8) {
                            float T = hac.T(j);
                            f = 1.0E-7f;
                            long[] jArr = {j8, vc3Var.e, vc3Var.h - (((long) ((vc3Var.k - 1.0f) * T)) + ((long) ((vc3Var.i - 1.0f) * T)))};
                            j2 = jArr[0];
                            for (int i = 1; i < 3; i++) {
                                long j9 = jArr[i];
                                if (j9 > j2) {
                                    j2 = j9;
                                }
                            }
                            vc3Var.h = j2;
                        } else {
                            f = 1.0E-7f;
                            j2 = hac.j(l - ((long) (Math.max(0.0f, vc3Var.k - 1.0f) / 1.0E-7f)), vc3Var.h, j8);
                            vc3Var.h = j2;
                            long j10 = vc3Var.g;
                            if (j10 != -9223372036854775807L && j2 > j10) {
                                vc3Var.h = j10;
                                j2 = j10;
                            }
                        }
                        long j11 = l - j2;
                        if (Math.abs(j11) < vc3Var.a) {
                            vc3Var.k = 1.0f;
                        } else {
                            f2 = hac.h((f * j11) + 1.0f, vc3Var.j, vc3Var.i);
                            vc3Var.k = f2;
                        }
                    }
                    if (this.y.g().a != f2) {
                        ce8 ce8Var = new ce8(f2, this.Y.o.b);
                        this.h.g(16);
                        this.y.b(ce8Var);
                        w(this.Y.o, this.y.g().a, false, false);
                    }
                }
            }
        }
    }

    public final void C() {
        boolean c;
        if (y(this.H.l)) {
            ut6 ut6Var = this.H.l;
            long o = o(!ut6Var.e ? 0L : ut6Var.a.g());
            ut6 ut6Var2 = this.H.i;
            long j = t0(this.Y.a, ut6Var.g.a) ? this.J.h : -9223372036854775807L;
            we8 we8Var = this.L;
            bqb bqbVar = this.Y.a;
            rz6 rz6Var = ut6Var.g.a;
            float f = this.y.g().a;
            boolean z = this.Y.l;
            aa6 aa6Var = new aa6(we8Var, bqbVar, rz6Var, o, f, this.d0, j);
            c = this.f.c(aa6Var);
            ut6 ut6Var3 = this.H.i;
            if (!c && ut6Var3.e && o < 500000 && this.x > 0) {
                ut6Var3.a.l(this.Y.s);
                c = this.f.c(aa6Var);
            }
        } else {
            c = false;
        }
        this.f0 = c;
        if (c) {
            ut6 ut6Var4 = this.H.l;
            ut6Var4.getClass();
            ra6 ra6Var = new ra6();
            ra6Var.a = this.n0 - ut6Var4.p;
            float f2 = this.y.g().a;
            jte.f(f2 > 0.0f || f2 == -3.4028235E38f);
            ra6Var.b = f2;
            long j2 = this.e0;
            jte.f(j2 >= 0 || j2 == -9223372036854775807L);
            ra6Var.c = j2;
            sa6 sa6Var = new sa6(ra6Var);
            jte.p(ut6Var4.m == null);
            ut6Var4.a.r(sa6Var);
        }
        x0();
    }

    public final void C0(bqb bqbVar, rz6 rz6Var, bqb bqbVar2, rz6 rz6Var2, long j, boolean z) {
        boolean t0 = t0(bqbVar, rz6Var);
        Object obj = rz6Var.a;
        if (!t0) {
            ce8 ce8Var = rz6Var.c() ? ce8.d : this.Y.o;
            yc3 yc3Var = this.y;
            if (yc3Var.g().equals(ce8Var)) {
                return;
            }
            this.h.g(16);
            yc3Var.b(ce8Var);
            w(this.Y.o, ce8Var.a, false, false);
            return;
        }
        ypb ypbVar = this.w;
        int i = bqbVar.g(obj, ypbVar).c;
        aqb aqbVar = this.s;
        bqbVar.n(i, aqbVar);
        ws6 ws6Var = aqbVar.i;
        String str = hac.a;
        vc3 vc3Var = this.J;
        vc3Var.getClass();
        vc3Var.c = hac.T(ws6Var.a);
        vc3Var.f = hac.T(ws6Var.b);
        vc3Var.g = hac.T(ws6Var.c);
        float f = ws6Var.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        vc3Var.j = f;
        float f2 = ws6Var.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        vc3Var.i = f2;
        if (f == 1.0f && f2 == 1.0f) {
            vc3Var.c = -9223372036854775807L;
        }
        vc3Var.a();
        if (j != -9223372036854775807L) {
            vc3Var.d = l(bqbVar, obj, j);
            vc3Var.a();
            return;
        }
        if (!Objects.equals(!bqbVar2.p() ? bqbVar2.m(bqbVar2.g(rz6Var2.a, ypbVar).c, aqbVar, 0L).a : null, aqbVar.a) || z) {
            vc3Var.d = -9223372036854775807L;
            vc3Var.a();
        }
    }

    public final void D() {
        wt6 wt6Var = this.H;
        wt6Var.p();
        ut6 ut6Var = wt6Var.m;
        if (ut6Var != null) {
            hl6 hl6Var = ut6Var.a;
            if ((!ut6Var.d || ut6Var.e) && !hl6Var.f()) {
                bqb bqbVar = this.Y.a;
                if (ut6Var.e) {
                    hl6Var.s();
                }
                Iterator it = this.f.o.values().iterator();
                while (it.hasNext()) {
                    if (((wc3) it.next()).b) {
                        return;
                    }
                }
                if (!ut6Var.d) {
                    long j = ut6Var.g.b;
                    ut6Var.d = true;
                    hl6Var.o(this, j);
                    return;
                }
                ra6 ra6Var = new ra6();
                ra6Var.a = this.n0 - ut6Var.p;
                float f = this.y.g().a;
                jte.f(f > 0.0f || f == -3.4028235E38f);
                ra6Var.b = f;
                long j2 = this.e0;
                jte.f(j2 >= 0 || j2 == -9223372036854775807L);
                ra6Var.c = j2;
                sa6 sa6Var = new sa6(ra6Var);
                jte.p(ut6Var.m == null);
                hl6Var.r(sa6Var);
            }
        }
    }

    public final void D0(boolean z, boolean z2) {
        long j;
        this.d0 = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.F.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.e0 = j;
    }

    public final void E(int i) {
        o74 o74Var = this.Z;
        be8 be8Var = this.Y;
        boolean z = o74Var.a | (o74Var.b != be8Var);
        o74Var.a = z;
        o74Var.b = be8Var;
        if (z) {
            if (!be8Var.a.p()) {
                be8 be8Var2 = this.Y;
                boolean z2 = be8Var2.a.b(be8Var2.b.a) != -1;
                Locale locale = Locale.US;
                be8 be8Var3 = this.Y;
                jte.o(String.format(locale, "periodUid %s not found in timeline %s with size %d triggered by msg %d", be8Var3.b.a, be8Var3.a.getClass().getName(), Integer.valueOf(this.Y.a.o()), Integer.valueOf(i)), z2);
            }
            o74 o74Var2 = this.Z;
            h74 h74Var = this.G.b;
            h74Var.j.e(new pv3(h74Var, o74Var2, (byte) 13));
            this.Z = new o74(this.Y);
        }
    }

    public final void F(int i) {
        g99 g99Var = this.a[i];
        try {
            ut6 ut6Var = this.H.i;
            ut6Var.getClass();
            uh0 d = g99Var.d(ut6Var);
            d.getClass();
            jr9 jr9Var = d.r;
            jr9Var.getClass();
            jr9Var.d();
        } catch (IOException | RuntimeException e) {
            byte b = g99Var.a.b;
            if (b != 3 && b != 5) {
                throw e;
            }
            e0c e0cVar = this.H.i.o;
            ncd.d("ExoPlayerImplInternal", "Disabling track due to error: ".concat(go4.c(((t74[]) e0cVar.d)[i].o())), e);
            e0c e0cVar2 = new e0c((f99[]) ((f99[]) e0cVar.c).clone(), (t74[]) ((t74[]) e0cVar.d).clone(), (g0c) e0cVar.e, (kp) e0cVar.f);
            ((f99[]) e0cVar2.c)[i] = null;
            ((t74[]) e0cVar2.d)[i] = null;
            h(i);
            ut6 ut6Var2 = this.H.i;
            ut6Var2.a(e0cVar2, this.Y.s, false, new boolean[ut6Var2.j.length]);
        }
    }

    public final void G(int i, boolean z) {
        boolean[] zArr = this.c;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.O.e(new i74((Object) this, i, z, (byte) 0));
        }
    }

    public final void H() {
        u(this.I.b(), true);
    }

    public final void I(n74 n74Var) {
        bqb b;
        this.Z.a(1);
        int i = n74Var.a;
        int i2 = n74Var.b;
        int i3 = n74Var.c;
        yia yiaVar = n74Var.d;
        e07 e07Var = this.I;
        ArrayList arrayList = e07Var.c;
        jte.f(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        e07Var.k = yiaVar;
        if (i == i2 || i == i3) {
            b = e07Var.b();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((d07) arrayList.get(min)).d;
            hac.S(i, i2, i3, arrayList);
            while (min <= max) {
                d07 d07Var = (d07) arrayList.get(min);
                d07Var.d = i4;
                i4 += d07Var.a.o.e.o();
                min++;
            }
            b = e07Var.b();
        }
        u(b, false);
    }

    public final void J() {
        this.Z.a(1);
        O(false, false, false, true);
        xc3 xc3Var = this.f;
        ConcurrentHashMap concurrentHashMap = xc3Var.o;
        long id = Thread.currentThread().getId();
        long j = xc3Var.p;
        jte.o("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        xc3Var.p = id;
        we8 we8Var = this.L;
        wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
        if (wc3Var == null) {
            wc3 wc3Var2 = new wc3();
            wc3Var2.a = 1;
            concurrentHashMap.put(we8Var, wc3Var2);
        } else {
            wc3Var.a++;
        }
        wc3 wc3Var3 = (wc3) concurrentHashMap.get(we8Var);
        wc3Var3.getClass();
        Integer num = (Integer) xc3Var.n.get(we8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        wc3Var3.c = intValue;
        wc3Var3.b = false;
        o0(this.Y.a.p() ? 4 : 2);
        be8 be8Var = this.Y;
        boolean z = be8Var.l;
        A0(this.Q.c(be8Var.e, z), be8Var.n, be8Var.m, z);
        e07 e07Var = this.I;
        ArrayList arrayList = e07Var.c;
        jte.p(!e07Var.l);
        for (int i = 0; i < arrayList.size(); i++) {
            d07 d07Var = (d07) arrayList.get(i);
            e07Var.e(d07Var);
            e07Var.h.add(d07Var);
        }
        e07Var.l = true;
        this.h.h(2);
    }

    public final void K(gs2 gs2Var) {
        tma tmaVar;
        try {
            O(true, false, true, false);
            L();
            xc3 xc3Var = this.f;
            we8 we8Var = this.L;
            ConcurrentHashMap concurrentHashMap = xc3Var.o;
            wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
            if (wc3Var != null) {
                int i = wc3Var.a - 1;
                wc3Var.a = i;
                if (i == 0) {
                    concurrentHashMap.remove(we8Var);
                    xc3Var.d();
                }
            }
            if (xc3Var.o.isEmpty()) {
                xc3Var.p = -1L;
            }
            c10 c10Var = this.Q;
            c10Var.c = null;
            c10Var.a();
            c10Var.b(0);
            fe3 fe3Var = this.d;
            if (fe3Var.h != null) {
                jte.o("DefaultTrackSelector is accessed on the wrong thread.", Thread.currentThread().equals(fe3Var.h));
            }
            if (Build.VERSION.SDK_INT >= 32 && (tmaVar = fe3Var.i) != null) {
                tmaVar.e();
                fe3Var.i = null;
            }
            fe3Var.a = null;
            fe3Var.b = null;
            o0(1);
        } finally {
            this.h.f();
            this.n.r();
            gs2Var.e();
        }
    }

    public final void L() {
        for (int i = 0; i < this.a.length; i++) {
            uh0 uh0Var = this.b[i];
            synchronized (uh0Var.a) {
                uh0Var.J = null;
            }
            g99 g99Var = this.a[i];
            uh0 uh0Var2 = g99Var.a;
            jte.p(uh0Var2.n == 0);
            uh0Var2.t();
            g99Var.e = false;
            uh0 uh0Var3 = g99Var.c;
            if (uh0Var3 != null) {
                jte.p(uh0Var3.n == 0);
                uh0Var3.t();
                g99Var.f = false;
            }
        }
    }

    public final void M(int i, int i2, yia yiaVar) {
        this.Z.a(1);
        e07 e07Var = this.I;
        e07Var.getClass();
        jte.f(i >= 0 && i <= i2 && i2 <= e07Var.c.size());
        e07Var.k = yiaVar;
        e07Var.f(i, i2);
        u(e07Var.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0189 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N() {
        int i;
        int i2;
        boolean z;
        float f = this.y.g().a;
        wt6 wt6Var = this.H;
        ut6 ut6Var = wt6Var.i;
        ut6 f2 = wt6Var.f();
        e0c e0cVar = null;
        ut6 ut6Var2 = ut6Var;
        boolean z2 = true;
        while (ut6Var2 != null && ut6Var2.e) {
            be8 be8Var = this.Y;
            e0c j = ut6Var2.j(f, be8Var.a, be8Var.l);
            e0c e0cVar2 = ut6Var2 == this.H.i ? j : e0cVar;
            e0c e0cVar3 = ut6Var2.o;
            t74[] t74VarArr = (t74[]) j.d;
            boolean z3 = false;
            if (((t74[]) e0cVar3.d).length == t74VarArr.length) {
                int i3 = 0;
                while (i3 < t74VarArr.length) {
                    if (j.p(e0cVar3, i3)) {
                        i3++;
                        e0cVar2 = e0cVar2;
                        j = j;
                    }
                }
                e0c e0cVar4 = e0cVar2;
                if (ut6Var2 == f2) {
                    z2 = false;
                }
                ut6Var2 = ut6Var2.m;
                e0cVar = e0cVar4;
            }
            wt6 wt6Var2 = this.H;
            if (z2) {
                ut6 ut6Var3 = wt6Var2.i;
                boolean z4 = (wt6Var2.s(ut6Var3) & 1) != 0;
                boolean[] zArr = new boolean[this.a.length];
                e0cVar2.getClass();
                long a = ut6Var3.a(e0cVar2, this.Y.s, z4, zArr);
                be8 be8Var2 = this.Y;
                if (be8Var2.e == 4 || a == be8Var2.s) {
                    z = false;
                } else {
                    z = false;
                    z3 = true;
                }
                be8 be8Var3 = this.Y;
                boolean z5 = z;
                i = 4;
                this.Y = x(be8Var3.b, a, be8Var3.c, be8Var3.d, z3, 5);
                if (z3) {
                    Q(a, true);
                }
                g();
                boolean[] zArr2 = new boolean[this.a.length];
                int i4 = z5;
                while (true) {
                    g99[] g99VarArr = this.a;
                    if (i4 >= g99VarArr.length) {
                        break;
                    }
                    int c = g99VarArr[i4].c();
                    zArr2[i4] = this.a[i4].j();
                    g99 g99Var = this.a[i4];
                    jr9 jr9Var = ut6Var3.c[i4];
                    yc3 yc3Var = this.y;
                    long j2 = this.n0;
                    boolean z6 = zArr[i4];
                    uh0 uh0Var = g99Var.a;
                    if (g99.k(uh0Var)) {
                        if (jr9Var != uh0Var.r) {
                            g99Var.a(uh0Var, yc3Var);
                        } else if (z6) {
                            uh0Var.D(j2, z5, true);
                        }
                    }
                    uh0 uh0Var2 = g99Var.c;
                    if (uh0Var2 != null && g99.k(uh0Var2)) {
                        if (jr9Var != uh0Var2.r) {
                            g99Var.a(uh0Var2, yc3Var);
                        } else if (z6) {
                            uh0Var2.D(j2, z5, true);
                        }
                    }
                    if (c - this.a[i4].c() > 0) {
                        G(i4, z5);
                    }
                    this.l0 -= c - this.a[i4].c();
                    i4++;
                }
                k(this.n0, zArr2);
                a0(ut6Var3);
            } else {
                i = 4;
                wt6Var2.s(ut6Var2);
                if (ut6Var2.e) {
                    long max = Math.max(ut6Var2.g.b, this.n0 - ut6Var2.p);
                    if (this.P) {
                        int i5 = 0;
                        while (true) {
                            g99[] g99VarArr2 = this.a;
                            if (i5 < g99VarArr2.length) {
                                if (this.H.k[i5] == ut6Var2 && g99VarArr2[i5].h(ut6Var2)) {
                                    g();
                                    break;
                                }
                                i5++;
                            } else {
                                break;
                            }
                        }
                    }
                    i2 = 4;
                    ut6Var2.a(j, max, false, new boolean[ut6Var2.j.length]);
                    t(true);
                    if (this.Y.e == i2) {
                        C();
                        B0();
                        this.h.h(2);
                        return;
                    }
                    return;
                }
            }
            i2 = i;
            t(true);
            if (this.Y.e == i2) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O(boolean z, boolean z2, boolean z3, boolean z4) {
        long j;
        long j2;
        long j3;
        boolean z5;
        bqb bqbVar;
        bqb bqbVar2;
        rz6 rz6Var;
        vzb vzbVar;
        e0c e0cVar;
        List list;
        this.h.g(2);
        this.V = false;
        if (this.W != null) {
            this.Z.a(1);
            this.W = null;
        }
        this.r0 = null;
        D0(false, true);
        yc3 yc3Var = this.y;
        yc3Var.b = false;
        tf2 tf2Var = (tf2) yc3Var.c;
        if (tf2Var.c) {
            tf2Var.a(tf2Var.h());
            tf2Var.c = false;
        }
        this.n0 = 1000000000000L;
        for (int i = 0; i < this.a.length; i++) {
            try {
                h(i);
            } catch (RuntimeException | u64 e) {
                ncd.d("ExoPlayerImplInternal", "Disable failed.", e);
            }
        }
        this.u0 = -9223372036854775807L;
        if (z) {
            for (g99 g99Var : this.a) {
                try {
                    g99Var.n();
                } catch (RuntimeException e2) {
                    ncd.d("ExoPlayerImplInternal", "Reset failed.", e2);
                }
            }
        }
        this.l0 = 0;
        be8 be8Var = this.Y;
        rz6 rz6Var2 = be8Var.b;
        long j4 = be8Var.s;
        if (!this.Y.b.c()) {
            be8 be8Var2 = this.Y;
            ypb ypbVar = this.w;
            rz6 rz6Var3 = be8Var2.b;
            bqb bqbVar3 = be8Var2.a;
            if (!bqbVar3.p() && !bqbVar3.g(rz6Var3.a, ypbVar).f) {
                j = this.Y.s;
                if (z2) {
                    j2 = j4;
                    j3 = j;
                    z5 = false;
                } else {
                    this.m0 = null;
                    Pair m = m(this.Y.a);
                    rz6Var2 = (rz6) m.first;
                    long longValue = ((Long) m.second).longValue();
                    z5 = rz6Var2.equals(this.Y.b) ? false : true;
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                }
                this.H.b();
                this.f0 = false;
                bqbVar = this.Y.a;
                if (z3 || !(bqbVar instanceof ff8)) {
                    bqbVar2 = bqbVar;
                } else {
                    ff8 ff8Var = (ff8) bqbVar;
                    yia yiaVar = this.I.k;
                    bqb[] bqbVarArr = ff8Var.k;
                    bqb[] bqbVarArr2 = new bqb[bqbVarArr.length];
                    for (int i2 = 0; i2 < bqbVarArr.length; i2++) {
                        bqbVarArr2[i2] = new ef8(bqbVarArr[i2]);
                    }
                    bqbVar2 = new ff8(bqbVarArr2, ff8Var.l, yiaVar);
                    if (rz6Var2.b != -1) {
                        bqbVar2.g(rz6Var2.a, this.w);
                        int i3 = this.w.c;
                        aqb aqbVar = this.s;
                        bqbVar2.m(i3, aqbVar, 0L);
                        if (aqbVar.a()) {
                            rz6Var = new rz6(rz6Var2.a, rz6Var2.d);
                            be8 be8Var3 = this.Y;
                            int i4 = be8Var3.e;
                            u64 u64Var = z4 ? null : be8Var3.f;
                            if (z5) {
                                vzbVar = vzb.d;
                                e0cVar = this.e;
                                ko5 ko5Var = mo5.b;
                                list = y79.e;
                            } else {
                                vzbVar = be8Var3.h;
                                e0cVar = be8Var3.i;
                                list = be8Var3.j;
                            }
                            this.Y = new be8(bqbVar2, rz6Var, j3, j2, i4, u64Var, false, vzbVar, e0cVar, list, rz6Var, be8Var3.l, be8Var3.m, be8Var3.n, be8Var3.o, j2, 0L, j2, 0L, false);
                            if (z3) {
                                wt6 wt6Var = this.H;
                                if (!wt6Var.q.isEmpty()) {
                                    ArrayList arrayList = new ArrayList();
                                    for (int i5 = 0; i5 < wt6Var.q.size(); i5++) {
                                        ((ut6) wt6Var.q.get(i5)).i();
                                    }
                                    wt6Var.q = arrayList;
                                    wt6Var.m = null;
                                    wt6Var.p();
                                }
                                e07 e07Var = this.I;
                                HashMap hashMap = e07Var.g;
                                for (c07 c07Var : hashMap.values()) {
                                    try {
                                        c07Var.a.p(c07Var.b);
                                    } catch (RuntimeException e3) {
                                        ncd.d("MediaSourceList", "Failed to release child source.", e3);
                                    }
                                    rh0 rh0Var = c07Var.a;
                                    b07 b07Var = c07Var.c;
                                    rh0Var.s(b07Var);
                                    c07Var.a.r(b07Var);
                                }
                                hashMap.clear();
                                e07Var.h.clear();
                                e07Var.l = false;
                                return;
                            }
                            return;
                        }
                    }
                }
                rz6Var = rz6Var2;
                be8 be8Var32 = this.Y;
                int i42 = be8Var32.e;
                if (z4) {
                }
                if (z5) {
                }
                this.Y = new be8(bqbVar2, rz6Var, j3, j2, i42, u64Var, false, vzbVar, e0cVar, list, rz6Var, be8Var32.l, be8Var32.m, be8Var32.n, be8Var32.o, j2, 0L, j2, 0L, false);
                if (z3) {
                }
            }
        }
        j = this.Y.c;
        if (z2) {
        }
        this.H.b();
        this.f0 = false;
        bqbVar = this.Y.a;
        if (z3) {
        }
        bqbVar2 = bqbVar;
        rz6Var = rz6Var2;
        be8 be8Var322 = this.Y;
        int i422 = be8Var322.e;
        if (z4) {
        }
        if (z5) {
        }
        this.Y = new be8(bqbVar2, rz6Var, j3, j2, i422, u64Var, false, vzbVar, e0cVar, list, rz6Var, be8Var322.l, be8Var322.m, be8Var322.n, be8Var322.o, j2, 0L, j2, 0L, false);
        if (z3) {
        }
    }

    public final void P() {
        ut6 ut6Var = this.H.i;
        this.c0 = ut6Var != null && ut6Var.g.h && this.b0;
    }

    public final void Q(long j, boolean z) {
        ut6 ut6Var = this.H.i;
        long j2 = j + (ut6Var == null ? 1000000000000L : ut6Var.p);
        this.n0 = j2;
        ((tf2) this.y.c).a(j2);
        for (g99 g99Var : this.a) {
            long j3 = this.n0;
            uh0 d = g99Var.d(ut6Var);
            if (d != null) {
                d.D(j3, false, z);
            }
        }
        for (ut6 ut6Var2 = r0.i; ut6Var2 != null; ut6Var2 = ut6Var2.m) {
            for (t74 t74Var : (t74[]) ut6Var2.o.d) {
                if (t74Var != null) {
                    t74Var.t();
                }
            }
        }
    }

    public final void R(bqb bqbVar, bqb bqbVar2) {
        if (bqbVar.p() && bqbVar2.p()) {
            return;
        }
        ArrayList arrayList = this.E;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ts2.t(arrayList.get(size));
            throw null;
        }
    }

    public final void U(long j) {
        boolean z = this.M;
        long j2 = x0;
        if (!z) {
            if (!this.U) {
                if (this.Y.e != 3 || s0()) {
                    r2 = j2;
                }
                this.h.a.sendEmptyMessageAtTime(2, j + r2);
            }
            this.T.getClass();
        }
        r2 = this.Y.e != 3 ? j2 : 1000L;
        for (g99 g99Var : this.a) {
            long j3 = this.n0;
            long j4 = this.o0;
            uh0 uh0Var = g99Var.c;
            uh0 uh0Var2 = g99Var.a;
            long j5 = g99.k(uh0Var2) ? uh0Var2.j(j3, j4) : Long.MAX_VALUE;
            if (uh0Var != null && uh0Var.n != 0) {
                j5 = Math.min(j5, uh0Var.j(j3, j4));
            }
            r2 = Math.min(r2, hac.i0(j5));
        }
        if (this.Y.m()) {
            ut6 ut6Var = this.H.i;
            if ((ut6Var != null ? ut6Var.m : null) != null) {
                if ((hac.T(r2) * this.Y.o.a) + this.n0 >= r1.e()) {
                    r2 = Math.min(r2, j2);
                }
            }
        }
        this.h.a.sendEmptyMessageAtTime(2, j + r2);
    }

    public final void V(boolean z) {
        rz6 rz6Var = this.H.i.g.a;
        long X = X(rz6Var, this.Y.s, true, false);
        if (X != this.Y.s) {
            be8 be8Var = this.Y;
            this.Y = x(rz6Var, X, be8Var.c, be8Var.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:28|(7:(5:67|68|(1:90)(3:74|(1:78)|79)|80|(1:89)(4:86|87|19|20))(1:30)|46|47|48|18|19|20)|31|32|(1:34)(1:63)|35|36|(1:38)(1:61)|39|40|41|42|43|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0193, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0194, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0195, code lost:
    
        r5 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0197, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0199, code lost:
    
        r0 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(q74 q74Var) {
        rz6 u;
        boolean z;
        long j;
        long j2;
        boolean z2;
        rz6 rz6Var;
        long j3;
        long j4;
        long j5;
        long j6;
        be8 be8Var;
        int i;
        long j7;
        int i2;
        long j8;
        rz6 rz6Var2;
        long j9;
        long X;
        be8 be8Var2;
        rz6 rz6Var3;
        bqb bqbVar;
        long j10;
        r74 r74Var = this;
        if (r74Var.V) {
            if (r74Var.W != null) {
                r74Var.X++;
                r74Var.Z.a(1);
            }
            r74Var.W = q74Var;
            return;
        }
        r74Var.Z.a(1);
        Pair S = S(r74Var.Y.a, q74Var, true, r74Var.g0, r74Var.h0, r74Var.s, r74Var.w);
        if (S == null) {
            Pair m = r74Var.m(r74Var.Y.a);
            u = (rz6) m.first;
            j2 = ((Long) m.second).longValue();
            z = !r74Var.Y.a.p();
            j = -9223372036854775807L;
        } else {
            Object obj = S.first;
            long longValue = ((Long) S.second).longValue();
            long j11 = q74Var.c == -9223372036854775807L ? -9223372036854775807L : longValue;
            wt6 wt6Var = r74Var.H;
            be8 be8Var3 = r74Var.Y;
            u = wt6Var.u(be8Var3, be8Var3.a, obj, longValue, true, false);
            if (u.c()) {
                r74Var.Y.a.g(u.a, r74Var.w);
                if (r74Var.w.e(u.b) == u.c) {
                    r74Var.w.getClass();
                    da daVar = da.c;
                }
                r74Var.w.getClass();
                da.c.a(u.b).getClass();
                z = true;
                j = Math.max(j11, 0L);
                j2 = 0;
            } else {
                z = q74Var.c == -9223372036854775807L;
                j = j11;
                j2 = longValue;
            }
        }
        try {
            try {
                if (r74Var.Y.a.p()) {
                    r74Var.m0 = q74Var;
                } else {
                    be8 be8Var4 = r74Var.Y;
                    if (S == null) {
                        if (be8Var4.e != 1) {
                            r74Var.o0(4);
                        }
                        r74Var.O(false, true, false, true);
                    } else {
                        try {
                            if (u.equals(be8Var4.b)) {
                                try {
                                    ut6 ut6Var = r74Var.H.i;
                                    if (ut6Var == null || !ut6Var.e || j2 == 0) {
                                        j6 = j2;
                                    } else {
                                        hl6 hl6Var = ut6Var.a;
                                        long j12 = r74Var.s.l;
                                        if (r74Var.U && j12 != -9223372036854775807L) {
                                            r74Var.T.getClass();
                                        }
                                        j6 = hl6Var.h(j2, r74Var.S);
                                    }
                                    if (hac.i0(j6) == hac.i0(r74Var.Y.s) && ((i = (be8Var = r74Var.Y).e) == 2 || i == 3)) {
                                        j7 = be8Var.s;
                                        i2 = 2;
                                        j8 = j7;
                                        z2 = z;
                                        rz6Var2 = u;
                                        j9 = j;
                                        r74Var.Y = r74Var.x(rz6Var2, j7, j9, j8, z2, i2);
                                    }
                                    z2 = z;
                                    rz6Var = u;
                                    j5 = j;
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z;
                                    rz6Var = u;
                                    j5 = j;
                                    j3 = j5;
                                    j4 = j2;
                                    r74Var.Y = r74Var.x(rz6Var, j4, j3, j4, z2, 2);
                                    throw th;
                                }
                            } else {
                                z2 = z;
                                rz6Var = u;
                                j5 = j;
                                j6 = j2;
                            }
                            r74Var.C0(bqbVar, rz6Var3, bqbVar, be8Var2.b, j10, true);
                            rz6Var2 = rz6Var3;
                            j9 = j10;
                            j7 = X;
                            i2 = 2;
                            j8 = j7;
                            r74Var = this;
                            r74Var.Y = r74Var.x(rz6Var2, j7, j9, j8, z2, i2);
                        } catch (Throwable th2) {
                            th = th2;
                            rz6Var = rz6Var3;
                            j3 = j10;
                            j4 = X;
                            r74Var.Y = r74Var.x(rz6Var, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        X = r74Var.X(rz6Var, j6, r74Var.z(), r74Var.Y.e == 4);
                        z2 |= j2 != X;
                        be8Var2 = r74Var.Y;
                        rz6Var3 = rz6Var;
                        bqbVar = be8Var2.a;
                        j10 = j5;
                    }
                }
                z2 = z;
                rz6Var2 = u;
                j7 = j2;
                j9 = j;
                i2 = 2;
                j8 = j7;
                r74Var = this;
                r74Var.Y = r74Var.x(rz6Var2, j7, j9, j8, z2, i2);
            } catch (Throwable th3) {
                th = th3;
                z2 = z;
                rz6Var = u;
                j4 = j2;
                j3 = j;
            }
        } catch (Throwable th4) {
            th = th4;
            z2 = z;
            rz6Var = u;
            j3 = j;
        }
    }

    public final long X(rz6 rz6Var, long j, boolean z, boolean z2) {
        wt6 wt6Var;
        byte b;
        w0();
        boolean z3 = true;
        D0(false, true);
        if (z2 || this.Y.e == 3) {
            o0(2);
        }
        ut6 ut6Var = this.H.i;
        ut6 ut6Var2 = ut6Var;
        while (ut6Var2 != null && !rz6Var.equals(ut6Var2.g.a)) {
            ut6Var2 = ut6Var2.m;
        }
        if (z || ut6Var != ut6Var2 || (ut6Var2 != null && ut6Var2.p + j < 0)) {
            for (int i = 0; i < this.a.length; i++) {
                h(i);
            }
            this.u0 = -9223372036854775807L;
            if (ut6Var2 != null) {
                while (true) {
                    wt6Var = this.H;
                    if (wt6Var.i == ut6Var2) {
                        break;
                    }
                    wt6Var.a();
                }
                wt6Var.s(ut6Var2);
                ut6Var2.p = 1000000000000L;
                jte.p(!z());
                k(this.H.d().e(), new boolean[this.a.length]);
                a0(ut6Var2);
            }
        }
        g();
        if (this.U) {
            for (g99 g99Var : this.a) {
                if (g99Var.j() && ((b = g99Var.a.b) == 2 || b == 4)) {
                    this.V = true;
                    break;
                }
            }
        }
        wt6 wt6Var2 = this.H;
        if (ut6Var2 != null) {
            wt6Var2.s(ut6Var2);
            if (!ut6Var2.e) {
                ut6Var2.g = ut6Var2.g.b(j, -9223372036854775807L);
            } else if (ut6Var2.f) {
                if (this.U) {
                    this.T.getClass();
                    if (!this.Y.a.p() && ut6Var2.g.a.equals(this.Y.b)) {
                        long j2 = ut6Var2.p + j;
                        boolean z4 = true;
                        for (g99 g99Var2 : this.a) {
                            if (g99Var2.j()) {
                                uh0 d = g99Var2.d(ut6Var2);
                                z4 &= d != null && d.I(j2);
                            }
                        }
                        if (z4) {
                            hl6 hl6Var = ut6Var2.a;
                            long j3 = this.Y.s;
                            jx9 jx9Var = jx9.e;
                            if (hl6Var.h(j3, jx9Var) == ut6Var2.a.h(j, jx9Var)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = ut6Var2.a.k(j);
                ut6Var2.a.l(j - this.x);
            }
            Q(j, z3);
            C();
        } else {
            wt6Var2.b();
            Q(j, true);
        }
        t(false);
        this.h.h(2);
        return j;
    }

    public final void Y(af8 af8Var) {
        af8Var.getClass();
        dfb dfbVar = this.h;
        if (af8Var.e != this.r) {
            dfbVar.c(15, af8Var).b();
            return;
        }
        synchronized (af8Var) {
        }
        try {
            af8Var.a.d(af8Var.c, af8Var.d);
            af8Var.a(true);
            int i = this.Y.e;
            if (i == 3 || i == 2) {
                dfbVar.h(2);
            }
        } catch (Throwable th) {
            af8Var.a(true);
            throw th;
        }
    }

    public final void Z(af8 af8Var) {
        Looper looper = af8Var.e;
        if (looper.getThread().isAlive()) {
            this.F.a(looper, null).e(new a14(this, af8Var));
        } else {
            ncd.f("TAG", "Trying to send message on a dead thread.");
            af8Var.a(false);
        }
    }

    @Override // st6
    public final void a(tt6 tt6Var) {
        this.h.c(8, tt6Var).b();
    }

    public final void a0(ut6 ut6Var) {
        for (int i = 0; i < this.a.length; i++) {
            ut6Var.h[i] = true;
        }
    }

    @Override // r6a
    public final void b(s6a s6aVar) {
        this.h.c(9, (tt6) s6aVar).b();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r7.a == 1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0(o00 o00Var, boolean z) {
        byte b;
        tma tmaVar;
        r74 r74Var;
        fe3 fe3Var = this.d;
        if (!fe3Var.j.equals(o00Var)) {
            fe3Var.j = o00Var;
            if (fe3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (tmaVar = fe3Var.i) != null && tmaVar.b && (r74Var = fe3Var.a) != null) {
                r74Var.h.c(10, null).b();
            }
        }
        if (!z) {
            o00Var = null;
        }
        c10 c10Var = this.Q;
        if (!Objects.equals(c10Var.d, o00Var)) {
            c10Var.d = o00Var;
            if (o00Var != null) {
                int i = o00Var.c;
                b = 3;
                switch (i) {
                    case 0:
                        ncd.f("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        b = 1;
                        break;
                    case 1:
                    case 14:
                        b = 1;
                        break;
                    case 2:
                    case 4:
                        b = 2;
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        break;
                    case 15:
                    default:
                        b10.o(i, "Unidentified audio usage: ", "AudioFocusManager");
                        break;
                    case 16:
                        b = 4;
                        break;
                }
                c10Var.f = b;
                jte.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
            }
            b = 0;
            c10Var.f = b;
            jte.e("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", b != 1 || b == 0);
        }
        be8 be8Var = this.Y;
        boolean z2 = be8Var.l;
        A0(c10Var.c(be8Var.e, z2), be8Var.n, be8Var.m, z2);
    }

    @Override // vcc
    public final void c(long j, long j2, go4 go4Var, MediaFormat mediaFormat) {
        if (this.V) {
            this.h.a(37).b();
        }
    }

    public final void c0(int i) {
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            byte b = uh0Var.b;
            if (b == 1 || b == 2) {
                uh0Var.d(10, Integer.valueOf(i));
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(10, Integer.valueOf(i));
                }
            }
        }
    }

    public final void d(m74 m74Var, int i) {
        this.Z.a(1);
        e07 e07Var = this.I;
        if (i == -1) {
            i = e07Var.c.size();
        }
        u(e07Var.a(i, m74Var.a, m74Var.b), false);
    }

    public final void d0(boolean z, gs2 gs2Var) {
        if (this.i0 != z) {
            this.i0 = z;
            if (!z) {
                for (g99 g99Var : this.a) {
                    g99Var.n();
                }
            }
        }
        if (gs2Var != null) {
            gs2Var.e();
        }
    }

    public final void e() {
        for (g99 g99Var : this.a) {
            ot9 ot9Var = this.U ? this.T : null;
            g99Var.a.d(18, ot9Var);
            uh0 uh0Var = g99Var.c;
            if (uh0Var != null) {
                uh0Var.d(18, ot9Var);
            }
        }
    }

    public final void e0(k74 k74Var) {
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 4) {
                uh0Var.d(23, k74Var);
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(23, k74Var);
                }
            }
        }
    }

    public final boolean f() {
        if (this.P) {
            for (g99 g99Var : this.a) {
                if (g99Var.g()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f0(m74 m74Var) {
        this.Z.a(1);
        int i = m74Var.c;
        yia yiaVar = m74Var.b;
        ArrayList arrayList = m74Var.a;
        if (i != -1) {
            this.m0 = new q74(new ff8(arrayList, yiaVar), m74Var.c, m74Var.d);
        }
        e07 e07Var = this.I;
        ArrayList arrayList2 = e07Var.c;
        e07Var.f(0, arrayList2.size());
        u(e07Var.a(arrayList2.size(), arrayList, yiaVar), false);
    }

    public final void g() {
        uh0 uh0Var;
        if (this.P && f()) {
            for (g99 g99Var : this.a) {
                int c = g99Var.c();
                yc3 yc3Var = this.y;
                if (g99Var.g()) {
                    byte b = g99Var.d;
                    byte b2 = 1;
                    boolean z = b == 5 || b == 2;
                    if (b != 5 && b != 3) {
                        b2 = 0;
                    }
                    if (z) {
                        try {
                            uh0Var = g99Var.a;
                        } catch (RuntimeException e) {
                            ncd.d("RendererHolder", "Disable prewarming failed.", e);
                        }
                    } else {
                        uh0Var = g99Var.c;
                        uh0Var.getClass();
                    }
                    g99Var.a(uh0Var, yc3Var);
                    try {
                        g99Var.l(z);
                    } catch (RuntimeException e2) {
                        ncd.d("RendererHolder", "Reset prewarming failed.", e2);
                    }
                    g99Var.d = b2;
                }
                this.l0 -= c - g99Var.c();
            }
            this.u0 = -9223372036854775807L;
        }
    }

    public final void g0(boolean z) {
        this.b0 = z;
        P();
        if (this.c0 && z()) {
            V(true);
            t(false);
        }
    }

    public final void h(int i) {
        g99[] g99VarArr = this.a;
        int c = g99VarArr[i].c();
        g99 g99Var = g99VarArr[i];
        uh0 uh0Var = g99Var.a;
        yc3 yc3Var = this.y;
        g99Var.a(uh0Var, yc3Var);
        uh0 uh0Var2 = g99Var.c;
        if (uh0Var2 != null) {
            byte b = g99Var.d;
            boolean z = true;
            if (b != 5 && b != 1 && b != 3) {
                z = false;
            }
            g99Var.a(uh0Var2, yc3Var);
            g99Var.l(false);
            if (z) {
                uh0 uh0Var3 = g99Var.a;
                uh0Var2.getClass();
                uh0Var2.d(17, uh0Var3);
            }
        }
        g99Var.d = (byte) 0;
        G(i, false);
        this.l0 -= c;
    }

    public final void h0(ce8 ce8Var) {
        this.h.g(16);
        yc3 yc3Var = this.y;
        yc3Var.b(ce8Var);
        ce8 g = yc3Var.g();
        w(g, g.a, true, true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        dfb dfbVar;
        int i;
        ut6 ut6Var;
        rz6 rz6Var;
        int i2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.Z.a(1);
                    A0(this.Q.c(this.Y.e, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    W((q74) message.obj);
                    break;
                case 4:
                    h0((ce8) message.obj);
                    break;
                case 5:
                    this.S = (jx9) message.obj;
                    break;
                case 6:
                    v0(false, true);
                    break;
                case 7:
                    K((gs2) message.obj);
                    return true;
                case 8:
                    v((tt6) message.obj);
                    break;
                case 9:
                    r((tt6) message.obj);
                    break;
                case 10:
                    this.d.i((d0c) message.obj);
                    N();
                    break;
                case 11:
                    j0(message.arg1);
                    break;
                case 12:
                    m0(message.arg1 != 0);
                    break;
                case 13:
                    d0(message.arg1 != 0, (gs2) message.obj);
                    break;
                case 14:
                    Y((af8) message.obj);
                    break;
                case 15:
                    Z((af8) message.obj);
                    break;
                case 16:
                    ce8 ce8Var = (ce8) message.obj;
                    w(ce8Var, ce8Var.a, true, false);
                    break;
                case 17:
                    f0((m74) message.obj);
                    break;
                case 18:
                    d((m74) message.obj, message.arg1);
                    break;
                case 19:
                    I((n74) message.obj);
                    break;
                case 20:
                    M(message.arg1, message.arg2, (yia) message.obj);
                    break;
                case 21:
                    n0((yia) message.obj);
                    break;
                case 22:
                    H();
                    break;
                case 23:
                    g0(message.arg1 != 0);
                    break;
                case 24:
                    this.R = message.arg1 != 0;
                    break;
                case 25:
                    N();
                    V(true);
                    break;
                case 26:
                    N();
                    V(true);
                    break;
                case 27:
                    z0((List) message.obj, message.arg1, message.arg2);
                    break;
                case 28:
                    i0((w64) message.obj);
                    break;
                case 29:
                    J();
                    break;
                case nm7.S /* 30 */:
                    Pair pair = (Pair) message.obj;
                    q0(pair.first, (gs2) pair.second);
                    break;
                case 31:
                    b0((o00) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    r0(((Float) message.obj).floatValue());
                    break;
                case 33:
                    p(message.arg1);
                    break;
                case 34:
                    q();
                    break;
                case 35:
                    p0((vcc) message.obj);
                    break;
                case 36:
                    k0(((Boolean) message.obj).booleanValue());
                    break;
                case 37:
                    this.V = false;
                    q74 q74Var = this.W;
                    if (q74Var != null) {
                        W(q74Var);
                        this.W = null;
                        break;
                    }
                    break;
                case 38:
                    l0((ot9) message.obj);
                    break;
                case 39:
                    e0((k74) message.obj);
                    break;
                case 40:
                    c0(message.arg1);
                    break;
                default:
                    return false;
            }
        } catch (bs3 e) {
            s(e, e.a);
        } catch (bx7 e2) {
            boolean z2 = e2.a;
            byte b = e2.b;
            if (b == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (b == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                s(e2, r3);
            }
            r3 = i2;
            s(e2, r3);
        } catch (d83 e3) {
            s(e3, e3.a);
        } catch (IOException e4) {
            s(e4, 2000);
        } catch (RuntimeException e5) {
            u64 u64Var = new u64(2, e5, ((e5 instanceof IllegalStateException) || (e5 instanceof IllegalArgumentException)) ? 1004 : 1000);
            ncd.d("ExoPlayerImplInternal", "Playback error", u64Var);
            v0(true, false);
            this.Y = this.Y.f(u64Var);
        } catch (ji0 e6) {
            s(e6, 1002);
        } catch (u64 e7) {
            e = e7;
            byte b2 = e.d;
            wt6 wt6Var = this.H;
            if (b2 == 1 && e.r == null) {
                g99 g99Var = this.a[e.f];
                ut6 ut6Var2 = wt6Var.i;
                while (true) {
                    if (ut6Var2 == null) {
                        ut6Var2 = wt6Var.d();
                        break;
                    }
                    if (g99Var.i(ut6Var2)) {
                        break;
                    }
                    ut6Var2 = ut6Var2.m;
                }
                if (ut6Var2 != null) {
                    e = e.a(ut6Var2.g.a);
                }
            }
            int i4 = e.f;
            byte b3 = e.d;
            dfb dfbVar2 = this.h;
            if (b3 == 1 && (rz6Var = e.r) != null && A(i4, rz6Var)) {
                this.v0 = true;
                g();
                ut6 k = wt6Var.k(i4);
                ut6 ut6Var3 = wt6Var.i;
                if (ut6Var3 != k) {
                    while (ut6Var3 != null) {
                        ut6 ut6Var4 = ut6Var3.m;
                        if (ut6Var4 == k) {
                            break;
                        }
                        ut6Var3 = ut6Var4;
                    }
                }
                wt6Var.s(ut6Var3);
                if (this.Y.e != 4) {
                    C();
                    dfbVar2.h(2);
                }
            } else {
                u64 u64Var2 = this.r0;
                if (u64Var2 != null) {
                    u64Var2.addSuppressed(e);
                    e = this.r0;
                }
                if (e.d != 1 || wt6Var.i == wt6Var.f()) {
                    dfbVar = dfbVar2;
                } else {
                    ut6 ut6Var5 = wt6Var.i;
                    while (true) {
                        if (ut6Var5 == null) {
                            ut6Var5 = wt6Var.d();
                            break;
                        }
                        if (ut6Var5.g.a.equals(e.r)) {
                            break;
                        }
                        ut6Var5 = ut6Var5.m;
                    }
                    while (true) {
                        ut6Var = wt6Var.i;
                        if (ut6Var == ut6Var5) {
                            break;
                        }
                        wt6Var.a();
                    }
                    jte.k(ut6Var);
                    E(message.what);
                    vt6 vt6Var = ut6Var.g;
                    rz6 rz6Var2 = vt6Var.a;
                    long j = vt6Var.b;
                    dfbVar = dfbVar2;
                    this.Y = x(rz6Var2, j, vt6Var.d, j, true, 0);
                }
                if (e.s && (this.r0 == null || (i = e.a) == 5004 || i == 5003)) {
                    ncd.g("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.r0 == null) {
                        this.r0 = e;
                    }
                    cfb c = dfbVar.c(25, e);
                    Handler handler = dfbVar.a;
                    Message message2 = c.a;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    c.a();
                } else {
                    ncd.d("ExoPlayerImplInternal", "Playback error", e);
                    v0(true, false);
                    this.Y = this.Y.f(e);
                }
            }
        }
        E(message.what);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:489:0x088a, code lost:
    
        if (r4 >= r5.c) goto L468;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x02f9, code lost:
    
        if (((long) ((r4.e() - r30.n0) / r30.y.g().a)) <= r18) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x09ac  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x084e  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0861  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0876  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0856  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x062e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        long j;
        int i;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        be8 be8Var;
        long j3;
        boolean z4;
        boolean z5;
        long j4;
        boolean z6;
        boolean z7;
        be8 be8Var2;
        int i2;
        byte b;
        long j5;
        vt6 e;
        ut6 ut6Var;
        long j6;
        int i3;
        ut6 d;
        ut6 d2;
        byte b2;
        g99[] g99VarArr;
        wt6 wt6Var;
        boolean z8;
        ut6 ut6Var2;
        ut6 ut6Var3;
        int i4;
        ut6 a;
        boolean z9;
        byte b3;
        int i5;
        int i6;
        int i7;
        boolean z10;
        ut6[] ut6VarArr;
        byte b4;
        ut6 ut6Var4;
        byte b5;
        byte b6;
        ut6 c;
        ut6 ut6Var5;
        boolean z11;
        e0c e0cVar;
        long j7;
        boolean z12;
        this.F.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        this.h.g(2);
        be8 be8Var3 = this.Y;
        int i8 = be8Var3.e;
        if (i8 == 1 || i8 == 4) {
            return;
        }
        int i9 = 0;
        if (be8Var3.a.p() || !this.I.l) {
            j = uptimeMillis;
            i = 5;
        } else {
            this.H.r(this.n0);
            wt6 wt6Var2 = this.H;
            ut6 ut6Var6 = wt6Var2.l;
            if (ut6Var6 == null || (!ut6Var6.g.i && ut6Var6.g() && wt6Var2.l.g.e != -9223372036854775807L && wt6Var2.n < 100)) {
                wt6 wt6Var3 = this.H;
                long j8 = this.n0;
                be8 be8Var4 = this.Y;
                j5 = -9223372036854775807L;
                ut6 ut6Var7 = wt6Var3.l;
                if (ut6Var7 == null) {
                    j = uptimeMillis;
                    e = wt6Var3.h(be8Var4.a, be8Var4.b, be8Var4.c, be8Var4.s, -9223372036854775807L);
                } else {
                    j = uptimeMillis;
                    e = wt6Var3.e(be8Var4.a, ut6Var7, j8);
                }
                if (e != null) {
                    wt6 wt6Var4 = this.H;
                    ut6 ut6Var8 = wt6Var4.l;
                    long j9 = ut6Var8 == null ? 1000000000000L : (ut6Var8.p + ut6Var8.g.e) - e.b;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= wt6Var4.q.size()) {
                            ut6Var = null;
                            break;
                        }
                        vt6 vt6Var = ((ut6) wt6Var4.q.get(i10)).g;
                        long j10 = vt6Var.e;
                        long j11 = e.e;
                        if ((j10 == -9223372036854775807L || j10 == j11) && vt6Var.b == e.b && vt6Var.a.equals(e.a)) {
                            ut6Var = (ut6) wt6Var4.q.remove(i10);
                            break;
                        }
                        i10++;
                    }
                    if (ut6Var == null) {
                        r74 r74Var = (r74) wt6Var4.e.b;
                        uh0[] uh0VarArr = r74Var.b;
                        fe3 fe3Var = r74Var.d;
                        xc3 xc3Var = r74Var.f;
                        we8 we8Var = r74Var.L;
                        xc3Var.getClass();
                        mx6 mx6Var = new mx6(xc3Var, we8Var);
                        e07 e07Var = r74Var.I;
                        e0c e0cVar2 = r74Var.e;
                        r74Var.t0.getClass();
                        ut6Var = new ut6(uh0VarArr, j9, fe3Var, mx6Var, e07Var, e, e0cVar2);
                    } else {
                        ut6Var.g = e;
                        ut6Var.p = j9;
                    }
                    ut6 ut6Var9 = wt6Var4.l;
                    if (ut6Var9 == null) {
                        wt6Var4.i = ut6Var;
                        Arrays.fill(wt6Var4.j, ut6Var);
                        Arrays.fill(wt6Var4.k, ut6Var);
                    } else if (ut6Var != ut6Var9.m) {
                        ut6Var9.b();
                        ut6Var9.m = ut6Var;
                        ut6Var9.c();
                    }
                    wt6Var4.o = null;
                    wt6Var4.l = ut6Var;
                    wt6Var4.n++;
                    wt6Var4.q();
                    if (!ut6Var.d) {
                        long j12 = e.b;
                        ut6Var.d = true;
                        ut6Var.a.o(this, j12);
                    } else if (ut6Var.e) {
                        this.h.c(8, ut6Var.a).b();
                    }
                    if (this.H.i == ut6Var) {
                        Q(e.b, true);
                    }
                    t(false);
                }
            } else {
                j5 = -9223372036854775807L;
                j = uptimeMillis;
            }
            if (this.f0) {
                this.f0 = y(this.H.l);
                x0();
            } else {
                C();
            }
            wt6 wt6Var5 = this.H;
            long j13 = 10000000;
            if (!this.c0 && this.P && !this.v0 && !f() && (c = wt6Var5.c()) != null && c == wt6Var5.d() && (ut6Var5 = c.m) != null && (z11 = ut6Var5.e)) {
                jte.p(z11);
                if (((long) ((ut6Var5.e() - this.n0) / this.y.g().a)) > 10000000) {
                    j6 = 10000000;
                    i3 = 0;
                } else {
                    int i11 = 0;
                    while (true) {
                        ut6[] ut6VarArr2 = wt6Var5.k;
                        if (i11 >= ut6VarArr2.length) {
                            break;
                        }
                        ut6 ut6Var10 = ut6VarArr2[i11];
                        ut6Var10.getClass();
                        ut6VarArr2[i11] = ut6Var10.m;
                        wt6Var5.q();
                        i11++;
                    }
                    g99[] g99VarArr2 = this.a;
                    i9 = 0;
                    ut6 c2 = wt6Var5.c();
                    if (c2 != null) {
                        e0c e0cVar3 = c2.o;
                        boolean z13 = false;
                        while (i9 < g99VarArr2.length) {
                            if (e0cVar3.q(i9)) {
                                g99 g99Var = g99VarArr2[i9];
                                if (g99Var.c == null || g99Var.g()) {
                                    e0cVar = e0cVar3;
                                    j7 = j13;
                                    z12 = false;
                                } else {
                                    g99 g99Var2 = g99VarArr2[i9];
                                    jte.p(!g99Var2.g());
                                    if (g99.k(g99Var2.a)) {
                                        g99Var2.d = (byte) 4;
                                    } else {
                                        uh0 uh0Var = g99Var2.c;
                                        if (uh0Var != null && uh0Var.n != 0) {
                                            g99Var2.d = (byte) 5;
                                        } else if (g99Var2.d == 0) {
                                            g99Var2.d = (byte) 2;
                                        } else {
                                            g99Var2.d = (byte) 3;
                                        }
                                    }
                                    e0cVar = e0cVar3;
                                    j7 = j13;
                                    z12 = false;
                                    j(c2, i9, false, c2.e());
                                }
                            } else {
                                e0cVar = e0cVar3;
                                j7 = j13;
                                z12 = z13;
                            }
                            i9++;
                            z13 = z12;
                            e0cVar3 = e0cVar;
                            j13 = j7;
                        }
                        j6 = j13;
                        boolean z14 = z13;
                        i3 = z14;
                        if (f()) {
                            this.u0 = c2.a.n();
                            i3 = z14;
                            if (!c2.g()) {
                                wt6Var5.s(c2);
                                t(z14);
                                C();
                                i3 = z14;
                            }
                        }
                    }
                }
                boolean z15 = this.P;
                g99[] g99VarArr3 = this.a;
                wt6 wt6Var6 = this.H;
                d = wt6Var6.d();
                if (d != null) {
                    if (d.m != null && !this.c0) {
                        ut6 d3 = wt6Var6.d();
                        if (d3.e) {
                            g99[] g99VarArr4 = this.a;
                            int length = g99VarArr4.length;
                            int i12 = i3;
                            while (true) {
                                if (i12 < length) {
                                    g99 g99Var3 = g99VarArr4[i12];
                                    if (!g99Var3.e(d3, g99Var3.a) || !g99Var3.e(d3, g99Var3.c)) {
                                        break;
                                    } else {
                                        i12++;
                                    }
                                } else if (!f() || wt6Var6.c() != wt6Var6.d()) {
                                    ut6 ut6Var11 = d.m;
                                    if (ut6Var11.e || this.n0 >= ut6Var11.e()) {
                                        boolean z16 = d.m.e;
                                        if (z16) {
                                            jte.p(z16);
                                        }
                                        e0c e0cVar4 = d.o;
                                        int i13 = i3;
                                        while (true) {
                                            ut6VarArr = wt6Var6.j;
                                            if (i13 >= ut6VarArr.length) {
                                                break;
                                            }
                                            ut6[] ut6VarArr3 = wt6Var6.k;
                                            ut6 ut6Var12 = ut6VarArr3[i13];
                                            ut6 ut6Var13 = ut6VarArr[i13];
                                            if (ut6Var12 == ut6Var13) {
                                                ut6Var13.getClass();
                                                ut6VarArr3[i13] = ut6Var13.m;
                                            }
                                            ut6 ut6Var14 = ut6VarArr[i13];
                                            ut6Var14.getClass();
                                            ut6VarArr[i13] = ut6Var14.m;
                                            wt6Var6.q();
                                            ut6VarArr[i13].getClass();
                                            i13++;
                                        }
                                        ut6 ut6Var15 = ut6VarArr[i3];
                                        ut6Var15.getClass();
                                        e0c e0cVar5 = ut6Var15.o;
                                        bqb bqbVar = this.Y.a;
                                        long j14 = j5;
                                        C0(bqbVar, ut6Var15.g.a, bqbVar, d.g.a, -9223372036854775807L, false);
                                        if (ut6Var15.e && ((z15 && this.u0 != j14) || ut6Var15.a.n() != j14)) {
                                            this.u0 = j14;
                                            boolean z17 = z15 && !this.v0;
                                            if (z17) {
                                                int i14 = 0;
                                                while (true) {
                                                    if (i14 >= g99VarArr3.length) {
                                                        break;
                                                    }
                                                    boolean q = e0cVar5.q(i14);
                                                    t74[] t74VarArr = (t74[]) e0cVar5.d;
                                                    if (q && g99VarArr3[i14].a.b != -2 && !wf7.a(t74VarArr[i14].o().t, t74VarArr[i14].o().l) && !g99VarArr3[i14].g()) {
                                                        z17 = false;
                                                        break;
                                                    }
                                                    i14++;
                                                }
                                            }
                                            if (!z17) {
                                                long e2 = ut6Var15.e();
                                                int length2 = g99VarArr3.length;
                                                int i15 = 0;
                                                while (i15 < length2) {
                                                    g99 g99Var4 = g99VarArr3[i15];
                                                    uh0 uh0Var2 = g99Var4.c;
                                                    uh0 uh0Var3 = g99Var4.a;
                                                    if (g99.k(uh0Var3) && (b6 = g99Var4.d) != 5 && b6 != 2) {
                                                        g99.o(uh0Var3, e2);
                                                    }
                                                    if (uh0Var2 == null || uh0Var2.n == 0 || (b5 = g99Var4.d) == 4 || b5 == 3) {
                                                        ut6Var4 = ut6Var15;
                                                    } else {
                                                        ut6Var4 = ut6Var15;
                                                        g99.o(uh0Var2, e2);
                                                    }
                                                    i15++;
                                                    ut6Var15 = ut6Var4;
                                                }
                                                ut6 ut6Var16 = ut6Var15;
                                                if (!ut6Var16.g()) {
                                                    wt6Var6.s(ut6Var16);
                                                    t(false);
                                                    C();
                                                }
                                            }
                                        }
                                        for (g99 g99Var5 : g99VarArr3) {
                                            long e3 = ut6Var15.e();
                                            uh0 uh0Var4 = g99Var5.a;
                                            int i16 = g99Var5.b;
                                            boolean q2 = e0cVar4.q(i16);
                                            boolean q3 = e0cVar5.q(i16);
                                            uh0 uh0Var5 = g99Var5.c;
                                            if (uh0Var5 == null || (b4 = g99Var5.d) == 4 || b4 == 3 || (b4 == 0 && g99.k(uh0Var4))) {
                                                uh0Var5 = uh0Var4;
                                            }
                                            if (q2 && !uh0Var5.E) {
                                                boolean z18 = uh0Var4.b == -2;
                                                f99 f99Var = ((f99[]) e0cVar4.c)[i16];
                                                f99 f99Var2 = ((f99[]) e0cVar5.c)[i16];
                                                if (!q3 || !Objects.equals(f99Var2, f99Var) || z18 || g99Var5.g()) {
                                                    g99.o(uh0Var5, e3);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (d.g.i || this.c0) {
                        for (g99 g99Var6 : g99VarArr3) {
                            if (g99Var6.i(d)) {
                                uh0 d4 = g99Var6.d(d);
                                d4.getClass();
                                if (d4.m()) {
                                    long j15 = d.g.e;
                                    long j16 = (j15 == j5 || j15 == Long.MIN_VALUE) ? j5 : j15 + d.p;
                                    uh0 d5 = g99Var6.d(d);
                                    d5.getClass();
                                    g99.o(d5, j16);
                                }
                            }
                        }
                    }
                }
                wt6 wt6Var7 = this.H;
                d2 = wt6Var7.d();
                if (d2 != null && wt6Var7.i != d2) {
                    for (i7 = 0; i7 < this.a.length; i7++) {
                        if (!d2.h[i7]) {
                            ut6 d6 = wt6Var7.d();
                            e0c e0cVar6 = d6.o;
                            g99[] g99VarArr5 = this.a;
                            boolean z19 = true;
                            for (g99 g99Var7 : g99VarArr5) {
                                int c3 = g99Var7.c();
                                yc3 yc3Var = this.y;
                                int m = g99Var7.m(g99Var7.a, d6, e0cVar6, yc3Var);
                                int m2 = g99Var7.m(g99Var7.c, d6, e0cVar6, yc3Var);
                                if (m == 1) {
                                    m = m2;
                                }
                                if ((m & 2) != 0 && (z10 = this.k0) && z10) {
                                    this.k0 = false;
                                    if (this.Y.p) {
                                        this.h.h(2);
                                    }
                                }
                                this.l0 -= c3 - g99Var7.c();
                                z19 &= (m & 1) != 0;
                            }
                            if (z19) {
                                for (int i17 = 0; i17 < g99VarArr5.length; i17++) {
                                    if (e0cVar6.q(i17) && !g99VarArr5[i17].i(d6)) {
                                        j(d6, i17, false, d6.e());
                                    }
                                }
                            }
                            b2 = 3;
                            if (z19) {
                                a0(wt6Var7.d());
                            }
                            g99VarArr = this.a;
                            wt6Var = this.H;
                            z8 = false;
                            loop9: while (s0() && !this.c0 && (ut6Var2 = wt6Var.i) != null && (ut6Var3 = ut6Var2.m) != null && this.n0 >= ut6Var3.e()) {
                                for (i4 = 0; i4 < this.a.length; i4++) {
                                    if (!ut6Var3.h[i4]) {
                                        break loop9;
                                    }
                                }
                                if (z8) {
                                    E(-1);
                                }
                                this.v0 = false;
                                a = wt6Var.a();
                                a.getClass();
                                if (this.Y.b.a.equals(a.g.a.a)) {
                                    rz6 rz6Var = this.Y.b;
                                    if (rz6Var.b == -1) {
                                        rz6 rz6Var2 = a.g.a;
                                        if (rz6Var2.b == -1 && rz6Var.e != rz6Var2.e) {
                                            z9 = true;
                                            vt6 vt6Var2 = a.g;
                                            rz6 rz6Var3 = vt6Var2.a;
                                            boolean z20 = z9;
                                            long j17 = vt6Var2.b;
                                            b3 = b2;
                                            this.Y = x(rz6Var3, j17, vt6Var2.d, j17, !z20, 0);
                                            P();
                                            B0();
                                            for (i5 = 0; i5 < g99VarArr.length; i5++) {
                                                if ((!this.P ? false : this.a[i5].g()) && a == wt6Var.k[i5]) {
                                                    g99 g99Var8 = g99VarArr[i5];
                                                    byte b7 = g99Var8.d;
                                                    if (b7 == 4 || b7 == 5) {
                                                        boolean z21 = b7 == 5;
                                                        uh0 uh0Var6 = g99Var8.a;
                                                        uh0 uh0Var7 = g99Var8.c;
                                                        if (z21) {
                                                            uh0Var7.getClass();
                                                            uh0Var7.d(17, uh0Var6);
                                                        } else {
                                                            uh0Var7.getClass();
                                                            uh0Var6.d(17, uh0Var7);
                                                        }
                                                        g99Var8.d = g99Var8.d == 5 ? (byte) 0 : (byte) 1;
                                                    } else if (b7 == 2) {
                                                        g99Var8.d = (byte) 0;
                                                    } else if (b7 == b3) {
                                                        g99Var8.d = (byte) 1;
                                                    }
                                                }
                                            }
                                            if (this.Y.e == b3) {
                                                u0();
                                            }
                                            e0c e0cVar7 = wt6Var.i.o;
                                            for (i6 = 0; i6 < g99VarArr.length; i6++) {
                                                if (e0cVar7.q(i6)) {
                                                    g99 g99Var9 = g99VarArr[i6];
                                                    uh0 uh0Var8 = g99Var9.c;
                                                    uh0 uh0Var9 = g99Var9.a;
                                                    if (g99.k(uh0Var9)) {
                                                        uh0Var9.f();
                                                    } else if (uh0Var8 != null && uh0Var8.n != 0) {
                                                        uh0Var8.f();
                                                    }
                                                }
                                            }
                                            b2 = b3;
                                            z8 = true;
                                        }
                                    }
                                }
                                z9 = false;
                                vt6 vt6Var22 = a.g;
                                rz6 rz6Var32 = vt6Var22.a;
                                boolean z202 = z9;
                                long j172 = vt6Var22.b;
                                b3 = b2;
                                this.Y = x(rz6Var32, j172, vt6Var22.d, j172, !z202, 0);
                                P();
                                B0();
                                while (i5 < g99VarArr.length) {
                                }
                                if (this.Y.e == b3) {
                                }
                                e0c e0cVar72 = wt6Var.i.o;
                                while (i6 < g99VarArr.length) {
                                }
                                b2 = b3;
                                z8 = true;
                            }
                            i = 5;
                            this.t0.getClass();
                        }
                    }
                }
                b2 = 3;
                g99VarArr = this.a;
                wt6Var = this.H;
                z8 = false;
                loop9: while (s0()) {
                    while (i4 < this.a.length) {
                    }
                    if (z8) {
                    }
                    this.v0 = false;
                    a = wt6Var.a();
                    a.getClass();
                    if (this.Y.b.a.equals(a.g.a.a)) {
                    }
                    z9 = false;
                    vt6 vt6Var222 = a.g;
                    rz6 rz6Var322 = vt6Var222.a;
                    boolean z2022 = z9;
                    long j1722 = vt6Var222.b;
                    b3 = b2;
                    this.Y = x(rz6Var322, j1722, vt6Var222.d, j1722, !z2022, 0);
                    P();
                    B0();
                    while (i5 < g99VarArr.length) {
                    }
                    if (this.Y.e == b3) {
                    }
                    e0c e0cVar722 = wt6Var.i.o;
                    while (i6 < g99VarArr.length) {
                    }
                    b2 = b3;
                    z8 = true;
                }
                i = 5;
                this.t0.getClass();
            }
            j6 = 10000000;
            i3 = i9;
            boolean z152 = this.P;
            g99[] g99VarArr32 = this.a;
            wt6 wt6Var62 = this.H;
            d = wt6Var62.d();
            if (d != null) {
            }
            wt6 wt6Var72 = this.H;
            d2 = wt6Var72.d();
            if (d2 != null) {
                while (i7 < this.a.length) {
                }
            }
            b2 = 3;
            g99VarArr = this.a;
            wt6Var = this.H;
            z8 = false;
            loop9: while (s0()) {
            }
            i = 5;
            this.t0.getClass();
        }
        ut6 ut6Var17 = this.H.i;
        long j18 = j;
        if (ut6Var17 == null) {
            U(j18);
            return;
        }
        Trace.beginSection("doSomeWork");
        B0();
        if (ut6Var17.e) {
            this.F.getClass();
            this.o0 = hac.T(SystemClock.elapsedRealtime());
            ut6Var17.a.l(this.Y.s - this.x);
            int i18 = 0;
            boolean z22 = false;
            z = true;
            z2 = true;
            while (true) {
                g99[] g99VarArr6 = this.a;
                if (i18 >= g99VarArr6.length) {
                    break;
                }
                g99 g99Var10 = g99VarArr6[i18];
                if (g99Var10.c() == 0) {
                    G(i18, false);
                } else {
                    long j19 = this.n0;
                    long j20 = this.o0;
                    uh0 uh0Var10 = g99Var10.c;
                    uh0 uh0Var11 = g99Var10.a;
                    if (g99.k(uh0Var11)) {
                        uh0Var11.B(j19, j20);
                    }
                    if (uh0Var10 != null && uh0Var10.n != 0) {
                        uh0Var10.B(j19, j20);
                    }
                    boolean z23 = z2 && g99Var10.f();
                    boolean z24 = (this.V && g99Var10.j() && ((b = g99Var10.a.b) == 2 || b == 4) && !g99Var10.f()) ? true : z22;
                    uh0 d7 = g99Var10.d(ut6Var17);
                    boolean z25 = d7 == null || d7.m() || d7.o() || d7.n();
                    G(i18, z25);
                    z = z && z25;
                    if (!z25) {
                        F(i18);
                    }
                    z22 = z24;
                    z2 = z23;
                }
                i18++;
            }
            if (this.V && !z22 && !this.h.a.hasMessages(37)) {
                this.h.a(37).b();
            }
        } else {
            ut6Var17.a.j();
            z = true;
            z2 = true;
        }
        long j21 = ut6Var17.g.e;
        if (z2 && ut6Var17.e) {
            j2 = -9223372036854775807L;
            if (j21 == -9223372036854775807L || j21 <= this.Y.s) {
                z3 = true;
                if (z3 && this.c0) {
                    this.c0 = false;
                    int i19 = this.Y.n;
                    this.Z.a(0);
                    A0(this.Q.c(this.Y.e, false), i19, i, false);
                }
                if (z3 || !ut6Var17.g.i) {
                    be8Var = this.Y;
                    if (be8Var.e != 2) {
                        wt6 wt6Var8 = this.H;
                        if (this.l0 == 0) {
                            z6 = B();
                            j3 = j2;
                        } else {
                            if (z) {
                                if (be8Var.g) {
                                    ut6 ut6Var18 = wt6Var8.i;
                                    long j22 = t0(be8Var.a, ut6Var18.g.a) ? this.J.h : j2;
                                    ut6 ut6Var19 = wt6Var8.l;
                                    boolean z26 = ut6Var19.g() && ut6Var19.g.i;
                                    boolean z27 = ut6Var19.g.a.c() && !ut6Var19.e;
                                    if (!z26 && !z27) {
                                        long o = o(ut6Var19.d());
                                        xc3 xc3Var2 = this.f;
                                        we8 we8Var2 = this.L;
                                        bqb bqbVar2 = this.Y.a;
                                        rz6 rz6Var4 = ut6Var18.g.a;
                                        float f = this.y.g().a;
                                        j3 = j2;
                                        boolean z28 = this.Y.l;
                                        boolean z29 = this.d0;
                                        xc3Var2.getClass();
                                        long j23 = j22;
                                        xs6 xs6Var = bqbVar2.m(bqbVar2.g(rz6Var4.a, xc3Var2.b).c, xc3Var2.a, 0L).b.b;
                                        if (xs6Var != null) {
                                            String scheme = xs6Var.a.getScheme();
                                            if (TextUtils.isEmpty(scheme) || xc3.q.contains(scheme)) {
                                                z5 = true;
                                                long H = hac.H(o, f);
                                                j4 = !z29 ? z5 ? xc3Var2.k : xc3Var2.j : z5 ? xc3Var2.i : xc3Var2.h;
                                                if (j23 != j3) {
                                                    j4 = Math.min(j23 / 2, j4);
                                                }
                                                if (j4 > 0 && H < j4) {
                                                    if (!(!z5 ? xc3Var2.l : false)) {
                                                        int b8 = xc3Var2.b(we8Var2);
                                                        wc3 wc3Var = (wc3) xc3Var2.o.get(we8Var2);
                                                        wc3Var.getClass();
                                                    }
                                                }
                                                z6 = true;
                                            }
                                        }
                                        z5 = false;
                                        long H2 = hac.H(o, f);
                                        if (!z29) {
                                        }
                                        if (j23 != j3) {
                                        }
                                        if (j4 > 0) {
                                            if (!(!z5 ? xc3Var2.l : false)) {
                                            }
                                        }
                                        z6 = true;
                                    }
                                }
                                j3 = j2;
                                z6 = true;
                            } else {
                                j3 = j2;
                            }
                            z6 = false;
                        }
                        if (z6) {
                            o0(3);
                            this.r0 = null;
                            if (s0()) {
                                D0(false, false);
                                yc3 yc3Var2 = this.y;
                                z4 = true;
                                yc3Var2.b = true;
                                ((tf2) yc3Var2.c).c();
                                u0();
                                if (this.Y.e == 2) {
                                    int i20 = 0;
                                    while (true) {
                                        g99[] g99VarArr7 = this.a;
                                        if (i20 >= g99VarArr7.length) {
                                            break;
                                        }
                                        if (g99VarArr7[i20].i(ut6Var17)) {
                                            F(i20);
                                        }
                                        i20++;
                                    }
                                    be8 be8Var5 = this.Y;
                                    if (!be8Var5.g && be8Var5.r < 500000 && y(this.H.l) && s0()) {
                                        long j24 = this.s0;
                                        bfb bfbVar = this.F;
                                        if (j24 == -9223372036854775807L) {
                                            bfbVar.getClass();
                                            this.s0 = SystemClock.elapsedRealtime();
                                        } else {
                                            bfbVar.getClass();
                                            if (SystemClock.elapsedRealtime() - this.s0 >= 4000) {
                                                throw new ccb(0, 4000);
                                            }
                                        }
                                        boolean z30 = (s0() || this.Y.e != 3) ? false : z4;
                                        z7 = (!this.k0 && this.j0 && z30) ? z4 : false;
                                        be8Var2 = this.Y;
                                        if (be8Var2.p != z7) {
                                            be8Var2 = be8Var2.i(z7);
                                            this.Y = be8Var2;
                                        }
                                        this.j0 = false;
                                        if (!z7 && (i2 = be8Var2.e) != 4 && (z30 || i2 == 2 || (i2 == 3 && this.l0 != 0))) {
                                            U(j18);
                                        }
                                        Trace.endSection();
                                    }
                                }
                                this.s0 = -9223372036854775807L;
                                if (s0()) {
                                }
                                if (!this.k0) {
                                }
                                be8Var2 = this.Y;
                                if (be8Var2.p != z7) {
                                }
                                this.j0 = false;
                                if (!z7) {
                                    U(j18);
                                }
                                Trace.endSection();
                            }
                        }
                    } else {
                        j3 = j2;
                    }
                    z4 = true;
                    if (this.Y.e == 3 && (this.l0 != 0 ? !z : !B())) {
                        D0(s0(), false);
                        o0(2);
                        if (this.d0) {
                            for (ut6 ut6Var20 = this.H.i; ut6Var20 != null; ut6Var20 = ut6Var20.m) {
                                for (t74 t74Var : (t74[]) ut6Var20.o.d) {
                                    if (t74Var != null) {
                                        t74Var.u();
                                    }
                                }
                            }
                            vc3 vc3Var = this.J;
                            long j25 = vc3Var.h;
                            if (j25 != j3) {
                                long j26 = j25 + vc3Var.b;
                                vc3Var.h = j26;
                                long j27 = vc3Var.g;
                                if (j27 != j3 && j26 > j27) {
                                    vc3Var.h = j27;
                                }
                                vc3Var.l = j3;
                            }
                        }
                        w0();
                    }
                    if (this.Y.e == 2) {
                    }
                    this.s0 = -9223372036854775807L;
                    if (s0()) {
                    }
                    if (!this.k0) {
                    }
                    be8Var2 = this.Y;
                    if (be8Var2.p != z7) {
                    }
                    this.j0 = false;
                    if (!z7) {
                    }
                    Trace.endSection();
                }
                o0(4);
                w0();
                z4 = true;
                if (this.Y.e == 2) {
                }
                this.s0 = -9223372036854775807L;
                if (s0()) {
                }
                if (!this.k0) {
                }
                be8Var2 = this.Y;
                if (be8Var2.p != z7) {
                }
                this.j0 = false;
                if (!z7) {
                }
                Trace.endSection();
            }
        } else {
            j2 = -9223372036854775807L;
        }
        z3 = false;
        if (z3) {
            this.c0 = false;
            int i192 = this.Y.n;
            this.Z.a(0);
            A0(this.Q.c(this.Y.e, false), i192, i, false);
        }
        if (z3) {
        }
        be8Var = this.Y;
        if (be8Var.e != 2) {
        }
        z4 = true;
        if (this.Y.e == 3) {
            D0(s0(), false);
            o0(2);
            if (this.d0) {
            }
            w0();
        }
        if (this.Y.e == 2) {
        }
        this.s0 = -9223372036854775807L;
        if (s0()) {
        }
        if (!this.k0) {
        }
        be8Var2 = this.Y;
        if (be8Var2.p != z7) {
        }
        this.j0 = false;
        if (!z7) {
        }
        Trace.endSection();
    }

    public final void i0(w64 w64Var) {
        this.t0 = w64Var;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.getClass();
        w64Var.getClass();
        if (wt6Var.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < wt6Var.q.size(); i++) {
            ((ut6) wt6Var.q.get(i)).i();
        }
        wt6Var.q = arrayList;
        wt6Var.m = null;
        wt6Var.p();
    }

    public final void j(ut6 ut6Var, int i, boolean z, long j) {
        g99 g99Var = this.a[i];
        boolean j2 = g99Var.j();
        uh0 uh0Var = g99Var.a;
        if (j2) {
            return;
        }
        boolean z2 = ut6Var == this.H.i;
        e0c e0cVar = ut6Var.o;
        f99 f99Var = ((f99[]) e0cVar.c)[i];
        t74 t74Var = ((t74[]) e0cVar.d)[i];
        boolean z3 = s0() && this.Y.e == 3;
        boolean z4 = !z && z3;
        this.l0++;
        jr9 jr9Var = ut6Var.c[i];
        long j3 = ut6Var.p;
        rz6 rz6Var = ut6Var.g.a;
        uh0 uh0Var2 = g99Var.c;
        int length = t74Var != null ? t74Var.length() : 0;
        go4[] go4VarArr = new go4[length];
        for (int i2 = 0; i2 < length; i2++) {
            t74Var.getClass();
            go4VarArr[i2] = t74Var.i(i2);
        }
        byte b = g99Var.d;
        yc3 yc3Var = this.y;
        if (b == 0 || b == 2 || b == 5) {
            g99Var.e = true;
            jte.p(uh0Var.n == 0);
            uh0Var.d = f99Var;
            uh0Var.H = rz6Var;
            uh0Var.n = (byte) 1;
            uh0Var.r(z4, z2);
            uh0Var.C(go4VarArr, jr9Var, j, j3, rz6Var);
            uh0Var.D(j, z4, true);
            yc3Var.f(uh0Var);
        } else {
            g99Var.f = true;
            uh0Var2.getClass();
            jte.p(uh0Var2.n == 0);
            uh0Var2.d = f99Var;
            uh0Var2.H = rz6Var;
            uh0Var2.n = (byte) 1;
            uh0Var2.r(z4, z2);
            uh0Var2.C(go4VarArr, jr9Var, j, j3, rz6Var);
            uh0Var2.D(j, z4, true);
            yc3Var.f(uh0Var2);
        }
        l74 l74Var = new l74(this);
        uh0 d = g99Var.d(ut6Var);
        d.getClass();
        d.d(11, l74Var);
        if (z3 && z2) {
            g99Var.p();
        }
    }

    public final void j0(int i) {
        this.g0 = i;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.g = i;
        int w = wt6Var.w(bqbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final void k(long j, boolean[] zArr) {
        g99[] g99VarArr;
        r74 r74Var;
        long j2;
        jte.p(!z());
        ut6 d = this.H.d();
        e0c e0cVar = d.o;
        int i = 0;
        while (true) {
            g99VarArr = this.a;
            if (i >= g99VarArr.length) {
                break;
            }
            if (!e0cVar.q(i)) {
                g99VarArr[i].n();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < g99VarArr.length) {
            if (!e0cVar.q(i2) || g99VarArr[i2].i(d)) {
                r74Var = this;
                j2 = j;
            } else {
                r74Var = this;
                j2 = j;
                r74Var.j(d, i2, zArr[i2], j2);
            }
            i2++;
            this = r74Var;
            j = j2;
        }
    }

    public final void k0(boolean z) {
        if (!z) {
            q74 q74Var = this.W;
            dfb dfbVar = this.h;
            if (q74Var != null && this.V && !dfbVar.a.hasMessages(37)) {
                this.X++;
            }
            int i = this.X;
            if (i > 0) {
                this.O.e(new bm3((Object) this, i, (byte) 6));
            }
            this.X = 0;
            this.V = false;
            dfbVar.g(37);
            q74 q74Var2 = this.W;
            if (q74Var2 != null) {
                W(q74Var2);
                this.W = null;
                this.V = false;
            }
        }
        this.U = z;
        e();
    }

    public final long l(bqb bqbVar, Object obj, long j) {
        ypb ypbVar = this.w;
        int i = bqbVar.g(obj, ypbVar).c;
        aqb aqbVar = this.s;
        bqbVar.n(i, aqbVar);
        if (aqbVar.e != -9223372036854775807L && aqbVar.a() && aqbVar.h) {
            return hac.T(hac.E(aqbVar.f) - aqbVar.e) - (j + ypbVar.e);
        }
        return -9223372036854775807L;
    }

    public final void l0(ot9 ot9Var) {
        this.T = ot9Var;
        e();
    }

    public final Pair m(bqb bqbVar) {
        long j = 0;
        if (bqbVar.p()) {
            return Pair.create(be8.u, 0L);
        }
        int a = bqbVar.a(this.h0);
        Pair i = bqbVar.i(this.s, this.w, a, -9223372036854775807L);
        rz6 u = this.H.u(this.Y, bqbVar, i.first, 0L, true, false);
        long longValue = ((Long) i.second).longValue();
        if (u.c()) {
            Object obj = u.a;
            ypb ypbVar = this.w;
            bqbVar.g(obj, ypbVar);
            if (u.c == ypbVar.e(u.b)) {
                da daVar = da.c;
            }
        } else {
            j = longValue;
        }
        return Pair.create(u, Long.valueOf(j));
    }

    public final void m0(boolean z) {
        this.h0 = z;
        bqb bqbVar = this.Y.a;
        wt6 wt6Var = this.H;
        wt6Var.h = z;
        int w = wt6Var.w(bqbVar);
        if ((w & 1) != 0) {
            V(true);
        } else if ((w & 2) != 0) {
            g();
        }
        t(false);
    }

    public final long n(ut6 ut6Var, int i) {
        if (ut6Var == null) {
            return 0L;
        }
        if (ut6Var.e) {
            g99[] g99VarArr = this.a;
            if (g99VarArr[i].i(ut6Var)) {
                uh0 d = g99VarArr[i].d(ut6Var);
                Objects.requireNonNull(d);
                return d.y;
            }
        }
        return ut6Var.p;
    }

    public final void n0(yia yiaVar) {
        this.Z.a(1);
        e07 e07Var = this.I;
        int size = e07Var.c.size();
        if (yiaVar.c() != size) {
            yiaVar = yiaVar.a().b(0, size);
        }
        e07Var.k = yiaVar;
        u(e07Var.b(), false);
    }

    public final long o(long j) {
        ut6 ut6Var = this.H.l;
        if (ut6Var == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.n0 - ut6Var.p));
    }

    public final void o0(int i) {
        be8 be8Var = this.Y;
        if (be8Var.e != i) {
            if (i != 2) {
                this.s0 = -9223372036854775807L;
            }
            if (i != 3 && be8Var.p) {
                be8Var = be8Var.i(false);
                this.Y = be8Var;
            }
            this.Y = be8Var.h(i);
        }
    }

    public final void p(int i) {
        be8 be8Var = this.Y;
        A0(i, be8Var.n, be8Var.m, be8Var.l);
    }

    public final void p0(vcc vccVar) {
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            byte b = uh0Var.b;
            if (b == 2 || b == 4) {
                uh0Var.d(7, vccVar);
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(7, vccVar);
                }
            }
        }
    }

    public final void q() {
        r0(this.w0);
    }

    public final void q0(Object obj, gs2 gs2Var) {
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 2) {
                byte b = g99Var.d;
                if (b == 5 || b == 3 || b == 1) {
                    uh0 uh0Var2 = g99Var.c;
                    uh0Var2.getClass();
                    uh0Var2.d(1, obj);
                } else {
                    uh0Var.d(1, obj);
                }
            }
        }
        int i = this.Y.e;
        if (i == 3 || i == 2) {
            this.h.h(2);
        }
        if (gs2Var != null) {
            gs2Var.e();
        }
    }

    public final void r(tt6 tt6Var) {
        wt6 wt6Var = this.H;
        ut6 ut6Var = wt6Var.l;
        if (ut6Var != null && ut6Var.a == tt6Var) {
            wt6Var.r(this.n0);
            C();
            return;
        }
        ut6 ut6Var2 = wt6Var.m;
        if (ut6Var2 == null || ut6Var2.a != tt6Var) {
            return;
        }
        D();
    }

    public final void r0(float f) {
        this.w0 = f;
        float f2 = f * this.Q.g;
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.a;
            if (uh0Var.b == 1) {
                uh0Var.d(2, Float.valueOf(f2));
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null) {
                    uh0Var2.d(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void s(IOException iOException, int i) {
        u64 u64Var = new u64(0, iOException, i);
        ut6 ut6Var = this.H.i;
        if (ut6Var != null) {
            u64Var = u64Var.a(ut6Var.g.a);
        }
        ncd.d("ExoPlayerImplInternal", "Playback error", u64Var);
        v0(false, false);
        this.Y = this.Y.f(u64Var);
    }

    public final boolean s0() {
        be8 be8Var = this.Y;
        return be8Var.l && be8Var.n == 0;
    }

    public final void t(boolean z) {
        ut6 ut6Var = this.H.l;
        rz6 rz6Var = ut6Var == null ? this.Y.b : ut6Var.g.a;
        boolean equals = this.Y.k.equals(rz6Var);
        if (!equals) {
            this.Y = this.Y.c(rz6Var);
        }
        be8 be8Var = this.Y;
        be8Var.q = ut6Var == null ? be8Var.s : ut6Var.d();
        be8 be8Var2 = this.Y;
        be8Var2.r = o(be8Var2.q);
        if ((!equals || z) && ut6Var != null && ut6Var.e) {
            y0(ut6Var.g.a, ut6Var.o);
        }
    }

    public final boolean t0(bqb bqbVar, rz6 rz6Var) {
        if (rz6Var.c() || bqbVar.p()) {
            return false;
        }
        int i = bqbVar.g(rz6Var.a, this.w).c;
        aqb aqbVar = this.s;
        bqbVar.n(i, aqbVar);
        return aqbVar.a() && aqbVar.h && aqbVar.e != -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x0303, code lost:
    
        if (r6 != 2) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0482  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(bqb bqbVar, boolean z) {
        wt6 wt6Var;
        boolean z2;
        rz6 rz6Var;
        long j;
        bqb bqbVar2;
        aqb aqbVar;
        long j2;
        int i;
        long j3;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        boolean z6;
        be8 be8Var;
        ypb ypbVar;
        boolean z7;
        wt6 wt6Var2;
        long j4;
        bqb bqbVar3;
        long j5;
        long j6;
        int i4;
        bqb bqbVar4;
        p74 p74Var;
        int i5;
        long longValue;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        bqb bqbVar5;
        rz6 rz6Var2;
        g99[] g99VarArr;
        wt6 wt6Var3;
        boolean z12;
        long j7;
        long j8;
        be8 be8Var2 = this.Y;
        q74 q74Var = this.m0;
        wt6 wt6Var4 = this.H;
        int i6 = this.g0;
        boolean z13 = this.h0;
        aqb aqbVar2 = this.s;
        ypb ypbVar2 = this.w;
        boolean z14 = this.R;
        if (bqbVar.p()) {
            rz6 rz6Var3 = be8.u;
            boolean z15 = (rz6Var3.equals(be8Var2.b) && be8Var2.s == 0) ? false : true;
            bqbVar3 = bqbVar;
            p74Var = new p74(rz6Var3, 0L, -9223372036854775807L, false, true, false, z15, z15 && z && !be8Var2.a.p() && !be8Var2.a.g(be8Var2.b.a, ypbVar2).f, 4);
        } else {
            rz6 rz6Var4 = be8Var2.b;
            Object obj = rz6Var4.a;
            bqb bqbVar6 = be8Var2.a;
            if (bqbVar6.p() || bqbVar6.g(rz6Var4.a, ypbVar2).f) {
                wt6Var = wt6Var4;
                z2 = true;
            } else {
                wt6Var = wt6Var4;
                z2 = false;
            }
            long j9 = (be8Var2.b.c() || z2) ? be8Var2.c : be8Var2.s;
            if (q74Var != null) {
                rz6Var = rz6Var4;
                j = 1;
                bqbVar2 = bqbVar;
                Pair S = S(bqbVar2, q74Var, true, i6, z13, aqbVar2, ypbVar2);
                if (S == null) {
                    i = bqbVar2.a(z13);
                    longValue = j9;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                } else {
                    long j10 = q74Var.c;
                    Object obj2 = S.first;
                    if (j10 == -9223372036854775807L) {
                        i = bqbVar2.g(obj2, ypbVar2).c;
                        longValue = j9;
                        z8 = false;
                    } else {
                        longValue = ((Long) S.second).longValue();
                        obj = obj2;
                        i = -1;
                        z8 = true;
                    }
                    z9 = be8Var2.e == 4;
                    z10 = z8;
                    z11 = false;
                }
                z4 = z11;
                z5 = z10;
                z3 = z9;
                i2 = -1;
                long j11 = longValue;
                aqbVar = aqbVar2;
                j2 = j11;
            } else {
                rz6Var = rz6Var4;
                j = 1;
                bqbVar2 = bqbVar;
                if (be8Var2.a.p()) {
                    i = bqbVar2.a(z13);
                    aqbVar = aqbVar2;
                } else if (bqbVar2.b(obj) == -1) {
                    int T = T(aqbVar2, ypbVar2, i6, z13, obj, be8Var2.a, bqbVar2);
                    aqbVar = aqbVar2;
                    bqbVar2 = bqbVar2;
                    ypbVar2 = ypbVar2;
                    if (T == -1) {
                        i3 = bqbVar2.a(z13);
                        z6 = true;
                    } else {
                        i3 = T;
                        z6 = false;
                    }
                    z4 = z6;
                    obj = obj;
                    i = i3;
                    j2 = j9;
                    i2 = -1;
                    z3 = false;
                    z5 = false;
                } else {
                    aqbVar = aqbVar2;
                    if (j9 == -9223372036854775807L) {
                        int i7 = bqbVar2.g(obj, ypbVar2).c;
                        obj = obj;
                        i = i7;
                    } else if (z2) {
                        be8Var2.a.g(rz6Var.a, ypbVar2);
                        if (be8Var2.a.m(ypbVar2.c, aqbVar, 0L).m == be8Var2.a.b(rz6Var.a)) {
                            Pair i8 = bqbVar2.i(aqbVar, ypbVar2, bqbVar2.g(obj, ypbVar2).c, j9 + ypbVar2.e);
                            obj = i8.first;
                            j3 = ((Long) i8.second).longValue();
                        } else if (bqbVar2.g(obj, ypbVar2).d != -9223372036854775807L) {
                            j3 = hac.j(j9, 0L, ypbVar2.d - 1);
                            obj = obj;
                        } else {
                            obj = obj;
                            j3 = j9;
                        }
                        j2 = j3;
                        i = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                    } else {
                        obj = obj;
                        j2 = j9;
                        i = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                    }
                }
                j2 = j9;
                i2 = -1;
                z3 = false;
                z4 = false;
                z5 = false;
            }
            if (i != i2) {
                Pair i9 = bqbVar2.i(aqbVar, ypbVar2, i, -9223372036854775807L);
                obj = i9.first;
                j2 = ((Long) i9.second).longValue();
                be8Var = be8Var2;
                ypbVar = ypbVar2;
                z7 = z14;
                wt6Var2 = wt6Var;
                j4 = -9223372036854775807L;
            } else {
                be8Var = be8Var2;
                ypbVar = ypbVar2;
                z7 = z14;
                wt6Var2 = wt6Var;
                j4 = j2;
            }
            Object obj3 = obj;
            rz6 u = wt6Var2.u(be8Var, bqbVar, obj3, j2, z7, z2);
            be8 be8Var3 = be8Var;
            bqbVar3 = bqbVar;
            int i10 = u.e;
            boolean z16 = i10 == i2 || ((i5 = rz6Var.e) != i2 && i10 >= i5);
            boolean equals = rz6Var.a.equals(obj3);
            boolean z17 = equals && !rz6Var.c() && !u.c() && z16;
            if (!z2 && j9 == j4) {
                Object obj4 = rz6Var.a;
                int i11 = rz6Var.b;
                if (obj4.equals(u.a)) {
                    bqbVar3.g(u.a, ypbVar);
                    if (rz6Var.c()) {
                        ypbVar.g(i11);
                    }
                    if (u.c()) {
                        ypbVar.g(u.b);
                    }
                }
            }
            if (z17) {
                u = rz6Var;
            }
            if (!u.c()) {
                if (equals && rz6Var.c()) {
                    bqbVar3.g(obj3, ypbVar).getClass();
                    ba a = da.c.a(rz6Var.b);
                    a.getClass();
                    long j12 = be8Var3.c;
                    if (j12 == -9223372036854775807L || 0 > j12) {
                        int i12 = a.a;
                        int i13 = rz6Var.c;
                        if (i12 > i13 && a.d[i13] == 2) {
                            long j13 = bqbVar3.g(obj3, ypbVar).d;
                            j5 = j13 != -9223372036854775807L ? Math.min(j13 - j, j2) : j2;
                            j6 = j5;
                        }
                    }
                }
                j5 = j2;
                j6 = j4;
            } else if (u.equals(rz6Var)) {
                j6 = j4;
                j5 = be8Var3.s;
            } else {
                bqbVar3.g(u.a, ypbVar);
                if (u.c == ypbVar.e(u.b)) {
                    da daVar = da.c;
                }
                j6 = j4;
                j5 = 0;
            }
            boolean z18 = (u.equals(be8Var3.b) && j5 == be8Var3.s) ? false : true;
            int i14 = bqbVar3.b(be8Var3.b.a) == -1 ? 4 : 3;
            Object obj5 = u.a;
            Object obj6 = be8Var3.b.a;
            boolean equals2 = obj5.equals(obj6);
            bqb bqbVar7 = obj6;
            if (equals2) {
                bqbVar7 = obj6;
                if (u.b != -1) {
                    bqbVar3.g(u.a, ypbVar).getClass();
                    ba a2 = da.c.a(u.b);
                    int i15 = u.c;
                    int[] iArr = a2.d;
                    if (i15 < iArr.length) {
                        int i16 = iArr[i15];
                        bqbVar7 = i15;
                    }
                    i4 = 0;
                    bqbVar4 = i15;
                    p74Var = new p74(u, j5, j6, z3, z4, z5, z18, (z18 || !z || be8Var3.a.p() || be8Var3.a.g(be8Var3.b.a, ypbVar).f) ? false : true, i4);
                }
            }
            i4 = i14;
            bqbVar4 = bqbVar7;
            p74Var = new p74(u, j5, j6, z3, z4, z5, z18, (z18 || !z || be8Var3.a.p() || be8Var3.a.g(be8Var3.b.a, ypbVar).f) ? false : true, i4);
        }
        rz6 rz6Var5 = p74Var.a;
        long j14 = p74Var.b;
        try {
            if (p74Var.e) {
                if (this.Y.e != 1) {
                    o0(4);
                }
                O(false, false, false, true);
            }
            g99[] g99VarArr2 = this.a;
            int length = g99VarArr2.length;
            int i17 = 0;
            bqb bqbVar8 = bqbVar4;
            while (i17 < length) {
                g99 g99Var = g99VarArr2[i17];
                uh0 uh0Var = g99Var.a;
                boolean equals3 = uh0Var.G.equals(bqbVar3);
                if (equals3 == 0) {
                    uh0Var.G = bqbVar3;
                    uh0Var.J();
                    uh0Var.z();
                }
                uh0 uh0Var2 = g99Var.c;
                if (uh0Var2 != null && !uh0Var2.G.equals(bqbVar3)) {
                    uh0Var2.G = bqbVar3;
                    uh0Var2.J();
                    uh0Var2.z();
                }
                i17++;
                bqbVar8 = equals3;
            }
            try {
                if (p74Var.g) {
                    bqb bqbVar9 = bqbVar3;
                    if (!bqbVar9.p()) {
                        try {
                            for (ut6 ut6Var = this.H.i; ut6Var != null; ut6Var = ut6Var.m) {
                                if (ut6Var.g.a.equals(rz6Var5)) {
                                    ut6Var.g = this.H.l(bqbVar9, ut6Var.g);
                                }
                            }
                            rz6Var2 = rz6Var5;
                            try {
                                j14 = X(rz6Var2, j14, z(), p74Var.d);
                                be8 be8Var4 = this.Y;
                                rz6 rz6Var6 = rz6Var2;
                                C0(bqbVar, rz6Var6, be8Var4.a, be8Var4.b, !p74Var.f ? j14 : -9223372036854775807L, false);
                                if (!p74Var.g || p74Var.c != this.Y.c) {
                                    long j15 = p74Var.c;
                                    z12 = p74Var.h;
                                    if (z12) {
                                        j7 = this.Y.d;
                                        j8 = j14;
                                    } else {
                                        j8 = j14;
                                        j7 = j8;
                                    }
                                    this.Y = x(rz6Var6, j8, j15, j7, z12, p74Var.i);
                                }
                                P();
                                R(bqbVar, this.Y.a);
                                this.Y = this.Y.j(bqbVar);
                                if (!bqbVar.p()) {
                                    this.m0 = null;
                                }
                                t(false);
                                this.h.h(2);
                            } catch (Throwable th) {
                                th = th;
                                j14 = j14;
                                bqbVar5 = bqbVar9;
                                be8 be8Var5 = this.Y;
                                bqb bqbVar10 = be8Var5.a;
                                rz6 rz6Var7 = be8Var5.b;
                                rz6 rz6Var8 = rz6Var2;
                                C0(bqbVar5, rz6Var8, bqbVar10, rz6Var7, !p74Var.f ? j14 : -9223372036854775807L, false);
                                if (!p74Var.g) {
                                }
                                long j16 = p74Var.c;
                                boolean z19 = p74Var.h;
                                this.Y = x(rz6Var8, j14, j16, !z19 ? j14 : this.Y.d, z19, p74Var.i);
                                P();
                                R(bqbVar5, this.Y.a);
                                this.Y = this.Y.j(bqbVar5);
                                if (!bqbVar5.p()) {
                                }
                                t(false);
                                this.h.h(2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            rz6Var2 = rz6Var5;
                        }
                    }
                } else {
                    try {
                        long[] jArr = new long[this.a.length];
                        int i18 = 0;
                        while (true) {
                            g99VarArr = this.a;
                            if (i18 >= g99VarArr.length) {
                                break;
                            }
                            jArr[i18] = n(this.H.j[i18], i18);
                            i18++;
                        }
                        long[] jArr2 = new long[g99VarArr.length];
                        int i19 = 0;
                        while (true) {
                            int length2 = this.a.length;
                            wt6Var3 = this.H;
                            if (i19 >= length2) {
                                break;
                            }
                            jArr2[i19] = n(wt6Var3.k[i19], i19);
                            i19++;
                        }
                        int x = wt6Var3.x(bqbVar3, this.n0, jArr, jArr2);
                        if ((x & 1) != 0) {
                            V(false);
                        } else if ((x & 2) != 0) {
                            g();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bqbVar8 = bqbVar3;
                        bqbVar5 = bqbVar8;
                        rz6Var2 = rz6Var5;
                        be8 be8Var52 = this.Y;
                        bqb bqbVar102 = be8Var52.a;
                        rz6 rz6Var72 = be8Var52.b;
                        rz6 rz6Var82 = rz6Var2;
                        C0(bqbVar5, rz6Var82, bqbVar102, rz6Var72, !p74Var.f ? j14 : -9223372036854775807L, false);
                        if (!p74Var.g || p74Var.c != this.Y.c) {
                            long j162 = p74Var.c;
                            boolean z192 = p74Var.h;
                            this.Y = x(rz6Var82, j14, j162, !z192 ? j14 : this.Y.d, z192, p74Var.i);
                        }
                        P();
                        R(bqbVar5, this.Y.a);
                        this.Y = this.Y.j(bqbVar5);
                        if (!bqbVar5.p()) {
                            this.m0 = null;
                        }
                        t(false);
                        this.h.h(2);
                        throw th;
                    }
                }
                rz6Var2 = rz6Var5;
                be8 be8Var42 = this.Y;
                rz6 rz6Var62 = rz6Var2;
                C0(bqbVar, rz6Var62, be8Var42.a, be8Var42.b, !p74Var.f ? j14 : -9223372036854775807L, false);
                if (!p74Var.g) {
                }
                long j152 = p74Var.c;
                z12 = p74Var.h;
                if (z12) {
                }
                this.Y = x(rz6Var62, j8, j152, j7, z12, p74Var.i);
                P();
                R(bqbVar, this.Y.a);
                this.Y = this.Y.j(bqbVar);
                if (!bqbVar.p()) {
                }
                t(false);
                this.h.h(2);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            bqbVar5 = bqbVar3;
        }
    }

    public final void u0() {
        ut6 ut6Var = this.H.i;
        if (ut6Var == null) {
            return;
        }
        e0c e0cVar = ut6Var.o;
        int i = 0;
        while (true) {
            g99[] g99VarArr = this.a;
            if (i >= g99VarArr.length) {
                return;
            }
            if (e0cVar.q(i)) {
                g99VarArr[i].p();
            }
            i++;
        }
    }

    public final void v(tt6 tt6Var) {
        ut6 ut6Var;
        r74 r74Var;
        wt6 wt6Var = this.H;
        ut6 ut6Var2 = wt6Var.l;
        yc3 yc3Var = this.y;
        if (ut6Var2 == null || ut6Var2.a != tt6Var) {
            int i = 0;
            while (true) {
                if (i >= wt6Var.q.size()) {
                    ut6Var = null;
                    break;
                }
                ut6Var = (ut6) wt6Var.q.get(i);
                if (ut6Var.a == tt6Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (ut6Var != null) {
                jte.p(!ut6Var.e);
                float f = yc3Var.g().a;
                be8 be8Var = this.Y;
                ut6Var.f(f, be8Var.a, be8Var.l);
                ut6 ut6Var3 = wt6Var.m;
                if (ut6Var3 == null || ut6Var3.a != tt6Var) {
                    return;
                }
                D();
                return;
            }
            return;
        }
        ut6Var2.getClass();
        if (!ut6Var2.e) {
            float f2 = yc3Var.g().a;
            be8 be8Var2 = this.Y;
            ut6Var2.f(f2, be8Var2.a, be8Var2.l);
        }
        y0(ut6Var2.g.a, ut6Var2.o);
        if (ut6Var2 == wt6Var.i) {
            Q(ut6Var2.g.b, true);
            jte.p(!z());
            k(wt6Var.d().e(), new boolean[this.a.length]);
            a0(ut6Var2);
            be8 be8Var3 = this.Y;
            rz6 rz6Var = be8Var3.b;
            long j = ut6Var2.g.b;
            r74Var = this;
            r74Var.Y = x(rz6Var, j, be8Var3.c, j, false, 5);
        } else {
            r74Var = this;
        }
        r74Var.C();
    }

    public final void v0(boolean z, boolean z2) {
        O(z || !this.i0, false, true, false);
        this.Z.a(z2 ? 1 : 0);
        xc3 xc3Var = this.f;
        ConcurrentHashMap concurrentHashMap = xc3Var.o;
        we8 we8Var = this.L;
        wc3 wc3Var = (wc3) concurrentHashMap.get(we8Var);
        if (wc3Var != null) {
            int i = wc3Var.a - 1;
            wc3Var.a = i;
            if (i == 0) {
                concurrentHashMap.remove(we8Var);
                xc3Var.d();
            }
        }
        this.Q.c(1, this.Y.l);
        o0(1);
    }

    public final void w(ce8 ce8Var, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.Z.a(1);
            }
            this.Y = this.Y.g(ce8Var);
        }
        float f2 = ce8Var.a;
        ut6 ut6Var = this.H.i;
        while (true) {
            i = 0;
            if (ut6Var == null) {
                break;
            }
            t74[] t74VarArr = (t74[]) ut6Var.o.d;
            int length = t74VarArr.length;
            while (i < length) {
                t74 t74Var = t74VarArr[i];
                if (t74Var != null) {
                    t74Var.r(f2);
                }
                i++;
            }
            ut6Var = ut6Var.m;
        }
        g99[] g99VarArr = this.a;
        int length2 = g99VarArr.length;
        while (i < length2) {
            g99 g99Var = g99VarArr[i];
            float f3 = ce8Var.a;
            g99Var.a.E(f, f3);
            uh0 uh0Var = g99Var.c;
            if (uh0Var != null) {
                uh0Var.E(f, f3);
            }
            i++;
        }
    }

    public final void w0() {
        yc3 yc3Var = this.y;
        yc3Var.b = false;
        tf2 tf2Var = (tf2) yc3Var.c;
        if (tf2Var.c) {
            tf2Var.a(tf2Var.h());
            tf2Var.c = false;
        }
        for (g99 g99Var : this.a) {
            uh0 uh0Var = g99Var.c;
            uh0 uh0Var2 = g99Var.a;
            if (g99.k(uh0Var2)) {
                g99.b(uh0Var2);
            }
            if (uh0Var != null && uh0Var.n != 0) {
                g99.b(uh0Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final be8 x(rz6 rz6Var, long j, long j2, long j3, boolean z, int i) {
        y79 y79Var;
        ut6 ut6Var;
        boolean z2;
        this.q0 = (!this.q0 && j == this.Y.s && rz6Var.equals(this.Y.b)) ? false : true;
        P();
        be8 be8Var = this.Y;
        vzb vzbVar = be8Var.h;
        e0c e0cVar = be8Var.i;
        List list = be8Var.j;
        if (this.I.l) {
            ut6 ut6Var2 = this.H.i;
            if (ut6Var2 == null) {
                vzbVar = vzb.d;
                e0cVar = this.e;
            } else {
                vzbVar = ut6Var2.n;
                e0cVar = ut6Var2.o;
            }
            t74[] t74VarArr = (t74[]) e0cVar.d;
            jo5 jo5Var = new jo5(4);
            boolean z3 = false;
            for (t74 t74Var : t74VarArr) {
                if (t74Var != null) {
                    nf7 nf7Var = t74Var.i(0).m;
                    if (nf7Var == null) {
                        jo5Var.c(new nf7(new lf7[0]));
                    } else {
                        jo5Var.c(nf7Var);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                y79Var = jo5Var.f();
            } else {
                ko5 ko5Var = mo5.b;
                y79Var = y79.e;
            }
            list = y79Var;
            if (ut6Var2 != null) {
                vt6 vt6Var = ut6Var2.g;
                if (vt6Var.d != j2) {
                    ut6Var2.g = vt6Var.a(j2);
                }
            }
            g99[] g99VarArr = this.a;
            if (!z() && (ut6Var = this.H.i) != null) {
                e0c e0cVar2 = ut6Var.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= g99VarArr.length) {
                        z2 = true;
                        break;
                    }
                    if (e0cVar2.q(i2)) {
                        if (g99VarArr[i2].a.b != 1) {
                            z2 = false;
                            break;
                        }
                        if (((f99[]) e0cVar2.c)[i2].a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.k0) {
                    this.k0 = z5;
                    if (!z5 && this.Y.p) {
                        this.h.h(2);
                    }
                }
            }
        } else if (!rz6Var.equals(be8Var.b)) {
            vzbVar = vzb.d;
            e0cVar = this.e;
            ko5 ko5Var2 = mo5.b;
            list = y79.e;
        }
        e0c e0cVar3 = e0cVar;
        List list2 = list;
        vzb vzbVar2 = vzbVar;
        if (z) {
            o74 o74Var = this.Z;
            if (!o74Var.d || o74Var.e == 5) {
                o74Var.a = true;
                o74Var.d = true;
                o74Var.e = i;
            } else {
                jte.f(i == 5);
            }
        }
        be8 be8Var2 = this.Y;
        return be8Var2.d(rz6Var, j, j2, j3, o(be8Var2.q), vzbVar2, e0cVar3, list2);
    }

    public final void x0() {
        ut6 ut6Var = this.H.l;
        boolean z = this.f0 || (ut6Var != null && ut6Var.a.f());
        be8 be8Var = this.Y;
        if (z != be8Var.g) {
            this.Y = be8Var.b(z);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void y0(rz6 rz6Var, e0c e0cVar) {
        boolean z;
        int length;
        int i;
        ut6 ut6Var = this.H.l;
        ut6Var.getClass();
        o(ut6Var.d());
        if (t0(this.Y.a, ut6Var.g.a)) {
            long j = this.J.h;
        }
        bqb bqbVar = this.Y.a;
        float f = this.y.g().a;
        boolean z2 = this.Y.l;
        t74[] t74VarArr = (t74[]) e0cVar.d;
        xc3 xc3Var = this.f;
        xc3Var.getClass();
        qo5 qo5Var = xc3Var.n;
        we8 we8Var = this.L;
        Integer num = (Integer) qo5Var.get(we8Var.a);
        int intValue = (num == null || num.intValue() == -1) ? -1 : num.intValue();
        wc3 wc3Var = (wc3) xc3Var.o.get(we8Var);
        wc3Var.getClass();
        if (intValue == -1) {
            xs6 xs6Var = bqbVar.m(bqbVar.g(rz6Var.a, xc3Var.b).c, xc3Var.a, 0L).b.b;
            if (xs6Var != null) {
                String scheme = xs6Var.a.getScheme();
                if (TextUtils.isEmpty(scheme) || xc3.q.contains(scheme)) {
                    z = true;
                    length = t74VarArr.length;
                    i = 0;
                    int i2 = 0;
                    while (true) {
                        int i3 = 13107200;
                        if (i >= length) {
                            t74 t74Var = t74VarArr[i];
                            if (t74Var != null) {
                                switch (t74Var.c().c) {
                                    case -2:
                                        i3 = 0;
                                        i2 += i3;
                                        break;
                                    case -1:
                                    case 1:
                                        i2 += i3;
                                        break;
                                    case 0:
                                        i3 = 144310272;
                                        i2 += i3;
                                        break;
                                    case 2:
                                        i3 = z ? 19660800 : 131072000;
                                        i2 += i3;
                                        break;
                                    case 3:
                                    case 5:
                                    case 6:
                                        i3 = 131072;
                                        i2 += i3;
                                        break;
                                    case 4:
                                        i3 = 26214400;
                                        i2 += i3;
                                        break;
                                    default:
                                        i98.g();
                                        break;
                                }
                                return;
                            }
                            i++;
                        } else {
                            intValue = hac.i(i2, 13107200, 210239488);
                        }
                    }
                }
            }
            z = false;
            length = t74VarArr.length;
            i = 0;
            int i22 = 0;
            while (true) {
                int i32 = 13107200;
                if (i >= length) {
                }
                i++;
            }
        }
        wc3Var.c = intValue;
        xc3Var.d();
    }

    public final boolean z() {
        for (int i = 0; i < this.a.length; i++) {
            wt6 wt6Var = this.H;
            if (wt6Var.i != wt6Var.j[i]) {
                return true;
            }
        }
        return false;
    }

    public final void z0(List list, int i, int i2) {
        this.Z.a(1);
        e07 e07Var = this.I;
        e07Var.getClass();
        ArrayList arrayList = e07Var.c;
        jte.f(i >= 0 && i <= i2 && i2 <= arrayList.size());
        jte.f(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((d07) arrayList.get(i3)).a.t((bt6) list.get(i3 - i));
        }
        u(e07Var.b(), false);
    }
}
