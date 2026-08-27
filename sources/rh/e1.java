package rh;

import org.telegram.ui.ni0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                ni0 ni0Var = x1Var4.K0;
                if (ni0Var != null) {
                    ni0Var.h(false);
                    x1Var4.K0 = null;
                    break;
                }
                break;
            default:
                x1 x1Var5 = this.b;
                x1Var5.s0(0, 0, false);
                ni0 ni0Var2 = x1Var5.K0;
                if (ni0Var2 != null) {
                    ni0Var2.h(true);
                    x1Var5.K0 = null;
                    break;
                }
                break;
        }
    }
}
