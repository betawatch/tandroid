package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class f7 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new f7());
    }

    @Override // org.telegram.ui.Components.f61
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        g7 g7Var = (g7) view;
        org.telegram.ui.Components.p6 p6Var = g7Var.a;
        ImageView imageView = g7Var.b;
        int i10 = g7Var.c;
        int i11 = g61Var.d;
        boolean z11 = i10 == i11;
        g7Var.c = i11;
        p6Var.c(g61Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, g61Var.q ? org.telegram.ui.ActionBar.i6.o6 : org.telegram.ui.ActionBar.i6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(g61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(tr.h);
        } else {
            imageView.setRotation(g61Var.f ? 0.0f : 180.0f);
        }
        g7Var.d = z10;
        g7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new g7(context);
    }
}
