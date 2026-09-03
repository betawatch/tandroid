package wh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class n4 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new n4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        o4 o4Var = (o4) view;
        a aVar = (a) h51Var.G;
        k3 k3Var = (k3) h51Var.H;
        ArrayList arrayList = o4Var.y;
        o4Var.a = aVar;
        o4Var.K = k3Var;
        o4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = o4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new t();
            }
        }
        o4Var.n();
        o4Var.v.b();
        if (o4Var.T >= arrayList.size()) {
            o4Var.T = Math.max(0, arrayList.size() - 1);
        }
        o4Var.U = 0.0f;
        o4Var.R.d(o4Var.l() ? 1.0f : 0.0f, true);
        o4Var.o(false);
        o4Var.requestLayout();
        o4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean contentsEquals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        o4 o4Var = new o4(context, g6Var);
        o4Var.setBackground(new w1(k6.v0(k6.d6, g6Var)));
        return o4Var;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        return h51Var.d == h51Var2.d;
    }

    @Override // org.telegram.ui.Components.g51
    public final boolean isClickable() {
        return false;
    }
}
