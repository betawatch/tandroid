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
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                    i0Var.C2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), d2Var);
                    break;
                }
                break;
            case 1:
                i0Var.p2.g(i0Var.T1, false);
                i0Var.t1();
                break;
            case 2:
                HashSet hashSet = i0Var.q2;
                hc X = hc.X();
                if (X != null) {
                    org.telegram.messenger.camera.q.s(hashSet.size() == 1 ? id.a0(null, null, 2131749143, g5.p((TLRPC.User) hashSet.iterator().next())) : id.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), X, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                fi.d dVar = i0Var.K2;
                TLRPC.ChatFull N0 = qp.s1(i0Var.a).N0(-i0Var.S1);
                dVar.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                break;
            default:
                if (t3.N(i0Var.n1())) {
                    if (i0Var.w2.getParent() != null) {
                        ((ViewGroup) i0Var.w2.getParent()).removeView(i0Var.w2);
                    }
                    n00 n00Var = i0Var.D2;
                    if (n00Var != null && n00Var.getParent() != null) {
                        ((ViewGroup) i0Var.D2.getParent()).removeView(i0Var.D2);
                    }
                    i0Var.k1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
