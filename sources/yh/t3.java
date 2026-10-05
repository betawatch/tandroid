package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class t3 extends AnimatorListenerAdapter {
    public final /* synthetic */ v3 a;

    public t3(v3 v3Var) {
        this.a = v3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        v3 v3Var = this.a;
        o2 o2Var = v3Var.i0;
        v3Var.s0 = v3Var.r0;
        v3Var.d(v3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = v3Var.e;
        int i10 = 2 - v3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) v3Var.W.f;
        z7.f1(v3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - v3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(o2Var);
        AndroidUtilities.runOnUIThread(o2Var, 2500L);
    }
}
