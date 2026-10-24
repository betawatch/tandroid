package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class xy0 extends org.telegram.ui.Components.t90 {
    public final /* synthetic */ ProfileActivity P0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xy0(ProfileActivity profileActivity, Context context) {
        super(context);
        this.P0 = profileActivity;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.P0.D3();
    }

    @Override // org.telegram.ui.ActionBar.n5
    public final void setTextColor(int i10) {
        int o12;
        super.setTextColor(i10);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.r;
        org.telegram.ui.ActionBar.n5 n5Var = n5VarArr[2];
        if (n5Var != null) {
            n5Var.setTextColor(i10);
            n5VarArr[3].setTextColor(i10);
        }
        r01 r01Var = profileActivity.h6;
        if (r01Var == null || r01Var.c == (o12 = org.telegram.ui.ActionBar.k6.o1(1.4f, org.telegram.ui.ActionBar.k6.b(-0.02f, 0.15f, i10)))) {
            return;
        }
        r01Var.c = o12;
        r01Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        super.setTranslationX(f7);
        ProfileActivity profileActivity = this.P0;
        profileActivity.b4();
        profileActivity.getClass();
        profileActivity.r[2].setTranslationX(f7);
        profileActivity.r[3].setTranslationX(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationX(f7 - profileActivity.b4());
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        ProfileActivity profileActivity = this.P0;
        org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.r;
        if (profileActivity.T != null) {
            AndroidUtilities.dp(3.0f);
            profileActivity.T.getVisibilityFactor();
        }
        n5VarArr[2].setTranslationY(f7);
        n5VarArr[3].setTranslationY(f7);
        org.telegram.ui.Components.hx0 hx0Var = profileActivity.T;
        if (hx0Var != null) {
            hx0Var.setTranslationY(f7 - AndroidUtilities.dp(5.0f));
        }
    }
}
