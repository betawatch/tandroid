package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.Trace;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.p31;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final class h1 {
    public volatile boolean A;
    public String B;
    public boolean C;
    public boolean D;
    public boolean E;
    public volatile boolean F;
    public int G;
    public f1 H;
    public f1 I;
    public JSONObject J;
    public boolean K;
    public v0 L;
    public v0 M;
    public String N;
    public final b1 O;
    public final b1 P;
    public final b1 Q;
    public final c1 R;
    public long S;
    public final b1 T;
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
    public final r0 c = r0.i;
    public volatile d0 d = new d0(null);
    public volatile String j = "{}";
    public final long m = System.nanoTime();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final AtomicBoolean q = new AtomicBoolean();
    public final AtomicBoolean r = new AtomicBoolean();
    public final Object s = new Object();

    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.utils.twidget.c1] */
    public h1(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        this.O = new b1(this, 0);
        this.P = new b1(this, 2);
        this.Q = new b1(this, 3);
        this.R = new Choreographer.FrameCallback() { // from class: org.telegram.utils.twidget.c1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                h1 h1Var = h1.this;
                h1Var.D = false;
                long j10 = h1Var.v;
                if (h1Var.w || j10 == 0 || !h1Var.o.compareAndSet(false, true)) {
                    return;
                }
                boolean z9 = h1Var.F && (h1Var.r.getAndSet(false) || h1Var.q.get());
                boolean z10 = h1Var.F && h1Var.p.getAndSet(false);
                if (z10) {
                    h1Var.S = j3;
                }
                r0 r0Var = h1Var.c;
                float f10 = (j3 - h1Var.m) / 1000000.0f;
                boolean andSet = h1Var.n.getAndSet(false);
                o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j10));
                b h12 = o0Var == null ? null : o0Var.h1();
                if (h12 == null) {
                    return;
                }
                try {
                    h12.s(o0Var.d, f10, z10, z9, andSet);
                } catch (RemoteException unused) {
                }
            }
        };
        this.T = new b1(this, 4);
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
            if (p10.i(i7).p() && ((org.telegram.messenger.h0) qp.s1(i7).x7.o0.b).c) {
                return true;
            }
        }
        return false;
    }

    public final void b(c0 c0Var, g1[] g1VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m1 m1Var) {
        Object obj;
        boolean z9 = this.y;
        Object obj2 = this.s;
        synchronized (obj2) {
            try {
                try {
                    if (this.w) {
                        c0Var.b();
                        return;
                    }
                    f1 f1Var = this.I;
                    if (f1Var != null) {
                        f1Var.a.b();
                    }
                    try {
                        this.I = new f1(c0Var, g1VarArr, d, i7, i10, f10, f11, i11, i12, i13, m1Var, z9, this.A);
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

    public final void c() {
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

    public final void d(String str) {
        if (this.w || str == null || str.equals(this.k)) {
            return;
        }
        this.k = str;
        long j3 = this.v;
        if (j3 != 0) {
            r0 r0Var = this.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.d1(o0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void e(boolean z9) {
        if (this.w || this.F == z9) {
            return;
        }
        this.F = z9;
        long j3 = this.v;
        if (j3 != 0) {
            o0 o0Var = (o0) this.c.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 != null) {
                try {
                    h12.u0(o0Var.d, z9);
                } catch (RemoteException unused) {
                }
            }
        }
        if (z9) {
            c();
        }
    }

    public final void f(int i7) {
        long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (a()) {
            throw new IllegalStateException("Widgets are disabled by the app config");
        }
        if (!WidgetSandboxNative.available()) {
            throw new IllegalStateException("libtwidget is missing");
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
                r0 r0Var = this.c;
                Context context = this.e;
                String str4 = this.f;
                String str5 = this.B;
                float f10 = this.l;
                j3 = r0Var.f(context, str4, str5, i7 / f10, f10, this.g, this.h, this.i, str3, id.M0(2131742870, null), this.F, this.b);
                try {
                    this.a.post(new bi.d0(this, j3, i7, this.B, str));
                    Trace.endSection();
                } catch (Exception e10) {
                    e = e10;
                    if (j3 != 0) {
                        a1.a.execute(new p31(this, j3, 2));
                    }
                    this.a.post(new f0(5, this, e));
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
}
