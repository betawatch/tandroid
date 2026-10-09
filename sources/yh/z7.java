package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eb0;
import org.telegram.ui.eg0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ zg.l0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ai.h1[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ h8 h;

    public z7(h8 h8Var, zg.l0 l0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.a = l0Var;
        this.b = view;
        this.c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eb0 eb0Var;
        h8 h8Var = this.h;
        eg0 eg0Var = h8Var.K;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        zg.l0 l0Var = this.a;
        if (l0Var != null) {
            l0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        ai.h1 h1Var = this.c[0];
        if (h1Var != null) {
            h1Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                h8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null || (eb0Var = launchActivity.x0) == null) {
            return;
        }
        eb0Var.c(true);
    }
}
