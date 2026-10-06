package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class we0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ye0 b;

    public /* synthetic */ we0(ye0 ye0Var, int i10) {
        this.a = i10;
        this.b = ye0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ye0 ye0Var = this.b;
                org.telegram.ui.Components.nj0 nj0Var = ye0Var.e;
                nj0Var.getAnimatedDrawable().N(0, false, false);
                nj0Var.d();
                be0 be0Var = ye0Var.a;
                if (be0Var != null) {
                    be0Var.f[0].requestFocus();
                    break;
                }
                break;
            case 1:
                ye0 ye0Var2 = this.b;
                int i10 = 0;
                ye0Var2.w = false;
                while (true) {
                    es[] esVarArr = ye0Var2.a.f;
                    if (i10 >= esVarArr.length) {
                        break;
                    } else {
                        esVarArr[i10].i(0.0f);
                        i10++;
                    }
                }
            case 2:
                ye0 ye0Var3 = this.b;
                ye0Var3.postDelayed(new we0(ye0Var3, 3), 150L);
                we0 we0Var = ye0Var3.x;
                ye0Var3.removeCallbacks(we0Var);
                ye0Var3.postDelayed(we0Var, 3000L);
                ye0Var3.w = true;
                break;
            default:
                be0 be0Var2 = this.b.a;
                int i11 = 0;
                be0Var2.e = false;
                be0Var2.f[0].requestFocus();
                while (true) {
                    es[] esVarArr2 = be0Var2.f;
                    if (i11 >= esVarArr2.length) {
                        break;
                    } else {
                        esVarArr2[i11].i(0.0f);
                        i11++;
                    }
                }
        }
    }
}
