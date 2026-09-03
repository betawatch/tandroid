package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
                n4 n4Var = w1Var.x;
                if (n4Var.L != null) {
                    n4Var.M.setVisibility(4);
                    n4 n4Var2 = w1Var.x;
                    n4Var2.M.removeView(n4Var2.L);
                    WebChromeClient.CustomViewCallback customViewCallback = w1Var.x.P;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        w1Var.x.P.onCustomViewHidden();
                    }
                    w1Var.x.L = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.b;
                if (ouVar.d != null) {
                    ouVar.getSheetContainer().setVisibility(0);
                    ouVar.e.setVisibility(4);
                    ouVar.e.removeView(ouVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ouVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ouVar.f.onCustomViewHidden();
                    }
                    ouVar.d = null;
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
                n4 n4Var = ((w1) this.b).x;
                if (n4Var.L != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    n4Var.L = view;
                    n4Var.P = customViewCallback;
                    AndroidUtilities.runOnUIThread(new yt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.ou ouVar = (org.telegram.ui.Components.ou) this.b;
                FrameLayout frameLayout = ouVar.e;
                if (ouVar.d == null && !org.telegram.ui.Components.mg0.m0.M) {
                    ouVar.H();
                    ouVar.d = view;
                    ouVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.b6.c(-1.0f, -1));
                    ouVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
