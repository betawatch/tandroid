package wi;

import android.os.Handler;
import org.telegram.ui.Wallet.g2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ a(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t tVar;
        n nVar;
        boolean z9;
        switch (this.a) {
            case 0:
                this.b.u();
                return;
            case 1:
                k kVar = this.b;
                int z10 = kVar.z();
                if (z10 == kVar.C0 || (tVar = kVar.w) == null) {
                    return;
                }
                kVar.C0 = z10;
                tVar.s0 = z10;
                Handler handler = tVar.u;
                if (tVar.r0 && handler != null) {
                    handler.post(new g2(tVar, z10, 11));
                }
                kVar.j.b("display rotation applied: degrees=" + z10);
                return;
            case 2:
                this.b.b0();
                return;
            case 3:
                k kVar2 = this.b;
                Handler handler2 = kVar2.n;
                if (handler2 != null) {
                    handler2.post(new a(kVar2, 4));
                    return;
                }
                return;
            case 4:
                k kVar3 = this.b;
                if (!kVar3.V || kVar3.A == null || (nVar = kVar3.x) == null) {
                    return;
                }
                synchronized (nVar) {
                    z9 = nVar.E;
                }
                if (z9) {
                    return;
                }
                try {
                    n nVar2 = kVar3.x;
                    kVar3.y = nVar2;
                    Handler handler3 = kVar3.n;
                    if (handler3 != null) {
                        handler3.removeCallbacks(kVar3.l1);
                        handler3.postDelayed(kVar3.l1, 3000L);
                    }
                    nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                    kVar3.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.A(kVar3.D0));
                    return;
                } catch (RuntimeException e10) {
                    kVar3.j();
                    kVar3.N(e10);
                    return;
                }
            case 5:
                k kVar4 = this.b;
                n nVar3 = kVar4.y;
                if (!kVar4.V || kVar4.Z || nVar3 == null || kVar4.x != nVar3) {
                    return;
                }
                kVar4.y = null;
                kVar4.N(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 6:
                this.b.f();
                return;
            case 7:
                k kVar5 = this.b;
                kVar5.V = false;
                kVar5.j();
                n nVar4 = kVar5.x;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar5.w;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.y0);
                        }
                    }
                }
                kVar5.o();
                n nVar5 = kVar5.x;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar5.x = null;
                }
                kVar5.Z = false;
                t0 t0Var = (t0) kVar5.k.b;
                t0Var.i.post(new i0(t0Var, 3));
                return;
            case 8:
                this.b.H();
                return;
            default:
                this.b.b0();
                return;
        }
    }
}
