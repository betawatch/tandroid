package vh;

import org.telegram.ui.si0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y1 b;

    public /* synthetic */ e1(y1 y1Var, int i10) {
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
                si0 si0Var = y1Var4.L0;
                if (si0Var != null) {
                    si0Var.h(false);
                    y1Var4.L0 = null;
                    break;
                }
                break;
            default:
                y1 y1Var5 = this.b;
                y1Var5.s0(0, 0, false);
                si0 si0Var2 = y1Var5.L0;
                if (si0Var2 != null) {
                    si0Var2.h(true);
                    y1Var5.L0 = null;
                    break;
                }
                break;
        }
    }
}
