package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.p1;
import org.telegram.ui.Components.fs0;
import yh.u3;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class k extends p1 {
    public final /* synthetic */ u3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u3 u3Var, u3 u3Var2) {
        super(u3Var2);
        this.x = u3Var;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.x.c;
        c5 parentLayout = oVar.getParentLayout();
        z10 = ((n2) oVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((n2) oVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void e(float f7, float f10, boolean z10) {
        o oVar = (o) this.x.c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(int i10, boolean z10) {
        o oVar = (o) this.x.c;
        oVar.v.setVisibility(0);
        oVar.v.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new fs0(17, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void f() {
    }
}
