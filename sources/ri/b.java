package ri;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class b implements a {
    public final Paint a;
    public final Matrix b;
    public BitmapShader c;
    public Bitmap d;
    public final Matrix e;
    public Bitmap f;
    public int h;
    public int n;

    public b() {
        Paint paint = new Paint(3);
        this.a = paint;
        this.b = new Matrix();
        this.e = new Matrix();
        paint.setFilterBitmap(true);
    }

    public final void a(Bitmap bitmap) {
        if (this.d == bitmap) {
            return;
        }
        this.d = bitmap;
        Paint paint = this.a;
        paint.setShader(null);
        this.c = null;
        if (bitmap != null) {
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.c = bitmapShader;
            paint.setShader(bitmapShader);
            c();
        }
    }

    public final void b(int i7, int i10) {
        if (this.h == i7 && this.n == i10) {
            return;
        }
        this.h = i7;
        this.n = i10;
        c();
    }

    public final void c() {
        Bitmap bitmap = this.d;
        Matrix matrix = this.b;
        if (bitmap == null) {
            matrix.reset();
            return;
        }
        int width = bitmap.getWidth();
        int height = this.d.getHeight();
        int i7 = this.h;
        int i10 = this.n;
        matrix.reset();
        if (width <= 0 || height <= 0 || i7 <= 0 || i10 <= 0) {
            return;
        }
        float f10 = i7;
        float f11 = width;
        float f12 = i10;
        float f13 = height;
        float max = Math.max(f10 / f11, f12 / f13);
        matrix.setScale(max, max);
        matrix.postTranslate((f10 - (f11 * max)) * 0.5f, ((f12 - (f13 * max)) * 0.5f) + 0);
    }

    @Override // ri.a
    public final void e(Canvas canvas, float f10, float f11, float f12, float f13) {
        Bitmap bitmap = this.d;
        if (bitmap == null || bitmap.isRecycled() || this.c == null) {
            return;
        }
        Matrix matrix = this.e;
        Matrix matrix2 = this.b;
        matrix.set(matrix2);
        matrix.postTranslate(f10, f11);
        this.c.setLocalMatrix(matrix2);
        canvas.drawRect(f10, f11, f12, f13, this.a);
    }
}
