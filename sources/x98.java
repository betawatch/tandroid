// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class x98 extends pec {
    public final wm0 h0;
    public final /* synthetic */ PhotoViewer i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x98(Context context, PhotoViewer photoViewer) {
        super(context);
        this.i0 = photoViewer;
        this.h0 = new wm0(photoViewer.c0, this, 0, false);
    }

    @Override // pec
    public final void b(Canvas canvas, RectF rectF) {
        canvas.save();
        canvas.clipRect(rectF);
        float f = -getX();
        PhotoViewer photoViewer = this.i0;
        canvas.translate(f - photoViewer.W7.getX(), (-getY()) - photoViewer.W7.getY());
        photoViewer.P(canvas, this.h0, -14803426, 855638016, false, true, false);
        canvas.restore();
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b;
        if (gda.Z && ((b = this.i0.m4) == 1 || b == 2 || b == 3)) {
            return;
        }
        super.invalidate();
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if (getTranslationY() != f) {
            super.setTranslationY(f);
            this.i0.f0.invalidate();
        }
    }
}
