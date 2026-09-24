package org.telegram.ui;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class se0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ue0 b;

    public /* synthetic */ se0(ue0 ue0Var, int i10) {
        this.a = i10;
        this.b = ue0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ue0 ue0Var = this.b;
                org.telegram.ui.Components.lj0 lj0Var = ue0Var.e;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                xd0 xd0Var = ue0Var.a;
                if (xd0Var != null) {
                    xd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ue0 ue0Var2 = this.b;
                int i10 = 0;
                ue0Var2.w = false;
                while (true) {
                    as[] asVarArr = ue0Var2.a.f;
                    if (i10 >= asVarArr.length) {
                        break;
                    } else {
                        asVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ue0 ue0Var3 = this.b;
                ue0Var3.postDelayed(new se0(ue0Var3, 3), 150L);
                se0 se0Var = ue0Var3.x;
                ue0Var3.removeCallbacks(se0Var);
                ue0Var3.postDelayed(se0Var, 3000L);
                ue0Var3.w = true;
                break;
            default:
                xd0 xd0Var2 = this.b.a;
                int i11 = 0;
                xd0Var2.e = false;
                xd0Var2.f[0].requestFocus();
                while (true) {
                    as[] asVarArr2 = xd0Var2.f;
                    if (i11 >= asVarArr2.length) {
                        break;
                    } else {
                        asVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
