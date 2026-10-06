package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
