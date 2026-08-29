package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e2 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ p2 d;

    public e2(p2 p2Var, boolean z10, float f9, float f10) {
        this.d = p2Var;
        this.a = z10;
        this.b = f9;
        this.c = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        p2 p2Var = this.d;
        h2 h2Var = p2Var.x;
        m2 m2Var = p2Var.S;
        g2 g2Var = p2Var.v;
        p2Var.d0 = false;
        boolean z10 = this.a;
        if (z10) {
            g2Var.setForceOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        } else {
            p2Var.D();
            p2Var.G();
            float dp = AndroidUtilities.dp(24.0f);
            float f9 = this.b;
            g2Var.setForceOffsetY(f9 - dp);
            g2Var.setTopActionBarOffsetY(f9 - AndroidUtilities.dp(24.0f));
            g2Var.setSwipeOffsetY(0.0f);
        }
        float f10 = z10 ? p2Var.c0 : 1.0f - p2Var.c0;
        p2Var.b0 = f10;
        m2Var.setAlpha(1.0f - f10);
        m2Var.setTranslationY((-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) * p2Var.b0);
        p2Var.i0.setAlpha(p2Var.b0);
        if (z10) {
            m2Var.setVisibility(8);
        }
        g2Var.setSwipeOffsetAnimationDisallowed(false);
        g2Var.setTranslationX(AndroidUtilities.lerp(this.c, 0.0f, p2Var.c0));
        p2Var.h0.setTranslationX(0.0f);
        p2Var.e.invalidate();
        h2Var.setViewPortHeightOffset(0.0f);
        h2Var.n(true, true);
        p2Var.C();
    }
}
