package org.telegram.utils.twidget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.cd;
import org.telegram.messenger.fe;
import org.telegram.messenger.gr;
import org.telegram.messenger.hs;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.p81;
import org.telegram.ui.Components.q81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r2;
import org.telegram.ui.Wallet.u2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class w {
    public boolean A;
    public final String a;
    public final String b;
    public final Context c;
    public t7.u e;
    public k0 f;
    public i0 g;
    public q81 h;
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

    public w(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a(int i10, String str, long j10) {
        k0 k0Var = this.f;
        if (k0Var != null) {
            long j11 = k0Var.t;
            if (k0Var.u || j11 == 0) {
                return;
            }
            WidgetSandboxNative.answerRequest(j11, j10, i10, str == null ? null : str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void b() {
        int i10;
        k0 k0Var = this.f;
        if (k0Var == null || k0Var.u || k0Var.t == 0 || k0Var.C) {
            return;
        }
        i0 i0Var = k0Var.F;
        if (i0Var == null || (((i10 = k0Var.E) != 0 && Math.abs(i0Var.d - i10) > 1) || !i0Var.a())) {
            k0Var.C = true;
            WidgetSandboxNative.repaint(k0Var.t);
        }
    }

    public final i0 c() {
        k0 k0Var = this.f;
        i0 i0Var = k0Var == null ? null : k0Var.F;
        if (i0Var != null && (this.g == null || k0Var.v)) {
            return i0Var;
        }
        i0 i0Var2 = this.g;
        return (i0Var2 == null || Math.abs(i0Var2.d - this.j) > 1) ? i0Var != null ? i0Var : this.g : this.g;
    }

    public final void d(float f7, float f10, int i10, int i11) {
        k0 k0Var = this.f;
        if (k0Var != null) {
            long j10 = k0Var.t;
            if (k0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.hover(j10, i10, f7, f10, i11);
        }
    }

    public final boolean e() {
        k0 k0Var;
        i0 i0Var;
        if (this.r == this.q || (k0Var = this.f) == null || (i0Var = k0Var.F) == null) {
            return false;
        }
        if (!i0Var.h && !k0Var.x) {
            return false;
        }
        this.r = this.q;
        if (this.e == null) {
            return true;
        }
        p.b();
        m h = p.h(this);
        if (h == null) {
            return true;
        }
        p.a(h);
        return true;
    }

    public final void f(JSONObject jSONObject) {
        k2 T;
        gl0 gl0Var;
        if (this.e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.y > 0 && (gl0Var = h.x) != null) {
                        view = gl0Var.V;
                    }
                    if (view != null) {
                        String optString2 = jSONObject.optString("haptic");
                        view.performHapticFeedback("selection".equals(optString2) ? 4 : "notification".equals(optString2) ? 16 : 3);
                        return;
                    }
                    return;
                }
                return;
            }
            String optString3 = jSONObject.optString("url");
            boolean equals = "openTelegramLink".equals(optString);
            if (TextUtils.isEmpty(optString3) || p.i || (T = LaunchActivity.T()) == null || T.getParentActivity() == null) {
                return;
            }
            Activity parentActivity = T.getParentActivity();
            if (equals) {
                gf.f.r(parentActivity, optString3);
                return;
            }
            p.i = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
            String L0 = cd.L0(2131742897, null);
            x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = cd.a0(null, null, 2131742898, optString3);
            alertDialog$Builder.k(cd.L0(2131747833, null), new org.telegram.ui.web.k0(1, parentActivity, optString3));
            alertDialog$Builder.h(cd.L0(2131752589, null), null);
            x1Var.setOnDismissListener(new jg.z(7));
            if (T.showDialog(x1Var) == null) {
                p.i = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(k0 k0Var) {
        i0 i0Var;
        m h;
        q81 q81Var;
        if (k0Var == this.f && (i0Var = k0Var.F) != null) {
            if (this.g == null || k0Var.v) {
                this.g = null;
                this.k = i0Var.d;
                boolean z10 = i0Var.i;
                Object[] objArr = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, i0Var.e);
                boolean z11 = max != this.i;
                this.i = max;
                q81 q81Var2 = this.h;
                if (q81Var2 != null) {
                    p81 p81Var = q81Var2.a;
                    if (z11) {
                        p81Var.j();
                    }
                    p81Var.h();
                }
                if ((z11 || objArr != false) && this.e != null && (h = p.h(this)) != null && this.i > 0) {
                    int f7 = p.f(this.k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.i)));
                    boolean z12 = this.l;
                    if (f7 > 0 && h.f == 0 && !h.k && p.l(h.a()).a(f7, max2, z12)) {
                        hs a02 = hs.a0(h.b);
                        a02.a.c(new gr(a02, h.c, h.d, f7, max2, z12 ? 1 : 0, 1));
                    }
                    gl0 gl0Var = h.v;
                    if (gl0Var != null) {
                        gl0Var.p0("frame off screen");
                    }
                }
                if (!e() || z11 || (q81Var = this.h) == null) {
                    return;
                }
                p81 p81Var2 = q81Var.a;
                p81Var2.j();
                p81Var2.h();
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.e == null || (h = p.h(this)) == null) {
            return;
        }
        String a2 = h.a();
        JSONObject jSONObject2 = (JSONObject) p.c.get(a2);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put(str, jSONObject);
        } catch (Exception unused) {
        }
        p.c.put(a2, jSONObject2);
        for (m mVar : p.a.values()) {
            if (mVar.u != null && a2.equals(mVar.a())) {
                w wVar = mVar.u;
                try {
                    str2 = cd.D0().y.toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                wVar.t = str2;
                wVar.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            p.d.put(a2, h);
            org.telegram.ui.Components.voip.m0 m0Var = p.e;
            org.telegram.messenger.i0.r(m0Var);
            org.telegram.messenger.i0.h3(m0Var, 1000L);
        }
    }

    public final void i(long j10, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.e == null) {
            a(3, null, j10);
            return;
        }
        m h = p.h(this);
        if (h != null) {
            long j11 = h.n;
            if (j11 != 0) {
                user = vp.r1(h.b).Z1(Long.valueOf(j11));
                k2 T = LaunchActivity.T();
                if (h != null || !p.D(h) || user == null || !user.bot) {
                    a(5, null, j10);
                }
                if (T == null || T.getContext() == null) {
                    a(3, null, j10);
                    return;
                }
                byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                Context context = T.getContext();
                int i10 = h.b;
                p6 resourceProvider = T.getResourceProvider();
                k kVar = new k(h, this, j10, bytes);
                ArrayList arrayList = u2.a;
                r2 r2Var = new r2(new boolean[]{false}, kVar);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                boolean[] zArr = {false};
                fe feVar = new fe(zArr, context, i10, user, jSONObject, resourceProvider, r2Var, 15);
                if (x10.G()) {
                    feVar.run();
                    return;
                }
                u2.a.add(feVar);
                x10.m0(feVar);
                org.telegram.messenger.i0.h3(new org.telegram.ui.Wallet.g(feVar, zArr, r2Var, 8), 10000L);
                return;
            }
        }
        user = null;
        k2 T2 = LaunchActivity.T();
        if (h != null) {
        }
        a(5, null, j10);
    }

    public final void j(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        k0 k0Var = this.f;
        if (k0Var != null) {
            long j10 = k0Var.t;
            if (k0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final synchronized void k(float f7, float f10, boolean z10) {
        boolean z11 = f7 > 0.0f;
        if (!z10) {
            if (this.y && z11 == this.z) {
                return;
            }
        }
        this.y = z10;
        this.z = z11;
        String format = String.format(Locale.US, "{\"top\":0,\"right\":0,\"bottom\":%.2f,\"left\":0,\"cornerLeft\":0,\"cornerRight\":%.2f}", Float.valueOf(f7), Float.valueOf(f10));
        if (format.equals(this.x)) {
            return;
        }
        this.x = format;
        org.telegram.messenger.i0.g3(new l(this, 2));
    }

    public final void l(String str) {
        if (str == null || str.equals(this.s)) {
            return;
        }
        this.s = str;
        this.m = str.contains("\"dark\"");
        k0 k0Var = this.f;
        if (k0Var == null || k0Var.u || str == null || str.equals(k0Var.z)) {
            return;
        }
        k0Var.z = str;
        str.contains("\"dark\"");
        long j10 = k0Var.t;
        if (j10 != 0) {
            WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void m(boolean z10) {
        this.n = z10;
        k0 k0Var = this.f;
        if (k0Var != null) {
            k0Var.d(z10 && !this.p);
        }
    }

    public final void n(int i10) {
        if (i10 <= 0 || i10 == this.j) {
            return;
        }
        this.j = i10;
        k0 k0Var = this.f;
        if (k0Var == null || i10 <= 0 || i10 == k0Var.E || k0Var.u) {
            return;
        }
        k0Var.E = i10;
        long j10 = k0Var.t;
        if (j10 != 0) {
            WidgetSandboxNative.width(j10, i10 / k0Var.j);
        }
    }

    public final void o(int i10, float f7, float f10, int i11, boolean z10, boolean z11, int i12, int i13) {
        k0 k0Var = this.f;
        if (k0Var != null) {
            long j10 = k0Var.t;
            if (k0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.touch(j10, i10, f7, f10, i11, z10, z11, i12, i13);
        }
    }

    public final void p() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        i0 c10 = c();
        if (c10 != null) {
            this.g = c10;
        }
        k0 k0Var = this.f;
        if (!k0Var.u) {
            k0Var.u = true;
            k0Var.J = null;
            k0Var.a.removeCallbacks(k0Var.O);
            k0Var.a.removeCallbacks(k0Var.N);
            k0Var.a.removeCallbacks(k0Var.P);
            if (k0Var.B) {
                Choreographer.getInstance().removeFrameCallback(k0Var.Q);
            }
            k0Var.B = false;
            synchronized (k0Var.q) {
                try {
                    i0 i0Var = k0Var.G;
                    if (i0Var != null) {
                        i0Var.a.c();
                    }
                    k0Var.G = null;
                    k0Var.H = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = k0Var.t;
            k0Var.t = 0L;
            if (j10 != 0) {
                b0.a.execute(new d0(j10));
            }
        }
        this.f = null;
        if (this.A) {
            this.A = false;
            t7.u uVar = this.e;
            if (uVar != null) {
                uVar.getClass();
                p.C();
            }
        }
    }
}
