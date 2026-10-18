package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
