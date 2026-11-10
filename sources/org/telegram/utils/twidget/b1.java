package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;

    public /* synthetic */ b1(i1 i1Var, int i7) {
        this.a = i7;
        this.b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1 g1Var;
        JSONObject jSONObject;
        v0 v0Var;
        p71 p71Var;
        i1 i1Var;
        k0 h;
        int i7;
        ck0 ck0Var;
        switch (this.a) {
            case 0:
                i1 i1Var2 = this.b;
                synchronized (i1Var2.s) {
                    g1Var = i1Var2.I;
                    i1Var2.I = null;
                    jSONObject = i1Var2.J;
                    i1Var2.J = null;
                    i1Var2.K = false;
                }
                if (i1Var2.w) {
                    if (g1Var != null) {
                        g1Var.a.b();
                        return;
                    }
                    return;
                }
                if (g1Var != null && (i7 = i1Var2.G) != 0 && Math.abs(g1Var.d - i7) > 1) {
                    g1Var.a.b();
                    i1Var2.E = false;
                    g1Var = null;
                }
                if (g1Var != null) {
                    i1Var2.H = g1Var;
                    i1Var2.E = false;
                    v0 v0Var2 = i1Var2.L;
                    if (v0Var2 != null) {
                        v0Var2.h(i1Var2);
                    }
                }
                if (jSONObject == null || (v0Var = i1Var2.L) == null) {
                    return;
                }
                if (v0Var.e != null) {
                    String optString = jSONObject.optString("dead");
                    if (!TextUtils.isEmpty(optString) && (h = n0.h(v0Var)) != null) {
                        int i10 = h.C;
                        int i11 = v0Var.q;
                        if (i10 != i11) {
                            h.C = i11;
                            h.B++;
                            h.D = true;
                            a8.b("widget " + v0Var.a + " stopped (" + h.B + "): " + optString);
                            n0.a(h);
                            n0.b();
                        }
                    }
                }
                if (jSONObject.optBoolean("loaded") && v0Var.g != null && (i1Var = v0Var.f) != null) {
                    v0Var.h(i1Var);
                    return;
                } else {
                    if (!v0Var.f() || (p71Var = v0Var.h) == null) {
                        return;
                    }
                    o71 o71Var = p71Var.a;
                    o71Var.j();
                    o71Var.h();
                    return;
                }
            case 1:
                i1 i1Var3 = this.b;
                if (i1Var3.w || i1Var3.v == 0) {
                    return;
                }
                i1Var3.v = 0L;
                boolean z9 = false;
                i1Var3.o.set(false);
                i1Var3.N = "Widget engine stopped";
                v0 v0Var3 = i1Var3.L;
                if (v0Var3 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - v0Var3.C > 60000) {
                        v0Var3.C = elapsedRealtime;
                        v0Var3.B = 0;
                    }
                    if (v0Var3.o) {
                        int i12 = v0Var3.B;
                        v0Var3.B = i12 + 1;
                        if (i12 < 2) {
                            z9 = true;
                        }
                    }
                    v0Var3.p();
                    if (v0Var3.e != null) {
                        k0 h7 = n0.h(v0Var3);
                        StringBuilder sb2 = new StringBuilder("widget ");
                        sb2.append(v0Var3.a);
                        sb2.append(": engine process died");
                        org.telegram.ui.Cells.f1.u(z9 ? ", restarting" : "", sb2);
                        if (z9 && h7 != null && (ck0Var = h7.w) != null && ck0Var.e0 && ck0Var.X != null) {
                            ck0Var.s0();
                            ck0Var.r0();
                        }
                    } else if (z9) {
                        v0Var3.a();
                    }
                    if (z9) {
                        return;
                    }
                    v0Var3.g("Widget engine stopped");
                    return;
                }
                return;
            case 2:
                this.b.d();
                return;
            case 3:
                i1 i1Var4 = this.b;
                i1Var4.r.set(true);
                i1Var4.d();
                return;
            default:
                i1 i1Var5 = this.b;
                long j3 = i1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                if (i1Var5.w || j3 == 0 || !i1Var5.F || !i1Var5.p.get() || nanoTime - i1Var5.S < (max * 9) / 10 || !i1Var5.o.compareAndSet(false, true)) {
                    i1Var5.d();
                    return;
                }
                i1Var5.p.set(false);
                i1Var5.S = nanoTime;
                float f10 = (nanoTime - i1Var5.m) / 1000000.0f;
                o0 o0Var = (o0) i1Var5.c.e.get(Long.valueOf(j3));
                b h12 = o0Var == null ? null : o0Var.h1();
                if (h12 == null) {
                    return;
                }
                try {
                    h12.s(o0Var.d, f10, true, false, false);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }
}
