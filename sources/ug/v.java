package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ v(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        i0 i0Var = this.b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    d2 d2Var = new d2();
                    d2Var.a = true;
                    i0Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), d2Var);
                    break;
                }
                break;
            case 1:
                i0Var.s2.g(i0Var.W1, false);
                i0Var.t1();
                break;
            case 2:
                HashSet hashSet = i0Var.t2;
                gc X = gc.X();
                if (X != null) {
                    org.telegram.messenger.camera.q.s(hashSet.size() == 1 ? id.a0(null, null, 2131749143, g5.p((TLRPC.User) hashSet.iterator().next())) : id.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), X, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                fi.d dVar = i0Var.N2;
                TLRPC.ChatFull N0 = qp.s1(i0Var.a).N0(-i0Var.V1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                break;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.z2.getParent() != null) {
                        ((ViewGroup) i0Var.z2.getParent()).removeView(i0Var.z2);
                    }
                    o00 o00Var = i0Var.G2;
                    if (o00Var != null && o00Var.getParent() != null) {
                        ((ViewGroup) i0Var.G2.getParent()).removeView(i0Var.G2);
                    }
                    i0Var.n1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
