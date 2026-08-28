package org.telegram.ui.web;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
            if (!AndroidUtilities.isSafeToShow(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            y0 y0Var = v0Var.M;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, y0Var == null ? null : y0Var.e);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new m2(this, 17));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.a.setOnDismissListener(new eh.l(this, 8));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        y0 y0Var = this.b.e.M;
        if (y0Var != null) {
            y0Var.D(Uri.parse(str), null, !y0Var.k0, false, false);
            this.a.destroy();
        }
        return true;
    }
}
