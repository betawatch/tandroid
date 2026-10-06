package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.eb0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class j8 extends AnimatorListenerAdapter {
    public final /* synthetic */ zg.k0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ai.h1[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ r8 h;

    public j8(r8 r8Var, zg.k0 k0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = r8Var;
        this.a = k0Var;
        this.b = view;
        this.c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eb0 eb0Var;
        r8 r8Var = this.h;
        cg0 cg0Var = r8Var.J;
        cg0Var.setVisibility(4);
        cg0Var.setPaused(true);
        zg.k0 k0Var = this.a;
        if (k0Var != null) {
            k0Var.l = true;
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
                r8Var.container.performHapticFeedback(0, 1);
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
