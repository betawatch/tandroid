package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class xi extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ xi(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        uj ujVar;
        switch (this.a) {
            case 0:
                co coVar = this.b;
                gl glVar = coVar.b3;
                if (glVar != null) {
                    glVar.setIsMessageTransition(false);
                    coVar.b3.h(true);
                    coVar.b3.setVisibility(4);
                    break;
                }
                break;
            case 1:
                float dp = AndroidUtilities.dp(30.0f);
                co coVar2 = this.b;
                coVar2.A9 = dp;
                coVar2.o9();
                break;
            case 2:
                co coVar3 = this.b;
                if (coVar3.fragmentView != null && (ujVar = coVar3.x0) != null) {
                    ujVar.invalidate();
                    coVar3.fragmentView.invalidate();
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
                co coVar4 = this.b;
                if (animator.equals(coVar4.g3)) {
                    coVar4.g3 = null;
                    break;
                }
                break;
            case 6:
                co coVar5 = this.b;
                if (animator.equals(coVar5.g3)) {
                    coVar5.g3 = null;
                    break;
                }
                break;
            case 7:
                co coVar6 = this.b;
                if (animator.equals(coVar6.h3)) {
                    coVar6.i3 = 1.0f;
                    coVar6.lc();
                    coVar6.h3 = null;
                    break;
                }
                break;
            case 8:
                co coVar7 = this.b;
                if (animator.equals(coVar7.h3)) {
                    coVar7.i3 = 0.0f;
                    coVar7.lc();
                    coVar7.h3 = null;
                    break;
                }
                break;
            case 9:
                this.b.T4 = null;
                break;
            case 10:
                co coVar8 = this.b;
                coVar8.Da = 1.0f;
                coVar8.Y.setVisibility(4);
                coVar8.O0.setVisibility(4);
                coVar8.o9();
                break;
            default:
                co coVar9 = this.b;
                coVar9.Da = 0.0f;
                coVar9.o9();
                break;
        }
    }
}
