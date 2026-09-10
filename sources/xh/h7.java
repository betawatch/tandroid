package xh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h7 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new h7());
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        i7 i7Var = (i7) view;
        org.telegram.ui.Components.o6 o6Var = i7Var.a;
        ImageView imageView = i7Var.b;
        int i10 = i7Var.c;
        int i11 = v51Var.d;
        boolean z11 = i10 == i11;
        i7Var.c = i11;
        o6Var.c(v51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, v51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(v51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(wr.h);
        } else {
            imageView.setRotation(v51Var.f ? 0.0f : 180.0f);
        }
        i7Var.d = z10;
        i7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new i7(context);
    }
}
