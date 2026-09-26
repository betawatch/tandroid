package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class zt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ tu0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public zt0(PhotoViewer photoViewer, tu0 tu0Var, Integer num) {
        this.c = photoViewer;
        this.a = tu0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.g0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.F.setTranslationY(-AndroidUtilities.dp(32.0f));
        ViewPropertyAnimator duration = photoViewer.F.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.rr rrVar = org.telegram.ui.Components.rr.f;
        duration.setInterpolator(rrVar).start();
        photoViewer.N0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.N0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.O0.setTranslationY(-AndroidUtilities.dp(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.P0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.P0.animate().alpha(1.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.S0.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.S0.setAlpha(0.0f);
        photoViewer.S0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.s3.setTranslationY(AndroidUtilities.dp(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(rrVar).start();
        photoViewer.e0.setAlpha(0.0f);
        photoViewer.L0.setAlpha(0);
        photoViewer.n4 = 4;
        photoViewer.e0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        t5 t5Var = photoViewer.P0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t5Var, (Property<t5, Float>) View.TRANSLATION_Y, t5Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(rrVar);
        t5 t5Var2 = photoViewer.P0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t5Var2, (Property<t5, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(rrVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.e0, (Property<nu0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new yt0(this));
        animatorSet.start();
        return true;
    }
}
