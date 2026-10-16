package zh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n3 extends AnimatorListenerAdapter {
    public final /* synthetic */ o3 a;

    public n3(o3 o3Var) {
        this.a = o3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o3 o3Var = this.a;
        zf.c cVar = o3Var.i0;
        o3Var.s0 = o3Var.r0;
        o3Var.d(o3Var.U);
        TL_stars.starGiftAttributeModel[] stargiftattributemodelArr = o3Var.e;
        int i10 = 2 - o3Var.r0;
        stargiftattributemodelArr[i10] = (TL_stars.starGiftAttributeModel) o3Var.W.f;
        p7.a1(o3Var.d[i10].getImageReceiver(), stargiftattributemodelArr[2 - o3Var.r0].document, 160);
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) o3Var.a0.f;
        if (stargiftattributepattern != null) {
            org.telegram.ui.Components.s5 m10 = org.telegram.ui.Components.s5.m(UserConfig.selectedAccount, 7, stargiftattributepattern.document);
            m10.m = true;
            m10.v();
        }
        AndroidUtilities.cancelRunOnUIThread(cVar);
        AndroidUtilities.runOnUIThread(cVar, 2500L);
    }
}
