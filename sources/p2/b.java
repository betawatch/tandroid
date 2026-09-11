package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.s0;
import c5.b0;
import com.google.android.gms.internal.cast.b5;
import e2.d0;
import e9.i0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.g1;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class b implements y2.h {
    public final Uri a;
    public final y2.m b = new y2.m("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h c;
    public l d;
    public long e;
    public long f;
    public long h;
    public long n;
    public boolean r;
    public IOException s;
    public boolean v;
    public final /* synthetic */ c w;

    public b(c cVar, Uri uri) {
        this.w = cVar;
        this.a = uri;
        this.c = ((g2.g) cVar.a.b).createDataSource();
    }

    public static boolean a(b bVar, long j3) {
        bVar.n = SystemClock.elapsedRealtime() + j3;
        Uri uri = bVar.a;
        c cVar = bVar.w;
        if (!uri.equals(cVar.v)) {
            return false;
        }
        List list = cVar.s.e;
        int size = list.size();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) cVar.d.get(((n) list.get(i10)).a);
            bVar2.getClass();
            if (elapsedRealtime > bVar2.n) {
                Uri uri2 = bVar2.a;
                cVar.v = uri2;
                bVar2.e(cVar.b(uri2));
                return false;
            }
        }
        return true;
    }

    public final Uri b() {
        l lVar = this.d;
        Uri uri = this.a;
        if (lVar != null) {
            k kVar = lVar.v;
            if (kVar.a != -9223372036854775807L || kVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                l lVar2 = this.d;
                if (lVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(lVar2.k + lVar2.r.size()));
                    l lVar3 = this.d;
                    if (lVar3.n != -9223372036854775807L) {
                        i0 i0Var = lVar3.s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((g) e9.q.l(i0Var)).x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                k kVar2 = this.d.v;
                if (kVar2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", kVar2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z10) {
        e(z10 ? b() : this.a);
    }

    public final void d(Uri uri) {
        c cVar = this.w;
        y2.o i02 = cVar.b.i0(cVar.s, this.d);
        Map map = Collections.EMPTY_MAP;
        e2.d.i(uri, "The uri must be set.");
        y2.p pVar = new y2.p(this.c, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, i02);
        this.b.f(pVar, this, cVar.c.L3(pVar.c));
    }

    public final void e(Uri uri) {
        this.n = 0L;
        if (this.r) {
            return;
        }
        y2.m mVar = this.b;
        if (mVar.d() || mVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.h;
        if (elapsedRealtime >= j3) {
            d(uri);
        } else {
            this.r = true;
            this.w.n.postDelayed(new g1(6, this, uri), j3 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(l lVar, u2.t tVar) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        long j3;
        long j10;
        long j11;
        int i10;
        i0 i0Var;
        l lVar2;
        b5 b5Var;
        long j12;
        b5 b5Var2;
        boolean z11;
        k kVar;
        int size;
        int size2;
        int size3;
        l lVar3 = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.e = elapsedRealtime;
        c cVar = this.w;
        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.e;
        if (lVar3 != null) {
            long j13 = lVar.k;
            long j14 = lVar3.k;
            if (j13 <= j14 && (j13 < j14 || ((size = lVar.r.size() - lVar3.r.size()) == 0 ? !((size2 = lVar.s.size()) > (size3 = lVar3.s.size()) || (size2 == size3 && lVar.o && !lVar3.o)) : size <= 0))) {
                z10 = false;
                i0 i0Var2 = lVar.r;
                long j15 = lVar.k;
                long j16 = 0;
                if (z10) {
                    if (!lVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        lVar2 = lVar3;
                        j12 = j15;
                    } else if (lVar3.o) {
                        lVar2 = lVar3;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j12 = j15;
                        b5Var = null;
                    } else {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j12 = j15;
                        lVar2 = new l(lVar3.d, lVar3.a, lVar3.b, lVar3.e, lVar3.g, lVar3.h, lVar3.i, lVar3.j, lVar3.k, lVar3.l, lVar3.m, lVar3.n, lVar3.c, true, lVar3.p, lVar3.q, lVar3.r, lVar3.s, lVar3.v, lVar3.t, lVar3.w);
                    }
                    b5Var = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    if (lVar.p) {
                        j3 = lVar.h;
                    } else {
                        l lVar4 = cVar.w;
                        j3 = lVar4 != null ? lVar4.h : 0L;
                        if (lVar3 != null) {
                            long j17 = lVar3.h;
                            long j18 = lVar3.k;
                            i0 i0Var3 = lVar3.r;
                            j10 = j3;
                            int size4 = i0Var3.size();
                            int i11 = (int) (j15 - j18);
                            i iVar = i11 < i0Var3.size() ? (i) i0Var3.get(i11) : null;
                            if (iVar != null) {
                                j11 = iVar.e;
                            } else {
                                if (size4 == j15 - j18) {
                                    j11 = lVar3.u;
                                }
                                if (lVar.i) {
                                    l lVar5 = cVar.w;
                                    int i12 = lVar5 != null ? lVar5.j : 0;
                                    if (lVar3 != null) {
                                        int i13 = (int) (j15 - lVar3.k);
                                        i0 i0Var4 = lVar3.r;
                                        i iVar2 = i13 < i0Var4.size() ? (i) i0Var4.get(i13) : null;
                                        if (iVar2 != null) {
                                            i12 = (lVar3.j + iVar2.d) - ((i) i0Var2.get(0)).d;
                                            i10 = i12;
                                            i0Var = i0Var2;
                                        }
                                    }
                                    i10 = i12;
                                    i0Var = i0Var2;
                                } else {
                                    i10 = lVar.j;
                                    i0Var = i0Var2;
                                }
                                b5Var = null;
                                j12 = j15;
                                lVar2 = new l(lVar.d, lVar.a, lVar.b, lVar.e, lVar.g, j10, true, i10, lVar.k, lVar.l, lVar.m, lVar.n, lVar.c, lVar.o, lVar.p, lVar.q, i0Var, lVar.s, lVar.v, lVar.t, lVar.w);
                            }
                            j3 = j17 + j11;
                        }
                    }
                    j10 = j3;
                    if (lVar.i) {
                    }
                    b5Var = null;
                    j12 = j15;
                    lVar2 = new l(lVar.d, lVar.a, lVar.b, lVar.e, lVar.g, j10, true, i10, lVar.k, lVar.l, lVar.m, lVar.n, lVar.c, lVar.o, lVar.p, lVar.q, i0Var, lVar.s, lVar.v, lVar.t, lVar.w);
                }
                this.d = lVar2;
                Uri uri = this.a;
                if (lVar2 == lVar3) {
                    this.s = b5Var;
                    this.f = elapsedRealtime;
                    if (uri.equals(cVar.v)) {
                        if (cVar.w == null) {
                            cVar.x = !lVar2.o;
                            cVar.y = lVar2.h;
                        }
                        cVar.w = lVar2;
                        cVar.r.v(lVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((t) it.next()).a();
                    }
                } else if (!lVar2.o) {
                    long size5 = j12 + lVar.r.size();
                    l lVar6 = this.d;
                    if (size5 < lVar6.k) {
                        b5Var2 = new b5();
                        z11 = true;
                    } else {
                        b5Var2 = ((double) (elapsedRealtime - this.f)) > ((double) d0.e0(lVar6.m)) * 3.5d ? new b5() : b5Var;
                        z11 = false;
                    }
                    if (b5Var2 != null) {
                        this.s = b5Var2;
                        b0 b0Var = new b0(b5Var2, 1, 11);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((t) it2.next()).b(uri, b0Var, z11);
                        }
                    }
                }
                l lVar7 = this.d;
                kVar = lVar7.v;
                long j19 = lVar7.m;
                if (!kVar.e) {
                    if (lVar7 == lVar3) {
                        long j20 = lVar7.n;
                        if (j20 != -9223372036854775807L) {
                            j16 = j20 / 2;
                        } else {
                            j19 /= 2;
                        }
                    }
                    this.h = (d0.e0(j16) + elapsedRealtime) - tVar.a;
                    if (this.d.o) {
                        return;
                    }
                    if (uri.equals(cVar.v) || this.v) {
                        e(b());
                        return;
                    }
                    return;
                }
                if (lVar7 == lVar3) {
                    j19 /= 2;
                }
                j16 = j19;
                this.h = (d0.e0(j16) + elapsedRealtime) - tVar.a;
                if (this.d.o) {
                }
            }
        } else {
            lVar.getClass();
        }
        z10 = true;
        i0 i0Var22 = lVar.r;
        long j152 = lVar.k;
        long j162 = 0;
        if (z10) {
        }
        this.d = lVar2;
        Uri uri2 = this.a;
        if (lVar2 == lVar3) {
        }
        l lVar72 = this.d;
        kVar = lVar72.v;
        long j192 = lVar72.m;
        if (!kVar.e) {
        }
        j162 = j192;
        this.h = (d0.e0(j162) + elapsedRealtime) - tVar.a;
        if (this.d.o) {
        }
    }

    @Override // y2.h
    public final k4.d g(y2.j jVar, long j3, long j10, IOException iOException, int i10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.a;
        int i11 = pVar.c;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof q;
        k4.d dVar = y2.m.e;
        c cVar = this.w;
        if (z10 || z11) {
            int i12 = iOException instanceof x ? ((x) iOException).d : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z11 || i12 == 400 || i12 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(false);
                a5.a aVar = cVar.f;
                String str = d0.a;
                aVar.q(tVar, i11, iOException, true);
                return dVar;
            }
        }
        b0 b0Var = new b0(iOException, i10, 11);
        Iterator it = cVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((t) it.next()).b(this.a, b0Var, false);
        }
        rb.a aVar2 = cVar.c;
        if (z12) {
            aVar2.getClass();
            long M3 = rb.a.M3(b0Var);
            dVar = M3 != -9223372036854775807L ? new k4.d(0, M3, false) : y2.m.f;
        }
        boolean a2 = dVar.a();
        cVar.f.q(tVar, i11, iOException, !a2);
        if (!a2) {
            aVar2.getClass();
        }
        return dVar;
    }

    @Override // y2.h
    public final void h(y2.j jVar, long j3, long j10, int i10) {
        u2.t tVar;
        y2.p pVar = (y2.p) jVar;
        if (i10 == 0) {
            long j11 = pVar.a;
            tVar = new u2.t(pVar.b);
        } else {
            long j12 = pVar.a;
            Uri uri = pVar.d.c;
            tVar = new u2.t(j10);
        }
        this.w.f.r(tVar, pVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.h
    public final void i(y2.j jVar, long j3, long j10) {
        y2.p pVar = (y2.p) jVar;
        p pVar2 = (p) pVar.f;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        if (pVar2 instanceof l) {
            f((l) pVar2, tVar);
            this.w.f.o(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            s0 b10 = s0.b("Loaded playlist has unexpected type.", null);
            this.s = b10;
            this.w.f.q(tVar, 4, b10, true);
        }
        this.w.c.getClass();
    }

    @Override // y2.h
    public final void w(y2.j jVar, long j3, long j10, boolean z10) {
        y2.p pVar = (y2.p) jVar;
        long j11 = pVar.a;
        Uri uri = pVar.d.c;
        u2.t tVar = new u2.t(j10);
        c cVar = this.w;
        cVar.c.getClass();
        cVar.f.n(tVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
