package org.telegram.utils.twidget;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.br;
import org.telegram.messenger.id;
import org.telegram.messenger.yr;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.p61;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class v0 {
    public boolean A;
    public int B;
    public long C;
    public final String a;
    public final String b;
    public final Context c;
    public nb.a e;
    public i1 f;
    public g1 g;
    public q71 h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public String s;
    public String t;
    public String u;
    public volatile String x;
    public boolean y;
    public boolean z;
    public String v = "{}";
    public String w = "{}";
    public boolean m = false;
    public final int d = 1;

    public v0(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a() {
        final i1 i1Var;
        if (this.o || i1.a()) {
            return;
        }
        this.o = true;
        i1 i1Var2 = this.f;
        if (i1Var2 != null) {
            i1Var2.C = true;
            return;
        }
        String str = this.s;
        if (str == null && this.t == null && this.u == null) {
            Context context = this.c;
            String str2 = this.b;
            boolean z9 = this.m;
            int i7 = this.d;
            int[] iArr = j1.a;
            i1Var = new i1(context, str2, a8.p0.s(new StringBuilder("{\"colorScheme\":\""), z9 ? "dark" : "light", "\"}"), i7, null, null);
        } else {
            Context context2 = this.c;
            String str3 = this.b;
            if (str == null) {
                boolean z10 = this.m;
                int[] iArr2 = j1.a;
                str = a8.p0.s(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}");
            }
            i1Var = new i1(context2, str3, str, this.d, this.t, this.u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(this.v);
        sb2.append(",\"context\":");
        String s5 = a8.p0.s(sb2, this.w, "}");
        if (s5 != null) {
            i1Var.j = s5;
            try {
                i1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                i1Var.d = new d0(null);
            }
        }
        i1Var.e(this.x);
        i1Var.L = this;
        i1Var.M = this;
        i1Var.f(this.n && !this.p);
        this.f = i1Var;
        this.q++;
        final int i10 = this.j;
        a1.a.execute(new Runnable() { // from class: org.telegram.utils.twidget.u0
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    i1.this.g(i10);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        i1 i1Var = this.f;
        if (i1Var != null) {
            d0 d0Var = i1Var.d;
            boolean z9 = i7 == 0;
            synchronized (d0Var) {
                try {
                    if (d0Var.j && z9) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.j = false;
                    d0Var.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = i1Var.v;
            if (i1Var.w || j10 == 0) {
                return;
            }
            r0 r0Var = i1Var.c;
            byte[] bytes = str == null ? null : str.getBytes(StandardCharsets.UTF_8);
            o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j10));
            b h12 = o0Var != null ? o0Var.h1() : null;
            if (h12 == null) {
                return;
            }
            try {
                h12.u(o0Var.d, j3, i7, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c() {
        int i7;
        i1 i1Var = this.f;
        if (i1Var == null || i1Var.w || i1Var.v == 0 || i1Var.E) {
            return;
        }
        g1 g1Var = i1Var.H;
        if (g1Var == null || (((i7 = i1Var.G) != 0 && Math.abs(g1Var.d - i7) > 1) || !g1Var.a())) {
            i1Var.E = true;
            o0 o0Var = (o0) i1Var.c.e.get(Long.valueOf(i1Var.v));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.M0(o0Var.d);
            } catch (RemoteException unused) {
            }
        }
    }

    public final g1 d() {
        i1 i1Var = this.f;
        g1 g1Var = i1Var == null ? null : i1Var.H;
        if (g1Var != null && (this.g == null || i1Var.x)) {
            return g1Var;
        }
        g1 g1Var2 = this.g;
        return (g1Var2 == null || Math.abs(g1Var2.d - this.j) > 1) ? g1Var != null ? g1Var : this.g : this.g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        i1 i1Var = this.f;
        if (i1Var != null) {
            long j3 = i1Var.v;
            if (i1Var.w || j3 == 0) {
                return;
            }
            o0 o0Var = (o0) i1Var.c.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.Y0(o0Var.d, i7, f10, f11, i10);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean f() {
        i1 i1Var;
        g1 g1Var;
        if (this.r == this.q || (i1Var = this.f) == null || (g1Var = i1Var.H) == null) {
            return false;
        }
        if (!g1Var.g && !i1Var.z) {
            return false;
        }
        this.r = this.q;
        if (this.e == null) {
            return true;
        }
        n0.b();
        k0 h = n0.h(this);
        if (h == null) {
            return true;
        }
        n0.a(h);
        return true;
    }

    public final void g(String str) {
        if (this.e != null) {
            a8.d("widget " + this.a + ": " + str);
        }
        q71 q71Var = this.h;
        if (q71Var != null) {
            q71Var.a.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(i1 i1Var) {
        g1 g1Var;
        k0 h;
        q71 q71Var;
        if (i1Var == this.f && (g1Var = i1Var.H) != null) {
            if (this.g == null || i1Var.x) {
                this.g = null;
                this.k = g1Var.d;
                boolean z9 = g1Var.h;
                Object[] objArr = z9 != this.l;
                this.l = z9;
                int max = Math.max(1, g1Var.e);
                boolean z10 = max != this.i;
                this.i = max;
                q71 q71Var2 = this.h;
                if (q71Var2 != null) {
                    p71 p71Var = q71Var2.a;
                    if (z10) {
                        p71Var.j();
                    }
                    p71Var.h();
                }
                if ((z10 || objArr != false) && this.e != null && (h = n0.h(this)) != null && this.i > 0) {
                    int f10 = n0.f(this.k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.i)));
                    boolean z11 = this.l;
                    if (f10 > 0 && h.f == 0 && !h.k && n0.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.b);
                        a02.a.c(new br(a02, h.c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    dk0 dk0Var = h.u;
                    if (dk0Var != null) {
                        dk0Var.p0("frame off screen");
                    }
                }
                if (!f() || z10 || (q71Var = this.h) == null) {
                    return;
                }
                p71 p71Var2 = q71Var.a;
                p71Var2.j();
                p71Var2.h();
            }
        }
    }

    public final void i(String str, JSONObject jSONObject) {
        k0 h;
        String str2;
        if (this.e == null || (h = n0.h(this)) == null) {
            return;
        }
        String a10 = h.a();
        JSONObject jSONObject2 = (JSONObject) n0.c.get(a10);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put(str, jSONObject);
        } catch (Exception unused) {
        }
        n0.c.put(a10, jSONObject2);
        for (k0 k0Var : n0.a.values()) {
            if (k0Var.t != null && a10.equals(k0Var.a())) {
                v0 v0Var = k0Var.t;
                try {
                    str2 = id.E0().y.toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                v0Var.t = str2;
                v0Var.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            n0.d.put(a10, h);
            p61 p61Var = n0.e;
            org.telegram.messenger.g0.r(p61Var);
            org.telegram.messenger.g0.i3(p61Var, 1000L);
        }
    }

    public final void j(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        i1 i1Var = this.f;
        if (i1Var != null) {
            long j3 = i1Var.v;
            if (i1Var.w || j3 == 0) {
                return;
            }
            r0 r0Var = i1Var.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.R(o0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z9) {
        boolean z10 = f10 > 0.0f;
        if (!z9) {
            if (this.y && z10 == this.z) {
                return;
            }
        }
        this.y = z9;
        this.z = z10;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f10), Float.valueOf(f11));
        if (format.equals(this.x)) {
            return;
        }
        this.x = format;
        org.telegram.messenger.g0.h3(new j0(this, 3));
    }

    public final void l(String str) {
        if (str == null || str.equals(this.s)) {
            return;
        }
        this.s = str;
        this.m = str.contains("\"dark\"");
        i1 i1Var = this.f;
        if (i1Var == null || i1Var.w || str.equals(i1Var.B)) {
            return;
        }
        i1Var.B = str;
        str.contains("\"dark\"");
        long j3 = i1Var.v;
        if (j3 != 0) {
            r0 r0Var = i1Var.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.e0(o0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void m(boolean z9) {
        this.n = z9;
        i1 i1Var = this.f;
        if (i1Var != null) {
            i1Var.f(z9 && !this.p);
        }
    }

    public final void n(int i7) {
        if (i7 <= 0 || i7 == this.j) {
            return;
        }
        this.j = i7;
        i1 i1Var = this.f;
        if (i1Var == null || i7 <= 0 || i7 == i1Var.G || i1Var.w) {
            return;
        }
        i1Var.G = i7;
        long j3 = i1Var.v;
        if (j3 != 0) {
            r0 r0Var = i1Var.c;
            float f10 = i7 / i1Var.l;
            o0 o0Var = (o0) r0Var.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.G0(o0Var.d, f10);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        i1 i1Var = this.f;
        if (i1Var != null) {
            if (i7 == 0 && i1Var.F) {
                d0 d0Var = i1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = i1Var.v;
            if (i1Var.w || j3 == 0) {
                return;
            }
            o0 o0Var = (o0) i1Var.c.e.get(Long.valueOf(j3));
            b h12 = o0Var == null ? null : o0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.j0(o0Var.d, i7, f10, f11, i10, z9, z10, i11, i12);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void p() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        g1 d = d();
        if (d != null) {
            this.g = d;
        }
        i1 i1Var = this.f;
        if (!i1Var.w) {
            i1Var.w = true;
            i1Var.L = null;
            i1Var.a.removeCallbacks(i1Var.P);
            i1Var.a.removeCallbacks(i1Var.O);
            i1Var.a.removeCallbacks(i1Var.Q);
            if (i1Var.D) {
                Choreographer.getInstance().removeFrameCallback(i1Var.R);
            }
            i1Var.D = false;
            synchronized (i1Var.s) {
                try {
                    g1 g1Var = i1Var.I;
                    if (g1Var != null) {
                        g1Var.a.b();
                    }
                    i1Var.I = null;
                    i1Var.J = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j3 = i1Var.v;
            i1Var.v = 0L;
            if (j3 != 0) {
                a1.a.execute(new q31(i1Var, j3, 2));
            }
        }
        this.f = null;
        if (this.A) {
            this.A = false;
            if (this.e != null) {
                n0.E();
            }
        }
    }
}
