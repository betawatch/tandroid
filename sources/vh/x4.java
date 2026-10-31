package vh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x4 extends z4 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // vh.z4
    public final String a() {
        return cd.L0(2131743572, null);
    }

    @Override // vh.z4
    public final String b() {
        return h20.p(this.b);
    }

    @Override // vh.z4
    public final void c(org.telegram.ui.ActionBar.k2 k2Var) {
        TLRPC.User user = this.b;
        if (user.id != d20.i(d20.s0).e()) {
            k2Var.presentFragment(ProfileActivity.z4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        k2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // vh.z4
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        TLRPC.User user = this.b;
        r8Var.r(user);
        imageReceiver.i0(user, r8Var, null);
    }
}
