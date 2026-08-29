package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ t(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                bh.d dVar = m4Var.m0;
                float f9 = -((Integer) obj).intValue();
                m4Var.l0 = f9;
                dVar.setTranslationY(((1.0f - m4Var.U0) * AndroidUtilities.dp(51.0f)) + f9);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    m4 m4Var2 = this.b;
                    m4Var2.d0.U.setText(str);
                    jh.m mVar = m4Var2.d0.U;
                    mVar.setSelection(mVar.getText().length());
                    AndroidUtilities.showKeyboard(m4Var2.d0.U);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                m4 m4Var3 = this.b;
                if (m4Var3.H != null && str2 != null) {
                    m4Var3.d0.k(false);
                    if (!ye.d.f(Uri.parse(str2), false, null)) {
                        if (!ye.d.l(m4Var3.H, str2, false)) {
                            q3 q3Var = m4Var3.q0[0];
                            if (q3Var != null && q3Var.getWebView() != null) {
                                m4Var3.q0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                ye.d.n(str2);
                                break;
                            }
                        }
                    } else {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(true);
                        }
                        ye.d.k(m4Var3.H, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                m4 m4Var4 = this.b;
                if (m4Var4.H != null && a1Var != null) {
                    m4Var4.d0.k(false);
                    q3 q3Var2 = m4Var4.q0[0];
                    if (q3Var2 != null && q3Var2.getWebView() != null) {
                        m4Var4.q0[0].getWebView().e(a1Var.c, a1Var.d);
                        break;
                    } else {
                        ye.d.n(a1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
