// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class uk0 {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(yi5 yi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup) {
        b(yi5Var, canvas, rectF, view, viewGroup, jn7.d4);
    }

    public static void b(yi5 yi5Var, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i) {
        if (i <= 0 || yi5Var == null) {
            return;
        }
        RectF rectF2 = c;
        if (yic.c(view, viewGroup, rectF2)) {
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
            yi5Var.g(canvas, rectF3);
            if (z2) {
                canvas.restore();
            }
            if (z) {
                canvas.restore();
            }
        }
    }

    public static void c(nz4 nz4Var, View view) {
        Bitmap bitmap;
        if (nz4Var == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = nz4Var.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        nz4Var.b.set(matrix);
    }

    public static tk0 d(jl0 jl0Var, int i, int i2) {
        return new tk0(i, i2, jl0Var);
    }
}
