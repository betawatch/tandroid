package qh;

import org.telegram.ui.li0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;

    public /* synthetic */ e1(x1 x1Var, int i9) {
        this.a = i9;
        this.b = x1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A0();
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
                x1.U(this.b);
                break;
            case 5:
                x1 x1Var4 = this.b;
                x1Var4.r0(2147483646, 0, true);
                li0 li0Var = x1Var4.K0;
                if (li0Var != null) {
                    li0Var.h(false);
                    x1Var4.K0 = null;
                    break;
                }
                break;
            default:
                x1 x1Var5 = this.b;
                x1Var5.r0(0, 0, false);
                li0 li0Var2 = x1Var5.K0;
                if (li0Var2 != null) {
                    li0Var2.h(true);
                    x1Var5.K0 = null;
                    break;
                }
                break;
        }
    }
}
