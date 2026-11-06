package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class vo0 extends org.telegram.ui.Components.y51 {
    public final org.telegram.ui.Components.ca g0;
    public final /* synthetic */ PhotoViewer h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo0(Context context, PhotoViewer photoViewer) {
        super(context);
        this.h0 = photoViewer;
        new Path();
        this.g0 = new org.telegram.ui.Components.ca(photoViewer.b0, this, 0, false);
    }

    @Override // org.telegram.ui.Components.y51
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f10 = -getX();
        PhotoViewer photoViewer = this.h0;
        canvas.translate(f10 - photoViewer.Q7.getX(), (-getY()) - photoViewer.Q7.getY());
        photoViewer.N0(canvas, this.g0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        int i7;
        if (org.telegram.messenger.iz.c0 && ((i7 = this.h0.m4) == 1 || i7 == 2 || i7 == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.h0.e0.invalidate();
        }
    }
}
