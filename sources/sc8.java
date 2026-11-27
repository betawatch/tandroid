// default package

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class sc8 extends v2b {
    public final Path t0;
    public boolean u0;
    public final mm v0;
    public final /* synthetic */ PhotoViewer w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc8(PhotoViewer photoViewer) {
        super(photoViewer.o5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.w0 = photoViewer;
        this.t0 = new Path();
        this.v0 = new mm(this, 0L, 420L, k43.h);
    }

    public final void m(boolean z, boolean z2) {
        this.u0 = z;
        if (!z2) {
            this.v0.f(z, true);
        }
        invalidate();
    }

    @Override // v2b, c51, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.t0;
        path.rewind();
        path.addRoundRect(this.n0, hl.L(this.r0), hl.L(this.r0), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.w0;
        if (this == photoViewer.u5 || this == photoViewer.v5) {
            canvas.translate(-photoViewer.t5.getX(), -photoViewer.t5.getY());
        }
        photoViewer.P(canvas, this.m0, -13948117, 855638016, false, true, false);
        float d = this.v0.d(this.u0);
        if (d > 0.0f) {
            canvas.drawColor(aob.p1(d, -1));
        }
        setTextColor(vm2.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.t0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
