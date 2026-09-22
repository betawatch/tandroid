package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class u3 extends AnimatorListenerAdapter {
    public final /* synthetic */ w3 a;

    public u3(w3 w3Var) {
        this.a = w3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        w3 w3Var = this.a;
        x2 x2Var = w3Var.i0;
        w3Var.s0 = w3Var.r0;
        w3Var.d(w3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = w3Var.e;
        int i10 = 2 - w3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) w3Var.W.f;
        x7.Z0(w3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - w3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) w3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(x2Var);
        AndroidUtilities.runOnUIThread(x2Var, 2500L);
    }
}
