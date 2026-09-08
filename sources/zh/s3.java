package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class s3 extends AnimatorListenerAdapter {
    public final /* synthetic */ t3 a;

    public s3(t3 t3Var) {
        this.a = t3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t3 t3Var = this.a;
        m2 m2Var = t3Var.i0;
        t3Var.s0 = t3Var.r0;
        t3Var.d(t3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = t3Var.e;
        int i10 = 2 - t3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) t3Var.W.f;
        v7.Z0(t3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - t3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.q5 m10 = org.telegram.ui.Components.q5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(m2Var);
        AndroidUtilities.runOnUIThread(m2Var, 2500L);
    }
}
