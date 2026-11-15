package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import di.q9;
import org.telegram.messenger.a8;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
            org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
            t1Var.S = hd.M0(2131752104, null);
            t1Var.U = org.telegram.messenger.g0.U2(hd.M0(2131752105, null), new org.telegram.ui.ActionBar.r0(this, 25));
            alertDialog$Builder.k(hd.M0(2131747831, null), null);
            t1Var.setOnDismissListener(new q9(this, 12));
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
