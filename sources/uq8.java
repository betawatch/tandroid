// default package

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uq8 extends kea {
    public final /* synthetic */ ProfileActivity U2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq8(ProfileActivity profileActivity, Activity activity, String str, String str2) {
        super(activity, null, str, false, str2, false, null);
        this.U2 = profileActivity;
    }

    @Override // kea
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (z) {
            hl.d3(new hp8(this, zh6Var, i, (byte) 9), 250L);
        }
    }
}
