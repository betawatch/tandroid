package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class r1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ r1(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                v1 v1Var = (v1) this.b;
                k4 k4Var = v1Var.x;
                if (k4Var.O != null) {
                    k4Var.P.setVisibility(4);
                    k4 k4Var2 = v1Var.x;
                    k4Var2.P.removeView(k4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = v1Var.x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        v1Var.x.S.onCustomViewHidden();
                    }
                    v1Var.x.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.b;
                if (hvVar.d != null) {
                    hvVar.getSheetContainer().setVisibility(0);
                    hvVar.e.setVisibility(4);
                    hvVar.e.removeView(hvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = hvVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        hvVar.f.onCustomViewHidden();
                    }
                    hvVar.d = null;
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
                k4 k4Var = ((v1) this.b).x;
                if (k4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    k4Var.O = view;
                    k4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new su0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.hv hvVar = (org.telegram.ui.Components.hv) this.b;
                FrameLayout frameLayout = hvVar.e;
                if (hvVar.d == null && !org.telegram.ui.Components.fh0.p0.P) {
                    hvVar.I();
                    hvVar.d = view;
                    hvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.d(-1.0f, -1));
                    hvVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
