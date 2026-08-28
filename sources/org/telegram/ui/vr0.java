package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class vr0 extends org.telegram.ui.Components.v61 {
    public final org.telegram.ui.Components.fa c0;
    public final /* synthetic */ PhotoViewer d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.d0 = photoViewer;
        new Path();
        this.c0 = new org.telegram.ui.Components.fa(photoViewer.X, this, 0, false);
    }

    @Override // org.telegram.ui.Components.v61
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.d0;
        canvas.translate(f10 - photoViewer.M7.getX(), (-getY()) - photoViewer.M7.getY());
        photoViewer.T0(canvas, this.c0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i9;
        if (SharedConfig.photoViewerBlur && ((i9 = this.d0.j4) == 1 || i9 == 2 || i9 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.d0.a0.invalidate();
        }
    }
}
