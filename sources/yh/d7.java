package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes4.dex */
public final class d7 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new d7());
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        e7 e7Var = (e7) view;
        org.telegram.ui.Components.p6 p6Var = e7Var.a;
        ImageView imageView = e7Var.b;
        int i10 = e7Var.c;
        int i11 = x51Var.d;
        boolean z11 = i10 == i11;
        e7Var.c = i11;
        p6Var.c(x51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, x51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(x51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h);
        } else {
            imageView.setRotation(x51Var.f ? 0.0f : 180.0f);
        }
        e7Var.d = z10;
        e7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new e7(context);
    }
}
