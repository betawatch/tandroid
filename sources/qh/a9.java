package qh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.wo;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ a9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                baVar.g2 = null;
                baVar.r.setTranslationY(0.0f);
                baVar.r.b(0.0f);
                break;
            case 1:
                ba baVar2 = this.b;
                baVar2.n.removeView(baVar2.J0);
                baVar2.J0 = null;
                baVar2.k2 = null;
                baVar2.m2 = null;
                baVar2.Z0.I.b(baVar2.c0 != 1);
                break;
            default:
                ba baVar3 = this.b;
                wo woVar = baVar3.z2;
                if (woVar != null) {
                    if (woVar.getParent() != null) {
                        ((ViewGroup) baVar3.z2.getParent()).removeView(baVar3.z2);
                    }
                    baVar3.z2 = null;
                }
                baVar3.B2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
