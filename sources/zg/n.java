package zg;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o1;
import org.telegram.ui.Components.yr0;
import yh.t3;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class n extends o1 {
    public final /* synthetic */ t3 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(t3 t3Var, t3 t3Var2) {
        super(t3Var2);
        this.x = t3Var;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final boolean b() {
        boolean z10;
        boolean z11;
        q qVar = (q) this.x.c;
        b5 parentLayout = qVar.getParentLayout();
        z10 = ((m2) qVar).inPreviewMode;
        if (z10 || AndroidUtilities.isTablet()) {
            return false;
        }
        z11 = ((m2) qVar).inBubbleMode;
        return (z11 || AndroidUtilities.isInMultiwindow || parentLayout == null) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void e(float f7, float f10, boolean z10) {
        q qVar = (q) this.x.c;
        if (qVar.getParentLayout() != null) {
            boolean z11 = ((ActionBarLayout) qVar.getParentLayout()).n;
        }
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void g(int i10, boolean z10) {
        q qVar = (q) this.x.c;
        qVar.w.setVisibility(0);
        qVar.w.animate().alpha(!z10 ? 1.0f : 0.0f).withEndAction(new yr0(17, this, z10)).start();
    }

    @Override // org.telegram.ui.ActionBar.o1
    public final void f() {
    }
}
