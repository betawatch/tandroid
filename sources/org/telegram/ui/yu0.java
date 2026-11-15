package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.Components.vf0 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, ou0 ou0Var, xu0 xu0Var, org.telegram.ui.Components.rf0 rf0Var, org.telegram.ui.Components.nf0 nf0Var) {
        super(context, j3, kVar, ou0Var, xu0Var, rf0Var, nf0Var);
        this.t1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.vf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.r5 = f10;
        profileActivity.P3();
    }
}
