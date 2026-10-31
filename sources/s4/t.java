package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class t implements Animator.AnimatorListener {
    public final /* synthetic */ int D;
    public final /* synthetic */ c1 E;
    public final /* synthetic */ x F;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final c1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    public t(x xVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = xVar;
        this.D = i11;
        this.E = c1Var2;
        this.f = i10;
        this.e = c1Var;
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new bg.o(this, 10));
        ofFloat.setTarget(c1Var.a);
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
        int i10 = this.D;
        c1 c1Var = this.E;
        x xVar = this.F;
        if (i10 <= 0) {
            xVar.y.a(xVar.H, c1Var);
        } else {
            xVar.a.add(c1Var.a);
            this.n = true;
            if (i10 > 0) {
                xVar.H.post(new j9.u(xVar, this, i10));
            }
        }
        View view = xVar.M;
        View view2 = c1Var.a;
        if (view == view2) {
            xVar.q(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
