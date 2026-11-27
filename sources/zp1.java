// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.q;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zp1 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ zp1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wq1 wq1Var;
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                q qVar = zu1Var.q3;
                if (qVar != null) {
                    qVar.setIsMessageTransition(false);
                    zu1Var.q3.m();
                    zu1Var.q3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                zu1Var.X9 = hl.L(30.0f);
                zu1Var.O7();
                break;
            case 2:
                if (zu1Var.fragmentView != null && (wq1Var = zu1Var.A0) != null) {
                    wq1Var.invalidate();
                    zu1Var.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                zu1Var.R.setVisibility(4);
                break;
            case 4:
                if (animator.equals(zu1Var.v3)) {
                    zu1Var.v3 = null;
                    break;
                }
                break;
            case 5:
                if (animator.equals(zu1Var.v3)) {
                    zu1Var.v3 = null;
                    break;
                }
                break;
            case 6:
                if (animator.equals(zu1Var.w3)) {
                    zu1Var.x3 = 1.0f;
                    zu1Var.Tc();
                    zu1Var.w3 = null;
                    break;
                }
                break;
            case 7:
                if (animator.equals(zu1Var.w3)) {
                    zu1Var.x3 = 0.0f;
                    zu1Var.Tc();
                    zu1Var.w3 = null;
                    break;
                }
                break;
            case 8:
                zu1Var.h5 = null;
                break;
            case 9:
                zu1Var.bb = 1.0f;
                zu1Var.a0.setVisibility(4);
                zu1Var.d1.setVisibility(4);
                zu1Var.O7();
                break;
            default:
                zu1Var.bb = 0.0f;
                zu1Var.O7();
                break;
        }
    }
}
