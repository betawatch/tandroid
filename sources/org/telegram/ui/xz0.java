package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xz0 extends qq {
    public final /* synthetic */ boolean[] d1;
    public final /* synthetic */ TLRPC.User e1;
    public final /* synthetic */ ProfileActivity f1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xz0(ProfileActivity profileActivity, long j3, long j10, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j3, j10, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.f1 = profileActivity;
        this.d1 = zArr;
        this.e1 = user;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.d1[0]) {
            ProfileActivity profileActivity = this.f1;
            if (org.telegram.ui.Components.yc.a(profileActivity)) {
                org.telegram.ui.Components.yc.C(profileActivity, this.e1.first_name).j();
            }
        }
    }
}
