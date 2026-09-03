package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.f;
        duration.setInterpolator(mrVar).start();
        photoViewer.K0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.K0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.L0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.L0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.M0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.M0.animate().alpha(1.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.setAlpha(0.0f);
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.p3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.p3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(mrVar).start();
        photoViewer.b0.setAlpha(0.0f);
        photoViewer.I0.setAlpha(0);
        photoViewer.k4 = 4;
        photoViewer.b0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        dg.s1 s1Var = photoViewer.M0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(s1Var, (Property<dg.s1, Float>) View.TRANSLATION_Y, s1Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(mrVar);
        dg.s1 s1Var2 = photoViewer.M0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(s1Var2, (Property<dg.s1, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(mrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.b0, (Property<iu0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.g0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new st0(this));
        animatorSet.start();
        return true;
    }
}
