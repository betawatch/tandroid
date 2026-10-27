package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class wt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ qu0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public wt0(PhotoViewer photoViewer, qu0 qu0Var, Integer num) {
        this.c = photoViewer;
        this.a = qu0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.f;
        duration.setInterpolator(dsVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(dsVar).start();
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.n4 = 4;
        photoViewer.e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        bi.j5 j5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(j5Var, (Property<bi.j5, Float>) View.TRANSLATION_Y, j5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(dsVar);
        bi.j5 j5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(j5Var2, (Property<bi.j5, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(dsVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.e0, (Property<ku0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new vt0(this));
        animatorSet.start();
        return true;
    }
}
