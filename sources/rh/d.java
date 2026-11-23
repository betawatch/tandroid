package rh;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import c8.ed;
import com.google.android.gms.common.api.q;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import jh.k;
import org.telegram.messenger.beta.R;
import r0.i0;
import r0.l1;
import r0.p0;
import r0.q0;
import r0.t0;
import r0.v0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d extends q {
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

    public static l1 e1(l1 l1Var, View view, View view2) {
        if (view == null || view2 == null || l1Var == null) {
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
            return l1Var;
        }
        return l1Var.a.m(Math.max(0, i7), Math.max(0, i10), Math.max(0, width), Math.max(0, height));
    }

    @Override // com.google.android.gms.common.api.q
    public final void V0() {
        int i7 = this.c - 1;
        this.c = i7;
        if (i7 == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((c) it.next()).Q();
            }
        }
    }

    @Override // com.google.android.gms.common.api.q
    public final l1 W0(l1 l1Var, List list) {
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            i7 |= ((v0) it.next()).a.c();
        }
        if (ed.a(i7, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                c cVar = (c) it2.next();
                l1 e12 = e1(l1Var, cVar.S(), this.b);
                if (e12 != null) {
                    cVar.m(e12);
                }
            }
        }
        return l1Var;
    }
}
