// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class va9 extends Drawable {
    public final kj3 e;
    public final kj3 f;
    public float h;
    public float i;
    public final Rect a = new Rect();
    public final k43 b = dt3.b;
    public final int c = hl.L(24.0f);
    public final int d = hl.L(24.0f);
    public long g = -1;

    public va9() {
        kj3 kj3Var = new kj3((byte) 2);
        this.e = kj3Var;
        kj3Var.b.setColor(-2130706433);
        kj3 kj3Var2 = new kj3((byte) 2);
        this.f = kj3Var2;
        kj3Var2.b.setColor(-2130706433);
    }

    public final void a(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (hl.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (hl.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (hl.L(4.0f) * this.i));
        kj3 kj3Var = this.f;
        kj3Var.setBounds(rect);
        kj3Var.draw(canvas);
        int L3 = hl.L(12.0f);
        rect.right = L3;
        rect.left = L3;
        int L4 = hl.L(8.0f);
        rect.bottom = L4;
        rect.top = L4;
        rect.inset(-hl.L(hl.U1(interpolation, 10, 11)), -hl.L(hl.U1(interpolation, 2, 3)));
        kj3 kj3Var2 = this.e;
        kj3Var2.setBounds(rect);
        kj3Var2.setAlpha(hl.U1(interpolation, 128, jn7.d4));
        kj3Var2.draw(canvas);
    }

    public final void b(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (hl.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (hl.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (hl.L(4.0f) * this.i));
        rect.offset(0, hl.L(hl.U1(interpolation, 0, -8)));
        kj3 kj3Var = this.f;
        kj3Var.setBounds(rect);
        kj3Var.draw(canvas);
        rect.left = (int) (hl.N(hl.U1(interpolation, 1, 2)) * this.h);
        int N = (int) (hl.N(hl.U1(interpolation, 5, 6)) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (hl.N(hl.U1(interpolation, 6, 4)) * this.i));
        rect.offset(0, hl.L(hl.U1(interpolation, 0, 8)));
        kj3 kj3Var2 = this.e;
        kj3Var2.setBounds(rect);
        kj3Var2.setAlpha(jn7.d4);
        kj3Var2.draw(canvas);
    }

    public final void c(Canvas canvas, float f) {
        Rect bounds = getBounds();
        float interpolation = this.b.getInterpolation(f);
        int L = (int) (hl.L(2.0f) * this.h);
        Rect rect = this.a;
        rect.left = L;
        int L2 = bounds.bottom - ((int) (hl.L(6.0f) * this.i));
        rect.bottom = L2;
        rect.right = bounds.right - rect.left;
        rect.top = L2 - ((int) (hl.L(4.0f) * this.i));
        rect.offset(0, hl.L(-8.0f));
        kj3 kj3Var = this.f;
        kj3Var.setBounds(rect);
        kj3Var.draw(canvas);
        rect.left = (int) (hl.N(2.0f) * this.h);
        int N = (int) (hl.N(6.0f) * this.i);
        rect.top = N;
        rect.right = bounds.right - rect.left;
        rect.bottom = N + ((int) (hl.N(4.0f) * this.i));
        rect.offset(0, hl.L(8.0f));
        kj3 kj3Var2 = this.e;
        kj3Var2.setBounds(rect);
        kj3Var2.setAlpha(hl.U1(interpolation, jn7.d4, 128));
        kj3Var2.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.g <= 0) {
            a(canvas, 0.0f);
            return;
        }
        int currentTimeMillis = (int) (System.currentTimeMillis() - this.g);
        int i = currentTimeMillis - 300;
        if (i < 0) {
            a(canvas, 0.0f);
        } else if (i < 150) {
            a(canvas, i / 150.0f);
        } else {
            int i2 = currentTimeMillis - 750;
            if (i2 < 0) {
                a(canvas, 1.0f);
            } else if (i2 < 200) {
                b(canvas, i2 / 200.0f);
            } else {
                int i3 = currentTimeMillis - 1250;
                if (i3 < 0) {
                    b(canvas, 1.0f);
                } else if (i3 < 150) {
                    c(canvas, i3 / 150.0f);
                } else {
                    c(canvas, 1.0f);
                    if (currentTimeMillis - 1400 >= 100) {
                        this.g = System.currentTimeMillis();
                    }
                }
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.h = rect.width() / this.c;
        this.i = rect.height() / this.d;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
        this.f.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
