package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class sz0 extends org.telegram.ui.Components.x80 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sz0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.B3();
    }

    @Override // org.telegram.ui.ActionBar.k5
    public final void setTextColor(int i10) {
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.k5 k5Var = k5VarArr[2];
        if (k5Var != null) {
            k5Var.setTextColor(i10);
            k5VarArr[3].setTextColor(i10);
        }
        m11 m11Var = profileActivity.b6;
        if (m11Var == null || m11Var.c == (l1 = org.telegram.ui.ActionBar.j6.l1(1.4f, org.telegram.ui.ActionBar.j6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        m11Var.c = l1;
        m11Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.T;
        if (jw0Var != null) {
            jw0Var.setTranslationX(f7 - profileActivity.Z3());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        k5VarArr[2].setTranslationY(f7);
        k5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.jw0 jw0Var = profileActivity.T;
        if (jw0Var != null) {
            jw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
