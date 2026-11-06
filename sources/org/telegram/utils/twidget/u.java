package org.telegram.utils.twidget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import fi.d1;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import jg.c1;
import org.json.JSONObject;
import org.telegram.messenger.br;
import org.telegram.messenger.hd;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.n0;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.Wallet.v2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class u {
    public boolean A;
    public final String a;
    public final String b;
    public final Context c;
    public nb.a e;
    public h0 f;
    public f0 g;
    public j71 h;
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

    public final void a(int i7, String str, long j3) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j10 = h0Var.t;
            if (h0Var.u || j10 == 0) {
                return;
            }
            WidgetSandboxNative.answerRequest(j10, j3, i7, str == null ? null : str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void b() {
        int i7;
        h0 h0Var = this.f;
        if (h0Var == null || h0Var.u || h0Var.t == 0 || h0Var.C) {
            return;
        }
        f0 f0Var = h0Var.F;
        if (f0Var == null || (((i7 = h0Var.E) != 0 && Math.abs(f0Var.d - i7) > 1) || !f0Var.a())) {
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

    public final void d(float f10, float f11, int i7, int i10) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j3 = h0Var.t;
            if (h0Var.u || j3 == 0) {
                return;
            }
            WidgetSandboxNative.hover(j3, i7, f10, f11, i10);
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
        f2 T;
        ck0 ck0Var;
        if (this.e != null) {
            m h = p.h(this);
            String optString = jSONObject.optString("kind");
            View view = null;
            if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                if ("haptic".equals(optString)) {
                    if (h != null && h.x > 0 && (ck0Var = h.w) != null) {
                        view = ck0Var.V;
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
                vf.c.t(parentActivity, optString3);
                return;
            }
            p.i = true;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, parentActivity, T.getResourceProvider());
            String M0 = hd.M0(2131742873, null);
            u1 u1Var = alertDialog$Builder.a;
            u1Var.R = M0;
            u1Var.T = hd.a0(null, null, 2131742874, optString3);
            alertDialog$Builder.k(hd.M0(2131747816, null), new org.telegram.ui.web.a0(2, parentActivity, optString3));
            alertDialog$Builder.h(hd.M0(2131752589, null), null);
            u1Var.setOnDismissListener(new d1(7));
            if (T.showDialog(u1Var) == null) {
                p.i = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(h0 h0Var) {
        f0 f0Var;
        m h;
        j71 j71Var;
        if (h0Var == this.f && (f0Var = h0Var.F) != null) {
            if (this.g == null || h0Var.v) {
                this.g = null;
                this.k = f0Var.d;
                boolean z9 = f0Var.h;
                Object[] objArr = z9 != this.l;
                this.l = z9;
                int max = Math.max(1, f0Var.e);
                boolean z10 = max != this.i;
                this.i = max;
                j71 j71Var2 = this.h;
                if (j71Var2 != null) {
                    i71 i71Var = j71Var2.a;
                    if (z10) {
                        i71Var.j();
                    }
                    i71Var.h();
                }
                if ((z10 || objArr != false) && this.e != null && (h = p.h(this)) != null && this.i > 0) {
                    int f10 = p.f(this.k);
                    int max2 = Math.max(50, Math.min(600, p.f(this.i)));
                    boolean z11 = this.l;
                    if (f10 > 0 && h.f == 0 && !h.k && p.l(h.a()).a(f10, max2, z11)) {
                        yr a02 = yr.a0(h.b);
                        a02.a.c(new br(a02, h.c, h.d, f10, max2, z11 ? 1 : 0, 1));
                    }
                    ck0 ck0Var = h.u;
                    if (ck0Var != null) {
                        ck0Var.p0("frame off screen");
                    }
                }
                if (!e() || z10 || (j71Var = this.h) == null) {
                    return;
                }
                i71 i71Var2 = j71Var.a;
                i71Var2.j();
                i71Var2.h();
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
                    str2 = hd.E0().y.toLanguageTag();
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
            org.telegram.ui.Wallet.z zVar = p.e;
            org.telegram.messenger.g0.r(zVar);
            org.telegram.messenger.g0.i3(zVar, 1000L);
        }
    }

    public final void i(long j3, JSONObject jSONObject) {
        TLRPC.User user;
        if (this.e == null) {
            a(3, null, j3);
            return;
        }
        m h = p.h(this);
        if (h != null) {
            long j10 = h.n;
            if (j10 != 0) {
                user = qp.s1(h.b).a2(Long.valueOf(j10));
                f2 T = LaunchActivity.T();
                if (h != null || !p.D(h) || user == null || !user.bot) {
                    a(5, null, j3);
                }
                if (T == null || T.getContext() == null) {
                    a(3, null, j3);
                    return;
                }
                byte[] bytes = jSONObject.optString("data").getBytes(StandardCharsets.UTF_8);
                Context context = T.getContext();
                int i7 = h.b;
                f6 resourceProvider = T.getResourceProvider();
                k kVar = new k(h, this, j3, bytes);
                ArrayList arrayList = v2.a;
                s2 s2Var = new s2(new boolean[]{false}, kVar);
                n0 x10 = n0.x(i7);
                boolean[] zArr = {false};
                c1 c1Var = new c1(zArr, context, i7, user, jSONObject, resourceProvider, s2Var, 16);
                if (x10.G()) {
                    c1Var.run();
                    return;
                }
                v2.a.add(c1Var);
                x10.m0(c1Var);
                org.telegram.messenger.g0.i3(new org.telegram.ui.Wallet.g(c1Var, zArr, s2Var, 8), 10000L);
                return;
            }
        }
        user = null;
        f2 T2 = LaunchActivity.T();
        if (h != null) {
        }
        a(5, null, j3);
    }

    public final void j(String str) {
        if (str == null || str.equals(this.v)) {
            return;
        }
        this.v = str;
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j3 = h0Var.t;
            if (h0Var.u || j3 == 0) {
                return;
            }
            WidgetSandboxNative.data(j3, str.getBytes(StandardCharsets.UTF_8));
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
        long j3 = h0Var.t;
        if (j3 != 0) {
            WidgetSandboxNative.theme(j3, str.getBytes(StandardCharsets.UTF_8));
        }
    }

    public final void m(boolean z9) {
        this.n = z9;
        h0 h0Var = this.f;
        if (h0Var != null) {
            h0Var.d(z9 && !this.p);
        }
    }

    public final void n(int i7) {
        if (i7 <= 0 || i7 == this.j) {
            return;
        }
        this.j = i7;
        h0 h0Var = this.f;
        if (h0Var == null || i7 <= 0 || i7 == h0Var.E || h0Var.u) {
            return;
        }
        h0Var.E = i7;
        long j3 = h0Var.t;
        if (j3 != 0) {
            WidgetSandboxNative.width(j3, i7 / h0Var.j);
        }
    }

    public final void o(int i7, float f10, float f11, int i10, boolean z9, boolean z10, int i11, int i12) {
        h0 h0Var = this.f;
        if (h0Var != null) {
            long j3 = h0Var.t;
            if (h0Var.u || j3 == 0) {
                return;
            }
            WidgetSandboxNative.touch(j3, i7, f10, f11, i10, z9, z10, i11, i12);
        }
    }

    public final void p() {
        this.o = false;
        if (this.f == null) {
            return;
        }
        f0 c10 = c();
        if (c10 != null) {
            this.g = c10;
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
            long j3 = h0Var.t;
            h0Var.t = 0L;
            if (j3 != 0) {
                z.a.execute(new a0(j3));
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
