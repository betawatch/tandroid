package s2;

import a8.ia;
import a8.wa;
import android.net.Uri;
import android.os.SystemClock;
import e2.t0;
import h2.m0;
import h9.i0;
import j2.c0;
import j2.y;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b implements b3.j {
    public final Uri a;
    public final String b;
    public final b3.o c = new b3.o("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final j2.h d;
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
        this.d = ((j2.g) dVar.a.a).createDataSource();
    }

    @Override // b3.j
    public final void M0(b3.l lVar, long j3, long j10, int i7) {
        x2.u uVar;
        b3.r rVar = (b3.r) lVar;
        if (i7 == 0) {
            long j11 = rVar.a;
            uVar = new x2.u(rVar.b, j3);
        } else {
            long j12 = rVar.a;
            j2.m mVar = rVar.b;
            c0 c0Var = rVar.d;
            uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        }
        this.y.f.t(uVar, rVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i7);
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
                        if (!i0Var.isEmpty() && ((h) h9.o.n(i0Var)).y) {
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
        b3.q I = dVar.b.I(dVar.s, this.e);
        Map map = Collections.EMPTY_MAP;
        ia.k(uri, "The uri must be set.");
        b3.r rVar = new b3.r(this.d, new j2.m(uri, 1, null, map, 0L, -1L, null, 1), 4, I);
        this.c.f(rVar, this, dVar.c.X0(rVar.c));
    }

    public final void c(Uri uri) {
        this.r = 0L;
        if (this.s) {
            return;
        }
        b3.o oVar = this.c;
        if (oVar.d() || oVar.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = this.n;
        if (elapsedRealtime >= j3) {
            b(uri);
        } else {
            this.s = true;
            this.y.n.postDelayed(new org.telegram.ui.web.w(22, this, uri), j3 - elapsedRealtime);
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
    public final void d(m mVar, x2.u uVar) {
        boolean z9;
        CopyOnWriteArrayList copyOnWriteArrayList;
        boolean z10;
        long j3;
        long j10;
        long j11;
        int i7;
        i0 i0Var;
        m mVar2;
        androidx.datastore.preferences.protobuf.l lVar;
        long j12;
        androidx.datastore.preferences.protobuf.l lVar2;
        boolean z11;
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
            long j13 = mVar.k;
            long j14 = mVar3.k;
            if (j13 <= j14 && (j13 < j14 || ((size = mVar.r.size() - mVar3.r.size()) == 0 ? !((size2 = mVar.s.size()) > (size3 = mVar3.s.size()) || (size2 == size3 && mVar.o && !mVar3.o)) : size <= 0))) {
                z9 = false;
                i0 i0Var2 = mVar.r;
                long j15 = mVar.k;
                long j16 = 0;
                if (z9) {
                    if (!mVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        z10 = true;
                        mVar2 = mVar3;
                        j12 = j15;
                    } else if (mVar3.o) {
                        mVar2 = mVar3;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j12 = j15;
                        lVar = null;
                        z10 = true;
                    } else {
                        z10 = true;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j12 = j15;
                        mVar2 = new m(mVar3.d, mVar3.a, mVar3.b, mVar3.e, mVar3.g, mVar3.h, mVar3.i, mVar3.j, mVar3.k, mVar3.l, mVar3.m, mVar3.n, mVar3.c, true, mVar3.p, mVar3.q, mVar3.r, mVar3.s, mVar3.v, mVar3.t, mVar3.w, mVar3.x);
                    }
                    lVar = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    z10 = true;
                    if (mVar.p) {
                        j3 = mVar.h;
                    } else {
                        m mVar4 = dVar.G;
                        j3 = mVar4 != null ? mVar4.h : 0L;
                        if (mVar3 != null) {
                            long j17 = mVar3.h;
                            long j18 = mVar3.k;
                            i0 i0Var3 = mVar3.r;
                            j10 = j3;
                            int size4 = i0Var3.size();
                            int i10 = (int) (j15 - j18);
                            j jVar = i10 < i0Var3.size() ? (j) i0Var3.get(i10) : null;
                            if (jVar != null) {
                                j11 = jVar.e;
                            } else {
                                if (size4 == j15 - j18) {
                                    j11 = mVar3.u;
                                }
                                if (mVar.i) {
                                    m mVar5 = dVar.G;
                                    int i11 = mVar5 != null ? mVar5.j : 0;
                                    if (mVar3 != null) {
                                        int i12 = (int) (j15 - mVar3.k);
                                        i0 i0Var4 = mVar3.r;
                                        j jVar2 = i12 < i0Var4.size() ? (j) i0Var4.get(i12) : null;
                                        if (jVar2 != null) {
                                            i11 = (mVar3.j + jVar2.d) - ((j) i0Var2.get(0)).d;
                                            i7 = i11;
                                            i0Var = i0Var2;
                                        }
                                    }
                                    i7 = i11;
                                    i0Var = i0Var2;
                                } else {
                                    i7 = mVar.j;
                                    i0Var = i0Var2;
                                }
                                lVar = null;
                                j12 = j15;
                                mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j10, true, i7, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, i0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                            }
                            j3 = j17 + j11;
                        }
                    }
                    j10 = j3;
                    if (mVar.i) {
                    }
                    lVar = null;
                    j12 = j15;
                    mVar2 = new m(mVar.d, mVar.a, mVar.b, mVar.e, mVar.g, j10, true, i7, mVar.k, mVar.l, mVar.m, mVar.n, mVar.c, mVar.o, mVar.p, mVar.q, i0Var, mVar.s, mVar.v, mVar.t, mVar.w, mVar.x);
                }
                this.e = mVar2;
                Uri uri = this.a;
                if (mVar2 == mVar3) {
                    this.w = lVar;
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
                    long size5 = j12 + mVar.r.size();
                    m mVar6 = this.e;
                    if (size5 < mVar6.k) {
                        lVar2 = new androidx.datastore.preferences.protobuf.l();
                        z11 = z10;
                    } else {
                        lVar2 = ((double) (elapsedRealtime - this.h)) > ((double) m0.h0(mVar6.m)) * 3.5d ? new androidx.datastore.preferences.protobuf.l() : lVar;
                        z11 = false;
                    }
                    if (lVar2 != null) {
                        this.w = lVar2;
                        f5.u uVar2 = new f5.u(lVar2, z10 ? 1 : 0, 2);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((u) it2.next()).d(uri, uVar2, z11);
                        }
                    }
                }
                m mVar7 = this.e;
                lVar3 = mVar7.v;
                long j19 = mVar7.m;
                if (!lVar3.e) {
                    if (mVar7 == mVar3) {
                        long j20 = mVar7.n;
                        if (j20 != -9223372036854775807L) {
                            j16 = j20 / 2;
                        } else {
                            j19 /= 2;
                        }
                    }
                    this.n = (m0.h0(j16) + elapsedRealtime) - uVar.e;
                    if (this.e.o) {
                        return;
                    }
                    if (uri.equals(dVar.F) || this.x) {
                        c(a());
                        return;
                    }
                    return;
                }
                if (mVar7 == mVar3) {
                    j19 /= 2;
                }
                j16 = j19;
                this.n = (m0.h0(j16) + elapsedRealtime) - uVar.e;
                if (this.e.o) {
                }
            }
        } else {
            mVar.getClass();
        }
        z9 = true;
        i0 i0Var22 = mVar.r;
        long j152 = mVar.k;
        long j162 = 0;
        if (z9) {
        }
        this.e = mVar2;
        Uri uri2 = this.a;
        if (mVar2 == mVar3) {
        }
        m mVar72 = this.e;
        lVar3 = mVar72.v;
        long j192 = mVar72.m;
        if (!lVar3.e) {
        }
        j162 = j192;
        this.n = (m0.h0(j162) + elapsedRealtime) - uVar.e;
        if (this.e.o) {
        }
    }

    @Override // b3.j
    public final b3.i o0(b3.l lVar, long j3, long j10, IOException iOException, int i7) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.a;
        int i10 = rVar.c;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        Uri uri = c0Var.c;
        x2.u uVar = new x2.u(mVar, uri, c0Var.d, j3, j10, c0Var.b);
        boolean z9 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z10 = iOException instanceof r;
        b3.i iVar = b3.o.e;
        Uri uri2 = this.a;
        d dVar = this.y;
        if (z9 || z10) {
            int i11 = iOException instanceof y ? ((y) iOException).c : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z10 || i11 == 400 || i11 == 503) {
                this.n = SystemClock.elapsedRealtime();
                c(uri2);
                wa waVar = dVar.f;
                String str = m0.a;
                waVar.r(uVar, i10, iOException, true);
                return iVar;
            }
        }
        f5.u uVar2 = new f5.u(iOException, i7, 2);
        Iterator it = dVar.e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((u) it.next()).d(uri2, uVar2, false);
        }
        pb.b bVar = dVar.c;
        if (z11) {
            bVar.getClass();
            long a12 = pb.b.a1(uVar2);
            iVar = a12 != -9223372036854775807L ? new b3.i(0, a12, false) : b3.o.f;
        }
        boolean a10 = iVar.a();
        dVar.f.r(uVar, i10, iOException, !a10);
        if (!a10) {
            bVar.getClass();
        }
        return iVar;
    }

    @Override // b3.j
    public final void o1(b3.l lVar, long j3, long j10) {
        b3.r rVar = (b3.r) lVar;
        q qVar = (q) rVar.f;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        if (qVar instanceof m) {
            d((m) qVar, uVar);
            this.y.f.p(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t0 b10 = t0.b("Loaded playlist has unexpected type.", null);
            this.w = b10;
            this.y.f.r(uVar, 4, b10, true);
        }
        this.y.c.getClass();
    }

    @Override // b3.j
    public final void q0(b3.l lVar, long j3, long j10, boolean z9) {
        b3.r rVar = (b3.r) lVar;
        long j11 = rVar.a;
        j2.m mVar = rVar.b;
        c0 c0Var = rVar.d;
        x2.u uVar = new x2.u(mVar, c0Var.c, c0Var.d, j3, j10, c0Var.b);
        d dVar = this.y;
        dVar.c.getClass();
        dVar.f.o(uVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }
}
