package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class p1 {
    public static boolean f0;
    public volatile boolean A;
    public volatile boolean B;
    public volatile long C;
    public volatile long D;
    public volatile boolean E;
    public volatile boolean F;
    public volatile boolean G;
    public String H;
    public boolean I;
    public boolean J;
    public boolean K;
    public volatile boolean L;
    public int M;
    public n1 N;
    public n1 O;
    public JSONObject P;
    public boolean Q;
    public d1 R;
    public float[] S;
    public d1 T;
    public String U;
    public final j1 V;
    public final j1 W;
    public final j1 X;
    public final l1 Y;
    public long Z;
    public boolean a0;
    public final j1 b0;
    public long c0;
    public final j1 d0;
    public final Context e;
    public boolean e0;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public volatile String k;
    public final float l;
    public volatile int t;
    public volatile boolean u;
    public volatile long v;
    public volatile float x;
    public volatile long z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public final l c = z0.z;
    public volatile e0 d = new e0(null);
    public volatile String j = "{}";
    public final long m = System.nanoTime();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean r = new AtomicBoolean();
    public final Object s = new Object();
    public final HashMap w = new HashMap();
    public final AtomicBoolean y = new AtomicBoolean();

    /* JADX WARN: Type inference failed for: r1v15, types: [org.telegram.utils.twidget.l1] */
    public p1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.V = new j1(this, 0);
        this.W = new j1(this, 1);
        this.X = new j1(this, 2);
        this.Y = new Choreographer.FrameCallback() { // from class: org.telegram.utils.twidget.l1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                p1 p1Var = p1.this;
                p1Var.J = false;
                long j10 = p1Var.v;
                if (p1Var.A || j10 == 0 || !p1Var.o.compareAndSet(false, true)) {
                    return;
                }
                boolean z10 = p1Var.L && (p1Var.r.getAndSet(false) || p1Var.q.get());
                boolean z11 = p1Var.L && p1Var.p.getAndSet(false);
                if (z11) {
                    p1Var.c0 = j3;
                }
                p1Var.Z = SystemClock.uptimeMillis();
                if (!p1Var.a0) {
                    p1Var.a0 = true;
                    p1Var.a.postDelayed(p1Var.b0, 5000L);
                }
                p1Var.c.l(j10, (j3 - p1Var.m) / 1000000.0f, z11, z10, p1Var.n.getAndSet(false));
            }
        };
        this.b0 = new j1(this, 3);
        this.d0 = new j1(this, 4);
        if (i7 < 1 || i7 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.e = context.getApplicationContext();
        this.f = str;
        this.H = str2;
        str2.contains("\"dark\"");
        this.g = i7;
        this.h = str3 == null ? "en-US" : str3;
        this.i = str4 == null ? "{}" : str4;
        this.l = context.getResources().getDisplayMetrics().density;
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (j10.i(i7).p() && ((org.telegram.messenger.h0) mp.u1(i7).A7.u0.b).c) {
                return true;
            }
        }
        return false;
    }

    public static void d(Context context) {
        ActivityManager activityManager;
        if (a() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.isLowRamDevice()) {
            return;
        }
        org.telegram.messenger.r0 r0Var = org.telegram.messenger.r0.f;
        if (r0Var == null || r0Var.a > 0) {
            try {
                z0 z0Var = z0.z;
                synchronized (z0Var.e) {
                    try {
                        if (z0Var.n == null) {
                            z0Var.n = context.getApplicationContext();
                        }
                        z0Var.o = true;
                        z0Var.p = true;
                        z0Var.f.removeCallbacks(z0Var.y);
                        z0Var.y();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        if (f0 || r0Var == null) {
            return;
        }
        f0 = true;
        r0Var.d.add(new m1(context));
    }

    public final void b(boolean z10) {
        this.a.post(new pp0(17, this, z10));
    }

    public final void c(d0 d0Var, o1[] o1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, v1 v1Var) {
        Object obj;
        boolean z10 = this.E;
        if (this.D == 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.C == 0) {
                this.C = uptimeMillis;
            }
            if (z10) {
                this.D = uptimeMillis;
            }
        }
        Object obj2 = this.s;
        synchronized (obj2) {
            try {
                try {
                    if (this.A) {
                        d0Var.b();
                        return;
                    }
                    n1 n1Var = this.O;
                    if (n1Var != null) {
                        n1Var.a.b();
                    }
                    try {
                        this.O = new n1(d0Var, o1VarArr, d, i7, i10, f10, f11, i11, i12, i13, v1Var, z10, this.G);
                        if (!this.Q) {
                            this.Q = true;
                            this.a.post(this.V);
                        }
                        this.t = i10;
                        this.u = true;
                    } catch (Throwable th2) {
                        th = th2;
                        obj = obj2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
            }
        }
    }

    public final void e() {
        if (this.A || this.v == 0 || this.J || this.o.get()) {
            return;
        }
        if (!this.n.get()) {
            if (!this.L) {
                return;
            }
            if (!this.p.get() && !this.q.get() && !this.r.get()) {
                return;
            }
        }
        this.J = true;
        Choreographer.getInstance().postFrameCallback(this.Y);
    }

    public final void f(String str) {
        if (this.A || str == null || str.equals(this.k)) {
            return;
        }
        this.k = str;
        long j3 = this.v;
        if (j3 != 0) {
            this.c.j(j3, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void g(boolean z10) {
        if (this.A || this.L == z10) {
            return;
        }
        this.L = z10;
        if (z10) {
            this.Z = SystemClock.uptimeMillis();
        }
        long j3 = this.v;
        if (j3 != 0) {
            this.c.o(j3, z10);
        }
        if (z10) {
            e();
        }
    }

    public final void h(int i7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (a()) {
            throw new IllegalStateException("Widgets are disabled by the app config");
        }
        if (this.M == 0) {
            this.M = i7;
        }
        SystemClock.uptimeMillis();
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                if (this.A) {
                    Trace.endSection();
                    return;
                }
                String str = this.k;
                String str2 = this.j;
                if (str != null) {
                    str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                }
                String str3 = str2;
                l lVar = this.c;
                Context context = this.e;
                String str4 = this.f;
                String str5 = this.H;
                float f10 = this.l;
                j3 = lVar.c(context, str4, str5, i7 / f10, f10, this.g, this.h, this.i, str3, gd.M0(2131742609, null), this.L, this.b);
                try {
                    SystemClock.uptimeMillis();
                    this.a.post(new bi.e0(this, j3, i7, this.H, str));
                    Trace.endSection();
                } catch (Exception e10) {
                    e = e10;
                    if (j3 != 0) {
                        i1.a.execute(new qx0(this, j3, 3));
                    }
                    this.a.post(new g0(8, this, e));
                    throw e;
                }
            } catch (Exception e11) {
                e = e11;
                j3 = 0;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void i(int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        if (i7 == 0 && this.L) {
            e0 e0Var = this.d;
            synchronized (e0Var) {
                e0Var.d++;
                e0Var.f = SystemClock.elapsedRealtime();
            }
        }
        long j3 = this.v;
        if (this.A || j3 == 0) {
            return;
        }
        this.c.m(j3, i7, f10, f11, i10, z10, z11, i11, i12);
    }
}
