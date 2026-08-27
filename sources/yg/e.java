package yg;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import h7.a8;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import qg.j;
import r0.j0;
import r0.m1;
import r0.q0;
import r0.r0;
import r0.u0;
import r0.w0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e extends b8.a {
    public static final RectF e;
    public static final Rect f;
    public final ViewGroup b;
    public int c;
    public final yd.b d = new yd.b(true);

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
        if (!j.c(view, view2, rectF)) {
            return null;
        }
        Rect rect = f;
        rectF.round(rect);
        int i10 = rect.left;
        int i11 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
            return m1Var;
        }
        return m1Var.a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
    }

    @Override // b8.a
    public final void L() {
        int i10 = this.c - 1;
        this.c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).L();
            }
        }
    }

    @Override // b8.a
    public final m1 M(m1 m1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((w0) it.next()).a.c();
        }
        if (a8.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                m1 Q = Q(m1Var, dVar.N(), this.b);
                if (Q != null) {
                    dVar.k(Q);
                }
            }
        }
        return m1Var;
    }
}
