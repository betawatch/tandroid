package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class yy0 extends org.telegram.ui.Components.z80 {
    public final /* synthetic */ ProfileActivity M0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.M0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.M0.B3();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[2];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[3].setTextColor(i10);
        }
        s01 s01Var = profileActivity.Y5;
        if (s01Var == null || s01Var.c == (l1 = org.telegram.ui.ActionBar.j6.l1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        s01Var.c = l1;
        s01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        super.setTranslationX(f10);
        ProfileActivity profileActivity = this.M0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f10);
        profileActivity.r[3].setTranslationX(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationX(f10 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ProfileActivity profileActivity = this.M0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        if (profileActivity.Q != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.Q.getVisibilityFactor();
        }
        k5VarArr[2].setTranslationY(f10);
        k5VarArr[3].setTranslationY(f10);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.Q;
        if (jw0Var != null) {
            jw0Var.setTranslationY(f10 - AndroidUtilities.dp(5.0f));
        }
    }
}
