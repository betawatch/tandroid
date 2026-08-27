package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class zh0 extends sy {
    public final int[] J;
    public final /* synthetic */ ni0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.K = ni0Var;
        this.J = new int[2];
    }

    @Override // org.telegram.ui.sy
    public final void h(ry ryVar) {
        ni0 ni0Var = this.K;
        gi0 gi0Var = ni0Var.G;
        if (ryVar == null) {
            return;
        }
        if (ni0Var.h0 != null) {
            ryVar.c = true;
            float f10 = (sy.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            ryVar.d = f11;
            ryVar.e = f11;
            ryVar.a = Utilities.clamp(ni0Var.h0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            ryVar.b = ni0Var.h0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.s1 s1Var = ni0Var.M;
        if (s1Var == null || !s1Var.isAttachedToWindow() || ni0Var.M.getMessageObject() == null || ni0Var.M.getMessageObject().getId() != ni0Var.N) {
            return;
        }
        ni0Var.M.getLocationOnScreen(this.J);
        ryVar.c = true;
        float f12 = (sy.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        ryVar.d = f13;
        ryVar.e = f13;
        float f14 = f12 / 2.0f;
        ryVar.a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.M.getTimeX()) + r8[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        ryVar.b = ((gi0Var.getScaleY() * ni0Var.M.getTimeY()) + r8[1]) - f14;
    }
}
