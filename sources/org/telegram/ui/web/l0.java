package org.telegram.ui.web;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h3;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l0 extends WebViewClient {
    public boolean a = true;
    public final k0 b = new k0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ x0 e;

    public l0(x0 x0Var, boolean z4, Context context) {
        this.e = x0Var;
        this.c = z4;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z4) {
        b1 b1Var;
        boolean z10 = this.c;
        x0 x0Var = this.e;
        if (!z10 && ((b1Var = x0Var.e) == null || !TextUtils.equals(b1Var.c, str))) {
            b1 b1Var2 = new b1();
            x0Var.e = b1Var2;
            b1Var2.a = Utilities.fastRandom.nextLong();
            x0Var.e.b = System.currentTimeMillis();
            x0Var.e.c = a1.s(x0Var.getUrl());
            x0Var.e.d = l2.a(x0Var);
            c1.c(x0Var.e);
        }
        x0Var.c("doUpdateVisitedHistory " + str + " " + z4);
        a1 a1Var = x0Var.N;
        if (a1Var != null) {
            a1Var.F(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z4);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        x0 x0Var = this.e;
        x0Var.c("onPageCommitVisible " + str);
        if (this.c) {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        x0 x0Var = this.e;
        x0Var.b = true;
        x0Var.c("onPageFinished");
        a1 a1Var = x0Var.N;
        if (a1Var != null) {
            a1Var.O(str, true);
        } else {
            x0Var.c("onPageFinished: no container");
        }
        if (this.c) {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            x0Var.K = true;
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            x0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        x0.a(x0Var);
        a1 a1Var2 = x0Var.N;
        if (a1Var2 != null) {
            if (!x0Var.B) {
                x0Var.getUrl();
            }
            a1Var2.F(!x0Var.canGoBack(), !x0Var.canGoForward());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (r1.p() == false) goto L6;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        x0 x0Var = this.e;
        a1 a1Var = x0Var.N;
        if (a1Var != null) {
            boolean z4 = a1.J0;
        }
        x0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        h3 h3Var = x0Var.C;
        if (h3Var != null) {
            h3Var.dismiss();
            x0Var.C = null;
        }
        x0Var.e = null;
        x0Var.r = null;
        x0Var.s = false;
        x0Var.v = false;
        x0Var.J = false;
        x0Var.c("onPageStarted " + str);
        if (x0Var.N != null && x0Var.h && ((str2 = x0Var.n) == null || !TextUtils.equals(str2, str))) {
            AndroidUtilities.runOnUIThread(this.b, 40L);
        }
        a1 a1Var2 = x0Var.N;
        if (a1Var2 != null) {
            a1Var2.F(!x0Var.canGoBack(), true ^ x0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        x0Var.K = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
            x0 x0Var = this.e;
            x0Var.c(str);
            if (x0Var.N != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                x0Var.r = null;
                x0Var.s = false;
                x0Var.v = false;
                x0Var.J = false;
                x0Var.G = false;
                x0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? x0Var.getUrl() : webResourceRequest.getUrl().toString();
                a1 a1Var = x0Var.N;
                x0Var.H = null;
                a1Var.E();
                a1 a1Var2 = x0Var.N;
                x0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = x0Var.N;
                x0Var.h = true;
                webResourceError.getErrorCode();
                a1Var3.A(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb = new StringBuilder("onReceivedHttpError: statusCode=");
        sb.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
        sb.append(" request=");
        sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb2 = sb.toString();
        x0 x0Var = this.e;
        x0Var.c(sb2);
        if (x0Var.N != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                x0Var.r = null;
                x0Var.s = false;
                x0Var.v = false;
                x0Var.J = false;
                x0Var.G = false;
                x0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? x0Var.getUrl() : webResourceRequest.getUrl().toString();
                a1 a1Var = x0Var.N;
                x0Var.H = null;
                a1Var.E();
                a1 a1Var2 = x0Var.N;
                x0Var.L = null;
                a1Var2.getClass();
                a1 a1Var3 = x0Var.N;
                x0Var.h = true;
                webResourceResponse.getStatusCode();
                a1Var3.A(webResourceResponse.getReasonPhrase(), true);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder sb = new StringBuilder("onReceivedSslError: error=");
        sb.append(sslError);
        sb.append(" url=");
        sb.append(sslError == null ? null : sslError.getUrl());
        this.e.c(sb.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i10 = Build.VERSION.SDK_INT;
        x0 x0Var = this.e;
        if (i10 >= 26) {
            StringBuilder sb = new StringBuilder("onRenderProcessGone priority=");
            sb.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb.append(" didCrash=");
            sb.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            x0Var.c(sb.toString());
        } else {
            x0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(x0Var.getContext())) {
                return true;
            }
            Context context = x0Var.getContext();
            a1 a1Var = x0Var.N;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, a1Var == null ? null : a1Var.e);
            alertDialog$Builder.a.O = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.Q = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new k0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.a.setOnDismissListener(new fg.d0(this, 9));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e6) {
            FileLog.e(e6);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        int i10;
        StringBuilder sb = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb2 = sb.toString();
        x0 x0Var = this.e;
        x0Var.c(sb2);
        if (webResourceRequest != null && a1.o(webResourceRequest.getUrl())) {
            x0Var.c("proxying ton");
            this.a = false;
            return a1.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && x0Var.f != null && this.a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e6) {
                e = e6;
            }
            try {
                httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                if (webResourceRequest.getRequestHeaders() != null) {
                    for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                        httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                    }
                }
                httpURLConnection.connect();
                HashMap hashMap = new HashMap();
                Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, List<String>> next = it.next();
                    String key = next.getKey();
                    if (key != null) {
                        hashMap.put(key, TextUtils.join(", ", next.getValue()));
                        if (!x0Var.B && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    x0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    x0Var.B = true;
                                    AndroidUtilities.runOnUIThread(new k0(this, 1));
                                    break;
                                }
                            }
                        }
                    }
                }
                String contentType = httpURLConnection.getContentType();
                String contentEncoding = httpURLConnection.getContentEncoding();
                if (contentType.indexOf("; ") >= 0) {
                    String[] split = contentType.split("; ");
                    if (!TextUtils.isEmpty(split[0])) {
                        contentType = split[0];
                    }
                    for (i10 = 1; i10 < split.length; i10++) {
                        if (split[i10].startsWith("charset=")) {
                            contentEncoding = split[i10].substring(8);
                        }
                    }
                }
                this.a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e10) {
                e = e10;
                httpURLConnection2 = httpURLConnection;
                FileLog.e(e);
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                }
                this.a = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }
        this.a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        f0 f0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            x0 x0Var = this.e;
            if (startsWith) {
                if (x0Var.f != null) {
                    f0 f0Var2 = x0Var.N.c;
                    if (f0Var2 != null) {
                        f0Var2.j();
                    } else {
                        Runnable runnable = x0Var.P;
                        if (runnable != null) {
                            runnable.run();
                            x0Var.P = null;
                        }
                    }
                }
                af.g.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z4 = this.c;
            if (!z4) {
                if (af.g.l(context, str, true)) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!x0Var.b && !x0Var.canGoBack()) {
                        f0 f0Var3 = x0Var.N.c;
                        if (f0Var3 != null) {
                            f0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = x0Var.P;
                        if (runnable2 != null) {
                            runnable2.run();
                            x0Var.P = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            x0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    x0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    af.g.p(x0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (x0Var.N == null || !af.g.f(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                x0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z4 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (MessagesController.getInstance(x0Var.N.J).webAppAllowedProtocols != null && MessagesController.getInstance(x0Var.N.J).webAppAllowedProtocols.contains(parse.getScheme())) {
                    if (x0Var.f != null) {
                        f0 f0Var4 = x0Var.N.c;
                        if (f0Var4 != null) {
                            f0Var4.j();
                        } else {
                            Runnable runnable3 = x0Var.P;
                            if (runnable3 != null) {
                                runnable3.run();
                                x0Var.P = null;
                            }
                        }
                        a1 a1Var = x0Var.f.N;
                        if (a1Var != null && (f0Var = a1Var.c) != null) {
                            f0Var.b();
                        }
                    }
                    x0Var.N.D(parse, null, !r5.l0, false, false);
                }
                x0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        x0 x0Var = this.e;
        x0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && x0Var.N != null) {
            AndroidUtilities.cancelRunOnUIThread(this.b);
            x0Var.r = null;
            x0Var.s = false;
            x0Var.v = false;
            x0Var.J = false;
            x0Var.G = false;
            x0Var.n = x0Var.getUrl();
            a1 a1Var = x0Var.N;
            x0Var.H = null;
            a1Var.E();
            a1 a1Var2 = x0Var.N;
            x0Var.L = null;
            a1Var2.getClass();
            a1 a1Var3 = x0Var.N;
            x0Var.h = true;
            a1Var3.A(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        x0 x0Var = this.e;
        x0Var.c("shouldInterceptRequest " + str);
        boolean z4 = a1.J0;
        if (str != null && a1.o(Uri.parse(str))) {
            x0Var.c("proxying ton");
            return a1.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
