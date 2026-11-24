// default package

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn8 implements ue7, su2 {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ wn8(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // su2
    public final void a() {
        RectF rectF = ProfileActivity.e7;
        this.a.J2(this.b);
    }

    @Override // ue7
    public final void z(boolean z) {
        RectF rectF = ProfileActivity.e7;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (d) aq1.m(2, fragmentStack)) instanceof yv1) {
                ((ActionBarLayout) profileActivity.getParentLayout()).a0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(nm7.K2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z));
    }
}
