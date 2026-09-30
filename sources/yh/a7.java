package yh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.w9;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class a7 extends w9 {
    public vh.f G;
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
            this.G = vh.f.e(this);
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

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onAttachedToWindow() {
        vh.f fVar = this.G;
        if (fVar != null) {
            fVar.a(this);
        }
        super.onAttachedToWindow();
    }

    @Override // org.telegram.ui.Components.w9, android.view.View
    public final void onDetachedFromWindow() {
        vh.f fVar = this.G;
        if (fVar != null) {
            fVar.b(this);
        }
        super.onDetachedFromWindow();
    }
}
