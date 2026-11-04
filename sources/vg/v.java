package vg;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.hp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ v(i0 i0Var, int i3) {
        this.a = i3;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        i0 i0Var = this.b;
        switch (i3) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    b2 b2Var = new b2();
                    b2Var.a = true;
                    i0Var.D2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), b2Var);
                    break;
                }
                break;
            case 1:
                i0Var.q2.g(i0Var.U1, false);
                i0Var.t1();
                break;
            case 2:
                HashSet hashSet = i0Var.r2;
                fc X = fc.X();
                if (X != null) {
                    org.telegram.messenger.camera.q.s(hashSet.size() == 1 ? bd.a0(null, null, 2131749151, g5.p((TLRPC.User) hashSet.iterator().next())) : bd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), X, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                gi.d dVar = i0Var.L2;
                TLRPC.ChatFull N0 = hp.s1(i0Var.a).N0(-i0Var.T1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                break;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.x2.getParent() != null) {
                        ((ViewGroup) i0Var.x2.getParent()).removeView(i0Var.x2);
                    }
                    org.telegram.ui.Components.voip.r0 r0Var = i0Var.E2;
                    if (r0Var != null && r0Var.getParent() != null) {
                        ((ViewGroup) i0Var.E2.getParent()).removeView(i0Var.E2);
                    }
                    i0Var.l1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
