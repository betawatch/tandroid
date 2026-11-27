// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class wnb extends Drawable {
    public float[] b;
    public Path a = new Path();
    public boolean c = true;

    public wnb(float f, float f2) {
        this.b = new float[]{r2, r2, r2, r2, r2, r2, r2, r2};
        float L = hl.L(f);
        float L2 = hl.L(f2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path = this.a;
        if (this.c) {
            this.c = false;
            path.reset();
            RectF rectF = hl.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.b, Path.Direction.CW);
        }
        canvas.drawPath(path, aob.z);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.c = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
