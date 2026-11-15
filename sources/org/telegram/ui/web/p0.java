package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.LinearLayout;
import c8.ja;
import di.a3;
import hi.g7;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.km;
import org.telegram.ui.Components.t4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.g4;
import org.telegram.ui.k3;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class p0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.t1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ s0 e;

    public p0(s0 s0Var, Context context, boolean z10, long j3) {
        this.e = s0Var;
        this.b = context;
        this.c = z10;
        this.d = j3;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        c0 c0Var;
        s0 s0Var = this.e;
        s0Var.c("onCloseWindow " + webView);
        v0 v0Var = s0Var.R;
        if (v0Var == null || (c0Var = v0Var.c) == null) {
            Runnable runnable = s0Var.V;
            if (runnable != null) {
                runnable.run();
                s0Var.V = null;
            }
        } else {
            c0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        e2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        s0 s0Var = this.e;
        s0Var.c(str);
        String url = s0Var.getUrl();
        if (!np.s1(m10.t0).M2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new o0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (s0Var.R == null || (T = LaunchActivity.T()) == null) {
            return false;
        }
        if (T.getParentLayout() instanceof ActionBarLayout) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        g4 createArticleViewer = T.createArticleViewer(true);
        if (createArticleViewer.v0 != null) {
            int i7 = 0;
            while (true) {
                k3[] k3VarArr = createArticleViewer.v0;
                if (i7 >= k3VarArr.length) {
                    break;
                }
                k3 k3Var = k3VarArr[i7];
                if (k3Var != null) {
                    k3Var.f.setOpener(s0Var);
                }
                i7++;
            }
        }
        s0 s0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        k3 k3Var2 = createArticleViewer.v0[0];
        if (k3Var2 != null && k3Var2.f()) {
            if (createArticleViewer.v0[0].getWebView() == null) {
                createArticleViewer.v0[0].f.c();
            }
            s0Var2 = createArticleViewer.v0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            s0Var2.E = url;
        }
        s0Var.c("onCreateWindow: newWebView=" + s0Var2);
        if (s0Var2 == null) {
            createArticleViewer.m(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(s0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        s0 s0Var = this.e;
        if (t1Var == null) {
            s0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        s0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        s0 s0Var = this.e;
        v0 v0Var = s0Var.R;
        int i7 = 0;
        if (v0Var == null || v0Var.a0 == null) {
            s0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        s0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String p10 = z10 ? q10.p(s0Var.R.V) : org.telegram.messenger.g0.K0(s0Var.getUrl(), false);
        v0 v0Var2 = s0Var.R;
        org.telegram.ui.ActionBar.t1 W = t4.W(v0Var2.a0, v0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, hd.a0(null, null, z10 ? 2131752903 : 2131742906, p10), hd.a0(null, null, z10 ? 2131752902 : 2131742905, p10), new l0(this, callback, str, i7));
        this.a = W;
        W.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        v0 v0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, v0Var == null ? null : v0Var.e);
        String l10 = this.c ? m5.l(m10.t0, this.d) : hd.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = l10;
        t1Var.U = str2;
        alertDialog$Builder.k(hd.M0(2131747831, null), new m0(zArr, jsResult, 2));
        t1Var.setOnDismissListener(new n0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i7 = 1;
        int i10 = 0;
        boolean[] zArr = {false};
        v0 v0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, v0Var == null ? null : v0Var.e);
        String l10 = this.c ? m5.l(m10.t0, this.d) : hd.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = l10;
        t1Var.U = str2;
        alertDialog$Builder.h(hd.M0(2131752589, null), new m0(zArr, jsResult, i10));
        alertDialog$Builder.k(hd.M0(2131747831, null), new m0(zArr, jsResult, i7));
        t1Var.setOnDismissListener(new n0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        v0 v0Var = this.e.R;
        e6 e6Var = v0Var == null ? null : v0Var.e;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String l10 = this.c ? m5.l(m10.t0, this.d) : hd.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = l10;
        t1Var.U = str2;
        ft ftVar = new ft(context, e6Var);
        ftVar.s0 = true;
        ftVar.setTextSize(1, 18.0f);
        q6.U(ftVar, j6.j5, e6Var);
        q6.l(ftVar, 34, j6.Oi, e6Var);
        ftVar.setFocusable(true);
        ftVar.setInputType(147457);
        q6.F(ftVar, j6.k6, j6.l6, j6.p7, e6Var);
        ftVar.setImeOptions(6);
        ftVar.setBackgroundDrawable(null);
        ftVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        ftVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(ftVar, ja.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        t1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(hd.M0(2131752589, null), new k8(5, zArr, jsPromptResult));
        alertDialog$Builder.k(hd.M0(2131747831, null), new km(zArr, jsPromptResult, ftVar, 8));
        alertDialog$Builder.j(new a3(17, zArr, jsPromptResult));
        t1Var.P = new g7(ftVar, 20);
        ftVar.setOnEditorActionListener(new bi.k3(zArr, jsPromptResult, ftVar, alertDialog$Builder.p(), 1));
        org.telegram.messenger.g0.h3(new org.telegram.ui.ActionBar.r0(ftVar, 24));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        if (t1Var != null) {
            t1Var.dismiss();
            this.a = null;
        }
        s0 s0Var = this.e;
        if (s0Var.R == null) {
            s0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        s0Var.c("onPermissionRequest " + permissionRequest);
        int i7 = 0;
        boolean z10 = this.c;
        String p10 = z10 ? q10.p(s0Var.R.V) : org.telegram.messenger.g0.K0(s0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        int i10 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        v0 v0Var = s0Var.R;
                        org.telegram.ui.ActionBar.t1 W = t4.W(v0Var.a0, v0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, hd.a0(null, null, z10 ? 2131752908 : 2131742910, p10), hd.a0(null, null, z10 ? 2131752907 : 2131742909, p10), new k0(this, permissionRequest, resources, i7));
                        this.a = W;
                        W.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = resources[0];
        v0 v0Var2 = s0Var.R;
        if (v0Var2.a0 == null) {
            permissionRequest.deny();
            return;
        }
        if (v0Var2.r()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            v0 v0Var3 = s0Var.R;
            org.telegram.ui.ActionBar.t1 W2 = t4.W(v0Var3.a0, v0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, hd.a0(null, null, z10 ? 2131752906 : 2131742908, p10), hd.a0(null, null, z10 ? 2131752905 : 2131742907, p10), new j0(this, permissionRequest, str, i10));
            this.a = W2;
            W2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            v0 v0Var4 = s0Var.R;
            org.telegram.ui.ActionBar.t1 W3 = t4.W(v0Var4.a0, v0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, hd.a0(null, null, z10 ? 2131752901 : 2131742904, p10), hd.a0(null, null, z10 ? 2131752900 : 2131742903, p10), new j0(this, permissionRequest, str, i7));
            this.a = W3;
            W3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.t1 t1Var = this.a;
        s0 s0Var = this.e;
        if (t1Var == null) {
            s0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        s0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        s0 s0Var = this.e;
        v0 v0Var = s0Var.R;
        if (v0Var == null || v0Var.x == null) {
            s0Var.c("onProgressChanged " + i7 + "%: no container");
            return;
        }
        s0Var.c("onProgressChanged " + i7 + "%");
        s0Var.R.x.accept(Float.valueOf(((float) i7) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        s0 s0Var = this.e;
        HashMap hashMap = s0Var.Q;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        s0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(s0Var.getUrl(), s0Var.M) || s0Var.P == null || bitmap.getWidth() > s0Var.P.getWidth())) {
            s0Var.P = bitmap;
            s0Var.M = s0Var.getUrl();
            s0Var.N = true;
            s0.a(s0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(s0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(s0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        s0 s0Var = this.e;
        s0Var.c("onReceivedTitle title=" + str);
        if (!s0Var.h) {
            s0Var.K = true;
            s0Var.L = str;
        }
        v0 v0Var = s0Var.R;
        if (v0Var != null) {
            v0Var.I();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z10) {
        this.e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z10);
        super.onReceivedTouchIconUrl(webView, str, z10);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        s0 s0Var = this.e;
        Activity W = org.telegram.messenger.g0.W(s0Var.getContext());
        if (W == null) {
            s0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        v0 v0Var = s0Var.R;
        if (v0Var == null) {
            s0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = v0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        s0Var.R.y = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        s0Var.c("onShowFileChooser: true");
        return true;
    }
}
