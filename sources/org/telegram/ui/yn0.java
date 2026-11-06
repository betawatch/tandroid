package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
