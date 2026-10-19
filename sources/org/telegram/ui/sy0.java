package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class sy0 extends org.telegram.ui.Components.ki0 {
    public final /* synthetic */ ProfileActivity s1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy0(ProfileActivity profileActivity, Context context, long j10, org.telegram.ui.ActionBar.k kVar, hy0 hy0Var, ry0 ry0Var, org.telegram.ui.Components.fi0 fi0Var, org.telegram.ui.Components.bi0 bi0Var) {
        super(context, j10, kVar, hy0Var, ry0Var, fi0Var, bi0Var);
        this.s1 = profileActivity;
    }

    @Override // org.telegram.ui.Components.ki0
    public final void setCustomAvatarProgress(float f7) {
        ProfileActivity profileActivity = this.s1;
        profileActivity.p5 = f7;
        profileActivity.B3();
    }
}
