package vg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import java.lang.ref.WeakReference;
import org.telegram.ui.ActionBar.t6;
import w7.k8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a extends k8 {
    public final Paint a;
    public final Paint b;
    public final Matrix c;
    public WeakReference d;
    public BitmapShader e;
    public final /* synthetic */ f f;

    public a(f fVar) {
        this.f = fVar;
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        this.c = new Matrix();
        this.d = new WeakReference(null);
        paint.setFilterBitmap(true);
    }

    @Override // w7.k8
    public final void b(Canvas canvas, hi.a aVar) {
        hi.b bVar = (hi.b) f.u(aVar);
        f fVar = this.f;
        int i10 = fVar.c;
        Bitmap bitmap = bVar.d;
        Object obj = this.d.get();
        Paint paint = this.a;
        if (bitmap != obj) {
            this.d = new WeakReference(bitmap);
            if (bitmap == null || bitmap.isRecycled()) {
                this.e = null;
                paint.setShader(null);
            } else {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                this.e = bitmapShader;
                paint.setShader(bitmapShader);
            }
        }
        if (Color.alpha(fVar.r) > 0) {
            fVar.Y.c(canvas, 0);
        }
        if (this.e != null && bitmap != null && !bitmap.isRecycled() && i10 > 0) {
            Matrix matrix = bVar.b;
            Matrix matrix2 = this.c;
            matrix2.set(matrix);
            matrix2.postTranslate(-fVar.d, -fVar.e);
            this.e.setLocalMatrix(matrix2);
            paint.setAlpha(i10);
            fVar.M.b(canvas, paint);
        }
        int r12 = t6.r1(i10 / 255.0f, fVar.s);
        if (Color.alpha(r12) > 0) {
            Paint paint2 = this.b;
            paint2.setColor(r12);
            fVar.M.b(canvas, paint2);
        }
    }
}
