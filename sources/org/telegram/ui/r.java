package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ r(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                bi.i5 i5Var = k4Var.q0;
                float f7 = -((Integer) obj).intValue();
                k4Var.p0 = f7;
                i5Var.setTranslationY(((1.0f - k4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    k4 k4Var2 = this.b;
                    k4Var2.h0.b0.setText(str);
                    gi.o oVar = k4Var2.h0.b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(k4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                k4 k4Var3 = this.b;
                if (k4Var3.L != null && str2 != null) {
                    k4Var3.h0.k(false);
                    if (!pf.d.f(Uri.parse(str2), false, null)) {
                        if (!pf.d.l(k4Var3.L, str2, false)) {
                            o3 o3Var = k4Var3.u0[0];
                            if (o3Var != null && o3Var.getWebView() != null) {
                                k4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                pf.d.n(str2);
                                break;
                            }
                        }
                    } else {
                        x3 x3Var = k4Var3.K;
                        if (x3Var != null) {
                            x3Var.dismiss(true);
                        }
                        pf.d.k(k4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                k4 k4Var4 = this.b;
                if (k4Var4.L != null && c1Var != null) {
                    k4Var4.h0.k(false);
                    o3 o3Var2 = k4Var4.u0[0];
                    if (o3Var2 != null && o3Var2.getWebView() != null) {
                        k4Var4.u0[0].getWebView().e(c1Var.c, c1Var.d);
                        break;
                    } else {
                        pf.d.n(c1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
