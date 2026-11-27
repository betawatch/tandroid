// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ xn0(long j, zu1 zu1Var) {
        this.a = (byte) 7;
        this.c = j;
        this.b = zu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        zu1 zu1Var = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                d31.b0(zu1Var).I(R.raw.stars_topup, ob6.M0(2131744749, null), hl.S2(ob6.H(',', "StarsGiveawaySentPopupInfo", (int) j))).k(true);
                break;
            case 1:
                zu1Var.getMessagesController().e3(0, j, true);
                break;
            case 2:
                zu1Var.e6.put(j, 0);
                l1c l1cVar = zu1Var.g2;
                if (l1cVar != null) {
                    l1cVar.setAllTopicsHidden(false);
                }
                if (j == zu1Var.s4) {
                    zu1Var.D0.J(false);
                    break;
                }
                break;
            case 3:
                zu1 zu1Var2 = this.b;
                v21 v = d31.v(zu1Var2.getParentActivity(), zu1Var2, null, 1, this.c, 1, zu1Var2.getThemedColor(aob.wj), zu1Var2.getThemedColor(aob.yj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            case 4:
                zu1Var.presentFragment(zu1.ha(j));
                break;
            case 5:
                zu1Var.presentFragment(ProfileActivity.Q2(j));
                break;
            case 6:
                zu1Var.h9(j);
                break;
            default:
                zu1Var.presentFragment(new ProfileActivity(qu6.k(j, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ xn0(zu1 zu1Var, long j, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = j;
    }
}
