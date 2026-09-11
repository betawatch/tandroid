package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.eg0;
import org.telegram.ui.gb0;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class f8 extends AnimatorListenerAdapter {
    public final /* synthetic */ ah.h1 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ bi.z0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ n8 h;

    public f8(n8 n8Var, ah.h1 h1Var, View view, bi.z0[] z0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = n8Var;
        this.a = h1Var;
        this.b = view;
        this.c = z0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        gb0 gb0Var;
        n8 n8Var = this.h;
        eg0 eg0Var = n8Var.J;
        eg0Var.setVisibility(4);
        eg0Var.setPaused(true);
        ah.h1 h1Var = this.a;
        if (h1Var != null) {
            h1Var.l = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        bi.z0 z0Var = this.c[0];
        if (z0Var != null) {
            z0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.f3*/.dismissInternal();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                n8Var.container.performHapticFeedback(0, 1);
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
