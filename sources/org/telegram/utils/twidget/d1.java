package org.telegram.utils.twidget;

import android.content.Context;
import android.os.SystemClock;
import android.view.Choreographer;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.tr;
import org.telegram.messenger.wq;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.d81;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.qx0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class d1 {
    public boolean A;
    public long B;
    public int C;
    public long D;
    public final String a;
    public final String b;
    public final Context c;
    public sa.d e;
    public p1 f;
    public n1 g;
    public d81 h;
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

    public d1(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a() {
        final p1 p1Var;
        if (this.o || p1.a()) {
            return;
        }
        this.o = true;
        p1 p1Var2 = this.f;
        if (p1Var2 != null) {
            p1Var2.I = true;
            return;
        }
        String str = this.s;
        if (str == null && this.t == null && this.u == null) {
            p1Var = new p1(this.c, this.b, q1.d(this.m), this.d, null, null);
        } else {
            Context context = this.c;
            String str2 = this.b;
            if (str == null) {
                str = q1.d(this.m);
            }
            p1Var = new p1(context, str2, str, this.d, this.t, this.u);
        }
        String str3 = "{\"data\":" + this.v + ",\"context\":" + this.w + "}";
        if (str3 != null) {
            p1Var.j = str3;
            try {
                p1Var.d = new e0(new JSONObject(str3).optJSONObject("context"));
            } catch (Exception unused) {
                p1Var.d = new e0(null);
            }
        }
        p1Var.f(this.x);
        p1Var.z = this.B;
        p1Var.R = this;
        p1Var.T = this;
        p1Var.g(this.n && !this.p);
        this.f = p1Var;
        this.q++;
        final int i7 = this.j;
        i1.a.execute(new Runnable() { // from class: org.telegram.utils.twidget.c1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    p1.this.h(i7);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public final void b(int i7, String str, long j3) {
        p1 p1Var = this.f;
        if (p1Var != null) {
            e0 e0Var = p1Var.d;
            boolean z10 = i7 == 0;
            synchronized (e0Var) {
                try {
                    if (e0Var.j && z10) {
                        e0Var.h = SystemClock.elapsedRealtime();
                    }
                    e0Var.j = false;
                    e0Var.i = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = p1Var.v;
            if (p1Var.A || j10 == 0) {
                return;
            }
            p1Var.c.a(j10, j3, i7, str == null ? null : str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void c() {
        int i7;
        p1 p1Var = this.f;
        if (p1Var == null || p1Var.A || p1Var.v == 0 || p1Var.K) {
            return;
        }
        n1 n1Var = p1Var.N;
        if (n1Var == null || (((i7 = p1Var.M) != 0 && Math.abs(n1Var.d - i7) > 1) || !n1Var.a())) {
            p1Var.K = true;
            p1Var.c.i(p1Var.v);
        }
    }

    public final n1 d() {
        p1 p1Var = this.f;
        n1 n1Var = p1Var == null ? null : p1Var.N;
        if (n1Var != null && (this.g == null || p1Var.B)) {
            return n1Var;
        }
        n1 n1Var2 = this.g;
        return (n1Var2 == null || Math.abs(n1Var2.d - this.j) > 1) ? n1Var != null ? n1Var : this.g : this.g;
    }

    public final boolean e() {
        p1 p1Var;
        n1 n1Var;
        if (this.r == this.q || (p1Var = this.f) == null || (n1Var = p1Var.N) == null) {
            return false;
        }
        if (!n1Var.h && !p1Var.F) {
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

    public final void f(String str) {
        if (this.e != null) {
            a8.d("widget " + this.a + ": " + str);
        }
        d81 d81Var = this.h;
        if (d81Var != null) {
            d81Var.a.h();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(p1 p1Var) {
        n1 n1Var;
        k0 h;
        d81 d81Var;
        if (p1Var == this.f && (n1Var = p1Var.N) != null) {
            if (this.g == null || p1Var.B) {
                this.g = null;
                this.k = n1Var.d;
                boolean z10 = n1Var.i;
                Object[] objArr = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, n1Var.e);
                boolean z11 = max != this.i;
                this.i = max;
                d81 d81Var2 = this.h;
                if (d81Var2 != null) {
                    c81 c81Var = d81Var2.a;
                    if (z11) {
                        c81Var.j();
                    }
                    c81Var.h();
                }
                if ((z11 || objArr != false) && this.e != null && (h = n0.h(this)) != null && this.i > 0) {
                    int f10 = n0.f(this.k);
                    int max2 = Math.max(50, Math.min(600, n0.f(this.i)));
                    boolean z12 = this.l;
                    if (f10 > 0 && h.f == 0 && !h.k && n0.l(h.a()).a(f10, max2, z12)) {
                        tr a02 = tr.a0(h.b);
                        a02.a.c(new wq(a02, h.c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    rk0 rk0Var = h.u;
                    if (rk0Var != null) {
                        rk0Var.p0("frame off screen");
                    }
                }
                if (!e() || z11 || (d81Var = this.h) == null) {
                    return;
                }
                c81 c81Var2 = d81Var.a;
                c81Var2.j();
                c81Var2.h();
            }
        }
    }

    public final void h(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        p1 p1Var = this.f;
        if (p1Var != null) {
            long j3 = p1Var.v;
            if (p1Var.A || j3 == 0) {
                return;
            }
            p1Var.c.d(j3, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final synchronized void i(float f10, float f11, boolean z10) {
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
        org.telegram.messenger.g0.g3(new j0(this, 3));
    }

    public final void j(String str) {
        if (str == null || str.equals(this.s)) {
            return;
        }
        this.s = str;
        this.m = str.contains("\"dark\"");
        p1 p1Var = this.f;
        if (p1Var == null || p1Var.A || str == null || str.equals(p1Var.H)) {
            return;
        }
        p1Var.H = str;
        str.contains("\"dark\"");
        long j3 = p1Var.v;
        if (j3 != 0) {
            p1Var.c.k(j3, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void k(boolean z10) {
        this.n = z10;
        p1 p1Var = this.f;
        if (p1Var != null) {
            p1Var.g(z10 && !this.p);
        }
    }

    public final void l(int i7) {
        if (i7 <= 0 || i7 == this.j) {
            return;
        }
        this.j = i7;
        p1 p1Var = this.f;
        if (p1Var == null || i7 <= 0 || i7 == p1Var.M || p1Var.A) {
            return;
        }
        p1Var.M = i7;
        long j3 = p1Var.v;
        if (j3 != 0) {
            p1Var.c.p(j3, i7 / p1Var.l);
        }
    }

    public final void m() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        n1 d = d();
        if (d != null) {
            this.g = d;
        }
        p1 p1Var = this.f;
        if (!p1Var.A) {
            p1Var.A = true;
            p1Var.R = null;
            p1Var.a.removeCallbacks(p1Var.W);
            p1Var.a.removeCallbacks(p1Var.V);
            p1Var.a.removeCallbacks(p1Var.X);
            p1Var.a.removeCallbacks(p1Var.b0);
            if (p1Var.J) {
                Choreographer.getInstance().removeFrameCallback(p1Var.Y);
            }
            p1Var.J = false;
            synchronized (p1Var.s) {
                try {
                    n1 n1Var = p1Var.O;
                    if (n1Var != null) {
                        n1Var.a.b();
                    }
                    p1Var.O = null;
                    p1Var.P = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j3 = p1Var.v;
            p1Var.v = 0L;
            if (j3 != 0) {
                i1.a.execute(new qx0(p1Var, j3, 3));
            }
        }
        this.f = null;
        if (this.A) {
            this.A = false;
            sa.d dVar = this.e;
            if (dVar != null) {
                dVar.getClass();
                n0.E();
            }
        }
    }
}
