package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
                org.telegram.ui.Components.mu muVar = (org.telegram.ui.Components.mu) this.b;
                if (muVar.d != null) {
                    muVar.getSheetContainer().setVisibility(0);
                    muVar.e.setVisibility(4);
                    muVar.e.removeView(muVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = muVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        muVar.f.onCustomViewHidden();
                    }
                    muVar.d = null;
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
                    AndroidUtilities.runOnUIThread(new it0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.mu muVar = (org.telegram.ui.Components.mu) this.b;
                FrameLayout frameLayout = muVar.e;
                if (muVar.d == null && !org.telegram.ui.Components.bg0.l0.L) {
                    muVar.H();
                    muVar.d = view;
                    muVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, i7.f6.c(-1.0f, -1));
                    muVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
