package vh;

import org.telegram.ui.ui0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ f1(y1 y1Var, int i10) {
        this.a = i10;
        this.b = y1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                y1 y1Var = this.b;
                if (y1Var.H0 != 0) {
                    y1Var.X.setVisibility(8);
                    break;
                }
                break;
            case 2:
                y1 y1Var2 = this.b;
                if (y1Var2.H0 != 1) {
                    y1Var2.e0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                y1 y1Var3 = this.b;
                if (y1Var3.H0 != 2) {
                    y1Var3.s0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                y1.V(this.b);
                break;
            case 5:
                y1 y1Var4 = this.b;
                y1Var4.s0(2147483646, 0, true);
                ui0 ui0Var = y1Var4.L0;
                if (ui0Var != null) {
                    ui0Var.h(false);
                    y1Var4.L0 = null;
                    break;
                }
                break;
            default:
                y1 y1Var5 = this.b;
                y1Var5.s0(0, 0, false);
                ui0 ui0Var2 = y1Var5.L0;
                if (ui0Var2 != null) {
                    ui0Var2.h(true);
                    y1Var5.L0 = null;
                    break;
                }
                break;
        }
    }
}
