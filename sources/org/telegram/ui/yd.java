package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yd extends org.telegram.ui.Components.ec0 {
    public final /* synthetic */ int L;
    public final /* synthetic */ Object M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd(Object obj, Context context, int i10) {
        super(context, null);
        this.L = i10;
        this.M = obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.L) {
            case 0:
                le leVar = (le) this.M;
                org.telegram.ui.Components.u51 u51Var = leVar.X0;
                zd zdVar = leVar.O0;
                if (zdVar != null && !zdVar.isFocusable()) {
                    zdVar.setFocusable(true);
                    zdVar.setFocusableInTouchMode(true);
                    int A1 = u51Var.A1(3);
                    if (A1 >= 0 && A1 < u51Var.f3.D.size()) {
                        u51Var.C0();
                        u51Var.y0(A1);
                    }
                    zdVar.requestFocus();
                }
                break;
            default:
                rh.i iVar = (rh.i) this.M;
                zd zdVar2 = iVar.Z;
                if (zdVar2 != null && !zdVar2.isFocusable()) {
                    iVar.Z.setFocusable(true);
                    iVar.Z.setFocusableInTouchMode(true);
                    int A12 = iVar.e.A1(1);
                    if (A12 >= 0 && A12 < iVar.e.f3.D.size()) {
                        iVar.e.C0();
                        iVar.e.y0(A12);
                    }
                    iVar.Z.requestFocus();
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
