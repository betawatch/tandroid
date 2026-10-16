package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class wz0 extends org.telegram.ui.Components.y90 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override // org.telegram.ui.ActionBar.h5
    public final void setTextColor(int i10) {
        int m12;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.h5 h5Var = h5VarArr[2];
        if (h5Var != null) {
            h5Var.setTextColor(i10);
            h5VarArr[3].setTextColor(i10);
        }
        q11 q11Var = profileActivity.b6;
        if (q11Var == null || q11Var.c == (m12 = org.telegram.ui.ActionBar.g6.m1(1.4f, org.telegram.ui.ActionBar.g6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        q11Var.c = m12;
        q11Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        h5VarArr[2].setTranslationY(f7);
        h5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
