package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ s1(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                w1 w1Var = (w1) this.b;
                m4 m4Var = w1Var.x;
                if (m4Var.K != null) {
                    m4Var.L.setVisibility(4);
                    m4 m4Var2 = w1Var.x;
                    m4Var2.L.removeView(m4Var2.K);
                    WebChromeClient.CustomViewCallback customViewCallback = w1Var.x.O;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        w1Var.x.O.onCustomViewHidden();
                    }
                    w1Var.x.K = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.fu fuVar = (org.telegram.ui.Components.fu) this.b;
                if (fuVar.d != null) {
                    fuVar.getSheetContainer().setVisibility(0);
                    fuVar.e.setVisibility(4);
                    fuVar.e.removeView(fuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = fuVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        fuVar.f.onCustomViewHidden();
                    }
                    fuVar.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                break;
            default:
                onShowCustomView(view, customViewCallback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                m4 m4Var = ((w1) this.b).x;
                if (m4Var.K != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    m4Var.K = view;
                    m4Var.O = customViewCallback;
                    AndroidUtilities.runOnUIThread(new lt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.fu fuVar = (org.telegram.ui.Components.fu) this.b;
                FrameLayout frameLayout = fuVar.e;
                if (fuVar.d == null && !org.telegram.ui.Components.sf0.l0.L) {
                    fuVar.I();
                    fuVar.d = view;
                    fuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, h7.z5.c(-1.0f, -1));
                    fuVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
