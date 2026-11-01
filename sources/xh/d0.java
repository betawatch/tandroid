package xh;

import th.r4;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class d0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((e0) this.b).d();
                break;
            case 1:
                ((p0) this.b).c();
                break;
            case 2:
                ((p0) this.b).c();
                break;
            case 3:
                ((q0) this.b).a();
                break;
            case 4:
                ((r0) this.b).a();
                break;
            case 5:
                ((l2) this.b).invalidate();
                break;
            case 6:
                ((e2.f) this.b).e();
                break;
            case 7:
                i3 i3Var = (i3) this.b;
                i3Var.Q = i3Var.r;
                break;
            default:
                r4 r4Var = ((zf.b1) this.b).D;
                if (r4Var != null) {
                    r4Var.p(3, true);
                    break;
                }
                break;
        }
    }
}
