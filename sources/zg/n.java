package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.es0;
import yh.u3;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class n extends p1 {
    public final /* synthetic */ u3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(u3 u3Var, u3 u3Var2) {
        super(u3Var2);
        this.x = u3Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        q qVar = (q) this.x.c;
        d5 parentLayout = qVar.getParentLayout();
        z10 = ((n2) qVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((n2) qVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.x.c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        q qVar = (q) this.x.c;
        qVar.w.setVisibility(0);
        qVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new es0(16, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
    }
}
