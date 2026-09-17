package rg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ h(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (animator == kVar.a0) {
                    kVar.a0 = null;
                    break;
                }
                break;
            case 1:
                k kVar2 = this.b;
                if (animator == kVar2.b0) {
                    kVar2.b0 = null;
                    break;
                }
                break;
            case 2:
                k kVar3 = this.b;
                if (animator == kVar3.P) {
                    kVar3.P = null;
                    kVar3.O = 0.0f;
                    break;
                }
                break;
            case 3:
                k kVar4 = this.b;
                if (animator == kVar4.Q) {
                    kVar4.Q = null;
                    break;
                }
                break;
            default:
                k kVar5 = this.b;
                if (!kVar5.l0) {
                    AndroidUtilities.removeFromParent(kVar5.H);
                    kVar5.H = null;
                    break;
                }
                break;
        }
    }
}
