package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ r1(KeyEvent.Callback callback, int i9) {
        this.a = i9;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.b;
                l4 l4Var = v1Var.x;
                if (l4Var.K != null) {
                    l4Var.L.setVisibility(4);
                    l4 l4Var2 = v1Var.x;
                    l4Var2.L.removeView(l4Var2.K);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.x.O;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.x.O.onCustomViewHidden();
                    }
                    v1Var.x.K = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.b;
                if (guVar.d != null) {
                    guVar.getSheetContainer().setVisibility(0);
                    guVar.e.setVisibility(4);
                    guVar.e.removeView(guVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = guVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        guVar.f.onCustomViewHidden();
                    }
                    guVar.d = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i9, WebChromeClient.CustomViewCallback customViewCallback) {
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
                l4 l4Var = ((v1) this.b).x;
                if (l4Var.K != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    l4Var.K = view;
                    l4Var.O = customViewCallback;
                    AndroidUtilities.runOnUIThread(new kt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.gu guVar = (org.telegram.ui.Components.gu) this.b;
                FrameLayout frameLayout = guVar.e;
                if (guVar.d == null && !org.telegram.ui.Components.pf0.l0.L) {
                    guVar.H();
                    guVar.d = view;
                    guVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, g7.e6.c(-1.0f, -1));
                    guVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
