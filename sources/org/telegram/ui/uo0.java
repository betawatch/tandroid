package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class uo0 extends org.telegram.ui.Components.e61 {
    public final org.telegram.ui.Components.y9 h0;
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.i0 = photoViewer;
        new Path();
        this.h0 = new org.telegram.ui.Components.y9(photoViewer.c0, this, 0, false);
    }

    @Override // org.telegram.ui.Components.e61
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.i0;
        canvas.translate(f10 - photoViewer.R7.getX(), (-getY()) - photoViewer.R7.getY());
        photoViewer.N0(canvas, this.h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.gz.c0 && ((i7 = this.i0.n4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.i0.f0.invalidate();
        }
    }
}
