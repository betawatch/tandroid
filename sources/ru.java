// default package

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.ui.j;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ru extends WebChromeClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ru(KeyEvent.Callback callback, byte b) {
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
                ou3 ou3Var = (ou3) callback;
                FrameLayout frameLayout = ou3Var.o1;
                if (ou3Var.n1 != null) {
                    ou3Var.b.setVisibility(0);
                    frameLayout.setVisibility(4);
                    frameLayout.removeView(ou3Var.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ou3Var.p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ou3Var.p1.onCustomViewHidden();
                    }
                    ou3Var.n1 = null;
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
                    gl.d3(new b1(this, (byte) 21), 100L);
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
            default:
                ou3 ou3Var = (ou3) callback;
                FrameLayout frameLayout = ou3Var.o1;
                if (ou3Var.n1 == null && !ou3Var.H0()) {
                    ou3Var.F0();
                    ou3Var.n1 = view;
                    ou3Var.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, nme.c(-1.0f, -1));
                    ou3Var.p1 = customViewCallback;
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
