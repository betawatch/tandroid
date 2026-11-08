package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xt0 implements org.telegram.messenger.qr, mr {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ xt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.mr
    public void a() {
        ProfileActivity.b0(this.a, this.b);
    }

    @Override // org.telegram.messenger.qr
    public void k(boolean z9) {
        RectF rectF = ProfileActivity.S6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (org.telegram.ui.ActionBar.f2) rf.b.g(2, fragmentStack)) instanceof an) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.M1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.qs.K2, Long.valueOf(profileActivity.h1), this.b, profileActivity.D2, Boolean.valueOf(z9));
    }
}
