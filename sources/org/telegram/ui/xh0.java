package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xh0 extends py {
    public final int[] J;
    public final /* synthetic */ li0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(li0 li0Var, wh0 wh0Var, int i9) {
        super(i9, wh0Var);
        this.K = li0Var;
        this.J = new int[2];
    }

    @Override // org.telegram.ui.py
    public final void h(oy oyVar) {
        li0 li0Var = this.K;
        ei0 ei0Var = li0Var.G;
        if (oyVar == null) {
            return;
        }
        if (li0Var.h0 != null) {
            oyVar.c = true;
            float f10 = (py.f() * AndroidUtilities.density) / 1.3f;
            float f11 = f10 / 3.0f;
            oyVar.d = f11;
            oyVar.e = f11;
            oyVar.a = Utilities.clamp(li0Var.h0.right - (0.75f * f10), AndroidUtilities.displaySize.x - f10, 0.0f);
            oyVar.b = li0Var.h0.bottom - (f10 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.t1 t1Var = li0Var.M;
        if (t1Var == null || !t1Var.isAttachedToWindow() || li0Var.M.getMessageObject() == null || li0Var.M.getMessageObject().getId() != li0Var.N) {
            return;
        }
        li0Var.M.getLocationOnScreen(this.J);
        oyVar.c = true;
        float f12 = (py.f() * AndroidUtilities.density) / 1.3f;
        float f13 = f12 / 3.0f;
        oyVar.d = f13;
        oyVar.e = f13;
        float f14 = f12 / 2.0f;
        oyVar.a = Utilities.clamp(((ei0Var.getScaleX() * li0Var.M.getTimeX()) + r8[0]) - f14, AndroidUtilities.displaySize.x - f12, 0.0f);
        oyVar.b = ((ei0Var.getScaleY() * li0Var.M.getTimeY()) + r8[1]) - f14;
    }
}
