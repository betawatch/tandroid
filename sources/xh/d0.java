package xh;

import th.r4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                h3 h3Var = (h3) this.b;
                h3Var.Q = h3Var.r;
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
