package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ch0 b;

    public /* synthetic */ yg0(ch0 ch0Var, int i10) {
        this.a = i10;
        this.b = ch0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oh.b[] bVarArr;
        switch (this.a) {
            case 0:
                ch0.Z(this.b);
                break;
            case 1:
                ch0 ch0Var = this.b;
                ch0Var.getClass();
                m9.g0(ch0Var);
                break;
            case 2:
                ch0.c0(this.b);
                break;
            case 3:
                ch0.Y(this.b);
                break;
            case 4:
                ch0 ch0Var2 = this.b;
                ch0Var2.getClass();
                new ak0(ch0Var2.getParentActivity(), ch0Var2).show();
                break;
            case 5:
                ch0 ch0Var3 = this.b;
                ch0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putBoolean("needFinishFragment", false);
                ch0Var3.presentFragment(new m9(bundle));
                break;
            case 6:
                ch0 ch0Var4 = this.b;
                if (ch0Var4.getParentActivity() != null && (bVarArr = ch0Var4.K) != null) {
                    float width = ((r1.getWidth() / 2.0f) + (ch0Var4.b.getWidth() - ((bVarArr[4].getX() + ch0Var4.F.getX()) + r1.getWidth()))) / AndroidUtilities.density;
                    ci.e4 e4Var = new ci.e4(ch0Var4.getParentActivity(), 3);
                    ch0Var4.P = e4Var;
                    e4Var.setTranslationY(AndroidUtilities.dp(4.0f) + (-ch0Var4.L));
                    ch0Var4.P.setPadding(AndroidUtilities.dp(7.33f), 0, AndroidUtilities.dp(7.33f), 0);
                    ch0Var4.P.p(false);
                    ch0Var4.P.i();
                    ch0Var4.P.s(LocaleController.getString(R.string.SwitchAccountHint));
                    ch0Var4.P.l(1.0f, (-width) + 7.33f);
                    ch0Var4.b.addView(ch0Var4.P, w7.z5.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
                    ci.e4 e4Var2 = ch0Var4.P;
                    e4Var2.l0 = new yg0(ch0Var4, 7);
                    e4Var2.d = 8000L;
                    e4Var2.u();
                    org.telegram.ui.Components.n40.r.b();
                    break;
                }
                break;
            default:
                AndroidUtilities.removeFromParent(this.b.P);
                break;
        }
    }
}
