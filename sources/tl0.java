// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class tl0 {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(vi5 vi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(vi5Var, canvas, rectF, view, viewGroup, nm7.d4);
    }

    public static void b(vi5 vi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i) {
        if (i <= 0 || vi5Var == null) {
            return;
        }
        RectF rectF2 = c;
        if (zgc.c(view, viewGroup, rectF2)) {
            float f = rectF2.left;
            float f2 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f, -f2);
            boolean z = (f == 0.0f && f2 == 0.0f) ? false : true;
            boolean z2 = i != 255;
            if (z) {
                canvas.save();
                canvas.translate(f, f2);
            }
            if (z2) {
                canvas.saveLayerAlpha(rectF3, i);
            }
            vi5Var.g(canvas, rectF3);
            if (z2) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public static void c(jz4 jz4Var, View view) {
        Bitmap bitmap;
        if (jz4Var == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = jz4Var.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        jz4Var.b.set(matrix);
    }

    public static sl0 d(im0 im0Var, int i, int i2) {
        return new sl0(i, i2, im0Var);
    }
}
