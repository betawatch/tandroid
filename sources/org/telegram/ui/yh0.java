package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class yh0 extends oy {
    public final int[] N;
    public final /* synthetic */ mi0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh0(mi0 mi0Var, xh0 xh0Var, int i10) {
        super(i10, xh0Var);
        this.O = mi0Var;
        this.N = new int[2];
    }

    @Override // org.telegram.ui.oy
    public final void g(ny nyVar) {
        mi0 mi0Var = this.O;
        fi0 fi0Var = mi0Var.K;
        if (nyVar == null) {
            return;
        }
        if (mi0Var.l0 != null) {
            nyVar.c = true;
            float f7 = (oy.f() * AndroidUtilities.density) / 1.3f;
            float f10 = f7 / 3.0f;
            nyVar.d = f10;
            nyVar.e = f10;
            nyVar.a = Utilities.clamp(mi0Var.l0.right - (0.75f * f7), AndroidUtilities.displaySize.x - f7, 0.0f);
            nyVar.b = mi0Var.l0.bottom - (f7 / 2.0f);
            return;
        }
        org.telegram.ui.Cells.u1 u1Var = mi0Var.Q;
        if (u1Var == null || !u1Var.isAttachedToWindow() || mi0Var.Q.getMessageObject() == null || mi0Var.Q.getMessageObject().getId() != mi0Var.R) {
            return;
        }
        mi0Var.Q.getLocationOnScreen(this.N);
        nyVar.c = true;
        float f11 = (oy.f() * AndroidUtilities.density) / 1.3f;
        float f12 = f11 / 3.0f;
        nyVar.d = f12;
        nyVar.e = f12;
        float f13 = f11 / 2.0f;
        nyVar.a = Utilities.clamp(((fi0Var.getScaleX() * mi0Var.Q.getTimeX()) + r8[0]) - f13, AndroidUtilities.displaySize.x - f11, 0.0f);
        nyVar.b = ((fi0Var.getScaleY() * mi0Var.Q.getTimeY()) + r8[1]) - f13;
    }
}
