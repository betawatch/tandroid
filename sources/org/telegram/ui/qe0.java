package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.Components.jj0 jj0Var = se0Var.e;
                jj0Var.getAnimatedDrawable().L(0, false, false);
                jj0Var.d();
                vd0 vd0Var = se0Var.a;
                if (vd0Var != null) {
                    vd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                se0 se0Var2 = this.b;
                int i10 = 0;
                se0Var2.w = false;
                while (true) {
                    bs[] bsVarArr = se0Var2.a.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].i(0.0f);
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
                vd0 vd0Var2 = this.b.a;
                int i11 = 0;
                vd0Var2.e = false;
                vd0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = vd0Var2.f;
                    if (i11 >= bsVarArr2.length) {
                        break;
                    } else {
                        bsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
