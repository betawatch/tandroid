// default package

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vl0 extends Drawable {
    public float a = 1.0f;
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Path d = new Path();
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Drawable g;
    public final /* synthetic */ float h;
    public final /* synthetic */ wl0 i;

    public vl0(wl0 wl0Var, float f, float f2, Drawable drawable, float f3) {
        this.i = wl0Var;
        this.e = f;
        this.f = f2;
        this.g = drawable;
        this.h = f3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap b;
        wl0 wl0Var = this.i;
        sl0 sl0Var = wl0Var.a;
        Matrix matrix = wl0Var.p;
        Paint paint = null;
        if (sl0Var != null && (b = sl0Var.b()) != null) {
            if (wl0Var.o == null || wl0Var.n != b) {
                wl0Var.n = b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(b, tileMode, tileMode);
                wl0Var.o = bitmapShader;
                wl0Var.h.setShader(bitmapShader);
            }
            matrix.reset();
            matrix.postTranslate((-0.0f) - this.e, (-0.0f) - this.f);
            if (sl0Var.b != null) {
                matrix.preScale(r3.getWidth() / b.getWidth(), sl0Var.b.getHeight() / b.getHeight());
            }
            wl0Var.o.setLocalMatrix(matrix);
            wl0Var.h.setAlpha((int) (this.a * 255.0f));
            paint = wl0Var.h;
        }
        Paint paint2 = paint;
        Rect bounds = getBounds();
        Drawable drawable = this.g;
        Paint paint3 = this.b;
        float f = this.h;
        if (paint2 == null && (sl0Var == null || !sl0Var.c())) {
            if (drawable != null) {
                drawable.setBounds(bounds);
                drawable.draw(canvas);
                return;
            }
            paint3.setColor(-14145495);
            if (f <= 0.0f) {
                canvas.drawRect(bounds, paint3);
                return;
            }
            RectF rectF = gl.P;
            rectF.set(bounds);
            canvas.drawRoundRect(rectF, f, f, paint3);
            return;
        }
        Path path = this.d;
        if (drawable != null) {
            canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, kk7.d4, 31);
            drawable.setBounds(bounds);
            drawable.draw(canvas);
            Rect rect = this.c;
            if (sl0Var == null || !sl0Var.c()) {
                canvas.drawRect(bounds, paint2);
            } else {
                canvas.save();
                getPadding(rect);
                RectF rectF2 = gl.P;
                rectF2.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
                path.rewind();
                path.addRoundRect(rectF2, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                wl0Var.b(canvas, false);
                canvas.restore();
            }
            canvas.restore();
            getPadding(rect);
            RectF rectF3 = gl.P;
            rectF3.set(bounds.left + rect.left, bounds.top + rect.top, bounds.right - rect.right, bounds.bottom - rect.bottom);
            paint3.setColor(1711276032);
            canvas.drawRoundRect(rectF3, f, f, paint3);
            return;
        }
        if (f > 0.0f) {
            RectF rectF4 = gl.P;
            rectF4.set(bounds);
            if (sl0Var == null || !sl0Var.c()) {
                canvas.drawRoundRect(rectF4, f, f, paint2);
            } else {
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF4, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                wl0Var.b(canvas, false);
                canvas.restore();
            }
        } else if (sl0Var == null || !sl0Var.c()) {
            canvas.drawRect(bounds, paint2);
        } else {
            canvas.save();
            canvas.clipRect(bounds);
            wl0Var.b(canvas, false);
            canvas.restore();
        }
        paint3.setColor(1711276032);
        if (f <= 0.0f) {
            canvas.drawRect(bounds, paint3);
            return;
        }
        RectF rectF5 = gl.P;
        rectF5.set(bounds);
        canvas.drawRoundRect(rectF5, f, f, paint3);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        rect.set(0, 0, 0, 0);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.a = i / 255.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
