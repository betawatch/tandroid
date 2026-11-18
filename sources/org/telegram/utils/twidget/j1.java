package org.telegram.utils.twidget;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.z71;
import org.telegram.ui.cd0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ j1(p1 p1Var, int i7) {
        this.a = i7;
        this.b = p1Var;
    }

    private final void a() {
        n1 n1Var;
        JSONObject jSONObject;
        d1 d1Var;
        a81 a81Var;
        p1 p1Var;
        k0 h;
        int i7;
        p1 p1Var2 = this.b;
        synchronized (p1Var2.s) {
            n1Var = p1Var2.O;
            p1Var2.O = null;
            jSONObject = p1Var2.P;
            p1Var2.P = null;
            p1Var2.Q = false;
        }
        if (p1Var2.A) {
            if (n1Var != null) {
                n1Var.a.b();
                return;
            }
            return;
        }
        if (n1Var != null && (i7 = p1Var2.M) != 0 && Math.abs(n1Var.d - i7) > 1) {
            n1Var.a.b();
            p1Var2.K = false;
            n1Var = null;
        }
        if (n1Var != null) {
            p1Var2.N = n1Var;
            p1Var2.K = false;
            d1 d1Var2 = p1Var2.R;
            if (d1Var2 != null) {
                d1Var2.g(p1Var2);
            }
        }
        if (jSONObject == null || (d1Var = p1Var2.R) == null) {
            return;
        }
        if (d1Var.e != null) {
            String optString = jSONObject.optString("dead");
            if (!TextUtils.isEmpty(optString) && (h = n0.h(d1Var)) != null) {
                int i10 = h.C;
                int i11 = d1Var.q;
                if (i10 != i11) {
                    h.C = i11;
                    h.B++;
                    h.D = true;
                    a8.b("widget " + d1Var.a + " stopped (" + h.B + "): " + optString);
                    n0.a(h);
                    n0.b();
                }
            }
        }
        if (jSONObject.optBoolean("loaded") && d1Var.g != null && (p1Var = d1Var.f) != null) {
            d1Var.g(p1Var);
        } else {
            if (!d1Var.e() || (a81Var = d1Var.h) == null) {
                return;
            }
            z71 z71Var = a81Var.a;
            z71Var.j();
            z71Var.h();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap;
        k0 h;
        String str;
        switch (this.a) {
            case 0:
                a();
                return;
            case 1:
                this.b.e();
                return;
            case 2:
                p1 p1Var = this.b;
                p1Var.r.set(true);
                p1Var.e();
                return;
            case 3:
                p1 p1Var2 = this.b;
                p1Var2.a0 = false;
                long j3 = p1Var2.v;
                if (p1Var2.A || j3 == 0 || !p1Var2.o.get()) {
                    return;
                }
                if (p1Var2.L && SystemClock.uptimeMillis() - p1Var2.Z > 15000) {
                    p1Var2.c.g(j3);
                    return;
                } else {
                    p1Var2.a0 = true;
                    p1Var2.a.postDelayed(p1Var2.b0, 5000L);
                    return;
                }
            case 4:
                p1 p1Var3 = this.b;
                long j10 = p1Var3.v;
                long nanoTime = System.nanoTime();
                long max = (long) (1.0E9d / Math.max(30.0f, org.telegram.messenger.g0.r));
                if (p1Var3.A || j10 == 0 || !p1Var3.L || !p1Var3.p.get() || nanoTime - p1Var3.c0 < (max * 9) / 10 || !p1Var3.o.compareAndSet(false, true)) {
                    p1Var3.e();
                    return;
                }
                p1Var3.p.set(false);
                p1Var3.c0 = nanoTime;
                p1Var3.Z = SystemClock.uptimeMillis();
                if (!p1Var3.a0) {
                    p1Var3.a0 = true;
                    p1Var3.a.postDelayed(p1Var3.b0, 5000L);
                }
                p1Var3.c.l(j10, (nanoTime - p1Var3.m) / 1000000.0f, true, false, false);
                return;
            case 5:
                p1 p1Var4 = this.b;
                p1Var4.y.set(false);
                float f10 = p1Var4.x;
                if (p1Var4.A) {
                    return;
                }
                p1Var4.a.removeCallbacks(p1Var4.X);
                if (f10 > 0.0f) {
                    p1Var4.a.postDelayed(p1Var4.X, (long) Math.ceil(Math.min(f10, 3600000.0f)));
                    return;
                } else {
                    if (f10 == 0.0f) {
                        p1Var4.e();
                        return;
                    }
                    return;
                }
            default:
                p1 p1Var5 = this.b;
                synchronized (p1Var5.w) {
                    hashMap = new HashMap(p1Var5.w);
                    p1Var5.w.clear();
                }
                if (p1Var5.T == null) {
                    return;
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    d1 d1Var = p1Var5.T;
                    String str2 = (String) entry.getKey();
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (d1Var.e != null && (h = n0.h(d1Var)) != null) {
                        String a10 = h.a();
                        JSONObject jSONObject2 = (JSONObject) n0.c.get(a10);
                        if (jSONObject2 == null) {
                            jSONObject2 = new JSONObject();
                        }
                        try {
                            jSONObject2.put(str2, jSONObject);
                        } catch (Exception unused) {
                        }
                        n0.c.put(a10, jSONObject2);
                        for (k0 k0Var : n0.a.values()) {
                            if (k0Var.t != null && a10.equals(k0Var.a())) {
                                d1 d1Var2 = k0Var.t;
                                try {
                                    str = gd.E0().y.toLanguageTag();
                                } catch (Exception unused2) {
                                    str = null;
                                }
                                String jSONObject3 = jSONObject2.toString();
                                d1Var2.t = str;
                                d1Var2.u = jSONObject3;
                            }
                        }
                        if ("local".equals(str2)) {
                            n0.d.put(a10, h);
                            cd0 cd0Var = n0.e;
                            org.telegram.messenger.g0.r(cd0Var);
                            org.telegram.messenger.g0.h3(cd0Var, 1000L);
                        }
                    }
                }
                return;
        }
    }
}
