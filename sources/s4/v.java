package s4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import di.u4;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class v implements Animator.AnimatorListener {
    public final /* synthetic */ e1 E;
    public final /* synthetic */ z F;
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
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public v(z zVar, e1 e1Var, int i10, float f7, float f10, float f11, float f12, int i11, e1 e1Var2) {
        this.F = zVar;
        this.y = i11;
        this.E = e1Var2;
        this.f = i10;
        this.e = e1Var;
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new u4(this, 11));
        ofFloat.setTarget(e1Var.a);
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
        e1 e1Var = this.E;
        z zVar = this.F;
        if (i10 <= 0) {
            zVar.x.a(zVar.H, e1Var);
        } else {
            zVar.a.add(e1Var.a);
            this.n = true;
            if (i10 > 0) {
                zVar.H.post(new k9.u(zVar, this, i10));
            }
        }
        View view = zVar.M;
        View view2 = e1Var.a;
        if (view == view2) {
            zVar.q(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
