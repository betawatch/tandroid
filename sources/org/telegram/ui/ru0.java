package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Components.vf0 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hu0 hu0Var, qu0 qu0Var, org.telegram.ui.Components.rf0 rf0Var, org.telegram.ui.Components.nf0 nf0Var) {
        super(context, j10, kVar, hu0Var, qu0Var, rf0Var, nf0Var);
        this.t1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.vf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.o5 = f10;
        profileActivity.Q3();
    }
}
