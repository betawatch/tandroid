package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.rv;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ v(j0 j0Var, int i7) {
        this.a = i7;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        j0 j0Var = this.b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    c2 c2Var = new c2();
                    c2Var.a = true;
                    j0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), c2Var);
                    break;
                }
                break;
            case 1:
                j0Var.t2.g(j0Var.X1, false);
                j0Var.t1();
                break;
            case 2:
                HashSet hashSet = j0Var.u2;
                cc X = cc.X();
                if (X != null) {
                    i20.t(hashSet.size() == 1 ? hd.a0(null, null, 2131749143, g5.p((TLRPC.User) hashSet.iterator().next())) : hd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), X, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                hi.d dVar = j0Var.O2;
                TLRPC.ChatFull N0 = np.s1(j0Var.a).N0(-j0Var.W1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                break;
            default:
                if (t3.N(j0Var.n1())) {
                    if (j0Var.A2.getParent() != null) {
                        ((ViewGroup) j0Var.A2.getParent()).removeView(j0Var.A2);
                    }
                    rv rvVar = j0Var.H2;
                    if (rvVar != null && rvVar.getParent() != null) {
                        ((ViewGroup) j0Var.H2.getParent()).removeView(j0Var.H2);
                    }
                    j0Var.o1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
