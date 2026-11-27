// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class uab extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;

    public /* synthetic */ uab(sbb sbbVar, byte b) {
        this.a = b;
        this.b = sbbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        sbb sbbVar = this.b;
        switch (b) {
            case 0:
                sbbVar.k2 = null;
                sbbVar.r.setTranslationY(0.0f);
                sbbVar.r.b(0.0f);
                break;
            case 1:
                sbbVar.n.removeView(sbbVar.N0);
                sbbVar.N0 = null;
                sbbVar.o2 = null;
                sbbVar.q2 = null;
                sbbVar.d1.M.b(sbbVar.g0 != 1);
                break;
            default:
                cbb cbbVar = sbbVar.D2;
                if (cbbVar != null) {
                    if (cbbVar.getParent() != null) {
                        ((ViewGroup) sbbVar.D2.getParent()).removeView(sbbVar.D2);
                    }
                    sbbVar.D2 = null;
                }
                sbbVar.F2 = null;
                super.onAnimationEnd(animator);
                break;
        }
    }
}
