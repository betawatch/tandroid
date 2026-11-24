// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pb2 extends AnimatorListenerAdapter {
    public final /* synthetic */ rc2 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ wb2 f;

    public pb2(wb2 wb2Var, rc2 rc2Var, float f, float f2, float f3, float f4) {
        this.f = wb2Var;
        this.a = rc2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rc2 rc2Var = this.a;
        rc2Var.getTransitionParams().e();
        rc2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        ua2 ua2Var = this.f.P;
        if (ua2Var != null) {
            ua2Var.h.setAlpha(1.0f);
        }
        rc2Var.invalidate();
    }
}
