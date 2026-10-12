package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class wz0 extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, lz0 lz0Var, vz0 vz0Var, org.telegram.ui.Components.ki0 ki0Var, org.telegram.ui.Components.gi0 gi0Var) {
        super(context, j10, kVar, lz0Var, vz0Var, ki0Var, gi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.pi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
