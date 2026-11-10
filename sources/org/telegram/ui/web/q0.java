package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import bi.eb;
import org.telegram.messenger.a8;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p5;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class q0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ r0 b;

    public q0(r0 r0Var, WebView webView) {
        this.b = r0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        u0 u0Var = this.b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            u0Var.c(sb2.toString());
        } else {
            u0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(u0Var.getContext())) {
                return true;
            }
            Context context = u0Var.getContext();
            x0 x0Var = u0Var.Q;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, x0Var == null ? null : x0Var.e);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.R = id.M0(2131752104, null);
            u1Var.T = org.telegram.messenger.g0.U2(id.M0(2131752105, null), new p5(this, 12));
            alertDialog$Builder.k(id.M0(2131747831, null), null);
            u1Var.setOnDismissListener(new eb(this, 12));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        x0 x0Var = this.b.e.Q;
        if (x0Var != null) {
            x0Var.H(Uri.parse(str), null, !x0Var.o0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
