package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class a0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static l1 b(View view, l1 l1Var, Rect rect) {
        WindowInsets g10 = l1Var.g();
        if (g10 != null) {
            return l1.h(view, view.computeSystemWindowInsets(g10, rect));
        }
        rect.setEmpty();
        return l1Var;
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

    public static l1 f(View view) {
        if (w0.d && view.isAttachedToWindow()) {
            try {
                Object obj = w0.a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) w0.b.get(obj);
                    Rect rect2 = (Rect) w0.c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i10 = Build.VERSION.SDK_INT;
                        b1 a1Var = i10 >= 34 ? new a1() : i10 >= 30 ? new z0() : i10 >= 29 ? new y0() : new x0();
                        a1Var.e(i0.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        a1Var.g(i0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        l1 b10 = a1Var.b();
                        b10.a.r(b10);
                        b10.a.d(view.getRootView());
                        return b10;
                    }
                }
            } catch (IllegalAccessException e7) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e7.getMessage(), e7);
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

    public static void i(View view, float f7) {
        view.setElevation(f7);
    }

    public static void j(View view, n nVar) {
        z zVar = nVar != null ? new z(view, nVar) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, zVar);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (zVar != null) {
            view.setOnApplyWindowInsetsListener(zVar);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    public static void k(View view) {
        view.stopNestedScroll();
    }
}
