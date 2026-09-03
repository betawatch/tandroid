package wh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.eo;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class f extends AnimatorListenerAdapter {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ n f;

    public f(n nVar, s1 s1Var, float f10, float f11, float f12, float f13) {
        this.f = nVar;
        this.a = s1Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        s1 s1Var = this.a;
        s1Var.getTransitionParams().j();
        s1Var.getPhotoImage().setImageCoords(this.b, this.c, this.d, this.e);
        eo eoVar = this.f.P;
        if (eoVar != null) {
            eoVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
