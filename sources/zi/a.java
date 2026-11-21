package zi;

import android.os.Handler;
import org.telegram.ui.jw0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            case 1:
                k kVar = this.b;
                int y10 = kVar.y();
                if (y10 == kVar.B0 || (tVar = kVar.v) == null) {
                    return;
                }
                kVar.B0 = y10;
                tVar.s0 = y10;
                Handler handler = tVar.u;
                if (tVar.r0 && handler != null) {
                    handler.post(new jw0(tVar, y10, 17));
                }
                kVar.j.b("display rotation applied: degrees=" + y10);
                return;
            case 2:
                this.b.a0();
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
                if (!kVar3.U || kVar3.z == null || (nVar = kVar3.w) == null) {
                    return;
                }
                synchronized (nVar) {
                    z10 = nVar.E;
                }
                if (z10) {
                    return;
                }
                try {
                    n nVar2 = kVar3.w;
                    kVar3.x = nVar2;
                    Handler handler3 = kVar3.n;
                    if (handler3 != null) {
                        handler3.removeCallbacks(kVar3.k1);
                        handler3.postDelayed(kVar3.k1, 3000L);
                    }
                    nVar2.t(new d(kVar3, nVar2, 0), new d(kVar3, nVar2, 1));
                    kVar3.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + k.z(kVar3.C0));
                    return;
                } catch (RuntimeException e10) {
                    kVar3.j();
                    kVar3.M(e10);
                    return;
                }
            case 5:
                k kVar4 = this.b;
                n nVar3 = kVar4.x;
                if (!kVar4.U || kVar4.Y || nVar3 == null || kVar4.w != nVar3) {
                    return;
                }
                kVar4.x = null;
                kVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 6:
                k kVar5 = this.b;
                if (!kVar5.k0 || kVar5.M <= 0.0f) {
                    kVar5.f();
                    return;
                } else {
                    if (!kVar5.U || kVar5.V || kVar5.z == null || !kVar5.l0) {
                        return;
                    }
                    kVar5.x("zoom requested", null, 5);
                    return;
                }
            case 7:
                k kVar6 = this.b;
                kVar6.U = false;
                kVar6.j();
                n nVar4 = kVar6.w;
                if (nVar4 != null) {
                    long p10 = nVar4.p();
                    t tVar2 = kVar6.v;
                    if (tVar2 != null && p10 != Long.MAX_VALUE) {
                        tVar2.q = Math.max(0L, p10) * 1000;
                        Handler handler4 = tVar2.u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(tVar2.y0);
                        }
                    }
                }
                kVar6.n();
                n nVar5 = kVar6.w;
                if (nVar5 != null) {
                    nVar5.u();
                    kVar6.w = null;
                }
                kVar6.Y = false;
                u0 u0Var = (u0) kVar6.k.a;
                u0Var.i.post(new i0(u0Var, 3));
                return;
            case 8:
                this.b.G();
                return;
            default:
                this.b.a0();
                return;
        }
    }
}
