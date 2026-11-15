package org.telegram.utils.twidget;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class l1 {
    public static boolean U;
    public volatile boolean A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public int G;
    public j1 H;
    public j1 I;
    public JSONObject J;
    public boolean K;
    public y0 L;
    public y0 M;
    public String N;
    public final e1 O;
    public final e1 P;
    public final e1 Q;
    public final f1 R;
    public long S;
    public final e1 T;
    public final Context e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public volatile String k;
    public final float l;
    public volatile int t;
    public volatile boolean u;
    public volatile long v;
    public volatile boolean w;
    public volatile boolean x;
    public volatile boolean y;
    public volatile boolean z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public final u0 c = u0.i;
    public volatile d0 d = new d0(null);
    public volatile String j = "{}";
    public final long m = System.nanoTime();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean r = new AtomicBoolean();
    public final Object s = new Object();

    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.utils.twidget.f1] */
    public l1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.O = new e1(this, 0);
        this.P = new e1(this, 2);
        this.Q = new e1(this, 3);
        this.R = new Choreographer.FrameCallback() { // from class: org.telegram.utils.twidget.f1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                l1 l1Var = l1.this;
                l1Var.D = false;
                long j10 = l1Var.v;
                if (l1Var.w || j10 == 0 || !l1Var.o.compareAndSet(false, true)) {
                    return;
                }
                boolean z10 = l1Var.F && (l1Var.r.getAndSet(false) || l1Var.q.get());
                boolean z11 = l1Var.F && l1Var.p.getAndSet(false);
                if (z11) {
                    l1Var.S = j3;
                }
                u0 u0Var = l1Var.c;
                float f10 = (j3 - l1Var.m) / 1000000.0f;
                boolean andSet = l1Var.n.getAndSet(false);
                r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j10));
                b h12 = r0Var == null ? null : r0Var.h1();
                if (h12 == null) {
                    return;
                }
                try {
                    h12.s(r0Var.d, f10, z11, z10, andSet);
                } catch (RemoteException unused) {
                }
            }
        };
        this.T = new e1(this, 4);
        if (i7 < 1 || i7 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.e = context.getApplicationContext();
        this.f = str;
        this.B = str2;
        str2.contains("\"dark\"");
        this.g = i7;
        this.h = str3 == null ? "en-US" : str3;
        this.i = str4 == null ? "{}" : str4;
        this.l = context.getResources().getDisplayMetrics().density;
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (m10.i(i7).p() && ((org.telegram.messenger.h0) np.s1(i7).y7.o0.b).c) {
                return true;
            }
        }
        return false;
    }

    public static void c(Context context) {
        ActivityManager activityManager;
        org.telegram.messenger.r0 r0Var;
        if (a() || (activityManager = (ActivityManager) context.getSystemService("activity")) == null || activityManager.isLowRamDevice()) {
            return;
        }
        try {
            u0 u0Var = u0.i;
            synchronized (u0Var.b) {
                try {
                    if (u0Var.g == null) {
                        u0Var.g = context.getApplicationContext();
                    }
                    u0Var.h = true;
                    u0Var.h(u0Var.e());
                } finally {
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        if (U || (r0Var = org.telegram.messenger.r0.f) == null) {
            return;
        }
        U = true;
        r0Var.d.add(new i1(context));
    }

    public final void b(c0 c0Var, k1[] k1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, q1 q1Var) {
        Object obj;
        boolean z10 = this.y;
        Object obj2 = this.s;
        synchronized (obj2) {
            try {
                try {
                    if (this.w) {
                        c0Var.b();
                        return;
                    }
                    j1 j1Var = this.I;
                    if (j1Var != null) {
                        j1Var.a.b();
                    }
                    try {
                        this.I = new j1(c0Var, k1VarArr, d, i7, i10, f10, f11, i11, i12, i13, q1Var, z10, this.A);
                        if (!this.K) {
                            this.K = true;
                            this.a.post(this.O);
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
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final void d() {
        if (this.w || this.v == 0 || this.D || this.o.get()) {
            return;
        }
        if (!this.n.get()) {
            if (!this.F) {
                return;
            }
            if (!this.p.get() && !this.q.get() && !this.r.get()) {
                return;
            }
        }
        this.D = true;
        Choreographer.getInstance().postFrameCallback(this.R);
    }

    public final void e(String str) {
        if (this.w || str == null || str.equals(this.k)) {
            return;
        }
        this.k = str;
        long j3 = this.v;
        if (j3 != 0) {
            u0 u0Var = this.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.d1(r0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void f(boolean z10) {
        if (this.w || this.F == z10) {
            return;
        }
        this.F = z10;
        long j3 = this.v;
        if (j3 != 0) {
            r0 r0Var = (r0) this.c.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 != null) {
                try {
                    h12.v0(r0Var.d, z10);
                } catch (RemoteException unused) {
                }
            }
        }
        if (z10) {
            d();
        }
    }

    public final void g(int i7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (a()) {
            throw new IllegalStateException("Widgets are disabled by the app config");
        }
        if (this.G == 0) {
            this.G = i7;
        }
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                if (this.w) {
                    Trace.endSection();
                    return;
                }
                String str = this.k;
                String str2 = this.j;
                if (str != null) {
                    str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                }
                String str3 = str2;
                u0 u0Var = this.c;
                Context context = this.e;
                String str4 = this.f;
                String str5 = this.B;
                float f10 = this.l;
                j3 = u0Var.f(context, str4, str5, i7 / f10, f10, this.g, this.h, this.i, str3, hd.M0(2131742867, null), this.F, this.b);
                try {
                    this.a.post(new bi.e0(this, j3, i7, this.B, str));
                    Trace.endSection();
                } catch (Exception e10) {
                    e = e10;
                    if (j3 != 0) {
                        d1.a.execute(new n31(this, j3, 2));
                    }
                    this.a.post(new f0(5, this, e));
                    throw e;
                }
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        } catch (Exception e11) {
            e = e11;
            j3 = 0;
        }
    }
}
