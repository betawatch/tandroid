// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class sg6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wg6 b;

    public /* synthetic */ sg6(wg6 wg6Var, byte b) {
        this.a = b;
        this.b = wg6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        wg6 wg6Var = this.b;
        switch (b) {
            case 0:
                wg6Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                mh6 mh6Var = wg6Var.w;
                i = ((d) mh6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                mh6Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                mh6 mh6Var2 = wg6Var.w;
                mh6Var2.J1(0, true, null, true);
                mh6Var2.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                break;
            case 3:
                mh6 mh6Var3 = wg6Var.w;
                mh6Var3.J1(0, true, null, true);
                mh6Var3.z1(jb6.M0(2131745804, null), jb6.M0(2131751958, null));
                break;
            default:
                wg6Var.b.setLoading(false);
                break;
        }
    }
}
