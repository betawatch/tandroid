package qg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import ng.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
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

    @Override // qg.a
    public final void E0(Canvas canvas, float f9, float f10, float f11, float f12) {
        Bitmap bitmap = this.d;
        if (bitmap == null || bitmap.isRecycled() || this.c == null) {
            return;
        }
        Matrix matrix = this.e;
        Matrix matrix2 = this.b;
        matrix.set(matrix2);
        matrix.postTranslate(f9, f10);
        this.c.setLocalMatrix(matrix2);
        canvas.drawRect(f9, f10, f11, f12, this.a);
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

    public final void b(int i10, int i11) {
        if (this.h == i10 && this.n == i11) {
            return;
        }
        this.h = i10;
        this.n = i11;
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
        int i10 = this.h;
        int i11 = this.n;
        matrix.reset();
        if (width <= 0 || height <= 0 || i10 <= 0 || i11 <= 0) {
            return;
        }
        float f9 = i10;
        float f10 = width;
        float f11 = i11;
        float f12 = height;
        float max = Math.max(f9 / f10, f11 / f12);
        matrix.setScale(max, max);
        matrix.postTranslate((f9 - (f10 * max)) * 0.5f, ((f11 - (f12 * max)) * 0.5f) + 0);
    }

    @Override // qg.a
    public final ng.d v() {
        return new f(this);
    }

    @Override // qg.a
    public final /* synthetic */ void q() {
    }
}
