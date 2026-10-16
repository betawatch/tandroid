package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vz0 extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, kz0 kz0Var, uz0 uz0Var, org.telegram.ui.Components.ki0 ki0Var, org.telegram.ui.Components.gi0 gi0Var) {
        super(context, j10, kVar, kz0Var, uz0Var, ki0Var, gi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.pi0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
