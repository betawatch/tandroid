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
import bi.r4;
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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class o0 extends WebViewClient {
    public boolean a = true;
    public final n0 b = new n0(this, 0);
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ z0 e;

    public o0(z0 z0Var, boolean z10, Context context) {
        this.e = z0Var;
        this.c = z10;
        this.d = context;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z10) {
        e1 e1Var;
        boolean z11 = this.c;
        z0 z0Var = this.e;
        if (!z11 && ((e1Var = z0Var.e) == null || !TextUtils.equals(e1Var.c, str))) {
            e1 e1Var2 = new e1();
            z0Var.e = e1Var2;
            e1Var2.a = Utilities.fastRandom.nextLong();
            z0Var.e.b = System.currentTimeMillis();
            z0Var.e.c = d1.v(z0Var.getUrl());
            z0Var.e.d = n2.a(z0Var);
            f1.c(z0Var.e);
        }
        z0Var.c("doUpdateVisitedHistory " + str + " " + z10);
        d1 d1Var = z0Var.Q;
        if (d1Var != null) {
            d1Var.J(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
        super.doUpdateVisitedHistory(webView, str, z10);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        d1 d1Var;
        z0 z0Var = this.e;
        z0Var.c("onPageCommitVisible " + str);
        boolean z10 = this.c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (d1Var = z0Var.Q) != null) {
            boolean z11 = d1.P0;
            if (d1Var.r()) {
                z0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        if (z10) {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        super.onPageCommitVisible(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        d1 d1Var;
        z0 z0Var = this.e;
        z0Var.b = true;
        z0Var.c("onPageFinished");
        boolean z10 = this.c;
        if (z10 && !com.google.android.gms.internal.cast.o.a("DOCUMENT_START_SCRIPT") && (d1Var = z0Var.Q) != null) {
            boolean z11 = d1.P0;
            if (d1Var.r()) {
                z0Var.d("window.TelegramWebviewProxy={postEvent:function(eventType,eventData){window.TelegramWebviewProxyMessage.postMessage(JSON.stringify({eventType:eventType,eventData:eventData}));}};");
            }
        }
        d1 d1Var2 = z0Var.Q;
        if (d1Var2 != null) {
            d1Var2.U(str, true);
        } else {
            z0Var.c("onPageFinished: no container");
        }
        if (z10) {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
        } else {
            z0Var.N = true;
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
            z0Var.d(AndroidUtilities.readRes(R.raw.webview_share));
        }
        z0.a(z0Var);
        d1 d1Var3 = z0Var.Q;
        if (d1Var3 != null) {
            if (!z0Var.E) {
                z0Var.getUrl();
            }
            d1Var3.J(!z0Var.canGoBack(), !z0Var.canGoForward());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        if (r0.s() == false) goto L11;
     */
    @Override // android.webkit.WebViewClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        String str2;
        d1 d1Var;
        boolean z10 = this.c;
        z0 z0Var = this.e;
        if (z10 && (d1Var = z0Var.Q) != null) {
            d1Var.s0++;
        }
        d1 d1Var2 = z0Var.Q;
        if (d1Var2 != null) {
            boolean z11 = d1.P0;
        }
        z0Var.getSettings().setMediaPlaybackRequiresUserGesture(true);
        f3 f3Var = z0Var.F;
        if (f3Var != null) {
            f3Var.dismiss();
            z0Var.F = null;
        }
        z0Var.e = null;
        z0Var.r = null;
        z0Var.s = false;
        z0Var.v = false;
        z0Var.M = false;
        z0Var.c("onPageStarted " + str);
        if (z0Var.Q != null && z0Var.h && ((str2 = z0Var.n) == null || !TextUtils.equals(str2, str))) {
            AndroidUtilities.runOnUIThread(this.b, 40L);
        }
        d1 d1Var3 = z0Var.Q;
        if (d1Var3 != null) {
            d1Var3.J(!z0Var.canGoBack(), true ^ z0Var.canGoForward());
        }
        super.onPageStarted(webView, str, bitmap);
        z0Var.N = false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (Build.VERSION.SDK_INT >= 23) {
            String str = "onReceivedError: " + webResourceError.getErrorCode() + " " + ((Object) webResourceError.getDescription());
            z0 z0Var = this.e;
            z0Var.c(str);
            if (z0Var.Q != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                z0Var.r = null;
                z0Var.s = false;
                z0Var.v = false;
                z0Var.M = false;
                z0Var.J = false;
                z0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? z0Var.getUrl() : webResourceRequest.getUrl().toString();
                d1 d1Var = z0Var.Q;
                z0Var.K = null;
                d1Var.I();
                d1 d1Var2 = z0Var.Q;
                z0Var.O = null;
                d1Var2.getClass();
                d1 d1Var3 = z0Var.Q;
                z0Var.h = true;
                webResourceError.getErrorCode();
                d1Var3.E(webResourceError.getDescription() != null ? webResourceError.getDescription().toString() : null, true);
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
        z0 z0Var = this.e;
        z0Var.c(sb3);
        if (z0Var.Q != null) {
            if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                AndroidUtilities.cancelRunOnUIThread(this.b);
                z0Var.r = null;
                z0Var.s = false;
                z0Var.v = false;
                z0Var.M = false;
                z0Var.J = false;
                z0Var.n = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? z0Var.getUrl() : webResourceRequest.getUrl().toString();
                d1 d1Var = z0Var.Q;
                z0Var.K = null;
                d1Var.I();
                d1 d1Var2 = z0Var.Q;
                z0Var.O = null;
                d1Var2.getClass();
                d1 d1Var3 = z0Var.Q;
                z0Var.h = true;
                webResourceResponse.getStatusCode();
                d1Var3.E(webResourceResponse.getReasonPhrase(), true);
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
        int i10 = Build.VERSION.SDK_INT;
        z0 z0Var = this.e;
        if (i10 >= 26) {
            StringBuilder sb2 = new StringBuilder("onRenderProcessGone priority=");
            sb2.append(renderProcessGoneDetail == null ? null : Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
            sb2.append(" didCrash=");
            sb2.append(renderProcessGoneDetail == null ? null : Boolean.valueOf(renderProcessGoneDetail.didCrash()));
            z0Var.c(sb2.toString());
        } else {
            z0Var.c("onRenderProcessGone");
        }
        try {
            if (!AndroidUtilities.isSafeToShow(z0Var.getContext())) {
                return true;
            }
            Context context = z0Var.getContext();
            d1 d1Var = z0Var.Q;
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, d1Var == null ? null : d1Var.e);
            alertDialog$Builder.a.R = LocaleController.getString(R.string.ChromeCrashTitle);
            alertDialog$Builder.a.T = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new n0(this, 2));
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.a.setOnDismissListener(new r4(this, 7));
            alertDialog$Builder.o();
            return true;
        } catch (Exception e7) {
            FileLog.e(e7);
            return false;
        }
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        HttpURLConnection httpURLConnection;
        int i10;
        StringBuilder sb2 = new StringBuilder("shouldInterceptRequest ");
        HttpURLConnection httpURLConnection2 = null;
        sb2.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
        String sb3 = sb2.toString();
        z0 z0Var = this.e;
        z0Var.c(sb3);
        if (webResourceRequest != null && d1.q(webResourceRequest.getUrl())) {
            z0Var.c("proxying ton");
            this.a = false;
            return d1.N(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
        }
        if (!this.c && z0Var.f != null && this.a) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
            } catch (Exception e7) {
                e = e7;
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
                        if (!z0Var.E && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                            Iterator<String> it2 = next.getValue().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    break;
                                }
                                String next2 = it2.next();
                                if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                    z0Var.c("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                    z0Var.E = true;
                                    AndroidUtilities.runOnUIThread(new n0(this, 1));
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
        i0 i0Var;
        if (str != null && !str.trim().startsWith("sms:")) {
            boolean startsWith = str.trim().startsWith("tel:");
            Context context = this.d;
            z0 z0Var = this.e;
            if (startsWith) {
                if (z0Var.f != null) {
                    i0 i0Var2 = z0Var.Q.c;
                    if (i0Var2 != null) {
                        i0Var2.j();
                    } else {
                        Runnable runnable = z0Var.U;
                        if (runnable != null) {
                            runnable.run();
                            z0Var.U = null;
                        }
                    }
                }
                of.f.s(context, str);
                return true;
            }
            Uri parse = Uri.parse(str);
            boolean z10 = this.c;
            if (!z10) {
                if (of.f.l(context, str, true)) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                    if (!z0Var.b && !z0Var.canGoBack()) {
                        i0 i0Var3 = z0Var.Q.c;
                        if (i0Var3 != null) {
                            i0Var3.j();
                            return true;
                        }
                        Runnable runnable2 = z0Var.U;
                        if (runnable2 != null) {
                            runnable2.run();
                            z0Var.U = null;
                        }
                    }
                    return true;
                }
                if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                    try {
                        String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                        if (!TextUtils.isEmpty(stringExtra)) {
                            z0Var.loadUrl(stringExtra);
                            return true;
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                }
                if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                    z0Var.c("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                    of.f.p(z0Var.getContext(), parse, true, true);
                    return true;
                }
            }
            if (z0Var.Q == null || !of.f.f(parse, false, null)) {
                if (parse != null) {
                    parse.toString();
                }
                z0Var.c("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }
            if (z10 || !"1".equals(parse.getQueryParameter("embed")) || !"t.me".equals(parse.getAuthority())) {
                if (MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols != null && MessagesController.getInstance(z0Var.Q.M).webAppAllowedProtocols.contains(parse.getScheme())) {
                    if (z0Var.f != null) {
                        i0 i0Var4 = z0Var.Q.c;
                        if (i0Var4 != null) {
                            i0Var4.j();
                        } else {
                            Runnable runnable3 = z0Var.U;
                            if (runnable3 != null) {
                                runnable3.run();
                                z0Var.U = null;
                            }
                        }
                        d1 d1Var = z0Var.f.Q;
                        if (d1Var != null && (i0Var = d1Var.c) != null) {
                            i0Var.b();
                        }
                    }
                    z0Var.Q.H(parse, null, !r5.o0, false, false);
                }
                z0Var.c("shouldOverrideUrlLoading(" + str + ") = true");
                return true;
            }
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        z0 z0Var = this.e;
        z0Var.c("onReceivedError: " + i10 + " " + str + " url=" + str2);
        if (Build.VERSION.SDK_INT < 23 && z0Var.Q != null) {
            AndroidUtilities.cancelRunOnUIThread(this.b);
            z0Var.r = null;
            z0Var.s = false;
            z0Var.v = false;
            z0Var.M = false;
            z0Var.J = false;
            z0Var.n = z0Var.getUrl();
            d1 d1Var = z0Var.Q;
            z0Var.K = null;
            d1Var.I();
            d1 d1Var2 = z0Var.Q;
            z0Var.O = null;
            d1Var2.getClass();
            d1 d1Var3 = z0Var.Q;
            z0Var.h = true;
            d1Var3.E(str, true);
        }
        super.onReceivedError(webView, i10, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        z0 z0Var = this.e;
        z0Var.c("shouldInterceptRequest " + str);
        boolean z10 = d1.P0;
        if (str != null && d1.q(Uri.parse(str))) {
            z0Var.c("proxying ton");
            return d1.N("GET", str, null);
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
