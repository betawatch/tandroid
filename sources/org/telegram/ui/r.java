package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ r(l4 l4Var, int i9) {
        this.a = i9;
        this.b = l4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                dh.g gVar = l4Var.m0;
                float f10 = -((Integer) obj).intValue();
                l4Var.l0 = f10;
                gVar.setTranslationY(((1.0f - l4Var.U0) * AndroidUtilities.dp(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.b;
                    l4Var2.d0.U.setText(str);
                    gh.o oVar = l4Var2.d0.U;
                    oVar.setSelection(oVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.d0.U);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.b;
                if (l4Var3.H != null && str2 != null) {
                    l4Var3.d0.k(false);
                    if (!ve.e.f(Uri.parse(str2), false, null)) {
                        if (!ve.e.l(l4Var3.H, str2, false)) {
                            p3 p3Var = l4Var3.q0[0];
                            if (p3Var != null && p3Var.getWebView() != null) {
                                l4Var3.q0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                ve.e.n(str2);
                                break;
                            }
                        }
                    } else {
                        y3 y3Var = l4Var3.G;
                        if (y3Var != null) {
                            y3Var.dismiss(true);
                        }
                        ve.e.k(l4Var3.H, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                l4 l4Var4 = this.b;
                if (l4Var4.H != null && z0Var != null) {
                    l4Var4.d0.k(false);
                    p3 p3Var2 = l4Var4.q0[0];
                    if (p3Var2 != null && p3Var2.getWebView() != null) {
                        l4Var4.q0[0].getWebView().e(z0Var.c, z0Var.d);
                        break;
                    } else {
                        ve.e.n(z0Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
