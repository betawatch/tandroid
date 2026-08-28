package qh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k4 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new k4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        l4 l4Var = (l4) view;
        a aVar = (a) l41Var.G;
        h3 h3Var = (h3) l41Var.H;
        ArrayList arrayList = l4Var.y;
        l4Var.a = aVar;
        l4Var.J = h3Var;
        l4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = l4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new s();
            }
        }
        l4Var.n();
        l4Var.v.b();
        if (l4Var.S >= arrayList.size()) {
            l4Var.S = Math.max(0, arrayList.size() - 1);
        }
        l4Var.T = 0.0f;
        l4Var.Q.d(l4Var.l() ? 1.0f : 0.0f, true);
        l4Var.o(false);
        l4Var.requestLayout();
        l4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean contentsEquals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, b6 b6Var) {
        l4 l4Var = new l4(context, b6Var);
        l4Var.setBackground(new u1(f6.v0(f6.d6, b6Var)));
        return l4Var;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        return l41Var.d == l41Var2.d;
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
