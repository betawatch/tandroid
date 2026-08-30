package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class xy0 extends org.telegram.ui.Components.vh0 {
    public final /* synthetic */ ProfileActivity p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, my0 my0Var, wy0 wy0Var, org.telegram.ui.Components.qh0 qh0Var, org.telegram.ui.Components.mh0 mh0Var) {
        super(context, j10, kVar, my0Var, wy0Var, qh0Var, mh0Var);
        this.p1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.vh0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.p1;
        profileActivity.k5 = f10;
        profileActivity.B3();
    }
}
