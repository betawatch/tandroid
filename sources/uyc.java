// default package

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uyc {
    public static final RectF e = new RectF();
    public static final Rect f = new Rect();
    public wzc a;
    public final FrameLayout b;
    public int c;
    public final g79 d = new g79(0, false);

    public uyc(FrameLayout frameLayout) {
        this.b = frameLayout;
        WeakHashMap weakHashMap = kfc.a;
        if (Build.VERSION.SDK_INT >= 30) {
            fzc.g(frameLayout, this);
            return;
        }
        PathInterpolator pathInterpolator = dzc.e;
        View.OnApplyWindowInsetsListener czcVar = new czc(frameLayout, this);
        frameLayout.setTag(R.id.tag_window_insets_animation_callback, czcVar);
        if (frameLayout.getTag(R.id.tag_compat_insets_dispatch) == null && frameLayout.getTag(R.id.tag_on_apply_window_listener) == null) {
            frameLayout.setOnApplyWindowInsetsListener(czcVar);
        }
    }

    public static wzc a(wzc wzcVar, View view, View view2) {
        if (view == null || view2 == null || wzcVar == null) {
            return null;
        }
        RectF rectF = e;
        if (!zgc.c(view, view2, rectF)) {
            return null;
        }
        Rect rect = f;
        rectF.round(rect);
        int i = rect.left;
        int i2 = rect.top;
        int width = view2.getWidth() - rect.right;
        int height = view2.getHeight() - rect.bottom;
        if (i == 0 && i2 == 0 && width == 0 && height == 0) {
            return wzcVar;
        }
        return wzcVar.a.m(Math.max(0, i), Math.max(0, i2), Math.max(0, width), Math.max(0, height));
    }

    public final void b() {
        int i = this.c - 1;
        this.c = i;
        if (i == 0) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((tyc) it.next()).P();
            }
        }
    }

    public final void c(wzc wzcVar, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((hzc) it.next()).a.c();
        }
        if (iqd.a(i, 8)) {
            Iterator it2 = this.d.iterator();
            while (it2.hasNext()) {
                tyc tycVar = (tyc) it2.next();
                wzc a = a(wzcVar, tycVar.R(), this.b);
                if (a != null) {
                    tycVar.o(a);
                }
            }
        }
    }
}
