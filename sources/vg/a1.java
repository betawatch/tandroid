package vg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ a1(n1 n1Var, int i10) {
        this.a = i10;
        this.b = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b0(true);
                break;
            case 1:
                this.b.d0.setVisibility(8);
                break;
            case 2:
                n1 n1Var = this.b;
                n1Var.W();
                n1Var.i0(true, false);
                break;
            case 3:
                h1 h1Var = this.b.Z;
                h1Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                h1 h1Var2 = this.b.Z;
                h1Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                n1 n1Var2 = this.b;
                n1Var2.W();
                n1Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                n1 n1Var3 = this.b;
                n1Var3.W();
                n1Var3.i0(true, false);
                break;
            case 9:
                r2 r2Var = this.b.n;
                if (r2Var != null) {
                    p2 p2Var = new p2();
                    p2Var.a = true;
                    r2Var.showAsSheet(new PrivacyControlActivity(11, false), p2Var);
                    break;
                }
                break;
            case 10:
                this.b.h0(true, true);
                break;
            case 11:
                this.b.dismiss();
                break;
            default:
                n1 n1Var4 = this.b;
                n1Var4.W();
                n1Var4.i0(true, false);
                break;
        }
    }
}
