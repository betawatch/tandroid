package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.s5;
import sg.i;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(mg.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        if (i10 <= 0) {
            return;
        }
        RectF rectF2 = c;
        if (i.c(view, viewGroup, rectF2)) {
            float f9 = rectF2.left;
            float f10 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f9, -f10);
            boolean z10 = (f9 == 0.0f && f10 == 0.0f) ? false : true;
            boolean z11 = i10 != 255;
            if (z10) {
                canvas.save();
                canvas.translate(f9, f10);
            }
            if (z11) {
                canvas.saveLayerAlpha(rectF3, i10);
            }
            aVar.e(canvas, rectF3);
            if (z11) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    public static void b(mg.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(qg.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static s5 d(ng.d dVar, int i10, int i11) {
        return new s5(i10, i11, dVar);
    }
}
