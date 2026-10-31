package th;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o7 b;

    public /* synthetic */ i2(o7 o7Var, int i10) {
        this.a = i10;
        this.b = o7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d0();
                break;
            case 1:
                o7 o7Var = this.b;
                o7Var.c0 = true;
                o7Var.A(true);
                break;
            case 2:
                o7 o7Var2 = this.b;
                if (o7Var2.F != null) {
                    d7 d7Var = o7Var2.w;
                    if (d7Var != null) {
                        p.c = true;
                        d7Var.setLayerType(2, null);
                    }
                    o7Var2.F.addListener(new x6(o7Var2, 0));
                    o7Var2.F.setDuration(320L);
                    o7Var2.F.setInterpolator(gr.h);
                    o7Var2.F.start();
                    break;
                }
                break;
            case 3:
                o7 o7Var3 = this.b;
                o7Var3.v0 = null;
                o7Var3.d0();
                break;
            case 4:
                this.b.Z(true);
                break;
            case 5:
                o7 o7Var4 = this.b;
                o7Var4.e0();
                l7 l7Var = o7Var4.s0;
                ImageReceiver imageReceiver = l7Var.b;
                if (imageReceiver != null) {
                    imageReceiver.O0(false, true);
                }
                ImageReceiver imageReceiver2 = l7Var.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.O0(false, true);
                    break;
                }
                break;
            default:
                this.b.y();
                break;
        }
    }
}
