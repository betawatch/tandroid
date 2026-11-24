// default package

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i46 b;

    public /* synthetic */ s36(i46 i46Var, byte b) {
        this.a = b;
        this.b = i46Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        i46 i46Var = this.b;
        switch (b) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    i46Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), bh0Var);
                    break;
                }
                break;
            case 1:
                i46Var.s2.h(i46Var.W1, false);
                i46Var.k1();
                break;
            case 2:
                HashSet hashSet = i46Var.t2;
                c41 Y = c41.Y();
                if (Y != null) {
                    b10.u(hashSet.size() == 1 ? jb6.a0(null, null, 2131748900, bw2.p((TLRPC.User) hashSet.iterator().next())) : jb6.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), Y, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                b61 b61Var = i46Var.N2;
                TLRPC.ChatFull M0 = oc7.r1(i46Var.a).M0(-i46Var.V1);
                b61Var.c(Math.max(M0.boosts_unrestrict - M0.boosts_applied, 0), false);
                break;
            default:
                if (sd2.N(i46Var.e1())) {
                    if (i46Var.z2.getParent() != null) {
                        ((ViewGroup) i46Var.z2.getParent()).removeView(i46Var.z2);
                    }
                    sb sbVar = i46Var.G2;
                    if (sbVar != null && sbVar.getParent() != null) {
                        ((ViewGroup) i46Var.G2.getParent()).removeView(i46Var.G2);
                    }
                    i46Var.n1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
