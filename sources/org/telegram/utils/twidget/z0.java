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
import org.telegram.messenger.a8;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.ui.Components.sv0;
import org.telegram.utils.twidget.WidgetEngineService;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class z0 extends l {
    public int i;
    public long j;
    public Context n;
    public boolean o;
    public int q;
    public int r;
    public long s;
    public long t;
    public boolean u;
    public Boolean v;
    public volatile boolean w;
    public final o0 x;
    public final o0 y;
    public static final z0 z = new z0();
    public static final d3.b A = new d3.b(3);
    public static volatile int B = -1;
    public static volatile boolean C = true;
    public final Object e = new Object();
    public final Handler f = new Handler(Looper.getMainLooper());
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ConcurrentHashMap k = new ConcurrentHashMap();
    public final AtomicLong l = new AtomicLong();
    public final Semaphore m = new Semaphore(12);
    public boolean p = true;

    /* JADX WARN: Type inference failed for: r0v10, types: [org.telegram.utils.twidget.o0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [org.telegram.utils.twidget.o0] */
    public z0() {
        this.u = Build.VERSION.SDK_INT >= 29;
        final int i7 = 0;
        this.x = new Runnable(this) { // from class: org.telegram.utils.twidget.o0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            private final void a() {
                z0 z0Var = this.b;
                synchronized (z0Var.e) {
                    try {
                        int i10 = SystemClock.elapsedRealtime() < z0Var.j ? z0Var.i : 1;
                        while (z0Var.h.size() > i10) {
                            ArrayList arrayList = z0Var.h;
                            z0Var.t((y0) arrayList.get(arrayList.size() - 1));
                        }
                        z0Var.y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i7) {
                    case 0:
                        a();
                        return;
                    default:
                        z0 z0Var = this.b;
                        synchronized (z0Var.e) {
                            try {
                                if (z0Var.p) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList(z0Var.g);
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    y0 y0Var = (y0) obj;
                                    if (y0Var.d == 0) {
                                        z0Var.t(y0Var);
                                    }
                                }
                                return;
                            } finally {
                            }
                        }
                }
            }
        };
        final int i10 = 1;
        this.y = new Runnable(this) { // from class: org.telegram.utils.twidget.o0
            public final /* synthetic */ z0 b;

            {
                this.b = this;
            }

            private final void a() {
                z0 z0Var = this.b;
                synchronized (z0Var.e) {
                    try {
                        int i102 = SystemClock.elapsedRealtime() < z0Var.j ? z0Var.i : 1;
                        while (z0Var.h.size() > i102) {
                            ArrayList arrayList = z0Var.h;
                            z0Var.t((y0) arrayList.get(arrayList.size() - 1));
                        }
                        z0Var.y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        a();
                        return;
                    default:
                        z0 z0Var = this.b;
                        synchronized (z0Var.e) {
                            try {
                                if (z0Var.p) {
                                    return;
                                }
                                ArrayList arrayList = new ArrayList(z0Var.g);
                                int size = arrayList.size();
                                int i102 = 0;
                                while (i102 < size) {
                                    Object obj = arrayList.get(i102);
                                    i102++;
                                    y0 y0Var = (y0) obj;
                                    if (y0Var.d == 0) {
                                        z0Var.t(y0Var);
                                    }
                                }
                                return;
                            } finally {
                            }
                        }
                }
            }
        };
    }

    public static /* synthetic */ void r(z0 z0Var, y0 y0Var, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) z0Var.n.getSystemService("activity")).getHistoricalProcessExitReasons(z0Var.n.getPackageName(), y0Var.s, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
                str2 = ": exit reason " + applicationExitInfo.getReason() + ", status " + applicationExitInfo.getStatus() + ", " + applicationExitInfo.getDescription() + ", rss " + (applicationExitInfo.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + y0Var.a + str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        p5.c.s(str2, sb2);
    }

    @Override // org.telegram.utils.twidget.l
    public final void a(long j3, long j10, int i7, byte[] bArr) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.u(x0Var.c, j10, i7, bArr);
        } catch (RemoteException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r15 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r12.c != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        r22 = r22 | r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r12.c != null) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r12.h != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
    
        r8 = r10 - android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
    
        if (r8 > 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r24.e.wait(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        r10 = r12.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r10 != null) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x009c, code lost:
    
        r12.e--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a4, code lost:
    
        if (r12.h != false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a8, code lost:
    
        if (r12.b == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00aa, code lost:
    
        r24.u = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        t(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00af, code lost:
    
        r0 = r0 + 1;
        r11 = r12;
        r9 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007c, code lost:
    
        r8 = false;
     */
    @Override // org.telegram.utils.twidget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(Context context, String str, String str2, float f10, float f11, int i7, String str3, String str4, String str5, String str6, boolean z10, WidgetSandboxBackend widgetSandboxBackend) {
        Object obj;
        y0 y0Var;
        boolean z11;
        if (this.w) {
            throw new IllegalStateException("Widget engine: no seccomp filter on this device");
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j3 = widgetSandboxBackend.session().z;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        try {
            Object obj2 = this.e;
            try {
                synchronized (obj2) {
                    try {
                        if (this.n == null) {
                            this.n = context.getApplicationContext();
                        }
                        b bVar = null;
                        y0 y0Var2 = null;
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 < 2 && bVar == null) {
                            try {
                                long elapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                                while (true) {
                                    y0 s5 = s(arrayList, j3);
                                    if (s5 != null) {
                                        break;
                                    }
                                    long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                                    if (elapsedRealtime2 <= 0) {
                                        throw new IllegalStateException("Widget engine: every process shows another bot's widget");
                                    }
                                    Object obj3 = obj2;
                                    this.e.wait(Math.min(elapsedRealtime2, 500L));
                                    obj2 = obj3;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                                throw th;
                            }
                        }
                        Object obj4 = obj2;
                        if (bVar == null) {
                            throw new IllegalStateException("Widget engine did not start");
                        }
                        int size = arrayList.size();
                        int i12 = 0;
                        while (i12 < size) {
                            Object obj5 = arrayList.get(i12);
                            i12++;
                            ((x0) obj5).b.session().b(true);
                        }
                        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
                        this.f.removeCallbacks(this.x);
                        this.f.postDelayed(this.x, 250L);
                        x0 x0Var = new x0(this, y0Var2, widgetSandboxBackend);
                        g0 g0Var = new g0(4, this, y0Var2);
                        this.f.postDelayed(g0Var, 15000L);
                        try {
                            try {
                                boolean z13 = s2.a;
                                Charset charset = StandardCharsets.UTF_8;
                                byte[] bytes = str.getBytes(charset);
                                byte[] bytes2 = str2.getBytes(charset);
                                byte[] bytes3 = str3.getBytes(charset);
                                byte[] bytes4 = str4.getBytes(charset);
                                byte[] bytes5 = str5.getBytes(charset);
                                byte[] bytes6 = str6.getBytes(charset);
                                y0Var = y0Var2;
                                try {
                                    long t6 = bVar.t(bytes, bytes2, f10, f11, i7, bytes3, bytes4, bytes5, bytes6, z10, x0Var);
                                    this.f.removeCallbacks(g0Var);
                                    x0Var.c = t6;
                                    if (s2.a) {
                                        StringBuilder sb2 = new StringBuilder("create ");
                                        sb2.append(SystemClock.uptimeMillis() - uptimeMillis);
                                        sb2.append(" ms in process ");
                                        sb2.append(y0Var.a);
                                        p5.c.t(sb2, z12 ? p5.c.j(uptimeMillis2, " (", " ms to its start)") : "", "WidgetEngine");
                                    }
                                    long incrementAndGet = this.l.incrementAndGet();
                                    this.k.put(Long.valueOf(incrementAndGet), x0Var);
                                    synchronized (this.e) {
                                        try {
                                            y0Var.e--;
                                            this.r = 0;
                                            z11 = y0Var.h && this.k.remove(Long.valueOf(incrementAndGet)) != null;
                                        } finally {
                                        }
                                    }
                                    if (z11) {
                                        widgetSandboxBackend.session().b(false);
                                    }
                                    return incrementAndGet;
                                } catch (Exception e10) {
                                    e = e10;
                                    boolean z14 = (e instanceof IllegalStateException) && "Widget engine: no seccomp filter on this device".equals(e.getMessage());
                                    synchronized (this.e) {
                                        try {
                                            y0Var.e--;
                                            w(y0Var);
                                            if (z14 && !this.w) {
                                                this.w = true;
                                                a8.d("widgets are off: the kernel has no seccomp filter for the engine's process");
                                                ArrayList arrayList2 = new ArrayList(this.g);
                                                int size2 = arrayList2.size();
                                                while (i10 < size2) {
                                                    Object obj6 = arrayList2.get(i10);
                                                    i10++;
                                                    y0 y0Var3 = (y0) obj6;
                                                    if (y0Var3.d == 0) {
                                                        t(y0Var3);
                                                    }
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                    throw e;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                y0Var = y0Var2;
                            }
                        } catch (Throwable th3) {
                            this.f.removeCallbacks(g0Var);
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = obj2;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            int size3 = arrayList.size();
            while (i10 < size3) {
                Object obj7 = arrayList.get(i10);
                i10++;
                ((x0) obj7).b.session().b(true);
            }
            throw th6;
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void d(long j3, byte[] bArr) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.R(x0Var.c, bArr);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void e(long j3) {
        x0 x0Var = (x0) this.k.remove(Long.valueOf(j3));
        if (x0Var == null) {
            return;
        }
        b bVar = x0Var.a.c;
        if (bVar != null) {
            try {
                bVar.J(x0Var.c);
            } catch (RemoteException unused) {
            }
        }
        synchronized (this.e) {
            w(x0Var.a);
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void f(long j3, int i7, float f10, float f11, int i10) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.Z0(x0Var.c, i7, f10, f11, i10);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void g(long j3) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        if (x0Var != null) {
            u(x0Var.a, "did not answer a tick");
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void i(long j3) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.M0(x0Var.c);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void j(long j3, byte[] bArr) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.d1(x0Var.c, bArr);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void k(long j3, byte[] bArr) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.e0(x0Var.c, bArr);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void l(long j3, float f10, boolean z10, boolean z11, boolean z12) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.s(x0Var.c, f10, z10, z11, z12);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void m(long j3, int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.j0(x0Var.c, i7, f10, f11, i10, z10, z11, i11, i12);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void o(long j3, boolean z10) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.u0(x0Var.c, z10);
        } catch (RemoteException unused) {
        }
    }

    @Override // org.telegram.utils.twidget.l
    public final void p(long j3, float f10) {
        x0 x0Var = (x0) this.k.get(Long.valueOf(j3));
        b bVar = x0Var == null ? null : x0Var.a.c;
        if (bVar == null) {
            return;
        }
        try {
            bVar.G0(x0Var.c, f10);
        } catch (RemoteException unused) {
        }
    }

    public final y0 s(ArrayList arrayList, long j3) {
        long j10;
        y0 y0Var;
        long j11;
        int i7;
        int i10;
        int v = v();
        long j12 = 0;
        int i11 = 0;
        int i12 = 1;
        if (v > 1) {
            if (j3 != 0) {
                ArrayList arrayList2 = this.g;
                int size = arrayList2.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList2.get(i13);
                    i13++;
                    y0Var = (y0) obj;
                    if (y0Var.d == 0 && y0Var.f && y0Var.r == j3 && y0Var.c != null) {
                        break;
                    }
                }
            }
            y0Var = null;
            if (y0Var == null && !this.h.isEmpty()) {
                y0 y0Var2 = (y0) this.h.get(0);
                ArrayList arrayList3 = this.h;
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size2) {
                        y0Var = y0Var2;
                        break;
                    }
                    Object obj2 = arrayList3.get(i14);
                    i14++;
                    y0 y0Var3 = (y0) obj2;
                    if (y0Var3.c != null) {
                        y0Var = y0Var3;
                        break;
                    }
                }
                this.h.remove(y0Var);
            }
            if (y0Var == null) {
                if (this.g.size() >= v) {
                    ArrayList arrayList4 = this.g;
                    int size3 = arrayList4.size();
                    int i15 = 0;
                    while (true) {
                        if (i15 >= size3) {
                            break;
                        }
                        Object obj3 = arrayList4.get(i15);
                        i15++;
                        y0 y0Var4 = (y0) obj3;
                        if (y0Var4.d == 0 && y0Var4.f) {
                            t(y0Var4);
                            break;
                        }
                    }
                }
                if (this.g.size() < v) {
                    y0Var = x(false);
                }
            }
            if (y0Var == null && j3 != 0) {
                ArrayList arrayList5 = this.g;
                int size4 = arrayList5.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = arrayList5.get(i16);
                    i16++;
                    y0 y0Var5 = (y0) obj4;
                    if (y0Var5.f && y0Var5.r == j3 && (y0Var == null || y0Var5.d < y0Var.d)) {
                        y0Var = y0Var5;
                    }
                }
            }
            if (y0Var == null) {
                ArrayList arrayList6 = this.g;
                int size5 = arrayList6.size();
                int i17 = 0;
                y0 y0Var6 = null;
                y0 y0Var7 = null;
                while (i17 < size5) {
                    Object obj5 = arrayList6.get(i17);
                    i17++;
                    y0 y0Var8 = (y0) obj5;
                    if (!y0Var8.f || y0Var8.d == 0 || y0Var8.e > 0) {
                        j11 = j12;
                        i7 = size5;
                    } else {
                        Iterator it = this.k.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                x0 x0Var = (x0) it.next();
                                if (x0Var.a == y0Var8) {
                                    p1 session = x0Var.b.session();
                                    if (session.L && !session.A) {
                                        if (y0Var8.r == j12) {
                                            j11 = j12;
                                            i7 = size5;
                                        } else {
                                            ArrayList arrayList7 = this.g;
                                            int size6 = arrayList7.size();
                                            j11 = j12;
                                            int i18 = i11;
                                            int i19 = i18;
                                            while (i18 < size6) {
                                                Object obj6 = arrayList7.get(i18);
                                                i18++;
                                                y0 y0Var9 = (y0) obj6;
                                                if (y0Var9.f) {
                                                    i10 = size5;
                                                    if (y0Var9.r == y0Var8.r) {
                                                        i19++;
                                                    }
                                                } else {
                                                    i10 = size5;
                                                }
                                                size5 = i10;
                                                i12 = 1;
                                            }
                                            i7 = size5;
                                            if (i19 > i12 && (y0Var7 == null || y0Var8.d < y0Var7.d)) {
                                                y0Var7 = y0Var8;
                                            }
                                        }
                                    }
                                }
                                j12 = j12;
                                size5 = size5;
                                i11 = 0;
                                i12 = 1;
                            } else {
                                j11 = j12;
                                i7 = size5;
                                if (y0Var6 == null || y0Var8.d < y0Var6.d) {
                                    y0Var6 = y0Var8;
                                }
                            }
                        }
                    }
                    j12 = j11;
                    size5 = i7;
                    i11 = 0;
                    i12 = 1;
                }
                j10 = j12;
                if (y0Var6 == null) {
                    y0Var6 = y0Var7;
                }
                if (y0Var6 == null) {
                    return null;
                }
                Iterator it2 = this.k.entrySet().iterator();
                while (it2.hasNext()) {
                    x0 x0Var2 = (x0) ((Map.Entry) it2.next()).getValue();
                    if (x0Var2.a == y0Var6) {
                        arrayList.add(x0Var2);
                        it2.remove();
                    }
                }
                if (s2.a) {
                    Log.d("WidgetEngine", "process " + y0Var6.a + " with " + y0Var6.d + " sessions makes room for another bot");
                }
                t(y0Var6);
                y0Var = x(false);
            } else {
                j10 = 0;
            }
        } else {
            j10 = 0;
            y0 y0Var10 = !this.g.isEmpty() ? (y0) this.g.get(0) : null;
            if (y0Var10 == null) {
                while (Build.VERSION.SDK_INT < 29) {
                    long elapsedRealtime = this.t - SystemClock.elapsedRealtime();
                    if (elapsedRealtime <= 0) {
                        break;
                    }
                    try {
                        this.e.wait(elapsedRealtime);
                        if (!this.g.isEmpty()) {
                            return s(arrayList, j3);
                        }
                    } catch (InterruptedException unused) {
                        throw new IllegalStateException("Widget engine did not start");
                    }
                }
                y0Var = x(false);
            } else {
                y0Var = y0Var10;
            }
        }
        this.f.removeCallbacks(y0Var.x);
        if (!y0Var.f) {
            y0Var.r = j3;
        } else if (y0Var.r != j3) {
            y0Var.r = j10;
        }
        y0Var.f = true;
        y0Var.d++;
        y0Var.e++;
        return y0Var;
    }

    public final void t(y0 y0Var) {
        if (y0Var.h) {
            return;
        }
        y0Var.h = true;
        if (y0Var.c != null && y0Var.c.asBinder().isBinderAlive()) {
            this.t = SystemClock.elapsedRealtime() + 1000;
        }
        y0Var.c = null;
        this.g.remove(y0Var);
        this.h.remove(y0Var);
        this.f.removeCallbacks(y0Var.x);
        try {
            this.n.unbindService(y0Var);
        } catch (RuntimeException unused) {
        }
        this.e.notifyAll();
    }

    public final void u(y0 y0Var, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.e) {
            try {
                if (y0Var.h) {
                    return;
                }
                Iterator it = this.k.entrySet().iterator();
                while (it.hasNext()) {
                    x0 x0Var = (x0) ((Map.Entry) it.next()).getValue();
                    if (x0Var.a == y0Var) {
                        arrayList.add(x0Var);
                        it.remove();
                    }
                }
                if (str != null) {
                    if (y0Var.c == null && y0Var.b) {
                        this.u = false;
                    }
                    if (!y0Var.f) {
                        int i7 = this.r + 1;
                        this.r = i7;
                        if (i7 >= 3) {
                            this.s = SystemClock.elapsedRealtime() + 60000;
                        }
                    }
                }
                t(y0Var);
                y();
                if (str != null) {
                    String str2 = "widget engine process " + y0Var.a + " " + str + " with " + arrayList.size() + " sessions";
                    Log.w("WidgetEngine", str2);
                    if (Build.VERSION.SDK_INT < 30 || y0Var.s == 0 || this.n == null) {
                        a8.b(str2);
                    } else {
                        Utilities.e.d(new sv0((Object) this, (Object) y0Var, str2, 15), 700L);
                    }
                }
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((x0) obj).b.session().b(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int v() {
        int i7;
        Context context;
        if (Build.VERSION.SDK_INT < 29) {
            return 1;
        }
        int i10 = B;
        if (i10 >= 0) {
            return Math.max(1, Math.min(8, i10));
        }
        if (this.v == null && (context = this.n) != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.v = Boolean.valueOf(activityManager != null && activityManager.isLowRamDevice());
        }
        Boolean bool = this.v;
        if (bool != null && bool.booleanValue()) {
            return 1;
        }
        try {
            i7 = ((org.telegram.messenger.j0) mp.u1(j10.t0).A7.v0.b).c;
        } catch (Exception unused) {
            i7 = 6;
        }
        return Math.max(1, Math.min(8, i7));
    }

    public final void w(y0 y0Var) {
        boolean z10 = y0Var.h;
        j0 j0Var = y0Var.x;
        if (z10) {
            return;
        }
        int i7 = y0Var.d - 1;
        y0Var.d = i7;
        if (i7 > 0) {
            return;
        }
        this.e.notifyAll();
        Handler handler = this.f;
        handler.removeCallbacks(j0Var);
        if (v() <= 1) {
            if (this.o && this.p) {
                return;
            }
            handler.postDelayed(j0Var, 30000L);
            return;
        }
        if (y0Var.r != 0) {
            handler.postDelayed(j0Var, 5000L);
        } else {
            t(y0Var);
            y();
        }
    }

    public final y0 x(boolean z10) {
        boolean z11;
        boolean z12 = this.u && C;
        int i7 = this.q + 1;
        this.q = i7;
        y0 y0Var = new y0(this, i7, z12);
        y0Var.n = z10;
        Intent intent = new Intent(this.n, (Class<?>) (z12 ? WidgetEngineService.Forked.class : WidgetEngineService.class));
        boolean z13 = s2.a;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                z11 = this.n.bindIsolatedService(intent, 65, "w" + y0Var.a, A, y0Var);
            } else {
                z11 = this.n.bindService(intent, y0Var, 65);
            }
        } catch (RuntimeException e10) {
            a8.g(e10, true);
            z11 = false;
        }
        if (z11) {
            this.g.add(y0Var);
            return y0Var;
        }
        try {
            this.n.unbindService(y0Var);
        } catch (RuntimeException unused) {
        }
        if (!z12) {
            throw new IllegalStateException("Widget engine service is unavailable");
        }
        this.u = false;
        return x(z10);
    }

    public final void y() {
        if (this.n == null || !this.o || !this.p || this.w) {
            return;
        }
        int v = v();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Build.VERSION.SDK_INT < 29 && elapsedRealtime < this.t) {
                this.f.removeCallbacks(this.x);
                this.f.postDelayed(this.x, (this.t - elapsedRealtime) + 20);
                return;
            }
            if (v <= 1) {
                if (this.g.isEmpty()) {
                    x(true);
                    return;
                }
                return;
            }
            int i7 = elapsedRealtime < this.j ? this.i : 1;
            while (this.h.size() < i7 && this.g.size() < v) {
                if (this.r >= 3 && elapsedRealtime < this.s) {
                    return;
                } else {
                    this.h.add(x(true));
                }
            }
        } catch (RuntimeException e10) {
            a8.g(e10, true);
        }
    }
}
