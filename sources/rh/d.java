package rh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import bi.b1;
import c8.zc;
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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class d extends b1 {
    public static final RectF e;
    public static final Rect f;
    public final ViewGroup b;
    public int c;
    public final xe.b d = new xe.b();

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
        int i7 = rect.left;
        int i10 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i7 == 0 && i10 == 0 && width == 0 && height == 0) {
            return k1Var;
        }
        return k1Var.a.m(Math.max(0, i7), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
    }

    @Override // bi.b1
    public final void V0() {
        int i7 = this.c - 1;
        this.c = i7;
        if (i7 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).P();
            }
        }
    }

    @Override // bi.b1
    public final k1 W0(k1 k1Var, List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= ((v0) it.next()).a.c();
        }
        if (zc.a(i7, 8)) {
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
