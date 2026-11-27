// default package

import android.view.ViewGroup;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l46 b;

    public /* synthetic */ w36(l46 l46Var, byte b) {
        this.a = b;
        this.b = l46Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        l46 l46Var = this.b;
        switch (b) {
            case 0:
                if (LaunchActivity.Q() != null) {
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    l46Var.F2.showAsSheet(new PremiumPreviewFragment(0, "noncontacts"), bg0Var);
                    break;
                }
                break;
            case 1:
                l46Var.s2.h(l46Var.W1, false);
                l46Var.l1();
                break;
            case 2:
                HashSet hashSet = l46Var.t2;
                d31 Y = d31.Y();
                if (Y != null) {
                    c00.v(hashSet.size() == 1 ? ob6.a0(null, null, 2131748897, lv2.p((TLRPC.User) hashSet.iterator().next())) : ob6.G(hashSet.size(), "InviteLinkSent", Integer.valueOf(hashSet.size())), Y, R.raw.voip_invite, 36);
                    break;
                }
                break;
            case 3:
                c51 c51Var = l46Var.N2;
                TLRPC.ChatFull N0 = uc7.s1(l46Var.a).N0(-l46Var.V1);
                c51Var.c(Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0), false);
                break;
            default:
                if (xc2.N(l46Var.f1())) {
                    if (l46Var.z2.getParent() != null) {
                        ((ViewGroup) l46Var.z2.getParent()).removeView(l46Var.z2);
                    }
                    tb tbVar = l46Var.G2;
                    if (tbVar != null && tbVar.getParent() != null) {
                        ((ViewGroup) l46Var.G2.getParent()).removeView(l46Var.G2);
                    }
                    l46Var.n1.setPadding(0, 0, 0, 0);
                    break;
                }
                break;
        }
    }
}
