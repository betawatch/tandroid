package p2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import b8.og;
import b8.zb;
import g2.n0;
import g9.i0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import mi.h0;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.nh;
import org.telegram.ui.Components.y00;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b implements g {
    public final List a;
    public final q b;
    public final h0 c;
    public final y00 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final g2.l h;
    public final kb.a i;
    public final l2.k j;
    public final b4.n k;
    public final UUID l;
    public final Looper m;
    public final android.support.v4.media.session.q n;
    public final Object o;
    public int p;
    public int q;
    public HandlerThread r;
    public android.support.v4.media.session.f s;
    public j2.b t;
    public f u;
    public byte[] v;
    public byte[] w;
    public o x;
    public nh y;
    public p z;

    public b(UUID uuid, q qVar, h0 h0Var, y00 y00Var, List list, boolean z10, boolean z11, byte[] bArr, HashMap hashMap, b4.n nVar, Looper looper, kb.a aVar, l2.k kVar) {
        this.l = uuid;
        this.c = h0Var;
        this.d = y00Var;
        this.b = qVar;
        this.e = z10;
        this.f = z11;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = nVar;
        this.h = new g2.l();
        this.i = aVar;
        this.j = kVar;
        this.p = 2;
        this.m = looper;
        this.n = new android.support.v4.media.session.q(this, looper, 8);
        this.o = new Object();
    }

    @Override // p2.g
    public final UUID a() {
        p();
        return this.l;
    }

    @Override // p2.g
    public final void b(j jVar) {
        p();
        int i3 = this.q;
        if (i3 <= 0) {
            g2.a.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i10 = i3 - 1;
        this.q = i10;
        if (i10 == 0) {
            this.p = 0;
            android.support.v4.media.session.q qVar = this.n;
            String str = n0.a;
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
                this.b.W0(bArr);
                this.v = null;
            }
        }
        if (jVar != null) {
            this.h.i(jVar);
            if (this.h.h(jVar) == 0) {
                jVar.e();
            }
        }
        y00 y00Var = this.d;
        int i11 = this.q;
        e eVar = (e) y00Var.a;
        if (i11 == 1 && eVar.F > 0 && eVar.w != -9223372036854775807L) {
            eVar.E.add(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.postAtTime(new d4(this, 26), this, SystemClock.uptimeMillis() + eVar.w);
        } else if (i11 == 0) {
            eVar.x.remove(this);
            if (eVar.H == this) {
                eVar.H = null;
            }
            if (eVar.I == this) {
                eVar.I = null;
            }
            h0 h0Var = eVar.n;
            HashSet hashSet = (HashSet) h0Var.b;
            hashSet.remove(this);
            if (((b) h0Var.c) == this) {
                h0Var.c = null;
                if (!hashSet.isEmpty()) {
                    b bVar = (b) hashSet.iterator().next();
                    h0Var.c = bVar;
                    p W = bVar.b.W();
                    bVar.z = W;
                    android.support.v4.media.session.f fVar = bVar.s;
                    String str2 = n0.a;
                    W.getClass();
                    fVar.getClass();
                    fVar.obtainMessage(1, new a(w2.u.g.getAndIncrement(), true, SystemClock.elapsedRealtime(), W)).sendToTarget();
                }
            }
            if (eVar.w != -9223372036854775807L) {
                Handler handler2 = eVar.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                eVar.E.remove(this);
            }
        }
        eVar.h();
    }

    @Override // p2.g
    public final boolean c() {
        p();
        return this.e;
    }

    @Override // p2.g
    public final int d() {
        p();
        return this.p;
    }

    @Override // p2.g
    public final void e(j jVar) {
        p();
        if (this.q < 0) {
            g2.a.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (jVar != null) {
            g2.l lVar = this.h;
            synchronized (lVar.a) {
                try {
                    ArrayList arrayList = new ArrayList(lVar.d);
                    arrayList.add(jVar);
                    lVar.d = DesugarCollections.unmodifiableList(arrayList);
                    Integer num = (Integer) lVar.b.get(jVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(lVar.c);
                        hashSet.add(jVar);
                        lVar.c = DesugarCollections.unmodifiableSet(hashSet);
                    }
                    lVar.b.put(jVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i3 = this.q + 1;
        this.q = i3;
        if (i3 == 1) {
            zb.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new android.support.v4.media.session.f(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (jVar != null && k() && this.h.h(jVar) == 1) {
            jVar.c(this.p);
        }
        e eVar = (e) this.d.a;
        if (eVar.w != -9223372036854775807L) {
            eVar.E.remove(this);
            Handler handler = eVar.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // p2.g
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.l2(str, bArr);
    }

    @Override // p2.g
    public final f g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // p2.g
    public final j2.b h() {
        p();
        return this.t;
    }

    public final void i(g2.k kVar) {
        Set set;
        g2.l lVar = this.h;
        synchronized (lVar.a) {
            set = lVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kVar.accept((j) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:40|(2:41|42)|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: NumberFormatException -> 0x0077, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0077, blocks: (B:47:0x006b, B:49:0x0073), top: B:46:0x006b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z10) {
        long min;
        long j10;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = n0.a;
        boolean z11 = true;
        if (this.w == null) {
            o(1, z10, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.U0(this.v, this.w);
            } catch (Exception | NoSuchMethodError e10) {
                l(1, e10);
                z11 = false;
            }
            if (!z11) {
                return;
            }
        }
        if (d2.m.e.equals(this.l)) {
            p();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map r5 = bArr2 == null ? null : this.b.r(bArr2);
            if (r5 != null) {
                long j11 = -9223372036854775807L;
                try {
                    str2 = (String) r5.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j10 = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j10);
                    str = (String) r5.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j11 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j11));
                }
                j10 = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j10);
                str = (String) r5.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j11));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            g2.a.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z10, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new u());
            return;
        }
        this.p = 4;
        g2.l lVar = this.h;
        synchronized (lVar.a) {
            set = lVar.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j) it.next()).b();
        }
    }

    public final boolean k() {
        int i3 = this.p;
        return i3 == 3 || i3 == 4;
    }

    public final void l(int i3, Throwable th2) {
        int i10;
        Set set;
        if (th2 instanceof MediaDrm.MediaDrmStateException) {
            i10 = n0.z(n0.A(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        } else {
            if (!(th2 instanceof MediaDrmResetException)) {
                if (!(th2 instanceof NotProvisionedException) && !og.b(th2)) {
                    if (th2 instanceof DeniedByServerException) {
                        i10 = 6007;
                    } else if (th2 instanceof x) {
                        i10 = 6001;
                    } else if (th2 instanceof c) {
                        i10 = 6003;
                    } else if (th2 instanceof u) {
                        i10 = 6008;
                    } else if (i3 != 1) {
                        if (i3 == 2) {
                            i10 = 6004;
                        } else if (i3 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i10 = 6002;
            }
            i10 = 6006;
        }
        this.u = new f(i10, th2);
        g2.a.d("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            g2.l lVar = this.h;
            synchronized (lVar.a) {
                set = lVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).d((Exception) th2);
            }
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!og.c(th2) && !og.b(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void m(Throwable th2, boolean z10) {
        if ((th2 instanceof NotProvisionedException) || og.b(th2)) {
            this.c.Z(this);
        } else {
            l(z10 ? 1 : 2, th2);
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
            byte[] C0 = this.b.C0();
            this.v = C0;
            this.b.v0(C0, this.j);
            this.t = this.b.r0(this.v);
            this.p = 3;
            g2.l lVar = this.h;
            synchronized (lVar.a) {
                set = lVar.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((j) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.Z(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (og.b(e)) {
                l(1, e);
                return false;
            }
            this.c.Z(this);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (og.b(e)) {
            }
        }
    }

    public final void o(int i3, boolean z10, byte[] bArr) {
        try {
            synchronized (this.o) {
                try {
                    this.y = new nh(9);
                    List list = this.a;
                    if (list != null) {
                        i0.q(list);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            o J1 = this.b.J1(bArr, this.a, i3, this.g);
            this.x = J1;
            android.support.v4.media.session.f fVar = this.s;
            String str = n0.a;
            J1.getClass();
            fVar.getClass();
            fVar.obtainMessage(2, new a(w2.u.g.getAndIncrement(), z10, SystemClock.elapsedRealtime(), J1)).sendToTarget();
        } catch (Exception | NoSuchMethodError e10) {
            m(e10, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            g2.a.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
