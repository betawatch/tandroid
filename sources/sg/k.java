package sg;

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.m1;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k extends m1 {
    public final /* synthetic */ ph.k x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ph.k kVar, ph.k kVar2) {
        super(kVar2);
        this.x = kVar;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final boolean b() {
        boolean z10;
        boolean z11;
        o oVar = (o) this.x.c;
        z4 parentLayout = oVar.getParentLayout();
        z10 = ((k2) oVar).inPreviewMode;
        if (z10 || org.telegram.messenger.i0.Q1()) {
            return false;
        }
        z11 = ((k2) oVar).inBubbleMode;
        return (z11 || org.telegram.messenger.i0.E || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void e(float f7, float f10, boolean z10) {
        o oVar = (o) this.x.c;
        if (oVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) oVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void g(int i10, boolean z10) {
        o oVar = (o) this.x.c;
        oVar.w.setVisibility(0);
        oVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new yv0(8, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.m1
    public final void f() {
    }
}
