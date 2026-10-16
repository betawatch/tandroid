package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class x6 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new x6());
    }

    @Override // org.telegram.ui.Components.l61
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.s6 s6Var = y6Var.a;
        ImageView imageView = y6Var.b;
        int i10 = y6Var.c;
        int i11 = m61Var.d;
        boolean z11 = i10 == i11;
        y6Var.c = i11;
        s6Var.c(m61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, m61Var.q ? org.telegram.ui.ActionBar.g6.o6 : org.telegram.ui.ActionBar.g6.G6, false);
        s6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(m61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(es.h);
        } else {
            imageView.setRotation(m61Var.f ? 0.0f : 180.0f);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y6(context);
    }
}
