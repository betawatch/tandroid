package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zy0 extends org.telegram.ui.Components.ni0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, py0 py0Var, yy0 yy0Var, org.telegram.ui.Components.ii0 ii0Var, org.telegram.ui.Components.ei0 ei0Var) {
        super(context, j10, kVar, py0Var, yy0Var, ii0Var, ei0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ni0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.t5 = f7;
        profileActivity.J3();
    }
}
