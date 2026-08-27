package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ m4 b;

    public /* synthetic */ s(m4 m4Var, int i10) {
        this.a = i10;
        this.b = m4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                m4 m4Var = this.b;
                ag.d dVar = m4Var.m0;
                float f10 = -((Integer) obj).intValue();
                m4Var.l0 = f10;
                dVar.setTranslationY(((1.0f - m4Var.U0) * AndroidUtilities.dp(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    m4 m4Var2 = this.b;
                    m4Var2.d0.U.setText(str);
                    hh.o oVar = m4Var2.d0.U;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(m4Var2.d0.U);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                m4 m4Var3 = this.b;
                if (m4Var3.H != null && str2 != null) {
                    m4Var3.d0.k(false);
                    if (!we.e.f(Uri.parse(str2), false, null)) {
                        if (!we.e.l(m4Var3.H, str2, false)) {
                            q3 q3Var = m4Var3.q0[0];
                            if (q3Var != null && q3Var.getWebView() != null) {
                                m4Var3.q0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                we.e.n(str2);
                                break;
                            }
                        }
                    } else {
                        z3 z3Var = m4Var3.G;
                        if (z3Var != null) {
                            z3Var.dismiss(true);
                        }
                        we.e.k(m4Var3.H, str2, false, false, null);
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
                        we.e.n(a1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
