package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import ci.ba;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d4;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class p0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ q0 b;

    public p0(q0 q0Var, WebView webView) {
        this.b = q0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        t0 t0Var = this.b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            t0Var.c(sb2.toString());
        } else {
            t0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(t0Var.getContext())) {
                return true;
            }
            Context context = t0Var.getContext();
            w0 w0Var = t0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, w0Var == null ? null : w0Var.e);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = bd.M0(2131752104, null);
            s1Var.U = org.telegram.messenger.g0.U2(bd.M0(2131752105, null), new d4(this, 19));
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            s1Var.setOnDismissListener(new ba(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        w0 w0Var = this.b.e.R;
        if (w0Var != null) {
            w0Var.G(Uri.parse(str), null, !w0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
