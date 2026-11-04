package sh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import ci.u0;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kh.k;
import org.telegram.messenger.beta.R;
import r0.i0;
import r0.k1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;
import x7.u;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d extends u0 {
    public static final RectF e;
    public static final Rect f;
    public final ViewGroup b;
    public int c;
    public final ue.b d = new ue.b();

    static {
        new PointF();
        e = new RectF();
        f = new Rect();
    }

    public d(FrameLayout frameLayout) {
        this.b = frameLayout;
        WeakHashMap weakHashMap = i0.a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.e;
        View.OnApplyWindowInsetsListener p0Var = new p0(frameLayout, this);
        frameLayout.setTag(R.id.tag_window_insets_animation_callback, p0Var);
        if (frameLayout.getTag(R.id.tag_compat_insets_dispatch) == null && frameLayout.getTag(R.id.tag_on_apply_window_listener) == null) {
            frameLayout.setOnApplyWindowInsetsListener(p0Var);
        }
    }

    public static k1 e1(k1 k1Var, View view, View view2) {
        if (view == null || view2 == null || k1Var == null) {
            return null;
        }
        RectF rectF = e;
        if (!k.c(view, view2, rectF)) {
            return null;
        }
        Rect rect = f;
        rectF.round(rect);
        int i3 = rect.left;
        int i10 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i3 == 0 && i10 == 0 && width == 0 && height == 0) {
            return k1Var;
        }
        return k1Var.a.m(Math.max(0, i3), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
    }

    @Override // ci.u0
    public final void V0() {
        int i3 = this.c - 1;
        this.c = i3;
        if (i3 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).P();
            }
        }
    }

    @Override // ci.u0
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 |= ((v0) it.next()).a.c();
        }
        if (u.a(i3, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                k1 e12 = e1(k1Var, cVar.R(), this.b);
                if (e12 != null) {
                    cVar.m(e12);
                }
            }
        }
        return k1Var;
    }
}
