package xg;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import g7.z7;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import r0.j0;
import r0.m1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e extends a8.a {
    public static final RectF e;
    public static final Rect f;
    public final ViewGroup b;
    public int c;
    public final xd.b d = new xd.b(true);

    static {
        new PointF();
        e = new RectF();
        f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.b = viewGroup;
        WeakHashMap weakHashMap = j0.a;
        if (Build.VERSION.SDK_INT >= 30) {
            u0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = r0.e;
        View.OnApplyWindowInsetsListener q0Var = new q0(viewGroup, this);
        viewGroup.setTag(R.id.tag_window_insets_animation_callback, q0Var);
        if (viewGroup.getTag(R.id.tag_compat_insets_dispatch) == null && viewGroup.getTag(R.id.tag_on_apply_window_listener) == null) {
            viewGroup.setOnApplyWindowInsetsListener(q0Var);
        }
    }

    public static m1 Q(m1 m1Var, View view, View view2) {
        if (view == null || view2 == null || m1Var == null) {
            return null;
        }
        RectF rectF = e;
        if (!pg.i.c(view, view2, rectF)) {
            return null;
        }
        Rect rect = f;
        rectF.round(rect);
        int i9 = rect.left;
        int i10 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i9 == 0 && i10 == 0 && width == 0 && height == 0) {
            return m1Var;
        }
        return m1Var.a.m(Math.max(0, i9), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
    }

    @Override // a8.a
    public final void L() {
        int i9 = this.c - 1;
        this.c = i9;
        if (i9 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).K();
            }
        }
    }

    @Override // a8.a
    public final m1 M(m1 m1Var, List list) {
        Iterator it = list.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            i9 |= ((w0) it.next()).a.c();
        }
        if (z7.a(i9, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                m1 Q = Q(m1Var, dVar.M(), this.b);
                if (Q != null) {
                    dVar.k(Q);
                }
            }
        }
        return m1Var;
    }
}
