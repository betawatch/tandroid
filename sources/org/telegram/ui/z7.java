package org.telegram.ui;

import android.view.View;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                f8 f8Var = (f8) this.b;
                i8 i8Var = f8Var.x;
                if (f8Var.n != null && i8Var.G) {
                    int i10 = -1;
                    int i11 = -1;
                    for (int i12 = 0; i12 < f8Var.d; i12++) {
                        g8 g8Var = (g8) f8Var.n.get(i12, null);
                        if (g8Var != null) {
                            if (i10 == -1) {
                                i10 = g8Var.h;
                            }
                            i11 = g8Var.h;
                        }
                    }
                    if (i10 >= 0 && i11 >= 0) {
                        i8Var.P = i10;
                        i8Var.Q = i11;
                        i8Var.t0();
                        i8Var.o0();
                        break;
                    }
                }
                break;
            case 1:
                org.telegram.ui.Components.pc.e();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b).getSwipeBack().b(true);
                break;
            case 2:
                if (((u81) this.b).a.getImageReceiver().getLottieAnimation() != null && !((u81) this.b).a.getImageReceiver().getLottieAnimation().k0) {
                    ((u81) this.b).a.getImageReceiver().getLottieAnimation().N(0, false, false);
                    ((u81) this.b).a.getImageReceiver().getLottieAnimation().H(false);
                    break;
                }
                break;
            default:
                ((fg1) this.b).H0(true);
                break;
        }
    }
}
