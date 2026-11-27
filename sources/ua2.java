// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ua2 extends AnimatorListenerAdapter {
    public final /* synthetic */ wb2 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ bb2 f;

    public ua2(bb2 bb2Var, wb2 wb2Var, float f, float f2, float f3, float f4) {
        this.f = bb2Var;
        this.a = wb2Var;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wb2 wb2Var = this.a;
        wb2Var.getTransitionParams().e();
        wb2Var.getPhotoImage().i0(this.b, this.c, this.d, this.e);
        y92 y92Var = this.f.P;
        if (y92Var != null) {
            y92Var.h.setAlpha(1.0f);
        }
        wb2Var.invalidate();
    }
}
