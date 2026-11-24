package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.Utilities;
import org.telegram.utils.twidget.WidgetEngineService;
import org.telegram.utils.twidget.x;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class x extends b {
    public static final x v = new x();
    public static final kc w = new kc(1);
    public static volatile int x = -1;
    public static volatile boolean y = true;
    public int e;
    public long f;
    public Context j;
    public boolean k;
    public int m;
    public int n;
    public long o;
    public long p;
    public boolean q;
    public Boolean r;
    public volatile boolean s;
    public final xxc t;
    public final xxc u;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final AtomicLong h = new AtomicLong();
    public final Semaphore i = new Semaphore(12);
    public boolean l = true;

    /* JADX WARN: Type inference failed for: r0v10, types: [xxc] */
    /* JADX WARN: Type inference failed for: r0v9, types: [xxc] */
    public x() {
        this.q = Build.VERSION.SDK_INT >= 29;
        final byte b = 0;
        this.t = new Runnable(this) { // from class: xxc
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            private final void a() {
                x xVar = this.b;
                synchronized (xVar.a) {
                    int i = SystemClock.elapsedRealtime() < xVar.f ? xVar.e : 1;
                    while (xVar.d.size() > i) {
                        ArrayList arrayList = xVar.d;
                        xVar.o((zxc) arrayList.get(arrayList.size() - 1));
                    }
                    xVar.u();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b) {
                    case 0:
                        a();
                        return;
                    default:
                        x xVar = this.b;
                        synchronized (xVar.a) {
                            if (xVar.l) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList(xVar.c);
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                zxc zxcVar = (zxc) obj;
                                if (zxcVar.e == 0) {
                                    xVar.o(zxcVar);
                                }
                            }
                            return;
                        }
                }
            }
        };
        final byte b2 = 1;
        this.u = new Runnable(this) { // from class: xxc
            public final /* synthetic */ x b;

            {
                this.b = this;
            }

            private final void a() {
                x xVar = this.b;
                synchronized (xVar.a) {
                    int i = SystemClock.elapsedRealtime() < xVar.f ? xVar.e : 1;
                    while (xVar.d.size() > i) {
                        ArrayList arrayList = xVar.d;
                        xVar.o((zxc) arrayList.get(arrayList.size() - 1));
                    }
                    xVar.u();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (b2) {
                    case 0:
                        a();
                        return;
                    default:
                        x xVar = this.b;
                        synchronized (xVar.a) {
                            if (xVar.l) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList(xVar.c);
                            int size = arrayList.size();
                            int i = 0;
                            while (i < size) {
                                Object obj = arrayList.get(i);
                                i++;
                                zxc zxcVar = (zxc) obj;
                                if (zxcVar.e == 0) {
                                    xVar.o(zxcVar);
                                }
                            }
                            return;
                        }
                }
            }
        };
    }

    @Override // org.telegram.utils.twidget.b
    public final void a(long j, long j2, int i, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.l(wVar.c, j2, i, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        r16 = r2;
        r18 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r14.d != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0071, code lost:
    
        r24 = r24 | r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r14.d != null) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0079, code lost:
    
        if (r14.n != false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
    
        r10 = r12 - android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
    
        if (r10 <= r16) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0085, code lost:
    
        r25.a.wait(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        r12 = r14.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x008d, code lost:
    
        if (r12 != null) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x008f, code lost:
    
        r14.f--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        if (r14.n != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r14.b == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x009c, code lost:
    
        r25.q = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009e, code lost:
    
        o(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
    
        r0 = r0 + 1;
        r13 = r14;
        r2 = r16;
        r11 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0070, code lost:
    
        r2 = false;
     */
    @Override // org.telegram.utils.twidget.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long b(Context context, String str, String str2, float f, float f2, int i, String str3, String str4, String str5, String str6, boolean z, WidgetSandboxBackend widgetSandboxBackend) {
        Object obj;
        zxc zxcVar;
        boolean z2;
        long j = 0;
        if (this.s) {
            dq9.m("Widget engine: no seccomp filter on this device");
            return 0L;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j2 = widgetSandboxBackend.session().z;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        try {
            Object obj2 = this.a;
            synchronized (obj2) {
                try {
                    if (this.j == null) {
                        this.j = context.getApplicationContext();
                    }
                    gl5 gl5Var = null;
                    zxc zxcVar2 = null;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < 2 && gl5Var == null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                        while (true) {
                            zxc n = n(arrayList, j2);
                            if (n != null) {
                                break;
                            }
                            long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                            if (elapsedRealtime2 <= j) {
                                throw new IllegalStateException("Widget engine: every process shows another bot's widget");
                            }
                            long j3 = j;
                            obj = obj2;
                            try {
                                this.a.wait(Math.min(elapsedRealtime2, 500L));
                                j = j3;
                                obj2 = obj;
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        }
                    }
                    Object obj3 = obj2;
                    boolean z4 = true;
                    if (gl5Var == null) {
                        throw new IllegalStateException("Widget engine did not start");
                    }
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj4 = arrayList.get(i4);
                        i4++;
                        ((w) obj4).b.session().b(z4);
                        z4 = true;
                    }
                    long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                    this.b.removeCallbacks(this.t);
                    this.b.postDelayed(this.t, 250L);
                    w wVar = new w(this, zxcVar2, widgetSandboxBackend);
                    ptc ptcVar = new ptc(this, zxcVar2, (byte) 17);
                    this.b.postDelayed(ptcVar, 15000L);
                    try {
                        try {
                            boolean z5 = e21.a;
                            Charset charset = StandardCharsets.UTF_8;
                            byte[] bytes = str.getBytes(charset);
                            byte[] bytes2 = str2.getBytes(charset);
                            byte[] bytes3 = str3.getBytes(charset);
                            byte[] bytes4 = str4.getBytes(charset);
                            byte[] bytes5 = str5.getBytes(charset);
                            byte[] bytes6 = str6.getBytes(charset);
                            zxcVar = zxcVar2;
                            try {
                                long G = gl5Var.G(bytes, bytes2, f, f2, i, bytes3, bytes4, bytes5, bytes6, z, wVar);
                                this.b.removeCallbacks(ptcVar);
                                wVar.c = G;
                                if (e21.a) {
                                    StringBuilder sb = new StringBuilder("create ");
                                    sb.append(SystemClock.uptimeMillis() - uptimeMillis);
                                    sb.append(" ms in process ");
                                    sb.append(zxcVar.a);
                                    ts2.w(sb, z3 ? wi8.n(uptimeMillis2, " (", " ms to its start)") : "", "WidgetEngine");
                                }
                                long incrementAndGet = this.h.incrementAndGet();
                                this.g.put(Long.valueOf(incrementAndGet), wVar);
                                synchronized (this.a) {
                                    zxcVar.f--;
                                    this.n = 0;
                                    z2 = zxcVar.n && this.g.remove(Long.valueOf(incrementAndGet)) != null;
                                }
                                if (z2) {
                                    widgetSandboxBackend.session().b(false);
                                }
                                return incrementAndGet;
                            } catch (Exception e) {
                                e = e;
                                boolean z6 = (e instanceof IllegalStateException) && "Widget engine: no seccomp filter on this device".equals(e.getMessage());
                                synchronized (this.a) {
                                    zxcVar.f--;
                                    s(zxcVar);
                                    if (z6 && !this.s) {
                                        this.s = true;
                                        fc4.d("widgets are off: the kernel has no seccomp filter for the engine's process");
                                        ArrayList arrayList2 = new ArrayList(this.c);
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            Object obj5 = arrayList2.get(i2);
                                            i2++;
                                            zxc zxcVar3 = (zxc) obj5;
                                            if (zxcVar3.e == 0) {
                                                o(zxcVar3);
                                            }
                                        }
                                    }
                                }
                                throw e;
                            }
                        } catch (Throwable th2) {
                            this.b.removeCallbacks(ptcVar);
                            throw th2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        zxcVar = zxcVar2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            }
        } catch (Throwable th4) {
            int size3 = arrayList.size();
            while (i2 < size3) {
                Object obj6 = arrayList.get(i2);
                i2++;
                ((w) obj6).b.session().b(true);
            }
            throw th4;
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void c(long j, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.s(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void d(long j) {
        w wVar = (w) this.g.remove(Long.valueOf(j));
        if (wVar != null) {
            gl5 gl5Var = wVar.a.d;
            if (gl5Var != null) {
                try {
                    gl5Var.r(wVar.c);
                } catch (RemoteException unused) {
                }
            }
            synchronized (this.a) {
                s(wVar.a);
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void e(long j, int i, float f, float f2, int i2) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.K(wVar.c, i, f, f2, i2);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void f(long j) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        if (wVar != null) {
            q(wVar.a, "did not answer a tick");
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void g(long j) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.H(wVar.c);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void h(long j, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.M(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void i(long j, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.u(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void j(long j, float f, boolean z, boolean z2, boolean z3) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.k(wVar.c, f, z, z2, z3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void k(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.x(wVar.c, i, f, f2, i2, z, z2, i3, i4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void l(long j, boolean z) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.A(wVar.c, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void m(long j, float f) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        gl5 gl5Var = wVar == null ? null : wVar.a.d;
        if (gl5Var != null) {
            try {
                gl5Var.D(wVar.c, f);
            } catch (RemoteException unused) {
            }
        }
    }

    public final zxc n(ArrayList arrayList, long j) {
        long j2;
        zxc zxcVar;
        long j3;
        int i;
        long j4;
        int i2;
        int i3;
        int r = r();
        long j5 = 0;
        int i4 = 0;
        int i5 = 1;
        if (r > 1) {
            if (j != 0) {
                ArrayList arrayList2 = this.c;
                int size = arrayList2.size();
                int i6 = 0;
                while (i6 < size) {
                    Object obj = arrayList2.get(i6);
                    i6++;
                    zxcVar = (zxc) obj;
                    if (zxcVar.e == 0 && zxcVar.h) {
                        j3 = j5;
                        if (zxcVar.s == j && zxcVar.d != null) {
                            break;
                        }
                    } else {
                        j3 = j5;
                    }
                    j5 = j3;
                }
            }
            j3 = j5;
            zxcVar = null;
            if (zxcVar == null && !this.d.isEmpty()) {
                zxc zxcVar2 = (zxc) this.d.get(0);
                ArrayList arrayList3 = this.d;
                int size2 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        zxcVar = zxcVar2;
                        break;
                    }
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    zxc zxcVar3 = (zxc) obj2;
                    if (zxcVar3.d != null) {
                        zxcVar = zxcVar3;
                        break;
                    }
                }
                this.d.remove(zxcVar);
            }
            if (zxcVar == null) {
                if (this.c.size() >= r) {
                    ArrayList arrayList4 = this.c;
                    int size3 = arrayList4.size();
                    int i8 = 0;
                    while (true) {
                        if (i8 >= size3) {
                            break;
                        }
                        Object obj3 = arrayList4.get(i8);
                        i8++;
                        zxc zxcVar4 = (zxc) obj3;
                        if (zxcVar4.e == 0 && zxcVar4.h) {
                            o(zxcVar4);
                            break;
                        }
                    }
                }
                if (this.c.size() < r) {
                    zxcVar = t(false);
                }
            }
            if (zxcVar == null && j != 0) {
                ArrayList arrayList5 = this.c;
                int size4 = arrayList5.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj4 = arrayList5.get(i9);
                    i9++;
                    zxc zxcVar5 = (zxc) obj4;
                    if (zxcVar5.h && zxcVar5.s == j && (zxcVar5.c || zxcVar5.e < 4)) {
                        if (zxcVar == null || zxcVar5.e < zxcVar.e) {
                            zxcVar = zxcVar5;
                        }
                    }
                }
            }
            if (zxcVar == null) {
                ArrayList arrayList6 = this.c;
                int size5 = arrayList6.size();
                int i10 = 0;
                zxc zxcVar6 = null;
                zxc zxcVar7 = null;
                while (i10 < size5) {
                    Object obj5 = arrayList6.get(i10);
                    int i11 = i10 + 1;
                    zxc zxcVar8 = (zxc) obj5;
                    if (zxcVar8.h && zxcVar8.e != 0 && zxcVar8.f <= 0) {
                        Iterator it = this.g.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                w wVar = (w) it.next();
                                if (wVar.a == zxcVar8) {
                                    z session = wVar.b.session();
                                    if (session.L && !session.A) {
                                        if (zxcVar8.s != j3) {
                                            ArrayList arrayList7 = this.c;
                                            int size6 = arrayList7.size();
                                            int i12 = i4;
                                            int i13 = i12;
                                            while (i12 < size6) {
                                                Object obj6 = arrayList7.get(i12);
                                                int i14 = i12 + 1;
                                                long j6 = j3;
                                                zxc zxcVar9 = (zxc) obj6;
                                                if (zxcVar9.h) {
                                                    i3 = i11;
                                                    long j7 = zxcVar9.s;
                                                    i2 = i14;
                                                    if (j7 == zxcVar8.s) {
                                                        i13++;
                                                    }
                                                } else {
                                                    i2 = i14;
                                                    i3 = i11;
                                                }
                                                i12 = i2;
                                                i11 = i3;
                                                j3 = j6;
                                                i5 = 1;
                                            }
                                            i = i11;
                                            j4 = j3;
                                            if (i13 > i5 && (zxcVar7 == null || zxcVar8.e < zxcVar7.e)) {
                                                zxcVar7 = zxcVar8;
                                            }
                                        }
                                    }
                                }
                                i11 = i11;
                                j3 = j3;
                                i4 = 0;
                                i5 = 1;
                            } else {
                                i = i11;
                                j4 = j3;
                                if (zxcVar6 == null || zxcVar8.e < zxcVar6.e) {
                                    zxcVar6 = zxcVar8;
                                }
                            }
                        }
                        i10 = i;
                        j3 = j4;
                        i4 = 0;
                        i5 = 1;
                    }
                    i = i11;
                    j4 = j3;
                    i10 = i;
                    j3 = j4;
                    i4 = 0;
                    i5 = 1;
                }
                j2 = j3;
                if (zxcVar6 == null) {
                    zxcVar6 = zxcVar7;
                }
                if (zxcVar6 == null) {
                    return null;
                }
                Iterator it2 = this.g.entrySet().iterator();
                while (it2.hasNext()) {
                    w wVar2 = (w) ((Map.Entry) it2.next()).getValue();
                    if (wVar2.a == zxcVar6) {
                        arrayList.add(wVar2);
                        it2.remove();
                    }
                }
                if (e21.a) {
                    Log.d("WidgetEngine", "process " + zxcVar6.a + " with " + zxcVar6.e + " sessions makes room for another bot");
                }
                o(zxcVar6);
                zxcVar = t(false);
            } else {
                j2 = j3;
            }
        } else {
            j2 = 0;
            ArrayList arrayList8 = this.c;
            int size7 = arrayList8.size();
            int i15 = 0;
            while (i15 < size7) {
                Object obj7 = arrayList8.get(i15);
                i15++;
                zxc zxcVar10 = (zxc) obj7;
                if (zxcVar10.c || zxcVar10.e < 4) {
                    zxcVar = zxcVar10;
                    break;
                }
            }
            zxcVar = null;
            if (zxcVar == null) {
                while (Build.VERSION.SDK_INT < 29) {
                    long elapsedRealtime = this.p - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        break;
                    }
                    try {
                        this.a.wait(elapsedRealtime);
                        if (!this.c.isEmpty()) {
                            return n(arrayList, j);
                        }
                    } catch (InterruptedException unused) {
                        dq9.m("Widget engine did not start");
                        return null;
                    }
                }
                zxcVar = t(false);
            }
        }
        this.b.removeCallbacks(zxcVar.y);
        if (!zxcVar.h) {
            zxcVar.s = j;
        } else if (zxcVar.s != j) {
            zxcVar.s = j2;
        }
        zxcVar.h = true;
        zxcVar.e++;
        zxcVar.f++;
        return zxcVar;
    }

    public final void o(zxc zxcVar) {
        if (zxcVar.n) {
            return;
        }
        zxcVar.n = true;
        if (zxcVar.d != null && zxcVar.d.asBinder().isBinderAlive()) {
            this.p = SystemClock.elapsedRealtime() + 1000;
        }
        zxcVar.d = null;
        this.c.remove(zxcVar);
        this.d.remove(zxcVar);
        this.b.removeCallbacks(zxcVar.y);
        try {
            this.j.unbindService(zxcVar);
        } catch (RuntimeException unused) {
        }
        this.a.notifyAll();
    }

    public final /* synthetic */ void p(zxc zxcVar, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.j.getSystemService("activity")).getHistoricalProcessExitReasons(this.j.getPackageName(), zxcVar.w, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo a = dq9.a(historicalProcessExitReasons.get(0));
                str2 = ": exit reason " + a.getReason() + ", status " + a.getStatus() + ", " + a.getDescription() + ", rss " + (a.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + zxcVar.a + str2);
        fc4.b(str.concat(str2));
    }

    public final void q(zxc zxcVar, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (zxcVar.n) {
                return;
            }
            Iterator it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                w wVar = (w) ((Map.Entry) it.next()).getValue();
                if (wVar.a == zxcVar) {
                    arrayList.add(wVar);
                    it.remove();
                }
            }
            if (str != null) {
                if (zxcVar.d == null && zxcVar.b) {
                    this.q = false;
                }
                if (!zxcVar.h) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i >= 3) {
                        this.o = SystemClock.elapsedRealtime() + 60000;
                    }
                }
            }
            o(zxcVar);
            u();
            if (str != null) {
                String str2 = "widget engine process " + zxcVar.a + " " + str + " with " + arrayList.size() + " sessions";
                Log.w("WidgetEngine", str2);
                if (Build.VERSION.SDK_INT < 30 || zxcVar.w == 0 || this.j == null) {
                    fc4.b(str2);
                } else {
                    Utilities.e.d(new gcc(this, zxcVar, str2, (byte) 26), 700L);
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((w) obj).b.session().b(false);
            }
        }
    }

    public final int r() {
        int i;
        Context context;
        if (Build.VERSION.SDK_INT >= 29) {
            int i2 = x;
            if (i2 >= 0) {
                return Math.max(1, Math.min(8, i2));
            }
            Boolean bool = this.r;
            if (bool == null && (context = this.j) != null) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                bool = Boolean.valueOf(activityManager != null && activityManager.isLowRamDevice());
                this.r = bool;
            }
            if (bool == null || !bool.booleanValue()) {
                try {
                    i = oc7.r1(z8c.t0).l4.t0.f();
                } catch (Exception unused) {
                    i = 6;
                }
                return Math.max(1, Math.min(8, i));
            }
        }
        return 1;
    }

    public final void s(zxc zxcVar) {
        boolean z = zxcVar.n;
        cpc cpcVar = zxcVar.y;
        if (z) {
            return;
        }
        int i = zxcVar.e - 1;
        zxcVar.e = i;
        if (i <= 0) {
            this.a.notifyAll();
            Handler handler = this.b;
            handler.removeCallbacks(cpcVar);
            if (r() <= 1) {
                if (this.k && this.l) {
                    return;
                }
                handler.postDelayed(cpcVar, 30000L);
                return;
            }
            if (zxcVar.s != 0) {
                handler.postDelayed(cpcVar, 5000L);
            } else {
                o(zxcVar);
                u();
            }
        }
    }

    public final zxc t(boolean z) {
        boolean z2;
        boolean z3 = this.q && y;
        boolean z4 = r() <= 1;
        int i = this.m + 1;
        this.m = i;
        zxc zxcVar = new zxc(this, i, z3, z4);
        zxcVar.r = z;
        Intent intent = new Intent(this.j, (Class<?>) (z3 ? WidgetEngineService.Forked.class : WidgetEngineService.class));
        intent.putExtra("shared", z4);
        boolean z5 = e21.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.j;
            if (i2 >= 29) {
                z2 = context.bindIsolatedService(intent, 65, "w" + zxcVar.a, w, zxcVar);
            } else {
                z2 = context.bindService(intent, zxcVar, 65);
            }
        } catch (RuntimeException e) {
            fc4.g(e, true);
            z2 = false;
        }
        if (z2) {
            this.c.add(zxcVar);
            return zxcVar;
        }
        try {
            this.j.unbindService(zxcVar);
        } catch (RuntimeException unused) {
        }
        if (z3) {
            this.q = false;
            return t(z);
        }
        dq9.m("Widget engine service is unavailable");
        return null;
    }

    public final void u() {
        if (this.j == null || !this.k || !this.l || this.s) {
            return;
        }
        int r = r();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Build.VERSION.SDK_INT < 29 && elapsedRealtime < this.p) {
                this.b.removeCallbacks(this.t);
                this.b.postDelayed(this.t, (this.p - elapsedRealtime) + 20);
                return;
            }
            if (r <= 1) {
                if (this.c.isEmpty()) {
                    t(true);
                    return;
                }
                return;
            }
            int i = elapsedRealtime < this.f ? this.e : 1;
            while (this.d.size() < i && this.c.size() < r) {
                if (this.n >= 3 && elapsedRealtime < this.o) {
                    return;
                } else {
                    this.d.add(t(true));
                }
            }
        } catch (RuntimeException e) {
            fc4.g(e, true);
        }
    }
}
