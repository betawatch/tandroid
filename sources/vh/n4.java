package vh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class n4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new n4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        o4 o4Var = (o4) view;
        a aVar = (a) i51Var.G;
        k3 k3Var = (k3) i51Var.H;
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
                aVar.g = new s();
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

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        o4 o4Var = new o4(context, f6Var);
        o4Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return o4Var;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean equals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
