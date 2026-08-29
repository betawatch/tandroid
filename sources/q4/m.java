package q4;

import ag.j2;
import android.net.Uri;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.exoplayer2.upstream.y0;
import f5.d0;
import j3.b1;
import j3.c1;
import j3.f1;
import j3.r0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.c0;
import l4.g0;
import l4.i1;
import l4.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class m extends l4.a {
    public final j h;
    public final c1 i;
    public final o1.a j;
    public final bb.a k;
    public final n3.i l;
    public final f7.v m;
    public final boolean n;
    public final int o;
    public final r4.c p;
    public final long q;
    public final f1 r;
    public b1 s;
    public y0 t;

    static {
        r0.a("goog.exo.hls");
    }

    public m(f1 f1Var, o1.a aVar, c cVar, bb.a aVar2, n3.i iVar, f7.v vVar, r4.c cVar2, long j10, boolean z10, int i10) {
        c1 c1Var = f1Var.b;
        c1Var.getClass();
        this.i = c1Var;
        this.r = f1Var;
        this.s = f1Var.c;
        this.j = aVar;
        this.h = cVar;
        this.k = aVar2;
        this.l = iVar;
        this.m = vVar;
        this.p = cVar2;
        this.q = j10;
        this.n = z10;
        this.o = i10;
    }

    public static r4.e s(long j10, List list) {
        r4.e eVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            r4.e eVar2 = (r4.e) list.get(i10);
            long j11 = eVar2.e;
            if (j11 > j10 || !eVar2.w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                eVar = eVar2;
            }
        }
        return eVar;
    }

    @Override // l4.a
    public final z b(c0 c0Var, com.google.android.exoplayer2.upstream.r rVar, long j10) {
        g0 a2 = a(c0Var);
        j2 j2Var = new j2((CopyOnWriteArrayList) this.d.d, 0, c0Var);
        y0 y0Var = this.t;
        k3.k kVar = this.g;
        f5.a.j(kVar);
        return new l(this.h, this.p, this.j, y0Var, this.l, j2Var, this.m, a2, rVar, this.k, this.n, this.o, kVar);
    }

    @Override // l4.a
    public final f1 h() {
        return this.r;
    }

    @Override // l4.a
    public final void j() {
        r4.c cVar = this.p;
        q0 q0Var = cVar.h;
        if (q0Var != null) {
            q0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            r4.b bVar = (r4.b) cVar.d.get(uri);
            bVar.b.a();
            IOException iOException = bVar.s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // l4.a
    public final void l(y0 y0Var) {
        this.t = y0Var;
        n3.i iVar = this.l;
        iVar.a();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.g;
        f5.a.j(kVar);
        iVar.q(myLooper, kVar);
        g0 a2 = a(null);
        Uri uri = this.i.a;
        r4.c cVar = this.p;
        cVar.getClass();
        cVar.n = d0.k(null);
        cVar.f = a2;
        cVar.r = this;
        t0 t0Var = new t0(((com.google.android.exoplayer2.upstream.l) cVar.a.b).createDataSource(), uri, 4, cVar.b.v1());
        f5.a.i(cVar.h == null);
        q0 q0Var = new q0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = q0Var;
        f7.v vVar = cVar.c;
        int i10 = t0Var.c;
        q0Var.f(t0Var, cVar, vVar.B(i10));
        a2.k(new l4.p(t0Var.b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // l4.a
    public final void n(z zVar) {
        l lVar = (l) zVar;
        lVar.b.e.remove(lVar);
        for (r rVar : lVar.F) {
            if (rVar.P) {
                for (q qVar : rVar.H) {
                    qVar.i();
                    n3.e eVar = qVar.h;
                    if (eVar != null) {
                        eVar.p(qVar.e);
                        qVar.h = null;
                        qVar.g = null;
                    }
                }
            }
            rVar.s.e(rVar);
            rVar.D.removeCallbacksAndMessages(null);
            rVar.T = true;
            rVar.E.clear();
        }
        lVar.C = null;
    }

    @Override // l4.a
    public final void p() {
        r4.c cVar = this.p;
        cVar.v = null;
        cVar.w = null;
        cVar.s = null;
        cVar.y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((r4.b) it.next()).b.e(null);
        }
        cVar.n.removeCallbacksAndMessages(null);
        cVar.n = null;
        hashMap.clear();
        this.l.release();
    }

    public final void t(r4.j jVar) {
        long j10;
        i1 i1Var;
        long j11;
        long j12;
        long j13;
        boolean z10 = jVar.p;
        boolean z11 = jVar.g;
        q8.z zVar = jVar.r;
        long j14 = jVar.u;
        long j15 = jVar.e;
        int i10 = jVar.d;
        long j16 = jVar.h;
        long S = z10 ? d0.S(j16) : -9223372036854775807L;
        long j17 = (i10 == 2 || i10 == 1) ? S : -9223372036854775807L;
        r4.c cVar = this.p;
        r4.m mVar = cVar.s;
        mVar.getClass();
        c cVar2 = new c();
        new r4.d(mVar.a, mVar.b, mVar.e, mVar.f, mVar.g, mVar.h, mVar.i, mVar.j, mVar.k, mVar.c, mVar.l, mVar.m);
        if (cVar.x) {
            r4.i iVar = jVar.v;
            long j18 = j16 - cVar.y;
            boolean z12 = jVar.o;
            long j19 = z12 ? j18 + j14 : -9223372036854775807L;
            long H = jVar.p ? d0.H(d0.t(this.q)) - (j16 + j14) : 0L;
            long j20 = this.s.a;
            if (j20 != -9223372036854775807L) {
                j12 = d0.H(j20);
            } else {
                if (j15 != -9223372036854775807L) {
                    j11 = j14 - j15;
                } else {
                    j11 = iVar.d;
                    if (j11 == -9223372036854775807L || jVar.n == -9223372036854775807L) {
                        j11 = iVar.c;
                        if (j11 == -9223372036854775807L) {
                            j11 = 3 * jVar.m;
                        }
                    }
                }
                j12 = j11 + H;
            }
            long j21 = j14 + H;
            long i11 = d0.i(j12, H, j21);
            b1 b1Var = this.r.c;
            boolean z13 = b1Var.d == -3.4028235E38f && b1Var.e == -3.4028235E38f && iVar.c == -9223372036854775807L && iVar.d == -9223372036854775807L;
            long S2 = d0.S(i11);
            this.s = new b1(S2, -9223372036854775807L, -9223372036854775807L, z13 ? 1.0f : this.s.d, z13 ? 1.0f : this.s.e);
            if (j15 == -9223372036854775807L) {
                j15 = j21 - d0.H(S2);
            }
            if (z11) {
                j13 = j15;
            } else {
                r4.e s10 = s(j15, jVar.s);
                if (s10 != null) {
                    j13 = s10.e;
                } else if (zVar.isEmpty()) {
                    j13 = 0;
                } else {
                    r4.g gVar = (r4.g) zVar.get(d0.c(zVar, Long.valueOf(j15), true));
                    r4.e s11 = s(j15, gVar.x);
                    j13 = s11 != null ? s11.e : gVar.e;
                }
            }
            i1Var = new i1(j17, S, j19, jVar.u, j18, j13, true, !z12, i10 == 2 && jVar.f, cVar2, this.r, this.s);
        } else {
            if (j15 == -9223372036854775807L || zVar.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j15 != j14) {
                    j15 = ((r4.g) zVar.get(d0.c(zVar, Long.valueOf(j15), true))).e;
                }
                j10 = j15;
            }
            long j22 = jVar.u;
            i1Var = new i1(j17, S, j22, j22, 0L, j10, true, false, true, cVar2, this.r, null);
        }
        m(i1Var);
    }
}
