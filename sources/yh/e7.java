package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class e7 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new e7());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.o6 o6Var = f7Var.a;
        ImageView imageView = f7Var.b;
        int i10 = f7Var.c;
        int i11 = w51Var.d;
        boolean z11 = i10 == i11;
        f7Var.c = i11;
        o6Var.c(w51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, w51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(w51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h);
        } else {
            imageView.setRotation(w51Var.f ? 0.0f : 180.0f);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f7(context);
    }
}
