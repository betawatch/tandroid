package org.telegram.ui;

import android.graphics.RectF;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class ut0 implements org.telegram.messenger.nr, or {
    public final /* synthetic */ ProfileActivity a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ ut0(ProfileActivity profileActivity, TLRPC.User user) {
        this.a = profileActivity;
        this.b = user;
    }

    @Override // org.telegram.ui.or
    public void a() {
        ProfileActivity.j0(this.a, this.b);
    }

    @Override // org.telegram.messenger.nr
    public void j(boolean z10) {
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.a;
        if (profileActivity.getParentLayout() != null) {
            List fragmentStack = profileActivity.getParentLayout().getFragmentStack();
            if (((fragmentStack == null || fragmentStack.size() < 2) ? null : (org.telegram.ui.ActionBar.e2) r.b.h(2, fragmentStack)) instanceof an) {
                ((ActionBarLayout) profileActivity.getParentLayout()).b0(fragmentStack.size() - 2);
            }
        }
        profileActivity.N1 = true;
        profileActivity.finishFragment();
        profileActivity.getNotificationCenter().k(org.telegram.messenger.ns.K2, Long.valueOf(profileActivity.i1), this.b, profileActivity.F2, Boolean.valueOf(z10));
    }
}
