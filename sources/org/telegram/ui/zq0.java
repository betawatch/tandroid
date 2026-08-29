package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.rb rbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.w;
        if (mcVar == null || (rbVar = mcVar.e) == null) {
            return;
        }
        rbVar.updatePosition();
    }
}
