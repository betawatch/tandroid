package r2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.Looper;
import e2.f0;
import e2.g0;
import e2.l0;
import e2.m0;
import e2.t0;
import h9.i0;
import j$.util.Objects;
import j2.d0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
import x2.e0;
import x2.i1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k extends x2.a {
    public final c h;
    public final org.telegram.ui.Components.n i;
    public final sa.d j;
    public final q2.m k;
    public final pb.b l;
    public final boolean m;
    public final int n;
    public final s2.d o;
    public final long p;
    public f0 q;
    public d0 r;
    public l0 s;

    static {
        m0.a("media3.exoplayer.hls");
    }

    public k(l0 l0Var, org.telegram.ui.Components.n nVar, c cVar, sa.d dVar, q2.m mVar, pb.b bVar, s2.d dVar2, long j3, boolean z9, int i7) {
        this.s = l0Var;
        this.q = l0Var.c;
        this.i = nVar;
        this.h = cVar;
        this.j = dVar;
        this.k = mVar;
        this.l = bVar;
        this.o = dVar2;
        this.p = j3;
        this.m = z9;
        this.n = i7;
    }

    public static s2.h u(long j3, List list) {
        s2.h hVar = null;
        for (int i7 = 0; i7 < list.size(); i7++) {
            s2.h hVar2 = (s2.h) list.get(i7);
            long j10 = hVar2.e;
            if (j10 > j3 || !hVar2.x) {
                if (j10 > j3) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
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
        wa b10 = b(g0Var);
        q2.j jVar = new q2.j(this.d.c, 0, g0Var);
        d0 d0Var = this.r;
        m2.j jVar2 = this.g;
        jVar2.getClass();
        return new j(this.h, this.o, this.i, d0Var, this.k, jVar, this.l, b10, mVar, this.j, this.m, this.n, jVar2);
    }

    @Override // x2.a
    public final synchronized l0 i() {
        return this.s;
    }

    @Override // x2.a
    public final void k() {
        s2.d dVar = this.o;
        b3.o oVar = dVar.h;
        if (oVar != null) {
            oVar.a();
        }
        t0 t0Var = dVar.w;
        if (t0Var != null) {
            throw t0Var;
        }
        Uri uri = dVar.F;
        if (uri != null) {
            dVar.h(uri);
        }
    }

    @Override // x2.a
    public final void m(d0 d0Var) {
        this.r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        m2.j jVar = this.g;
        jVar.getClass();
        q2.m mVar = this.k;
        mVar.E(myLooper, jVar);
        mVar.a();
        wa b10 = b(null);
        g0 g0Var = i().b;
        g0Var.getClass();
        Uri uri = g0Var.a;
        s2.d dVar = this.o;
        dVar.getClass();
        dVar.n = h2.m0.q(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(((j2.g) dVar.a.a).createDataSource(), new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.Y());
        ia.p(dVar.h == null);
        b3.o oVar = new b3.o("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = oVar;
        oVar.f(rVar, dVar, dVar.c.X0(rVar.c));
    }

    @Override // x2.a
    public final void o(e0 e0Var) {
        j jVar = (j) e0Var;
        jVar.b.e.remove(jVar);
        for (p pVar : jVar.J) {
            if (pVar.T) {
                for (o oVar : pVar.L) {
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
                s2.b bVar = (s2.b) f1.l(cVar.b, c10, c10);
                bVar.getClass();
                bVar.x = false;
            }
            hVar.n = null;
            pVar.s.e(pVar);
            pVar.H.removeCallbacksAndMessages(null);
            pVar.X = true;
            pVar.I.clear();
        }
        jVar.G = null;
    }

    @Override // x2.a
    public final void q() {
        s2.d dVar = this.o;
        dVar.F = null;
        dVar.G = null;
        dVar.s = null;
        dVar.x = null;
        dVar.y = null;
        dVar.D = null;
        dVar.E = null;
        dVar.w = null;
        dVar.I = -9223372036854775807L;
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

    public final void v(s2.m mVar) {
        long j3;
        i1 i1Var;
        long j10;
        long j11;
        long j12;
        boolean z9 = mVar.p;
        boolean z10 = mVar.g;
        i0 i0Var = mVar.r;
        long j13 = mVar.u;
        long j14 = mVar.e;
        int i7 = mVar.d;
        long j15 = mVar.h;
        long h02 = z9 ? h2.m0.h0(j15) : -9223372036854775807L;
        long j16 = (i7 == 2 || i7 == 1) ? h02 : -9223372036854775807L;
        s2.d dVar = this.o;
        dVar.s.getClass();
        qb.a aVar = new qb.a(22);
        long j17 = 0;
        if (dVar.H) {
            s2.l lVar = mVar.v;
            long j18 = j15 - dVar.I;
            boolean z11 = mVar.o;
            long j19 = z11 ? j18 + j13 : -9223372036854775807L;
            long S = mVar.p ? h2.m0.S(h2.m0.C(this.p)) - (j15 + j13) : 0L;
            long j20 = this.q.a;
            if (j20 != -9223372036854775807L) {
                j11 = h2.m0.S(j20);
            } else {
                if (j14 != -9223372036854775807L) {
                    j10 = j13 - j14;
                } else {
                    j10 = lVar.d;
                    if (j10 == -9223372036854775807L || mVar.n == -9223372036854775807L) {
                        j10 = lVar.c;
                        if (j10 == -9223372036854775807L) {
                            j10 = 3 * mVar.m;
                        }
                    }
                }
                j11 = j10 + S;
            }
            long j21 = j13 + S;
            long j22 = h2.m0.j(j11, S, j21);
            f0 f0Var = i().c;
            boolean z12 = f0Var.d == -3.4028235E38f && f0Var.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            e2.e0 a10 = this.q.a();
            a10.a = h2.m0.h0(j22);
            a10.d = z12 ? 1.0f : this.q.d;
            a10.e = z12 ? 1.0f : this.q.e;
            f0 f0Var2 = new f0(a10);
            this.q = f0Var2;
            if (j14 == -9223372036854775807L) {
                j14 = j21 - h2.m0.S(f0Var2.a);
            }
            if (z10) {
                j17 = j14;
            } else {
                s2.h u10 = u(j14, mVar.s);
                if (u10 != null) {
                    j12 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    s2.j jVar = (s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j14), true));
                    s2.h u11 = u(j14, jVar.y);
                    j12 = u11 != null ? u11.e : jVar.e;
                }
                j17 = j12;
            }
            i1Var = new i1(j16, h02, j19, mVar.u, j18, j17, true, !z11, i7 == 2 && mVar.f, aVar, i(), this.q);
        } else {
            if (j14 == -9223372036854775807L || i0Var.isEmpty()) {
                j3 = 0;
            } else {
                if (!z10 && j14 != j13) {
                    j14 = ((s2.j) i0Var.get(h2.m0.d(i0Var, Long.valueOf(j14), true))).e;
                }
                j3 = j14;
            }
            long j23 = mVar.u;
            i1Var = new i1(j16, h02, j23, j23, 0L, j3, true, false, true, aVar, i(), null);
        }
        n(i1Var);
    }
}
