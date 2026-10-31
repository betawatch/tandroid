package rh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q7 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new q7());
    }

    @Override // org.telegram.ui.Components.z41
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        r7 r7Var = (r7) view;
        org.telegram.ui.Components.f6 f6Var = r7Var.a;
        ImageView imageView = r7Var.b;
        int i10 = r7Var.c;
        int i11 = a51Var.d;
        boolean z11 = i10 == i11;
        r7Var.c = i11;
        f6Var.c(a51Var.l, z11, true);
        org.telegram.ui.ActionBar.t6.v0(a51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6);
        org.telegram.ui.ActionBar.a7.Z(f6Var, a51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6, null);
        org.telegram.ui.ActionBar.a7.t(imageView, a51Var.q ? org.telegram.ui.ActionBar.t6.o6 : org.telegram.ui.ActionBar.t6.G6, null, PorterDuff.Mode.SRC_IN);
        if (z11) {
            imageView.animate().rotation(a51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(gr.h);
        } else {
            imageView.setRotation(a51Var.f ? 0.0f : 180.0f);
        }
        r7Var.d = z10;
        r7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new r7(context);
    }
}
