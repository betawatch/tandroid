package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l1 b;

    public /* synthetic */ y0(l1 l1Var, int i10) {
        this.a = i10;
        this.b = l1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0(true);
                break;
            case 1:
                this.b.d0.setVisibility(8);
                break;
            case 2:
                l1 l1Var = this.b;
                l1Var.X();
                l1Var.j0(true, false);
                break;
            case 3:
                f1 f1Var = this.b.Z;
                f1Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                f1 f1Var2 = this.b.Z;
                f1Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                l1 l1Var2 = this.b;
                l1Var2.X();
                l1Var2.j0(true, false);
                break;
            case 6:
                this.b.d0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                l1 l1Var3 = this.b;
                l1Var3.X();
                l1Var3.j0(true, false);
                break;
            case 9:
                n2 n2Var = this.b.n;
                if (n2Var != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                    break;
                }
                break;
            case 10:
                this.b.i0(true, true);
                break;
            case 11:
                this.b.dismiss();
                break;
            default:
                l1 l1Var4 = this.b;
                l1Var4.X();
                l1Var4.j0(true, false);
                break;
        }
    }
}
