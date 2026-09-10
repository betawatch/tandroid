package yg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.f5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.Components.bs0;
import xh.t3;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o extends r1 {
    public final /* synthetic */ t3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.x = t3Var;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final boolean b() {
        boolean z10;
        boolean z11;
        s sVar = (s) this.x.c;
        f5 parentLayout = sVar.getParentLayout();
        z10 = ((p2) sVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((p2) sVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void e(float f7, float f10, boolean z10) {
        s sVar = (s) this.x.c;
        if (sVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) sVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(int i10, boolean z10) {
        s sVar = (s) this.x.c;
        sVar.w.setVisibility(0);
        sVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new bs0(16, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void f() {
    }
}
