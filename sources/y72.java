// default package

import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y72 extends gb {
    public final /* synthetic */ st x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y72(st stVar, st stVar2) {
        super(stVar2);
        this.x = stVar;
    }

    @Override // gb
    public final boolean b() {
        boolean z;
        boolean z2;
        c82 c82Var = (c82) this.x.c;
        ui5 parentLayout = c82Var.getParentLayout();
        z = ((d) c82Var).inPreviewMode;
        if (z || gl.O1()) {
            return false;
        }
        z2 = ((d) c82Var).inBubbleMode;
        return (z2 || gl.E || parentLayout == null) ? false : true;
    }

    @Override // gb
    public final void e(float f, float f2, boolean z) {
        c82 c82Var = (c82) this.x.c;
        if (c82Var.getParentLayout() != null) {
            boolean z2 = ((ActionBarLayout) c82Var.getParentLayout()).n;
        }
    }

    @Override // gb
    public final void g(int i, boolean z) {
        c82 c82Var = (c82) this.x.c;
        c82Var.w.setVisibility(0);
        c82Var.w.animate().alpha(!z ? 1.0f : 0.0f).withEndAction(new x6c((byte) 10, this, z)).start();
    }
}
