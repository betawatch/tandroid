package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sr0 extends jg.j2 {
    public final Path r0;
    public boolean s0;
    public final org.telegram.ui.Components.t5 t0;
    public final /* synthetic */ PhotoViewer u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.u0 = photoViewer;
        this.r0 = new Path();
        this.t0 = new org.telegram.ui.Components.t5(this, 0L, 420L, org.telegram.ui.Components.gr.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.s0 = z10;
        if (!z11) {
            this.t0.f(z10, true);
        }
        invalidate();
    }

    @Override // jg.j2, vh.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.r0;
        path.rewind();
        path.addRoundRect(this.l0, org.telegram.messenger.i0.L(this.p0), org.telegram.messenger.i0.L(this.p0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.u0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.U0(canvas, this.k0, -13948117, 855638016, false, true, false);
        float d = this.t0.d(this.s0);
        if (d > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.t6.r1(d, -1));
        }
        setTextColor(i0.b.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.r0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
