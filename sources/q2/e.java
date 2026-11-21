package q2;

import a8.la;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.vb;
import e2.s0;
import h9.g0;
import h9.h2;
import h9.i0;
import h9.t0;
import h9.t1;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.Components.jn;
import p4.r0;
import p4.z;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
    public m2.i M;
    public volatile android.support.v4.media.session.q N;
    public final UUID a;
    public final r0 b;
    public final ab.q c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final k8.a n;
    public final qb.a r;
    public final jn s;
    public final long w;
    public final ArrayList x;
    public final Set y;

    public e(UUID uuid, ab.q qVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, qb.a aVar) {
        uuid.getClass();
        la.e("Use C.CLEARKEY_UUID instead", !e2.l.c.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = qVar;
        this.d = hashMap;
        this.e = z10;
        this.f = iArr;
        this.h = z11;
        this.r = aVar;
        this.n = new k8.a(23);
        this.s = new jn(this, 10);
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
        f g10 = bVar.g();
        g10.getClass();
        Throwable cause = g10.getCause();
        return (cause instanceof ResourceBusyException) || vb.c(cause);
    }

    public static ArrayList f(e2.r rVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(rVar.d);
        for (int i7 = 0; i7 < rVar.d; i7++) {
            e2.q qVar = rVar.a[i7];
            if ((qVar.a(uuid) || (e2.l.d.equals(uuid) && qVar.a(e2.l.c))) && (qVar.e != null || z10)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    @Override // q2.m
    public final int E1(e2.u uVar) {
        h(false);
        q qVar = this.G;
        qVar.getClass();
        int H = qVar.H();
        e2.r rVar = uVar.w;
        if (rVar == null) {
            int h = s0.h(uVar.s);
            int i7 = 0;
            while (true) {
                int[] iArr = this.f;
                if (i7 >= iArr.length) {
                    i7 = -1;
                    break;
                }
                if (iArr[i7] == h) {
                    break;
                }
                i7++;
            }
            if (i7 == -1) {
                return 0;
            }
        } else if (this.L == null) {
            UUID uuid = this.a;
            if (f(rVar, uuid, true).isEmpty()) {
                if (rVar.d == 1 && rVar.a[0].a(e2.l.c)) {
                    h2.a.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = rVar.c;
            if (str != null && !"cenc".equals(str) && (!"cbcs".equals(str) ? "cbc1".equals(str) || "cens".equals(str) : Build.VERSION.SDK_INT < 25)) {
                return 1;
            }
        }
        return H;
    }

    @Override // q2.m
    public final l M(j jVar, e2.u uVar) {
        la.p(this.F > 0);
        this.J.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.K;
        handler.getClass();
        handler.post(new z(4, dVar, uVar));
        return dVar;
    }

    @Override // q2.m
    public final void a() {
        q sVar;
        h(true);
        int i7 = this.F;
        this.F = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.G == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    sVar = new t(uuid);
                } catch (x unused) {
                    h2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    sVar = new w7.s(21);
                }
                this.G = sVar;
                sVar.a(new c5(this));
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
            ((b) arrayList.get(i10)).b(null);
            i10++;
        }
    }

    public final g b(Looper looper, j jVar, e2.u uVar, boolean z10) {
        ArrayList arrayList;
        if (this.N == null) {
            this.N = new android.support.v4.media.session.q(this, looper, 9);
        }
        e2.r rVar = uVar.w;
        int i7 = 0;
        b bVar = null;
        if (rVar == null) {
            int h = s0.h(uVar.s);
            q qVar = this.G;
            qVar.getClass();
            if (qVar.H() != 2 || !r.c) {
                int[] iArr = this.f;
                while (true) {
                    if (i7 >= iArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (iArr[i7] == h) {
                        break;
                    }
                    i7++;
                }
                if (i7 != -1 && qVar.H() != 1) {
                    b bVar2 = this.H;
                    if (bVar2 == null) {
                        g0 g0Var = i0.b;
                        b e10 = e(t1.e, true, null, z10);
                        this.x.add(e10);
                        this.H = e10;
                    } else {
                        bVar2.b(null);
                    }
                    return this.H;
                }
            }
            return null;
        }
        if (this.L == null) {
            arrayList = f(rVar, this.a, false);
            if (arrayList.isEmpty()) {
                c cVar = new c("Media does not support uuid: " + this.a);
                h2.a.d("DefaultDrmSessionMgr", "DRM error", cVar);
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
            bVar.b(jVar);
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
        m2.i iVar = this.M;
        iVar.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z11, z10, bArr, this.d, this.c, looper, this.r, iVar);
        bVar.b(jVar);
        if (this.w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z10, j jVar, boolean z11) {
        b d = d(list, z10, jVar);
        boolean c10 = c(d);
        long j3 = this.w;
        Set set = this.E;
        if (c10 && !set.isEmpty()) {
            h2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(null);
            }
            d.c(jVar);
            if (j3 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z10, jVar);
        }
        if (c(d) && z11) {
            Set set2 = this.y;
            if (!set2.isEmpty()) {
                h2 it2 = t0.q(set2).iterator();
                while (it2.hasNext()) {
                    ((d) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    h2 it3 = t0.q(set).iterator();
                    while (it3.hasNext()) {
                        ((g) it3.next()).c(null);
                    }
                }
                d.c(jVar);
                if (j3 != -9223372036854775807L) {
                    d.c(null);
                }
                return d(list, z10, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.G != null && this.F == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            q qVar = this.G;
            qVar.getClass();
            qVar.release();
            this.G = null;
        }
    }

    public final void h(boolean z10) {
        if (z10 && this.J == null) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.J;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.J.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // q2.m
    public final g r(j jVar, e2.u uVar) {
        h(false);
        la.p(this.F > 0);
        this.J.getClass();
        return b(this.J, jVar, uVar, true);
    }

    @Override // q2.m
    public final void r1(Looper looper, m2.i iVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.J;
                if (looper2 == null) {
                    this.J = looper;
                    this.K = new Handler(looper);
                } else {
                    la.p(looper2 == looper);
                    this.K.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.M = iVar;
    }

    @Override // q2.m
    public final void release() {
        h(true);
        int i7 = this.F - 1;
        this.F = i7;
        if (i7 != 0) {
            return;
        }
        if (this.w != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.x);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ((b) arrayList.get(i10)).c(null);
            }
        }
        h2 it = t0.q(this.y).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        g();
    }
}
