package wg;

import org.telegram.messenger.p10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g0 b;

    public /* synthetic */ e0(g0 g0Var, int i7) {
        this.a = i7;
        this.b = g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g0.l1(this.b);
                break;
            default:
                g0 g0Var = this.b;
                ug.f1 f1Var = new ug.f1(g0Var.r1, p10.s0, null, null, null, g0Var.I0);
                f1Var.E2 = true;
                f1Var.F2 = true;
                f1Var.X1 = true;
                g0Var.r1.showDialog(f1Var);
                break;
        }
    }
}
