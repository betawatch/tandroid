package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.f4;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ e1 F;
    public final /* synthetic */ y G;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final e1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    public u(y yVar, e1 e1Var, int i7, float f10, float f11, float f12, float f13, int i10, e1 e1Var2) {
        this.G = yVar;
        this.E = i10;
        this.F = e1Var2;
        this.f = i7;
        this.e = e1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new f4(this, 14));
        ofFloat.setTarget(e1Var.a);
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
        int i7 = this.E;
        e1 e1Var = this.F;
        y yVar = this.G;
        if (i7 <= 0) {
            yVar.y.a(yVar.I, e1Var);
        } else {
            yVar.a.add(e1Var.a);
            this.n = true;
            if (i7 > 0) {
                yVar.I.post(new pb.l(yVar, this, i7));
            }
        }
        View view = yVar.N;
        View view2 = e1Var.a;
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
