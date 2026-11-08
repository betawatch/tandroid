package q2;

import a8.ia;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import c8.rb;
import h2.m0;
import h9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m4.d0;
import org.telegram.ui.ActionBar.m5;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.vy;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b implements g {
    public final List a;
    public final q b;
    public final d0 c;
    public final vy d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final h2.k h;
    public final pb.b i;
    public final m2.j j;
    public final ab.q k;
    public final UUID l;
    public final Looper m;
    public final android.support.v4.media.session.q n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public android.support.v4.media.session.f s;
    public k2.b t;
    public f u;
    public byte[] v;
    public byte[] w;
    public o x;
    public rt y;
    public p z;

    public b(UUID uuid, q qVar, d0 d0Var, vy vyVar, List list, boolean z9, boolean z10, byte[] bArr, HashMap hashMap, ab.q qVar2, Looper looper, pb.b bVar, m2.j jVar) {
        this.l = uuid;
        this.c = d0Var;
        this.d = vyVar;
        this.b = qVar;
        this.e = z9;
        this.f = z10;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = qVar2;
        this.h = new h2.k();
        this.i = bVar;
        this.j = jVar;
        this.p = 2;
        this.m = looper;
        this.n = new android.support.v4.media.session.q(this, looper, 8);
        this.o = new Object();
    }

    @Override // q2.g
    public final UUID a() {
        p();
        return this.l;
    }

    @Override // q2.g
    public final void b(j jVar) {
        p();
        if (this.q < 0) {
            h2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (jVar != null) {
            h2.k kVar = this.h;
            synchronized (kVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(kVar.d);
                    arrayList.add(jVar);
                    kVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) kVar.b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(kVar.c);
                        hashSet.add(jVar);
                        kVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    kVar.b.put(jVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i7 = this.q + 1;
        this.q = i7;
        if (i7 == 1) {
            ia.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new android.support.v4.media.session.f(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.f(jVar) == 1) {
            jVar.c(this.p);
        }
        e eVar = (e) this.d.b;
        if (eVar.w != -9223372036854775807L) {
            eVar.D.remove(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // q2.g
    public final void c(j jVar) {
        p();
        int i7 = this.q;
        if (i7 <= 0) {
            h2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i7 - 1;
        this.q = i10;
        if (i10 == 0) {
            this.p = 0;
            android.support.v4.media.session.q qVar = this.n;
            String str = m0.a;
            qVar.removeCallbacksAndMessages(null);
            this.s.b();
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            synchronized (this.o) {
                this.y = null;
            }
            this.z = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.L(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.f(jVar) == 0) {
                jVar.e();
            }
        }
        vy vyVar = this.d;
        int i11 = this.q;
        e eVar = (e) vyVar.b;
        if (i11 == 1 && eVar.E > 0 && eVar.w != -9223372036854775807L) {
            eVar.D.add(this);
            Handler handler = eVar.J;
            handler.getClass();
            handler.postAtTime(new m5(this, 21), this, SystemClock.uptimeMillis() + eVar.w);
        } else if (i11 == 0) {
            eVar.x.remove(this);
            if (eVar.G == this) {
                eVar.G = null;
            }
            if (eVar.H == this) {
                eVar.H = null;
            }
            d0 d0Var = eVar.n;
            HashSet hashSet = (HashSet) d0Var.a;
            hashSet.remove(this);
            if (((b) d0Var.b) == this) {
                d0Var.b = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    d0Var.b = bVar;
                    p q10 = bVar.b.q();
                    bVar.z = q10;
                    android.support.v4.media.session.f fVar = bVar.s;
                    String str2 = m0.a;
                    q10.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(x2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), q10)).sendToTarget();
                }
            }
            if (eVar.w != -9223372036854775807L) {
                Handler handler2 = eVar.J;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.D.remove(this);
            }
        }
        eVar.g();
    }

    @Override // q2.g
    public final boolean d() {
        p();
        return this.e;
    }

    @Override // q2.g
    public final int e() {
        p();
        return this.p;
    }

    @Override // q2.g
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.w0(str, bArr);
    }

    @Override // q2.g
    public final f g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // q2.g
    public final k2.b h() {
        p();
        return this.t;
    }

    public final void i(h2.j jVar) {
        Set set;
        h2.k kVar = this.h;
        synchronized (kVar.a) {
            set = kVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            jVar.accept((j) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z9) {
        long min;
        long j3;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = m0.a;
        boolean z10 = true;
        if (this.w == null) {
            o(1, z9, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.I(this.v, this.w);
            } catch (Exception | NoSuchMethodError e10) {
                l(1, e10);
                z10 = false;
            }
            if (!z10) {
                return;
            }
        }
        if (e2.l.e.equals(this.l)) {
            p();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map l10 = bArr2 == null ? null : this.b.l(bArr2);
            if (l10 != null) {
                long j10 = -9223372036854775807L;
                try {
                    str2 = (String) l10.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j3 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j3);
                    str = (String) l10.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j10 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j10));
                }
                j3 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j3);
                str = (String) l10.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j10));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            h2.a.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z9, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new u());
            return;
        }
        this.p = 4;
        h2.k kVar = this.h;
        synchronized (kVar.a) {
            set = kVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
    }

    public final boolean k() {
        int i7 = this.p;
        return i7 == 3 || i7 == 4;
    }

    public final void l(int i7, Throwable th2) {
        int i10;
        Set set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = m0.z(m0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !rb.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof x) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof u) {
                        i10 = 6008;
                    } else if (i7 != 1) {
                        if (i7 == 2) {
                            i10 = 6004;
                        } else if (i7 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.u = new f(i10, th2);
        h2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            h2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).d((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!rb.c(th2) && !rb.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void m(Throwable th2, boolean z9) {
        if ((th2 instanceof NotProvisionedException) || rb.b(th2)) {
            this.c.v0(this);
        } else {
            l(z9 ? 1 : 2, th2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n() {
        Set set;
        if (k()) {
            return true;
        }
        try {
            byte[] D = this.b.D();
            this.v = D;
            this.b.j0(D, this.j);
            this.t = this.b.A(this.v);
            this.p = 3;
            h2.k kVar = this.h;
            synchronized (kVar.a) {
                set = kVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.v0(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (rb.b(e)) {
                l(1, e);
                return false;
            }
            this.c.v0(this);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (rb.b(e)) {
            }
        }
    }

    public final void o(int i7, boolean z9, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new rt(9);
                    List list = this.a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o l02 = this.b.l0(bArr, this.a, i7, this.g);
            this.x = l02;
            android.support.v4.media.session.f fVar = this.s;
            String str = m0.a;
            l02.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(x2.u.g.getAndIncrement(), z9, SystemClock.elapsedRealtime(), l02)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            h2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
