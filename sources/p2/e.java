package p2;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b8.og;
import b8.zb;
import d2.u0;
import g9.g0;
import g9.g2;
import g9.i0;
import g9.s1;
import g9.t0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import mi.h0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.y00;
import org.telegram.ui.hc1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e implements m {
    public final Set E;
    public int F;
    public q G;
    public b H;
    public b I;
    public Looper J;
    public Handler K;
    public byte[] L;
    public l2.k M;
    public volatile android.support.v4.media.session.q N;
    public final UUID a;
    public final org.telegram.utils.twidget.a b;
    public final b4.n c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final h0 n;
    public final kb.a r;
    public final y00 s;
    public final long w;
    public final ArrayList x;
    public final Set y;

    public e(UUID uuid, b4.n nVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, kb.a aVar) {
        uuid.getClass();
        zb.e("Use C.CLEARKEY_UUID instead", !d2.m.c.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = nVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = aVar;
        this.n = new h0(16);
        this.s = new y00(this);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.E = Collections.newSetFromMap(new IdentityHashMap());
        this.w = 300000L;
    }

    public static boolean c(b bVar) {
        bVar.p();
        if (bVar.p != 1) {
            return false;
        }
        f g7 = bVar.g();
        g7.getClass();
        Throwable cause = g7.getCause();
        return (cause instanceof ResourceBusyException) || og.c(cause);
    }

    public static ArrayList g(d2.s sVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(sVar.d);
        for (int i3 = 0; i3 < sVar.d; i3++) {
            d2.r rVar = sVar.a[i3];
            if ((rVar.a(uuid) || (d2.m.d.equals(uuid) && rVar.a(d2.m.c))) && (rVar.e != null || z10)) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }

    @Override // p2.m
    public final g A(j jVar, d2.v vVar) {
        i(false);
        zb.p(this.F > 0);
        this.J.getClass();
        return b(this.J, jVar, vVar, true);
    }

    @Override // p2.m
    public final void a() {
        q eVar;
        i(true);
        int i3 = this.F;
        this.F = i3 + 1;
        if (i3 != 0) {
            return;
        }
        if (this.G == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    eVar = new t(uuid);
                } catch (x unused) {
                    g2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    eVar = new ra.e(20);
                }
                this.G = eVar;
                eVar.m(new i9(this, 10));
                return;
            } catch (UnsupportedSchemeException e10) {
                throw new x(e10);
            } catch (Exception e11) {
                throw new x(e11);
            }
        }
        if (this.w == -9223372036854775807L) {
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((b) arrayList.get(i10)).e(null);
            i10++;
        }
    }

    public final g b(Looper looper, j jVar, d2.v vVar, boolean z10) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new android.support.v4.media.session.q(this, looper, 9);
        }
        d2.s sVar = vVar.w;
        int i3 = 0;
        b bVar = null;
        if (sVar == null) {
            int h = u0.h(vVar.s);
            q qVar = this.G;
            qVar.getClass();
            if (qVar.L1() != 2 || !r.c) {
                int[] iArr = this.f;
                while (true) {
                    if (i3 >= iArr.length) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == h) {
                        break;
                    }
                    i3++;
                }
                if (i3 != -1 && qVar.L1() != 1) {
                    b bVar2 = this.H;
                    if (bVar2 == null) {
                        g0 g0Var = i0.b;
                        b e10 = e(s1.e, true, null, z10);
                        this.x.add(e10);
                        this.H = e10;
                    } else {
                        bVar2.e(null);
                    }
                    return this.H;
                }
            }
            return null;
        }
        if (this.L == null) {
            arrayList = g(sVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                g2.a.d("DefaultDrmSessionMgr", "DRM error", cVar);
                if (jVar != null) {
                    jVar.d(cVar);
                }
                return new n(new f(6003, cVar));
            }
        } else {
            arrayList = null;
        }
        if (this.e) {
            ArrayList arrayList2 = this.x;
            int size = arrayList2.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList2.get(i10);
                i10++;
                b bVar3 = (b) obj;
                if (Objects.equals(bVar3.a, arrayList)) {
                    bVar = bVar3;
                    break;
                }
            }
        } else {
            bVar = this.I;
        }
        if (bVar != null) {
            bVar.e(jVar);
            return bVar;
        }
        b e11 = e(arrayList, false, jVar, z10);
        if (!this.e) {
            this.I = e11;
        }
        this.x.add(e11);
        return e11;
    }

    public final b d(List list, boolean z10, j jVar) {
        this.G.getClass();
        boolean z11 = this.h | z10;
        q qVar = this.G;
        byte[] bArr = this.L;
        Looper looper = this.J;
        looper.getClass();
        l2.k kVar = this.M;
        kVar.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, kVar);
        bVar.e(jVar);
        if (this.w != -9223372036854775807L) {
            bVar.e(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c2 = c(d);
        long j10 = this.w;
        Set set = this.E;
        if (c2 && !set.isEmpty()) {
            g2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).b(null);
            }
            d.b(jVar);
            if (j10 != -9223372036854775807L) {
                d.b(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                g2 it2 = t0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    g2 it3 = t0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).b(null);
                    }
                }
                d.b(jVar);
                if (j10 != -9223372036854775807L) {
                    d.b(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    @Override // p2.m
    public final l f(j jVar, d2.v vVar) {
        zb.p(this.F > 0);
        this.J.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new hc1(18, dVar, vVar));
        return dVar;
    }

    public final void h() {
        if (this.G != null && this.F == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            q qVar = this.G;
            qVar.getClass();
            qVar.release();
            this.G = null;
        }
    }

    public final void i(boolean z10) {
        if (z10 && this.J == null) {
            g2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            g2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // p2.m
    public final void k(Looper looper, l2.k kVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.J;
                if (looper2 == null) {
                    this.J = looper;
                    this.K = new Handler(looper);
                } else {
                    zb.p(looper2 == looper);
                    this.K.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.M = kVar;
    }

    @Override // p2.m
    public final void release() {
        i(true);
        int i3 = this.F - 1;
        this.F = i3;
        if (i3 != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((b) arrayList.get(i10)).b(null);
            }
        }
        g2 it = t0.q(this.y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        h();
    }

    @Override // p2.m
    public final int u(d2.v vVar) {
        i(false);
        q qVar = this.G;
        qVar.getClass();
        int L1 = qVar.L1();
        d2.s sVar = vVar.w;
        if (sVar == null) {
            int h = u0.h(vVar.s);
            int i3 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i3 >= iArr.length) {
                    i3 = -1;
                    break;
                }
                if (iArr[i3] == h) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.a;
            if (g(sVar, uuid, true).isEmpty()) {
                if (sVar.d == 1 && sVar.a[0].a(d2.m.c)) {
                    g2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = sVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return L1;
    }
}
