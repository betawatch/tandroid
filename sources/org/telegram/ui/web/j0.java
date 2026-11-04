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
import b8.p9;
import b8.xf;
import ci.ba;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.r2;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.t2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class j0 extends WebViewClient {
    public boolean a = true;
    public final i0 b = new i0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ t0 e;

    public j0(t0 t0Var, boolean z10, Context context) {
        this.e = t0Var;
        this.c = z10;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        x0 x0Var;
        boolean z11 = this.c;
        t0 t0Var = this.e;
        if (!z11 && ((x0Var = t0Var.e) == null || !TextUtils.equals(x0Var.c, str))) {
            x0 x0Var2 = new x0();
            t0Var.e = x0Var2;
            x0Var2.a = Utilities.c.nextLong();
            t0Var.e.b = System.currentTimeMillis();
            t0Var.e.c = w0.u(t0Var.getUrl());
            t0Var.e.d = y1.a(t0Var);
            xf.c(t0Var.e);
        }
        t0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        w0 w0Var = t0Var.R;
        if (w0Var != null) {
            w0Var.I(!t0Var.canGoBack(), !t0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        w0 w0Var;
        t0 t0Var = this.e;
        t0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.c;
        if (z10 && !p9.a("DOCUMENT_START_SCRIPT") && (w0Var = t0Var.R) != null) {
            boolean z11 = w0.R0;
            if (w0Var.q()) {
                t0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (z10) {
            t0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.webview_app_ext);
            boolean z12 = r2.a;
            t0Var.d(y22.replace("$DEBUG$", "true"));
        } else {
            t0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, R.raw.webview_ext);
            boolean z13 = r2.a;
            t0Var.d(y23.replace("$DEBUG$", "true"));
            t0Var.d(org.telegram.messenger.g0.y2(null, R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        w0 w0Var;
        t0 t0Var = this.e;
        t0Var.b = true;
        t0Var.c("onPageFinished");
        boolean z10 = this.c;
        if (z10 && !p9.a("DOCUMENT_START_SCRIPT") && (w0Var = t0Var.R) != null) {
            boolean z11 = w0.R0;
            if (w0Var.q()) {
                t0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        w0 w0Var2 = t0Var.R;
        if (w0Var2 != null) {
            w0Var2.T(str, true);
        } else {
            t0Var.c("onPageFinished: no container");
        }
        if (z10) {
            t0Var.O = true;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.webview_app_ext);
            boolean z12 = r2.a;
            t0Var.d(y22.replace("$DEBUG$", "true"));
        } else {
            t0Var.O = true;
            String y23 = org.telegram.messenger.g0.y2(null, R.raw.webview_ext);
            boolean z13 = r2.a;
            t0Var.d(y23.replace("$DEBUG$", "true"));
            t0Var.d(org.telegram.messenger.g0.y2(null, R.raw.webview_share));
        }
        t0.a(t0Var);
        w0 w0Var3 = t0Var.R;
        if (w0Var3 != null) {
            if (!t0Var.F) {
                t0Var.getUrl();
            }
            w0Var3.I(!t0Var.canGoBack(), !t0Var.canGoForward());
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
        w0 w0Var;
        boolean z10 = this.c;
        t0 t0Var = this.e;
        if (z10 && (w0Var = t0Var.R) != null) {
            w0Var.t0++;
        }
        w0 w0Var2 = t0Var.R;
        if (w0Var2 != null) {
            boolean z11 = w0.R0;
        }
        t0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        t2 t2Var = t0Var.G;
        if (t2Var != null) {
            t2Var.dismiss();
            t0Var.G = null;
        }
        t0Var.e = null;
        t0Var.r = null;
        t0Var.s = false;
        t0Var.w = false;
        t0Var.N = false;
        t0Var.c("onPageStarted " + str);
        if (t0Var.R != null && t0Var.h && ((str2 = t0Var.n) == null || !TextUtils.equals(str2, str))) {
            org.telegram.messenger.g0.i3(this.b, 40L);
        }
        w0 w0Var3 = t0Var.R;
        if (w0Var3 != null) {
            w0Var3.I(!t0Var.canGoBack(), true ^ t0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        t0Var.O = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
        t0 t0Var = this.e;
        t0Var.c(str);
        if (t0Var.R != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
            org.telegram.messenger.g0.r(this.b);
            t0Var.r = null;
            t0Var.s = false;
            t0Var.w = false;
            t0Var.N = false;
            t0Var.K = false;
            t0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? t0Var.getUrl() : webResourceRequest.getUrl().toString();
            w0 w0Var = t0Var.R;
            t0Var.L = null;
            w0Var.H();
            w0 w0Var2 = t0Var.R;
            t0Var.P = null;
            w0Var2.getClass();
            w0 w0Var3 = t0Var.R;
            t0Var.h = true;
            webResourceError.getErrorCode();
            w0Var3.D(true, webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null);
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
        t0 t0Var = this.e;
        t0Var.c(sb3);
        if (t0Var.R != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                org.telegram.messenger.g0.r(this.b);
                t0Var.r = null;
                t0Var.s = false;
                t0Var.w = false;
                t0Var.N = false;
                t0Var.K = false;
                t0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? t0Var.getUrl() : webResourceRequest.getUrl().toString();
                w0 w0Var = t0Var.R;
                t0Var.L = null;
                w0Var.H();
                w0 w0Var2 = t0Var.R;
                t0Var.P = null;
                w0Var2.getClass();
                w0 w0Var3 = t0Var.R;
                t0Var.h = true;
                webResourceResponse.getStatusCode();
                w0Var3.D(true, webResourceResponse.getReasonPhrase());
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
        int i3 = Build.VERSION.SDK_INT;
        t0 t0Var = this.e;
        if (i3 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            t0Var.c(sb2.toString());
        } else {
            t0Var.c("onRenderProcessGone");
        }
        try {
            if (!org.telegram.messenger.g0.M1(t0Var.getContext())) {
                return true;
            }
            Context context = t0Var.getContext();
            w0 w0Var = t0Var.R;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, w0Var == null ? null : w0Var.e);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = bd.M0(2131752104, null);
            s1Var.U = org.telegram.messenger.g0.U2(bd.M0(2131752105, null), new i0(this, 2));
            alertDialog$Builder.k(bd.M0(2131747839, null), null);
            s1Var.setOnDismissListener(new ba(this, 11));
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
        t0 t0Var = this.e;
        t0Var.c(sb3);
        if (webResourceRequest != null && w0.p(webResourceRequest.getUrl())) {
            t0Var.c("proxying ton");
            this.a = false;
            return w0.M(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && t0Var.f != null && this.a) {
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
                            if (!t0Var.F && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                Iterator<String> it = entry2.getValue().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    String next = it.next();
                                    if (next != null && !"unsafe-none".equals(next.toLowerCase()) && !"same-site".equals(next.toLowerCase())) {
                                        t0Var.c("<!> dangerous header CORS policy: " + key + ": " + next + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                        t0Var.F = true;
                                        org.telegram.messenger.g0.h3(new i0(this, 1));
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
                        for (int i3 = 1; i3 < split.length; i3++) {
                            if (split[i3].startsWith("charset=")) {
                                contentEncoding = split[i3].substring(8);
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
        d0 d0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            t0 t0Var = this.e;
            if (startsWith) {
                if (t0Var.f != null) {
                    d0 d0Var2 = t0Var.R.c;
                    if (d0Var2 != null) {
                        d0Var2.j();
                    } else {
                        Runnable runnable = t0Var.V;
                        if (runnable != null) {
                            runnable.run();
                            t0Var.V = null;
                        }
                    }
                }
                sf.c.t(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.c;
            if (!z10) {
                if (sf.c.m(context, str, true)) {
                    t0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!t0Var.b && !t0Var.canGoBack()) {
                        d0 d0Var3 = t0Var.R.c;
                        if (d0Var3 != null) {
                            d0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = t0Var.V;
                        if (runnable2 != null) {
                            runnable2.run();
                            t0Var.V = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            t0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e10) {
                        a8.g(e10, true);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    t0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    sf.c.q(t0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (t0Var.R == null || !sf.c.g(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                t0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (hp.s1(t0Var.R.N).B4 != null && hp.s1(t0Var.R.N).B4.contains(parse.getScheme())) {
                    w0 w0Var = t0Var.R;
                    if (t0Var.f != null) {
                        d0 d0Var4 = w0Var.c;
                        if (d0Var4 != null) {
                            d0Var4.j();
                        } else {
                            Runnable runnable3 = t0Var.V;
                            if (runnable3 != null) {
                                runnable3.run();
                                t0Var.V = null;
                            }
                        }
                        w0 w0Var2 = t0Var.f.R;
                        if (w0Var2 != null && (d0Var = w0Var2.c) != null) {
                            d0Var.b();
                        }
                    }
                    w0Var.G(parse, null, !w0Var.p0, false, false);
                }
                t0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i3, String str, String str2) {
        this.e.c("onReceivedError: " + i3 + " " + str + " url=" + str2);
        super.onReceivedError(webView, i3, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        t0 t0Var = this.e;
        t0Var.c("shouldInterceptRequest " + str);
        boolean z10 = w0.R0;
        if (str != null && w0.p(Uri.parse(str))) {
            t0Var.c("proxying ton");
            return w0.M("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
