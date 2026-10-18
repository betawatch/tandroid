package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class qi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ qi(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pj pjVar;
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                org.telegram.ui.Components.r60 r60Var = snVar.b3;
                if (r60Var != null) {
                    r60Var.setIsMessageTransition(false);
                    snVar.b3.c(true);
                    snVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                sn snVar2 = this.b;
                snVar2.A9 = dp;
                snVar2.t9();
                break;
            case 2:
                sn snVar3 = this.b;
                if (snVar3.fragmentView != null && (pjVar = snVar3.x0) != null) {
                    pjVar.invalidate();
                    snVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new vi(this, 4), 2000L);
                break;
            case 5:
                sn snVar4 = this.b;
                if (animator.equals(snVar4.g3)) {
                    snVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                sn snVar5 = this.b;
                if (animator.equals(snVar5.g3)) {
                    snVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                sn snVar6 = this.b;
                if (animator.equals(snVar6.h3)) {
                    snVar6.i3 = 1.0f;
                    snVar6.pc();
                    snVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                sn snVar7 = this.b;
                if (animator.equals(snVar7.h3)) {
                    snVar7.i3 = 0.0f;
                    snVar7.pc();
                    snVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                sn snVar8 = this.b;
                snVar8.Ea = 1.0f;
                snVar8.Y.setVisibility(4);
                snVar8.O0.setVisibility(4);
                snVar8.t9();
                break;
            default:
                sn snVar9 = this.b;
                snVar9.Ea = 0.0f;
                snVar9.t9();
                break;
        }
    }
}
