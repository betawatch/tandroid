// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wza extends AnimatorListenerAdapter {
    public final /* synthetic */ u49 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ h96[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ fxa f;
    public final /* synthetic */ e0b h;

    public wza(e0b e0bVar, u49 u49Var, View view, h96[] h96VarArr, boolean[] zArr, RectF rectF, fxa fxaVar) {
        this.h = e0bVar;
        this.a = u49Var;
        this.b = view;
        this.c = h96VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = fxaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        y16 y16Var;
        e0b e0bVar = this.h;
        i94 i94Var = e0bVar.E1;
        i94Var.setVisibility(4);
        i94Var.setPaused(true);
        u49 u49Var = this.a;
        if (u49Var != null) {
            u49Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        h96 h96Var = this.c[0];
        if (h96Var != null) {
            h96Var.setDrawStar(true);
        }
        super/*nx0*/.H();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.a0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                e0bVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            fxa fxaVar = this.f;
            if (fxaVar != null) {
                fxaVar.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null || (y16Var = launchActivity.w0) == null) {
            return;
        }
        y16Var.c(true);
    }
}
