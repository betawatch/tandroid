package org.telegram.ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wn0 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ lo0 b;

    public wn0(lo0 lo0Var, Context context) {
        this.b = lo0Var;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        lo0 lo0Var = this.b;
        lo0Var.w0 = false;
        lo0Var.H0(true, false);
        lo0Var.K0();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        lo0 lo0Var = this.b;
        try {
            if (!AndroidUtilities.isSafeToShow(lo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lo0Var.getParentActivity(), 0, lo0Var.V0);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new gl0(this, 7));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean equals;
        lo0 lo0Var;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            lo0Var = this.b;
        } catch (Exception unused) {
        }
        if (equals) {
            lo0Var.t0();
            return true;
        }
        if (!lo0.e1.contains(parse.getScheme())) {
            if (!lo0.d1.contains(parse.getScheme())) {
                try {
                    if (lo0Var.getParentActivity() != null) {
                        lo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
                    alertDialog$Builder.a.O = lo0Var.m0;
                    alertDialog$Builder.a.Q = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
