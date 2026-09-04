package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class qz0 extends org.telegram.ui.Components.oh0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz0(ProfileActivity profileActivity, Context context, long j3, org.telegram.ui.ActionBar.k kVar, gz0 gz0Var, pz0 pz0Var, org.telegram.ui.Components.jh0 jh0Var, org.telegram.ui.Components.fh0 fh0Var) {
        super(context, j3, kVar, gz0Var, pz0Var, jh0Var, fh0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.oh0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.n5 = f7;
        profileActivity.B3();
    }
}
