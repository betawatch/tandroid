package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class su0 extends org.telegram.ui.Components.w4 {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.T6;
        this.V0.Q3();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void setTextColor(int i3) {
        int r12;
        ProfileActivity profileActivity = this.V0;
        profileActivity.F5 = i3;
        int f10 = i0.a.f(profileActivity.B5, i3, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.y6, profileActivity.A0));
        super.setTextColor(f10);
        mw0 mw0Var = profileActivity.z6;
        if (mw0Var == null || mw0Var.c == (r12 = org.telegram.ui.ActionBar.k6.r1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, f10)))) {
            return;
        }
        mw0Var.c = r12;
        mw0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.T6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.p4();
        profileActivity.getClass();
        org.telegram.ui.Components.ku0 ku0Var = profileActivity.T;
        if (ku0Var != null) {
            ku0Var.setTranslationX(f10 - profileActivity.p4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.T6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        org.telegram.ui.Components.ku0 ku0Var = profileActivity.T;
        if (ku0Var != null) {
            ku0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
