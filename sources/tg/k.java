package tg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ k(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n nVar = this.b;
                if (animator == nVar.c0) {
                    nVar.c0 = null;
                    break;
                }
                break;
            case 1:
                n nVar2 = this.b;
                if (animator == nVar2.d0) {
                    nVar2.d0 = null;
                    break;
                }
                break;
            case 2:
                n nVar3 = this.b;
                if (animator == nVar3.R) {
                    nVar3.R = null;
                    nVar3.Q = 0.0f;
                    break;
                }
                break;
            case 3:
                n nVar4 = this.b;
                if (animator == nVar4.S) {
                    nVar4.S = null;
                    break;
                }
                break;
            default:
                n nVar5 = this.b;
                if (!nVar5.n0) {
                    org.telegram.messenger.g0.E2(nVar5.J);
                    nVar5.J = null;
                    break;
                }
                break;
        }
    }
}
