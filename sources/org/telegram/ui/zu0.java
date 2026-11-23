package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Components.gg0 {
    public final /* synthetic */ ProfileActivity t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, pu0 pu0Var, yu0 yu0Var, org.telegram.ui.Components.cg0 cg0Var, org.telegram.ui.Components.yf0 yf0Var) {
        super(context, j3, kVar, pu0Var, yu0Var, cg0Var, yf0Var);
        this.t1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.gg0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.t1;
        profileActivity.t5 = f10;
        profileActivity.Q3();
    }
}
