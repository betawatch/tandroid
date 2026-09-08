package yf;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public abstract class p {
    public static final Rect a = new Rect();

    static {
        new Rect();
        new RectF();
    }

    public static void a(Canvas canvas, Drawable drawable, float f7, float f10, float f11) {
        float dpf2 = f7 - AndroidUtilities.dpf2(36.0f);
        float dpf22 = f10 - AndroidUtilities.dpf2(36.0f);
        float dpf23 = f11 / AndroidUtilities.dpf2(72.0f);
        d(drawable, AndroidUtilities.dpf2(9.66f) + dpf2, AndroidUtilities.dpf2(4.66f) + dpf22, 53);
        canvas.save();
        canvas.scale(dpf23, dpf23, f7, f10);
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void b(Canvas canvas, Drawable drawable, float f7) {
        if (drawable == null || f7 == 0.0f) {
            return;
        }
        if (f7 == 1.0f) {
            drawable.draw(canvas);
            return;
        }
        canvas.save();
        canvas.scale(f7, f7, drawable.getBounds().exactCenterX(), drawable.getBounds().exactCenterY());
        drawable.draw(canvas);
        canvas.restore();
    }

    public static void c(Rect rect, float f7, float f10, int i10, int i11, int i12) {
        int i13 = i12 & 7;
        int round = i13 != 3 ? i13 != 5 ? Math.round(f7 - (i10 / 2.0f)) : Math.round(f7 - i10) : Math.round(f7);
        int i14 = i12 & 112;
        int round2 = i14 != 48 ? i14 != 80 ? Math.round(f10 - (i11 / 2.0f)) : Math.round(f10 - i11) : Math.round(f10);
        rect.set(round, round2, i10 + round, i11 + round2);
    }

    public static void d(Drawable drawable, float f7, float f10, int i10) {
        if (drawable == null) {
            return;
        }
        e(drawable, f7, f10, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), i10);
    }

    public static void e(Drawable drawable, float f7, float f10, int i10, int i11, int i12) {
        if (drawable != null) {
            Rect rect = a;
            c(rect, f7, f10, i10, i11, i12);
            drawable.setBounds(rect);
        }
    }

    public static void f(ImageReceiver imageReceiver, float f7, float f10, int i10, int i11) {
        if (imageReceiver != null) {
            Rect rect = a;
            c(rect, f7, f10, i10, i11, 17);
            imageReceiver.setImageCoords(rect);
        }
    }

    public static void g(Drawable drawable, int i10, int i11, int i12, int i13) {
        Rect rect = a;
        if (drawable.getPadding(rect)) {
            drawable.setBounds(i10 - rect.left, i11 - rect.top, i12 + rect.right, i13 + rect.bottom);
        } else {
            drawable.setBounds(i10, i11, i12, i13);
        }
    }

    public static void h(NinePatchDrawable ninePatchDrawable, Rect rect) {
        Rect rect2 = a;
        if (ninePatchDrawable.getPadding(rect2)) {
            ninePatchDrawable.setBounds(rect.left - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        } else {
            ninePatchDrawable.setBounds(rect);
        }
    }
}
