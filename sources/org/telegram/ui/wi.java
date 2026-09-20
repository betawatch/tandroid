package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class wi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ wi(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        tj tjVar;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                org.telegram.ui.Components.e60 e60Var = znVar.b3;
                if (e60Var != null) {
                    e60Var.setIsMessageTransition(false);
                    znVar.b3.c(true);
                    znVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                zn znVar2 = this.b;
                znVar2.A9 = dp;
                znVar2.o9();
                break;
            case 2:
                zn znVar3 = this.b;
                if (znVar3.fragmentView != null && (tjVar = znVar3.x0) != null) {
                    tjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new cj(this, 3), 2000L);
                break;
            case 5:
                zn znVar4 = this.b;
                if (animator.equals(znVar4.g3)) {
                    znVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                zn znVar5 = this.b;
                if (animator.equals(znVar5.g3)) {
                    znVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                zn znVar6 = this.b;
                if (animator.equals(znVar6.h3)) {
                    znVar6.i3 = 1.0f;
                    znVar6.lc();
                    znVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                zn znVar7 = this.b;
                if (animator.equals(znVar7.h3)) {
                    znVar7.i3 = 0.0f;
                    znVar7.lc();
                    znVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                zn znVar8 = this.b;
                znVar8.Da = 1.0f;
                znVar8.Y.setVisibility(4);
                znVar8.O0.setVisibility(4);
                znVar8.o9();
                break;
            default:
                zn znVar9 = this.b;
                znVar9.Da = 0.0f;
                znVar9.o9();
                break;
        }
    }
}
