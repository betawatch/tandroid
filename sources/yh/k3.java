package yh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class k3 extends Drawable {
    public final float a;
    public final Paint b;

    public k3(float f7, int i10) {
        Paint paint = new Paint(1);
        this.b = paint;
        this.a = f7;
        paint.setColor(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(getBounds());
        Paint paint = this.b;
        float f7 = this.a;
        canvas.drawRoundRect(rectF, f7, f7, paint);
        AndroidUtilities.drawStroke(canvas, rectF, f7);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
