package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class tt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ou0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public tt0(PhotoViewer photoViewer, ou0 ou0Var, Integer num) {
        this.c = photoViewer;
        this.a = ou0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.d0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.C.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.C.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.f;
        duration.setInterpolator(prVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(prVar).start();
        photoViewer.b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.k4 = 4;
        photoViewer.b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        eg.q1 q1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(q1Var, (Property<eg.q1, Float>) View.TRANSLATION_Y, q1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(prVar);
        eg.q1 q1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(q1Var2, (Property<eg.q1, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(prVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.b0, (Property<iu0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.g0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new st0(this));
        animatorSet.start();
        return true;
    }
}
