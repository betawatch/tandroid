package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class re0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ te0 b;

    public /* synthetic */ re0(te0 te0Var, int i10) {
        this.a = i10;
        this.b = te0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                te0 te0Var = this.b;
                org.telegram.ui.Components.lj0 lj0Var = te0Var.e;
                lj0Var.getAnimatedDrawable().L(0, false, false);
                lj0Var.d();
                wd0 wd0Var = te0Var.a;
                if (wd0Var != null) {
                    wd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                te0 te0Var2 = this.b;
                int i10 = 0;
                te0Var2.w = false;
                while (true) {
                    cs[] csVarArr = te0Var2.a.f;
                    if (i10 >= csVarArr.length) {
                        break;
                    } else {
                        csVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                te0 te0Var3 = this.b;
                te0Var3.postDelayed(new re0(te0Var3, 3), 150L);
                re0 re0Var = te0Var3.x;
                te0Var3.removeCallbacks(re0Var);
                te0Var3.postDelayed(re0Var, 3000L);
                te0Var3.w = true;
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
