package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class e7 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new e7());
    }

    @Override // org.telegram.ui.Components.x51
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        f7 f7Var = (f7) view;
        org.telegram.ui.Components.o6 o6Var = f7Var.a;
        ImageView imageView = f7Var.b;
        int i10 = f7Var.c;
        int i11 = y51Var.d;
        boolean z11 = i10 == i11;
        f7Var.c = i11;
        o6Var.c(y51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, y51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        o6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(y51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(qr.h);
        } else {
            imageView.setRotation(y51Var.f ? 0.0f : 180.0f);
        }
        f7Var.d = z10;
        f7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new f7(context);
    }
}
