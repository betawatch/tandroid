package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class yn0 implements ValueAnimator.AnimatorUpdateListener {
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        org.telegram.ui.Components.cb cbVar;
        Drawable[] drawableArr = PhotoViewer.Z8;
        org.telegram.ui.Components.xb xbVar = org.telegram.ui.Components.xb.w;
        if (xbVar == null || (cbVar = xbVar.e) == null) {
            return;
        }
        cbVar.updatePosition();
    }
}
