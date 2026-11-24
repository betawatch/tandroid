// default package

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class yu0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ zu0 b;

    public yu0(zu0 zu0Var, WebView webView) {
        this.b = zu0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i = Build.VERSION.SDK_INT;
        cv0 cv0Var = this.b.e;
        if (i >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            cv0Var.b(sb.toString());
        } else {
            cv0Var.b("newWebView.onRenderProcessGone");
        }
        try {
            if (!gl.K1(cv0Var.getContext())) {
                return true;
            }
            Context context = cv0Var.getContext();
            hv0 hv0Var = cv0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hv0Var == null ? null : hv0Var.e, context);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = k96.M0(2131752092, null);
            hdVar.U = gl.N2(k96.M0(2131752093, null), -1, 0, new oz(this, (byte) 29), null);
            alertDialog$Builder.j(k96.M0(2131747638, null), null);
            hdVar.setOnDismissListener(new n1(this, (byte) 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        hv0 hv0Var = this.b.e.R;
        if (hv0Var != null) {
            Uri parse = Uri.parse(str);
            boolean z = hv0.R0;
            hv0Var.E(parse, null, !hv0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
