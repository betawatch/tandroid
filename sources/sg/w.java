package sg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.e50;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                    m2 m2Var = new m2();
                    m2Var.a = true;
                    j0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), m2Var);
                    break;
                }
                break;
            case 1:
                j0Var.x0.g(j0Var.b0, false);
                j0Var.D1();
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
                ei.d dVar = j0Var.S0;
                TLRPC.ChatFull x12 = j0Var.x1();
                dVar.b(Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(j0Var.w1())) {
                    if (j0Var.E0.getParent() != null) {
                        ((ViewGroup) j0Var.E0.getParent()).removeView(j0Var.E0);
                    }
                    e50 e50Var = j0Var.L0;
                    if (e50Var != null && e50Var.getParent() != null) {
                        ((ViewGroup) j0Var.L0.getParent()).removeView(j0Var.L0);
                    }
                    j0Var.d.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
