package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class q7 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new q7());
    }

    @Override // org.telegram.ui.Components.a51
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        r7 r7Var = (r7) view;
        org.telegram.ui.Components.f6 f6Var = r7Var.a;
        ImageView imageView = r7Var.b;
        int i10 = r7Var.c;
        int i11 = b51Var.d;
        boolean z11 = i10 == i11;
        r7Var.c = i11;
        f6Var.c(b51Var.l, z11, true);
        org.telegram.ui.ActionBar.t6.v0(b51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6);
        org.telegram.ui.ActionBar.a7.Z(f6Var, b51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.t(imageView, b51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(b51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h);
        } else {
            imageView.setRotation(b51Var.f ? 0.0f : 180.0f);
        }
        r7Var.d = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new r7(context);
    }
}
