package org.telegram.utils.twidget;

import ai.d3;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import gi.d1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.sq;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Components.g71;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.Wallet.t2;
import org.telegram.ui.hb1;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class u {
    public boolean A;
    public final String a;
    public final String b;
    public final Context c;
    public mb.b e;
    public h0 f;
    public f0 g;
    public h71 h;
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

    public u(Context context, String str, String str2) {
        this.c = context.getApplicationContext();
        this.a = str;
        this.b = str2;
    }

    public final void a(int i3, String str, long j10) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j11 = h0Var.t;
            if (h0Var.u || j11 == 0) {
                return;
            }
            WidgetSandboxNative.answerRequest(j11, j10, i3, str == null ? null : str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void b() {
        int i3;
        h0 h0Var = this.f;
        if (h0Var == null || h0Var.u || h0Var.t == 0 || h0Var.C) {
            return;
        }
        f0 f0Var = h0Var.F;
        if (f0Var == null || (((i3 = h0Var.E) != 0 && Math.abs(f0Var.d - i3) > 1) || !f0Var.a())) {
            h0Var.C = true;
            WidgetSandboxNative.repaint(h0Var.t);
        }
    }

    public final f0 c() {
        h0 h0Var = this.f;
        f0 f0Var = h0Var == null ? null : h0Var.F;
        if (f0Var != null && (this.g == null || h0Var.v)) {
            return f0Var;
        }
        f0 f0Var2 = this.g;
        return (f0Var2 == null || Math.abs(f0Var2.d - this.j) > 1) ? f0Var != null ? f0Var : this.g : this.g;
    }

    public final void d(float f10, float f11, int i3, int i10) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j10 = h0Var.t;
            if (h0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.hover(j10, i3, f10, f11, i10);
        }
    }

    public final boolean e() {
        h0 h0Var;
        f0 f0Var;
        if (this.r == this.q || (h0Var = this.f) == null || (f0Var = h0Var.F) == null) {
            return false;
        }
        if (!f0Var.g && !h0Var.x) {
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
        d2 T;
        gk0 gk0Var;
        if (this.e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.x > 0 && (gk0Var = h.w) != null) {
                        view = gk0Var.W;
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
                sf.c.t(parentActivity, optString3);
                return;
            }
            p.i = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
            String M0 = bd.M0(2131742882, null);
            s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = bd.a0(null, null, 2131742883, optString3);
            alertDialog$Builder.k(bd.M0(2131747825, null), new na1(10, parentActivity, optString3));
            alertDialog$Builder.h(bd.M0(2131752589, null), null);
            s1Var.setOnDismissListener(new d1(7));
            if (T.showDialog(s1Var) == null) {
                p.i = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(h0 h0Var) {
        f0 f0Var;
        m h;
        h71 h71Var;
        if (h0Var == this.f && (f0Var = h0Var.F) != null) {
            if (this.g == null || h0Var.v) {
                this.g = null;
                this.k = f0Var.d;
                boolean z10 = f0Var.h;
                Object[] objArr = z10 != this.l;
                this.l = z10;
                int max = Math.max(1, f0Var.e);
                boolean z11 = max != this.i;
                this.i = max;
                h71 h71Var2 = this.h;
                if (h71Var2 != null) {
                    g71 g71Var = h71Var2.a;
                    if (z11) {
                        g71Var.j();
                    }
                    g71Var.h();
                }
                if ((z11 || objArr != false) && this.e != null && (h = p.h(this)) != null && this.i > 0) {
                    int f10 = p.f(this.k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.i)));
                    boolean z12 = this.l;
                    if (f10 > 0 && h.f == 0 && !h.k && p.l(h.a()).a(f10, max2, z12)) {
                        qr a02 = qr.a0(h.b);
                        a02.a.c(new sq(a02, h.c, h.d, f10, max2, z12 ? 1 : 0, 1));
                    }
                    gk0 gk0Var = h.u;
                    if (gk0Var != null) {
                        gk0Var.p0("frame off screen");
                    }
                }
                if (!e() || z11 || (h71Var = this.h) == null) {
                    return;
                }
                g71 g71Var2 = h71Var.a;
                g71Var2.j();
                g71Var2.h();
            }
        }
    }

    public final void h(String str, JSONObject jSONObject) {
        m h;
        String str2;
        if (this.e == null || (h = p.h(this)) == null) {
            return;
        }
        String a10 = h.a();
        JSONObject jSONObject2 = (JSONObject) p.c.get(a10);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put(str, jSONObject);
        } catch (Exception unused) {
        }
        p.c.put(a10, jSONObject2);
        for (m mVar : p.a.values()) {
            if (mVar.t != null && a10.equals(mVar.a())) {
                u uVar = mVar.t;
                try {
                    str2 = bd.E0().y.toLanguageTag();
                } catch (Exception unused2) {
                    str2 = null;
                }
                String jSONObject3 = jSONObject2.toString();
                uVar.t = str2;
                uVar.u = jSONObject3;
            }
        }
        if ("local".equals(str)) {
            p.d.put(a10, h);
            hb1 hb1Var = p.e;
            org.telegram.messenger.g0.r(hb1Var);
            org.telegram.messenger.g0.i3(hb1Var, 1000L);
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
                user = hp.s1(h.b).a2(Long.valueOf(j11));
                d2 T = LaunchActivity.T();
                if (h != null || !p.D(h) || user == null || !user.bot) {
                    a(5, null, j10);
                }
                if (T == null || T.getContext() == null) {
                    a(3, null, j10);
                    return;
                }
                byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                Context context = T.getContext();
                int i3 = h.b;
                e6 resourceProvider = T.getResourceProvider();
                k kVar = new k(h, this, j10, bytes);
                ArrayList arrayList = t2.a;
                q2 q2Var = new q2(new boolean[]{false}, kVar);
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i3);
                boolean[] zArr = {false};
                d3 d3Var = new d3(zArr, context, i3, user, jSONObject, resourceProvider, q2Var);
                if (x10.G()) {
                    d3Var.run();
                    return;
                }
                t2.a.add(d3Var);
                x10.m0(d3Var);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.g(d3Var, zArr, q2Var, 8), 10000L);
                return;
            }
        }
        user = null;
        d2 T2 = LaunchActivity.T();
        if (h != null) {
        }
        a(5, null, j10);
    }

    public final void j(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j10 = h0Var.t;
            if (h0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.data(j10, str.getBytes(StandardCharsets.UTF_8));
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
        org.telegram.messenger.g0.h3(new l(this, 2));
    }

    public final void l(String str) {
        if (str == null || str.equals(this.s)) {
            return;
        }
        this.s = str;
        this.m = str.contains("\"dark\"");
        h0 h0Var = this.f;
        if (h0Var == null || h0Var.u || str.equals(h0Var.z)) {
            return;
        }
        h0Var.z = str;
        str.contains("\"dark\"");
        long j10 = h0Var.t;
        if (j10 != 0) {
            WidgetSandboxNative.theme(j10, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void m(boolean z10) {
        this.n = z10;
        h0 h0Var = this.f;
        if (h0Var != null) {
            h0Var.d(z10 && !this.p);
        }
    }

    public final void n(int i3) {
        if (i3 <= 0 || i3 == this.j) {
            return;
        }
        this.j = i3;
        h0 h0Var = this.f;
        if (h0Var == null || i3 <= 0 || i3 == h0Var.E || h0Var.u) {
            return;
        }
        h0Var.E = i3;
        long j10 = h0Var.t;
        if (j10 != 0) {
            WidgetSandboxNative.width(j10, i3 / h0Var.j);
        }
    }

    public final void o(int i3, float f10, float f11, int i10, boolean z10, boolean z11, int i11, int i12) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j10 = h0Var.t;
            if (h0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.touch(j10, i3, f10, f11, i10, z10, z11, i11, i12);
        }
    }

    public final void p() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        f0 c2 = c();
        if (c2 != null) {
            this.g = c2;
        }
        h0 h0Var = this.f;
        if (!h0Var.u) {
            h0Var.u = true;
            h0Var.J = null;
            h0Var.a.removeCallbacks(h0Var.N);
            h0Var.a.removeCallbacks(h0Var.M);
            h0Var.a.removeCallbacks(h0Var.O);
            if (h0Var.B) {
                Choreographer.getInstance().removeFrameCallback(h0Var.P);
            }
            h0Var.B = false;
            synchronized (h0Var.q) {
                try {
                    f0 f0Var = h0Var.G;
                    if (f0Var != null) {
                        f0Var.a.c();
                    }
                    h0Var.G = null;
                    h0Var.H = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            long j10 = h0Var.t;
            h0Var.t = 0L;
            if (j10 != 0) {
                z.a.execute(new a0(j10));
            }
        }
        this.f = null;
        if (this.A) {
            this.A = false;
            if (this.e != null) {
                p.C();
            }
        }
    }
}
