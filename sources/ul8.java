// default package

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ul8 implements sc7, ht2 {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ ul8(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // ht2
    public final void a() {
        RectF rectF = ProfileActivity.Z6;
        this.a.G2(this.b);
    }

    @Override // sc7
    public final void k(boolean z) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (d) oo1.m(2, fragmentStack)) instanceof mu1) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(kk7.J2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z));
    }
}
