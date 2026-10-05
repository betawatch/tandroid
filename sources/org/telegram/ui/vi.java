package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class vi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ vi(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sj sjVar;
        switch (this.a) {
            case 0:
                yn ynVar = this.b;
                org.telegram.ui.Components.k60 k60Var = ynVar.Z2;
                if (k60Var != null) {
                    k60Var.setIsMessageTransition(false);
                    ynVar.Z2.c(true);
                    ynVar.Z2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                yn ynVar2 = this.b;
                ynVar2.y9 = dp;
                ynVar2.o9();
                break;
            case 2:
                yn ynVar3 = this.b;
                if (ynVar3.fragmentView != null && (sjVar = ynVar3.v0) != null) {
                    sjVar.invalidate();
                    ynVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.N.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bj(this, 3), 2000L);
                break;
            case 5:
                yn ynVar4 = this.b;
                if (animator.equals(ynVar4.e3)) {
                    ynVar4.e3 = null;
                    break;
                }
                break;
            case 6:
                yn ynVar5 = this.b;
                if (animator.equals(ynVar5.e3)) {
                    ynVar5.e3 = null;
                    break;
                }
                break;
            case 7:
                yn ynVar6 = this.b;
                if (animator.equals(ynVar6.f3)) {
                    ynVar6.g3 = 1.0f;
                    ynVar6.kc();
                    ynVar6.f3 = null;
                    break;
                }
                break;
            case 8:
                yn ynVar7 = this.b;
                if (animator.equals(ynVar7.f3)) {
                    ynVar7.g3 = 0.0f;
                    ynVar7.kc();
                    ynVar7.f3 = null;
                    break;
                }
                break;
            case 9:
                this.b.R4 = null;
                break;
            case 10:
                yn ynVar8 = this.b;
                ynVar8.Ba = 1.0f;
                ynVar8.W.setVisibility(4);
                ynVar8.M0.setVisibility(4);
                ynVar8.o9();
                break;
            default:
                yn ynVar9 = this.b;
                ynVar9.Ba = 0.0f;
                ynVar9.o9();
                break;
        }
    }
}
