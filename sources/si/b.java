package si;

import android.os.Handler;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ b(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.u();
                return;
            case 1:
                this.b.d0();
                return;
            case 2:
                k kVar = this.b;
                Handler handler = kVar.n;
                if (handler != null) {
                    handler.post(new b(kVar, 3));
                    return;
                }
                return;
            case 3:
                k kVar2 = this.b;
                if (!kVar2.V || kVar2.A == null || (nVar = kVar2.x) == null) {
                    return;
                }
                synchronized (nVar) {
                    z10 = nVar.z;
                }
                if (z10) {
                    return;
                }
                try {
                    n nVar2 = kVar2.x;
                    kVar2.y = nVar2;
                    Handler handler2 = kVar2.n;
                    if (handler2 != null) {
                        handler2.removeCallbacks(kVar2.m1);
                        handler2.postDelayed(kVar2.m1, 3000L);
                    }
                    nVar2.p(new e(kVar2, nVar2, 0), new e(kVar2, nVar2, 1));
                    kVar2.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar2.E0));
                    return;
                } catch (RuntimeException e) {
                    kVar2.k();
                    kVar2.N(e);
                    return;
                }
            case 4:
                k kVar3 = this.b;
                n nVar3 = kVar3.y;
                if (!kVar3.V || kVar3.b0 || nVar3 == null || kVar3.x != nVar3) {
                    return;
                }
                kVar3.y = null;
                kVar3.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 5:
                this.b.g();
                return;
            case 6:
                k kVar4 = this.b;
                kVar4.V = false;
                kVar4.k();
                n nVar4 = kVar4.x;
                if (nVar4 != null) {
                    long l4 = nVar4.l();
                    u uVar = kVar4.w;
                    if (uVar != null && l4 != Long.MAX_VALUE) {
                        uVar.q = Math.max(0L, l4) * 1000;
                        Handler handler3 = uVar.u;
                        if (handler3 != null) {
                            handler3.removeCallbacks(uVar.x0);
                        }
                    }
                }
                kVar4.p();
                n nVar5 = kVar4.x;
                if (nVar5 != null) {
                    nVar5.q();
                    kVar4.x = null;
                }
                kVar4.b0 = false;
                s0 s0Var = (s0) kVar4.k.b;
                s0Var.i.post(new i0(s0Var, 3));
                return;
            case 7:
                this.b.I();
                return;
            default:
                this.b.d0();
                return;
        }
    }
}
