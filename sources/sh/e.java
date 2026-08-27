package sh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.wn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ s1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ m f;

    public e(m mVar, s1 s1Var, float f10, float f11, float f12, float f13) {
        this.f = mVar;
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
        wn wnVar = this.f.P;
        if (wnVar != null) {
            wnVar.h.setAlpha(1.0f);
        }
        s1Var.invalidate();
    }
}
