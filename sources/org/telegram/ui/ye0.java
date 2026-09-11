package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
                org.telegram.ui.Components.aj0 aj0Var = af0Var.e;
                aj0Var.getAnimatedDrawable().L(0, false, false);
                aj0Var.d();
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
                    gs[] gsVarArr = af0Var2.a.f;
                    if (i10 >= gsVarArr.length) {
                        break;
                    } else {
                        gsVarArr[i10].i(0.0f);
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
                    gs[] gsVarArr2 = de0Var2.f;
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
