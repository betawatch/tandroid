package yf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i9) {
        this.a = i9;
        this.b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (animator == jVar.T) {
                    jVar.T = null;
                    break;
                }
                break;
            case 1:
                j jVar2 = this.b;
                if (animator == jVar2.U) {
                    jVar2.U = null;
                    break;
                }
                break;
            case 2:
                j jVar3 = this.b;
                if (animator == jVar3.L) {
                    jVar3.L = null;
                    jVar3.K = 0.0f;
                    break;
                }
                break;
            case 3:
                j jVar4 = this.b;
                if (animator == jVar4.M) {
                    jVar4.M = null;
                    break;
                }
                break;
            default:
                j jVar5 = this.b;
                if (!jVar5.h0) {
                    AndroidUtilities.removeFromParent(jVar5.D);
                    jVar5.D = null;
                    break;
                }
                break;
        }
    }
}
