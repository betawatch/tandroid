package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class g7 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new g7());
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        h7 h7Var = (h7) view;
        org.telegram.ui.Components.p6 p6Var = h7Var.a;
        ImageView imageView = h7Var.b;
        int i10 = h7Var.c;
        int i11 = h61Var.d;
        boolean z11 = i10 == i11;
        h7Var.c = i11;
        p6Var.c(h61Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, h61Var.q ? org.telegram.ui.ActionBar.i6.o6 : org.telegram.ui.ActionBar.i6.G6, false);
        p6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(h61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(tr.h);
        } else {
            imageView.setRotation(h61Var.f ? 0.0f : 180.0f);
        }
        h7Var.d = z10;
        h7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new h7(context);
    }
}
