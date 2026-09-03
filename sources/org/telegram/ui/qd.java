package org.telegram.ui;

import android.view.View;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                mh.l lVar = ((ke) this.b).R0;
                float f10 = z4 ? 1.0f : 0.0f;
                lVar.b(f10, f10, true);
                break;
            case 1:
                py pyVar = (py) this.b;
                if (z4) {
                    pyVar.V.b(true);
                    break;
                }
                break;
            case 2:
                og0 og0Var = ((zd0) this.b).T;
                if (z4) {
                    og0Var.c.setEditText((EditText) view);
                    og0Var.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) this.b;
                float f11 = z4 ? 1.0f : 0.0f;
                cd0Var.b(f11, f11, true);
                break;
            case 4:
                org.telegram.ui.Components.cd0 cd0Var2 = ((he0) this.b).x;
                float f12 = z4 ? 1.0f : 0.0f;
                cd0Var2.b(f12, f12, true);
                break;
            case 5:
                org.telegram.ui.Components.cd0 cd0Var3 = ((pe0) this.b).b;
                float f13 = z4 ? 1.0f : 0.0f;
                cd0Var3.b(f13, f13, true);
                break;
            case 6:
                og0 og0Var2 = ((se0) this.b).y;
                if (z4) {
                    og0Var2.c.setEditText((EditText) view);
                    og0Var2.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.cd0 cd0Var4 = ((ef0) this.b).a;
                float f14 = z4 ? 1.0f : 0.0f;
                cd0Var4.b(f14, f14, true);
                break;
            case 8:
                og0 og0Var3 = ((sf0) this.b).p0;
                if (z4) {
                    og0Var3.c.setEditText((EditText) view);
                    og0Var3.c.setDispatchBackWhenEmpty(true);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.cd0 cd0Var5 = ((ng0) this.b).e;
                float f15 = z4 ? 1.0f : 0.0f;
                cd0Var5.b(f15, f15, true);
                break;
            case 10:
                org.telegram.ui.Components.cd0 cd0Var6 = ((PasscodeActivity) this.b).f;
                float f16 = z4 ? 1.0f : 0.0f;
                cd0Var6.b(f16, f16, true);
                break;
            case 11:
                od1 od1Var = (od1) this.b;
                if (!z4) {
                    od1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp)));
                    break;
                } else {
                    od1Var.d.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.ThemeCreateHelp2)));
                    break;
                }
            default:
                org.telegram.ui.Components.cd0 cd0Var7 = ((TwoStepVerificationActivity) this.b).v;
                float f17 = z4 ? 1.0f : 0.0f;
                cd0Var7.b(f17, f17, true);
                break;
        }
    }
}
