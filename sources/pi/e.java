package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.go;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ q1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ k f;

    public e(k kVar, q1 q1Var, float f10, float f11, float f12, float f13) {
        this.f = kVar;
        this.a = q1Var;
        this.b = f10;
        this.c = f11;
        this.d = f12;
        this.e = f13;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        q1 q1Var = this.a;
        q1Var.getTransitionParams().e();
        q1Var.getPhotoImage().y0(this.b, this.c, this.d, this.e);
        go goVar = this.f.P;
        if (goVar != null) {
            goVar.h.setAlpha(1.0f);
        }
        q1Var.invalidate();
    }
}
