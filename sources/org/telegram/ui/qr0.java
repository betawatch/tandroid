package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qr0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.ub ubVar;
        Drawable[] drawableArr = PhotoViewer.U8;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.x;
        if (qcVar == null || (ubVar = qcVar.e) == null) {
            return;
        }
        ubVar.updatePosition();
    }
}
