package qh;

import android.content.res.Resources;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class u {
    public static float a = -1.0f;

    public static Canvas a(int i10, int i11, Object obj) {
        RenderNode b10 = m4.v0.b(obj);
        b10.setPosition(0, 0, i10, i11);
        return b10.beginRecording();
    }

    public static void b(Canvas canvas, Path path) {
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutPath(path);
        } else {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        }
    }

    public static void c(Canvas canvas, Object obj) {
        canvas.drawRenderNode(m4.v0.b(obj));
    }

    public static void d(Object obj) {
        m4.v0.b(obj).endRecording();
    }

    public static boolean e(Object obj) {
        return obj != null && m4.v0.b(obj).hasDisplayList();
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static float g(View view) {
        float f7;
        int identifier;
        float f10;
        if (Build.VERSION.SDK_INT >= 31) {
            WindowInsets rootWindowInsets = view != null ? view.getRootWindowInsets() : null;
            if (rootWindowInsets == null) {
                f10 = -1.0f;
            } else {
                f10 = rootWindowInsets.getRoundedCorner(0) != null ? r5.getRadius() : 0.0f;
            }
            if (f10 >= 0.0f) {
                return f10;
            }
        }
        if (a < 0.0f) {
            try {
                Resources system = Resources.getSystem();
                f7 = system.getIdentifier("rounded_corner_radius_top", "dimen", "android") != 0 ? system.getDimensionPixelSize(r3) : 0.0f;
                if (f7 <= 0.0f && (identifier = system.getIdentifier("rounded_corner_radius", "dimen", "android")) != 0) {
                    f7 = system.getDimensionPixelSize(identifier);
                }
            } catch (Exception unused) {
                f7 = 0.0f;
            }
            a = Math.max(0.0f, f7);
        }
        return a;
    }

    public static void h(Object obj, float f7) {
        m4.v0.b(obj).setAlpha(f7);
    }

    public static void i(int i10, Paint paint) {
        BlendMode blendMode;
        switch (i10) {
            case 1:
                blendMode = BlendMode.PLUS;
                break;
            case 2:
                blendMode = BlendMode.SCREEN;
                break;
            case 3:
                blendMode = BlendMode.COLOR_DODGE;
                break;
            case 4:
                blendMode = BlendMode.OVERLAY;
                break;
            case 5:
                blendMode = BlendMode.SOFT_LIGHT;
                break;
            case 6:
                blendMode = BlendMode.COLOR_BURN;
                break;
            default:
                blendMode = null;
                break;
        }
        paint.setBlendMode(blendMode);
    }

    public static void j(Object obj, float f7) {
        ((RenderNode) obj).setRenderEffect(f7 > 0.0f ? RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP) : null);
    }

    public static void k(Object obj, float f7, float[] fArr) {
        m4.v0.b(obj).setRenderEffect(RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(fArr), RenderEffect.createBlurEffect(f7, f7, Shader.TileMode.CLAMP)));
    }

    public static ColorFilter l(int i10) {
        BlendMode blendMode;
        blendMode = BlendMode.SRC_IN;
        return new BlendModeColorFilter(i10, blendMode);
    }
}
