// default package

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.ui.j;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class su extends WebChromeClient {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ su(KeyEvent.Callback callback, byte b) {
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
                iv3 iv3Var = (iv3) callback;
                FrameLayout frameLayout = iv3Var.o1;
                if (iv3Var.n1 != null) {
                    iv3Var.b.setVisibility(0);
                    frameLayout.setVisibility(4);
                    frameLayout.removeView(iv3Var.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = iv3Var.p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        iv3Var.p1.onCustomViewHidden();
                    }
                    iv3Var.n1 = null;
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
                    hl.d3(new c1(this, (byte) 21), 100L);
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
            default:
                iv3 iv3Var = (iv3) callback;
                FrameLayout frameLayout = iv3Var.o1;
                if (iv3Var.n1 == null && !iv3Var.I0()) {
                    iv3Var.G0();
                    iv3Var.n1 = view;
                    iv3Var.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, tre.c(-1.0f, -1));
                    iv3Var.p1 = customViewCallback;
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
