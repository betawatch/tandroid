package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class wt0 extends rg.e2 {
    public final Path r0;
    public boolean s0;
    public final org.telegram.ui.Components.f6 t0;
    public final /* synthetic */ PhotoViewer u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.u0 = photoViewer;
        this.r0 = new Path();
        this.t0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.s0 = z10;
        if (!z11) {
            this.t0.f(z10, true);
        }
        invalidate();
    }

    @Override // rg.e2, ei.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.r0;
        path.rewind();
        path.addRoundRect(this.l0, AndroidUtilities.dp(this.p0), AndroidUtilities.dp(this.p0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.u0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.V0(canvas, this.k0, -13948117, 855638016, false, true, false);
        float e = this.t0.e(this.s0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.k6.o1(e, -1));
        }
        setTextColor(i0.a.f(e, -1, -16777216));
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
