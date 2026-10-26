package sg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (animator == jVar.a0) {
                    jVar.a0 = null;
                    break;
                }
                break;
            case 1:
                j jVar2 = this.b;
                if (animator == jVar2.b0) {
                    jVar2.b0 = null;
                    break;
                }
                break;
            case 2:
                j jVar3 = this.b;
                if (animator == jVar3.P) {
                    jVar3.P = null;
                    jVar3.O = 0.0f;
                    break;
                }
                break;
            case 3:
                j jVar4 = this.b;
                if (animator == jVar4.Q) {
                    jVar4.Q = null;
                    break;
                }
                break;
            default:
                j jVar5 = this.b;
                if (!jVar5.l0) {
                    AndroidUtilities.removeFromParent(jVar5.H);
                    jVar5.H = null;
                    break;
                }
                break;
        }
    }
}
