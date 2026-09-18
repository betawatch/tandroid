package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class v3 extends AnimatorListenerAdapter {
    public final /* synthetic */ x3 a;

    public v3(x3 x3Var) {
        this.a = x3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        x3 x3Var = this.a;
        y2 y2Var = x3Var.i0;
        x3Var.s0 = x3Var.r0;
        x3Var.d(x3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = x3Var.e;
        int i10 = 2 - x3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) x3Var.W.f;
        y7.Z0(x3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - x3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) x3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.o5 m10 = org.telegram.ui.Components.o5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(y2Var);
        AndroidUtilities.runOnUIThread(y2Var, 2500L);
    }
}
