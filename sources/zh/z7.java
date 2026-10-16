package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.ig0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class z7 extends AnimatorListenerAdapter {
    public final /* synthetic */ ah.g1 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ bi.z0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ h8 h;

    public z7(h8 h8Var, ah.g1 g1Var, View view, bi.z0[] z0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = h8Var;
        this.a = g1Var;
        this.b = view;
        this.c = z0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ib0 ib0Var;
        h8 h8Var = this.h;
        ig0 ig0Var = h8Var.K;
        ig0Var.setVisibility(4);
        ig0Var.setPaused(true);
        ah.g1 g1Var = this.a;
        if (g1Var != null) {
            g1Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        bi.z0 z0Var = this.c[0];
        if (z0Var != null) {
            z0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.e3*/.dismissInternal();
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
        if (launchActivity == null || (ib0Var = launchActivity.x0) == null) {
            return;
        }
        ib0Var.c(true);
    }
}
