// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vlb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qmb b;

    public /* synthetic */ vlb(qmb qmbVar, byte b) {
        this.a = b;
        this.b = qmbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        qmb qmbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                qmbVar.z0.invalidate();
                qmbVar.y0[1].setVisibility(8);
                qmbVar.e2 = null;
                break;
            case 1:
                qmbVar.D0 = null;
                break;
            case 2:
                if (qmbVar.F0.getTag() == null) {
                    qmbVar.F0.setVisibility(4);
                }
                qmbVar.J0 = null;
                break;
            case 3:
                if (qmbVar.G0.getTag() == null) {
                    qmbVar.G0.setVisibility(4);
                }
                qmbVar.K0 = null;
                break;
            case 4:
                xg1 xg1Var = qmbVar.j2;
                if (xg1Var != null) {
                    if (xg1Var.getParent() != null) {
                        ((ViewGroup) qmbVar.j2.getParent()).removeView(qmbVar.j2);
                    }
                    qmbVar.j2 = null;
                }
                qmbVar.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                if (!qmbVar.r1.a()) {
                    qmbVar.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
