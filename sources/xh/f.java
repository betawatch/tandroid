package xh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.ho;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ t1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ n f;

    public f(n nVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f = nVar;
        this.a = t1Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t1 t1Var = this.a;
        t1Var.getTransitionParams().j();
        t1Var.getPhotoImage().setImageCoords(this.b, this.c, this.d, this.e);
        ho hoVar = this.f.P;
        if (hoVar != null) {
            hoVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
