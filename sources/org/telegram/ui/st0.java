package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class st0 extends dg.c3 {
    public final Path l0;
    public boolean m0;
    public final org.telegram.ui.Components.z5 n0;
    public final /* synthetic */ PhotoViewer o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public st0(PhotoViewer photoViewer) {
        super(photoViewer.m5, photoViewer.B, photoViewer.s2, photoViewer.Y);
        this.o0 = photoViewer;
        this.l0 = new Path();
        this.n0 = new org.telegram.ui.Components.z5(this, 0L, 420L, org.telegram.ui.Components.nr.h);
    }

    public final void m(boolean z4, boolean z10) {
        this.m0 = z4;
        if (!z10) {
            this.n0.f(z4, true);
        }
        invalidate();
    }

    @Override // dg.c3, ph.d, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.l0;
        path.rewind();
        path.addRoundRect(this.f0, AndroidUtilities.dp(this.j0), AndroidUtilities.dp(this.j0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.o0;
        if (this == photoViewer.s5 || this == photoViewer.t5) {
            canvas.translate(-photoViewer.r5.getX(), -photoViewer.r5.getY());
        }
        photoViewer.T0(canvas, this.e0, -13948117, 855638016, false, true, false);
        float e = this.n0.e(this.m0);
        if (e > 0.0f) {
            canvas.drawColor(org.telegram.ui.ActionBar.j6.l1(e, -1));
        }
        setTextColor(i0.a.d(e, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.l0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
