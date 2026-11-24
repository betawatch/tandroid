// default package

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.ui.j;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rv extends WebChromeClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ rv(KeyEvent.Callback callback, byte b) {
        this.a = b;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                super.onHideCustomView();
                o oVar = ((j) callback).y;
                if (oVar.P != null) {
                    oVar.Q.setVisibility(4);
                    oVar.Q.removeView(oVar.P);
                    WebChromeClient.CustomViewCallback customViewCallback = oVar.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        oVar.T.onCustomViewHidden();
                    }
                    oVar.P = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                zv3 zv3Var = (zv3) callback;
                FrameLayout frameLayout = zv3Var.o1;
                if (zv3Var.n1 != null) {
                    zv3Var.b.setVisibility(0);
                    frameLayout.setVisibility(4);
                    frameLayout.removeView(zv3Var.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = zv3Var.p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        zv3Var.p1.onCustomViewHidden();
                    }
                    zv3Var.n1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        byte b = this.a;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                o oVar = ((j) callback).y;
                if (oVar.P == null) {
                    oVar.P = view;
                    oVar.T = customViewCallback;
                    gm.d3(new b1(this, (byte) 23), 100L);
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
            default:
                zv3 zv3Var = (zv3) callback;
                FrameLayout frameLayout = zv3Var.o1;
                if (zv3Var.n1 == null && !zv3Var.H0()) {
                    zv3Var.F0();
                    zv3Var.n1 = view;
                    zv3Var.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, qoe.c(-1.0f, -1));
                    zv3Var.p1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                break;
            default:
                onShowCustomView(view, customViewCallback);
                break;
        }
    }
}
