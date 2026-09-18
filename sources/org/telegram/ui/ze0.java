package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ze0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf0 b;

    public /* synthetic */ ze0(bf0 bf0Var, int i10) {
        this.a = i10;
        this.b = bf0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf0 bf0Var = this.b;
                org.telegram.ui.Components.lj0 lj0Var = bf0Var.e;
                lj0Var.getAnimatedDrawable().N(0, false, false);
                lj0Var.d();
                ee0 ee0Var = bf0Var.a;
                if (ee0Var != null) {
                    ee0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                bf0 bf0Var2 = this.b;
                int i10 = 0;
                bf0Var2.w = false;
                while (true) {
                    gs[] gsVarArr = bf0Var2.a.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                bf0 bf0Var3 = this.b;
                bf0Var3.postDelayed(new ze0(bf0Var3, 3), 150L);
                ze0 ze0Var = bf0Var3.x;
                bf0Var3.removeCallbacks(ze0Var);
                bf0Var3.postDelayed(ze0Var, 3000L);
                bf0Var3.w = true;
                break;
            default:
                ee0 ee0Var2 = this.b.a;
                int i11 = 0;
                ee0Var2.e = false;
                ee0Var2.f[0].requestFocus();
                while (true) {
                    gs[] gsVarArr2 = ee0Var2.f;
                    if (i11 >= gsVarArr2.length) {
                        break;
                    } else {
                        gsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
