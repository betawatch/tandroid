package org.telegram.ui;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ty0 extends dq {
    public final /* synthetic */ boolean[] Z0;
    public final /* synthetic */ TLRPC.User a1;
    public final /* synthetic */ ProfileActivity b1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(ProfileActivity profileActivity, long j10, long j11, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str, int i10, boolean[] zArr, TLRPC.User user) {
        super(j10, j11, tL_chatAdminRights, tL_chatBannedRights, tL_chatBannedRights2, str, i10, true, false, null);
        this.b1 = profileActivity;
        this.Z0 = zArr;
        this.a1 = user;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (!z10 && z11 && this.Z0[0]) {
            ProfileActivity profileActivity = this.b1;
            if (org.telegram.ui.Components.tc.a(profileActivity)) {
                org.telegram.ui.Components.tc.C(profileActivity, this.a1.first_name).j();
            }
        }
    }
}
