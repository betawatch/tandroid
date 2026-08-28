package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.lb lbVar;
        Drawable[] drawableArr = PhotoViewer.P8;
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.w;
        if (gcVar == null || (lbVar = gcVar.e) == null) {
            return;
        }
        lbVar.updatePosition();
    }
}
