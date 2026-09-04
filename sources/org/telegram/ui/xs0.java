package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class xs0 extends org.telegram.ui.Components.r71 {
    public final org.telegram.ui.Components.na g0;
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h0 = photoViewer;
        new Path();
        this.g0 = new org.telegram.ui.Components.na(photoViewer.b0, this, 0, false);
    }

    @Override // org.telegram.ui.Components.r71
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f7 = -getX();
        PhotoViewer photoViewer = this.h0;
        canvas.translate(f7 - photoViewer.Q7.getX(), (-getY()) - photoViewer.Q7.getY());
        photoViewer.T0(canvas, this.g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i10;
        if (SharedConfig.photoViewerBlur && ((i10 = this.h0.n4) == 1 || i10 == 2 || i10 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.h0.e0.invalidate();
        }
    }
}
