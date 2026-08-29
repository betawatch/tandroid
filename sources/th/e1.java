package th;

import org.telegram.ui.ki0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ e1(x1 x1Var, int i10) {
        this.a = i10;
        this.b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                x1 x1Var = this.b;
                if (x1Var.G0 != 0) {
                    x1Var.W.setVisibility(8);
                    break;
                }
                break;
            case 2:
                x1 x1Var2 = this.b;
                if (x1Var2.G0 != 1) {
                    x1Var2.d0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                x1 x1Var3 = this.b;
                if (x1Var3.G0 != 2) {
                    x1Var3.r0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                x1.V(this.b);
                break;
            case 5:
                x1 x1Var4 = this.b;
                x1Var4.s0(2147483646, 0, true);
                ki0 ki0Var = x1Var4.K0;
                if (ki0Var != null) {
                    ki0Var.h(false);
                    x1Var4.K0 = null;
                    break;
                }
                break;
            default:
                x1 x1Var5 = this.b;
                x1Var5.s0(0, 0, false);
                ki0 ki0Var2 = x1Var5.K0;
                if (ki0Var2 != null) {
                    ki0Var2.h(true);
                    x1Var5.K0 = null;
                    break;
                }
                break;
        }
    }
}
