package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class tz0 extends org.telegram.ui.Components.yh0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.l lVar, jz0 jz0Var, sz0 sz0Var, org.telegram.ui.Components.th0 th0Var, org.telegram.ui.Components.ph0 ph0Var) {
        super(context, j3, lVar, jz0Var, sz0Var, th0Var, ph0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.yh0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
