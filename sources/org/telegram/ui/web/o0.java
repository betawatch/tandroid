package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import di.t9;
import org.telegram.messenger.a8;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class o0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ p0 b;

    public o0(p0 p0Var, WebView webView) {
        this.b = p0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        s0 s0Var = this.b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            s0Var.c(sb2.toString());
        } else {
            s0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(s0Var.getContext())) {
                return true;
            }
            Context context = s0Var.getContext();
            v0 v0Var = s0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, v0Var == null ? null : v0Var.e);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = gd.M0(2131752093, null);
            u1Var.U = org.telegram.messenger.g0.T2(gd.M0(2131752094, null), new oi.a2(this, 28));
            alertDialog$Builder.k(gd.M0(2131747638, null), null);
            u1Var.setOnDismissListener(new t9(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        v0 v0Var = this.b.e.R;
        if (v0Var != null) {
            v0Var.H(Uri.parse(str), null, !v0Var.p0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
