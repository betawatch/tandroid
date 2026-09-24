package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class ui extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ui(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        rj rjVar;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                org.telegram.ui.Components.h60 h60Var = wnVar.b3;
                if (h60Var != null) {
                    h60Var.setIsMessageTransition(false);
                    wnVar.b3.c(true);
                    wnVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                wn wnVar2 = this.b;
                wnVar2.A9 = dp;
                wnVar2.o9();
                break;
            case 2:
                wn wnVar3 = this.b;
                if (wnVar3.fragmentView != null && (rjVar = wnVar3.x0) != null) {
                    rjVar.invalidate();
                    wnVar3.fragmentView.invalidate();
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
                wn wnVar4 = this.b;
                if (animator.equals(wnVar4.g3)) {
                    wnVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                wn wnVar5 = this.b;
                if (animator.equals(wnVar5.g3)) {
                    wnVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                wn wnVar6 = this.b;
                if (animator.equals(wnVar6.h3)) {
                    wnVar6.i3 = 1.0f;
                    wnVar6.lc();
                    wnVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                wn wnVar7 = this.b;
                if (animator.equals(wnVar7.h3)) {
                    wnVar7.i3 = 0.0f;
                    wnVar7.lc();
                    wnVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                wn wnVar8 = this.b;
                wnVar8.Da = 1.0f;
                wnVar8.Y.setVisibility(4);
                wnVar8.O0.setVisibility(4);
                wnVar8.o9();
                break;
            default:
                wn wnVar9 = this.b;
                wnVar9.Da = 0.0f;
                wnVar9.o9();
                break;
        }
    }
}
