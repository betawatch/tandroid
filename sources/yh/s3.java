package yh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ u3 a;

    public s3(u3 u3Var) {
        this.a = u3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        u3 u3Var = this.a;
        r2 r2Var = u3Var.i0;
        u3Var.s0 = u3Var.r0;
        u3Var.d(u3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = u3Var.e;
        int i10 = 2 - u3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) u3Var.W.f;
        w7.Z0(u3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - u3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(r2Var);
        AndroidUtilities.runOnUIThread(r2Var, 2500L);
    }
}
