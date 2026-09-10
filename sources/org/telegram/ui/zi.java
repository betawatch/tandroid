package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ zi(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        wj wjVar;
        switch (this.a) {
            case 0:
                eo eoVar = this.b;
                il ilVar = eoVar.b3;
                if (ilVar != null) {
                    ilVar.setIsMessageTransition(false);
                    eoVar.b3.h(true);
                    eoVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                eo eoVar2 = this.b;
                eoVar2.A9 = dp;
                eoVar2.o9();
                break;
            case 2:
                eo eoVar3 = this.b;
                if (eoVar3.fragmentView != null && (wjVar = eoVar3.x0) != null) {
                    wjVar.invalidate();
                    eoVar3.fragmentView.invalidate();
                    break;
                }
                break;
            case 3:
                this.b.P.setVisibility(4);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new fj(this, 3), 2000L);
                break;
            case 5:
                eo eoVar4 = this.b;
                if (animator.equals(eoVar4.g3)) {
                    eoVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                eo eoVar5 = this.b;
                if (animator.equals(eoVar5.g3)) {
                    eoVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                eo eoVar6 = this.b;
                if (animator.equals(eoVar6.h3)) {
                    eoVar6.i3 = 1.0f;
                    eoVar6.lc();
                    eoVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                eo eoVar7 = this.b;
                if (animator.equals(eoVar7.h3)) {
                    eoVar7.i3 = 0.0f;
                    eoVar7.lc();
                    eoVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                eo eoVar8 = this.b;
                eoVar8.Da = 1.0f;
                eoVar8.Y.setVisibility(4);
                eoVar8.O0.setVisibility(4);
                eoVar8.o9();
                break;
            default:
                eo eoVar9 = this.b;
                eoVar9.Da = 0.0f;
                eoVar9.o9();
                break;
        }
    }
}
