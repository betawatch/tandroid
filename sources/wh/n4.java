package wh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class n4 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new n4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.i51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        o4 o4Var = (o4) view;
        a aVar = (a) j51Var.G;
        k3 k3Var = (k3) j51Var.H;
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

    @Override // org.telegram.ui.Components.i51
    public final boolean contentsEquals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        o4 o4Var = new o4(context, g6Var);
        o4Var.setBackground(new w1(k6.v0(k6.d6, g6Var)));
        return o4Var;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean equals(j51 j51Var, j51 j51Var2) {
        return j51Var.d == j51Var2.d;
    }

    @Override // org.telegram.ui.Components.i51
    public final boolean isClickable() {
        return false;
    }
}
