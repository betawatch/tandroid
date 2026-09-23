package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ui extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ui(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                dl dlVar = xnVar.b3;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    xnVar.b3.h(true);
                    xnVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                xn xnVar2 = this.b;
                xnVar2.A9 = dp;
                xnVar2.o9();
                break;
            case 2:
                xn xnVar3 = this.b;
                if (xnVar3.fragmentView != null && (rjVar = xnVar3.x0) != null) {
                    rjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new aj(this, 3), 2000L);
                break;
            case 5:
                xn xnVar4 = this.b;
                if (animator.equals(xnVar4.g3)) {
                    xnVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                xn xnVar5 = this.b;
                if (animator.equals(xnVar5.g3)) {
                    xnVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                xn xnVar6 = this.b;
                if (animator.equals(xnVar6.h3)) {
                    xnVar6.i3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                xn xnVar7 = this.b;
                if (animator.equals(xnVar7.h3)) {
                    xnVar7.i3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                xn xnVar8 = this.b;
                xnVar8.Da = 1.0f;
                xnVar8.Y.setVisibility(4);
                xnVar8.O0.setVisibility(4);
                xnVar8.o9();
                break;
            default:
                xn xnVar9 = this.b;
                xnVar9.Da = 0.0f;
                xnVar9.o9();
                break;
        }
    }
}
