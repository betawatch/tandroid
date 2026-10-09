package tg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m1 b;

    public /* synthetic */ a1(m1 m1Var, int i10) {
        this.a = i10;
        this.b = m1Var;
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
                m1 m1Var = this.b;
                m1Var.X();
                m1Var.j0(true, false);
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
                m1 m1Var2 = this.b;
                m1Var2.X();
                m1Var2.j0(true, false);
                break;
            case 6:
                this.b.d0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                m1 m1Var3 = this.b;
                m1Var3.X();
                m1Var3.j0(true, false);
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
                m1 m1Var4 = this.b;
                m1Var4.X();
                m1Var4.j0(true, false);
                break;
        }
    }
}
