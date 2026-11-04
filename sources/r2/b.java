package r2;

import android.net.Uri;
import android.os.SystemClock;
import b8.kg;
import b8.zb;
import d2.v0;
import g2.n0;
import g9.i0;
import i2.c0;
import i2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements a3.k {
    public final Uri a;
    public final String b;
    public final a3.q c = new a3.q("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final i2.h d;
    public m e;
    public long f;
    public long h;
    public long n;
    public long r;
    public boolean s;
    public IOException w;
    public boolean x;
    public final /* synthetic */ d y;

    public b(d dVar, Uri uri, String str) {
        this.y = dVar;
        this.a = uri;
        this.b = str;
        this.d = ((i2.g) dVar.a.b).createDataSource();
    }

    @Override // a3.k
    public final void M(a3.m mVar, long j10, long j11, int i3) {
        w2.u uVar;
        a3.t tVar = (a3.t) mVar;
        if (i3 == 0) {
            long j12 = tVar.a;
            uVar = new w2.u(tVar.b, j10);
        } else {
            long j13 = tVar.a;
            i2.n nVar = tVar.b;
            c0 c0Var = tVar.d;
            uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        }
        this.y.f.u(uVar, tVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i3);
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
                        i0 i0Var = mVar3.s;
                        int size = i0Var.size();
                        if (!i0Var.isEmpty() && ((h) g9.o.n(i0Var)).y) {
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
        d dVar = this.y;
        a3.s j22 = dVar.b.j2(dVar.s, this.e);
        Map map = Collections.EMPTY_MAP;
        zb.k(uri, "The uri must be set.");
        a3.t tVar = new a3.t(this.d, new i2.n(uri, 1, null, map, 0L, -1L, null, 1), 4, j22);
        this.c.f(tVar, this, dVar.c.F4(tVar.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        a3.q qVar = this.c;
        if (qVar.d() || qVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.n;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.s = true;
            this.y.n.postDelayed(new hc1(21, this, uri), j10 - elapsedRealtime);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(m mVar, w2.u uVar) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z11;
        long j10;
        long j11;
        long j12;
        int i3;
        i0 i0Var;
        m mVar2;
        androidx.datastore.preferences.protobuf.l lVar;
        long j13;
        androidx.datastore.preferences.protobuf.l lVar2;
        boolean z12;
        l lVar3;
        int size;
        int size2;
        int size3;
        m mVar3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f = elapsedRealtime;
        d dVar = this.y;
        CopyOnWriteArrayList copyOnWriteArrayList2 = dVar.e;
        if (mVar3 != null) {
            long j14 = mVar.k;
            long j15 = mVar3.k;
            if (j14 <= j15 && (j14 < j15 || ((size = mVar.r.size() - mVar3.r.size()) == 0 ? !((size2 = mVar.s.size()) > (size3 = mVar3.s.size()) || (size2 == size3 && mVar.o && !mVar3.o)) : size <= 0))) {
                z10 = false;
                i0 i0Var2 = mVar.r;
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
                        lVar = null;
                        z11 = true;
                    } else {
                        z11 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        mVar2 = new m(mVar3.d, mVar3.a, mVar3.b, mVar3.e, mVar3.g, mVar3.h, mVar3.i, mVar3.j, mVar3.k, mVar3.l, mVar3.m, mVar3.n, mVar3.c, true, mVar3.p, mVar3.q, mVar3.r, mVar3.s, mVar3.v, mVar3.t, mVar3.w, mVar3.x);
                    }
                    lVar = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z11 = true;
                    if (mVar.p) {
                        j10 = mVar.h;
                    } else {
                        m mVar4 = dVar.H;
                        j10 = mVar4 != null ? mVar4.h : 0L;
                        if (mVar3 != null) {
                            long j18 = mVar3.h;
                            long j19 = mVar3.k;
                            i0 i0Var3 = mVar3.r;
                            j11 = j10;
                            int size4 = i0Var3.size();
                            int i10 = (int) (j16 - j19);
                            j jVar = i10 < i0Var3.size() ? (j) i0Var3.get(i10) : null;
                            if (jVar != null) {
                                j12 = jVar.e;
                            } else {
                                if (size4 == j16 - j19) {
                                    j12 = mVar3.u;
                                }
                                if (mVar.i) {
                                    m mVar5 = dVar.H;
                                    int i11 = mVar5 != null ? mVar5.j : 0;
                                    if (mVar3 != null) {
                                        int i12 = (int) (j16 - mVar3.k);
                                        i0 i0Var4 = mVar3.r;
                                        j jVar2 = i12 < i0Var4.size() ? (j) i0Var4.get(i12) : null;
                                        if (jVar2 != null) {
                                            i11 = (mVar3.j + jVar2.d) - ((j) i0Var2.get(0)).d;
                                            i3 = i11;
                                            i0Var = i0Var2;
                                        }
                                    }
                                    i3 = i11;
                                    i0Var = i0Var2;
                                } else {
                                    i3 = mVar.j;
                                    i0Var = i0Var2;
                                }
                                lVar = null;
                                j13 = j16;
                                mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j11, true, i3, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, i0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                            }
                            j10 = j18 + j12;
                        }
                    }
                    j11 = j10;
                    if (mVar.i) {
                    }
                    lVar = null;
                    j13 = j16;
                    mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j11, true, i3, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, i0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                }
                this.e = mVar2;
                Uri uri = this.a;
                if (mVar2 == mVar3) {
                    this.w = lVar;
                    this.h = elapsedRealtime;
                    if (uri.equals(dVar.G)) {
                        if (dVar.H == null) {
                            dVar.I = !mVar2.o;
                            dVar.J = mVar2.h;
                        }
                        dVar.H = mVar2;
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
                        lVar2 = new androidx.datastore.preferences.protobuf.l();
                        z12 = z11;
                    } else {
                        lVar2 = ((double) (elapsedRealtime - this.h)) > ((double) n0.h0(mVar6.m)) * 3.5d ? new androidx.datastore.preferences.protobuf.l() : lVar;
                        z12 = false;
                    }
                    if (lVar2 != null) {
                        this.w = lVar2;
                        e5.u uVar2 = new e5.u(lVar2, z11 ? 1 : 0, 1);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((u) it2.next()).b(uri, uVar2, z12);
                        }
                    }
                }
                m mVar7 = this.e;
                lVar3 = mVar7.v;
                long j20 = mVar7.m;
                if (!lVar3.e) {
                    if (mVar7 == mVar3) {
                        long j21 = mVar7.n;
                        if (j21 != -9223372036854775807L) {
                            j17 = j21 / 2;
                        } else {
                            j20 /= 2;
                        }
                    }
                    this.n = (n0.h0(j17) + elapsedRealtime) - uVar.e;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(dVar.G) || this.x) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (mVar7 == mVar3) {
                    j20 /= 2;
                }
                j17 = j20;
                this.n = (n0.h0(j17) + elapsedRealtime) - uVar.e;
                if (this.e.o) {
                }
            }
        } else {
            mVar.getClass();
        }
        z10 = true;
        i0 i0Var22 = mVar.r;
        long j162 = mVar.k;
        long j172 = 0;
        if (z10) {
        }
        this.e = mVar2;
        Uri uri2 = this.a;
        if (mVar2 == mVar3) {
        }
        m mVar72 = this.e;
        lVar3 = mVar72.v;
        long j202 = mVar72.m;
        if (!lVar3.e) {
        }
        j172 = j202;
        this.n = (n0.h0(j172) + elapsedRealtime) - uVar.e;
        if (this.e.o) {
        }
    }

    @Override // a3.k
    public final void h(a3.m mVar, long j10, long j11) {
        a3.t tVar = (a3.t) mVar;
        q qVar = (q) tVar.f;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.y.f.q(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            v0 b10 = v0.b("Loaded playlist has unexpected type.", null);
            this.w = b10;
            this.y.f.s(uVar, 4, b10, true);
        }
        this.y.c.getClass();
    }

    @Override // a3.k
    public final a3.i k(a3.m mVar, long j10, long j11, IOException iOException, int i3) {
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.a;
        int i10 = tVar.c;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        Uri uri = c0Var.c;
        w2.u uVar = new w2.u(nVar, uri, c0Var.d, j10, j11, c0Var.b);
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof r;
        a3.i iVar = a3.q.e;
        Uri uri2 = this.a;
        d dVar = this.y;
        if (z10 || z11) {
            int i11 = iOException instanceof y ? ((y) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z11 || i11 == 400 || i11 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri2);
                kg kgVar = dVar.f;
                String str = n0.a;
                kgVar.s(uVar, i10, iOException, true);
                return iVar;
            }
        }
        e5.u uVar2 = new e5.u(iOException, i3, 1);
        Iterator it = dVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((u) it.next()).b(uri2, uVar2, false);
        }
        kb.a aVar = dVar.c;
        if (z12) {
            aVar.getClass();
            long G4 = kb.a.G4(uVar2);
            iVar = G4 != -9223372036854775807L ? new a3.i(0, G4, false) : a3.q.f;
        }
        boolean a10 = iVar.a();
        dVar.f.s(uVar, i10, iOException, !a10);
        if (!a10) {
            aVar.getClass();
        }
        return iVar;
    }

    @Override // a3.k
    public final void q0(a3.m mVar, long j10, long j11, boolean z10) {
        a3.t tVar = (a3.t) mVar;
        long j12 = tVar.a;
        i2.n nVar = tVar.b;
        c0 c0Var = tVar.d;
        w2.u uVar = new w2.u(nVar, c0Var.c, c0Var.d, j10, j11, c0Var.b);
        d dVar = this.y;
        dVar.c.getClass();
        dVar.f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
