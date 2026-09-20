package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ r(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                ai.x5 x5Var = h4Var.q0;
                float f7 = -((Integer) obj).intValue();
                h4Var.p0 = f7;
                x5Var.setTranslationY(((1.0f - h4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    h4 h4Var2 = this.b;
                    h4Var2.h0.b0.setText(str);
                    fi.o oVar = h4Var2.h0.b0;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(h4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                h4 h4Var3 = this.b;
                if (h4Var3.L != null && str2 != null) {
                    h4Var3.h0.k(false);
                    if (!nf.f.f(Uri.parse(str2), false, null)) {
                        if (!nf.f.l(h4Var3.L, str2, false)) {
                            l3 l3Var = h4Var3.u0[0];
                            if (l3Var != null && l3Var.getWebView() != null) {
                                h4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                nf.f.n(str2);
                                break;
                            }
                        }
                    } else {
                        u3 u3Var = h4Var3.K;
                        if (u3Var != null) {
                            u3Var.dismiss(true);
                        }
                        nf.f.k(h4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                h4 h4Var4 = this.b;
                if (h4Var4.L != null && e1Var != null) {
                    h4Var4.h0.k(false);
                    l3 l3Var2 = h4Var4.u0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        h4Var4.u0[0].getWebView().e(e1Var.c, e1Var.d);
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
