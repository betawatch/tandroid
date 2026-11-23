package v4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import fi.d4;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class v implements Animator.AnimatorListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ f1 F;
    public final /* synthetic */ z G;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final f1 e;
    public final int f;
    public final ValueAnimator h;
    public boolean n;
    public float r;
    public float s;
    public boolean w = false;
    public boolean x = false;
    public float y;

    public v(z zVar, f1 f1Var, int i7, float f10, float f11, float f12, float f13, int i10, f1 f1Var2) {
        this.G = zVar;
        this.E = i10;
        this.F = f1Var2;
        this.f = i7;
        this.e = f1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new d4(this, 14));
        ofFloat.setTarget(f1Var.a);
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
        f1 f1Var = this.F;
        z zVar = this.G;
        if (i7 <= 0) {
            zVar.y.a(zVar.I, f1Var);
        } else {
            zVar.a.add(f1Var.a);
            this.n = true;
            if (i7 > 0) {
                zVar.I.post(new pb.l(zVar, this, i7));
            }
        }
        View view = zVar.N;
        View view2 = f1Var.a;
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
