package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wr0 extends org.telegram.ui.Components.x61 {
    public final org.telegram.ui.Components.da c0;
    public final /* synthetic */ PhotoViewer d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.d0 = photoViewer;
        new Path();
        this.c0 = new org.telegram.ui.Components.da(photoViewer.X, this, 0, false);
    }

    @Override // org.telegram.ui.Components.x61
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
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.d0.j4) == 1 || i10 == 2 || i10 == 3)) {
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
