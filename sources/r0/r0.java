package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Cells.e3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class r0 extends v0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f = new u1.a(u1.a.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.L();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.a = m1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), m1Var, z10);
            }
        }
    }

    public static void g(View view, m1 m1Var, List list) {
        a8.a i9 = i(view);
        if (i9 != null) {
            i9.M(m1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, e3 e3Var) {
        a8.a i9 = i(view);
        if (i9 != null) {
            xg.e eVar = (xg.e) i9;
            if (eVar.c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((xg.d) it.next()).t();
                }
            }
            eVar.c++;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), w0Var, e3Var);
            }
        }
    }

    public static a8.a i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof q0) {
            return ((q0) tag).a;
        }
        return null;
    }
}
