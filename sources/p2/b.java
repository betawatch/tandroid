package p2;

import android.net.Uri;
import android.os.SystemClock;
import b2.x0;
import c5.c0;
import com.google.android.gms.internal.cast.z4;
import e2.m0;
import e9.n0;
import g2.b0;
import g2.x;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Wallet.t8;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class b implements y2.g {
    public final Uri a;
    public final String b;
    public final y2.l c = new y2.l("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final g2.h d;
    public m e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException v;
    public boolean w;
    public final /* synthetic */ d x;

    public b(d dVar, Uri uri, String str) {
        this.x = dVar;
        this.a = uri;
        this.b = str;
        this.d = ((g2.g) dVar.a.b).createDataSource();
    }

    @Override // y2.g
    public final void B(y2.i iVar, long j10, long j11, boolean z10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        d dVar = this.x;
        dVar.c.getClass();
        dVar.f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final Uri a() {
        m mVar = this.e;
        Uri uri = this.a;
        if (mVar != null) {
            l lVar = mVar.v;
            if (lVar.a != -9223372036854775807L || lVar.e) {
                Uri.Builder buildUpon = uri.buildUpon();
                m mVar2 = this.e;
                if (mVar2.v.e) {
                    buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(mVar2.k + mVar2.r.size()));
                    m mVar3 = this.e;
                    if (mVar3.n != -9223372036854775807L) {
                        n0 n0Var = mVar3.s;
                        int size = n0Var.size();
                        if (!n0Var.isEmpty() && ((h) e9.s.m(n0Var)).x) {
                            size--;
                        }
                        buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                l lVar2 = this.e.v;
                if (lVar2.a != -9223372036854775807L) {
                    buildUpon.appendQueryParameter("_HLS_skip", lVar2.b ? "v2" : "YES");
                }
                return buildUpon.build();
            }
        }
        return uri;
    }

    public final void b(Uri uri) {
        d dVar = this.x;
        y2.n U = dVar.b.U(dVar.s, this.e);
        Map map = Collections.EMPTY_MAP;
        u6.l(uri, "The uri must be set.");
        y2.o oVar = new y2.o(this.d, new g2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, U);
        this.c.f(oVar, this, dVar.c.y3(oVar.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        y2.l lVar = this.c;
        if (lVar.c() || lVar.b()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.n;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.s = true;
            this.x.n.postDelayed(new t8(14, this, uri), j10 - elapsedRealtime);
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
    public final void d(m mVar, u2.u uVar) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z11;
        long j10;
        long j11;
        long j12;
        int i10;
        n0 n0Var;
        m mVar2;
        z4 z4Var;
        long j13;
        z4 z4Var2;
        boolean z12;
        l lVar;
        int size;
        int size2;
        int size3;
        m mVar3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        d dVar = this.x;
        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar.e;
        if (mVar3 != null) {
            long j14 = mVar.k;
            long j15 = mVar3.k;
            if (j14 <= j15 && (j14 < j15 || ((size = mVar.r.size() - mVar3.r.size()) == 0 ? !((size2 = mVar.s.size()) > (size3 = mVar3.s.size()) || (size2 == size3 && mVar.o && !mVar3.o)) : size <= 0))) {
                z10 = false;
                n0 n0Var2 = mVar.r;
                long j16 = mVar.k;
                long j17 = 0;
                if (z10) {
                    if (!mVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z11 = true;
                        mVar2 = mVar3;
                        j13 = j16;
                    } else if (mVar3.o) {
                        mVar2 = mVar3;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        z4Var = null;
                        z11 = true;
                    } else {
                        z11 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        mVar2 = new m(mVar3.d, mVar3.a, mVar3.b, mVar3.e, mVar3.g, mVar3.h, mVar3.i, mVar3.j, mVar3.k, mVar3.l, mVar3.m, mVar3.n, mVar3.c, true, mVar3.p, mVar3.q, mVar3.r, mVar3.s, mVar3.v, mVar3.t, mVar3.w, mVar3.x);
                    }
                    z4Var = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z11 = true;
                    if (mVar.p) {
                        j10 = mVar.h;
                    } else {
                        m mVar4 = dVar.G;
                        j10 = mVar4 != null ? mVar4.h : 0L;
                        if (mVar3 != null) {
                            long j18 = mVar3.h;
                            long j19 = mVar3.k;
                            n0 n0Var3 = mVar3.r;
                            j11 = j10;
                            int size4 = n0Var3.size();
                            int i11 = (int) (j16 - j19);
                            j jVar = i11 < n0Var3.size() ? (j) n0Var3.get(i11) : null;
                            if (jVar != null) {
                                j12 = jVar.e;
                            } else {
                                if (size4 == j16 - j19) {
                                    j12 = mVar3.u;
                                }
                                if (mVar.i) {
                                    m mVar5 = dVar.G;
                                    int i12 = mVar5 != null ? mVar5.j : 0;
                                    if (mVar3 != null) {
                                        int i13 = (int) (j16 - mVar3.k);
                                        n0 n0Var4 = mVar3.r;
                                        j jVar2 = i13 < n0Var4.size() ? (j) n0Var4.get(i13) : null;
                                        if (jVar2 != null) {
                                            i12 = (mVar3.j + jVar2.d) - ((j) n0Var2.get(0)).d;
                                            i10 = i12;
                                            n0Var = n0Var2;
                                        }
                                    }
                                    i10 = i12;
                                    n0Var = n0Var2;
                                } else {
                                    i10 = mVar.j;
                                    n0Var = n0Var2;
                                }
                                z4Var = null;
                                j13 = j16;
                                mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j11, true, i10, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, n0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                            }
                            j10 = j18 + j12;
                        }
                    }
                    j11 = j10;
                    if (mVar.i) {
                    }
                    z4Var = null;
                    j13 = j16;
                    mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j11, true, i10, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, n0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                }
                this.e = mVar2;
                Uri uri = this.a;
                if (mVar2 == mVar3) {
                    this.v = z4Var;
                    this.h = elapsedRealtime;
                    if (uri.equals(dVar.F)) {
                        if (dVar.G == null) {
                            dVar.H = !mVar2.o;
                            dVar.I = mVar2.h;
                        }
                        dVar.G = mVar2;
                        dVar.r.v(mVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((u) it.next()).a();
                    }
                } else if (!mVar2.o) {
                    long size5 = j13 + mVar.r.size();
                    m mVar6 = this.e;
                    if (size5 < mVar6.k) {
                        z4Var2 = new z4();
                        z12 = z11;
                    } else {
                        z4Var2 = ((double) (elapsedRealtime - this.h)) > ((double) m0.h0(mVar6.m)) * 3.5d ? new z4() : z4Var;
                        z12 = false;
                    }
                    if (z4Var2 != null) {
                        this.v = z4Var2;
                        c0 c0Var = new c0(z4Var2, z11 ? 1 : 0, 16);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((u) it2.next()).d(uri, c0Var, z12);
                        }
                    }
                }
                m mVar7 = this.e;
                lVar = mVar7.v;
                long j20 = mVar7.m;
                if (!lVar.e) {
                    if (mVar7 == mVar3) {
                        long j21 = mVar7.n;
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
                    if (uri.equals(dVar.F) || this.w) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (mVar7 == mVar3) {
                    j20 /= 2;
                }
                j17 = j20;
                this.n = (m0.h0(j17) + elapsedRealtime) - uVar.e;
                if (this.e.o) {
                }
            }
        } else {
            mVar.getClass();
        }
        z10 = true;
        n0 n0Var22 = mVar.r;
        long j162 = mVar.k;
        long j172 = 0;
        if (z10) {
        }
        this.e = mVar2;
        Uri uri2 = this.a;
        if (mVar2 == mVar3) {
        }
        m mVar72 = this.e;
        lVar = mVar72.v;
        long j202 = mVar72.m;
        if (!lVar.e) {
        }
        j172 = j202;
        this.n = (m0.h0(j172) + elapsedRealtime) - uVar.e;
        if (this.e.o) {
        }
    }

    @Override // y2.g
    public final k4.d j(y2.i iVar, long j10, long j11, IOException iOException, int i10) {
        y2.o oVar = (y2.o) iVar;
        long j12 = oVar.a;
        int i11 = oVar.c;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        Uri uri = b0Var.c;
        u2.u uVar = new u2.u(mVar, uri, b0Var.d, j10, j11, b0Var.b);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof r;
        k4.d dVar = y2.l.e;
        Uri uri2 = this.a;
        d dVar2 = this.x;
        if (z10 || z11) {
            int i12 = iOException instanceof x ? ((x) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z11 || i12 == 400 || i12 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri2);
                a5.a aVar = dVar2.f;
                String str = m0.a;
                aVar.t(uVar, i11, iOException, true);
                return dVar;
            }
        }
        c0 c0Var = new c0(iOException, i10, 16);
        Iterator it = dVar2.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).d(uri2, c0Var, false);
        }
        oa.d dVar3 = dVar2.c;
        if (z12) {
            dVar3.getClass();
            long z32 = oa.d.z3(c0Var);
            dVar = z32 != -9223372036854775807L ? new k4.d(0, z32, false) : y2.l.f;
        }
        boolean a2 = dVar.a();
        dVar2.f.t(uVar, i11, iOException, !a2);
        if (!a2) {
            dVar3.getClass();
        }
        return dVar;
    }

    @Override // y2.g
    public final void k(y2.i iVar, long j10, long j11, int i10) {
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
    public final void l(y2.i iVar, long j10, long j11) {
        y2.o oVar = (y2.o) iVar;
        q qVar = (q) oVar.f;
        g2.m mVar = oVar.b;
        b0 b0Var = oVar.d;
        u2.u uVar = new u2.u(mVar, b0Var.c, b0Var.d, j10, j11, b0Var.b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.x.f.r(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            x0 b10 = x0.b("Loaded playlist has unexpected type.", null);
            this.v = b10;
            this.x.f.t(uVar, 4, b10, true);
        }
        this.x.c.getClass();
    }
}
