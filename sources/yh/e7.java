package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class e7 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new e7());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.a;
        ImageView imageView = f7Var.b;
        int i10 = f7Var.c;
        int i11 = v51Var.d;
        boolean z11 = i10 == i11;
        f7Var.c = i11;
        p6Var.c(v51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, v51Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(v51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(rr.h);
        } else {
            imageView.setRotation(v51Var.f ? 0.0f : 180.0f);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
