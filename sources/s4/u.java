package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import bi.u5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ c1 E;
    public final /* synthetic */ y F;
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
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public u(y yVar, c1 c1Var, int i10, float f7, float f10, float f11, float f12, int i11, c1 c1Var2) {
        this.F = yVar;
        this.y = i11;
        this.E = c1Var2;
        this.f = i10;
        this.e = c1Var;
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u5(this, 11));
        ofFloat.setTarget(c1Var.a);
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
        c1 c1Var = this.E;
        y yVar = this.F;
        if (i10 <= 0) {
            yVar.x.a(yVar.H, c1Var);
        } else {
            yVar.a.add(c1Var.a);
            this.n = true;
            if (i10 > 0) {
                yVar.H.post(new i9.s(yVar, this, i10));
            }
        }
        View view = yVar.M;
        View view2 = c1Var.a;
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
