// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class tab extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;

    public /* synthetic */ tab(rbb rbbVar, byte b) {
        this.a = b;
        this.b = rbbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        rbb rbbVar = this.b;
        switch (b) {
            case 0:
                rbbVar.k2 = null;
                rbbVar.r.setTranslationY(0.0f);
                rbbVar.r.b(0.0f);
                break;
            case 1:
                rbbVar.n.removeView(rbbVar.N0);
                rbbVar.N0 = null;
                rbbVar.o2 = null;
                rbbVar.q2 = null;
                rbbVar.d1.M.b(rbbVar.g0 != 1);
                break;
            default:
                bbb bbbVar = rbbVar.D2;
                if (bbbVar != null) {
                    if (bbbVar.getParent() != null) {
                        ((ViewGroup) rbbVar.D2.getParent()).removeView(rbbVar.D2);
                    }
                    rbbVar.D2 = null;
                }
                rbbVar.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
