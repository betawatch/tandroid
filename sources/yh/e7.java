package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class e7 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new e7());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.p6 p6Var = f7Var.a;
        ImageView imageView = f7Var.b;
        int i10 = f7Var.c;
        int i11 = h51Var.d;
        boolean z11 = i10 == i11;
        f7Var.c = i11;
        p6Var.c(h51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.h6.w0(null, h51Var.q ? org.telegram.ui.ActionBar.h6.o6 : org.telegram.ui.ActionBar.h6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(h51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(rr.h);
        } else {
            imageView.setRotation(h51Var.f ? 0.0f : 180.0f);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new f7(context);
    }
}
