package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ r(i4 i4Var, int i10) {
        this.a = i10;
        this.b = i4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                bi.g5 g5Var = i4Var.q0;
                float f7 = -((Integer) obj).intValue();
                i4Var.p0 = f7;
                g5Var.setTranslationY(((1.0f - i4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.b;
                    i4Var2.h0.b0.setText(str);
                    gi.o oVar = i4Var2.h0.b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(i4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.b;
                if (i4Var3.L != null && str2 != null) {
                    i4Var3.h0.k(false);
                    if (!of.f.f(Uri.parse(str2), false, null)) {
                        if (!of.f.l(i4Var3.L, str2, false)) {
                            m3 m3Var = i4Var3.u0[0];
                            if (m3Var != null && m3Var.getWebView() != null) {
                                i4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                of.f.n(str2);
                                break;
                            }
                        }
                    } else {
                        v3 v3Var = i4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        of.f.k(i4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                i4 i4Var4 = this.b;
                if (i4Var4.L != null && e1Var != null) {
                    i4Var4.h0.k(false);
                    m3 m3Var2 = i4Var4.u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        i4Var4.u0[0].getWebView().e(e1Var.c, e1Var.d);
                        break;
                    } else {
                        of.f.n(e1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
