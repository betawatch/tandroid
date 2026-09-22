package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class rz0 extends org.telegram.ui.Components.x80 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rz0(ProfileActivity profileActivity, Context context) {
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
        int l1;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.j5 j5Var = j5VarArr[2];
        if (j5Var != null) {
            j5Var.setTextColor(i10);
            j5VarArr[3].setTextColor(i10);
        }
        l11 l11Var = profileActivity.b6;
        if (l11Var == null || l11Var.c == (l1 = org.telegram.ui.ActionBar.i6.l1(1.4f, org.telegram.ui.ActionBar.i6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        l11Var.c = l1;
        l11Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.Z3();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.iw0 iw0Var = profileActivity.T;
        if (iw0Var != null) {
            iw0Var.setTranslationX(f7 - profileActivity.Z3());
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
        org.telegram.ui.Components.iw0 iw0Var = profileActivity.T;
        if (iw0Var != null) {
            iw0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
