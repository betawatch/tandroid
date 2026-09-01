package qh;

import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class y5 extends a6 {
    public final /* synthetic */ TLRPC.User b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(String str, TLRPC.User user) {
        super(str);
        this.b = user;
    }

    @Override // qh.a6
    public final String a() {
        return LocaleController.getString(R.string.ViewProfile);
    }

    @Override // qh.a6
    public final String b() {
        return UserObject.getUserName(this.b);
    }

    @Override // qh.a6
    public final void c(org.telegram.ui.ActionBar.p2 p2Var) {
        TLRPC.User user = this.b;
        if (user.id != UserConfig.getInstance(UserConfig.selectedAccount).getClientUserId()) {
            p2Var.presentFragment(ProfileActivity.m4(user.id));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        bundle.putBoolean("my_profile", true);
        p2Var.presentFragment(new ProfileActivity(bundle, null));
    }

    @Override // qh.a6
    public final void d(ImageReceiver imageReceiver) {
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        TLRPC.User user = this.b;
        z8Var.r(user);
        imageReceiver.setForUserOrChat(user, z8Var);
    }
}
