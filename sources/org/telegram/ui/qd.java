package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qd(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z4) {
        switch (this.a) {
            case 0:
                lh.m mVar = ((ke) this.b).R0;
                float f10 = z4 ? 1.0f : 0.0f;
                mVar.b(f10, f10, true);
                break;
            case 1:
                oy oyVar = (oy) this.b;
                if (z4) {
                    oyVar.V.b(true);
                    break;
                }
                break;
            case 2:
                ng0 ng0Var = ((yd0) this.b).T;
                if (z4) {
                    ng0Var.c.setEditText((EditText) view);
                    ng0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ad0 ad0Var = (org.telegram.ui.Components.ad0) this.b;
                float f11 = z4 ? 1.0f : 0.0f;
                ad0Var.b(f11, f11, true);
                break;
            case 4:
                org.telegram.ui.Components.ad0 ad0Var2 = ((he0) this.b).x;
                float f12 = z4 ? 1.0f : 0.0f;
                ad0Var2.b(f12, f12, true);
                break;
            case 5:
                org.telegram.ui.Components.ad0 ad0Var3 = ((pe0) this.b).b;
                float f13 = z4 ? 1.0f : 0.0f;
                ad0Var3.b(f13, f13, true);
                break;
            case 6:
                ng0 ng0Var2 = ((se0) this.b).y;
                if (z4) {
                    ng0Var2.c.setEditText((EditText) view);
                    ng0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.ad0 ad0Var4 = ((df0) this.b).a;
                float f14 = z4 ? 1.0f : 0.0f;
                ad0Var4.b(f14, f14, true);
                break;
            case 8:
                ng0 ng0Var3 = ((rf0) this.b).p0;
                if (z4) {
                    ng0Var3.c.setEditText((EditText) view);
                    ng0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.ad0 ad0Var5 = ((mg0) this.b).e;
                float f15 = z4 ? 1.0f : 0.0f;
                ad0Var5.b(f15, f15, true);
                break;
            case 10:
                org.telegram.ui.Components.ad0 ad0Var6 = ((PasscodeActivity) this.b).f;
                float f16 = z4 ? 1.0f : 0.0f;
                ad0Var6.b(f16, f16, true);
                break;
            case 11:
                hd1 hd1Var = (hd1) this.b;
                if (!z4) {
                    hd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    hd1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.ad0 ad0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f17 = z4 ? 1.0f : 0.0f;
                ad0Var7.b(f17, f17, true);
                break;
        }
    }
}
