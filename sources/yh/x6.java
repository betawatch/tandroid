package yh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class x6 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new x6());
    }

    @Override // org.telegram.ui.Components.o61
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        y6 y6Var = (y6) view;
        org.telegram.ui.Components.r6 r6Var = y6Var.a;
        ImageView imageView = y6Var.b;
        int i10 = y6Var.c;
        int i11 = p61Var.d;
        boolean z11 = i10 == i11;
        y6Var.c = i11;
        r6Var.c(p61Var.l, z11, true);
        int x02 = org.telegram.ui.ActionBar.i6.x0(null, p61Var.q ? org.telegram.ui.ActionBar.i6.o6 : org.telegram.ui.ActionBar.i6.G6, false);
        r6Var.setTextColor(x02);
        imageView.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        if (z11) {
            imageView.animate().rotation(p61Var.f ? 0.0f : 180.0f).setDuration(340L).setInterpolator(hs.h);
        } else {
            imageView.setRotation(p61Var.f ? 0.0f : 180.0f);
        }
        y6Var.d = z10;
        y6Var.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y6(context);
    }
}
