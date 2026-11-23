package pi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Components.io;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        io ioVar = this.f.P;
        if (ioVar != null) {
            ioVar.h.setAlpha(1.0f);
        }
        r1Var.invalidate();
    }
}
