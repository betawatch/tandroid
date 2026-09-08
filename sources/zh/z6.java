package zh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class z6 extends x9 {
    public wh.g G;
    public Path H;
    public RectF I;
    public Drawable J;

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.I;
        Path path = this.H;
        Drawable drawable = this.J;
        super.dispatchDraw(canvas);
        if (this.G == null) {
            this.G = wh.g.e(this);
        }
        if (this.G != null) {
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            path.rewind();
            path.addRoundRect(rectF, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas2 = canvas;
            this.G.c(canvas2, this, getWidth(), getHeight(), 1.0f, false);
            canvas2.restore();
        } else {
            canvas2 = canvas;
        }
        drawable.setBounds((getWidth() - drawable.getIntrinsicWidth()) / 2, (getHeight() - drawable.getIntrinsicHeight()) / 2, (drawable.getIntrinsicWidth() + getWidth()) / 2, (drawable.getIntrinsicHeight() + getHeight()) / 2);
        drawable.draw(canvas2);
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onAttachedToWindow() {
        wh.g gVar = this.G;
        if (gVar != null) {
            gVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.x9, android.view.View
    public final void onDetachedFromWindow() {
        wh.g gVar = this.G;
        if (gVar != null) {
            gVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
