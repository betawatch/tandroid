// default package

import org.telegram.messenger.beta.R;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xo0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ xo0(long j, yv1 yv1Var) {
        this.a = (byte) 7;
        this.c = j;
        this.b = yv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yv1 yv1Var = this.b;
        long j = this.c;
        switch (b) {
            case 0:
                c41.b0(yv1Var).I(R.raw.stars_topup, jb6.M0(2131744781, null), gm.S2(jb6.H(',', "StarsGiveawaySentPopupInfo", (int) j))).k(true);
                break;
            case 1:
                yv1Var.g9(j);
                break;
            case 2:
                yv1Var.getMessagesController().a3(0, j, true);
                break;
            case 3:
                yv1Var.presentFragment(yv1.ga(j));
                break;
            case 4:
                yv1Var.presentFragment(ProfileActivity.S2(j));
                break;
            case 5:
                yv1Var.e6.put(j, 0);
                mzb mzbVar = yv1Var.g2;
                if (mzbVar != null) {
                    mzbVar.setAllTopicsHidden(false);
                }
                if (j == yv1Var.s4) {
                    yv1Var.D0.J(false);
                    break;
                }
                break;
            case 6:
                yv1 yv1Var2 = this.b;
                u31 v = c41.v(yv1Var2.getParentActivity(), yv1Var2, null, 1, this.c, 1, yv1Var2.getThemedColor(cmb.vj), yv1Var2.getThemedColor(cmb.xj), 5000, true, null);
                v.k = true;
                v.k(true);
                break;
            default:
                yv1Var.presentFragment(new ProfileActivity(kt6.k(j, "user_id"), null));
                break;
        }
    }

    public /* synthetic */ xo0(yv1 yv1Var, long j, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = j;
    }
}
