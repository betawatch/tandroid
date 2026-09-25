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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class yn0 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ oo0 b;

    public yn0(oo0 oo0Var, Context context) {
        this.b = oo0Var;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        oo0 oo0Var = this.b;
        oo0Var.z0 = false;
        oo0Var.H0(true, false);
        oo0Var.K0();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        oo0 oo0Var = this.b;
        try {
            if (!AndroidUtilities.isSafeToShow(oo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(oo0Var.getParentActivity(), 0, oo0Var.Y0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new il0(this, 7));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o();
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        boolean equals;
        oo0 oo0Var;
        try {
            parse = Uri.parse(str);
            equals = "t.me".equals(parse.getHost());
            oo0Var = this.b;
        } catch (Exception unused) {
        }
        if (equals) {
            oo0Var.t0();
            return true;
        }
        if (!oo0.h1.contains(parse.getScheme())) {
            if (!oo0.g1.contains(parse.getScheme())) {
                try {
                    if (oo0Var.getParentActivity() != null) {
                        oo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
                    alertDialog$Builder.a.R = oo0Var.p0;
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return false;
        }
        return true;
    }
}
