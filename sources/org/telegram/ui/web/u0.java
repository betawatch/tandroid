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
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.qy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bh1;
import org.telegram.ui.j4;
import org.telegram.ui.m3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class u0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.e2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ x0 e;

    public u0(x0 x0Var, Context context, boolean z10, long j10) {
        this.e = x0Var;
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
        g0 g0Var;
        x0 x0Var = this.e;
        x0Var.c("onCloseWindow " + webView);
        a1 a1Var = x0Var.Q;
        if (a1Var == null || (g0Var = a1Var.c) == null) {
            Runnable runnable = x0Var.U;
            if (runnable != null) {
                runnable.run();
                x0Var.U = null;
            }
        } else {
            g0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        r2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        x0 x0Var = this.e;
        x0Var.c(str);
        String url = x0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new t0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (x0Var.Q == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        j4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.u0 != null) {
            int i10 = 0;
            while (true) {
                m3[] m3VarArr = createArticleViewer.u0;
                if (i10 >= m3VarArr.length) {
                    break;
                }
                m3 m3Var = m3VarArr[i10];
                if (m3Var != null) {
                    m3Var.f.setOpener(x0Var);
                }
                i10++;
            }
        }
        x0 x0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        m3 m3Var2 = createArticleViewer.u0[0];
        if (m3Var2 != null && m3Var2.f()) {
            if (createArticleViewer.u0[0].getWebView() == null) {
                createArticleViewer.u0[0].f.c();
            }
            x0Var2 = createArticleViewer.u0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            x0Var2.y = url;
        }
        x0Var.c("onCreateWindow: newWebView=" + x0Var2);
        if (x0Var2 == null) {
            createArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(x0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        x0 x0Var = this.e;
        if (e2Var == null) {
            x0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        x0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        x0 x0Var = this.e;
        a1 a1Var = x0Var.Q;
        int i10 = 0;
        if (a1Var == null || a1Var.W == null) {
            x0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        x0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(x0Var.Q.U) : AndroidUtilities.getHostAuthority(x0Var.getUrl());
        a1 a1Var2 = x0Var.Q;
        org.telegram.ui.ActionBar.e2 Y = g5.Y(a1Var2.W, a1Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new p0(this, callback, str, i10));
        this.a = Y;
        Y.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        a1 a1Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, a1Var == null ? null : a1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = name;
        e2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q0(zArr, jsResult, 2));
        e2Var.setOnDismissListener(new r0(zArr, jsResult, 1));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        a1 a1Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, a1Var == null ? null : a1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = name;
        e2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new q0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new q0(zArr, jsResult, i10));
        e2Var.setOnDismissListener(new r0(zArr, jsResult, 0));
        alertDialog$Builder.p();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        a1 a1Var = this.e.Q;
        u6 u6Var = a1Var == null ? null : a1Var.e;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.a;
        e2Var.R = name;
        e2Var.T = str2;
        ju juVar = new ju(context, u6Var);
        juVar.lineYFix = true;
        juVar.setTextSize(1, 18.0f);
        f7.V(juVar, y6.j5, u6Var);
        f7.m(juVar, 34, y6.Xh, u6Var);
        juVar.setFocusable(true);
        juVar.setInputType(147457);
        f7.G(juVar, y6.k6, y6.l6, y6.p7, u6Var);
        juVar.setImeOptions(6);
        juVar.setBackgroundDrawable(null);
        juVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        juVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(juVar, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.o(linearLayout);
        e2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new bh1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qy(zArr, jsPromptResult, juVar, 6));
        alertDialog$Builder.j(new u3(17, zArr, jsPromptResult));
        e2Var.O = new ig.o(juVar, 12);
        juVar.setOnEditorActionListener(new s0(zArr, jsPromptResult, juVar, alertDialog$Builder.p()));
        AndroidUtilities.runOnUIThread(new k2.c(juVar, 27));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        if (e2Var != null) {
            e2Var.dismiss();
            this.a = null;
        }
        x0 x0Var = this.e;
        if (x0Var.Q == null) {
            x0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        x0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(x0Var.Q.U) : AndroidUtilities.getHostAuthority(x0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        a1 a1Var = x0Var.Q;
                        org.telegram.ui.ActionBar.e2 Y = g5.Y(a1Var.W, a1Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new o0(this, permissionRequest, resources, i10));
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
        a1 a1Var2 = x0Var.Q;
        if (a1Var2.W == null) {
            permissionRequest.deny();
            return;
        }
        if (a1Var2.r()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            a1 a1Var3 = x0Var.Q;
            org.telegram.ui.ActionBar.e2 Y2 = g5.Y(a1Var3.W, a1Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new n0(this, permissionRequest, str, i11));
            this.a = Y2;
            Y2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            a1 a1Var4 = x0Var.Q;
            org.telegram.ui.ActionBar.e2 Y3 = g5.Y(a1Var4.W, a1Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new n0(this, permissionRequest, str, i10));
            this.a = Y3;
            Y3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.e2 e2Var = this.a;
        x0 x0Var = this.e;
        if (e2Var == null) {
            x0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        x0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        x0 x0Var = this.e;
        a1 a1Var = x0Var.Q;
        if (a1Var == null || a1Var.w == null) {
            x0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        x0Var.c("onProgressChanged " + i10 + "%");
        x0Var.Q.w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        x0 x0Var = this.e;
        HashMap hashMap = x0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        x0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(x0Var.getUrl(), x0Var.L) || x0Var.O == null || bitmap.getWidth() > x0Var.O.getWidth())) {
            x0Var.O = bitmap;
            x0Var.L = x0Var.getUrl();
            x0Var.M = true;
            x0.a(x0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(x0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(x0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        x0 x0Var = this.e;
        x0Var.c("onReceivedTitle title=" + str);
        if (!x0Var.h) {
            x0Var.J = true;
            x0Var.K = str;
        }
        a1 a1Var = x0Var.Q;
        if (a1Var != null) {
            a1Var.H();
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
        x0 x0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(x0Var.getContext());
        if (findActivity == null) {
            x0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        a1 a1Var = x0Var.Q;
        if (a1Var == null) {
            x0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = a1Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        x0Var.Q.x = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        x0Var.c("onShowFileChooser: true");
        return true;
    }
}
