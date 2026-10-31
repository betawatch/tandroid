package ph;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.w5;
import rh.s8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i1 extends Drawable {
    public final int a;
    public final RectF b;
    public final Path c;
    public final Paint d;
    public final s8 e;
    public boolean f;
    public w5 g;
    public h1 h;
    public boolean i;

    public i1(int i10) {
        this(i0.b.o(i10, 128), i10);
    }

    public final void a() {
        boolean z10 = this.e != null && this.i && sc.e(131072);
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        if (z10) {
            rf.g d = rf.g.d();
            w5 w5Var = new w5(this, 29);
            this.g = w5Var;
            d.a(15, w5Var);
        } else {
            rf.g.d().f(this.g);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.d;
        Path path = this.c;
        canvas.drawPath(path, paint);
        s8 s8Var = this.e;
        if (s8Var != null) {
            if (this.f || !this.i) {
                canvas.save();
                canvas.clipPath(path);
                if (this.g == null) {
                    s8Var.d();
                }
                s8Var.a(canvas, this.a);
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
        s8 s8Var = this.e;
        if (s8Var != null) {
            s8Var.g(rectF);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.d.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }

    public i1(int i10, int i11) {
        this.b = new RectF();
        this.c = new Path();
        Paint paint = new Paint(1);
        this.d = paint;
        this.a = i10;
        paint.setColor(i11);
        if (Build.VERSION.SDK_INT >= 29) {
            this.e = new s8(1, 25);
        } else {
            this.e = null;
        }
    }
}
