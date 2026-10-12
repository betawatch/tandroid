package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class qm implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ org.telegram.ui.Cells.u1 a;
    public final /* synthetic */ rm b;

    public qm(rm rmVar, org.telegram.ui.Cells.u1 u1Var) {
        this.b = rmVar;
        this.a = u1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fo foVar = this.b.Q;
        org.telegram.ui.Cells.u1 u1Var = this.a;
        u1Var.getViewTreeObserver().removeOnPreDrawListener(this);
        MessageObject.SendAnimationData sendAnimationData = u1Var.getMessageObject().sendAnimationData;
        if (sendAnimationData == null) {
            return true;
        }
        foVar.n6.add(u1Var);
        ImageReceiver photoImage = u1Var.getPhotoImage();
        float imageWidth = sendAnimationData.fromPreview ? 1.0f : sendAnimationData.width / photoImage.getImageWidth();
        int[] iArr = new int[2];
        u1Var.getTransitionParams().x0 = true;
        u1Var.getLocationInWindow(iArr);
        iArr[1] = (int) (iArr[1] - u1Var.getTranslationY());
        if (foVar.Y.x0()) {
            iArr[1] = AndroidUtilities.dp(48.0f) + iArr[1];
        }
        AnimatorSet animatorSet = new AnimatorSet();
        mm mmVar = new mm("p1", 0);
        nm nmVar = new nm(this);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ObjectAnimator.ofFloat(sendAnimationData, mmVar, imageWidth, 1.0f), ObjectAnimator.ofFloat(sendAnimationData, new om(this), 0.0f, 1.0f));
        animatorSet.playTogether(ObjectAnimator.ofFloat(sendAnimationData, nmVar, sendAnimationData.x, iArr[0] + (sendAnimationData.fromPreview ? 0.0f : photoImage.getCenterX())), animatorSet2);
        animatorSet.setInterpolator(org.telegram.ui.Components.es.h);
        animatorSet.setDuration(460L);
        animatorSet.addListener(new u0(this, 25));
        animatorSet.start();
        pm pmVar = new pm(this);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(ObjectAnimator.ofFloat(sendAnimationData, pmVar, 0.0f, 1.0f));
        animatorSet3.setDuration(100L);
        animatorSet3.setStartDelay(150L);
        animatorSet3.setInterpolator(new DecelerateInterpolator());
        animatorSet3.start();
        return true;
    }
}
