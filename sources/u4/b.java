package u4;

import android.net.Uri;
import android.os.SystemClock;
import b7.y0;
import g5.e0;
import g5.h0;
import g5.j0;
import g5.m0;
import g5.p0;
import h5.d0;
import j3.r1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;
import qh.d6;
import s8.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class b implements h0 {
    public final Uri a;
    public final m0 b = new m0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g5.m c;
    public i d;
    public long e;
    public long f;
    public long h;
    public long n;
    public boolean r;
    public IOException s;
    public final /* synthetic */ c v;

    public b(c cVar, Uri uri) {
        this.v = cVar;
        this.a = uri;
        this.c = ((g5.l) cVar.a.b).createDataSource();
    }

    public static boolean a(b bVar, long j10) {
        bVar.n = SystemClock.elapsedRealtime() + j10;
        Uri uri = bVar.a;
        c cVar = bVar.v;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((k) list.get(i10)).a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.n) {
                Uri uri2 = bVar2.a;
                cVar.v = uri2;
                bVar2.c(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final void b(Uri uri) {
        c cVar = this.v;
        p0 p0Var = new p0(this.c, uri, 4, cVar.b.B(cVar.s, this.d));
        ab.a aVar = cVar.c;
        int i10 = p0Var.c;
        this.b.f(p0Var, this, aVar.n3(i10));
        cVar.f.u(new o4.j(p0Var.b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.n = 0L;
        if (this.r) {
            return;
        }
        m0 m0Var = this.b;
        if (m0Var.d() || m0Var.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.h;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.r = true;
            this.v.n.postDelayed(new d6(22, this, uri), j10 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(i iVar) {
        boolean z4;
        CopyOnWriteArrayList copyOnWriteArrayList;
        long j10;
        long j11;
        long j12;
        int i10;
        v vVar;
        i iVar2;
        y0 y0Var;
        long j13;
        y0 y0Var2;
        boolean z10;
        h hVar;
        i iVar3;
        int size;
        int size2;
        int size3;
        i iVar4 = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.e = elapsedRealtime;
        c cVar = this.v;
        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.e;
        if (iVar4 != null) {
            long j14 = iVar.k;
            long j15 = iVar4.k;
            if (j14 <= j15 && (j14 < j15 || ((size = iVar.r.size() - iVar4.r.size()) == 0 ? !((size2 = iVar.s.size()) > (size3 = iVar4.s.size()) || (size2 == size3 && iVar.o && !iVar4.o)) : size <= 0))) {
                z4 = false;
                v vVar2 = iVar.r;
                long j16 = iVar.k;
                long j17 = 0;
                if (z4) {
                    if (!iVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        iVar2 = iVar4;
                        j13 = j16;
                    } else if (iVar4.o) {
                        iVar2 = iVar4;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        y0Var = null;
                    } else {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        iVar2 = new i(iVar4.d, iVar4.a, iVar4.b, iVar4.e, iVar4.g, iVar4.h, iVar4.i, iVar4.j, iVar4.k, iVar4.l, iVar4.m, iVar4.n, iVar4.c, true, iVar4.p, iVar4.q, iVar4.r, iVar4.s, iVar4.v, iVar4.t);
                    }
                    y0Var = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    if (iVar.p) {
                        j10 = iVar.h;
                    } else {
                        i iVar5 = cVar.w;
                        j10 = iVar5 != null ? iVar5.h : 0L;
                        if (iVar4 != null) {
                            long j18 = iVar4.h;
                            long j19 = iVar4.k;
                            v vVar3 = iVar4.r;
                            j11 = j10;
                            int size4 = vVar3.size();
                            int i11 = (int) (j16 - j19);
                            f fVar = i11 < vVar3.size() ? (f) vVar3.get(i11) : null;
                            if (fVar != null) {
                                j12 = fVar.e;
                            } else {
                                if (size4 == j16 - j19) {
                                    j12 = iVar4.u;
                                }
                                if (iVar.i) {
                                    i iVar6 = cVar.w;
                                    int i12 = iVar6 != null ? iVar6.j : 0;
                                    if (iVar4 != null) {
                                        int i13 = (int) (j16 - iVar4.k);
                                        v vVar4 = iVar4.r;
                                        f fVar2 = i13 < vVar4.size() ? (f) vVar4.get(i13) : null;
                                        if (fVar2 != null) {
                                            i12 = (iVar4.j + fVar2.d) - ((f) vVar2.get(0)).d;
                                            i10 = i12;
                                            vVar = vVar2;
                                        }
                                    }
                                    i10 = i12;
                                    vVar = vVar2;
                                } else {
                                    i10 = iVar.j;
                                    vVar = vVar2;
                                }
                                y0Var = null;
                                j13 = j16;
                                iVar2 = new i(iVar.d, iVar.a, iVar.b, iVar.e, iVar.g, j11, true, i10, iVar.k, iVar.l, iVar.m, iVar.n, iVar.c, iVar.o, iVar.p, iVar.q, vVar, iVar.s, iVar.v, iVar.t);
                            }
                            j10 = j18 + j12;
                        }
                    }
                    j11 = j10;
                    if (iVar.i) {
                    }
                    y0Var = null;
                    j13 = j16;
                    iVar2 = new i(iVar.d, iVar.a, iVar.b, iVar.e, iVar.g, j11, true, i10, iVar.k, iVar.l, iVar.m, iVar.n, iVar.c, iVar.o, iVar.p, iVar.q, vVar, iVar.s, iVar.v, iVar.t);
                }
                this.d = iVar2;
                Uri uri = this.a;
                if (iVar2 == iVar4) {
                    this.s = y0Var;
                    this.f = elapsedRealtime;
                    if (uri.equals(cVar.v)) {
                        if (cVar.w == null) {
                            cVar.x = !iVar2.o;
                            cVar.y = iVar2.h;
                        }
                        cVar.w = iVar2;
                        cVar.r.t(iVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((q) it.next()).a();
                    }
                } else if (!iVar2.o) {
                    long size5 = j13 + iVar.r.size();
                    i iVar7 = this.d;
                    if (size5 < iVar7.k) {
                        y0Var2 = new y0();
                        z10 = true;
                    } else {
                        y0Var2 = ((double) (elapsedRealtime - this.f)) > ((double) d0.S(iVar7.m)) * 3.5d ? new y0() : y0Var;
                        z10 = false;
                    }
                    if (y0Var2 != null) {
                        this.s = y0Var2;
                        p2.v vVar5 = new p2.v(y0Var2, 1, 4);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((q) it2.next()).c(uri, vVar5, z10);
                        }
                    }
                }
                i iVar8 = this.d;
                hVar = iVar8.v;
                long j20 = iVar8.m;
                if (!hVar.e) {
                    if (iVar8 == iVar4) {
                        j20 /= 2;
                    }
                    j17 = j20;
                }
                this.h = d0.S(j17) + elapsedRealtime;
                if (this.d.n == -9223372036854775807L || uri.equals(cVar.v)) {
                    iVar3 = this.d;
                    if (iVar3.o) {
                        h hVar2 = iVar3.v;
                        if (hVar2.a != -9223372036854775807L || hVar2.e) {
                            Uri.Builder buildUpon = uri.buildUpon();
                            i iVar9 = this.d;
                            if (iVar9.v.e) {
                                buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(iVar9.k + iVar9.r.size()));
                                i iVar10 = this.d;
                                if (iVar10.n != -9223372036854775807L) {
                                    v vVar6 = iVar10.s;
                                    int size6 = vVar6.size();
                                    if (!vVar6.isEmpty() && ((d) s8.l.h(vVar6)).x) {
                                        size6--;
                                    }
                                    buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size6));
                                }
                            }
                            h hVar3 = this.d.v;
                            if (hVar3.a != -9223372036854775807L) {
                                buildUpon.appendQueryParameter("_HLS_skip", hVar3.b ? "v2" : "YES");
                            }
                            uri = buildUpon.build();
                        }
                        c(uri);
                        return;
                    }
                    return;
                }
                return;
            }
        } else {
            iVar.getClass();
        }
        z4 = true;
        v vVar22 = iVar.r;
        long j162 = iVar.k;
        long j172 = 0;
        if (z4) {
        }
        this.d = iVar2;
        Uri uri2 = this.a;
        if (iVar2 == iVar4) {
        }
        i iVar82 = this.d;
        hVar = iVar82.v;
        long j202 = iVar82.m;
        if (!hVar.e) {
        }
        this.h = d0.S(j172) + elapsedRealtime;
        if (this.d.n == -9223372036854775807L) {
        }
        iVar3 = this.d;
        if (iVar3.o) {
        }
    }

    @Override // g5.h0
    public final c4.e q(j0 j0Var, IOException iOException, int i10) {
        p0 p0Var = (p0) j0Var;
        long j10 = p0Var.a;
        int i11 = p0Var.c;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        boolean z4 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z10 = iOException instanceof n;
        c4.e eVar = m0.e;
        Uri uri2 = this.a;
        c cVar = this.v;
        if (z4 || z10) {
            int i12 = iOException instanceof e0 ? ((e0) iOException).d : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z10 || i12 == 400 || i12 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                b4.e0 e0Var = cVar.f;
                int i13 = d0.a;
                e0Var.s(jVar, i11, iOException, true);
                return eVar;
            }
        }
        p2.v vVar = new p2.v(iOException, i10, 4);
        Iterator it = cVar.e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((q) it.next()).c(uri2, vVar, false);
        }
        ab.a aVar = cVar.c;
        if (z11) {
            aVar.getClass();
            long o32 = ab.a.o3(vVar);
            eVar = o32 != -9223372036854775807L ? new c4.e(0, o32, false) : m0.f;
        }
        boolean a2 = eVar.a();
        cVar.f.s(jVar, i11, iOException, !a2);
        if (!a2) {
            aVar.getClass();
        }
        return eVar;
    }

    @Override // g5.h0
    public final void u(j0 j0Var, long j10, long j11, boolean z4) {
        p0 p0Var = (p0) j0Var;
        long j12 = p0Var.a;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        c cVar = this.v;
        cVar.c.getClass();
        cVar.f.m(jVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // g5.h0
    public final void x(j0 j0Var, long j10, long j11) {
        p0 p0Var = (p0) j0Var;
        m mVar = (m) p0Var.f;
        Uri uri = p0Var.d.c;
        o4.j jVar = new o4.j();
        if (mVar instanceof i) {
            d((i) mVar);
            this.v.f.p(jVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            r1 b10 = r1.b("Loaded playlist has unexpected type.", null);
            this.s = b10;
            this.v.f.s(jVar, 4, b10, true);
        }
        this.v.c.getClass();
    }
}
