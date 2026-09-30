package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class e7 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new e7());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.a;
        ImageView imageView = f7Var.b;
        int i10 = f7Var.c;
        int i11 = x51Var.d;
        boolean z11 = i10 == i11;
        f7Var.c = i11;
        p6Var.c(x51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, x51Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(x51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(sr.h);
        } else {
            imageView.setRotation(x51Var.f ? 0.0f : 180.0f);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
