package zh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class d7 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new d7());
    }

    @Override // org.telegram.ui.Components.g51
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        e7 e7Var = (e7) view;
        org.telegram.ui.Components.q6 q6Var = e7Var.a;
        ImageView imageView = e7Var.b;
        int i10 = e7Var.c;
        int i11 = h51Var.d;
        boolean z11 = i10 == i11;
        e7Var.c = i11;
        q6Var.c(h51Var.l, z11, true);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, h51Var.q ? org.telegram.ui.ActionBar.j6.o6 : org.telegram.ui.ActionBar.j6.G6, false);
        q6Var.setTextColor(w02);
        imageView.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(h51Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(pr.h);
        } else {
            imageView.setRotation(h51Var.f ? 0.0f : 180.0f);
        }
        e7Var.d = z10;
        e7Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new e7(context);
    }
}
