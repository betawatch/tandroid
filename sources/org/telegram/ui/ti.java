package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ti extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ti(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qj qjVar;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                dl dlVar = xnVar.Y2;
                if (dlVar != null) {
                    dlVar.setIsMessageTransition(false);
                    xnVar.Y2.h(true);
                    xnVar.Y2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                xn xnVar2 = this.b;
                xnVar2.x9 = dp;
                xnVar2.o9();
                break;
            case 2:
                xn xnVar3 = this.b;
                if (xnVar3.fragmentView != null && (qjVar = xnVar3.u0) != null) {
                    qjVar.invalidate();
                    xnVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.M.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new zi(this, 3), 2000L);
                break;
            case 5:
                xn xnVar4 = this.b;
                if (animator.equals(xnVar4.d3)) {
                    xnVar4.d3 = null;
                    break;
                }
                break;
            case 6:
                xn xnVar5 = this.b;
                if (animator.equals(xnVar5.d3)) {
                    xnVar5.d3 = null;
                    break;
                }
                break;
            case 7:
                xn xnVar6 = this.b;
                if (animator.equals(xnVar6.e3)) {
                    xnVar6.f3 = 1.0f;
                    xnVar6.lc();
                    xnVar6.e3 = null;
                    break;
                }
                break;
            case 8:
                xn xnVar7 = this.b;
                if (animator.equals(xnVar7.e3)) {
                    xnVar7.f3 = 0.0f;
                    xnVar7.lc();
                    xnVar7.e3 = null;
                    break;
                }
                break;
            case 9:
                this.b.Q4 = null;
                break;
            case 10:
                xn xnVar8 = this.b;
                xnVar8.Aa = 1.0f;
                xnVar8.V.setVisibility(4);
                xnVar8.L0.setVisibility(4);
                xnVar8.o9();
                break;
            default:
                xn xnVar9 = this.b;
                xnVar9.Aa = 0.0f;
                xnVar9.o9();
                break;
        }
    }
}
