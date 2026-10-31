package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q8 extends AnimatorListenerAdapter {
    public final /* synthetic */ sg.m0 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ th.c0[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ Runnable f;
    public final /* synthetic */ y8 h;

    public q8(y8 y8Var, sg.m0 m0Var, View view, th.c0[] c0VarArr, boolean[] zArr, RectF rectF, Runnable runnable) {
        this.h = y8Var;
        this.a = m0Var;
        this.b = view;
        this.c = c0VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w90 w90Var;
        y8 y8Var = this.h;
        kg.h hVar = y8Var.B1;
        hVar.setVisibility(4);
        hVar.setPaused(true);
        sg.m0 m0Var = this.a;
        if (m0Var != null) {
            m0Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        th.c0 c0Var = this.c[0];
        if (c0Var != null) {
            c0Var.setDrawStar(true);
        }
        super/*org.telegram.ui.ActionBar.z2*/.L();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.b0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                y8Var.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            Runnable runnable = this.f;
            if (runnable != null) {
                runnable.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null || (w90Var = launchActivity.x0) == null) {
            return;
        }
        w90Var.c(true);
    }
}
