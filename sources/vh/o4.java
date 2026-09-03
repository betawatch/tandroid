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
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class o4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new o4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        p4 p4Var = (p4) view;
        a aVar = (a) i51Var.G;
        l3 l3Var = (l3) i51Var.H;
        ArrayList arrayList = p4Var.y;
        p4Var.a = aVar;
        p4Var.K = l3Var;
        p4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = p4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new t();
            }
        }
        p4Var.n();
        p4Var.v.b();
        if (p4Var.T >= arrayList.size()) {
            p4Var.T = Math.max(0, arrayList.size() - 1);
        }
        p4Var.U = 0.0f;
        p4Var.R.d(p4Var.l() ? 1.0f : 0.0f, true);
        p4Var.o(false);
        p4Var.requestLayout();
        p4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean contentsEquals(i51 i51Var, i51 i51Var2) {
        return i51Var.d == i51Var2.d;
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        p4 p4Var = new p4(context, f6Var);
        p4Var.setBackground(new v1(j6.v0(j6.d6, f6Var)));
        return p4Var;
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
