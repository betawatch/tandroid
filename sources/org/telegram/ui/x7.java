package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x7(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d8 d8Var = (d8) this.b;
                g8 g8Var = d8Var.x;
                if (d8Var.n != null && g8Var.C) {
                    int i9 = -1;
                    int i10 = -1;
                    for (int i11 = 0; i11 < d8Var.d; i11++) {
                        e8 e8Var = (e8) d8Var.n.get(i11, null);
                        if (e8Var != null) {
                            if (i9 == -1) {
                                i9 = e8Var.h;
                            }
                            i10 = e8Var.h;
                        }
                    }
                    if (i9 >= 0 && i10 >= 0) {
                        g8Var.L = i9;
                        g8Var.M = i10;
                        g8Var.s0();
                        g8Var.n0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.gc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((l71) this.b).a.getImageReceiver().getLottieAnimation() != null && !((l71) this.b).a.getImageReceiver().getLottieAnimation().h0) {
                    ((l71) this.b).a.getImageReceiver().getLottieAnimation().L(0, false, false);
                    ((l71) this.b).a.getImageReceiver().getLottieAnimation().F(false);
                    break;
                }
                break;
            default:
                ((we1) this.b).G0(true);
                break;
        }
    }
}
