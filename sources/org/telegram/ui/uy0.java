package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class uy0 extends org.telegram.ui.Components.ki0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, jy0 jy0Var, ty0 ty0Var, org.telegram.ui.Components.fi0 fi0Var, org.telegram.ui.Components.bi0 bi0Var) {
        super(context, j10, kVar, jy0Var, ty0Var, fi0Var, bi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
