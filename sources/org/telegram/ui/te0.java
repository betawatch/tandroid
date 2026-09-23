package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ve0 b;

    public /* synthetic */ te0(ve0 ve0Var, int i10) {
        this.a = i10;
        this.b = ve0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ve0 ve0Var = this.b;
                org.telegram.ui.Components.bj0 bj0Var = ve0Var.e;
                bj0Var.getAnimatedDrawable().N(0, false, false);
                bj0Var.d();
                yd0 yd0Var = ve0Var.a;
                if (yd0Var != null) {
                    yd0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ve0 ve0Var2 = this.b;
                int i10 = 0;
                ve0Var2.w = false;
                while (true) {
                    bs[] bsVarArr = ve0Var2.a.f;
                    if (i10 >= bsVarArr.length) {
                        break;
                    } else {
                        bsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ve0 ve0Var3 = this.b;
                ve0Var3.postDelayed(new te0(ve0Var3, 3), 150L);
                te0 te0Var = ve0Var3.x;
                ve0Var3.removeCallbacks(te0Var);
                ve0Var3.postDelayed(te0Var, 3000L);
                ve0Var3.w = true;
                break;
            default:
                yd0 yd0Var2 = this.b.a;
                int i11 = 0;
                yd0Var2.e = false;
                yd0Var2.f[0].requestFocus();
                while (true) {
                    bs[] bsVarArr2 = yd0Var2.f;
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
