package t4;

import android.net.Uri;
import android.os.Looper;
import b4.e0;
import g5.m0;
import g5.p0;
import g5.v0;
import h5.d0;
import j3.c1;
import j3.l0;
import j3.x0;
import j3.y0;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import o4.r0;
import oh.h4;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m extends o4.a {
    public final j h;
    public final y0 i;
    public final h4 j;
    public final z9.d k;
    public final o3.o l;
    public final ab.a m;
    public final boolean n;
    public final int o;
    public final u4.c p;
    public final long q;
    public final c1 r;
    public x0 s;
    public v0 t;

    static {
        l0.a("goog.exo.hls");
    }

    public m(c1 c1Var, h4 h4Var, c cVar, z9.d dVar, o3.o oVar, ab.a aVar, u4.c cVar2, long j10, boolean z4, int i10) {
        y0 y0Var = c1Var.b;
        y0Var.getClass();
        this.i = y0Var;
        this.r = c1Var;
        this.s = c1Var.c;
        this.j = h4Var;
        this.h = cVar;
        this.k = dVar;
        this.l = oVar;
        this.m = aVar;
        this.p = cVar2;
        this.q = j10;
        this.n = z4;
        this.o = i10;
    }

    public static u4.d s(long j10, List list) {
        u4.d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            u4.d dVar2 = (u4.d) list.get(i10);
            long j11 = dVar2.e;
            if (j11 > j10 || !dVar2.w) {
                if (j11 > j10) {
                    break;
                }
            } else {
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @Override // o4.a
    public final o4.t b(o4.v vVar, g5.q qVar, long j10) {
        e0 a2 = a(vVar);
        o3.l lVar = new o3.l(this.d.c, 0, vVar);
        v0 v0Var = this.t;
        k3.k kVar = this.g;
        h5.a.j(kVar);
        return new l(this.h, this.p, this.j, v0Var, this.l, lVar, this.m, a2, qVar, this.k, this.n, this.o, kVar);
    }

    @Override // o4.a
    public final c1 h() {
        return this.r;
    }

    @Override // o4.a
    public final void j() {
        u4.c cVar = this.p;
        m0 m0Var = cVar.h;
        if (m0Var != null) {
            m0Var.a();
        }
        Uri uri = cVar.v;
        if (uri != null) {
            u4.b bVar = (u4.b) cVar.d.get(uri);
            bVar.b.a();
            IOException iOException = bVar.s;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    @Override // o4.a
    public final void l(v0 v0Var) {
        this.t = v0Var;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        k3.k kVar = this.g;
        h5.a.j(kVar);
        o3.o oVar = this.l;
        oVar.h(myLooper, kVar);
        oVar.a();
        e0 a2 = a(null);
        Uri uri = this.i.a;
        u4.c cVar = this.p;
        cVar.getClass();
        cVar.n = d0.l(null);
        cVar.f = a2;
        cVar.r = this;
        p0 p0Var = new p0(((g5.l) cVar.a.b).createDataSource(), uri, 4, cVar.b.G());
        h5.a.i(cVar.h == null);
        m0 m0Var = new m0("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        cVar.h = m0Var;
        ab.a aVar = cVar.c;
        int i10 = p0Var.c;
        m0Var.f(p0Var, cVar, aVar.n3(i10));
        a2.u(new o4.j(p0Var.b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // o4.a
    public final void n(o4.t tVar) {
        l lVar = (l) tVar;
        lVar.b.e.remove(lVar);
        for (r rVar : lVar.G) {
            if (rVar.Q) {
                for (q qVar : rVar.I) {
                    qVar.i();
                    o3.i iVar = qVar.h;
                    if (iVar != null) {
                        iVar.c(qVar.e);
                        qVar.h = null;
                        qVar.g = null;
                    }
                }
            }
            rVar.s.e(rVar);
            rVar.E.removeCallbacksAndMessages(null);
            rVar.U = true;
            rVar.F.clear();
        }
        lVar.D = null;
    }

    @Override // o4.a
    public final void p() {
        u4.c cVar = this.p;
        cVar.v = null;
        cVar.w = null;
        cVar.s = null;
        cVar.y = -9223372036854775807L;
        cVar.h.e(null);
        cVar.h = null;
        HashMap hashMap = cVar.d;
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            ((u4.b) it.next()).b.e(null);
        }
        cVar.n.removeCallbacksAndMessages(null);
        cVar.n = null;
        hashMap.clear();
        this.l.release();
    }

    public final void t(u4.i iVar) {
        long j10;
        r0 r0Var;
        boolean z4;
        long j11;
        long j12;
        long j13;
        long j14;
        boolean z10 = iVar.p;
        boolean z11 = iVar.g;
        s8.v vVar = iVar.r;
        long j15 = iVar.u;
        long j16 = iVar.e;
        int i10 = iVar.d;
        long j17 = iVar.h;
        long S = z10 ? d0.S(j17) : -9223372036854775807L;
        long j18 = (i10 == 2 || i10 == 1) ? S : -9223372036854775807L;
        u4.c cVar = this.p;
        cVar.s.getClass();
        c cVar2 = new c();
        long j19 = 0;
        if (cVar.x) {
            u4.h hVar = iVar.v;
            long j20 = j17 - cVar.y;
            boolean z12 = iVar.o;
            long j21 = z12 ? j20 + j15 : -9223372036854775807L;
            if (iVar.p) {
                z4 = z11;
                j11 = d0.G(d0.u(this.q)) - (j17 + j15);
            } else {
                z4 = z11;
                j11 = 0;
            }
            long j22 = this.s.a;
            if (j22 != -9223372036854775807L) {
                j13 = d0.G(j22);
            } else {
                if (j16 != -9223372036854775807L) {
                    j12 = j15 - j16;
                } else {
                    j12 = hVar.d;
                    if (j12 == -9223372036854775807L || iVar.n == -9223372036854775807L) {
                        j12 = hVar.c;
                        if (j12 == -9223372036854775807L) {
                            j12 = 3 * iVar.m;
                        }
                    }
                }
                j13 = j12 + j11;
            }
            long j23 = j15 + j11;
            long i11 = d0.i(j13, j11, j23);
            x0 x0Var = this.r.c;
            boolean z13 = x0Var.d == -3.4028235E38f && x0Var.e == -3.4028235E38f && hVar.c == -9223372036854775807L && hVar.d == -9223372036854775807L;
            long S2 = d0.S(i11);
            this.s = new x0(S2, -9223372036854775807L, -9223372036854775807L, z13 ? 1.0f : this.s.d, z13 ? 1.0f : this.s.e);
            if (j16 == -9223372036854775807L) {
                j16 = j23 - d0.G(S2);
            }
            if (z4) {
                j19 = j16;
            } else {
                u4.d s6 = s(j16, iVar.s);
                if (s6 != null) {
                    j14 = s6.e;
                } else if (!vVar.isEmpty()) {
                    u4.f fVar = (u4.f) vVar.get(d0.c(vVar, Long.valueOf(j16), true));
                    u4.d s9 = s(j16, fVar.x);
                    j14 = s9 != null ? s9.e : fVar.e;
                }
                j19 = j14;
            }
            r0Var = new r0(j18, S, j21, iVar.u, j20, j19, true, !z12, i10 == 2 && iVar.f, cVar2, this.r, this.s);
        } else {
            if (j16 == -9223372036854775807L || vVar.isEmpty()) {
                j10 = 0;
            } else {
                if (!z11 && j16 != j15) {
                    j16 = ((u4.f) vVar.get(d0.c(vVar, Long.valueOf(j16), true))).e;
                }
                j10 = j16;
            }
            long j24 = iVar.u;
            r0Var = new r0(j18, S, j24, j24, 0L, j10, true, false, true, cVar2, this.r, null);
        }
        m(r0Var);
    }
}
