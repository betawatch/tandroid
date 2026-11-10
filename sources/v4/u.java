package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.n4;
import org.telegram.ui.ix;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ int D;
    public final /* synthetic */ d1 E;
    public final /* synthetic */ y F;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final d1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    public u(y yVar, d1 d1Var, int i7, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.F = yVar;
        this.D = i10;
        this.E = d1Var2;
        this.f = i7;
        this.e = d1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 14));
        ofFloat.setTarget(d1Var.a);
        ofFloat.addListener(this);
        this.y = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.x) {
            this.e.q(true);
        }
        this.x = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.y = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.w) {
            return;
        }
        int i7 = this.D;
        d1 d1Var = this.E;
        y yVar = this.F;
        if (i7 <= 0) {
            yVar.y.a(yVar.H, d1Var);
        } else {
            yVar.a.add(d1Var.a);
            this.n = true;
            if (i7 > 0) {
                yVar.H.post(new ix(yVar, this, i7));
            }
        }
        View view = yVar.M;
        View view2 = d1Var.a;
        if (view == view2) {
            yVar.q(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
