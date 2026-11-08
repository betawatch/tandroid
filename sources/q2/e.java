package q2;

import a8.ia;
import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import c8.rb;
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
import m4.d0;
import org.telegram.ui.Components.vy;
import p4.r0;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class e implements m {
    public final Set D;
    public int E;
    public q F;
    public b G;
    public b H;
    public Looper I;
    public Handler J;
    public byte[] K;
    public m2.j L;
    public volatile android.support.v4.media.session.q M;
    public final UUID a;
    public final r0 b;
    public final ab.q c;
    public final HashMap d;
    public final boolean e;
    public final int[] f;
    public final boolean h;
    public final d0 n;
    public final pb.b r;
    public final vy s;
    public final long w;
    public final ArrayList x;
    public final Set y;

    public e(UUID uuid, ab.q qVar, HashMap hashMap, boolean z9, int[] iArr, boolean z10, pb.b bVar) {
        uuid.getClass();
        ia.e("Use C.CLEARKEY_UUID instead", !e2.l.c.equals(uuid));
        this.a = uuid;
        this.b = t.d;
        this.c = qVar;
        this.d = hashMap;
        this.e = z9;
        this.f = iArr;
        this.h = z10;
        this.r = bVar;
        this.n = new d0(19);
        this.s = new vy(this, 9);
        this.x = new ArrayList();
        this.y = Collections.newSetFromMap(new IdentityHashMap());
        this.D = Collections.newSetFromMap(new IdentityHashMap());
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
        return (cause instanceof ResourceBusyException) || rb.c(cause);
    }

    public static ArrayList f(e2.r rVar, UUID uuid, boolean z9) {
        ArrayList arrayList = new ArrayList(rVar.d);
        for (int i7 = 0; i7 < rVar.d; i7++) {
            e2.q qVar = rVar.a[i7];
            if ((qVar.a(uuid) || (e2.l.d.equals(uuid) && qVar.a(e2.l.c))) && (qVar.e != null || z9)) {
                arrayList.add(qVar);
            }
        }
        return arrayList;
    }

    @Override // q2.m
    public final void E(Looper looper, m2.j jVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.I;
                if (looper2 == null) {
                    this.I = looper;
                    this.J = new Handler(looper);
                } else {
                    ia.p(looper2 == looper);
                    this.J.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.L = jVar;
    }

    @Override // q2.m
    public final int F(e2.u uVar) {
        h(false);
        q qVar = this.F;
        qVar.getClass();
        int o02 = qVar.o0();
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
        } else if (this.K == null) {
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
        return o02;
    }

    @Override // q2.m
    public final void a() {
        q bVar;
        h(true);
        int i7 = this.E;
        this.E = i7 + 1;
        if (i7 != 0) {
            return;
        }
        if (this.F == null) {
            UUID uuid = this.a;
            this.b.getClass();
            try {
                try {
                    bVar = new t(uuid);
                } catch (x unused) {
                    h2.a.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                    bVar = new pb.b(21);
                }
                this.F = bVar;
                bVar.B(new org.telegram.ui.Components.n(this));
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

    public final g b(Looper looper, j jVar, e2.u uVar, boolean z9) {
        ArrayList arrayList;
        if (this.M == null) {
            this.M = new android.support.v4.media.session.q(this, looper, 9);
        }
        e2.r rVar = uVar.w;
        int i7 = 0;
        b bVar = null;
        if (rVar == null) {
            int h = s0.h(uVar.s);
            q qVar = this.F;
            qVar.getClass();
            if (qVar.o0() != 2 || !r.c) {
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
                if (i7 != -1 && qVar.o0() != 1) {
                    b bVar2 = this.G;
                    if (bVar2 == null) {
                        g0 g0Var = i0.b;
                        b e10 = e(t1.e, true, null, z9);
                        this.x.add(e10);
                        this.G = e10;
                    } else {
                        bVar2.b(null);
                    }
                    return this.G;
                }
            }
            return null;
        }
        if (this.K == null) {
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
            bVar = this.H;
        }
        if (bVar != null) {
            bVar.b(jVar);
            return bVar;
        }
        b e11 = e(arrayList, false, jVar, z9);
        if (!this.e) {
            this.H = e11;
        }
        this.x.add(e11);
        return e11;
    }

    public final b d(List list, boolean z9, j jVar) {
        this.F.getClass();
        boolean z10 = this.h | z9;
        q qVar = this.F;
        byte[] bArr = this.K;
        Looper looper = this.I;
        looper.getClass();
        m2.j jVar2 = this.L;
        jVar2.getClass();
        b bVar = new b(this.a, qVar, this.n, this.s, list, z10, z9, bArr, this.d, this.c, looper, this.r, jVar2);
        bVar.b(jVar);
        if (this.w != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }

    public final b e(List list, boolean z9, j jVar, boolean z10) {
        b d = d(list, z9, jVar);
        boolean c10 = c(d);
        long j3 = this.w;
        Set set = this.D;
        if (c10 && !set.isEmpty()) {
            h2 it = t0.q(set).iterator();
            while (it.hasNext()) {
                ((g) it.next()).c(null);
            }
            d.c(jVar);
            if (j3 != -9223372036854775807L) {
                d.c(null);
            }
            d = d(list, z9, jVar);
        }
        if (c(d) && z10) {
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
                return d(list, z9, jVar);
            }
        }
        return d;
    }

    public final void g() {
        if (this.F != null && this.E == 0 && this.x.isEmpty() && this.y.isEmpty()) {
            q qVar = this.F;
            qVar.getClass();
            qVar.release();
            this.F = null;
        }
    }

    public final void h(boolean z9) {
        if (z9 && this.I == null) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.I;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.I.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // q2.m
    public final g i(j jVar, e2.u uVar) {
        h(false);
        ia.p(this.E > 0);
        this.I.getClass();
        return b(this.I, jVar, uVar, true);
    }

    @Override // q2.m
    public final l m(j jVar, e2.u uVar) {
        ia.p(this.E > 0);
        this.I.getClass();
        d dVar = new d(this, jVar);
        Handler handler = this.J;
        handler.getClass();
        handler.post(new org.telegram.ui.web.w(14, dVar, uVar));
        return dVar;
    }

    @Override // q2.m
    public final void release() {
        h(true);
        int i7 = this.E - 1;
        this.E = i7;
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
