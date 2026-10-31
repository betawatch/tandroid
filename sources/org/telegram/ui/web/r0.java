package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.w5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class r0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ s0 b;

    public r0(s0 s0Var, WebView webView) {
        this.b = s0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        v0 v0Var = this.b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            v0Var.c(sb2.toString());
        } else {
            v0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.i0.M1(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            z0 z0Var = v0Var.Q;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, z0Var == null ? null : z0Var.e);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = cd.L0(2131752104, null);
            x1Var.T = org.telegram.messenger.i0.T2(cd.L0(2131752105, null), new w5(this, 15));
            alertDialog$Builder.k(cd.L0(2131747847, null), null);
            x1Var.setOnDismissListener(new ag.x(this, 10));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        z0 z0Var = this.b.e.Q;
        if (z0Var != null) {
            z0Var.G(Uri.parse(str), null, !z0Var.o0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
