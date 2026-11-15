package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
