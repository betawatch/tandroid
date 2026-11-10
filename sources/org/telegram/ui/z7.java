package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class z7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z7(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e8 e8Var = (e8) this.b;
                h8 h8Var = e8Var.y;
                if (e8Var.n != null && h8Var.G) {
                    int i7 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < e8Var.d; i11++) {
                        f8 f8Var = (f8) e8Var.n.get(i11, null);
                        if (f8Var != null) {
                            if (i7 == -1) {
                                i7 = f8Var.h;
                            }
                            i10 = f8Var.h;
                        }
                    }
                    if (i7 >= 0 && i10 >= 0) {
                        h8Var.P = i7;
                        h8Var.Q = i10;
                        h8Var.B0();
                        h8Var.u0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.bc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((c31) this.b).a.getImageReceiver().B() != null && !((c31) this.b).a.getImageReceiver().B().k0) {
                    ((c31) this.b).a.getImageReceiver().B().N(0, false, false);
                    ((c31) this.b).a.getImageReceiver().B().H(false);
                    break;
                }
                break;
            case 3:
                vf.c.t((Context) this.b, org.telegram.messenger.id.M0(2131745255, null));
                break;
            default:
                ((z91) this.b).L0(true);
                break;
        }
    }
}
