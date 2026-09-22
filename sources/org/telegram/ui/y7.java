package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class y7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                e8 e8Var = (e8) this.b;
                h8 h8Var = e8Var.x;
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
                        h8Var.t0();
                        h8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.oc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((r81) this.b).a.getImageReceiver().getLottieAnimation() != null && !((r81) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((r81) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((r81) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((eg1) this.b).H0(true);
                break;
        }
    }
}
