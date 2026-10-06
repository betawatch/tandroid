package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
