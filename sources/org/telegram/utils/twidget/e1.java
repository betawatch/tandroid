package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.q71;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ e1(l1 l1Var, int i7) {
        this.a = i7;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j1 j1Var;
        JSONObject jSONObject;
        y0 y0Var;
        q71 q71Var;
        l1 l1Var;
        k0 h;
        int i7;
        hk0 hk0Var;
        switch (this.a) {
            case 0:
                l1 l1Var2 = this.b;
                synchronized (l1Var2.s) {
                    j1Var = l1Var2.I;
                    l1Var2.I = null;
                    jSONObject = l1Var2.J;
                    l1Var2.J = null;
                    l1Var2.K = false;
                }
                if (l1Var2.w) {
                    if (j1Var != null) {
                        j1Var.a.b();
                        return;
                    }
                    return;
                }
                if (j1Var != null && (i7 = l1Var2.G) != 0 && Math.abs(j1Var.d - i7) > 1) {
                    j1Var.a.b();
                    l1Var2.E = false;
                    j1Var = null;
                }
                if (j1Var != null) {
                    l1Var2.H = j1Var;
                    l1Var2.E = false;
                    y0 y0Var2 = l1Var2.L;
                    if (y0Var2 != null) {
                        y0Var2.h(l1Var2);
                    }
                }
                if (jSONObject == null || (y0Var = l1Var2.L) == null) {
                    return;
                }
                if (y0Var.e != null) {
                    String optString = jSONObject.optString("dead");
                    if (!TextUtils.isEmpty(optString) && (h = n0.h(y0Var)) != null) {
                        int i10 = h.C;
                        int i11 = y0Var.q;
                        if (i10 != i11) {
                            h.C = i11;
                            h.B++;
                            h.D = true;
                            a8.b("widget " + y0Var.a + " stopped (" + h.B + "): " + optString);
                            n0.a(h);
                            n0.b();
                        }
                    }
                }
                if (jSONObject.optBoolean("loaded") && y0Var.g != null && (l1Var = y0Var.f) != null) {
                    y0Var.h(l1Var);
                    return;
                } else {
                    if (!y0Var.f() || (q71Var = y0Var.h) == null) {
                        return;
                    }
                    p71 p71Var = q71Var.a;
                    p71Var.j();
                    p71Var.h();
                    return;
                }
            case 1:
                l1 l1Var3 = this.b;
                if (l1Var3.w || l1Var3.v == 0) {
                    return;
                }
                l1Var3.v = 0L;
                boolean z10 = false;
                l1Var3.o.set(false);
                l1Var3.N = "Widget engine stopped";
                y0 y0Var3 = l1Var3.L;
                if (y0Var3 != null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - y0Var3.C > 60000) {
                        y0Var3.C = elapsedRealtime;
                        y0Var3.B = 0;
                    }
                    if (y0Var3.o) {
                        int i12 = y0Var3.B;
                        y0Var3.B = i12 + 1;
                        if (i12 < 2) {
                            z10 = true;
                        }
                    }
                    y0Var3.p();
                    if (y0Var3.e != null) {
                        k0 h7 = n0.h(y0Var3);
                        StringBuilder sb2 = new StringBuilder("widget ");
                        sb2.append(y0Var3.a);
                        sb2.append(": engine process died");
                        org.telegram.ui.Cells.y0.t(z10 ? ", restarting" : "", sb2);
                        if (z10 && h7 != null && (hk0Var = h7.w) != null && hk0Var.f0 && hk0Var.Y != null) {
                            hk0Var.s0();
                            hk0Var.r0();
                        }
                    } else if (z10) {
                        y0Var3.a();
                    }
                    if (z10) {
                        return;
                    }
                    y0Var3.g("Widget engine stopped");
                    return;
                }
                return;
            case 2:
                this.b.d();
                return;
            case 3:
                l1 l1Var4 = this.b;
                l1Var4.r.set(true);
                l1Var4.d();
                return;
            default:
                l1 l1Var5 = this.b;
                long j3 = l1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                if (l1Var5.w || j3 == 0 || !l1Var5.F || !l1Var5.p.get() || nanoTime - l1Var5.S < (max * 9) / 10 || !l1Var5.o.compareAndSet(false, true)) {
                    l1Var5.d();
                    return;
                }
                l1Var5.p.set(false);
                l1Var5.S = nanoTime;
                float f10 = (nanoTime - l1Var5.m) / 1000000.0f;
                r0 r0Var = (r0) l1Var5.c.e.get(Long.valueOf(j3));
                b h12 = r0Var == null ? null : r0Var.h1();
                if (h12 == null) {
                    return;
                }
                try {
                    h12.s(r0Var.d, f10, true, false, false);
                    return;
                } catch (RemoteException unused) {
                    return;
                }
        }
    }
}
