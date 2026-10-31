package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e8 e8Var = (e8) this.b;
                h8 h8Var = e8Var.y;
                if (e8Var.n != null && h8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < e8Var.d; i12++) {
                        f8 f8Var = (f8) e8Var.n.get(i12, null);
                        if (f8Var != null) {
                            if (i10 == -1) {
                                i10 = f8Var.h;
                            }
                            i11 = f8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        h8Var.P = i10;
                        h8Var.Q = i11;
                        h8Var.A0();
                        h8Var.t0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.wb.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((q41) this.b).a.getImageReceiver().B() != null && !((q41) this.b).a.getImageReceiver().B().k0) {
                    ((q41) this.b).a.getImageReceiver().B().N(0, false, false);
                    ((q41) this.b).a.getImageReceiver().B().H(false);
                    break;
                }
                break;
            case 3:
                gf.f.r((Context) this.b, org.telegram.messenger.cd.L0(2131745273, null));
                break;
            default:
                ((pb1) this.b).K0(true);
                break;
        }
    }
}
