package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class x6 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new x6());
    }

    @Override // org.telegram.ui.Components.k61
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.s6 s6Var = y6Var.a;
        ImageView imageView = y6Var.b;
        int i10 = y6Var.c;
        int i11 = l61Var.d;
        boolean z11 = i10 == i11;
        y6Var.c = i11;
        s6Var.c(l61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, l61Var.q ? org.telegram.ui.ActionBar.g6.o6 : org.telegram.ui.ActionBar.g6.G6, false);
        s6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(l61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(es.h);
        } else {
            imageView.setRotation(l61Var.f ? 0.0f : 180.0f);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y6(context);
    }
}
