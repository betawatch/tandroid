package org.telegram.ui;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class t1 extends WebViewClient {
    public final /* synthetic */ w1 a;

    public t1(w1 w1Var) {
        this.a = w1Var;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            LaunchActivity launchActivity = LaunchActivity.D1;
            if (launchActivity != null && launchActivity.isFinishing()) {
                return true;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.a.getContext(), 0, null);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new yt0(this, 8));
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
        w1 w1Var = this.a;
        if (!w1Var.s) {
            return false;
        }
        ze.d.s(w1Var.x.I, str);
        return true;
    }
}
