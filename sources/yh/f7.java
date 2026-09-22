package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class f7 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new f7());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        g7 g7Var = (g7) view;
        org.telegram.ui.Components.n6 n6Var = g7Var.a;
        ImageView imageView = g7Var.b;
        int i10 = g7Var.c;
        int i11 = i51Var.d;
        boolean z11 = i10 == i11;
        g7Var.c = i11;
        n6Var.c(i51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i51Var.q ? org.telegram.ui.ActionBar.i6.o6 : org.telegram.ui.ActionBar.i6.G6, false);
        n6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(i51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h);
        } else {
            imageView.setRotation(i51Var.f ? 0.0f : 180.0f);
        }
        g7Var.d = z10;
        g7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new g7(context);
    }
}
