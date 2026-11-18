package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yt0 implements org.telegram.messenger.lr, pr {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ yt0(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.pr
    public void a() {
        ProfileActivity.j0(this.a, this.b);
    }

    @Override // org.telegram.messenger.lr
    public void d(boolean z10) {
        RectF rectF = ProfileActivity.Z6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (org.telegram.ui.ActionBar.h2) p5.c.h(2, fragmentStack)) instanceof bn) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ks.K2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
