package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.fo;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ r1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ k f;

    public e(k kVar, r1 r1Var, float f10, float f11, float f12, float f13) {
        this.f = kVar;
        this.a = r1Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        r1 r1Var = this.a;
        r1Var.getTransitionParams().e();
        r1Var.getPhotoImage().z0(this.b, this.c, this.d, this.e);
        fo foVar = this.f.P;
        if (foVar != null) {
            foVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
