// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class re6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ve6 b;

    public /* synthetic */ re6(ve6 ve6Var, byte b) {
        this.a = b;
        this.b = ve6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        byte b = this.a;
        ve6 ve6Var = this.b;
        switch (b) {
            case 0:
                ve6Var.o();
                break;
            case 1:
                PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "sms");
                mf6 mf6Var = ve6Var.w;
                i = ((d) mf6Var).currentAccount;
                premiumPreviewFragment.setCurrentAccount(i);
                mf6Var.presentFragment(premiumPreviewFragment);
                break;
            case 2:
                mf6 mf6Var2 = ve6Var.w;
                mf6Var2.I1(0, true, null, true);
                mf6Var2.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                break;
            case 3:
                mf6 mf6Var3 = ve6Var.w;
                mf6Var3.I1(0, true, null, true);
                mf6Var3.y1(k96.M0(2131745878, null), k96.M0(2131752009, null));
                break;
            default:
                ve6Var.b.setLoading(false);
                break;
        }
    }
}
