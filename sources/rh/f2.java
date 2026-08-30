package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class f2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ q2 d;

    public f2(q2 q2Var, boolean z4, float f10, float f11) {
        this.d = q2Var;
        this.a = z4;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q2 q2Var = this.d;
        i2 i2Var = q2Var.x;
        n2 n2Var = q2Var.T;
        h2 h2Var = q2Var.v;
        q2Var.e0 = false;
        boolean z4 = this.a;
        if (z4) {
            h2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            h2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            h2Var.setSwipeOffsetY(0.0f);
        } else {
            q2Var.D();
            q2Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f10 = this.b;
            h2Var.setForceOffsetY(f10 - dp);
            h2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            h2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z4 ? q2Var.d0 : 1.0f - q2Var.d0;
        q2Var.c0 = f11;
        n2Var.setAlpha(1.0f - f11);
        n2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * q2Var.c0);
        q2Var.j0.setAlpha(q2Var.c0);
        if (z4) {
            n2Var.setVisibility(8);
        }
        h2Var.setSwipeOffsetAnimationDisallowed(false);
        h2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, q2Var.d0));
        q2Var.i0.setTranslationX(0.0f);
        q2Var.e.invalidate();
        i2Var.setViewPortHeightOffset(0.0f);
        i2Var.n(true, true);
        q2Var.C();
    }
}
