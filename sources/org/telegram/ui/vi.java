package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ vi(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        sj sjVar;
        switch (this.a) {
            case 0:
                zn znVar = this.b;
                fl flVar = znVar.Y2;
                if (flVar != null) {
                    flVar.setIsMessageTransition(false);
                    znVar.Y2.h(true);
                    znVar.Y2.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                zn znVar2 = this.b;
                znVar2.x9 = dp;
                znVar2.o9();
                break;
            case 2:
                zn znVar3 = this.b;
                if (znVar3.fragmentView != null && (sjVar = znVar3.u0) != null) {
                    sjVar.invalidate();
                    znVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.M.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new bj(this, 3), 2000L);
                break;
            case 5:
                zn znVar4 = this.b;
                if (animator.equals(znVar4.d3)) {
                    znVar4.d3 = null;
                    break;
                }
                break;
            case 6:
                zn znVar5 = this.b;
                if (animator.equals(znVar5.d3)) {
                    znVar5.d3 = null;
                    break;
                }
                break;
            case 7:
                zn znVar6 = this.b;
                if (animator.equals(znVar6.e3)) {
                    znVar6.f3 = 1.0f;
                    znVar6.lc();
                    znVar6.e3 = null;
                    break;
                }
                break;
            case 8:
                zn znVar7 = this.b;
                if (animator.equals(znVar7.e3)) {
                    znVar7.f3 = 0.0f;
                    znVar7.lc();
                    znVar7.e3 = null;
                    break;
                }
                break;
            case 9:
                this.b.Q4 = null;
                break;
            case 10:
                zn znVar8 = this.b;
                znVar8.Aa = 1.0f;
                znVar8.V.setVisibility(4);
                znVar8.L0.setVisibility(4);
                znVar8.o9();
                break;
            default:
                zn znVar9 = this.b;
                znVar9.Aa = 0.0f;
                znVar9.o9();
                break;
        }
    }
}
