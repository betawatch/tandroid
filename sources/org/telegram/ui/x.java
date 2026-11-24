package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class x implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ o98 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ PhotoViewer c;

    public x(PhotoViewer photoViewer, o98 o98Var, Integer num) {
        this.c = photoViewer;
        this.a = o98Var;
        this.b = num;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        PhotoViewer photoViewer = this.c;
        photoViewer.h0.getViewTreeObserver().removeOnPreDrawListener(this);
        photoViewer.G.setTranslationY(-gl.L(32.0f));
        ViewPropertyAnimator duration = photoViewer.G.animate().alpha(1.0f).translationY(0.0f).setDuration(150L);
        s33 s33Var = s33.f;
        duration.setInterpolator(s33Var).start();
        photoViewer.O0.setTranslationY(-gl.L(32.0f));
        photoViewer.O0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
        photoViewer.P0.setTranslationY(-gl.L(32.0f));
        photoViewer.P0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
        photoViewer.Q0.setTranslationY(gl.L(32.0f));
        photoViewer.Q0.animate().alpha(1.0f).setDuration(150L).setInterpolator(s33Var).start();
        photoViewer.T0.setTranslationY(gl.L(32.0f));
        photoViewer.T0.setAlpha(0.0f);
        photoViewer.T0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
        photoViewer.s3.setTranslationY(gl.L(32.0f));
        photoViewer.s3.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(s33Var).start();
        photoViewer.f0.setAlpha(0.0f);
        photoViewer.M0.setAlpha(0);
        photoViewer.m4 = (byte) 4;
        photoViewer.f0.invalidate();
        AnimatorSet animatorSet = new AnimatorSet();
        jo0 jo0Var = photoViewer.Q0;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) View.TRANSLATION_Y, jo0Var.getTranslationY(), 0.0f).setDuration(220L);
        duration2.setInterpolator(s33Var);
        jo0 jo0Var2 = photoViewer.Q0;
        Property property = View.ALPHA;
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property, 1.0f).setDuration(220L);
        duration3.setInterpolator(s33Var);
        animatorSet.playTogether(ObjectAnimator.ofFloat(photoViewer.f0, (Property<k98, Float>) property, 0.0f, 1.0f).setDuration(220L), ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property, 0.0f, 1.0f).setDuration(220L), duration2, duration3);
        animatorSet.addListener(new w(this));
        animatorSet.start();
        return true;
    }
}
