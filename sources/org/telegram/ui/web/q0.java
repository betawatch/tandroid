package org.telegram.ui.web;

import ai.v3;
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
import b8.mf;
import ci.h3;
import gi.j8;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.m5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i4;
import org.telegram.ui.l3;
import org.telegram.ui.na1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class q0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.s1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ t0 e;

    public q0(t0 t0Var, Context context, boolean z10, long j10) {
        this.e = t0Var;
        this.b = context;
        this.c = z10;
        this.d = j10;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        d0 d0Var;
        t0 t0Var = this.e;
        t0Var.c("onCloseWindow " + webView);
        w0 w0Var = t0Var.R;
        if (w0Var == null || (d0Var = w0Var.c) == null) {
            Runnable runnable = t0Var.V;
            if (runnable != null) {
                runnable.run();
                t0Var.V = null;
            }
        } else {
            d0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        d2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        t0 t0Var = this.e;
        t0Var.c(str);
        String url = t0Var.getUrl();
        if (!hp.s1(h10.t0).M2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new p0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (t0Var.R == null || (T = LaunchActivity.T()) == null) {
            return false;
        }
        if (T.getParentLayout() instanceof ActionBarLayout) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        i4 createArticleViewer = T.createArticleViewer(true);
        if (createArticleViewer.v0 != null) {
            int i3 = 0;
            while (true) {
                l3[] l3VarArr = createArticleViewer.v0;
                if (i3 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = l3VarArr[i3];
                if (l3Var != null) {
                    l3Var.f.setOpener(t0Var);
                }
                i3++;
            }
        }
        t0 t0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        l3 l3Var2 = createArticleViewer.v0[0];
        if (l3Var2 != null && l3Var2.f()) {
            if (createArticleViewer.v0[0].getWebView() == null) {
                createArticleViewer.v0[0].f.c();
            }
            t0Var2 = createArticleViewer.v0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            t0Var2.E = url;
        }
        t0Var.c("onCreateWindow: newWebView=" + t0Var2);
        if (t0Var2 == null) {
            createArticleViewer.m(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(t0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.s1 s1Var = this.a;
        t0 t0Var = this.e;
        if (s1Var == null) {
            t0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        t0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        t0 t0Var = this.e;
        w0 w0Var = t0Var.R;
        int i3 = 0;
        if (w0Var == null || w0Var.a0 == null) {
            t0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        t0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String p10 = z10 ? l10.p(t0Var.R.V) : org.telegram.messenger.g0.K0(t0Var.getUrl(), false);
        w0 w0Var2 = t0Var.R;
        org.telegram.ui.ActionBar.s1 Y = t4.Y(w0Var2.a0, w0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, bd.a0(null, null, z10 ? 2131752903 : 2131742916, p10), bd.a0(null, null, z10 ? 2131752902 : 2131742915, p10), new m0(this, callback, str, i3));
        this.a = Y;
        Y.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        w0 w0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, w0Var == null ? null : w0Var.e);
        String l10 = this.c ? m5.l(h10.t0, this.d) : bd.a0(null, null, 2131742912, str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = l10;
        s1Var.U = str2;
        alertDialog$Builder.k(bd.M0(2131747839, null), new n0(zArr, jsResult, 2));
        s1Var.setOnDismissListener(new o0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i3 = 1;
        int i10 = 0;
        boolean[] zArr = {false};
        w0 w0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, w0Var == null ? null : w0Var.e);
        String l10 = this.c ? m5.l(h10.t0, this.d) : bd.a0(null, null, 2131742912, str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = l10;
        s1Var.U = str2;
        alertDialog$Builder.h(bd.M0(2131752589, null), new n0(zArr, jsResult, i10));
        alertDialog$Builder.k(bd.M0(2131747839, null), new n0(zArr, jsResult, i3));
        s1Var.setOnDismissListener(new o0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        w0 w0Var = this.e.R;
        e6 e6Var = w0Var == null ? null : w0Var.e;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, e6Var);
        String l10 = this.c ? m5.l(h10.t0, this.d) : bd.a0(null, null, 2131742912, str);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
        s1Var.S = l10;
        s1Var.U = str2;
        xs xsVar = new xs(context, e6Var);
        xsVar.s0 = true;
        xsVar.setTextSize(1, 18.0f);
        r6.V(xsVar, k6.j5, e6Var);
        r6.m(xsVar, 34, k6.Li, e6Var);
        xsVar.setFocusable(true);
        xsVar.setInputType(147457);
        r6.G(xsVar, k6.k6, k6.l6, k6.p7, e6Var);
        xsVar.setImeOptions(6);
        xsVar.setBackgroundDrawable(null);
        xsVar.setPadding(0, org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f));
        xsVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(xsVar, mf.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        s1Var.a = org.telegram.messenger.g0.L(292.0f);
        alertDialog$Builder.h(bd.M0(2131752589, null), new na1(9, zArr, jsPromptResult));
        alertDialog$Builder.k(bd.M0(2131747839, null), new hr(zArr, jsPromptResult, xsVar, 7));
        alertDialog$Builder.j(new h3(17, zArr, jsPromptResult));
        int i3 = 18;
        s1Var.P = new j8(xsVar, i3);
        xsVar.setOnEditorActionListener(new v3(zArr, jsPromptResult, xsVar, alertDialog$Builder.p(), 1));
        org.telegram.messenger.g0.h3(new d4(xsVar, i3));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.s1 s1Var = this.a;
        if (s1Var != null) {
            s1Var.dismiss();
            this.a = null;
        }
        t0 t0Var = this.e;
        if (t0Var.R == null) {
            t0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        t0Var.c("onPermissionRequest " + permissionRequest);
        int i3 = 0;
        boolean z10 = this.c;
        String p10 = z10 ? l10.p(t0Var.R.V) : org.telegram.messenger.g0.K0(t0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        int i10 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        w0 w0Var = t0Var.R;
                        org.telegram.ui.ActionBar.s1 Y = t4.Y(w0Var.a0, w0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, bd.a0(null, null, z10 ? 2131752908 : 2131742920, p10), bd.a0(null, null, z10 ? 2131752907 : 2131742919, p10), new l0(this, permissionRequest, resources, i3));
                        this.a = Y;
                        Y.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = resources[0];
        w0 w0Var2 = t0Var.R;
        if (w0Var2.a0 == null) {
            permissionRequest.deny();
            return;
        }
        if (w0Var2.r()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            w0 w0Var3 = t0Var.R;
            org.telegram.ui.ActionBar.s1 Y2 = t4.Y(w0Var3.a0, w0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, bd.a0(null, null, z10 ? 2131752906 : 2131742918, p10), bd.a0(null, null, z10 ? 2131752905 : 2131742917, p10), new k0(this, permissionRequest, str, i10));
            this.a = Y2;
            Y2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            w0 w0Var4 = t0Var.R;
            org.telegram.ui.ActionBar.s1 Y3 = t4.Y(w0Var4.a0, w0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, bd.a0(null, null, z10 ? 2131752901 : 2131742914, p10), bd.a0(null, null, z10 ? 2131752900 : 2131742913, p10), new k0(this, permissionRequest, str, i3));
            this.a = Y3;
            Y3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.s1 s1Var = this.a;
        t0 t0Var = this.e;
        if (s1Var == null) {
            t0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        t0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i3) {
        t0 t0Var = this.e;
        w0 w0Var = t0Var.R;
        if (w0Var == null || w0Var.x == null) {
            t0Var.c("onProgressChanged " + i3 + "%: no container");
            return;
        }
        t0Var.c("onProgressChanged " + i3 + "%");
        t0Var.R.x.accept(Float.valueOf(((float) i3) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        t0 t0Var = this.e;
        HashMap hashMap = t0Var.Q;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        t0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(t0Var.getUrl(), t0Var.M) || t0Var.P == null || bitmap.getWidth() > t0Var.P.getWidth())) {
            t0Var.P = bitmap;
            t0Var.M = t0Var.getUrl();
            t0Var.N = true;
            t0.a(t0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(t0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(t0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        t0 t0Var = this.e;
        t0Var.c("onReceivedTitle title=" + str);
        if (!t0Var.h) {
            t0Var.K = true;
            t0Var.L = str;
        }
        w0 w0Var = t0Var.R;
        if (w0Var != null) {
            w0Var.H();
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
        t0 t0Var = this.e;
        Activity W = org.telegram.messenger.g0.W(t0Var.getContext());
        if (W == null) {
            t0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        w0 w0Var = t0Var.R;
        if (w0Var == null) {
            t0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = w0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        t0Var.R.y = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        t0Var.c("onShowFileChooser: true");
        return true;
    }
}
