package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class rz0 extends org.telegram.ui.Components.ph0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, hz0 hz0Var, qz0 qz0Var, org.telegram.ui.Components.kh0 kh0Var, org.telegram.ui.Components.gh0 gh0Var) {
        super(context, j3, kVar, hz0Var, qz0Var, kh0Var, gh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ph0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
