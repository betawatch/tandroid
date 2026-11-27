// default package

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ta3 implements jr3 {
    public final List a;
    public final d64 b;
    public final qx6 c;
    public final ri6 d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final ex2 h;
    public final z6f i;
    public final ig8 j;
    public final vh4 k;
    public final UUID l;
    public final Looper m;
    public final d1 n;
    public final Object o;
    public byte p;
    public int q;
    public HandlerThread r;
    public ra3 s;
    public or4 t;
    public ir3 u;
    public byte[] v;
    public byte[] w;
    public b64 x;
    public xh4 y;
    public c64 z;

    public ta3(UUID uuid, d64 d64Var, qx6 qx6Var, ri6 ri6Var, List list, boolean z, boolean z2, byte[] bArr, HashMap hashMap, vh4 vh4Var, Looper looper, z6f z6fVar, ig8 ig8Var) {
        this.l = uuid;
        this.c = qx6Var;
        this.d = ri6Var;
        this.b = d64Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = DesugarCollections.unmodifiableList(list);
        }
        this.g = hashMap;
        this.k = vh4Var;
        this.h = new ex2();
        this.i = z6fVar;
        this.j = ig8Var;
        this.p = (byte) 2;
        this.m = looper;
        this.n = new d1(this, looper, (byte) 2);
        this.o = new Object();
    }

    @Override // jr3
    public final UUID a() {
        p();
        return this.l;
    }

    @Override // jr3
    public final boolean b() {
        p();
        return this.e;
    }

    @Override // jr3
    public final void c(mr3 mr3Var) {
        p();
        int i = this.q;
        if (i <= 0) {
            efd.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.q = i2;
        if (i2 == 0) {
            this.p = (byte) 0;
            d1 d1Var = this.n;
            String str = gcc.a;
            d1Var.removeCallbacksAndMessages(null);
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
                this.b.k(bArr);
                this.v = null;
            }
        }
        if (mr3Var != null) {
            this.h.i(mr3Var);
            if (this.h.h(mr3Var) == 0) {
                mr3Var.e();
            }
        }
        ri6 ri6Var = this.d;
        int i3 = this.q;
        wa3 wa3Var = (wa3) ri6Var.b;
        if (i3 == 1 && wa3Var.F > 0 && wa3Var.w != -9223372036854775807L) {
            wa3Var.E.add(this);
            Handler handler = wa3Var.K;
            handler.getClass();
            handler.postAtTime(new vd2(this, (byte) 27), this, SystemClock.uptimeMillis() + wa3Var.w);
        } else if (i3 == 0) {
            wa3Var.x.remove(this);
            if (wa3Var.H == this) {
                wa3Var.H = null;
            }
            if (wa3Var.I == this) {
                wa3Var.I = null;
            }
            qx6 qx6Var = wa3Var.n;
            HashSet hashSet = (HashSet) qx6Var.b;
            hashSet.remove(this);
            if (((ta3) qx6Var.c) == this) {
                qx6Var.c = null;
                if (!hashSet.isEmpty()) {
                    ta3 ta3Var = (ta3) hashSet.iterator().next();
                    qx6Var.c = ta3Var;
                    c64 d = ta3Var.b.d();
                    ta3Var.z = d;
                    ra3 ra3Var = ta3Var.s;
                    String str2 = gcc.a;
                    d.getClass();
                    ra3Var.getClass();
                    ra3Var.obtainMessage(1, new sa3(ja6.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), d)).sendToTarget();
                }
            }
            if (wa3Var.w != -9223372036854775807L) {
                Handler handler2 = wa3Var.K;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                wa3Var.E.remove(this);
            }
        }
        wa3Var.i();
    }

    @Override // jr3
    public final void d(mr3 mr3Var) {
        p();
        if (this.q < 0) {
            efd.c("DefaultDrmSession", "Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (mr3Var != null) {
            ex2 ex2Var = this.h;
            synchronized (ex2Var.a) {
                ArrayList arrayList = new ArrayList(ex2Var.d);
                arrayList.add(mr3Var);
                ex2Var.d = DesugarCollections.unmodifiableList(arrayList);
                Integer num = (Integer) ex2Var.b.get(mr3Var);
                if (num == null) {
                    HashSet hashSet = new HashSet(ex2Var.c);
                    hashSet.add(mr3Var);
                    ex2Var.c = DesugarCollections.unmodifiableSet(hashSet);
                }
                ex2Var.b.put(mr3Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
            }
        }
        int i = this.q + 1;
        this.q = i;
        if (i == 1) {
            yve.p(this.p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new ra3(this, this.r.getLooper());
            if (n()) {
                j(true);
            }
        } else if (mr3Var != null && k() && this.h.h(mr3Var) == 1) {
            mr3Var.c(this.p);
        }
        wa3 wa3Var = (wa3) this.d.b;
        if (wa3Var.w != -9223372036854775807L) {
            wa3Var.E.remove(this);
            Handler handler = wa3Var.K;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // jr3
    public final int e() {
        p();
        return this.p;
    }

    @Override // jr3
    public final boolean f(String str) {
        p();
        byte[] bArr = this.v;
        bArr.getClass();
        return this.b.z(str, bArr);
    }

    @Override // jr3
    public final ir3 g() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    @Override // jr3
    public final or4 h() {
        p();
        return this.t;
    }

    public final void i(ot2 ot2Var) {
        Set set;
        ex2 ex2Var = this.h;
        synchronized (ex2Var.a) {
            set = ex2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ot2Var.accept((mr3) it.next());
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:40|41|42|(6:44|45|46|47|(1:49)|51)|54|45|46|47|(0)|51) */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070 A[Catch: NumberFormatException -> 0x0074, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x0074, blocks: (B:47:0x0068, B:49:0x0070), top: B:46:0x0068 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(boolean z) {
        long min;
        long j;
        String str;
        String str2;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.v;
        String str3 = gcc.a;
        boolean z2 = true;
        if (this.w == null) {
            o(1, z, bArr);
            return;
        }
        if (this.p != 4) {
            try {
                this.b.i(this.v, this.w);
            } catch (Exception | NoSuchMethodError e) {
                l(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (o51.e.equals(this.l)) {
            p();
            byte[] bArr2 = this.v;
            Pair pair = null;
            Map b = bArr2 == null ? null : this.b.b(bArr2);
            if (b != null) {
                long j2 = -9223372036854775807L;
                try {
                    str2 = (String) b.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                if (str2 != null) {
                    j = Long.parseLong(str2);
                    Long valueOf = Long.valueOf(j);
                    str = (String) b.get("PlaybackDurationRemaining");
                    if (str != null) {
                        j2 = Long.parseLong(str);
                    }
                    pair = new Pair(valueOf, Long.valueOf(j2));
                }
                j = -9223372036854775807L;
                Long valueOf2 = Long.valueOf(j);
                str = (String) b.get("PlaybackDurationRemaining");
                if (str != null) {
                }
                pair = new Pair(valueOf2, Long.valueOf(j2));
            }
            pair.getClass();
            min = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            min = Long.MAX_VALUE;
        }
        if (min <= 60) {
            efd.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + min);
            o(2, z, bArr);
            return;
        }
        if (min <= 0) {
            l(2, new ux5());
            return;
        }
        this.p = (byte) 4;
        ex2 ex2Var = this.h;
        synchronized (ex2Var.a) {
            set = ex2Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((mr3) it.next()).b();
        }
    }

    public final boolean k() {
        byte b = this.p;
        return b == 3 || b == 4;
    }

    public final void l(int i, Throwable th) {
        int i2;
        Set set;
        if (th instanceof MediaDrm.MediaDrmStateException) {
            i2 = gcc.A(gcc.B(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        } else {
            if (!(th instanceof MediaDrmResetException)) {
                if (!(th instanceof NotProvisionedException) && !ije.b(th)) {
                    if (th instanceof DeniedByServerException) {
                        i2 = 6007;
                    } else if (th instanceof gac) {
                        i2 = 6001;
                    } else if (th instanceof ua3) {
                        i2 = 6003;
                    } else if (th instanceof ux5) {
                        i2 = 6008;
                    } else if (i != 1) {
                        if (i == 2) {
                            i2 = 6004;
                        } else if (i != 3) {
                            iy8.d();
                            return;
                        }
                    }
                }
                i2 = 6002;
            }
            i2 = 6006;
        }
        this.u = new ir3(i2, th);
        efd.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            ex2 ex2Var = this.h;
            synchronized (ex2Var.a) {
                set = ex2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((mr3) it.next()).d((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            su3.f("Unexpected Throwable subclass", th);
            return;
        } else if (!ije.c(th) && !ije.b(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = (byte) 1;
        }
    }

    public final void m(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || ije.b(th)) {
            this.c.J(this);
        } else {
            l(z ? 1 : 2, th);
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
            byte[] h = this.b.h();
            this.v = h;
            this.b.x(h, this.j);
            this.t = this.b.g(this.v);
            this.p = (byte) 3;
            ex2 ex2Var = this.h;
            synchronized (ex2Var.a) {
                set = ex2Var.c;
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((mr3) it.next()).c(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.J(this);
            return false;
        } catch (Exception e) {
            e = e;
            if (ije.b(e)) {
                l(1, e);
                return false;
            }
            this.c.J(this);
            return false;
        } catch (NoSuchMethodError e2) {
            e = e2;
            if (ije.b(e)) {
            }
        }
    }

    public final void o(int i, boolean z, byte[] bArr) {
        try {
            synchronized (this.o) {
                this.y = new xh4((byte) 9);
                List list = this.a;
                if (list != null) {
                    po5.q(list);
                }
            }
            b64 u = this.b.u(bArr, this.a, i, this.g);
            this.x = u;
            ra3 ra3Var = this.s;
            String str = gcc.a;
            u.getClass();
            ra3Var.getClass();
            ra3Var.obtainMessage(2, new sa3(ja6.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), u)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            m(e, true);
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.m;
        if (currentThread != looper.getThread()) {
            efd.g("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
