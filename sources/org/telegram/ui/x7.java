package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class x7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d8 d8Var = (d8) this.b;
                g8 g8Var = d8Var.x;
                if (d8Var.n != null && g8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < d8Var.d; i12++) {
                        e8 e8Var = (e8) d8Var.n.get(i12, null);
                        if (e8Var != null) {
                            if (i10 == -1) {
                                i10 = e8Var.h;
                            }
                            i11 = e8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        g8Var.P = i10;
                        g8Var.Q = i11;
                        g8Var.t0();
                        g8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.tc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((v81) this.b).a.getImageReceiver().getLottieAnimation() != null && !((v81) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((v81) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((v81) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((fg1) this.b).H0(true);
                break;
        }
    }
}
