package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.Components.tr0;
import yh.w3;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n extends q1 {
    public final /* synthetic */ w3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(w3 w3Var, w3 w3Var2) {
        super(w3Var2);
        this.x = w3Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final boolean b() {
        boolean z10;
        boolean z11;
        q qVar = (q) this.x.c;
        e5 parentLayout = qVar.getParentLayout();
        z10 = ((o2) qVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((o2) qVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.x.c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void g(int i10, boolean z10) {
        q qVar = (q) this.x.c;
        qVar.w.setVisibility(0);
        qVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new tr0(16, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.q1
    public final void f() {
    }
}
