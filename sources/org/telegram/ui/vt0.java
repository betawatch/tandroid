package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class vt0 extends rg.c2 {
    public final Path o0;
    public boolean p0;
    public final org.telegram.ui.Components.f6 q0;
    public final /* synthetic */ PhotoViewer r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(PhotoViewer photoViewer) {
        super(photoViewer.p5, photoViewer.E, photoViewer.v2, photoViewer.b0);
        this.r0 = photoViewer;
        this.o0 = new Path();
        this.q0 = new org.telegram.ui.Components.f6(this, 0L, 420L, org.telegram.ui.Components.bs.h);
    }

    public final void m(boolean z10, boolean z11) {
        this.p0 = z10;
        if (!z11) {
            this.q0.f(z10, true);
        }
        invalidate();
    }

    @Override // rg.c2, ei.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.o0;
        path.rewind();
        path.addRoundRect(this.i0, AndroidUtilities.dp(this.m0), AndroidUtilities.dp(this.m0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.r0;
        if (this == photoViewer.v5 || this == photoViewer.w5) {
            canvas.translate(-photoViewer.u5.getX(), -photoViewer.u5.getY());
        }
        photoViewer.U0(canvas, this.h0, -13948117, 855638016, false, true, false);
        float e = this.q0.e(this.p0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(e, -1));
        }
        setTextColor(i0.b.f(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.o0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
