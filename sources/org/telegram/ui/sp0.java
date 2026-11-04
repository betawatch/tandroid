package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ kq0 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public sp0(PhotoViewer photoViewer, kq0 kq0Var, Integer num) {
        this.c = photoViewer;
        this.a = kq0Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f;
        duration.setInterpolator(xqVar).start();
        photoViewer.O0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.P0.setTranslationY(-org.telegram.messenger.g0.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.Q0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.T0.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.t3.setTranslationY(org.telegram.messenger.g0.L(32.0f));
        photoViewer.t3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar).start();
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.o4 = 4;
        photoViewer.f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        ci.t4 t4Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(t4Var, (Property<ci.t4, Float>) View.TRANSLATION_Y, t4Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(xqVar);
        ci.t4 t4Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(t4Var2, (Property<ci.t4, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(xqVar);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f0, (Property<gq0, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new rp0(this));
        animatorSet.start();
        return true;
    }
}
