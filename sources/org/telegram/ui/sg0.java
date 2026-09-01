package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wg0 b;

    public /* synthetic */ sg0(wg0 wg0Var, int i10) {
        this.a = i10;
        this.b = wg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ch.b[] bVarArr;
        switch (this.a) {
            case 0:
                wg0.b0(this.b);
                break;
            case 1:
                wg0 wg0Var = this.b;
                wg0Var.getClass();
                l9.m0(wg0Var);
                break;
            case 2:
                wg0.c0(this.b);
                break;
            case 3:
                wg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.N);
                break;
            case 5:
                wg0 wg0Var2 = this.b;
                wg0Var2.getClass();
                new uj0(wg0Var2.getParentActivity(), wg0Var2).show();
                break;
            case 6:
                wg0 wg0Var3 = this.b;
                wg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                wg0Var3.presentFragment(new l9(bundle));
                break;
            default:
                wg0 wg0Var4 = this.b;
                if (wg0Var4.getParentActivity() != null && (bVarArr = wg0Var4.H) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (wg0Var4.b.getWidth() - ((bVarArr[4].getX() + wg0Var4.C.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    qh.f3 f3Var = new qh.f3(wg0Var4.getParentActivity(), 3);
                    wg0Var4.N = f3Var;
                    f3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-wg0Var4.I));
                    wg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    wg0Var4.N.q(false);
                    wg0Var4.N.i();
                    wg0Var4.N.t(LocaleController.getString(R.string.SwitchAccountHint));
                    wg0Var4.N.m(1.0f, (-width) + 7.33f);
                    wg0Var4.b.addView(wg0Var4.N, k7.c6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    qh.f3 f3Var2 = wg0Var4.N;
                    f3Var2.i0 = new sg0(wg0Var4, 4);
                    f3Var2.d = 8000L;
                    f3Var2.v();
                    org.telegram.ui.Components.n40.r.b();
                    break;
                }
                break;
        }
    }
}
