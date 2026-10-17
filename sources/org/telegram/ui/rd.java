package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ai.s sVar = ((ke) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                sVar.b(f7, f7, true);
                break;
            case 1:
                ey eyVar = (ey) this.b;
                if (z10) {
                    eyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                fg0 fg0Var = ((od0) this.b).W;
                if (z10) {
                    fg0Var.c.setEditText((EditText) view);
                    fg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.sd0 sd0Var = (org.telegram.ui.Components.sd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                sd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.sd0 sd0Var2 = ((xd0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                sd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.sd0 sd0Var3 = ((fe0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                sd0Var3.b(f12, f12, true);
                break;
            case 6:
                fg0 fg0Var2 = ((ie0) this.b).y;
                if (z10) {
                    fg0Var2.c.setEditText((EditText) view);
                    fg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.sd0 sd0Var4 = ((te0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                sd0Var4.b(f13, f13, true);
                break;
            case 8:
                fg0 fg0Var3 = ((jf0) this.b).s0;
                if (z10) {
                    fg0Var3.c.setEditText((EditText) view);
                    fg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.sd0 sd0Var5 = ((eg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                sd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.sd0 sd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                sd0Var6.b(f15, f15, true);
                break;
            case 11:
                qc1 qc1Var = (qc1) this.b;
                if (!z10) {
                    qc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    qc1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.sd0 sd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                sd0Var7.b(f16, f16, true);
                break;
        }
    }
}
