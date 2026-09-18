package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class g7 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new g7());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        h7 h7Var = (h7) view;
        org.telegram.ui.Components.n6 n6Var = h7Var.a;
        ImageView imageView = h7Var.b;
        int i10 = h7Var.c;
        int i11 = j51Var.d;
        boolean z11 = i10 == i11;
        h7Var.c = i11;
        n6Var.c(j51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, j51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        n6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(j51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h);
        } else {
            imageView.setRotation(j51Var.f ? 0.0f : 180.0f);
        }
        h7Var.d = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new h7(context);
    }
}
