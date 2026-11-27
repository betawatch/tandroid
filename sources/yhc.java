// default package

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class yhc {
    public static final yi a = new yi(20);
    public static final yi b = new yi(21);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, u38 u38Var, ii7 ii7Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = u38Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !u38Var.getClipToOutline() || outlineProvider == null) {
            ii7Var.a(canvas);
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
        outlineProvider.getOutline(u38Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            ii7Var.a(canvas);
            return;
        }
        float radius = outline.getRadius();
        float f = rect.left;
        float f2 = rect.top;
        if (radius > 0.0f) {
            path2.addRoundRect(f, f2, rect.right, rect.bottom, radius, radius, Path.Direction.CW);
        } else {
            path2.addRect(f, f2, rect.right, rect.bottom, Path.Direction.CW);
        }
        int save = canvas.save();
        canvas.clipPath(path2);
        ii7Var.a(canvas);
        canvas.restoreToCount(save);
    }
}
