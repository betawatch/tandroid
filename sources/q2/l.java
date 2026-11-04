package q2;

import android.net.Uri;
import android.os.Looper;
import android.support.v4.media.session.a0;
import b8.kg;
import b8.zb;
import d2.h0;
import d2.i0;
import d2.n0;
import d2.o0;
import d2.v0;
import i2.d0;
import j$.util.Objects;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.i9;
import w2.e0;
import w2.g0;
import w2.j1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l extends w2.a {
    public final c h;
    public final i9 i;
    public final ra.e j;
    public final p2.m k;
    public final kb.a l;
    public final boolean m;
    public final int n;
    public final r2.d o;
    public final long p;
    public h0 q;
    public d0 r;
    public n0 s;

    static {
        o0.a("media3.exoplayer.hls");
    }

    public l(n0 n0Var, i9 i9Var, c cVar, ra.e eVar, p2.m mVar, kb.a aVar, r2.d dVar, long j10, boolean z10, int i3) {
        this.s = n0Var;
        this.q = n0Var.c;
        this.i = i9Var;
        this.h = cVar;
        this.j = eVar;
        this.k = mVar;
        this.l = aVar;
        this.o = dVar;
        this.p = j10;
        this.m = z10;
        this.n = i3;
    }

    public static r2.h u(long j10, List list) {
        r2.h hVar = null;
        for (int i3 = 0; i3 < list.size(); i3++) {
            r2.h hVar2 = (r2.h) list.get(i3);
            long j11 = hVar2.e;
            if (j11 > j10 || !hVar2.x) {
                if (j11 > j10) {
                    break;
                }
            } else {
                hVar = hVar2;
            }
        }
        return hVar;
    }

    @Override // w2.a
    public final boolean a(n0 n0Var) {
        n0 i3 = i();
        i0 i0Var = i3.b;
        i0Var.getClass();
        i0 i0Var2 = n0Var.b;
        return i0Var2 != null && i0Var2.a.equals(i0Var.a) && i0Var2.e.equals(i0Var.e) && Objects.equals(i0Var2.c, i0Var.c) && i3.c.equals(n0Var.c);
    }

    @Override // w2.a
    public final e0 c(g0 g0Var, a0 a0Var, long j10) {
        kg b10 = b(g0Var);
        p2.j jVar = new p2.j(this.d.c, 0, g0Var);
        d0 d0Var = this.r;
        l2.k kVar = this.g;
        kVar.getClass();
        return new k(this.h, this.o, this.i, d0Var, this.k, jVar, this.l, b10, a0Var, this.j, this.m, this.n, kVar);
    }

    @Override // w2.a
    public final synchronized n0 i() {
        return this.s;
    }

    @Override // w2.a
    public final void k() {
        r2.d dVar = this.o;
        a3.q qVar = dVar.h;
        if (qVar != null) {
            qVar.a();
        }
        v0 v0Var = dVar.w;
        if (v0Var != null) {
            throw v0Var;
        }
        Uri uri = dVar.G;
        if (uri != null) {
            dVar.i(uri);
        }
    }

    @Override // w2.a
    public final void m(d0 d0Var) {
        this.r = d0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        l2.k kVar = this.g;
        kVar.getClass();
        p2.m mVar = this.k;
        mVar.k(myLooper, kVar);
        mVar.a();
        kg b10 = b(null);
        i0 i0Var = i().b;
        i0Var.getClass();
        Uri uri = i0Var.a;
        r2.d dVar = this.o;
        dVar.getClass();
        dVar.n = g2.n0.q(null);
        dVar.f = b10;
        dVar.r = this;
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        a3.t tVar = new a3.t(((i2.g) dVar.a.b).createDataSource(), new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, dVar.b.R1());
        zb.p(dVar.h == null);
        a3.q qVar = new a3.q("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        dVar.h = qVar;
        qVar.f(tVar, dVar, dVar.c.F4(tVar.c));
    }

    @Override // w2.a
    public final void o(e0 e0Var) {
        k kVar = (k) e0Var;
        kVar.b.e.remove(kVar);
        for (q qVar : kVar.K) {
            if (qVar.U) {
                for (p pVar : qVar.M) {
                    pVar.l();
                    p2.g gVar = pVar.h;
                    if (gVar != null) {
                        gVar.b(pVar.e);
                        pVar.h = null;
                        pVar.g = null;
                    }
                }
            }
            i iVar = qVar.d;
            int l10 = iVar.r.l();
            r2.d dVar = iVar.g;
            Uri c2 = iVar.e[l10].c();
            r2.c cVar = (r2.c) dVar.d.get(c2);
            if (cVar != null) {
                r2.b bVar = (r2.b) f1.p(cVar.b, c2, c2);
                bVar.getClass();
                bVar.x = false;
            }
            iVar.n = null;
            qVar.s.e(qVar);
            qVar.I.removeCallbacksAndMessages(null);
            qVar.Y = true;
            qVar.J.clear();
        }
        kVar.H = null;
    }

    @Override // w2.a
    public final void q() {
        r2.d dVar = this.o;
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
            Iterator it2 = ((r2.c) it.next()).b.values().iterator();
            while (it2.hasNext()) {
                ((r2.b) it2.next()).c.e(null);
            }
        }
        dVar.n.removeCallbacksAndMessages(null);
        dVar.n = null;
        hashMap.clear();
        this.k.release();
    }

    @Override // w2.a
    public final synchronized void t(n0 n0Var) {
        this.s = n0Var;
    }

    public final void v(r2.m mVar) {
        long j10;
        j1 j1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = mVar.p;
        boolean z11 = mVar.g;
        g9.i0 i0Var = mVar.r;
        long j14 = mVar.u;
        long j15 = mVar.e;
        int i3 = mVar.d;
        long j16 = mVar.h;
        long h02 = z10 ? g2.n0.h0(j16) : -9223372036854775807L;
        long j17 = (i3 == 2 || i3 == 1) ? h02 : -9223372036854775807L;
        r2.d dVar = this.o;
        dVar.s.getClass();
        kb.a aVar = new kb.a(22);
        long j18 = 0;
        if (dVar.I) {
            r2.l lVar = mVar.v;
            long j19 = j16 - dVar.J;
            boolean z12 = mVar.o;
            long j20 = z12 ? j19 + j14 : -9223372036854775807L;
            long S = mVar.p ? g2.n0.S(g2.n0.C(this.p)) - (j16 + j14) : 0L;
            long j21 = this.q.a;
            if (j21 != -9223372036854775807L) {
                j12 = g2.n0.S(j21);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = lVar.d;
                    if (j11 == -9223372036854775807L || mVar.n == -9223372036854775807L) {
                        j11 = lVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * mVar.m;
                        }
                    }
                }
                j12 = j11 + S;
            }
            long j22 = j14 + S;
            long j23 = g2.n0.j(j12, S, j22);
            h0 h0Var = i().c;
            boolean z13 = h0Var.d == -3.4028235E38f && h0Var.e == -3.4028235E38f && lVar.c == -9223372036854775807L && lVar.d == -9223372036854775807L;
            d2.g0 a10 = this.q.a();
            a10.a = g2.n0.h0(j23);
            a10.d = z13 ? 1.0f : this.q.d;
            a10.e = z13 ? 1.0f : this.q.e;
            h0 h0Var2 = new h0(a10);
            this.q = h0Var2;
            if (j15 == -9223372036854775807L) {
                j15 = j22 - g2.n0.S(h0Var2.a);
            }
            if (z11) {
                j18 = j15;
            } else {
                r2.h u10 = u(j15, mVar.s);
                if (u10 != null) {
                    j13 = u10.e;
                } else if (!i0Var.isEmpty()) {
                    r2.j jVar = (r2.j) i0Var.get(g2.n0.d(i0Var, Long.valueOf(j15), true));
                    r2.h u11 = u(j15, jVar.y);
                    j13 = u11 != null ? u11.e : jVar.e;
                }
                j18 = j13;
            }
            j1Var = new j1(j17, h02, j20, mVar.u, j19, j18, true, !z12, i3 == 2 && mVar.f, aVar, i(), this.q);
        } else {
            if (j15 == -9223372036854775807L || i0Var.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((r2.j) i0Var.get(g2.n0.d(i0Var, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j24 = mVar.u;
            j1Var = new j1(j17, h02, j24, j24, 0L, j10, true, false, true, aVar, i(), null);
        }
        n(j1Var);
    }
}
