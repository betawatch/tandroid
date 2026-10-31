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
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class s0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.x1 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ v0 e;

    public s0(v0 v0Var, Context context, boolean z10, long j10) {
        this.e = v0Var;
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
        v0 v0Var = this.e;
        v0Var.c("onCloseWindow " + webView);
        z0 z0Var = v0Var.Q;
        if (z0Var == null || (d0Var = z0Var.c) == null) {
            Runnable runnable = v0Var.U;
            if (runnable != null) {
                runnable.run();
                v0Var.U = null;
            }
        } else {
            d0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        k2 T;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        v0 v0Var = this.e;
        v0Var.c(str);
        String url = v0Var.getUrl();
        if (!vp.r1(d20.s0).K2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new r0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (v0Var.Q == null || (T = LaunchActivity.T()) == null) {
            return false;
        }
        if (T.getParentLayout() instanceof ActionBarLayout) {
            T = ((ActionBarLayout) T.getParentLayout()).getSheetFragment();
        }
        h4 createArticleViewer = T.createArticleViewer(true);
        if (createArticleViewer.u0 != null) {
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = createArticleViewer.u0;
                if (i10 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = l3VarArr[i10];
                if (l3Var != null) {
                    l3Var.f.setOpener(v0Var);
                }
                i10++;
            }
        }
        v0 v0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        l3 l3Var2 = createArticleViewer.u0[0];
        if (l3Var2 != null && l3Var2.f()) {
            if (createArticleViewer.u0[0].getWebView() == null) {
                createArticleViewer.u0[0].f.c();
            }
            v0Var2 = createArticleViewer.u0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            v0Var2.D = url;
        }
        v0Var.c("onCreateWindow: newWebView=" + v0Var2);
        if (v0Var2 == null) {
            createArticleViewer.m(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(v0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.x1 x1Var = this.a;
        v0 v0Var = this.e;
        if (x1Var == null) {
            v0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        v0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        v0 v0Var = this.e;
        z0 z0Var = v0Var.Q;
        int i10 = 0;
        if (z0Var == null || z0Var.W == null) {
            v0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        v0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String p5 = z10 ? h20.p(v0Var.Q.U) : org.telegram.messenger.i0.K0(v0Var.getUrl(), false);
        z0 z0Var2 = v0Var.Q;
        org.telegram.ui.ActionBar.x1 Y = s4.Y(z0Var2.W, z0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, cd.a0(null, null, z10 ? 2131752903 : 2131742932, p5), cd.a0(null, null, z10 ? 2131752902 : 2131742931, p5), new n0(this, callback, str, i10));
        this.a = Y;
        Y.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        z0 z0Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, z0Var == null ? null : z0Var.e);
        String l4 = this.c ? o5.l(d20.s0, this.d) : cd.a0(null, null, 2131742928, str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = l4;
        x1Var.T = str2;
        alertDialog$Builder.k(cd.L0(2131747847, null), new o0(zArr, jsResult, 2));
        x1Var.setOnDismissListener(new p0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        z0 z0Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.b, z0Var == null ? null : z0Var.e);
        String l4 = this.c ? o5.l(d20.s0, this.d) : cd.a0(null, null, 2131742928, str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = l4;
        x1Var.T = str2;
        alertDialog$Builder.h(cd.L0(2131752589, null), new o0(zArr, jsResult, i11));
        alertDialog$Builder.k(cd.L0(2131747847, null), new o0(zArr, jsResult, i10));
        x1Var.setOnDismissListener(new p0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        z0 z0Var = this.e.Q;
        p6 p6Var = z0Var == null ? null : z0Var.e;
        int i10 = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, p6Var);
        String l4 = this.c ? o5.l(d20.s0, this.d) : cd.a0(null, null, 2131742928, str);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        x1Var.R = l4;
        x1Var.T = str2;
        mt mtVar = new mt(context, p6Var);
        mtVar.r0 = true;
        mtVar.setTextSize(1, 18.0f);
        a7.V(mtVar, t6.j5, p6Var);
        a7.m(mtVar, 34, t6.Li, p6Var);
        mtVar.setFocusable(true);
        mtVar.setInputType(147457);
        a7.G(mtVar, t6.k6, t6.l6, t6.p7, p6Var);
        mtVar.setImeOptions(6);
        mtVar.setBackgroundDrawable(null);
        mtVar.setPadding(0, org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f));
        mtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mtVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        x1Var.a = org.telegram.messenger.i0.L(292.0f);
        alertDialog$Builder.h(cd.L0(2131752589, null), new k0(i10, zArr, jsPromptResult));
        alertDialog$Builder.k(cd.L0(2131747847, null), new androidx.car.app.utils.a(zArr, jsPromptResult, mtVar, 29));
        alertDialog$Builder.j(new mg.g(13, zArr, jsPromptResult));
        x1Var.O = new ag.l(mtVar, 26);
        mtVar.setOnEditorActionListener(new q0(zArr, jsPromptResult, mtVar, alertDialog$Builder.p(), 0));
        org.telegram.messenger.i0.g3(new w5(mtVar, 14));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.x1 x1Var = this.a;
        if (x1Var != null) {
            x1Var.dismiss();
            this.a = null;
        }
        v0 v0Var = this.e;
        if (v0Var.Q == null) {
            v0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        v0Var.c("onPermissionRequest " + permissionRequest);
        int i10 = 0;
        boolean z10 = this.c;
        String p5 = z10 ? h20.p(v0Var.Q.U) : org.telegram.messenger.i0.K0(v0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        z0 z0Var = v0Var.Q;
                        org.telegram.ui.ActionBar.x1 Y = s4.Y(z0Var.W, z0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, cd.a0(null, null, z10 ? 2131752908 : 2131742936, p5), cd.a0(null, null, z10 ? 2131752907 : 2131742935, p5), new m0(this, permissionRequest, resources, i10));
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
        z0 z0Var2 = v0Var.Q;
        if (z0Var2.W == null) {
            permissionRequest.deny();
            return;
        }
        if (z0Var2.r()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            z0 z0Var3 = v0Var.Q;
            org.telegram.ui.ActionBar.x1 Y2 = s4.Y(z0Var3.W, z0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, cd.a0(null, null, z10 ? 2131752906 : 2131742934, p5), cd.a0(null, null, z10 ? 2131752905 : 2131742933, p5), new l0(this, permissionRequest, str, i11));
            this.a = Y2;
            Y2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            z0 z0Var4 = v0Var.Q;
            org.telegram.ui.ActionBar.x1 Y3 = s4.Y(z0Var4.W, z0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, cd.a0(null, null, z10 ? 2131752901 : 2131742930, p5), cd.a0(null, null, z10 ? 2131752900 : 2131742929, p5), new l0(this, permissionRequest, str, i10));
            this.a = Y3;
            Y3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.x1 x1Var = this.a;
        v0 v0Var = this.e;
        if (x1Var == null) {
            v0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        v0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        v0 v0Var = this.e;
        z0 z0Var = v0Var.Q;
        if (z0Var == null || z0Var.x == null) {
            v0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        v0Var.c("onProgressChanged " + i10 + "%");
        v0Var.Q.x.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        v0 v0Var = this.e;
        HashMap hashMap = v0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        v0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(v0Var.getUrl(), v0Var.L) || v0Var.O == null || bitmap.getWidth() > v0Var.O.getWidth())) {
            v0Var.O = bitmap;
            v0Var.L = v0Var.getUrl();
            v0Var.M = true;
            v0.a(v0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(v0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(v0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        v0 v0Var = this.e;
        v0Var.c("onReceivedTitle title=" + str);
        if (!v0Var.h) {
            v0Var.J = true;
            v0Var.K = str;
        }
        z0 z0Var = v0Var.Q;
        if (z0Var != null) {
            z0Var.H();
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
        v0 v0Var = this.e;
        Activity W = org.telegram.messenger.i0.W(v0Var.getContext());
        if (W == null) {
            v0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        z0 z0Var = v0Var.Q;
        if (z0Var == null) {
            v0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = z0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        v0Var.Q.y = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        v0Var.c("onShowFileChooser: true");
        return true;
    }
}
