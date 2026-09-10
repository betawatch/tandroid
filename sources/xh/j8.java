package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class j8 extends AnimatorListenerAdapter {
    public final /* synthetic */ yg.n0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ zh.f0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ r8 h;

    public j8(r8 r8Var, yg.n0 n0Var, View view, zh.f0[] f0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = r8Var;
        this.a = n0Var;
        this.b = view;
        this.c = f0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        r8 r8Var = this.h;
        eg0 eg0Var = r8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        yg.n0 n0Var = this.a;
        if (n0Var != null) {
            n0Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        zh.f0 f0Var = this.c[0];
        if (f0Var != null) {
            f0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.h3*/.dismissInternal();
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
        if (launchActivity == null || (gb0Var = launchActivity.x0) == null) {
            return;
        }
        gb0Var.c(true);
    }
}
