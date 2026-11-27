// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ug6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zg6 b;

    public /* synthetic */ ug6(zg6 zg6Var, byte b) {
        this.a = b;
        this.b = zg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        zg6 zg6Var = this.b;
        switch (b) {
            case 0:
                zg6Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                qh6 qh6Var = zg6Var.w;
                i = ((e) qh6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                qh6Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                qh6 qh6Var2 = zg6Var.w;
                qh6Var2.J1(0, true, null, true);
                qh6Var2.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                break;
            case 3:
                qh6 qh6Var3 = zg6Var.w;
                qh6Var3.J1(0, true, null, true);
                qh6Var3.z1(ob6.M0(2131745798, null), ob6.M0(2131751986, null));
                break;
            default:
                zg6Var.b.setLoading(false);
                break;
        }
    }
}
