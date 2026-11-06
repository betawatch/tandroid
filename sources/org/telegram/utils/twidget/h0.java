package org.telegram.utils.twidget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.Choreographer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class h0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public int E;
    public f0 F;
    public f0 G;
    public JSONObject H;
    public boolean I;
    public u J;
    public u K;
    public String L;
    public final d0 M;
    public final d0 N;
    public final d0 O;
    public final c0 P;
    public long Q;
    public final d0 R;
    public final Context c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public volatile String i;
    public final float j;
    public volatile int r;
    public volatile boolean s;
    public volatile long t;
    public volatile boolean u;
    public volatile boolean v;
    public volatile boolean w;
    public volatile boolean x;
    public volatile boolean y;
    public String z;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final WidgetSandboxBackend b = new WidgetSandboxBackend(this);
    public volatile String h = "{}";
    public final long k = System.nanoTime();
    public final AtomicBoolean l = new AtomicBoolean();
    public final AtomicBoolean m = new AtomicBoolean();
    public final AtomicBoolean n = new AtomicBoolean();
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean p = new AtomicBoolean();
    public final Object q = new Object();

    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.utils.twidget.d0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.utils.twidget.d0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.utils.twidget.c0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.utils.twidget.d0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [org.telegram.utils.twidget.d0] */
    public h0(Context context, String str, String str2, int i7, String str3, String str4) {
        new JSONObject();
        final int i10 = 1;
        this.M = new Runnable(this) { // from class: org.telegram.utils.twidget.d0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i11;
                switch (i10) {
                    case 0:
                        h0 h0Var2 = this.b;
                        long j3 = h0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                        if (h0Var2.u || j3 == 0 || !h0Var2.D || !h0Var2.n.get() || nanoTime - h0Var2.Q < (max * 9) / 10 || !h0Var2.m.compareAndSet(false, true)) {
                            h0Var2.c();
                            return;
                        }
                        h0Var2.n.set(false);
                        h0Var2.Q = nanoTime;
                        WidgetSandboxNative.tick(j3, (nanoTime - h0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        h0 h0Var3 = this.b;
                        synchronized (h0Var3.q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.u) {
                            if (f0Var != null) {
                                f0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i11 = h0Var3.E) != 0 && Math.abs(f0Var.d - i11) > 1) {
                            f0Var.a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject == null || (uVar = h0Var3.J) == null) {
                            return;
                        }
                        if (uVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                int i12 = h.C;
                                int i13 = uVar.q;
                                if (i12 != i13) {
                                    h.C = i13;
                                    h.B++;
                                    h.D = true;
                                    a8.b("widget " + uVar.a + " stopped (" + h.B + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && uVar.g != null && (h0Var = uVar.f) != null) {
                            uVar.g(h0Var);
                            return;
                        } else {
                            if (!uVar.e() || (p71Var = uVar.h) == null) {
                                return;
                            }
                            o71 o71Var = p71Var.a;
                            o71Var.j();
                            o71Var.h();
                            return;
                        }
                    case 2:
                        this.b.c();
                        return;
                    default:
                        h0 h0Var4 = this.b;
                        h0Var4.p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        final int i11 = 2;
        this.N = new Runnable(this) { // from class: org.telegram.utils.twidget.d0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i112;
                switch (i11) {
                    case 0:
                        h0 h0Var2 = this.b;
                        long j3 = h0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                        if (h0Var2.u || j3 == 0 || !h0Var2.D || !h0Var2.n.get() || nanoTime - h0Var2.Q < (max * 9) / 10 || !h0Var2.m.compareAndSet(false, true)) {
                            h0Var2.c();
                            return;
                        }
                        h0Var2.n.set(false);
                        h0Var2.Q = nanoTime;
                        WidgetSandboxNative.tick(j3, (nanoTime - h0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        h0 h0Var3 = this.b;
                        synchronized (h0Var3.q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.u) {
                            if (f0Var != null) {
                                f0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i112 = h0Var3.E) != 0 && Math.abs(f0Var.d - i112) > 1) {
                            f0Var.a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject == null || (uVar = h0Var3.J) == null) {
                            return;
                        }
                        if (uVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                int i12 = h.C;
                                int i13 = uVar.q;
                                if (i12 != i13) {
                                    h.C = i13;
                                    h.B++;
                                    h.D = true;
                                    a8.b("widget " + uVar.a + " stopped (" + h.B + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && uVar.g != null && (h0Var = uVar.f) != null) {
                            uVar.g(h0Var);
                            return;
                        } else {
                            if (!uVar.e() || (p71Var = uVar.h) == null) {
                                return;
                            }
                            o71 o71Var = p71Var.a;
                            o71Var.j();
                            o71Var.h();
                            return;
                        }
                    case 2:
                        this.b.c();
                        return;
                    default:
                        h0 h0Var4 = this.b;
                        h0Var4.p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        final int i12 = 3;
        this.O = new Runnable(this) { // from class: org.telegram.utils.twidget.d0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i112;
                switch (i12) {
                    case 0:
                        h0 h0Var2 = this.b;
                        long j3 = h0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                        if (h0Var2.u || j3 == 0 || !h0Var2.D || !h0Var2.n.get() || nanoTime - h0Var2.Q < (max * 9) / 10 || !h0Var2.m.compareAndSet(false, true)) {
                            h0Var2.c();
                            return;
                        }
                        h0Var2.n.set(false);
                        h0Var2.Q = nanoTime;
                        WidgetSandboxNative.tick(j3, (nanoTime - h0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        h0 h0Var3 = this.b;
                        synchronized (h0Var3.q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.u) {
                            if (f0Var != null) {
                                f0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i112 = h0Var3.E) != 0 && Math.abs(f0Var.d - i112) > 1) {
                            f0Var.a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject == null || (uVar = h0Var3.J) == null) {
                            return;
                        }
                        if (uVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                int i122 = h.C;
                                int i13 = uVar.q;
                                if (i122 != i13) {
                                    h.C = i13;
                                    h.B++;
                                    h.D = true;
                                    a8.b("widget " + uVar.a + " stopped (" + h.B + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && uVar.g != null && (h0Var = uVar.f) != null) {
                            uVar.g(h0Var);
                            return;
                        } else {
                            if (!uVar.e() || (p71Var = uVar.h) == null) {
                                return;
                            }
                            o71 o71Var = p71Var.a;
                            o71Var.j();
                            o71Var.h();
                            return;
                        }
                    case 2:
                        this.b.c();
                        return;
                    default:
                        h0 h0Var4 = this.b;
                        h0Var4.p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        this.P = new Choreographer.FrameCallback() { // from class: org.telegram.utils.twidget.c0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j3) {
                h0 h0Var = h0.this;
                h0Var.B = false;
                long j10 = h0Var.t;
                if (h0Var.u || j10 == 0) {
                    return;
                }
                if (h0Var.m.compareAndSet(false, true)) {
                    boolean z9 = h0Var.D && (h0Var.p.getAndSet(false) || h0Var.o.get());
                    boolean z10 = h0Var.D && h0Var.n.getAndSet(false);
                    if (z10) {
                        h0Var.Q = j3;
                    }
                    WidgetSandboxNative.tick(j10, (j3 - h0Var.k) / 1000000.0f, z10, z9, h0Var.l.getAndSet(false));
                }
            }
        };
        final int i13 = 0;
        this.R = new Runnable(this) { // from class: org.telegram.utils.twidget.d0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                f0 f0Var;
                JSONObject jSONObject;
                u uVar;
                p71 p71Var;
                h0 h0Var;
                m h;
                int i112;
                switch (i13) {
                    case 0:
                        h0 h0Var2 = this.b;
                        long j3 = h0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                        if (h0Var2.u || j3 == 0 || !h0Var2.D || !h0Var2.n.get() || nanoTime - h0Var2.Q < (max * 9) / 10 || !h0Var2.m.compareAndSet(false, true)) {
                            h0Var2.c();
                            return;
                        }
                        h0Var2.n.set(false);
                        h0Var2.Q = nanoTime;
                        WidgetSandboxNative.tick(j3, (nanoTime - h0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        h0 h0Var3 = this.b;
                        synchronized (h0Var3.q) {
                            f0Var = h0Var3.G;
                            h0Var3.G = null;
                            jSONObject = h0Var3.H;
                            h0Var3.H = null;
                            h0Var3.I = false;
                        }
                        if (h0Var3.u) {
                            if (f0Var != null) {
                                f0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (f0Var != null && (i112 = h0Var3.E) != 0 && Math.abs(f0Var.d - i112) > 1) {
                            f0Var.a.c();
                            h0Var3.C = false;
                            f0Var = null;
                        }
                        if (f0Var != null) {
                            h0Var3.F = f0Var;
                            h0Var3.C = false;
                            u uVar2 = h0Var3.J;
                            if (uVar2 != null) {
                                uVar2.g(h0Var3);
                            }
                        }
                        if (jSONObject == null || (uVar = h0Var3.J) == null) {
                            return;
                        }
                        if (uVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(uVar)) != null) {
                                int i122 = h.C;
                                int i132 = uVar.q;
                                if (i122 != i132) {
                                    h.C = i132;
                                    h.B++;
                                    h.D = true;
                                    a8.b("widget " + uVar.a + " stopped (" + h.B + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && uVar.g != null && (h0Var = uVar.f) != null) {
                            uVar.g(h0Var);
                            return;
                        } else {
                            if (!uVar.e() || (p71Var = uVar.h) == null) {
                                return;
                            }
                            o71 o71Var = p71Var.a;
                            o71Var.j();
                            o71Var.h();
                            return;
                        }
                    case 2:
                        this.b.c();
                        return;
                    default:
                        h0 h0Var4 = this.b;
                        h0Var4.p.set(true);
                        h0Var4.c();
                        return;
                }
            }
        };
        if (i7 < 1 || i7 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.c = context.getApplicationContext();
        this.d = str;
        this.z = str2;
        str2.contains("\"dark\"");
        this.e = i7;
        this.f = str3 == null ? "en-US" : str3;
        this.g = str4 == null ? "{}" : str4;
        this.j = context.getResources().getDisplayMetrics().density;
    }

    public static boolean a() {
        for (int i7 = 0; i7 < 4; i7++) {
            if (p10.i(i7).p() && ((org.telegram.messenger.h0) qp.s1(i7).x7.o0.b).c) {
                return true;
            }
        }
        return false;
    }

    public final void b(g gVar, g0[] g0VarArr, double d, int i7, int i10, float f10, float f11, int i11, int i12, int i13, m0 m0Var) {
        Object obj;
        boolean z9 = this.w;
        Object obj2 = this.q;
        synchronized (obj2) {
            try {
                try {
                    if (this.u) {
                        gVar.c();
                        return;
                    }
                    f0 f0Var = this.G;
                    if (f0Var != null) {
                        f0Var.a.c();
                    }
                    try {
                        this.G = new f0(gVar, g0VarArr, d, i7, i10, f10, f11, i11, i12, i13, m0Var, z9, this.y);
                        if (!this.I) {
                            this.I = true;
                            this.a.post(this.M);
                        }
                        this.r = i10;
                        this.s = true;
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
        if (this.u || this.t == 0 || this.B || this.m.get()) {
            return;
        }
        if (!this.l.get()) {
            if (!this.D) {
                return;
            }
            if (!this.n.get() && !this.o.get() && !this.p.get()) {
                return;
            }
        }
        this.B = true;
        Choreographer.getInstance().postFrameCallback(this.P);
    }

    public final void d(String str) {
        if (this.u || str == null || str.equals(this.i)) {
            return;
        }
        this.i = str;
        long j3 = this.t;
        if (j3 != 0) {
            WidgetSandboxNative.safeArea(j3, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void e(boolean z9) {
        if (this.u || this.D == z9) {
            return;
        }
        this.D = z9;
        long j3 = this.t;
        if (j3 != 0) {
            WidgetSandboxNative.visible(j3, z9);
        }
        if (z9) {
            c();
        }
    }

    public final void f(final int i7) {
        final long j3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (a()) {
            throw new IllegalStateException("Widgets are disabled by the app config");
        }
        if (this.E == 0) {
            this.E = i7;
        }
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                String absolutePath = z.a(this.c).getAbsolutePath();
                if (this.u) {
                    Trace.endSection();
                    return;
                }
                final String str = this.i;
                String str2 = this.h;
                if (str != null) {
                    str2 = new JSONObject(str2).put("contentSafeArea", new JSONObject(str)).toString();
                }
                Charset charset = StandardCharsets.UTF_8;
                byte[] bytes = absolutePath.getBytes(charset);
                byte[] bytes2 = this.d.getBytes(charset);
                byte[] bytes3 = this.z.getBytes(charset);
                float f10 = this.j;
                j3 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i7 / f10, f10, this.e, this.f.getBytes(charset), this.g.getBytes(charset), str2.getBytes(charset), hd.M0(2131742868, null).getBytes(charset), this.D, this.b);
                try {
                    final String str3 = this.z;
                    this.a.post(new Runnable() { // from class: org.telegram.utils.twidget.b0
                        @Override // java.lang.Runnable
                        public final void run() {
                            h0 h0Var = h0.this;
                            long j10 = j3;
                            int i10 = i7;
                            String str4 = str3;
                            String str5 = str;
                            if (h0Var.u) {
                                z.a.execute(new a0(j10));
                                return;
                            }
                            h0Var.t = j10;
                            int i11 = h0Var.E;
                            if (i11 != i10 && i11 > 0) {
                                WidgetSandboxNative.width(j10, i11 / h0Var.j);
                            }
                            if (!h0Var.z.equals(str4)) {
                                WidgetSandboxNative.theme(j10, h0Var.z.getBytes(StandardCharsets.UTF_8));
                            }
                            if (h0Var.i != null && !h0Var.i.equals(str5)) {
                                WidgetSandboxNative.safeArea(j10, h0Var.i.getBytes(StandardCharsets.UTF_8));
                            }
                            h0Var.A = true;
                            WidgetSandboxNative.visible(j10, h0Var.D);
                            h0Var.c();
                        }
                    });
                    Trace.endSection();
                } catch (Exception e10) {
                    e = e10;
                    if (j3 != 0) {
                        z.a.execute(new a0(j3));
                    }
                    this.a.post(new org.telegram.ui.web.w(12, this, e));
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
