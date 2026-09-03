package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ se0 b;

    public /* synthetic */ qe0(se0 se0Var, int i10) {
        this.a = i10;
        this.b = se0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                se0 se0Var = this.b;
                org.telegram.ui.Components.kj0 kj0Var = se0Var.e;
                kj0Var.getAnimatedDrawable().L(0, false, false);
                kj0Var.d();
                wd0 wd0Var = se0Var.a;
                if (wd0Var != null) {
                    wd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                se0 se0Var2 = this.b;
                int i10 = 0;
                se0Var2.w = false;
                while (true) {
                    cs[] csVarArr = se0Var2.a.f;
                    if (i10 >= csVarArr.length) {
                        break;
                    } else {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                se0 se0Var3 = this.b;
                se0Var3.postDelayed(new qe0(se0Var3, 3), 150L);
                qe0 qe0Var = se0Var3.x;
                se0Var3.removeCallbacks(qe0Var);
                se0Var3.postDelayed(qe0Var, 3000L);
                se0Var3.w = true;
                break;
            default:
                wd0 wd0Var2 = this.b.a;
                int i11 = 0;
                wd0Var2.e = false;
                wd0Var2.f[0].requestFocus();
                while (true) {
                    cs[] csVarArr2 = wd0Var2.f;
                    if (i11 >= csVarArr2.length) {
                        break;
                    } else {
                        csVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
