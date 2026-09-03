package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ p2 d;

    public e2(p2 p2Var, boolean z4, float f10, float f11) {
        this.d = p2Var;
        this.a = z4;
        this.b = f10;
        this.c = f11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p2 p2Var = this.d;
        h2 h2Var = p2Var.x;
        m2 m2Var = p2Var.T;
        g2 g2Var = p2Var.v;
        p2Var.e0 = false;
        boolean z4 = this.a;
        if (z4) {
            g2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        } else {
            p2Var.D();
            p2Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f10 = this.b;
            g2Var.setForceOffsetY(f10 - dp);
            g2Var.setTopActionBarOffsetY(f10 - AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        }
        float f11 = z4 ? p2Var.d0 : 1.0f - p2Var.d0;
        p2Var.c0 = f11;
        m2Var.setAlpha(1.0f - f11);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) * p2Var.c0);
        p2Var.j0.setAlpha(p2Var.c0);
        if (z4) {
            m2Var.setVisibility(8);
        }
        g2Var.setSwipeOffsetAnimationDisallowed(false);
        g2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, p2Var.d0));
        p2Var.i0.setTranslationX(0.0f);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.n(true, true);
        p2Var.C();
    }
}
