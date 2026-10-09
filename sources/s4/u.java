package s4;

import ai.l6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ d1 E;
    public final /* synthetic */ z F;
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
    public boolean v = false;
    public boolean w = false;
    public float x;
    public final /* synthetic */ int y;

    public u(z zVar, d1 d1Var, int i10, float f7, float f10, float f11, float f12, int i11, d1 d1Var2) {
        this.F = zVar;
        this.y = i11;
        this.E = d1Var2;
        this.f = i10;
        this.e = d1Var;
        this.a = f7;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new l6(this, 13));
        ofFloat.setTarget(d1Var.a);
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
        d1 d1Var = this.E;
        z zVar = this.F;
        if (i10 <= 0) {
            zVar.x.a(zVar.H, d1Var);
        } else {
            zVar.a.add(d1Var.a);
            this.n = true;
            if (i10 > 0) {
                zVar.H.post(new v(zVar, this, i10));
            }
        }
        View view = zVar.M;
        View view2 = d1Var.a;
        if (view == view2) {
            zVar.o(view2);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
