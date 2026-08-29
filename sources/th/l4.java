package th;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class l4 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new l4());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L11;
     */
    @Override // org.telegram.ui.Components.v41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        m4 m4Var = (m4) view;
        a aVar = (a) w41Var.G;
        i3 i3Var = (i3) w41Var.H;
        ArrayList arrayList = m4Var.y;
        m4Var.a = aVar;
        m4Var.J = i3Var;
        m4Var.c(aVar);
        if (aVar != null) {
            a aVar2 = m4Var.a;
            if (aVar2 != null) {
                TL_iv.PageBlock pageBlock = aVar2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (aVar.g == null) {
                aVar.g = new s();
            }
        }
        m4Var.n();
        m4Var.v.b();
        if (m4Var.S >= arrayList.size()) {
            m4Var.S = Math.max(0, arrayList.size() - 1);
        }
        m4Var.T = 0.0f;
        m4Var.Q.d(m4Var.l() ? 1.0f : 0.0f, true);
        m4Var.o(false);
        m4Var.requestLayout();
        m4Var.invalidate();
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean contentsEquals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        m4 m4Var = new m4(context, c6Var);
        m4Var.setBackground(new u1(g6.v0(g6.d6, c6Var)));
        return m4Var;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        return w41Var.d == w41Var2.d;
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
