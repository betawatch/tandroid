package org.telegram.ui.web;

import a8.q9;
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
import c8.cb;
import di.t9;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.s2;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.x2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i0 extends WebViewClient {
    public boolean a = true;
    public final h0 b = new h0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ s0 e;

    public i0(s0 s0Var, boolean z10, Context context) {
        this.e = s0Var;
        this.c = z10;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        w0 w0Var;
        boolean z11 = this.c;
        s0 s0Var = this.e;
        if (!z11 && ((w0Var = s0Var.e) == null || !TextUtils.equals(w0Var.c, str))) {
            w0 w0Var2 = new w0();
            s0Var.e = w0Var2;
            w0Var2.a = Utilities.c.nextLong();
            s0Var.e.b = System.currentTimeMillis();
            s0Var.e.c = v0.u(s0Var.getUrl());
            s0Var.e.d = z1.a(s0Var);
            cb.c(s0Var.e);
        }
        s0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        v0 v0Var = s0Var.R;
        if (v0Var != null) {
            v0Var.J(!s0Var.canGoBack(), !s0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        v0 v0Var;
        s0 s0Var = this.e;
        s0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.c;
        if (z10 && !q9.a("DOCUMENT_START_SCRIPT") && (v0Var = s0Var.R) != null) {
            boolean z11 = v0.R0;
            if (v0Var.q()) {
                s0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (z10) {
            s0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.webview_app_ext);
            boolean z12 = s2.a;
            s0Var.d(y22.replace("$DEBUG$", "true"));
        } else {
            s0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, R.raw.webview_ext);
            boolean z13 = s2.a;
            s0Var.d(y23.replace("$DEBUG$", "true"));
            s0Var.d(org.telegram.messenger.g0.y2(null, R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        v0 v0Var;
        s0 s0Var = this.e;
        s0Var.b = true;
        s0Var.c("onPageFinished");
        boolean z10 = this.c;
        if (z10 && !q9.a("DOCUMENT_START_SCRIPT") && (v0Var = s0Var.R) != null) {
            boolean z11 = v0.R0;
            if (v0Var.q()) {
                s0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        v0 v0Var2 = s0Var.R;
        if (v0Var2 != null) {
            v0Var2.U(str, true);
        } else {
            s0Var.c("onPageFinished: no container");
        }
        if (z10) {
            s0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.webview_app_ext);
            boolean z12 = s2.a;
            s0Var.d(y22.replace("$DEBUG$", "true"));
        } else {
            s0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, R.raw.webview_ext);
            boolean z13 = s2.a;
            s0Var.d(y23.replace("$DEBUG$", "true"));
            s0Var.d(org.telegram.messenger.g0.y2(null, R.raw.webview_share));
        }
        s0.a(s0Var);
        v0 v0Var3 = s0Var.R;
        if (v0Var3 != null) {
            if (!s0Var.F) {
                s0Var.getUrl();
            }
            v0Var3.J(!s0Var.canGoBack(), !s0Var.canGoForward());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0.r() == false) goto L11;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        v0 v0Var;
        boolean z10 = this.c;
        s0 s0Var = this.e;
        if (z10 && (v0Var = s0Var.R) != null) {
            v0Var.t0++;
        }
        v0 v0Var2 = s0Var.R;
        if (v0Var2 != null) {
            boolean z11 = v0.R0;
        }
        s0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        x2 x2Var = s0Var.G;
        if (x2Var != null) {
            x2Var.dismiss();
            s0Var.G = null;
        }
        s0Var.e = null;
        s0Var.r = null;
        s0Var.s = false;
        s0Var.w = false;
        s0Var.N = false;
        s0Var.c("onPageStarted " + str);
        if (s0Var.R != null && s0Var.h && ((str2 = s0Var.n) == null || !TextUtils.equals(str2, str))) {
            org.telegram.messenger.g0.h3(this.b, 40L);
        }
        v0 v0Var3 = s0Var.R;
        if (v0Var3 != null) {
            v0Var3.J(!s0Var.canGoBack(), true ^ s0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        s0Var.O = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
        s0 s0Var = this.e;
        s0Var.c(str);
        if (s0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            org.telegram.messenger.g0.r(this.b);
            s0Var.r = null;
            s0Var.s = false;
            s0Var.w = false;
            s0Var.N = false;
            s0Var.K = false;
            s0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? s0Var.getUrl() : webResourceRequest.getUrl().toString();
            v0 v0Var = s0Var.R;
            s0Var.L = null;
            v0Var.I();
            v0 v0Var2 = s0Var.R;
            s0Var.P = null;
            v0Var2.getClass();
            v0 v0Var3 = s0Var.R;
            s0Var.h = true;
            webResourceError.getErrorCode();
            v0Var3.E(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        s0 s0Var = this.e;
        s0Var.c(sb3);
        if (s0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                org.telegram.messenger.g0.r(this.b);
                s0Var.r = null;
                s0Var.s = false;
                s0Var.w = false;
                s0Var.N = false;
                s0Var.K = false;
                s0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? s0Var.getUrl() : webResourceRequest.getUrl().toString();
                v0 v0Var = s0Var.R;
                s0Var.L = null;
                v0Var.I();
                v0 v0Var2 = s0Var.R;
                s0Var.P = null;
                v0Var2.getClass();
                v0 v0Var3 = s0Var.R;
                s0Var.h = true;
                webResourceResponse.getStatusCode();
                v0Var3.E(true, webResourceResponse.getReasonPhrase());
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
        int i7 = Build.VERSION.SDK_INT;
        s0 s0Var = this.e;
        if (i7 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            s0Var.c(sb2.toString());
        } else {
            s0Var.c("onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(s0Var.getContext())) {
                return true;
            }
            Context context = s0Var.getContext();
            v0 v0Var = s0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, v0Var == null ? null : v0Var.e);
            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
            u1Var.S = gd.M0(2131752093, null);
            u1Var.U = org.telegram.messenger.g0.T2(gd.M0(2131752094, null), new h0(this, 2));
            alertDialog$Builder.k(gd.M0(2131747638, null), null);
            u1Var.setOnDismissListener(new t9(this, 11));
            alertDialog$Builder.p();
            return true;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        s0 s0Var = this.e;
        s0Var.c(sb3);
        if (webResourceRequest != null && v0.p(webResourceRequest.getUrl())) {
            s0Var.c("proxying ton");
            this.a = false;
            return v0.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && s0Var.f != null && this.a) {
            try {
                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
                try {
                    httpURLConnection2.setRequestMethod(webResourceRequest.getMethod());
                    if (webResourceRequest.getRequestHeaders() != null) {
                        for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                            httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                    httpURLConnection2.connect();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry<String, List<String>> entry2 : httpURLConnection2.getHeaderFields().entrySet()) {
                        String key = entry2.getKey();
                        if (key != null) {
                            hashMap.put(key, TextUtils.join(", ", entry2.getValue()));
                            if (!s0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                        s0Var.c("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        s0Var.F = true;
                                        org.telegram.messenger.g0.g3(new h0(this, 1));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    String contentType = httpURLConnection2.getContentType();
                    String contentEncoding = httpURLConnection2.getContentEncoding();
                    if (contentType.indexOf("; ") >= 0) {
                        String[] split = contentType.split("; ");
                        if (!TextUtils.isEmpty(split[0])) {
                            contentType = split[0];
                        }
                        for (int i7 = 1; i7 < split.length; i7++) {
                            if (split[i7].startsWith("charset=")) {
                                contentEncoding = split[i7].substring(8);
                            }
                        }
                    }
                    this.a = false;
                    return new WebResourceResponse(contentType, contentEncoding, httpURLConnection2.getResponseCode(), httpURLConnection2.getResponseMessage(), hashMap, httpURLConnection2.getInputStream());
                } catch (Exception e10) {
                    e = e10;
                    httpURLConnection = httpURLConnection2;
                    a8.g(e, true);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    this.a = false;
                    return super.shouldInterceptRequest(webView, webResourceRequest);
                }
            } catch (Exception e11) {
                e = e11;
            }
        }
        this.a = false;
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        c0 c0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            s0 s0Var = this.e;
            if (startsWith) {
                if (s0Var.f != null) {
                    c0 c0Var2 = s0Var.R.c;
                    if (c0Var2 != null) {
                        c0Var2.j();
                    } else {
                        Runnable runnable = s0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            s0Var.V = null;
                        }
                    }
                }
                vf.c.t(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.c;
            if (!z10) {
                if (vf.c.m(context, str, true)) {
                    s0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!s0Var.b && !s0Var.canGoBack()) {
                        c0 c0Var3 = s0Var.R.c;
                        if (c0Var3 != null) {
                            c0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = s0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            s0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            s0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    s0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    vf.c.q(s0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (s0Var.R == null || !vf.c.g(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                s0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (mp.u1(s0Var.R.N).E4 != null && mp.u1(s0Var.R.N).E4.contains(parse.getScheme())) {
                    v0 v0Var = s0Var.R;
                    if (s0Var.f != null) {
                        c0 c0Var4 = v0Var.c;
                        if (c0Var4 != null) {
                            c0Var4.j();
                        } else {
                            Runnable runnable3 = s0Var.V;
                            if (runnable3 != null) {
                                runnable3.run();
                                s0Var.V = null;
                            }
                        }
                        v0 v0Var2 = s0Var.f.R;
                        if (v0Var2 != null && (c0Var = v0Var2.c) != null) {
                            c0Var.b();
                        }
                    }
                    v0Var.H(parse, null, !v0Var.p0, false, false);
                }
                s0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.e.c("onReceivedError: " + i7 + " " + str + " url=" + str2);
        super.onReceivedError(webView, i7, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        s0 s0Var = this.e;
        s0Var.c("shouldInterceptRequest " + str);
        boolean z10 = v0.R0;
        if (str != null && v0.p(Uri.parse(str))) {
            s0Var.c("proxying ton");
            return v0.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
