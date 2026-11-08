package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.gb gbVar;
        Drawable[] drawableArr = PhotoViewer.Y8;
        org.telegram.ui.Components.cc ccVar = org.telegram.ui.Components.cc.w;
        if (ccVar == null || (gbVar = ccVar.e) == null) {
            return;
        }
        gbVar.updatePosition();
    }
}
