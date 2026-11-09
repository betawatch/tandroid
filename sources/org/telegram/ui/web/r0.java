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
import bi.u3;
import c8.ha;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g4;
import org.telegram.ui.k3;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class r0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.u1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ u0 e;

    public r0(u0 u0Var, Context context, boolean z9, long j3) {
        this.e = u0Var;
        this.b = context;
        this.c = z9;
        this.d = j3;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        d0 d0Var;
        u0 u0Var = this.e;
        u0Var.c("onCloseWindow " + webView);
        x0 x0Var = u0Var.Q;
        if (x0Var == null || (d0Var = x0Var.c) == null) {
            Runnable runnable = u0Var.U;
            if (runnable != null) {
                runnable.run();
                u0Var.U = null;
            }
        } else {
            d0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
        f2 T;
        String str = "onCreateWindow isDialog=" + z9 + " isUserGesture=" + z10 + " resultMsg=" + message;
        u0 u0Var = this.e;
        u0Var.c(str);
        String url = u0Var.getUrl();
        if (!qp.s1(p10.s0).M2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new q0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (u0Var.Q == null || (T = LaunchActivity.T()) == null) {
            return false;
        }
        if (T.getParentLayout() instanceof ActionBarLayout) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        g4 createArticleViewer = T.createArticleViewer(true);
        if (createArticleViewer.u0 != null) {
            int i7 = 0;
            while (true) {
                k3[] k3VarArr = createArticleViewer.u0;
                if (i7 >= k3VarArr.length) {
                    break;
                }
                k3 k3Var = k3VarArr[i7];
                if (k3Var != null) {
                    k3Var.f.setOpener(u0Var);
                }
                i7++;
            }
        }
        u0 u0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        k3 k3Var2 = createArticleViewer.u0[0];
        if (k3Var2 != null && k3Var2.f()) {
            if (createArticleViewer.u0[0].getWebView() == null) {
                createArticleViewer.u0[0].f.c();
            }
            u0Var2 = createArticleViewer.u0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            u0Var2.D = url;
        }
        u0Var.c("onCreateWindow: newWebView=" + u0Var2);
        if (u0Var2 == null) {
            createArticleViewer.m(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(u0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        u0 u0Var = this.e;
        if (u1Var == null) {
            u0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        u0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        u0 u0Var = this.e;
        x0 x0Var = u0Var.Q;
        int i7 = 0;
        if (x0Var == null || x0Var.W == null) {
            u0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        u0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z9 = this.c;
        String p10 = z9 ? t10.p(u0Var.Q.U) : org.telegram.messenger.g0.K0(u0Var.getUrl(), false);
        x0 x0Var2 = u0Var.Q;
        org.telegram.ui.ActionBar.u1 W = v4.W(x0Var2.W, x0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, id.a0(null, null, z9 ? 2131752903 : 2131742906, p10), id.a0(null, null, z9 ? 2131752902 : 2131742905, p10), new m0(this, callback, str, i7));
        this.a = W;
        W.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        x0 x0Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, x0Var == null ? null : x0Var.e);
        String l10 = this.c ? m5.l(p10.s0, this.d) : id.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = l10;
        u1Var.T = str2;
        alertDialog$Builder.k(id.M0(2131747831, null), new n0(zArr, jsResult, 2));
        u1Var.setOnDismissListener(new o0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i7 = 1;
        int i10 = 0;
        boolean[] zArr = {false};
        x0 x0Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, x0Var == null ? null : x0Var.e);
        String l10 = this.c ? m5.l(p10.s0, this.d) : id.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = l10;
        u1Var.T = str2;
        alertDialog$Builder.h(id.M0(2131752589, null), new n0(zArr, jsResult, i10));
        alertDialog$Builder.k(id.M0(2131747831, null), new n0(zArr, jsResult, i7));
        u1Var.setOnDismissListener(new o0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        x0 x0Var = this.e.Q;
        g6 g6Var = x0Var == null ? null : x0Var.e;
        int i7 = 1;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, g6Var);
        String l10 = this.c ? m5.l(p10.s0, this.d) : id.a0(null, null, 2131742902, str);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.R = l10;
        u1Var.T = str2;
        zs zsVar = new zs(context, g6Var);
        zsVar.r0 = true;
        zsVar.setTextSize(1, 18.0f);
        s6.U(zsVar, l6.j5, g6Var);
        s6.l(zsVar, 34, l6.Li, g6Var);
        zsVar.setFocusable(true);
        zsVar.setInputType(147457);
        s6.F(zsVar, l6.k6, l6.l6, l6.p7, g6Var);
        zsVar.setImeOptions(6);
        zsVar.setBackgroundDrawable(null);
        zsVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        zsVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(zsVar, ha.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        u1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(id.M0(2131752589, null), new a0(i7, zArr, jsPromptResult));
        alertDialog$Builder.k(id.M0(2131747831, null), new hr(zArr, jsPromptResult, zsVar, 7));
        alertDialog$Builder.j(new u3(17, zArr, jsPromptResult));
        u1Var.O = new ii.c(zsVar, 15);
        zsVar.setOnEditorActionListener(new p0(zArr, jsPromptResult, zsVar, alertDialog$Builder.p(), 0));
        org.telegram.messenger.g0.h3(new o5(zsVar, 11));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        if (u1Var != null) {
            u1Var.dismiss();
            this.a = null;
        }
        u0 u0Var = this.e;
        if (u0Var.Q == null) {
            u0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        u0Var.c("onPermissionRequest " + permissionRequest);
        int i7 = 0;
        boolean z9 = this.c;
        String p10 = z9 ? t10.p(u0Var.Q.U) : org.telegram.messenger.g0.K0(u0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        int i10 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        x0 x0Var = u0Var.Q;
                        org.telegram.ui.ActionBar.u1 W = v4.W(x0Var.W, x0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, id.a0(null, null, z9 ? 2131752908 : 2131742910, p10), id.a0(null, null, z9 ? 2131752907 : 2131742909, p10), new l0(this, permissionRequest, resources, i7));
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
        x0 x0Var2 = u0Var.Q;
        if (x0Var2.W == null) {
            permissionRequest.deny();
            return;
        }
        if (x0Var2.r()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            x0 x0Var3 = u0Var.Q;
            org.telegram.ui.ActionBar.u1 W2 = v4.W(x0Var3.W, x0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, id.a0(null, null, z9 ? 2131752906 : 2131742908, p10), id.a0(null, null, z9 ? 2131752905 : 2131742907, p10), new k0(this, permissionRequest, str, i10));
            this.a = W2;
            W2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            x0 x0Var4 = u0Var.Q;
            org.telegram.ui.ActionBar.u1 W3 = v4.W(x0Var4.W, x0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, id.a0(null, null, z9 ? 2131752901 : 2131742904, p10), id.a0(null, null, z9 ? 2131752900 : 2131742903, p10), new k0(this, permissionRequest, str, i7));
            this.a = W3;
            W3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.u1 u1Var = this.a;
        u0 u0Var = this.e;
        if (u1Var == null) {
            u0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        u0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i7) {
        u0 u0Var = this.e;
        x0 x0Var = u0Var.Q;
        if (x0Var == null || x0Var.x == null) {
            u0Var.c("onProgressChanged " + i7 + "%: no container");
            return;
        }
        u0Var.c("onProgressChanged " + i7 + "%");
        u0Var.Q.x.accept(Float.valueOf(((float) i7) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        u0 u0Var = this.e;
        HashMap hashMap = u0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        u0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(u0Var.getUrl(), u0Var.L) || u0Var.O == null || bitmap.getWidth() > u0Var.O.getWidth())) {
            u0Var.O = bitmap;
            u0Var.L = u0Var.getUrl();
            u0Var.M = true;
            u0.a(u0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(u0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(u0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        u0 u0Var = this.e;
        u0Var.c("onReceivedTitle title=" + str);
        if (!u0Var.h) {
            u0Var.J = true;
            u0Var.K = str;
        }
        x0 x0Var = u0Var.Q;
        if (x0Var != null) {
            x0Var.I();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z9) {
        this.e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z9);
        super.onReceivedTouchIconUrl(webView, str, z9);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        u0 u0Var = this.e;
        Activity W = org.telegram.messenger.g0.W(u0Var.getContext());
        if (W == null) {
            u0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        x0 x0Var = u0Var.Q;
        if (x0Var == null) {
            u0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = x0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        u0Var.Q.y = valueCallback;
        boolean z9 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z9) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        u0Var.c("onShowFileChooser: true");
        return true;
    }
}
