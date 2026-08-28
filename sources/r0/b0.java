package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class b0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static m1 b(View view, m1 m1Var, Rect rect) {
        WindowInsets g10 = m1Var.g();
        if (g10 != null) {
            return m1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return m1Var;
    }

    public static ColorStateList c(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode d(View view) {
        return view.getBackgroundTintMode();
    }

    public static float e(View view) {
        return view.getElevation();
    }

    public static m1 f(View view) {
        if (x0.d && view.isAttachedToWindow()) {
            try {
                Object obj = x0.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) x0.b.get(obj);
                    Rect rect2 = (Rect) x0.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i9 = Build.VERSION.SDK_INT;
                        c1 b1Var = i9 >= 34 ? new b1() : i9 >= 30 ? new a1() : i9 >= 29 ? new z0() : new y0();
                        b1Var.e(i0.b.b(rect.left, rect.top, rect.right, rect.bottom));
                        b1Var.g(i0.b.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        m1 b10 = b1Var.b();
                        b10.a.r(b10);
                        b10.a.d(view.getRootView());
                        return b10;
                    }
                }
            } catch (IllegalAccessException e10) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e10.getMessage(), e10);
            }
        }
        return null;
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void i(View view, float f10) {
        view.setElevation(f10);
    }

    public static void j(View view, o oVar) {
        a0 a0Var = oVar != null ? new a0(view, oVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, a0Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (a0Var != null) {
            view.setOnApplyWindowInsetsListener(a0Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void k(View view) {
        view.stopNestedScroll();
    }
}
