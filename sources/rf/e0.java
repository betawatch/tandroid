package rf;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;
import bi.d2;
import org.telegram.ui.in0;
import org.telegram.ui.s3;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class e0 {
    public static final d2 a = new d2(22);
    public static final d2 b = new d2(23);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, in0 in0Var, s3 s3Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = in0Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !in0Var.getClipToOutline() || outlineProvider == null) {
            s3Var.a(canvas);
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (c == null) {
                c = new Path();
                d = new Outline();
                e = new Rect();
            }
            path = c;
            outline = d;
            rect = e;
            outline.setEmpty();
            rect.setEmpty();
        } else {
            path = new Path();
            outline = new Outline();
            rect = new Rect();
        }
        Path path2 = path;
        outlineProvider.getOutline(in0Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            s3Var.a(canvas);
            return;
        }
        float radius = outline.getRadius();
        if (radius > 0.0f) {
            path2.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
        } else {
            path2.addRect(rect.left, rect.top, rect.right, rect.bottom, Path.Direction.CW);
        }
        int save = canvas.save();
        canvas.clipPath(path2);
        s3Var.a(canvas);
        canvas.restoreToCount(save);
    }
}
