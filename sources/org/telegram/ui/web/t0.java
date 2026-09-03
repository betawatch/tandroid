package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class t0 extends WebViewClient {
    public final /* synthetic */ WebView a;
    public final /* synthetic */ u0 b;

    public t0(u0 u0Var, WebView webView) {
        this.b = u0Var;
        this.a = webView;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        x0 x0Var = this.b.e;
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb = new StringBuilder("newWebView.onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            x0Var.c(sb.toString());
        } else {
            x0Var.c("newWebView.onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.N;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, a1Var == null ? null : a1Var.e);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new s0(this, 0));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.a.setOnDismissListener(new fg.d0(this, 10));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a1 a1Var = this.b.e.N;
        if (a1Var != null) {
            a1Var.D(Uri.parse(str), null, !a1Var.l0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
