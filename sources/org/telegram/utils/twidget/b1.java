package org.telegram.utils.twidget;

import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.p71;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h1 b;

    public /* synthetic */ b1(h1 h1Var, int i7) {
        this.a = i7;
        this.b = h1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f1 f1Var;
        JSONObject jSONObject;
        v0 v0Var;
        p71 p71Var;
        h1 h1Var;
        k0 h;
        int i7;
        ck0 ck0Var;
        switch (this.a) {
            case 0:
                h1 h1Var2 = this.b;
                synchronized (h1Var2.s) {
                    f1Var = h1Var2.I;
                    h1Var2.I = null;
                    jSONObject = h1Var2.J;
                    h1Var2.J = null;
                    h1Var2.K = false;
                }
                if (h1Var2.w) {
                    if (f1Var != null) {
                        f1Var.a.b();
                        return;
                    }
                    return;
                }
                if (f1Var != null && (i7 = h1Var2.G) != 0 && Math.abs(f1Var.d - i7) > 1) {
                    f1Var.a.b();
                    h1Var2.E = false;
                    f1Var = null;
                }
                if (f1Var != null) {
                    h1Var2.H = f1Var;
                    h1Var2.E = false;
                    v0 v0Var2 = h1Var2.L;
                    if (v0Var2 != null) {
                        v0Var2.h(h1Var2);
                    }
                }
                if (jSONObject == null || (v0Var = h1Var2.L) == null) {
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
                if (jSONObject.optBoolean("loaded") && v0Var.g != null && (h1Var = v0Var.f) != null) {
                    v0Var.h(h1Var);
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
                h1 h1Var3 = this.b;
                if (h1Var3.w || h1Var3.v == 0) {
                    return;
                }
                h1Var3.v = 0L;
                boolean z9 = false;
                h1Var3.o.set(false);
                h1Var3.N = "Widget engine stopped";
                v0 v0Var3 = h1Var3.L;
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
                this.b.c();
                return;
            case 3:
                h1 h1Var4 = this.b;
                h1Var4.r.set(true);
                h1Var4.c();
                return;
            default:
                h1 h1Var5 = this.b;
                long j3 = h1Var5.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                if (h1Var5.w || j3 == 0 || !h1Var5.F || !h1Var5.p.get() || nanoTime - h1Var5.S < (max * 9) / 10 || !h1Var5.o.compareAndSet(false, true)) {
                    h1Var5.c();
                    return;
                }
                h1Var5.p.set(false);
                h1Var5.S = nanoTime;
                float f10 = (nanoTime - h1Var5.m) / 1000000.0f;
                o0 o0Var = (o0) h1Var5.c.e.get(Long.valueOf(j3));
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
