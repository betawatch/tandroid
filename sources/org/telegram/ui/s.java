package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ s(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                bi.l4 l4Var = j4Var.q0;
                float f7 = -((Integer) obj).intValue();
                j4Var.p0 = f7;
                l4Var.setTranslationY(((1.0f - j4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    j4 j4Var2 = this.b;
                    j4Var2.h0.b0.setText(str);
                    ei.o oVar = j4Var2.h0.b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(j4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                j4 j4Var3 = this.b;
                if (j4Var3.L != null && str2 != null) {
                    j4Var3.h0.k(false);
                    if (!nf.f.f(Uri.parse(str2), false, null)) {
                        if (!nf.f.l(j4Var3.L, str2, false)) {
                            n3 n3Var = j4Var3.u0[0];
                            if (n3Var != null && n3Var.getWebView() != null) {
                                j4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                nf.f.n(str2);
                                break;
                            }
                        }
                    } else {
                        w3 w3Var = j4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(true);
                        }
                        nf.f.k(j4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                j4 j4Var4 = this.b;
                if (j4Var4.L != null && e1Var != null) {
                    j4Var4.h0.k(false);
                    n3 n3Var2 = j4Var4.u0[0];
                    if (n3Var2 != null && n3Var2.getWebView() != null) {
                        j4Var4.u0[0].getWebView().e(e1Var.c, e1Var.d);
                        break;
                    } else {
                        nf.f.n(e1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
