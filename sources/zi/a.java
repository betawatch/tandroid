package zi;

import android.os.Handler;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ a(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u uVar;
        o oVar;
        boolean z10;
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            case 1:
                l lVar = this.b;
                int y10 = lVar.y();
                if (y10 == lVar.B0 || (uVar = lVar.v) == null) {
                    return;
                }
                lVar.B0 = y10;
                uVar.s0 = y10;
                Handler handler = uVar.u;
                if (uVar.r0 && handler != null) {
                    handler.post(new nb1(uVar, y10, 14));
                }
                lVar.j.b("display rotation applied: degrees=" + y10);
                return;
            case 2:
                this.b.a0();
                return;
            case 3:
                l lVar2 = this.b;
                Handler handler2 = lVar2.n;
                if (handler2 != null) {
                    handler2.post(new a(lVar2, 4));
                    return;
                }
                return;
            case 4:
                l lVar3 = this.b;
                if (!lVar3.U || lVar3.z == null || (oVar = lVar3.w) == null) {
                    return;
                }
                synchronized (oVar) {
                    z10 = oVar.E;
                }
                if (z10) {
                    return;
                }
                try {
                    o oVar2 = lVar3.w;
                    lVar3.x = oVar2;
                    Handler handler3 = lVar3.n;
                    if (handler3 != null) {
                        handler3.removeCallbacks(lVar3.k1);
                        handler3.postDelayed(lVar3.k1, 3000L);
                    }
                    oVar2.t(new d(lVar3, oVar2, 0), new d(lVar3, oVar2, 1));
                    lVar3.j.b("first camera frame received; audio startup requested: segmentElapsedMs=" + l.z(lVar3.C0));
                    return;
                } catch (RuntimeException e10) {
                    lVar3.j();
                    lVar3.M(e10);
                    return;
                }
            case 5:
                l lVar4 = this.b;
                o oVar3 = lVar4.x;
                if (!lVar4.U || lVar4.Y || oVar3 == null || lVar4.w != oVar3) {
                    return;
                }
                lVar4.x = null;
                lVar4.M(new IllegalStateException("Timed out waiting for synchronized audio and video start"));
                return;
            case 6:
                this.b.f();
                return;
            case 7:
                l lVar5 = this.b;
                lVar5.U = false;
                lVar5.j();
                o oVar4 = lVar5.w;
                if (oVar4 != null) {
                    long p10 = oVar4.p();
                    u uVar2 = lVar5.v;
                    if (uVar2 != null && p10 != Long.MAX_VALUE) {
                        uVar2.q = Math.max(0L, p10) * 1000;
                        Handler handler4 = uVar2.u;
                        if (handler4 != null) {
                            handler4.removeCallbacks(uVar2.y0);
                        }
                    }
                }
                lVar5.n();
                o oVar5 = lVar5.w;
                if (oVar5 != null) {
                    oVar5.u();
                    lVar5.w = null;
                }
                lVar5.Y = false;
                v0 v0Var = (v0) lVar5.k.a;
                v0Var.i.post(new j0(v0Var, 3));
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
