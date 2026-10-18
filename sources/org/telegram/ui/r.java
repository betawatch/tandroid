package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ r(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                ci.i4 i4Var = l4Var.q0;
                float f7 = -((Integer) obj).intValue();
                l4Var.p0 = f7;
                i4Var.setTranslationY(((1.0f - l4Var.Y0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.b;
                    l4Var2.h0.b0.setText(str);
                    ai.t tVar = l4Var2.h0.b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.b;
                if (l4Var3.L != null && str2 != null) {
                    l4Var3.h0.k(false);
                    if (!pf.d.e(Uri.parse(str2), false, null)) {
                        if (!pf.d.k(l4Var3.L, str2, false)) {
                            o3 o3Var = l4Var3.u0[0];
                            if (o3Var != null && o3Var.getWebView() != null) {
                                l4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                pf.d.m(str2);
                                break;
                            }
                        }
                    } else {
                        x3 x3Var = l4Var3.K;
                        if (x3Var != null) {
                            x3Var.dismiss(true);
                        }
                        pf.d.j(l4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                l4 l4Var4 = this.b;
                if (l4Var4.L != null && b1Var != null) {
                    l4Var4.h0.k(false);
                    o3 o3Var2 = l4Var4.u0[0];
                    if (o3Var2 != null && o3Var2.getWebView() != null) {
                        l4Var4.u0[0].getWebView().e(b1Var.c, b1Var.d);
                        break;
                    } else {
                        pf.d.m(b1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
