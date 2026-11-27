// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class upb extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pqb b;

    public /* synthetic */ upb(pqb pqbVar, byte b) {
        this.a = b;
        this.b = pqbVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        pqb pqbVar = this.b;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                pqbVar.z0.invalidate();
                pqbVar.y0[1].setVisibility(8);
                pqbVar.e2 = null;
                break;
            case 1:
                pqbVar.D0 = null;
                break;
            case 2:
                if (pqbVar.F0.getTag() == null) {
                    pqbVar.F0.setVisibility(4);
                }
                pqbVar.J0 = null;
                break;
            case 3:
                if (pqbVar.G0.getTag() == null) {
                    pqbVar.G0.setVisibility(4);
                }
                pqbVar.K0 = null;
                break;
            case 4:
                gh1 gh1Var = pqbVar.j2;
                if (gh1Var != null) {
                    if (gh1Var.getParent() != null) {
                        ((ViewGroup) pqbVar.j2.getParent()).removeView(pqbVar.j2);
                    }
                    pqbVar.j2 = null;
                }
                pqbVar.l2 = null;
                super.onAnimationEnd(animator);
                break;
            default:
                if (!pqbVar.r1.a()) {
                    pqbVar.T1.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
