package org.telegram.utils.twidget;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.messenger.vr;
import org.telegram.messenger.wq;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;
import org.telegram.ui.ah0;
import org.telegram.ui.n31;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class y0 {
    public boolean A;
    public int B;
    public long C;
    public final String a;
    public final String b;
    public final Context c;
    public sa.d e;
    public l1 f;
    public j1 g;
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

    public y0(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a() {
        final l1 l1Var;
        if (this.o || l1.a()) {
            return;
        }
        this.o = true;
        l1 l1Var2 = this.f;
        if (l1Var2 != null) {
            l1Var2.C = true;
            return;
        }
        String str = this.s;
        if (str == null && this.t == null && this.u == null) {
            Context context = this.c;
            String str2 = this.b;
            boolean z10 = this.m;
            int i7 = this.d;
            int[] iArr = m1.a;
            l1Var = new l1(context, str2, a8.p0.s(new StringBuilder("{\"colorScheme\":\""), z10 ? "dark" : "light", "\"}"), i7, null, null);
        } else {
            Context context2 = this.c;
            String str3 = this.b;
            if (str == null) {
                boolean z11 = this.m;
                int[] iArr2 = m1.a;
                str = a8.p0.s(new StringBuilder("{\"colorScheme\":\""), z11 ? "dark" : "light", "\"}");
            }
            l1Var = new l1(context2, str3, str, this.d, this.t, this.u);
        }
        StringBuilder sb2 = new StringBuilder("{\"data\":");
        sb2.append(this.v);
        sb2.append(",\"context\":");
        String s5 = a8.p0.s(sb2, this.w, "}");
        if (s5 != null) {
            l1Var.j = s5;
            try {
                l1Var.d = new d0(new JSONObject(s5).optJSONObject("context"));
            } catch (Exception unused) {
                l1Var.d = new d0(null);
            }
        }
        l1Var.e(this.x);
        l1Var.L = this;
        l1Var.M = this;
        l1Var.f(this.n && !this.p);
        this.f = l1Var;
        this.q++;
        final int i10 = this.j;
        d1.a.execute(new Runnable() { // from class: org.telegram.utils.twidget.x0
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    l1.this.g(i10);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        l1 l1Var = this.f;
        if (l1Var != null) {
            d0 d0Var = l1Var.d;
            boolean z10 = i7 == 0;
            synchronized (d0Var) {
                try {
                    if (d0Var.j && z10) {
                        d0Var.h = SystemClock.elapsedRealtime();
                    }
                    d0Var.j = false;
                    d0Var.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = l1Var.v;
            if (l1Var.w || j10 == 0) {
                return;
            }
            u0 u0Var = l1Var.c;
            byte[] bytes = str == null ? null : str.getBytes(StandardCharsets.UTF_8);
            r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j10));
            b h12 = r0Var != null ? r0Var.h1() : null;
            if (h12 == null) {
                return;
            }
            try {
                h12.u(r0Var.d, j3, i7, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void c() {
        int i7;
        l1 l1Var = this.f;
        if (l1Var == null || l1Var.w || l1Var.v == 0 || l1Var.E) {
            return;
        }
        j1 j1Var = l1Var.H;
        if (j1Var == null || (((i7 = l1Var.G) != 0 && Math.abs(j1Var.d - i7) > 1) || !j1Var.a())) {
            l1Var.E = true;
            r0 r0Var = (r0) l1Var.c.e.get(Long.valueOf(l1Var.v));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.N0(r0Var.d);
            } catch (RemoteException unused) {
            }
        }
    }

    public final j1 d() {
        l1 l1Var = this.f;
        j1 j1Var = l1Var == null ? null : l1Var.H;
        if (j1Var != null && (this.g == null || l1Var.x)) {
            return j1Var;
        }
        j1 j1Var2 = this.g;
        return (j1Var2 == null || Math.abs(j1Var2.d - this.j) > 1) ? j1Var != null ? j1Var : this.g : this.g;
    }

    public final void e(float f10, float f11, int i7, int i10) {
        l1 l1Var = this.f;
        if (l1Var != null) {
            long j3 = l1Var.v;
            if (l1Var.w || j3 == 0) {
                return;
            }
            r0 r0Var = (r0) l1Var.c.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.Z0(r0Var.d, i7, f10, f11, i10);
            } catch (RemoteException unused) {
            }
        }
    }

    public final boolean f() {
        l1 l1Var;
        j1 j1Var;
        if (this.r == this.q || (l1Var = this.f) == null || (j1Var = l1Var.H) == null) {
            return false;
        }
        if (!j1Var.g && !l1Var.z) {
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
    public final void h(l1 l1Var) {
        j1 j1Var;
        k0 h;
        q71 q71Var;
        if (l1Var == this.f && (j1Var = l1Var.H) != null) {
            if (this.g == null || l1Var.x) {
                this.g = null;
                this.k = j1Var.d;
                boolean z10 = j1Var.h;
                Object[] objArr = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, j1Var.e);
                boolean z11 = max != this.i;
                this.i = max;
                q71 q71Var2 = this.h;
                if (q71Var2 != null) {
                    p71 p71Var = q71Var2.a;
                    if (z11) {
                        p71Var.j();
                    }
                    p71Var.h();
                }
                if ((z11 || objArr != false) && this.e != null && (h = n0.h(this)) != null && this.i > 0) {
                    int f10 = n0.f(this.k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.i)));
                    boolean z12 = this.l;
                    if (f10 > 0 && h.f == 0 && !h.k && n0.l(h.a()).a(f10, max2, z12)) {
                        vr a02 = vr.a0(h.b);
                        a02.a.c(new wq(a02, h.c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    hk0 hk0Var = h.u;
                    if (hk0Var != null) {
                        hk0Var.p0("frame off screen");
                    }
                }
                if (!f() || z11 || (q71Var = this.h) == null) {
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
                y0 y0Var = k0Var.t;
                try {
                    str2 = hd.E0().y.toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                y0Var.t = str2;
                y0Var.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            n0.d.put(a10, h);
            ah0 ah0Var = n0.e;
            org.telegram.messenger.g0.r(ah0Var);
            org.telegram.messenger.g0.i3(ah0Var, 1000L);
        }
    }

    public final void j(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        l1 l1Var = this.f;
        if (l1Var != null) {
            long j3 = l1Var.v;
            if (l1Var.w || j3 == 0) {
                return;
            }
            u0 u0Var = l1Var.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.S(r0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final synchronized void k(float f10, float f11, boolean z10) {
        boolean z11 = f10 > 0.0f;
        if (!z10) {
            if (this.y && z11 == this.z) {
                return;
            }
        }
        this.y = z10;
        this.z = z11;
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
        l1 l1Var = this.f;
        if (l1Var == null || l1Var.w || str.equals(l1Var.B)) {
            return;
        }
        l1Var.B = str;
        str.contains("\"dark\"");
        long j3 = l1Var.v;
        if (j3 != 0) {
            u0 u0Var = l1Var.c;
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.f0(r0Var.d, bytes);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void m(boolean z10) {
        this.n = z10;
        l1 l1Var = this.f;
        if (l1Var != null) {
            l1Var.f(z10 && !this.p);
        }
    }

    public final void n(int i7) {
        if (i7 <= 0 || i7 == this.j) {
            return;
        }
        this.j = i7;
        l1 l1Var = this.f;
        if (l1Var == null || i7 <= 0 || i7 == l1Var.G || l1Var.w) {
            return;
        }
        l1Var.G = i7;
        long j3 = l1Var.v;
        if (j3 != 0) {
            u0 u0Var = l1Var.c;
            float f10 = i7 / l1Var.l;
            r0 r0Var = (r0) u0Var.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.H0(r0Var.d, f10);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        l1 l1Var = this.f;
        if (l1Var != null) {
            if (i7 == 0 && l1Var.F) {
                d0 d0Var = l1Var.d;
                synchronized (d0Var) {
                    d0Var.d++;
                    d0Var.f = SystemClock.elapsedRealtime();
                }
            }
            long j3 = l1Var.v;
            if (l1Var.w || j3 == 0) {
                return;
            }
            r0 r0Var = (r0) l1Var.c.e.get(Long.valueOf(j3));
            b h12 = r0Var == null ? null : r0Var.h1();
            if (h12 == null) {
                return;
            }
            try {
                h12.k0(r0Var.d, i7, f10, f11, i10, z10, z11, i11, i12);
            } catch (RemoteException unused) {
            }
        }
    }

    public final void p() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        j1 d = d();
        if (d != null) {
            this.g = d;
        }
        l1 l1Var = this.f;
        if (!l1Var.w) {
            l1Var.w = true;
            l1Var.L = null;
            l1Var.a.removeCallbacks(l1Var.P);
            l1Var.a.removeCallbacks(l1Var.O);
            l1Var.a.removeCallbacks(l1Var.Q);
            if (l1Var.D) {
                Choreographer.getInstance().removeFrameCallback(l1Var.R);
            }
            l1Var.D = false;
            synchronized (l1Var.s) {
                try {
                    j1 j1Var = l1Var.I;
                    if (j1Var != null) {
                        j1Var.a.b();
                    }
                    l1Var.I = null;
                    l1Var.J = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j3 = l1Var.v;
            l1Var.v = 0L;
            if (j3 != 0) {
                d1.a.execute(new n31(l1Var, j3, 2));
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
