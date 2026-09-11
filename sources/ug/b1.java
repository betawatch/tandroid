package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n1 b;

    public /* synthetic */ b1(n1 n1Var, int i10) {
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
                i1 i1Var = this.b.Z;
                i1Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                i1 i1Var2 = this.b.Z;
                i1Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
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
                n2 n2Var = this.b.n;
                if (n2Var != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    n2Var.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
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
