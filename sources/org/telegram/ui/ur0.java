package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.ub ubVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.w;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }
}
