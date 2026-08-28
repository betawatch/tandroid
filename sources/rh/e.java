package rh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.yn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ t1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m f;

    public e(m mVar, t1 t1Var, float f10, float f11, float f12, float f13) {
        this.f = mVar;
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
        yn ynVar = this.f.P;
        if (ynVar != null) {
            ynVar.h.setAlpha(1.0f);
        }
        t1Var.invalidate();
    }
}
