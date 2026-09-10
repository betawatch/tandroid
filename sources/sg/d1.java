package sg;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1 b;

    public /* synthetic */ d1(p1 p1Var, int i10) {
        this.a = i10;
        this.b = p1Var;
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
                p1 p1Var = this.b;
                p1Var.W();
                p1Var.i0(true, false);
                break;
            case 3:
                k1 k1Var = this.b.Z;
                k1Var.b.setHintText(LocaleController.getString(R.string.Search), true);
                break;
            case 4:
                k1 k1Var2 = this.b.Z;
                k1Var2.b.setHintText(LocaleController.getString(R.string.GiftPremiumUsersSearchHint), true);
                break;
            case 5:
                p1 p1Var2 = this.b;
                p1Var2.W();
                p1Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                p1 p1Var3 = this.b;
                p1Var3.W();
                p1Var3.i0(true, false);
                break;
            case 9:
                p2 p2Var = this.b.n;
                if (p2Var != null) {
                    n2 n2Var = new n2();
                    n2Var.a = true;
                    p2Var.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
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
                p1 p1Var4 = this.b;
                p1Var4.W();
                p1Var4.i0(true, false);
                break;
        }
    }
}
