// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class p82 extends hb {
    public final /* synthetic */ tt x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p82(tt ttVar, tt ttVar2) {
        super(ttVar2);
        this.x = ttVar;
    }

    @Override // hb
    public final boolean b() {
        boolean z;
        boolean z2;
        t82 t82Var = (t82) this.x.c;
        wk5 parentLayout = t82Var.getParentLayout();
        z = ((e) t82Var).inPreviewMode;
        if (z || hl.O1()) {
            return false;
        }
        z2 = ((e) t82Var).inBubbleMode;
        return (z2 || hl.E || parentLayout == null) ? false : true;
    }

    @Override // hb
    public final void e(float f, float f2, boolean z) {
        t82 t82Var = (t82) this.x.c;
        if (t82Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) t82Var.getParentLayout()).n;
        }
    }

    @Override // hb
    public final void g(int i, boolean z) {
        t82 t82Var = (t82) this.x.c;
        t82Var.w.setVisibility(0);
        t82Var.w.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new xac((byte) 10, this, z)).start();
    }
}
