package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class zu0 extends org.telegram.ui.Components.w4 {
    public final /* synthetic */ ProfileActivity V0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.V0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        RectF rectF = ProfileActivity.X6;
        this.V0.P3();
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void setTextColor(int i7) {
        int r12;
        ProfileActivity profileActivity = this.V0;
        profileActivity.I5 = i7;
        int f10 = i0.a.f(profileActivity.E5, i7, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.y6, profileActivity.A0));
        super.setTextColor(f10);
        tw0 tw0Var = profileActivity.D6;
        if (tw0Var == null || tw0Var.c == (r12 = org.telegram.ui.ActionBar.j6.r1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, f10)))) {
            return;
        }
        tw0Var.c = r12;
        tw0Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.V0;
        profileActivity.q4();
        profileActivity.getClass();
        org.telegram.ui.Components.mu0 mu0Var = profileActivity.T;
        if (mu0Var != null) {
            mu0Var.setTranslationX(f10 - profileActivity.q4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        RectF rectF = ProfileActivity.X6;
        ProfileActivity profileActivity = this.V0;
        if (profileActivity.T != null) {
            org.telegram.messenger.g0.L(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        org.telegram.ui.Components.mu0 mu0Var = profileActivity.T;
        if (mu0Var != null) {
            mu0Var.setTranslationY(f10 - org.telegram.messenger.g0.L(5.0f));
        }
    }
}
