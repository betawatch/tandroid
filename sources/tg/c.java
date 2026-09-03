package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.v5;
import ug.i;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class c {
    public static final Matrix a = new Matrix();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();

    public static void a(og.a aVar, Canvas canvas, RectF rectF, View view, ViewGroup viewGroup, int i10) {
        if (i10 <= 0) {
            return;
        }
        RectF rectF2 = c;
        if (i.c(view, viewGroup, rectF2)) {
            float f10 = rectF2.left;
            float f11 = rectF2.top;
            RectF rectF3 = b;
            rectF3.set(rectF);
            rectF3.offset(-f10, -f11);
            boolean z4 = (f10 == 0.0f && f11 == 0.0f) ? false : true;
            boolean z10 = i10 != 255;
            if (z4) {
                canvas.save();
                canvas.translate(f10, f11);
            }
            if (z10) {
                canvas.saveLayerAlpha(rectF3, i10);
            }
            aVar.e(canvas, rectF3);
            if (z10) {
                canvas.restore();
            }
            if (z4) {
                canvas.restore();
            }
        }
    }

    public static void b(og.a aVar, Canvas canvas, RectF rectF, View view, FrameLayout frameLayout) {
        a(aVar, canvas, rectF, view, frameLayout, 255);
    }

    public static void c(sg.b bVar, View view) {
        Bitmap bitmap;
        if (bVar == null || view == null || view.getWidth() == 0 || view.getHeight() == 0 || (bitmap = bVar.d) == null || bitmap.isRecycled() || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        Matrix matrix = a;
        matrix.reset();
        matrix.setScale(view.getWidth() / bitmap.getWidth(), view.getHeight() / bitmap.getHeight());
        bVar.b.set(matrix);
    }

    public static v5 d(pg.b bVar, int i10, int i11) {
        return new v5(i10, i11, bVar);
    }
}
