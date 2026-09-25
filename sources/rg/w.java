package rg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.n50;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j0 b;

    public /* synthetic */ w(j0 j0Var, int i10) {
        this.a = i10;
        this.b = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        j0 j0Var = this.b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    k2 k2Var = new k2();
                    k2Var.a = true;
                    j0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), k2Var);
                    break;
                }
                break;
            case 1:
                j0Var.x0.e(j0Var.b0, false);
                j0Var.z1();
                break;
            case 2:
                HashSet hashSet = j0Var.y0;
                xc X = xc.X();
                if (X != null) {
                    if (hashSet.size() != 1) {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("InviteLinkSent", hashSet.size(), Integer.valueOf(hashSet.size())))).j();
                        break;
                    } else {
                        X.Q(R.raw.voip_invite, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.InviteLinkSentSingle, ContactsController.formatName((TLRPC.User) hashSet.iterator().next())))).j();
                        break;
                    }
                }
                break;
            case 3:
                ci.d dVar = j0Var.S0;
                TLRPC.ChatFull t12 = j0Var.t1();
                dVar.b(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(j0Var.s1())) {
                    if (j0Var.E0.getParent() != null) {
                        ((ViewGroup) j0Var.E0.getParent()).removeView(j0Var.E0);
                    }
                    n50 n50Var = j0Var.L0;
                    if (n50Var != null && n50Var.getParent() != null) {
                        ((ViewGroup) j0Var.L0.getParent()).removeView(j0Var.L0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
