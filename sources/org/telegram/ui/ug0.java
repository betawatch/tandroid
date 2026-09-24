package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yg0 b;

    public /* synthetic */ ug0(yg0 yg0Var, int i10) {
        this.a = i10;
        this.b = yg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.b[] bVarArr;
        switch (this.a) {
            case 0:
                yg0.b0(this.b);
                break;
            case 1:
                yg0 yg0Var = this.b;
                yg0Var.getClass();
                k9.m0(yg0Var);
                break;
            case 2:
                yg0.c0(this.b);
                break;
            case 3:
                yg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                yg0 yg0Var2 = this.b;
                yg0Var2.getClass();
                new wj0(yg0Var2.getParentActivity(), yg0Var2).show();
                break;
            case 6:
                yg0 yg0Var3 = this.b;
                yg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                yg0Var3.presentFragment(new k9(bundle));
                break;
            default:
                yg0 yg0Var4 = this.b;
                if (yg0Var4.getParentActivity() != null && (bVarArr = yg0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (yg0Var4.b.getWidth() - ((bVarArr[4].getX() + yg0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(yg0Var4.getParentActivity(), 3);
                    yg0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-yg0Var4.L));
                    yg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    yg0Var4.P.p(false);
                    yg0Var4.P.i();
                    yg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    yg0Var4.P.l(1.0f, (-width) + 7.33f);
                    yg0Var4.b.addView(yg0Var4.P, w7.y5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = yg0Var4.P;
                    e4Var2.l0 = new ug0(yg0Var4, 4);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.k40.r.b();
                    break;
                }
                break;
        }
    }
}
