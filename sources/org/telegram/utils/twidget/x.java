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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class x extends b {
    public static final x v = new x();
    public static final ic w = new ic(1);
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
    public final l0d t;
    public final l0d u;
    public final Object a = new Object();
    public final Handler b = new Handler(Looper.getMainLooper());
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final AtomicLong h = new AtomicLong();
    public final Semaphore i = new Semaphore(12);
    public boolean l = true;

    /* JADX WARN: Type inference failed for: r0v10, types: [l0d] */
    /* JADX WARN: Type inference failed for: r0v9, types: [l0d] */
    public x() {
        this.q = Build.VERSION.SDK_INT >= 29;
        final byte b = 0;
        this.t = new Runnable(this) { // from class: l0d
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
                        xVar.o((n0d) arrayList.get(arrayList.size() - 1));
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
                                n0d n0dVar = (n0d) obj;
                                if (n0dVar.e == 0) {
                                    xVar.o(n0dVar);
                                }
                            }
                            return;
                        }
                }
            }
        };
        final byte b2 = 1;
        this.u = new Runnable(this) { // from class: l0d
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
                        xVar.o((n0d) arrayList.get(arrayList.size() - 1));
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
                                n0d n0dVar = (n0d) obj;
                                if (n0dVar.e == 0) {
                                    xVar.o(n0dVar);
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
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.l(wVar.c, j2, i, bArr);
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
        n0d n0dVar;
        boolean z2;
        long j = 0;
        if (this.s) {
            grb.i("Widget engine: no seccomp filter on this device");
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
                    jl5 jl5Var = null;
                    n0d n0dVar2 = null;
                    int i3 = 0;
                    boolean z3 = false;
                    while (i3 < 2 && jl5Var == null) {
                        long elapsedRealtime = SystemClock.elapsedRealtime() + 10000;
                        while (true) {
                            n0d n = n(arrayList, j2);
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
                    if (jl5Var == null) {
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
                    w wVar = new w(this, n0dVar2, widgetSandboxBackend);
                    cxc cxcVar = new cxc((Object) this, (Object) n0dVar2, (byte) 14);
                    this.b.postDelayed(cxcVar, 15000L);
                    try {
                        try {
                            boolean z5 = f11.a;
                            Charset charset = StandardCharsets.UTF_8;
                            byte[] bytes = str.getBytes(charset);
                            byte[] bytes2 = str2.getBytes(charset);
                            byte[] bytes3 = str3.getBytes(charset);
                            byte[] bytes4 = str4.getBytes(charset);
                            byte[] bytes5 = str5.getBytes(charset);
                            byte[] bytes6 = str6.getBytes(charset);
                            n0dVar = n0dVar2;
                            try {
                                long G = jl5Var.G(bytes, bytes2, f, f2, i, bytes3, bytes4, bytes5, bytes6, z, wVar);
                                this.b.removeCallbacks(cxcVar);
                                wVar.c = G;
                                if (f11.a) {
                                    StringBuilder sb = new StringBuilder("create ");
                                    sb.append(SystemClock.uptimeMillis() - uptimeMillis);
                                    sb.append(" ms in process ");
                                    sb.append(n0dVar.a);
                                    bs2.x(sb, z3 ? ik8.n(uptimeMillis2, " (", " ms to its start)") : "", "WidgetEngine");
                                }
                                long incrementAndGet = this.h.incrementAndGet();
                                this.g.put(Long.valueOf(incrementAndGet), wVar);
                                synchronized (this.a) {
                                    n0dVar.f--;
                                    this.n = 0;
                                    z2 = n0dVar.n && this.g.remove(Long.valueOf(incrementAndGet)) != null;
                                }
                                if (z2) {
                                    widgetSandboxBackend.session().b(false);
                                }
                                return incrementAndGet;
                            } catch (Exception e) {
                                e = e;
                                boolean z6 = (e instanceof IllegalStateException) && "Widget engine: no seccomp filter on this device".equals(e.getMessage());
                                synchronized (this.a) {
                                    n0dVar.f--;
                                    s(n0dVar);
                                    if (z6 && !this.s) {
                                        this.s = true;
                                        cc4.d("widgets are off: the kernel has no seccomp filter for the engine's process");
                                        ArrayList arrayList2 = new ArrayList(this.c);
                                        int size2 = arrayList2.size();
                                        while (i2 < size2) {
                                            Object obj5 = arrayList2.get(i2);
                                            i2++;
                                            n0d n0dVar3 = (n0d) obj5;
                                            if (n0dVar3.e == 0) {
                                                o(n0dVar3);
                                            }
                                        }
                                    }
                                }
                                throw e;
                            }
                        } catch (Throwable th2) {
                            this.b.removeCallbacks(cxcVar);
                            throw th2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        n0dVar = n0dVar2;
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
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.s(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void d(long j) {
        w wVar = (w) this.g.remove(Long.valueOf(j));
        if (wVar != null) {
            jl5 jl5Var = wVar.a.d;
            if (jl5Var != null) {
                try {
                    jl5Var.r(wVar.c);
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
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.K(wVar.c, i, f, f2, i2);
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
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.H(wVar.c);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void h(long j, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.M(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void i(long j, byte[] bArr) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.u(wVar.c, bArr);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void j(long j, float f, boolean z, boolean z2, boolean z3) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.k(wVar.c, f, z, z2, z3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void k(long j, int i, float f, float f2, int i2, boolean z, boolean z2, int i3, int i4) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.x(wVar.c, i, f, f2, i2, z, z2, i3, i4);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void l(long j, boolean z) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.A(wVar.c, z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // org.telegram.utils.twidget.b
    public final void m(long j, float f) {
        w wVar = (w) this.g.get(Long.valueOf(j));
        jl5 jl5Var = wVar == null ? null : wVar.a.d;
        if (jl5Var != null) {
            try {
                jl5Var.D(wVar.c, f);
            } catch (RemoteException unused) {
            }
        }
    }

    public final n0d n(ArrayList arrayList, long j) {
        long j2;
        n0d n0dVar;
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
                    n0dVar = (n0d) obj;
                    if (n0dVar.e == 0 && n0dVar.h) {
                        j3 = j5;
                        if (n0dVar.s == j && n0dVar.d != null) {
                            break;
                        }
                    } else {
                        j3 = j5;
                    }
                    j5 = j3;
                }
            }
            j3 = j5;
            n0dVar = null;
            if (n0dVar == null && !this.d.isEmpty()) {
                n0d n0dVar2 = (n0d) this.d.get(0);
                ArrayList arrayList3 = this.d;
                int size2 = arrayList3.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size2) {
                        n0dVar = n0dVar2;
                        break;
                    }
                    Object obj2 = arrayList3.get(i7);
                    i7++;
                    n0d n0dVar3 = (n0d) obj2;
                    if (n0dVar3.d != null) {
                        n0dVar = n0dVar3;
                        break;
                    }
                }
                this.d.remove(n0dVar);
            }
            if (n0dVar == null) {
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
                        n0d n0dVar4 = (n0d) obj3;
                        if (n0dVar4.e == 0 && n0dVar4.h) {
                            o(n0dVar4);
                            break;
                        }
                    }
                }
                if (this.c.size() < r) {
                    n0dVar = t(false);
                }
            }
            if (n0dVar == null && j != 0) {
                ArrayList arrayList5 = this.c;
                int size4 = arrayList5.size();
                int i9 = 0;
                while (i9 < size4) {
                    Object obj4 = arrayList5.get(i9);
                    i9++;
                    n0d n0dVar5 = (n0d) obj4;
                    if (n0dVar5.h && n0dVar5.s == j && (n0dVar5.c || n0dVar5.e < 4)) {
                        if (n0dVar == null || n0dVar5.e < n0dVar.e) {
                            n0dVar = n0dVar5;
                        }
                    }
                }
            }
            if (n0dVar == null) {
                ArrayList arrayList6 = this.c;
                int size5 = arrayList6.size();
                int i10 = 0;
                n0d n0dVar6 = null;
                n0d n0dVar7 = null;
                while (i10 < size5) {
                    Object obj5 = arrayList6.get(i10);
                    int i11 = i10 + 1;
                    n0d n0dVar8 = (n0d) obj5;
                    if (n0dVar8.h && n0dVar8.e != 0 && n0dVar8.f <= 0) {
                        Iterator it = this.g.values().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                w wVar = (w) it.next();
                                if (wVar.a == n0dVar8) {
                                    z session = wVar.b.session();
                                    if (session.L && !session.A) {
                                        if (n0dVar8.s != j3) {
                                            ArrayList arrayList7 = this.c;
                                            int size6 = arrayList7.size();
                                            int i12 = i4;
                                            int i13 = i12;
                                            while (i12 < size6) {
                                                Object obj6 = arrayList7.get(i12);
                                                int i14 = i12 + 1;
                                                long j6 = j3;
                                                n0d n0dVar9 = (n0d) obj6;
                                                if (n0dVar9.h) {
                                                    i3 = i11;
                                                    long j7 = n0dVar9.s;
                                                    i2 = i14;
                                                    if (j7 == n0dVar8.s) {
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
                                            if (i13 > i5 && (n0dVar7 == null || n0dVar8.e < n0dVar7.e)) {
                                                n0dVar7 = n0dVar8;
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
                                if (n0dVar6 == null || n0dVar8.e < n0dVar6.e) {
                                    n0dVar6 = n0dVar8;
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
                if (n0dVar6 == null) {
                    n0dVar6 = n0dVar7;
                }
                if (n0dVar6 == null) {
                    return null;
                }
                Iterator it2 = this.g.entrySet().iterator();
                while (it2.hasNext()) {
                    w wVar2 = (w) ((Map.Entry) it2.next()).getValue();
                    if (wVar2.a == n0dVar6) {
                        arrayList.add(wVar2);
                        it2.remove();
                    }
                }
                if (f11.a) {
                    Log.d("WidgetEngine", "process " + n0dVar6.a + " with " + n0dVar6.e + " sessions makes room for another bot");
                }
                o(n0dVar6);
                n0dVar = t(false);
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
                n0d n0dVar10 = (n0d) obj7;
                if (n0dVar10.c || n0dVar10.e < 4) {
                    n0dVar = n0dVar10;
                    break;
                }
            }
            n0dVar = null;
            if (n0dVar == null) {
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
                        grb.i("Widget engine did not start");
                        return null;
                    }
                }
                n0dVar = t(false);
            }
        }
        this.b.removeCallbacks(n0dVar.y);
        if (!n0dVar.h) {
            n0dVar.s = j;
        } else if (n0dVar.s != j) {
            n0dVar.s = j2;
        }
        n0dVar.h = true;
        n0dVar.e++;
        n0dVar.f++;
        return n0dVar;
    }

    public final void o(n0d n0dVar) {
        if (n0dVar.n) {
            return;
        }
        n0dVar.n = true;
        if (n0dVar.d != null && n0dVar.d.asBinder().isBinderAlive()) {
            this.p = SystemClock.elapsedRealtime() + 1000;
        }
        n0dVar.d = null;
        this.c.remove(n0dVar);
        this.d.remove(n0dVar);
        this.b.removeCallbacks(n0dVar.y);
        try {
            this.j.unbindService(n0dVar);
        } catch (RuntimeException unused) {
        }
        this.a.notifyAll();
    }

    public final /* synthetic */ void p(n0d n0dVar, String str) {
        String str2 = "";
        try {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.j.getSystemService("activity")).getHistoricalProcessExitReasons(this.j.getPackageName(), n0dVar.w, 1);
            if (!historicalProcessExitReasons.isEmpty()) {
                ApplicationExitInfo a = vr9.a(historicalProcessExitReasons.get(0));
                str2 = ": exit reason " + a.getReason() + ", status " + a.getStatus() + ", " + a.getDescription() + ", rss " + (a.getRss() >> 10) + " MB";
            }
        } catch (Exception unused) {
        }
        Log.w("WidgetEngine", "process " + n0dVar.a + str2);
        cc4.b(str.concat(str2));
    }

    public final void q(n0d n0dVar, String str) {
        ArrayList arrayList = new ArrayList();
        synchronized (this.a) {
            if (n0dVar.n) {
                return;
            }
            Iterator it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                w wVar = (w) ((Map.Entry) it.next()).getValue();
                if (wVar.a == n0dVar) {
                    arrayList.add(wVar);
                    it.remove();
                }
            }
            if (str != null) {
                if (n0dVar.d == null && n0dVar.b) {
                    this.q = false;
                }
                if (!n0dVar.h) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i >= 3) {
                        this.o = SystemClock.elapsedRealtime() + 60000;
                    }
                }
            }
            o(n0dVar);
            u();
            if (str != null) {
                String str2 = "widget engine process " + n0dVar.a + " " + str + " with " + arrayList.size() + " sessions";
                Log.w("WidgetEngine", str2);
                if (Build.VERSION.SDK_INT < 30 || n0dVar.w == 0 || this.j == null) {
                    cc4.b(str2);
                } else {
                    Utilities.e.d(new jwc(this, n0dVar, str2), 700L);
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
                    i = uc7.s1(yac.t0).k4.B0.f();
                } catch (Exception unused) {
                    i = 6;
                }
                return Math.max(1, Math.min(8, i));
            }
        }
        return 1;
    }

    public final void s(n0d n0dVar) {
        boolean z = n0dVar.n;
        olc olcVar = n0dVar.y;
        if (z) {
            return;
        }
        int i = n0dVar.e - 1;
        n0dVar.e = i;
        if (i <= 0) {
            this.a.notifyAll();
            Handler handler = this.b;
            handler.removeCallbacks(olcVar);
            if (r() <= 1) {
                if (this.k && this.l) {
                    return;
                }
                handler.postDelayed(olcVar, 30000L);
                return;
            }
            if (n0dVar.s != 0) {
                handler.postDelayed(olcVar, 5000L);
            } else {
                o(n0dVar);
                u();
            }
        }
    }

    public final n0d t(boolean z) {
        boolean z2;
        boolean z3 = this.q && y;
        boolean z4 = r() <= 1;
        int i = this.m + 1;
        this.m = i;
        n0d n0dVar = new n0d(this, i, z3, z4);
        n0dVar.r = z;
        Intent intent = new Intent(this.j, (Class<?>) (z3 ? WidgetEngineService.Forked.class : WidgetEngineService.class));
        intent.putExtra("shared", z4);
        boolean z5 = f11.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            Context context = this.j;
            if (i2 >= 29) {
                z2 = context.bindIsolatedService(intent, 65, "w" + n0dVar.a, w, n0dVar);
            } else {
                z2 = context.bindService(intent, n0dVar, 65);
            }
        } catch (RuntimeException e) {
            cc4.g(e, true);
            z2 = false;
        }
        if (z2) {
            this.c.add(n0dVar);
            return n0dVar;
        }
        try {
            this.j.unbindService(n0dVar);
        } catch (RuntimeException unused) {
        }
        if (z3) {
            this.q = false;
            return t(z);
        }
        grb.i("Widget engine service is unavailable");
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
            cc4.g(e, true);
        }
    }
}
