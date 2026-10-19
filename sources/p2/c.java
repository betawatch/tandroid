package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.w0;
import c5.c0;
import com.google.android.gms.internal.cast.z4;
import e2.m0;
import e9.n0;
import g2.b0;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;
import v7.u6;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class c implements y2.g {
    public final Uri a;
    public final String b;
    public final y2.l c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public n e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException v;
    public boolean w;
    public final /* synthetic */ e x;

    public c(e eVar, Uri uri, String str) {
        this.x = eVar;
        this.a = uri;
        this.b = str;
        this.d = ((g2.g) eVar.a.b).createDataSource();
    }

    @Override // y2.g
    public final void J(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        e eVar = this.x;
        eVar.c.getClass();
        eVar.f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        n nVar = this.e;
        Uri uri = this.a;
        if (nVar != null) {
            m mVar = nVar.v;
            if (mVar.a != -9223372036854775807L || mVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                n nVar2 = this.e;
                if (nVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(nVar2.k + nVar2.r.size()));
                    n nVar3 = this.e;
                    if (nVar3.n != -9223372036854775807L) {
                        n0 n0Var = nVar3.s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((i) e9.s.m(n0Var)).x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                m mVar2 = this.e.v;
                if (mVar2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", mVar2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        e eVar = this.x;
        y2.n U = eVar.b.U(eVar.s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.c.f(oVar, this, eVar.c.y3(oVar.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        y2.l lVar = this.c;
        if (lVar.d() || lVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.n;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.s = true;
            this.x.n.postDelayed(new b(0, this, uri), j10 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(n nVar, u2.u uVar) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z11;
        long j10;
        long j11;
        long j12;
        int i10;
        n0 n0Var;
        n nVar2;
        z4 z4Var;
        long j13;
        z4 z4Var2;
        boolean z12;
        m mVar;
        int size;
        int size2;
        int size3;
        n nVar3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        e eVar = this.x;
        CopyOnWriteArrayList copyOnWriteArrayList2 = eVar.e;
        if (nVar3 != null) {
            long j14 = nVar.k;
            long j15 = nVar3.k;
            if (j14 <= j15 && (j14 < j15 || ((size = nVar.r.size() - nVar3.r.size()) == 0 ? !((size2 = nVar.s.size()) > (size3 = nVar3.s.size()) || (size2 == size3 && nVar.o && !nVar3.o)) : size <= 0))) {
                z10 = false;
                n0 n0Var2 = nVar.r;
                long j16 = nVar.k;
                long j17 = 0;
                if (z10) {
                    if (!nVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z11 = true;
                        nVar2 = nVar3;
                        j13 = j16;
                    } else if (nVar3.o) {
                        nVar2 = nVar3;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        z4Var = null;
                        z11 = true;
                    } else {
                        z11 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        nVar2 = new n(nVar3.d, nVar3.a, nVar3.b, nVar3.e, nVar3.g, nVar3.h, nVar3.i, nVar3.j, nVar3.k, nVar3.l, nVar3.m, nVar3.n, nVar3.c, true, nVar3.p, nVar3.q, nVar3.r, nVar3.s, nVar3.v, nVar3.t, nVar3.w, nVar3.x);
                    }
                    z4Var = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z11 = true;
                    if (nVar.p) {
                        j10 = nVar.h;
                    } else {
                        n nVar4 = eVar.G;
                        j10 = nVar4 != null ? nVar4.h : 0L;
                        if (nVar3 != null) {
                            long j18 = nVar3.h;
                            long j19 = nVar3.k;
                            n0 n0Var3 = nVar3.r;
                            j11 = j10;
                            int size4 = n0Var3.size();
                            int i11 = (int) (j16 - j19);
                            k kVar = i11 < n0Var3.size() ? (k) n0Var3.get(i11) : null;
                            if (kVar != null) {
                                j12 = kVar.e;
                            } else {
                                if (size4 == j16 - j19) {
                                    j12 = nVar3.u;
                                }
                                if (nVar.i) {
                                    n nVar5 = eVar.G;
                                    int i12 = nVar5 != null ? nVar5.j : 0;
                                    if (nVar3 != null) {
                                        int i13 = (int) (j16 - nVar3.k);
                                        n0 n0Var4 = nVar3.r;
                                        k kVar2 = i13 < n0Var4.size() ? (k) n0Var4.get(i13) : null;
                                        if (kVar2 != null) {
                                            i12 = (nVar3.j + kVar2.d) - ((k) n0Var2.get(0)).d;
                                            i10 = i12;
                                            n0Var = n0Var2;
                                        }
                                    }
                                    i10 = i12;
                                    n0Var = n0Var2;
                                } else {
                                    i10 = nVar.j;
                                    n0Var = n0Var2;
                                }
                                z4Var = null;
                                j13 = j16;
                                nVar2 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j11, true, i10, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, n0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
                            }
                            j10 = j18 + j12;
                        }
                    }
                    j11 = j10;
                    if (nVar.i) {
                    }
                    z4Var = null;
                    j13 = j16;
                    nVar2 = new n(nVar.d, nVar.a, nVar.b, nVar.e, nVar.g, j11, true, i10, nVar.k, nVar.l, nVar.m, nVar.n, nVar.c, nVar.o, nVar.p, nVar.q, n0Var, nVar.s, nVar.v, nVar.t, nVar.w, nVar.x);
                }
                this.e = nVar2;
                Uri uri = this.a;
                if (nVar2 == nVar3) {
                    this.v = z4Var;
                    this.h = elapsedRealtime;
                    if (uri.equals(eVar.F)) {
                        if (eVar.G == null) {
                            eVar.H = !nVar2.o;
                            eVar.I = nVar2.h;
                        }
                        eVar.G = nVar2;
                        eVar.r.v(nVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((v) it.next()).a();
                    }
                } else if (!nVar2.o) {
                    long size5 = j13 + nVar.r.size();
                    n nVar6 = this.e;
                    if (size5 < nVar6.k) {
                        z4Var2 = new z4();
                        z12 = z11;
                    } else {
                        z4Var2 = ((double) (elapsedRealtime - this.h)) > ((double) m0.h0(nVar6.m)) * 3.5d ? new z4() : z4Var;
                        z12 = false;
                    }
                    if (z4Var2 != null) {
                        this.v = z4Var2;
                        c0 c0Var = new c0(z4Var2, z11 ? 1 : 0, 17);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((v) it2.next()).b(uri, c0Var, z12);
                        }
                    }
                }
                n nVar7 = this.e;
                mVar = nVar7.v;
                long j20 = nVar7.m;
                if (!mVar.e) {
                    if (nVar7 == nVar3) {
                        long j21 = nVar7.n;
                        if (j21 != -9223372036854775807L) {
                            j17 = j21 / 2;
                        } else {
                            j20 /= 2;
                        }
                    }
                    this.n = (m0.h0(j17) + elapsedRealtime) - uVar.e;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(eVar.F) || this.w) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (nVar7 == nVar3) {
                    j20 /= 2;
                }
                j17 = j20;
                this.n = (m0.h0(j17) + elapsedRealtime) - uVar.e;
                if (this.e.o) {
                }
            }
        } else {
            nVar.getClass();
        }
        z10 = true;
        n0 n0Var22 = nVar.r;
        long j162 = nVar.k;
        long j172 = 0;
        if (z10) {
        }
        this.e = nVar2;
        Uri uri2 = this.a;
        if (nVar2 == nVar3) {
        }
        n nVar72 = this.e;
        mVar = nVar72.v;
        long j202 = nVar72.m;
        if (!mVar.e) {
        }
        j172 = j202;
        this.n = (m0.h0(j172) + elapsedRealtime) - uVar.e;
        if (this.e.o) {
        }
    }

    @Override // y2.g
    public final k4.d e(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        int i11 = oVar.c;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.b);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof s;
        k4.d dVar = y2.l.e;
        Uri uri2 = this.a;
        e eVar = this.x;
        if (z10 || z11) {
            int i12 = iOException instanceof g2.x ? ((g2.x) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z11 || i12 == 400 || i12 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = eVar.f;
                String str = m0.a;
                aVar.t(uVar, i11, iOException, true);
                return dVar;
            }
        }
        c0 c0Var = new c0(iOException, i10, 17);
        Iterator it = eVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((v) it.next()).b(uri2, c0Var, false);
        }
        oa.d dVar2 = eVar.c;
        if (z12) {
            dVar2.getClass();
            long z32 = oa.d.z3(c0Var);
            dVar = z32 != -9223372036854775807L ? new k4.d(0, z32, false) : y2.l.f;
        }
        boolean a2 = dVar.a();
        eVar.f.t(uVar, i11, iOException, !a2);
        if (!a2) {
            dVar2.getClass();
        }
        return dVar;
    }

    @Override // y2.g
    public final void h(y2.i iVar, long j10, long j11, int i10) {
        u2.u uVar;
        y2.o oVar = (y2.o) iVar;
        if (i10 == 0) {
            long j12 = oVar.a;
            uVar = new u2.u(oVar.b, j10);
        } else {
            long j13 = oVar.a;
            g2.m mVar = oVar.b;
            b0 b0Var = oVar.d;
            uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        }
        this.x.f.v(uVar, oVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i10);
    }

    @Override // y2.g
    public final void k(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        r rVar = (r) oVar.f;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        if (rVar instanceof n) {
            d((n) rVar, uVar);
            this.x.f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            w0 b10 = w0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.x.f.t(uVar, 4, b10, true);
        }
        this.x.c.getClass();
    }
}
