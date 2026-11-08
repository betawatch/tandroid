package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class q0 extends u0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final x1.a f = new x1.a(x1.a.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, v0 v0Var) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.V0();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10), v0Var);
            }
        }
    }

    public static void f(View view, k1 k1Var, boolean z9) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.a = k1Var;
            if (!z9) {
                z9 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), k1Var, z9);
            }
        }
    }

    public static void g(View view, k1 k1Var, List list) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            i7.W0(k1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), k1Var, list);
            }
        }
    }

    public static void h(View view, v0 v0Var, j2.n nVar) {
        bi.b1 i7 = i(view);
        if (i7 != null) {
            rh.d dVar = (rh.d) i7;
            if (dVar.c == 0) {
                Iterator it = dVar.d.iterator();
                while (it.hasNext()) {
                    ((rh.c) it.next()).w();
                }
            }
            dVar.c++;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), v0Var, nVar);
            }
        }
    }

    public static bi.b1 i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof p0) {
            return ((p0) tag).a;
        }
        return null;
    }
}
