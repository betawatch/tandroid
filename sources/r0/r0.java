package r0;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class r0 extends v0 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final u1.a f = new u1.a(u1.a.c);
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void e(View view, w0 w0Var) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.L();
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                e(viewGroup.getChildAt(i11), w0Var);
            }
        }
    }

    public static void f(View view, m1 m1Var, boolean z10) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.a = m1Var;
            if (!z10) {
                z10 = true;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                f(viewGroup.getChildAt(i11), m1Var, z10);
            }
        }
    }

    public static void g(View view, m1 m1Var, List list) {
        ab.e i10 = i(view);
        if (i10 != null) {
            i10.M(m1Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                g(viewGroup.getChildAt(i11), m1Var, list);
            }
        }
    }

    public static void h(View view, w0 w0Var, oc.i iVar) {
        ab.e i10 = i(view);
        if (i10 != null) {
            ah.e eVar = (ah.e) i10;
            if (eVar.c == 0) {
                Iterator it = eVar.d.iterator();
                while (it.hasNext()) {
                    ((ah.d) it.next()).t();
                }
            }
            eVar.c++;
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), w0Var, iVar);
            }
        }
    }

    public static ab.e i(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof q0) {
            return ((q0) tag).a;
        }
        return null;
    }
}
