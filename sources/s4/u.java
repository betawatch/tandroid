package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ci.v4;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ b1 E;
    public final /* synthetic */ y F;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final b1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public u(y yVar, b1 b1Var, int i10, float f7, float f10, float f11, float f12, int i11, b1 b1Var2) {
        this.F = yVar;
        this.y = i11;
        this.E = b1Var2;
        this.f = i10;
        this.e = b1Var;
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new v4(this, 11));
        ofFloat.setTarget(b1Var.a);
        ofFloat.addListener(this);
        this.x = 0.0f;
    }

    public final void a(Animator animator) {
        if (!this.w) {
            this.e.q(true);
        }
        this.w = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.x = 1.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        a(animator);
        if (this.v) {
            return;
        }
        int i10 = this.y;
        b1 b1Var = this.E;
        y yVar = this.F;
        if (i10 <= 0) {
            yVar.x.a(yVar.H, b1Var);
        } else {
            yVar.a.add(b1Var.a);
            this.n = true;
            if (i10 > 0) {
                yVar.H.post(new j9.u(yVar, this, i10));
            }
        }
        View view = yVar.M;
        View view2 = b1Var.a;
        if (view == view2) {
            yVar.o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
