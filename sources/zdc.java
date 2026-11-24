// default package

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.ViewOutlineProvider;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class zdc {
    public static final xi a = new xi(21);
    public static final xi b = new xi(22);
    public static Path c;
    public static Outline d;
    public static Rect e;

    public static void a(Canvas canvas, o08 o08Var, zf7 zf7Var) {
        Path path;
        Outline outline;
        Rect rect;
        ViewOutlineProvider outlineProvider = o08Var.getOutlineProvider();
        if (canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 24 || !o08Var.getClipToOutline() || outlineProvider == null) {
            zf7Var.a(canvas);
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
        outlineProvider.getOutline(o08Var, outline);
        path2.rewind();
        if (outline.isEmpty() || !outline.getRect(rect)) {
            zf7Var.a(canvas);
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
        zf7Var.a(canvas);
        canvas.restoreToCount(save);
    }
}
