package yf;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class z extends Drawable {
    public static final PathInterpolator i = new PathInterpolator(0.42f, 0.0f, 0.58f, 1.0f);
    public final Interpolator a;
    public final GradientDrawable b;
    public final int e;
    public final int[] f;
    public int g;
    public final Paint c = new Paint(1);
    public final Rect d = new Rect();
    public int h = 255;

    public z(int i10) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.b = gradientDrawable;
        this.a = i;
        this.f = new int[8];
        this.e = i10;
        if (i10 == 1) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        } else if (i10 == 2) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        } else if (i10 == 4) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        } else if (i10 == 8) {
            gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        }
        b(0);
    }

    public static void a(Interpolator interpolator, int i10, int[] iArr) {
        int length = iArr.length - 1;
        int alpha = Color.alpha(i10);
        for (int i11 = length; i11 >= 0; i11--) {
            iArr[i11] = i0.a.k(i10, (int) (interpolator.getInterpolation((length - i11) / length) * alpha));
        }
    }

    public final void b(int i10) {
        if (this.g == i10) {
            return;
        }
        this.g = i10;
        Interpolator interpolator = this.a;
        int[] iArr = this.f;
        a(interpolator, i10, iArr);
        this.b.setColors(iArr);
        this.c.setColor(j6.l1(this.h / 255.0f, this.g));
    }

    public final void c(int i10, int i11) {
        Rect rect = this.d;
        if (rect.left == 0 && rect.top == i10 && rect.right == 0 && rect.bottom == i11) {
            return;
        }
        rect.set(0, i10, 0, i11);
        onBoundsChange(getBounds());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        GradientDrawable gradientDrawable;
        int i10;
        int i11;
        int i12;
        int i13;
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            Paint paint = this.c;
            Rect rect = this.d;
            int i14 = this.e;
            if (i14 == 1 && (i13 = rect.left) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, bounds.top, Math.min(bounds.right, r2 + i13), bounds.bottom, paint);
            } else if (i14 == 2 && (i12 = rect.top) > 0) {
                float f7 = bounds.left;
                int i15 = bounds.top;
                float f10 = i15;
                float f11 = bounds.right;
                float min = Math.min(bounds.bottom, i15 + i12);
                canvas2 = canvas;
                canvas2.drawRect(f7, f10, f11, min, paint);
            } else if (i14 == 4 && (i11 = rect.right) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(Math.max(bounds.left, bounds.right - i11), bounds.top, bounds.right, bounds.bottom, paint);
            } else if (i14 == 8 && (i10 = rect.bottom) > 0) {
                canvas2 = canvas;
                canvas2.drawRect(bounds.left, Math.max(bounds.top, bounds.bottom - i10), bounds.right, bounds.bottom, paint);
            }
            gradientDrawable = this.b;
            if (gradientDrawable.getBounds().isEmpty()) {
                gradientDrawable.draw(canvas2);
                return;
            }
            return;
        }
        canvas2 = canvas;
        gradientDrawable = this.b;
        if (gradientDrawable.getBounds().isEmpty()) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i10 = rect.left;
        Rect rect2 = this.d;
        this.b.setBounds(i10 + rect2.left, rect.top + rect2.top, rect.right - rect2.right, rect.bottom - rect2.bottom);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.h = i10;
        this.b.setAlpha(i10);
        this.c.setColor(j6.l1(this.h / 255.0f, this.g));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.c.setColorFilter(colorFilter);
    }
}
