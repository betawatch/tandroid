package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ty0 extends org.telegram.ui.Components.s90 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override // org.telegram.ui.ActionBar.j5
    public final void setTextColor(int i10) {
        int m12;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[2];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[3].setTextColor(i10);
        }
        n01 n01Var = profileActivity.f6;
        if (n01Var == null || n01Var.c == (m12 = org.telegram.ui.ActionBar.h6.m1(1.4f, org.telegram.ui.ActionBar.h6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        n01Var.c = m12;
        n01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.dx0 dx0Var = profileActivity.T;
        if (dx0Var != null) {
            dx0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        j5VarArr[2].setTranslationY(f7);
        j5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.dx0 dx0Var = profileActivity.T;
        if (dx0Var != null) {
            dx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
