package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cg0;
import org.telegram.ui.eb0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class h8 extends AnimatorListenerAdapter {
    public final /* synthetic */ zg.m0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ai.h1[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ p8 h;

    public h8(p8 p8Var, zg.m0 m0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = p8Var;
        this.a = m0Var;
        this.b = view;
        this.c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        eb0 eb0Var;
        p8 p8Var = this.h;
        cg0 cg0Var = p8Var.J;
        cg0Var.setVisibility(4);
        cg0Var.setPaused(true);
        zg.m0 m0Var = this.a;
        if (m0Var != null) {
            m0Var.l = true;
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
                p8Var.container.performHapticFeedback(0, 1);
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
