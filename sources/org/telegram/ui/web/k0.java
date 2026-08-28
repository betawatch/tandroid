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
import org.telegram.ui.ActionBar.f3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k0 extends WebViewClient {
    public boolean a = true;
    public final j0 b = new j0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ v0 e;

    public k0(v0 v0Var, boolean z10, Context context) {
        this.e = v0Var;
        this.c = z10;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        z0 z0Var;
        boolean z11 = this.c;
        v0 v0Var = this.e;
        if (!z11 && ((z0Var = v0Var.e) == null || !TextUtils.equals(z0Var.c, str))) {
            z0 z0Var2 = new z0();
            v0Var.e = z0Var2;
            z0Var2.a = Utilities.fastRandom.nextLong();
            v0Var.e.b = System.currentTimeMillis();
            v0Var.e.c = y0.s(v0Var.getUrl());
            v0Var.e.d = h2.a(v0Var);
            a1.c(v0Var.e);
        }
        v0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.F(!v0Var.canGoBack(), !v0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        v0 v0Var = this.e;
        v0Var.c("onPageCommitVisible " + str);
        if (this.c) {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        v0 v0Var = this.e;
        v0Var.b = true;
        v0Var.c("onPageFinished");
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.O(str, true);
        } else {
            v0Var.c("onPageFinished: no container");
        }
        if (this.c) {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            v0Var.J = true;
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            v0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        v0.a(v0Var);
        y0 y0Var2 = v0Var.M;
        if (y0Var2 != null) {
            if (!v0Var.A) {
                v0Var.getUrl();
            }
            y0Var2.F(!v0Var.canGoBack(), !v0Var.canGoForward());
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
        v0 v0Var = this.e;
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            boolean z10 = y0.I0;
        }
        v0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        f3 f3Var = v0Var.B;
        if (f3Var != null) {
            f3Var.dismiss();
            v0Var.B = null;
        }
        v0Var.e = null;
        v0Var.r = null;
        v0Var.s = false;
        v0Var.v = false;
        v0Var.I = false;
        v0Var.c("onPageStarted " + str);
        if (v0Var.M != null && v0Var.h && ((str2 = v0Var.n) == null || !TextUtils.equals(str2, str))) {
            AndroidUtilities.runOnUIThread(this.b, 40L);
        }
        y0 y0Var2 = v0Var.M;
        if (y0Var2 != null) {
            y0Var2.F(!v0Var.canGoBack(), true ^ v0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        v0Var.J = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
            v0 v0Var = this.e;
            v0Var.c(str);
            if (v0Var.M != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                v0Var.r = null;
                v0Var.s = false;
                v0Var.v = false;
                v0Var.I = false;
                v0Var.F = false;
                v0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? v0Var.getUrl() : webResourceRequest.getUrl().toString();
                y0 y0Var = v0Var.M;
                v0Var.G = null;
                y0Var.E();
                y0 y0Var2 = v0Var.M;
                v0Var.K = null;
                y0Var2.getClass();
                y0 y0Var3 = v0Var.M;
                v0Var.h = true;
                webResourceError.getErrorCode();
                y0Var3.A(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
            }
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        StringBuilder sb2 = new StringBuilder("onReceivedHttpError: statusCode=");
        sb2.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
        sb2.append(" request=");
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        v0 v0Var = this.e;
        v0Var.c(sb3);
        if (v0Var.M != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                v0Var.r = null;
                v0Var.s = false;
                v0Var.v = false;
                v0Var.I = false;
                v0Var.F = false;
                v0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? v0Var.getUrl() : webResourceRequest.getUrl().toString();
                y0 y0Var = v0Var.M;
                v0Var.G = null;
                y0Var.E();
                y0 y0Var2 = v0Var.M;
                v0Var.K = null;
                y0Var2.getClass();
                y0 y0Var3 = v0Var.M;
                v0Var.h = true;
                webResourceResponse.getStatusCode();
                y0Var3.A(webResourceResponse.getReasonPhrase(), true);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        StringBuilder sb2 = new StringBuilder("onReceivedSslError: error=");
        sb2.append(sslError);
        sb2.append(" url=");
        sb2.append(sslError == null ? null : sslError.getUrl());
        this.e.c(sb2.toString());
        sslErrorHandler.cancel();
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        int i9 = Build.VERSION.SDK_INT;
        v0 v0Var = this.e;
        if (i9 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            v0Var.c(sb2.toString());
        } else {
            v0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(v0Var.getContext())) {
                return true;
            }
            Context context = v0Var.getContext();
            y0 y0Var = v0Var.M;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, y0Var == null ? null : y0Var.e);
            alertDialog$Builder.a.N = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.P = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new j0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.a.setOnDismissListener(new eh.l(this, 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e10) {
            FileLog.e(e10);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        int i9;
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        v0 v0Var = this.e;
        v0Var.c(sb3);
        if (webResourceRequest != null && y0.o(webResourceRequest.getUrl())) {
            v0Var.c("proxying ton");
            this.a = false;
            return y0.I(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && v0Var.f != null && this.a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e10) {
                e = e10;
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
                        if (!v0Var.A && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    v0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    v0Var.A = true;
                                    AndroidUtilities.runOnUIThread(new j0(this, 1));
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
                    for (i9 = 1; i9 < split.length; i9++) {
                        if (split[i9].startsWith("charset=")) {
                            contentEncoding = split[i9].substring(8);
                        }
                    }
                }
                this.a = false;
                return new WebResourceResponse(contentType, contentEncoding, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
            } catch (Exception e11) {
                e = e11;
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
        e0 e0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            v0 v0Var = this.e;
            if (startsWith) {
                if (v0Var.f != null) {
                    e0 e0Var2 = v0Var.M.c;
                    if (e0Var2 != null) {
                        e0Var2.j();
                    } else {
                        Runnable runnable = v0Var.O;
                        if (runnable != null) {
                            runnable.run();
                            v0Var.O = null;
                        }
                    }
                }
                ve.e.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.c;
            if (!z10) {
                if (ve.e.l(context, str, true)) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!v0Var.b && !v0Var.canGoBack()) {
                        e0 e0Var3 = v0Var.M.c;
                        if (e0Var3 != null) {
                            e0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = v0Var.O;
                        if (runnable2 != null) {
                            runnable2.run();
                            v0Var.O = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            v0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    v0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    ve.e.p(v0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (v0Var.M == null || !ve.e.f(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                v0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (MessagesController.getInstance(v0Var.M.I).webAppAllowedProtocols != null && MessagesController.getInstance(v0Var.M.I).webAppAllowedProtocols.contains(parse.getScheme())) {
                    if (v0Var.f != null) {
                        e0 e0Var4 = v0Var.M.c;
                        if (e0Var4 != null) {
                            e0Var4.j();
                        } else {
                            Runnable runnable3 = v0Var.O;
                            if (runnable3 != null) {
                                runnable3.run();
                                v0Var.O = null;
                            }
                        }
                        y0 y0Var = v0Var.f.M;
                        if (y0Var != null && (e0Var = y0Var.c) != null) {
                            e0Var.b();
                        }
                    }
                    v0Var.M.D(parse, null, !r5.k0, false, false);
                }
                v0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i9, String str, String str2) {
        v0 v0Var = this.e;
        v0Var.c("onReceivedError: " + i9 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && v0Var.M != null) {
            AndroidUtilities.cancelRunOnUIThread(this.b);
            v0Var.r = null;
            v0Var.s = false;
            v0Var.v = false;
            v0Var.I = false;
            v0Var.F = false;
            v0Var.n = v0Var.getUrl();
            y0 y0Var = v0Var.M;
            v0Var.G = null;
            y0Var.E();
            y0 y0Var2 = v0Var.M;
            v0Var.K = null;
            y0Var2.getClass();
            y0 y0Var3 = v0Var.M;
            v0Var.h = true;
            y0Var3.A(str, true);
        }
        super.onReceivedError(webView, i9, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        v0 v0Var = this.e;
        v0Var.c("shouldInterceptRequest " + str);
        boolean z10 = y0.I0;
        if (str != null && y0.o(Uri.parse(str))) {
            v0Var.c("proxying ton");
            return y0.I("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
