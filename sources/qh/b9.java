package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class b9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ca b;

    public /* synthetic */ b9(ca caVar, int i10) {
        this.a = i10;
        this.b = caVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ca caVar = this.b;
                caVar.g2 = null;
                caVar.r.setTranslationY(0.0f);
                caVar.r.b(0.0f);
                break;
            case 1:
                ca caVar2 = this.b;
                caVar2.n.removeView(caVar2.J0);
                caVar2.J0 = null;
                caVar2.k2 = null;
                caVar2.m2 = null;
                caVar2.Z0.I.b(caVar2.c0 != 1);
                break;
            default:
                ca caVar3 = this.b;
                wo woVar = caVar3.z2;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) caVar3.z2.getParent()).removeView(caVar3.z2);
                    }
                    caVar3.z2 = null;
                }
                caVar3.B2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
