// default package

import android.os.Handler;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class rl9 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bm9 b;

    public /* synthetic */ rl9(bm9 bm9Var, byte b) {
        this.a = b;
        this.b = bm9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        km9 km9Var;
        em9 em9Var;
        boolean z;
        byte b = this.a;
        byte b2 = 0;
        bm9 bm9Var = this.b;
        switch (b) {
            case 0:
                bm9Var.q();
                return;
            case 1:
                int w = bm9Var.w();
                if (w == bm9Var.B0 || (km9Var = bm9Var.v) == null) {
                    return;
                }
                bm9Var.B0 = w;
                km9Var.s0 = w;
                Handler handler = km9Var.u;
                if (km9Var.r0 && handler != null) {
                    handler.post(new ge7((Object) km9Var, w, (byte) 14));
                }
                bm9Var.j.b("display rotation applied: degrees=" + w);
                return;
            case 2:
                bm9Var.a0();
                return;
            case 3:
                Handler handler2 = bm9Var.n;
                if (handler2 != null) {
                    handler2.post(new rl9(bm9Var, (byte) 4));
                    return;
                }
                return;
            case 4:
                if (!bm9Var.U || bm9Var.z == null || (em9Var = bm9Var.w) == null) {
                    return;
                }
                synchronized (em9Var) {
                    z = em9Var.E;
                }
                if (z) {
                    return;
                }
                try {
                    em9 em9Var2 = bm9Var.w;
                    bm9Var.x = em9Var2;
                    Handler handler3 = bm9Var.n;
                    if (handler3 != null) {
                        handler3.removeCallbacks(bm9Var.k1);
                        handler3.postDelayed(bm9Var.k1, 3000L);
                    }
                    em9Var2.t(new ul9(bm9Var, em9Var2, b2), new ul9(bm9Var, em9Var2, (byte) 1));
                    bm9Var.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + bm9.x(bm9Var.C0));
                    return;
                } catch (RuntimeException e) {
                    bm9Var.f();
                    bm9Var.M(e);
                    return;
                }
            case 5:
                em9 em9Var3 = bm9Var.x;
                if (!bm9Var.U || bm9Var.Y || em9Var3 == null || bm9Var.w != em9Var3) {
                    return;
                }
                bm9Var.x = null;
                bm9Var.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 6:
                if (!bm9Var.k0 || bm9Var.M <= 0.0f) {
                    bm9Var.a();
                    return;
                } else {
                    if (!bm9Var.U || bm9Var.V || bm9Var.z == null || !bm9Var.l0) {
                        return;
                    }
                    bm9Var.v("zoom requested", null, 5);
                    return;
                }
            case 7:
                bm9Var.U = false;
                bm9Var.f();
                em9 em9Var4 = bm9Var.w;
                if (em9Var4 != null) {
                    long p = em9Var4.p();
                    km9 km9Var2 = bm9Var.v;
                    if (km9Var2 != null && p != Long.MAX_VALUE) {
                        km9Var2.q = Math.max(0L, p) * 1000;
                        Handler handler4 = km9Var2.u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(km9Var2.y0);
                        }
                    }
                }
                bm9Var.j();
                em9 em9Var5 = bm9Var.w;
                if (em9Var5 != null) {
                    em9Var5.u();
                    bm9Var.w = null;
                }
                bm9Var.Y = false;
                un9 un9Var = (un9) bm9Var.k.b;
                un9Var.i.post(new in9(un9Var, (byte) 3));
                return;
            case 8:
                bm9Var.G();
                return;
            default:
                bm9Var.a0();
                return;
        }
    }
}
