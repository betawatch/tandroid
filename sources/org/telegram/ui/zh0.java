package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class zh0 extends qy {
    public final int[] N;
    public final /* synthetic */ ni0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(ni0 ni0Var, yh0 yh0Var, int i10) {
        super(i10, yh0Var);
        this.O = ni0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.qy
    public final void g(py pyVar) {
        ni0 ni0Var = this.O;
        gi0 gi0Var = ni0Var.K;
        if (pyVar == null) {
            return;
        }
        if (ni0Var.l0 != null) {
            pyVar.c = true;
            float f7 = (qy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            pyVar.d = f10;
            pyVar.e = f10;
            pyVar.a = Utilities.clamp(ni0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            pyVar.b = ni0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = ni0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || ni0Var.Q.getMessageObject() == null || ni0Var.Q.getMessageObject().getId() != ni0Var.R) {
            return;
        }
        ni0Var.Q.getLocationOnScreen(this.N);
        pyVar.c = true;
        float f11 = (qy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        pyVar.d = f12;
        pyVar.e = f12;
        float f13 = f11 / 2.0f;
        pyVar.a = Utilities.clamp(((gi0Var.getScaleX() * ni0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        pyVar.b = ((gi0Var.getScaleY() * ni0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
