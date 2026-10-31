package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ww0 extends org.telegram.ui.ActionBar.i5 {
    public final /* synthetic */ ProfileActivity s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww0(ProfileActivity profileActivity, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.s0 = profileActivity;
    }

    @Override // org.telegram.ui.ActionBar.i5, fe.e
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        super.v(i10, f7, f10, fVar);
        ProfileActivity.r1(this.s0);
    }
}
