package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                        h8Var.B0();
                        h8Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.wb.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((o41) this.b).a.getImageReceiver().B() != null && !((o41) this.b).a.getImageReceiver().B().k0) {
                    ((o41) this.b).a.getImageReceiver().B().N(0, false, false);
                    ((o41) this.b).a.getImageReceiver().B().H(false);
                    break;
                }
                break;
            case 3:
                gf.f.r((Context) this.b, org.telegram.messenger.dd.L0(2131745273, null));
                break;
            default:
                ((nb1) this.b).L0(true);
                break;
        }
    }
}
