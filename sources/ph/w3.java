package ph;

import org.telegram.ui.d01;
import rh.e6;
import rh.y7;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ w3(g4 g4Var, int i10) {
        this.a = i10;
        this.b = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.f1(false);
                break;
            case 1:
                this.b.f1(true);
                break;
            case 2:
                g4 g4Var = this.b;
                rh.e4 e4Var = new rh.e4(g4Var.getContext(), g4Var.Q1, g4Var.R1, g4Var.I0, null);
                long j10 = g4Var.U1.id;
                String str = g4Var.X1;
                e4Var.f3 = true;
                e6.y(e4Var.a, false).K(j10, new d01(29, e4Var, str));
                break;
            case 3:
                g4 g4Var2 = this.b;
                w.g1(g4Var2.getContext(), g4Var2.U1, g4Var2.I0);
                break;
            case 4:
                g4 g4Var3 = this.b;
                new y7(g4Var3.getContext(), g4Var3.I0).show();
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
