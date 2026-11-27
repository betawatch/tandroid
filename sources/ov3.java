// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class ov3 extends lv3 {
    public static final Paint e = new Paint(2);
    public static final Rect f = new Rect();
    public kv3 c;
    public boolean d;

    @Override // lv3
    public final boolean a() {
        Bitmap[][] bitmapArr = pv3.f;
        kv3 kv3Var = this.c;
        return bitmapArr[kv3Var.a][kv3Var.b] != null;
    }

    @Override // lv3
    public final void b() {
        if (a()) {
            return;
        }
        kv3 kv3Var = this.c;
        pv3.i(kv3Var.a, kv3Var.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        boolean z = this.d;
        kv3 kv3Var = this.c;
        if (!a()) {
            pv3.i(kv3Var.a, kv3Var.b);
            Paint paint = pv3.d;
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
            int i = z2 ? pv3.c : pv3.b;
            bounds = f;
            bounds.left = centerX - (i / 2);
            bounds.right = ((z2 ? pv3.c : pv3.b) / 2) + centerX;
            bounds.top = centerY - ((z2 ? pv3.c : pv3.b) / 2);
            bounds.bottom = ((z2 ? pv3.c : pv3.b) / 2) + centerY;
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
        canvas.drawBitmap(pv3.f[kv3Var.a][kv3Var.b], (Rect) null, bounds, e);
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
