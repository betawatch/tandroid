package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class vd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                fe feVar = ((qe) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                feVar.b(f7, f7, true);
                break;
            case 1:
                yy yyVar = (yy) this.b;
                if (z10) {
                    yyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                bh0 bh0Var = ((le0) this.b).W;
                if (z10) {
                    bh0Var.c.setEditText((EditText) view);
                    bh0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.yd0 yd0Var = (org.telegram.ui.Components.yd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                yd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.yd0 yd0Var2 = ((ue0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                yd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.yd0 yd0Var3 = ((cf0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                yd0Var3.b(f12, f12, true);
                break;
            case 6:
                bh0 bh0Var2 = ((ff0) this.b).y;
                if (z10) {
                    bh0Var2.c.setEditText((EditText) view);
                    bh0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.yd0 yd0Var4 = ((qf0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                yd0Var4.b(f13, f13, true);
                break;
            case 8:
                bh0 bh0Var3 = ((eg0) this.b).s0;
                if (z10) {
                    bh0Var3.c.setEditText((EditText) view);
                    bh0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.yd0 yd0Var5 = ((ah0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                yd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.yd0 yd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                yd0Var6.b(f15, f15, true);
                break;
            case 11:
                he1 he1Var = (he1) this.b;
                if (!z10) {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    he1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.yd0 yd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                yd0Var7.b(f16, f16, true);
                break;
        }
    }
}
