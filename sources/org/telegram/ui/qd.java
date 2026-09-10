package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z10) {
        switch (this.a) {
            case 0:
                ae aeVar = ((le) this.b).U0;
                float f7 = z10 ? 1.0f : 0.0f;
                aeVar.b(f7, f7, true);
                break;
            case 1:
                wy wyVar = (wy) this.b;
                if (z10) {
                    wyVar.Y.b(true);
                    break;
                }
                break;
            case 2:
                xg0 xg0Var = ((ge0) this.b).W;
                if (z10) {
                    xg0Var.c.setEditText((EditText) view);
                    xg0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.hd0 hd0Var = (org.telegram.ui.Components.hd0) this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                hd0Var.b(f10, f10, true);
                break;
            case 4:
                org.telegram.ui.Components.hd0 hd0Var2 = ((pe0) this.b).x;
                float f11 = z10 ? 1.0f : 0.0f;
                hd0Var2.b(f11, f11, true);
                break;
            case 5:
                org.telegram.ui.Components.hd0 hd0Var3 = ((xe0) this.b).b;
                float f12 = z10 ? 1.0f : 0.0f;
                hd0Var3.b(f12, f12, true);
                break;
            case 6:
                xg0 xg0Var2 = ((af0) this.b).y;
                if (z10) {
                    xg0Var2.c.setEditText((EditText) view);
                    xg0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.hd0 hd0Var4 = ((lf0) this.b).a;
                float f13 = z10 ? 1.0f : 0.0f;
                hd0Var4.b(f13, f13, true);
                break;
            case 8:
                xg0 xg0Var3 = ((zf0) this.b).s0;
                if (z10) {
                    xg0Var3.c.setEditText((EditText) view);
                    xg0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.hd0 hd0Var5 = ((wg0) this.b).e;
                float f14 = z10 ? 1.0f : 0.0f;
                hd0Var5.b(f14, f14, true);
                break;
            case 10:
                org.telegram.ui.Components.hd0 hd0Var6 = ((PasscodeActivity) this.b).f;
                float f15 = z10 ? 1.0f : 0.0f;
                hd0Var6.b(f15, f15, true);
                break;
            case 11:
                fe1 fe1Var = (fe1) this.b;
                if (!z10) {
                    fe1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    fe1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.hd0 hd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f16 = z10 ? 1.0f : 0.0f;
                hd0Var7.b(f16, f16, true);
                break;
        }
    }
}
