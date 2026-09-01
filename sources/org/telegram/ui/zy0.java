package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class zy0 extends org.telegram.ui.Components.xh0 {
    public final /* synthetic */ ProfileActivity p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, oy0 oy0Var, yy0 yy0Var, org.telegram.ui.Components.sh0 sh0Var, org.telegram.ui.Components.oh0 oh0Var) {
        super(context, j10, kVar, oy0Var, yy0Var, sh0Var, oh0Var);
        this.p1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.xh0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.p1;
        profileActivity.k5 = f10;
        profileActivity.B3();
    }
}
