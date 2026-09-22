package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gg0;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class g8 extends AnimatorListenerAdapter {
    public final /* synthetic */ zg.n0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ ai.h1[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ o8 h;

    public g8(o8 o8Var, zg.n0 n0Var, View view, ai.h1[] h1VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = o8Var;
        this.a = n0Var;
        this.b = view;
        this.c = h1VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ib0 ib0Var;
        o8 o8Var = this.h;
        gg0 gg0Var = o8Var.J;
        gg0Var.setVisibility(4);
        gg0Var.setPaused(true);
        zg.n0 n0Var = this.a;
        if (n0Var != null) {
            n0Var.l = true;
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
                o8Var.container.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null || (ib0Var = launchActivity.x0) == null) {
            return;
        }
        ib0Var.c(true);
    }
}
