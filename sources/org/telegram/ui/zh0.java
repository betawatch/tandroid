package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class zh0 extends oy {
    public final int[] N;
    public final /* synthetic */ ni0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.O = ni0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.oy
    public final void g(ny nyVar) {
        ni0 ni0Var = this.O;
        gi0 gi0Var = ni0Var.J;
        if (nyVar == null) {
            return;
        }
        if (ni0Var.k0 != null) {
            nyVar.c = true;
            float f7 = (oy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            nyVar.d = f10;
            nyVar.e = f10;
            nyVar.a = Utilities.clamp(ni0Var.k0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            nyVar.b = ni0Var.k0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = ni0Var.P;
        if (s1Var == null || !s1Var.isAttachedToWindow() || ni0Var.P.getMessageObject() == null || ni0Var.P.getMessageObject().getId() != ni0Var.Q) {
            return;
        }
        ni0Var.P.getLocationOnScreen(this.N);
        nyVar.c = true;
        float f11 = (oy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        nyVar.d = f12;
        nyVar.e = f12;
        float f13 = f11 / 2.0f;
        nyVar.a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.P.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        nyVar.b = ((gi0Var.getScaleY() * ni0Var.P.getTimeY()) + r8[1]) - f13;
    }
}
