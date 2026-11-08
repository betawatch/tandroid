package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ g(j jVar, int i7) {
        this.a = i7;
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
                    org.telegram.messenger.g0.E2(jVar5.H);
                    jVar5.H = null;
                    break;
                }
                break;
        }
    }
}
