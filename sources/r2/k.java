package r2;

import a8.ma;
import a8.xa;
import android.net.Uri;
import android.os.Looper;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import e2.t0;
import h9.i0;
import j$.util.Objects;
import j2.c0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.ui.ActionBar.i5;
import x2.e0;
import x2.j1;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class k extends x2.a {
    public final c h;
    public final i5 i;
    public final nb.a j;
    public final q2.m k;
    public final qb.a l;
    public final boolean m;
    public final int n;
    public final s2.d o;
    public final long p;
    public f0 q;
    public c0 r;
    public l0 s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public k(l0 l0Var, i5 i5Var, c cVar, nb.a aVar, q2.m mVar, qb.a aVar2, s2.d dVar, long j3, boolean z10, int i7) {
        this.s = l0Var;
        this.q = l0Var.c;
        this.i = i5Var;
        this.h = cVar;
        this.j = aVar;
        this.k = mVar;
        this.l = aVar2;
        this.o = dVar;
        this.p = j3;
        this.m = z10;
        this.n = i7;
    }

    public static s2.i u(long j3, List list) {
        s2.i iVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.i iVar2 = (s2.i) list.get(i7);
            long j10 = iVar2.e;
            if (j10 > j3 || !iVar2.x) {
                if (j10 > j3) {
                    break;
                }
            } else {
                iVar = iVar2;
            }
        }
        return iVar;
    }

    @Override // x2.a
    public final boolean a(l0 l0Var) {
        l0 i7 = i();
        g0 g0Var = i7.b;
        g0Var.getClass();
        g0 g0Var2 = l0Var.b;
        return g0Var2 != null && g0Var2.a.equals(g0Var.a) && g0Var2.e.equals(g0Var.e) && Objects.equals(g0Var2.c, g0Var.c) && i7.c.equals(l0Var.c);
    }

    @Override // x2.a
    public final e0 c(x2.g0 g0Var, h6.m mVar, long j3) {
        xa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.c, 0, g0Var);
        c0 c0Var = this.r;
        m2.i iVar = this.g;
        iVar.getClass();
        return new j(this.h, this.o, this.i, c0Var, this.k, jVar, this.l, b10, mVar, this.j, this.m, this.n, iVar);
    }

    @Override // x2.a
    public final synchronized l0 i() {
        return this.s;
    }

    @Override // x2.a
    public final void k() {
        s2.d dVar = this.o;
        b3.p pVar = dVar.h;
        if (pVar != null) {
            pVar.a();
        }
        t0 t0Var = dVar.w;
        if (t0Var != null) {
            throw t0Var;
        }
        Uri uri = dVar.G;
        if (uri != null) {
            dVar.h(uri);
        }
    }

    @Override // x2.a
    public final void m(c0 c0Var) {
        this.r = c0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.i iVar = this.g;
        iVar.getClass();
        q2.m mVar = this.k;
        mVar.r1(myLooper, iVar);
        mVar.a();
        xa b10 = b(null);
        g0 g0Var = i().b;
        g0Var.getClass();
        Uri uri = g0Var.a;
        s2.d dVar = this.o;
        dVar.getClass();
        dVar.n = h2.l0.q(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        ma.k(uri, "The uri must be set.");
        b3.s sVar = new b3.s(((j2.g) dVar.a.a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.U());
        ma.p(dVar.h == null);
        b3.p pVar = new b3.p("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = pVar;
        pVar.f(sVar, dVar, dVar.c.R4(sVar.c));
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        j jVar = (j) e0Var;
        jVar.b.e.remove(jVar);
        for (p pVar : jVar.K) {
            if (pVar.U) {
                for (o oVar : pVar.M) {
                    oVar.l();
                    q2.g gVar = oVar.h;
                    if (gVar != null) {
                        gVar.c(oVar.e);
                        oVar.h = null;
                        oVar.g = null;
                    }
                }
            }
            h hVar = pVar.d;
            int m10 = hVar.r.m();
            s2.d dVar = hVar.g;
            Uri c10 = hVar.e[m10].c();
            s2.c cVar = (s2.c) dVar.d.get(c10);
            if (cVar != null) {
                s2.b bVar = (s2.b) p5.c.i(cVar.b, c10, c10);
                bVar.getClass();
                bVar.x = false;
            }
            hVar.n = null;
            pVar.s.e(pVar);
            pVar.I.removeCallbacksAndMessages(null);
            pVar.Y = true;
            pVar.J.clear();
        }
        jVar.H = null;
    }

    @Override // x2.a
    public final void q() {
        s2.d dVar = this.o;
        dVar.G = null;
        dVar.H = null;
        dVar.s = null;
        dVar.x = null;
        dVar.y = null;
        dVar.E = null;
        dVar.F = null;
        dVar.w = null;
        dVar.J = -9223372036854775807L;
        dVar.h.e(null);
        dVar.h = null;
        HashMap hashMap = dVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((s2.c) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((s2.b) it2.next()).c.e(null);
            }
        }
        dVar.n.removeCallbacksAndMessages(null);
        dVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // x2.a
    public final synchronized void t(l0 l0Var) {
        this.s = l0Var;
    }

    public final void v(s2.n nVar) {
        long j3;
        j1 j1Var;
        long j10;
        long j11;
        long j12;
        boolean z10 = nVar.p;
        boolean z11 = nVar.g;
        i0 i0Var = nVar.r;
        long j13 = nVar.u;
        long j14 = nVar.e;
        int i7 = nVar.d;
        long j15 = nVar.h;
        long h02 = z10 ? h2.l0.h0(j15) : -9223372036854775807L;
        long j16 = (i7 == 2 || i7 == 1) ? h02 : -9223372036854775807L;
        s2.d dVar = this.o;
        dVar.s.getClass();
        nb.a aVar = new nb.a(23);
        long j17 = 0;
        if (dVar.I) {
            s2.m mVar = nVar.v;
            long j18 = j15 - dVar.J;
            boolean z12 = nVar.o;
            long j19 = z12 ? j18 + j13 : -9223372036854775807L;
            long S = nVar.p ? h2.l0.S(h2.l0.C(this.p)) - (j15 + j13) : 0L;
            long j20 = this.q.a;
            if (j20 != -9223372036854775807L) {
                j11 = h2.l0.S(j20);
            } else {
                if (j14 != -9223372036854775807L) {
                    j10 = j13 - j14;
                } else {
                    j10 = mVar.d;
                    if (j10 == -9223372036854775807L || nVar.n == -9223372036854775807L) {
                        j10 = mVar.c;
                        if (j10 == -9223372036854775807L) {
                            j10 = 3 * nVar.m;
                        }
                    }
                }
                j11 = j10 + S;
            }
            long j21 = j13 + S;
            long j22 = h2.l0.j(j11, S, j21);
            f0 f0Var = i().c;
            boolean z13 = f0Var.d == -3.4028235E38f && f0Var.e == -3.4028235E38f && mVar.c == -9223372036854775807L && mVar.d == -9223372036854775807L;
            e2.e0 a10 = this.q.a();
            a10.a = h2.l0.h0(j22);
            a10.d = z13 ? 1.0f : this.q.d;
            a10.e = z13 ? 1.0f : this.q.e;
            f0 f0Var2 = new f0(a10);
            this.q = f0Var2;
            if (j14 == -9223372036854775807L) {
                j14 = j21 - h2.l0.S(f0Var2.a);
            }
            if (z11) {
                j17 = j14;
            } else {
                s2.i u10 = u(j14, nVar.s);
                if (u10 != null) {
                    j12 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    s2.k kVar = (s2.k) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j14), true));
                    s2.i u11 = u(j14, kVar.y);
                    j12 = u11 != null ? u11.e : kVar.e;
                }
                j17 = j12;
            }
            j1Var = new j1(j16, h02, j19, nVar.u, j18, j17, true, !z12, i7 == 2 && nVar.f, aVar, i(), this.q);
        } else {
            if (j14 == -9223372036854775807L || i0Var.isEmpty()) {
                j3 = 0;
            } else {
                if (!z11 && j14 != j13) {
                    j14 = ((s2.k) i0Var.get(h2.l0.d(i0Var, Long.valueOf(j14), true))).e;
                }
                j3 = j14;
            }
            long j23 = nVar.u;
            j1Var = new j1(j16, h02, j23, j23, 0L, j3, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
