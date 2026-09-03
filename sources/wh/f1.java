package wh;

import org.telegram.ui.ti0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z1 b;

    public /* synthetic */ f1(z1 z1Var, int i10) {
        this.a = i10;
        this.b = z1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B0();
                break;
            case 1:
                z1 z1Var = this.b;
                if (z1Var.H0 != 0) {
                    z1Var.X.setVisibility(8);
                    break;
                }
                break;
            case 2:
                z1 z1Var2 = this.b;
                if (z1Var2.H0 != 1) {
                    z1Var2.e0.setVisibility(8);
                    break;
                }
                break;
            case 3:
                z1 z1Var3 = this.b;
                if (z1Var3.H0 != 2) {
                    z1Var3.s0.setVisibility(8);
                    break;
                }
                break;
            case 4:
                z1.V(this.b);
                break;
            case 5:
                z1 z1Var4 = this.b;
                z1Var4.s0(2147483646, 0, true);
                ti0 ti0Var = z1Var4.L0;
                if (ti0Var != null) {
                    ti0Var.h(false);
                    z1Var4.L0 = null;
                    break;
                }
                break;
            default:
                z1 z1Var5 = this.b;
                z1Var5.s0(0, 0, false);
                ti0 ti0Var2 = z1Var5.L0;
                if (ti0Var2 != null) {
                    ti0Var2.h(true);
                    z1Var5.L0 = null;
                    break;
                }
                break;
        }
    }
}
