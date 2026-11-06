package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Components.sf0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, pu0 pu0Var, yu0 yu0Var, org.telegram.ui.Components.of0 of0Var, org.telegram.ui.Components.kf0 kf0Var) {
        super(context, j3, kVar, pu0Var, yu0Var, of0Var, kf0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.sf0
    public final void setCustomAvatarProgress(float f10) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f10;
        profileActivity.Q3();
    }
}
