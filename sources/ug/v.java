package ug;

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.uv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class v implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ v(l0 l0Var, int i7) {
        this.a = i7;
        this.b = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        l0 l0Var = this.b;
        switch (i7) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    f2 f2Var = new f2();
                    f2Var.a = true;
                    l0Var.G2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), f2Var);
                    break;
                }
                break;
            case 1:
                l0Var.t2.g(l0Var.X1, false);
                l0Var.u1();
                break;
            case 2:
                HashSet hashSet = l0Var.u2;
                lc Y = lc.Y();
                if (Y != null) {
                    n10.u(hashSet.size() == 1 ? gd.a0(null, null, 2131748951, i5.p((TLRPC.User) hashSet.iterator().next())) : gd.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), Y, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                hi.d dVar = l0Var.O2;
                TLRPC.ChatFull P0 = mp.u1(l0Var.a).P0(-l0Var.W1);
                dVar.c(Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0), false);
                break;
            default:
                if (v3.N(l0Var.o1())) {
                    if (l0Var.A2.getParent() != null) {
                        ((ViewGroup) l0Var.A2.getParent()).removeView(l0Var.A2);
                    }
                    uv uvVar = l0Var.H2;
                    if (uvVar != null && uvVar.getParent() != null) {
                        ((ViewGroup) l0Var.H2.getParent()).removeView(l0Var.H2);
                    }
                    l0Var.o1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
