package u4;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import ei.n4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u implements Animator.AnimatorListener {
    public final /* synthetic */ int E;
    public final /* synthetic */ d1 F;
    public final /* synthetic */ y G;
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

    public u(y yVar, d1 d1Var, int i3, float f10, float f11, float f12, float f13, int i10, d1 d1Var2) {
        this.G = yVar;
        this.E = i10;
        this.F = d1Var2;
        this.f = i3;
        this.e = d1Var;
        this.a = f10;
        this.b = f11;
        this.c = f12;
        this.d = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat;
        ofFloat.addUpdateListener(new n4(this, 12));
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
        int i3 = this.E;
        d1 d1Var = this.F;
        y yVar = this.G;
        if (i3 <= 0) {
            yVar.y.a(yVar.I, d1Var);
        } else {
            yVar.a.add(d1Var.a);
            this.n = true;
            if (i3 > 0) {
                yVar.I.post(new l9.u(yVar, this, i3));
            }
        }
        View view = yVar.N;
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
