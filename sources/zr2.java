// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.SparseArray;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zr2 extends cw3 {
    public static final Paint i = new Paint(2);
    public static final Rect j = new Rect();
    public as2 c;
    public as2 d;
    public ln e;
    public ln f;
    public as2 g;
    public as2 h;

    public static void c(Canvas canvas, as2 as2Var, Rect rect, float f) {
        int i2;
        Bitmap bitmap = (Bitmap) as2.e.get(as2Var.c);
        if (bitmap != null) {
            Paint paint = as2Var.d ? bs2.b : i;
            if (f < 1.0f) {
                i2 = paint.getAlpha();
                paint.setAlpha((int) (i2 * f));
            } else {
                i2 = nm7.d4;
            }
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
            if (f < 1.0f) {
                paint.setAlpha(i2);
            }
        }
    }

    @Override // cw3
    public final boolean a() {
        as2 as2Var = this.c;
        SparseArray sparseArray = as2.e;
        return sparseArray.indexOfKey(as2Var.c) >= 0 && sparseArray.indexOfKey(this.d.c) >= 0;
    }

    @Override // cw3
    public final void b() {
        if (a()) {
            return;
        }
        this.c.a();
        this.d.a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds;
        if (!a()) {
            b();
            Paint paint = gw3.d;
            paint.setColor(this.b);
            Rect bounds2 = getBounds();
            canvas.drawCircle(bounds2.centerX(), bounds2.centerY(), bounds2.width() * 0.4f, paint);
            return;
        }
        if (this.a) {
            Rect bounds3 = getBounds();
            int centerX = bounds3.centerX();
            int centerY = bounds3.centerY();
            boolean z = this.a;
            int i2 = z ? gw3.c : gw3.b;
            bounds = j;
            bounds.left = centerX - (i2 / 2);
            bounds.right = ((z ? gw3.c : gw3.b) / 2) + centerX;
            bounds.top = centerY - ((z ? gw3.c : gw3.b) / 2);
            bounds.bottom = ((z ? gw3.c : gw3.b) / 2) + centerY;
        } else {
            bounds = getBounds();
        }
        Rect rect = bounds;
        if (canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom, Canvas.EdgeType.AA)) {
            return;
        }
        byte b = 12;
        if (this.g != null) {
            ln lnVar = this.e;
            if (lnVar == null) {
                ln lnVar2 = new ln(0.0f, new xf2(this, b), 0L, 320L, d53.g);
                this.e = lnVar2;
                lnVar = lnVar2;
            }
            float e = lnVar.e(false, 1.0f);
            c(canvas, this.g, rect, Math.min(1.0f, e * 1.5f));
            c(canvas, this.c, rect, 1.0f - e);
            if (e >= 1.0f) {
                this.c = this.g;
                this.g = null;
            }
        } else {
            c(canvas, this.c, rect, 1.0f);
        }
        if (this.h == null) {
            c(canvas, this.d, rect, 1.0f);
            return;
        }
        ln lnVar3 = this.f;
        if (lnVar3 == null) {
            ln lnVar4 = new ln(0.0f, new xf2(this, b), 0L, 320L, d53.g);
            this.f = lnVar4;
            lnVar3 = lnVar4;
        }
        float e2 = lnVar3.e(false, 1.0f);
        c(canvas, this.h, rect, Math.min(1.0f, 1.5f * e2));
        c(canvas, this.d, rect, 1.0f - e2);
        if (e2 >= 1.0f) {
            this.d = this.h;
            this.h = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        i.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
