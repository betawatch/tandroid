package rh;

import a8.pf;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jh.k;
import org.telegram.messenger.beta.R;
import r0.i0;
import r0.k1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class e extends b2.h {
    public static final RectF e;
    public static final Rect f;
    public final ViewGroup b;
    public int c;
    public final se.b d = new se.b();

    static {
        new PointF();
        e = new RectF();
        f = new Rect();
    }

    public e(ViewGroup viewGroup) {
        this.b = viewGroup;
        WeakHashMap weakHashMap = i0.a;
        if (Build.VERSION.SDK_INT >= 30) {
            t0.g(viewGroup, this);
            return;
        }
        PathInterpolator pathInterpolator = q0.e;
        View.OnApplyWindowInsetsListener p0Var = new p0(viewGroup, this);
        viewGroup.setTag(R.id.tag_window_insets_animation_callback, p0Var);
        if (viewGroup.getTag(R.id.tag_compat_insets_dispatch) == null && viewGroup.getTag(R.id.tag_on_apply_window_listener) == null) {
            viewGroup.setOnApplyWindowInsetsListener(p0Var);
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
        int i10 = rect.left;
        int i11 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i10 == 0 && i11 == 0 && width == 0 && height == 0) {
            return k1Var;
        }
        return k1Var.a.m(Math.max(0, i10), Math.max(0, i11), Math.max(0, width), Math.max(0, height));
    }

    @Override // b2.h
    public final void V0() {
        int i10 = this.c - 1;
        this.c = i10;
        if (i10 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((d) it.next()).M();
            }
        }
    }

    @Override // b2.h
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 |= ((v0) it.next()).a.c();
        }
        if (pf.a(i10, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                d dVar = (d) it2.next();
                k1 e12 = e1(k1Var, dVar.O(), this.b);
                if (e12 != null) {
                    dVar.k(e12);
                }
            }
        }
        return k1Var;
    }
}
