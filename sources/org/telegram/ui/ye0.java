package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ af0 b;

    public /* synthetic */ ye0(af0 af0Var, int i10) {
        this.a = i10;
        this.b = af0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                af0 af0Var = this.b;
                org.telegram.ui.Components.kj0 kj0Var = af0Var.e;
                kj0Var.getAnimatedDrawable().N(0, false, false);
                kj0Var.d();
                de0 de0Var = af0Var.a;
                if (de0Var != null) {
                    de0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                af0 af0Var2 = this.b;
                int i10 = 0;
                af0Var2.w = false;
                while (true) {
                    hs[] hsVarArr = af0Var2.a.f;
                    if (i10 >= hsVarArr.length) {
                        break;
                    } else {
                        hsVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                af0 af0Var3 = this.b;
                af0Var3.postDelayed(new ye0(af0Var3, 3), 150L);
                ye0 ye0Var = af0Var3.x;
                af0Var3.removeCallbacks(ye0Var);
                af0Var3.postDelayed(ye0Var, 3000L);
                af0Var3.w = true;
                break;
            default:
                de0 de0Var2 = this.b.a;
                int i11 = 0;
                de0Var2.e = false;
                de0Var2.f[0].requestFocus();
                while (true) {
                    hs[] hsVarArr2 = de0Var2.f;
                    if (i11 >= hsVarArr2.length) {
                        break;
                    } else {
                        hsVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
