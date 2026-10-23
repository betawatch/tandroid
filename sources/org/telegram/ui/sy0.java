package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.Components.li0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hy0 hy0Var, ry0 ry0Var, org.telegram.ui.Components.gi0 gi0Var, org.telegram.ui.Components.ci0 ci0Var) {
        super(context, j10, kVar, hy0Var, ry0Var, gi0Var, ci0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.li0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
