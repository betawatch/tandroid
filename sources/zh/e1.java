package zh;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import bi.ud;
import org.telegram.messenger.rc;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e1 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final ud e;
    public boolean f;
    public wg.p g;
    public xg.a h;
    public boolean i;

    public e1(int i7) {
        this(i0.a.o(i7, 128), i7);
    }

    public final void a() {
        boolean z9 = this.e != null && this.i && rc.e(131072);
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        if (z9) {
            bg.k d = bg.k.d();
            wg.p pVar = new wg.p(this, 10);
            this.g = pVar;
            d.a(15, pVar);
        } else {
            bg.k.d().f(this.g);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        ud udVar = this.e;
        if (udVar != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    udVar.d();
                }
                udVar.a(canvas, this.a);
                canvas.restore();
                if (this.g == null) {
                    invalidateSelf();
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        float min = Math.min(rect.width(), rect.height()) / 2.0f;
        RectF rectF = this.b;
        rectF.set(rect);
        Path path = this.c;
        path.rewind();
        path.addRoundRect(rectF, min, min, Path.Direction.CW);
        ud udVar = this.e;
        if (udVar != null) {
            udVar.g(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i7) {
        this.d.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public e1(int i7, int i10) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i7;
        paint.setColor(i10);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new ud(1, 25);
        } else {
            this.e = null;
        }
    }
}
