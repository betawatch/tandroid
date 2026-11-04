package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.fb fbVar;
        Drawable[] drawableArr = PhotoViewer.V8;
        org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.w;
        if (acVar == null || (fbVar = acVar.e) == null) {
            return;
        }
        fbVar.updatePosition();
    }
}
