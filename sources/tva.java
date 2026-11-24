// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tva extends AnimatorListenerAdapter {
    public final /* synthetic */ f19 a;
    public final /* synthetic */ View b;
    public final /* synthetic */ d76[] c;
    public final /* synthetic */ boolean[] d;
    public final /* synthetic */ RectF e;
    public final /* synthetic */ cta f;
    public final /* synthetic */ bwa h;

    public tva(bwa bwaVar, f19 f19Var, View view, d76[] d76VarArr, boolean[] zArr, RectF rectF, cta ctaVar) {
        this.h = bwaVar;
        this.a = f19Var;
        this.b = view;
        this.c = d76VarArr;
        this.d = zArr;
        this.e = rectF;
        this.f = ctaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vz5 vz5Var;
        bwa bwaVar = this.h;
        n84 n84Var = bwaVar.E1;
        n84Var.setVisibility(4);
        n84Var.setPaused(true);
        f19 f19Var = this.a;
        if (f19Var != null) {
            f19Var.k = true;
        }
        View view = this.b;
        if (view != null) {
            view.invalidate();
        }
        d76 d76Var = this.c[0];
        if (d76Var != null) {
            d76Var.setDrawStar(true);
        }
        super/*fx0*/.I();
        boolean[] zArr = this.d;
        if (!zArr[0]) {
            zArr[0] = true;
            RectF rectF = this.e;
            LaunchActivity.a0(rectF.centerX(), rectF.centerY(), 1.5f);
            try {
                bwaVar.c.performHapticFeedback(0, 1);
            } catch (Exception unused) {
            }
            cta ctaVar = this.f;
            if (ctaVar != null) {
                ctaVar.run();
            }
        }
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null || (vz5Var = launchActivity.w0) == null) {
            return;
        }
        vz5Var.c(true);
    }
}
