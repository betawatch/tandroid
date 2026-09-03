package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l4 b;

    public /* synthetic */ t(l4 l4Var, int i10) {
        this.a = i10;
        this.b = l4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                l4 l4Var = this.b;
                eh.d dVar = l4Var.n0;
                float f10 = -((Integer) obj).intValue();
                l4Var.m0 = f10;
                dVar.setTranslationY(((1.0f - l4Var.V0) * AndroidUtilities.dp(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    l4 l4Var2 = this.b;
                    l4Var2.e0.V.setText(str);
                    mh.m mVar = l4Var2.e0.V;
                    mVar.setSelection(mVar.getText().length());
                    AndroidUtilities.showKeyboard(l4Var2.e0.V);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                l4 l4Var3 = this.b;
                if (l4Var3.I != null && str2 != null) {
                    l4Var3.e0.k(false);
                    if (!af.g.f(Uri.parse(str2), false, null)) {
                        if (!af.g.l(l4Var3.I, str2, false)) {
                            p3 p3Var = l4Var3.r0[0];
                            if (p3Var != null && p3Var.getWebView() != null) {
                                l4Var3.r0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                af.g.n(str2);
                                break;
                            }
                        }
                    } else {
                        y3 y3Var = l4Var3.H;
                        if (y3Var != null) {
                            y3Var.dismiss(true);
                        }
                        af.g.k(l4Var3.I, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                l4 l4Var4 = this.b;
                if (l4Var4.I != null && b1Var != null) {
                    l4Var4.e0.k(false);
                    p3 p3Var2 = l4Var4.r0[0];
                    if (p3Var2 != null && p3Var2.getWebView() != null) {
                        l4Var4.r0[0].getWebView().e(b1Var.c, b1Var.d);
                        break;
                    } else {
                        af.g.n(b1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
