package sg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.t50;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ w(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        k0 k0Var = this.b;
        switch (i10) {
            case 0:
                if (LaunchActivity.R() != null) {
                    l2 l2Var = new l2();
                    l2Var.a = true;
                    k0Var.K0.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), l2Var);
                    break;
                }
                break;
            case 1:
                k0Var.x0.e(k0Var.b0, false);
                k0Var.z1();
                break;
            case 2:
                HashSet hashSet = k0Var.y0;
                yc X = yc.X();
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
                di.d dVar = k0Var.S0;
                TLRPC.ChatFull t12 = k0Var.t1();
                dVar.b(Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), false);
                break;
            default:
                if (ChatObject.hasAdminRights(k0Var.s1())) {
                    if (k0Var.E0.getParent() != null) {
                        ((ViewGroup) k0Var.E0.getParent()).removeView(k0Var.E0);
                    }
                    t50 t50Var = k0Var.L0;
                    if (t50Var != null && t50Var.getParent() != null) {
                        ((ViewGroup) k0Var.L0.getParent()).removeView(k0Var.L0);
                    }
                    k0Var.d.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
