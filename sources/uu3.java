// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class uu3 extends ru3 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public qu3 c;
    public boolean d;

    @Override // ru3
    public final boolean a() {
        Bitmap[][] bitmapArr = vu3.f;
        qu3 qu3Var = this.c;
        return bitmapArr[qu3Var.a][qu3Var.b] != null;
    }

    @Override // ru3
    public final void b() {
        if (a()) {
            return;
        }
        qu3 qu3Var = this.c;
        vu3.i(qu3Var.a, qu3Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z = this.d;
        qu3 qu3Var = this.c;
        if (!a()) {
            vu3.i(qu3Var.a, qu3Var.b);
            Paint paint = vu3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z2 = this.a;
            int i = z2 ? vu3.c : vu3.b;
            bounds = f;
            bounds.left = centerX - (i / 2);
            bounds.right = ((z2 ? vu3.c : vu3.b) / 2) + centerX;
            bounds.top = centerY - ((z2 ? vu3.c : vu3.b) / 2);
            bounds.bottom = ((z2 ? vu3.c : vu3.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        if (canvas.quickReject(bounds.left, bounds.top, bounds.right, bounds.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        if (z) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, bounds.centerX(), bounds.centerY());
        }
        canvas.drawBitmap(vu3.f[qu3Var.a][qu3Var.b], (Rect) null, bounds, e);
        if (z) {
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
