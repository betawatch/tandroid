package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.i5;
import org.telegram.messenger.np;
import org.telegram.messenger.o10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ v(k0 k0Var, int i7) {
        this.a = i7;
        this.b = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        k0 k0Var = this.b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    e2 e2Var = new e2();
                    e2Var.a = true;
                    k0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), e2Var);
                    break;
                }
                break;
            case 1:
                k0Var.t2.g(k0Var.X1, false);
                k0Var.u1();
                break;
            case 2:
                HashSet hashSet = k0Var.u2;
                lc Y = lc.Y();
                if (Y != null) {
                    o10.u(hashSet.size() == 1 ? hd.a0(null, null, 2131748950, i5.p((TLRPC.User) hashSet.iterator().next())) : hd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), Y, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                hi.e eVar = k0Var.O2;
                TLRPC.ChatFull P0 = np.u1(k0Var.a).P0(-k0Var.W1);
                eVar.c(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), false);
                break;
            default:
                if (v3.N(k0Var.o1())) {
                    if (k0Var.A2.getParent() != null) {
                        ((ViewGroup) k0Var.A2.getParent()).removeView(k0Var.A2);
                    }
                    uv uvVar = k0Var.H2;
                    if (uvVar != null && uvVar.getParent() != null) {
                        ((ViewGroup) k0Var.H2.getParent()).removeView(k0Var.H2);
                    }
                    k0Var.o1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
