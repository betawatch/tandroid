package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n4 b;

    public /* synthetic */ t(n4 n4Var, int i10) {
        this.a = i10;
        this.b = n4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                n4 n4Var = this.b;
                dh.d dVar = n4Var.n0;
                float f10 = -((Integer) obj).intValue();
                n4Var.m0 = f10;
                dVar.setTranslationY(((1.0f - n4Var.V0) * AndroidUtilities.dp(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    n4 n4Var2 = this.b;
                    n4Var2.e0.V.setText(str);
                    lh.n nVar = n4Var2.e0.V;
                    nVar.setSelection(nVar.getText().length());
                    AndroidUtilities.showKeyboard(n4Var2.e0.V);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                n4 n4Var3 = this.b;
                if (n4Var3.I != null && str2 != null) {
                    n4Var3.e0.k(false);
                    if (!ze.d.f(Uri.parse(str2), false, null)) {
                        if (!ze.d.l(n4Var3.I, str2, false)) {
                            r3 r3Var = n4Var3.r0[0];
                            if (r3Var != null && r3Var.getWebView() != null) {
                                n4Var3.r0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                ze.d.n(str2);
                                break;
                            }
                        }
                    } else {
                        a4 a4Var = n4Var3.H;
                        if (a4Var != null) {
                            a4Var.dismiss(true);
                        }
                        ze.d.k(n4Var3.I, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj;
                n4 n4Var4 = this.b;
                if (n4Var4.I != null && d1Var != null) {
                    n4Var4.e0.k(false);
                    r3 r3Var2 = n4Var4.r0[0];
                    if (r3Var2 != null && r3Var2.getWebView() != null) {
                        n4Var4.r0[0].getWebView().e(d1Var.c, d1Var.d);
                        break;
                    } else {
                        ze.d.n(d1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
