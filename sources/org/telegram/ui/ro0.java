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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ro0 extends WebViewClient {
    public final /* synthetic */ Context a;
    public final /* synthetic */ yo0 b;

    public ro0(yo0 yo0Var, Context context) {
        this.b = yo0Var;
        this.a = context;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        yo0 yo0Var = this.b;
        yo0Var.z0 = false;
        yo0Var.H0(true, false);
        yo0Var.K0();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        yo0 yo0Var = this.b;
        try {
            if (!AndroidUtilities.isSafeToShow(yo0Var.getParentActivity())) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yo0Var.getParentActivity(), 0, yo0Var.Y0);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new sl0(this, 9));
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
        yo0 yo0Var = this.b;
        yo0Var.y = !str.equals(yo0Var.x);
        try {
            parse = Uri.parse(str);
        } catch (Exception unused) {
        }
        if ("t.me".equals(parse.getHost())) {
            yo0Var.t0();
            return true;
        }
        if (!yo0.h1.contains(parse.getScheme())) {
            if (!yo0.g1.contains(parse.getScheme())) {
                try {
                    if (yo0Var.getParentActivity() != null) {
                        yo0Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", parse), 210);
                        return true;
                    }
                } catch (ActivityNotFoundException unused2) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a);
                    alertDialog$Builder.a.R = yo0Var.p0;
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
                    alertDialog$Builder.o();
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
        return true;
    }
}
