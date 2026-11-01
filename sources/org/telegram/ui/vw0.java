package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vw0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ ProfileActivity s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.s0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.i5, fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        super.v(i10, f7, f10, fVar);
        ProfileActivity.s1(this.s0);
    }
}
