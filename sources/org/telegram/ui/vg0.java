package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zg0 b;

    public /* synthetic */ vg0(zg0 zg0Var, int i10) {
        this.a = i10;
        this.b = zg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.b[] bVarArr;
        switch (this.a) {
            case 0:
                zg0.b0(this.b);
                break;
            case 1:
                zg0 zg0Var = this.b;
                zg0Var.getClass();
                k9.m0(zg0Var);
                break;
            case 2:
                zg0.c0(this.b);
                break;
            case 3:
                zg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
            case 5:
                zg0 zg0Var2 = this.b;
                zg0Var2.getClass();
                new wj0(zg0Var2.getParentActivity(), zg0Var2).show();
                break;
            case 6:
                zg0 zg0Var3 = this.b;
                zg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                zg0Var3.presentFragment(new k9(bundle));
                break;
            default:
                zg0 zg0Var4 = this.b;
                if (zg0Var4.getParentActivity() != null && (bVarArr = zg0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (zg0Var4.b.getWidth() - ((bVarArr[4].getX() + zg0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(zg0Var4.getParentActivity(), 3);
                    zg0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-zg0Var4.L));
                    zg0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    zg0Var4.P.p(false);
                    zg0Var4.P.i();
                    zg0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    zg0Var4.P.l(1.0f, (-width) + 7.33f);
                    zg0Var4.b.addView(zg0Var4.P, w7.x5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = zg0Var4.P;
                    e4Var2.l0 = new vg0(zg0Var4, 4);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.k40.r.b();
                    break;
                }
                break;
        }
    }
}
