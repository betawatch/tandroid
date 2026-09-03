package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xg0 b;

    public /* synthetic */ tg0(xg0 xg0Var, int i10) {
        this.a = i10;
        this.b = xg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bh.b[] bVarArr;
        switch (this.a) {
            case 0:
                xg0.b0(this.b);
                break;
            case 1:
                xg0 xg0Var = this.b;
                xg0Var.getClass();
                n9.m0(xg0Var);
                break;
            case 2:
                xg0.c0(this.b);
                break;
            case 3:
                xg0.a0(this.b);
                break;
            case 4:
                AndroidUtilities.removeFromParent(this.b.N);
                break;
            case 5:
                xg0 xg0Var2 = this.b;
                xg0Var2.getClass();
                new uj0(xg0Var2.getParentActivity(), xg0Var2).show();
                break;
            case 6:
                xg0 xg0Var3 = this.b;
                xg0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                xg0Var3.presentFragment(new n9(bundle));
                break;
            default:
                xg0 xg0Var4 = this.b;
                if (xg0Var4.getParentActivity() != null && (bVarArr = xg0Var4.H) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (xg0Var4.b.getWidth() - ((bVarArr[4].getX() + xg0Var4.C.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ph.f3 f3Var = new ph.f3(xg0Var4.getParentActivity(), 3);
                    xg0Var4.N = f3Var;
                    f3Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-xg0Var4.I));
                    xg0Var4.N.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    xg0Var4.N.p(false);
                    xg0Var4.N.i();
                    xg0Var4.N.s(LocaleController.getString(R.string.SwitchAccountHint));
                    xg0Var4.N.l(1.0f, (-width) + 7.33f);
                    xg0Var4.b.addView(xg0Var4.N, k7.b6.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ph.f3 f3Var2 = xg0Var4.N;
                    f3Var2.i0 = new tg0(xg0Var4, 4);
                    f3Var2.d = 8000L;
                    f3Var2.u();
                    org.telegram.ui.Components.m40.r.b();
                    break;
                }
                break;
        }
    }
}
