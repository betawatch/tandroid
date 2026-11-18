package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.go;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
        r1Var.getPhotoImage().y0(this.b, this.c, this.d, this.e);
        go goVar = this.f.P;
        if (goVar != null) {
            goVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
