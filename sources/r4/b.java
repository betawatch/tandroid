package r4;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import com.google.android.gms.internal.cast.z4;
import f5.d0;
import f7.v;
import j3.t1;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import l4.g0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.web.y;
import p2.u;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b implements l0 {
    public final Uri a;
    public final q0 b = new q0("DefaultHlsPlaylistTracker:MediaPlaylist");
    public final com.google.android.exoplayer2.upstream.m c;
    public j d;
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
        this.c = ((com.google.android.exoplayer2.upstream.l) cVar.a.b).createDataSource();
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
            b bVar2 = (b) cVar.d.get(((l) list.get(i10)).a);
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
        t0 t0Var = new t0(this.c, uri, 4, cVar.b.q0(cVar.s, this.d));
        v vVar = cVar.c;
        int i10 = t0Var.c;
        this.b.f(t0Var, this, vVar.B(i10));
        cVar.f.k(new l4.p(t0Var.b), i10, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void c(Uri uri) {
        this.n = 0L;
        if (this.r) {
            return;
        }
        q0 q0Var = this.b;
        if (q0Var.d() || q0Var.c()) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.h;
        if (elapsedRealtime >= j10) {
            b(uri);
        } else {
            this.r = true;
            this.v.n.postDelayed(new y(19, this, uri), j10 - elapsedRealtime);
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
    public final void d(j jVar) {
        boolean z10;
        CopyOnWriteArrayList copyOnWriteArrayList;
        long j10;
        long j11;
        long j12;
        int i10;
        z zVar;
        j jVar2;
        z4 z4Var;
        long j13;
        z4 z4Var2;
        boolean z11;
        i iVar;
        j jVar3;
        int size;
        int size2;
        int size3;
        j jVar4 = this.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.e = elapsedRealtime;
        c cVar = this.v;
        CopyOnWriteArrayList copyOnWriteArrayList2 = cVar.e;
        if (jVar4 != null) {
            long j14 = jVar.k;
            long j15 = jVar4.k;
            if (j14 <= j15 && (j14 < j15 || ((size = jVar.r.size() - jVar4.r.size()) == 0 ? !((size2 = jVar.s.size()) > (size3 = jVar4.s.size()) || (size2 == size3 && jVar.o && !jVar4.o)) : size <= 0))) {
                z10 = false;
                z zVar2 = jVar.r;
                long j16 = jVar.k;
                long j17 = 0;
                if (z10) {
                    if (!jVar.o) {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        jVar2 = jVar4;
                        j13 = j16;
                    } else if (jVar4.o) {
                        jVar2 = jVar4;
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        z4Var = null;
                    } else {
                        copyOnWriteArrayList = copyOnWriteArrayList2;
                        j13 = j16;
                        jVar2 = new j(jVar4.d, jVar4.a, jVar4.b, jVar4.e, jVar4.g, jVar4.h, jVar4.i, jVar4.j, jVar4.k, jVar4.l, jVar4.m, jVar4.n, jVar4.c, true, jVar4.p, jVar4.q, jVar4.r, jVar4.s, jVar4.v, jVar4.t);
                    }
                    z4Var = null;
                } else {
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                    if (jVar.p) {
                        j10 = jVar.h;
                    } else {
                        j jVar5 = cVar.w;
                        j10 = jVar5 != null ? jVar5.h : 0L;
                        if (jVar4 != null) {
                            long j18 = jVar4.h;
                            long j19 = jVar4.k;
                            z zVar3 = jVar4.r;
                            j11 = j10;
                            int size4 = zVar3.size();
                            int i11 = (int) (j16 - j19);
                            g gVar = i11 < zVar3.size() ? (g) zVar3.get(i11) : null;
                            if (gVar != null) {
                                j12 = gVar.e;
                            } else {
                                if (size4 == j16 - j19) {
                                    j12 = jVar4.u;
                                }
                                if (jVar.i) {
                                    j jVar6 = cVar.w;
                                    int i12 = jVar6 != null ? jVar6.j : 0;
                                    if (jVar4 != null) {
                                        int i13 = (int) (j16 - jVar4.k);
                                        z zVar4 = jVar4.r;
                                        g gVar2 = i13 < zVar4.size() ? (g) zVar4.get(i13) : null;
                                        if (gVar2 != null) {
                                            i12 = (jVar4.j + gVar2.d) - ((g) zVar2.get(0)).d;
                                            i10 = i12;
                                            zVar = zVar2;
                                        }
                                    }
                                    i10 = i12;
                                    zVar = zVar2;
                                } else {
                                    i10 = jVar.j;
                                    zVar = zVar2;
                                }
                                z4Var = null;
                                j13 = j16;
                                jVar2 = new j(jVar.d, jVar.a, jVar.b, jVar.e, jVar.g, j11, true, i10, jVar.k, jVar.l, jVar.m, jVar.n, jVar.c, jVar.o, jVar.p, jVar.q, zVar, jVar.s, jVar.v, jVar.t);
                            }
                            j10 = j18 + j12;
                        }
                    }
                    j11 = j10;
                    if (jVar.i) {
                    }
                    z4Var = null;
                    j13 = j16;
                    jVar2 = new j(jVar.d, jVar.a, jVar.b, jVar.e, jVar.g, j11, true, i10, jVar.k, jVar.l, jVar.m, jVar.n, jVar.c, jVar.o, jVar.p, jVar.q, zVar, jVar.s, jVar.v, jVar.t);
                }
                this.d = jVar2;
                Uri uri = this.a;
                if (jVar2 == jVar4) {
                    this.s = z4Var;
                    this.f = elapsedRealtime;
                    if (uri.equals(cVar.v)) {
                        if (cVar.w == null) {
                            cVar.x = !jVar2.o;
                            cVar.y = jVar2.h;
                        }
                        cVar.w = jVar2;
                        cVar.r.t(jVar2);
                    }
                    Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((r) it.next()).a();
                    }
                } else if (!jVar2.o) {
                    long size5 = j13 + jVar.r.size();
                    j jVar7 = this.d;
                    if (size5 < jVar7.k) {
                        z4Var2 = new z4();
                        z11 = true;
                    } else {
                        z4Var2 = ((double) (elapsedRealtime - this.f)) > ((double) d0.S(jVar7.m)) * 3.5d ? new z4() : z4Var;
                        z11 = false;
                    }
                    if (z4Var2 != null) {
                        this.s = z4Var2;
                        u uVar = new u(z4Var2, 1, 2);
                        Iterator it2 = copyOnWriteArrayList.iterator();
                        while (it2.hasNext()) {
                            ((r) it2.next()).c(uri, uVar, z11);
                        }
                    }
                }
                j jVar8 = this.d;
                iVar = jVar8.v;
                long j20 = jVar8.m;
                if (!iVar.e) {
                    if (jVar8 == jVar4) {
                        j20 /= 2;
                    }
                    j17 = j20;
                }
                this.h = d0.S(j17) + elapsedRealtime;
                if (this.d.n == -9223372036854775807L || uri.equals(cVar.v)) {
                    jVar3 = this.d;
                    if (jVar3.o) {
                        i iVar2 = jVar3.v;
                        if (iVar2.a != -9223372036854775807L || iVar2.e) {
                            Uri.Builder buildUpon = uri.buildUpon();
                            j jVar9 = this.d;
                            if (jVar9.v.e) {
                                buildUpon.appendQueryParameter("_HLS_msn", String.valueOf(jVar9.k + jVar9.r.size()));
                                j jVar10 = this.d;
                                if (jVar10.n != -9223372036854775807L) {
                                    z zVar5 = jVar10.s;
                                    int size6 = zVar5.size();
                                    if (!zVar5.isEmpty() && ((e) q8.l.g(zVar5)).x) {
                                        size6--;
                                    }
                                    buildUpon.appendQueryParameter("_HLS_part", String.valueOf(size6));
                                }
                            }
                            i iVar3 = this.d.v;
                            if (iVar3.a != -9223372036854775807L) {
                                buildUpon.appendQueryParameter("_HLS_skip", iVar3.b ? "v2" : "YES");
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
            jVar.getClass();
        }
        z10 = true;
        z zVar22 = jVar.r;
        long j162 = jVar.k;
        long j172 = 0;
        if (z10) {
        }
        this.d = jVar2;
        Uri uri2 = this.a;
        if (jVar2 == jVar4) {
        }
        j jVar82 = this.d;
        iVar = jVar82.v;
        long j202 = jVar82.m;
        if (!iVar.e) {
        }
        this.h = d0.S(j172) + elapsedRealtime;
        if (this.d.n == -9223372036854775807L) {
        }
        jVar3 = this.d;
        if (jVar3.o) {
        }
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void g(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.a;
        Uri uri = t0Var.d.c;
        l4.p pVar = new l4.p();
        c cVar = this.v;
        cVar.c.getClass();
        cVar.f.d(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final k0 j(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        long j10 = t0Var.a;
        int i11 = t0Var.c;
        Uri uri = t0Var.d.c;
        l4.p pVar = new l4.p();
        boolean z10 = uri.getQueryParameter("_HLS_msn") != null;
        boolean z11 = iOException instanceof o;
        k0 k0Var = q0.e;
        Uri uri2 = this.a;
        c cVar = this.v;
        if (z10 || z11) {
            int i12 = iOException instanceof h0 ? ((h0) iOException).d : ConnectionsManager.DEFAULT_DATACENTER_ID;
            if (z11 || i12 == 400 || i12 == 503) {
                this.h = SystemClock.elapsedRealtime();
                c(uri2);
                g0 g0Var = cVar.f;
                int i13 = d0.a;
                g0Var.i(pVar, i11, iOException, true);
                return k0Var;
            }
        }
        u uVar = new u(iOException, i10, 2);
        Iterator it = cVar.e.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            z12 |= !((r) it.next()).c(uri2, uVar, false);
        }
        v vVar = cVar.c;
        if (z12) {
            vVar.getClass();
            long D = v.D(uVar);
            k0Var = D != -9223372036854775807L ? new k0(0, D, false) : q0.f;
        }
        boolean a2 = k0Var.a();
        cVar.f.i(pVar, i11, iOException, !a2);
        if (!a2) {
            vVar.getClass();
        }
        return k0Var;
    }

    @Override // com.google.android.exoplayer2.upstream.l0
    public final void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        n nVar = (n) t0Var.f;
        Uri uri = t0Var.d.c;
        l4.p pVar = new l4.p();
        if (nVar instanceof j) {
            d((j) nVar);
            this.v.f.f(pVar, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            t1 b10 = t1.b("Loaded playlist has unexpected type.", null);
            this.s = b10;
            this.v.f.i(pVar, 4, b10, true);
        }
        this.v.c.getClass();
    }
}
