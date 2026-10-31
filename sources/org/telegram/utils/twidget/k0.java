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
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.web.v1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class k0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public int E;
    public i0 F;
    public i0 G;
    public JSONObject H;
    public boolean I;
    public w J;
    public float[] K;
    public w L;
    public String M;
    public final g0 N;
    public final g0 O;
    public final g0 P;
    public final f0 Q;
    public long R;
    public final g0 S;
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

    /* JADX WARN: Type inference failed for: r1v10, types: [org.telegram.utils.twidget.g0] */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.utils.twidget.g0] */
    /* JADX WARN: Type inference failed for: r1v12, types: [org.telegram.utils.twidget.f0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [org.telegram.utils.twidget.g0] */
    /* JADX WARN: Type inference failed for: r1v9, types: [org.telegram.utils.twidget.g0] */
    public k0(Context context, String str, String str2, int i10, String str3, String str4) {
        new JSONObject();
        final int i11 = 1;
        this.N = new Runnable(this) { // from class: org.telegram.utils.twidget.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i12;
                switch (i11) {
                    case 0:
                        k0 k0Var2 = this.b;
                        long j10 = k0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.r));
                        if (k0Var2.u || j10 == 0 || !k0Var2.D || !k0Var2.n.get() || nanoTime - k0Var2.R < (max * 9) / 10 || !k0Var2.m.compareAndSet(false, true)) {
                            k0Var2.b();
                            return;
                        }
                        k0Var2.n.set(false);
                        k0Var2.R = nanoTime;
                        WidgetSandboxNative.tick(j10, (nanoTime - k0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        k0 k0Var3 = this.b;
                        synchronized (k0Var3.q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.u) {
                            if (i0Var != null) {
                                i0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i12 = k0Var3.E) != 0 && Math.abs(i0Var.d - i12) > 1) {
                            i0Var.a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject == null || (wVar = k0Var3.J) == null) {
                            return;
                        }
                        if (wVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                int i13 = h.D;
                                int i14 = wVar.q;
                                if (i13 != i14) {
                                    h.D = i14;
                                    h.C++;
                                    h.E = true;
                                    f8.b("widget " + wVar.a + " stopped (" + h.C + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && wVar.g != null && (k0Var = wVar.f) != null) {
                            wVar.g(k0Var);
                            return;
                        } else {
                            if (!wVar.e() || (q81Var = wVar.h) == null) {
                                return;
                            }
                            p81 p81Var = q81Var.a;
                            p81Var.j();
                            p81Var.h();
                            return;
                        }
                    case 2:
                        this.b.b();
                        return;
                    default:
                        k0 k0Var4 = this.b;
                        k0Var4.p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        final int i12 = 2;
        this.O = new Runnable(this) { // from class: org.telegram.utils.twidget.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i122;
                switch (i12) {
                    case 0:
                        k0 k0Var2 = this.b;
                        long j10 = k0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.r));
                        if (k0Var2.u || j10 == 0 || !k0Var2.D || !k0Var2.n.get() || nanoTime - k0Var2.R < (max * 9) / 10 || !k0Var2.m.compareAndSet(false, true)) {
                            k0Var2.b();
                            return;
                        }
                        k0Var2.n.set(false);
                        k0Var2.R = nanoTime;
                        WidgetSandboxNative.tick(j10, (nanoTime - k0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        k0 k0Var3 = this.b;
                        synchronized (k0Var3.q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.u) {
                            if (i0Var != null) {
                                i0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i122 = k0Var3.E) != 0 && Math.abs(i0Var.d - i122) > 1) {
                            i0Var.a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject == null || (wVar = k0Var3.J) == null) {
                            return;
                        }
                        if (wVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                int i13 = h.D;
                                int i14 = wVar.q;
                                if (i13 != i14) {
                                    h.D = i14;
                                    h.C++;
                                    h.E = true;
                                    f8.b("widget " + wVar.a + " stopped (" + h.C + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && wVar.g != null && (k0Var = wVar.f) != null) {
                            wVar.g(k0Var);
                            return;
                        } else {
                            if (!wVar.e() || (q81Var = wVar.h) == null) {
                                return;
                            }
                            p81 p81Var = q81Var.a;
                            p81Var.j();
                            p81Var.h();
                            return;
                        }
                    case 2:
                        this.b.b();
                        return;
                    default:
                        k0 k0Var4 = this.b;
                        k0Var4.p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        final int i13 = 3;
        this.P = new Runnable(this) { // from class: org.telegram.utils.twidget.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i122;
                switch (i13) {
                    case 0:
                        k0 k0Var2 = this.b;
                        long j10 = k0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.r));
                        if (k0Var2.u || j10 == 0 || !k0Var2.D || !k0Var2.n.get() || nanoTime - k0Var2.R < (max * 9) / 10 || !k0Var2.m.compareAndSet(false, true)) {
                            k0Var2.b();
                            return;
                        }
                        k0Var2.n.set(false);
                        k0Var2.R = nanoTime;
                        WidgetSandboxNative.tick(j10, (nanoTime - k0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        k0 k0Var3 = this.b;
                        synchronized (k0Var3.q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.u) {
                            if (i0Var != null) {
                                i0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i122 = k0Var3.E) != 0 && Math.abs(i0Var.d - i122) > 1) {
                            i0Var.a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject == null || (wVar = k0Var3.J) == null) {
                            return;
                        }
                        if (wVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                int i132 = h.D;
                                int i14 = wVar.q;
                                if (i132 != i14) {
                                    h.D = i14;
                                    h.C++;
                                    h.E = true;
                                    f8.b("widget " + wVar.a + " stopped (" + h.C + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && wVar.g != null && (k0Var = wVar.f) != null) {
                            wVar.g(k0Var);
                            return;
                        } else {
                            if (!wVar.e() || (q81Var = wVar.h) == null) {
                                return;
                            }
                            p81 p81Var = q81Var.a;
                            p81Var.j();
                            p81Var.h();
                            return;
                        }
                    case 2:
                        this.b.b();
                        return;
                    default:
                        k0 k0Var4 = this.b;
                        k0Var4.p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        this.Q = new Choreographer.FrameCallback() { // from class: org.telegram.utils.twidget.f0
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j10) {
                k0 k0Var = k0.this;
                k0Var.B = false;
                long j11 = k0Var.t;
                if (k0Var.u || j11 == 0) {
                    return;
                }
                if (k0Var.m.compareAndSet(false, true)) {
                    boolean z10 = k0Var.D && (k0Var.p.getAndSet(false) || k0Var.o.get());
                    boolean z11 = k0Var.D && k0Var.n.getAndSet(false);
                    if (z11) {
                        k0Var.R = j10;
                    }
                    WidgetSandboxNative.tick(j11, (j10 - k0Var.k) / 1000000.0f, z11, z10, k0Var.l.getAndSet(false));
                }
            }
        };
        final int i14 = 0;
        this.S = new Runnable(this) { // from class: org.telegram.utils.twidget.g0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i0 i0Var;
                JSONObject jSONObject;
                w wVar;
                q81 q81Var;
                k0 k0Var;
                m h;
                int i122;
                switch (i14) {
                    case 0:
                        k0 k0Var2 = this.b;
                        long j10 = k0Var2.t;
                        long nanoTime = System.nanoTime();
                        long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.i0.r));
                        if (k0Var2.u || j10 == 0 || !k0Var2.D || !k0Var2.n.get() || nanoTime - k0Var2.R < (max * 9) / 10 || !k0Var2.m.compareAndSet(false, true)) {
                            k0Var2.b();
                            return;
                        }
                        k0Var2.n.set(false);
                        k0Var2.R = nanoTime;
                        WidgetSandboxNative.tick(j10, (nanoTime - k0Var2.k) / 1000000.0f, true, false, false);
                        return;
                    case 1:
                        k0 k0Var3 = this.b;
                        synchronized (k0Var3.q) {
                            i0Var = k0Var3.G;
                            k0Var3.G = null;
                            jSONObject = k0Var3.H;
                            k0Var3.H = null;
                            k0Var3.I = false;
                        }
                        if (k0Var3.u) {
                            if (i0Var != null) {
                                i0Var.a.c();
                                return;
                            }
                            return;
                        }
                        if (i0Var != null && (i122 = k0Var3.E) != 0 && Math.abs(i0Var.d - i122) > 1) {
                            i0Var.a.c();
                            k0Var3.C = false;
                            i0Var = null;
                        }
                        if (i0Var != null) {
                            k0Var3.F = i0Var;
                            k0Var3.C = false;
                            w wVar2 = k0Var3.J;
                            if (wVar2 != null) {
                                wVar2.g(k0Var3);
                            }
                        }
                        if (jSONObject == null || (wVar = k0Var3.J) == null) {
                            return;
                        }
                        if (wVar.e != null) {
                            String optString = jSONObject.optString("dead");
                            if (!TextUtils.isEmpty(optString) && (h = p.h(wVar)) != null) {
                                int i132 = h.D;
                                int i142 = wVar.q;
                                if (i132 != i142) {
                                    h.D = i142;
                                    h.C++;
                                    h.E = true;
                                    f8.b("widget " + wVar.a + " stopped (" + h.C + "): " + optString);
                                    p.a(h);
                                    p.b();
                                }
                            }
                        }
                        if (jSONObject.optBoolean("loaded") && wVar.g != null && (k0Var = wVar.f) != null) {
                            wVar.g(k0Var);
                            return;
                        } else {
                            if (!wVar.e() || (q81Var = wVar.h) == null) {
                                return;
                            }
                            p81 p81Var = q81Var.a;
                            p81Var.j();
                            p81Var.h();
                            return;
                        }
                    case 2:
                        this.b.b();
                        return;
                    default:
                        k0 k0Var4 = this.b;
                        k0Var4.p.set(true);
                        k0Var4.b();
                        return;
                }
            }
        };
        if (i10 < 1 || i10 > 4) {
            throw new IllegalArgumentException("CPU multiplier must be 1..4");
        }
        this.c = context.getApplicationContext();
        this.d = str;
        this.z = str2;
        str2.contains("\"dark\"");
        this.e = i10;
        this.f = str3 == null ? "en-US" : str3;
        this.g = str4 == null ? "{}" : str4;
        this.j = context.getResources().getDisplayMetrics().density;
    }

    public final void a(g gVar, j0[] j0VarArr, double d, int i10, int i11, float f7, float f10, int i12, int i13, int i14, q0 q0Var) {
        Object obj;
        boolean z10 = this.w;
        Object obj2 = this.q;
        synchronized (obj2) {
            try {
                try {
                    if (this.u) {
                        gVar.c();
                        return;
                    }
                    i0 i0Var = this.G;
                    if (i0Var != null) {
                        i0Var.a.c();
                    }
                    try {
                        this.G = new i0(gVar, j0VarArr, d, i10, i11, f7, f10, i12, i13, i14, q0Var, z10, this.y);
                        if (!this.I) {
                            this.I = true;
                            this.a.post(this.N);
                        }
                        this.r = i11;
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

    public final void b() {
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
        Choreographer.getInstance().postFrameCallback(this.Q);
    }

    public final void c(String str) {
        if (this.u || str == null || str.equals(this.i)) {
            return;
        }
        this.i = str;
        long j10 = this.t;
        if (j10 != 0) {
            WidgetSandboxNative.safeArea(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void d(boolean z10) {
        if (this.u || this.D == z10) {
            return;
        }
        this.D = z10;
        long j10 = this.t;
        if (j10 != 0) {
            WidgetSandboxNative.visible(j10, z10);
        }
        if (z10) {
            b();
        }
    }

    public final void e(final int i10) {
        final long j10;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Start WidgetSandboxSession off UI");
        }
        if (this.E == 0) {
            this.E = i10;
        }
        Trace.beginSection("WidgetSandbox:Create");
        try {
            try {
                String absolutePath = b0.a(this.c).getAbsolutePath();
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
                float f7 = this.j;
                j10 = WidgetSandboxNative.create(bytes, bytes2, bytes3, i10 / f7, f7, this.e, this.f.getBytes(charset), this.g.getBytes(charset), str2.getBytes(charset), cd.L0(2131742892, null).getBytes(charset), this.D, this.b);
                try {
                    final String str3 = this.z;
                    this.a.post(new Runnable() { // from class: org.telegram.utils.twidget.e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            k0 k0Var = k0.this;
                            long j11 = j10;
                            int i11 = i10;
                            String str4 = str3;
                            String str5 = str;
                            if (k0Var.u) {
                                b0.a.execute(new d0(j11));
                                return;
                            }
                            k0Var.t = j11;
                            int i12 = k0Var.E;
                            if (i12 != i11 && i12 > 0) {
                                WidgetSandboxNative.width(j11, i12 / k0Var.j);
                            }
                            if (!k0Var.z.equals(str4)) {
                                WidgetSandboxNative.theme(j11, k0Var.z.getBytes(StandardCharsets.UTF_8));
                            }
                            if (k0Var.i != null && !k0Var.i.equals(str5)) {
                                WidgetSandboxNative.safeArea(j11, k0Var.i.getBytes(StandardCharsets.UTF_8));
                            }
                            k0Var.A = true;
                            WidgetSandboxNative.visible(j11, k0Var.D);
                            k0Var.b();
                        }
                    });
                    Trace.endSection();
                } catch (Exception e) {
                    e = e;
                    if (j10 != 0) {
                        b0.a.execute(new d0(j10));
                    }
                    this.a.post(new v1(5, this, e));
                    throw e;
                }
            } catch (Exception e7) {
                e = e7;
                j10 = 0;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }
}
