package ph;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import org.telegram.ui.Components.uo;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class d9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ da b;

    public /* synthetic */ d9(da daVar, int i10) {
        this.a = i10;
        this.b = daVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                da daVar = this.b;
                daVar.g2 = null;
                daVar.r.setTranslationY(0.0f);
                daVar.r.b(0.0f);
                break;
            case 1:
                da daVar2 = this.b;
                daVar2.n.removeView(daVar2.J0);
                daVar2.J0 = null;
                daVar2.k2 = null;
                daVar2.m2 = null;
                daVar2.Z0.I.b(daVar2.c0 != 1);
                break;
            default:
                da daVar3 = this.b;
                uo uoVar = daVar3.z2;
                if (uoVar != null) {
                    if (uoVar.getParent() != null) {
                        ((ViewGroup) daVar3.z2.getParent()).removeView(daVar3.z2);
                    }
                    daVar3.z2 = null;
                }
                daVar3.B2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
