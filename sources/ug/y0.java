package ug;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.PrivacyControlActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                this.b.b0(true);
                break;
            case 1:
                this.b.d0.setVisibility(8);
                break;
            case 2:
                l1 l1Var = this.b;
                l1Var.W();
                l1Var.i0(true, false);
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
                l1Var2.W();
                l1Var2.i0(true, false);
                break;
            case 6:
                this.b.c0(true);
                break;
            case 7:
                this.b.d0.setVisibility(8);
                break;
            case 8:
                l1 l1Var3 = this.b;
                l1Var3.W();
                l1Var3.i0(true, false);
                break;
            case 9:
                o2 o2Var = this.b.n;
                if (o2Var != null) {
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    o2Var.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
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
                l1 l1Var4 = this.b;
                l1Var4.W();
                l1Var4.i0(true, false);
                break;
        }
    }
}
