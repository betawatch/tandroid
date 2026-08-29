package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class w7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c8 c8Var = (c8) this.b;
                f8 f8Var = c8Var.x;
                if (c8Var.n != null && f8Var.C) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < c8Var.d; i12++) {
                        d8 d8Var = (d8) c8Var.n.get(i12, null);
                        if (d8Var != null) {
                            if (i10 == -1) {
                                i10 = d8Var.h;
                            }
                            i11 = d8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        f8Var.L = i10;
                        f8Var.M = i11;
                        f8Var.t0();
                        f8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.mc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((o71) this.b).a.getImageReceiver().getLottieAnimation() != null && !((o71) this.b).a.getImageReceiver().getLottieAnimation().h0) {
                    ((o71) this.b).a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((o71) this.b).a.getImageReceiver().getLottieAnimation().F(false);
                    break;
                }
                break;
            default:
                ((ze1) this.b).H0(true);
                break;
        }
    }
}
