package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ xi(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uj ujVar;
        switch (this.a) {
            case 0:
                bo boVar = this.b;
                gl glVar = boVar.b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    boVar.b3.h(true);
                    boVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                bo boVar2 = this.b;
                boVar2.A9 = dp;
                boVar2.o9();
                break;
            case 2:
                bo boVar3 = this.b;
                if (boVar3.fragmentView != null && (ujVar = boVar3.x0) != null) {
                    ujVar.invalidate();
                    boVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new dj(this, 3), 2000L);
                break;
            case 5:
                bo boVar4 = this.b;
                if (animator.equals(boVar4.g3)) {
                    boVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                bo boVar5 = this.b;
                if (animator.equals(boVar5.g3)) {
                    boVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                bo boVar6 = this.b;
                if (animator.equals(boVar6.h3)) {
                    boVar6.i3 = 1.0f;
                    boVar6.lc();
                    boVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                bo boVar7 = this.b;
                if (animator.equals(boVar7.h3)) {
                    boVar7.i3 = 0.0f;
                    boVar7.lc();
                    boVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                bo boVar8 = this.b;
                boVar8.Da = 1.0f;
                boVar8.Y.setVisibility(4);
                boVar8.O0.setVisibility(4);
                boVar8.o9();
                break;
            default:
                bo boVar9 = this.b;
                boVar9.Da = 0.0f;
                boVar9.o9();
                break;
        }
    }
}
