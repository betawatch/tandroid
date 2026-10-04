package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.vb vbVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.w;
        if (rcVar == null || (vbVar = rcVar.e) == null) {
            return;
        }
        vbVar.updatePosition();
    }
}
