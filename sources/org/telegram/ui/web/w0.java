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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.s50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h4;
import org.telegram.ui.l3;
import org.telegram.ui.tv0;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class w0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ z0 e;

    public w0(z0 z0Var, Context context, boolean z10, long j3) {
        this.e = z0Var;
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
        h0 h0Var;
        z0 z0Var = this.e;
        z0Var.c("onCloseWindow " + webView);
        d1 d1Var = z0Var.Q;
        if (d1Var == null || (h0Var = d1Var.c) == null) {
            Runnable runnable = z0Var.U;
            if (runnable != null) {
                runnable.run();
                z0Var.U = null;
            }
        } else {
            h0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        o2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        z0 z0Var = this.e;
        z0Var.c(str);
        String url = z0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new v0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (z0Var.Q == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        h4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.u0 != null) {
            int i10 = 0;
            while (true) {
                l3[] l3VarArr = createArticleViewer.u0;
                if (i10 >= l3VarArr.length) {
                    break;
                }
                l3 l3Var = l3VarArr[i10];
                if (l3Var != null) {
                    l3Var.f.setOpener(z0Var);
                }
                i10++;
            }
        }
        z0 z0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        l3 l3Var2 = createArticleViewer.u0[0];
        if (l3Var2 != null && l3Var2.f()) {
            if (createArticleViewer.u0[0].getWebView() == null) {
                createArticleViewer.u0[0].f.c();
            }
            z0Var2 = createArticleViewer.u0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            z0Var2.y = url;
        }
        z0Var.c("onCreateWindow: newWebView=" + z0Var2);
        if (z0Var2 == null) {
            createArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(z0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        z0 z0Var = this.e;
        if (c2Var == null) {
            z0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        z0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        z0 z0Var = this.e;
        d1 d1Var = z0Var.Q;
        int i10 = 0;
        if (d1Var == null || d1Var.W == null) {
            z0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        z0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(z0Var.Q.U) : AndroidUtilities.getHostAuthority(z0Var.getUrl());
        d1 d1Var2 = z0Var.Q;
        org.telegram.ui.ActionBar.c2 Z = c5.Z(d1Var2.W, d1Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new q0(this, callback, str, i10));
        this.a = Z;
        Z.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        d1 d1Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, d1Var == null ? null : d1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = name;
        c2Var.T = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new s0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        d1 d1Var = this.e.Q;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, d1Var == null ? null : d1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = name;
        c2Var.T = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, i10));
        c2Var.setOnDismissListener(new s0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        d1 d1Var = this.e.Q;
        f6 f6Var = d1Var == null ? null : d1Var.e;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.R = name;
        c2Var.T = str2;
        bu buVar = new bu(context, f6Var);
        buVar.lineYFix = true;
        buVar.setTextSize(1, 18.0f);
        buVar.setTextColor(j6.v0(j6.j5, f6Var));
        buVar.setHintColor(j6.v0(j6.Xh, f6Var));
        buVar.setFocusable(true);
        buVar.setInputType(147457);
        buVar.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        buVar.setImeOptions(6);
        buVar.setBackgroundDrawable(null);
        buVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        buVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(buVar, x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new tv0(23, zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new s50(zArr, jsPromptResult, buVar, 4));
        alertDialog$Builder.j(new ei.e0(14, zArr, jsPromptResult));
        int i10 = 29;
        c2Var.O = new ai.y1(buVar, i10);
        buVar.setOnEditorActionListener(new t0(zArr, jsPromptResult, buVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new i2.g0(buVar, i10));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.a = null;
        }
        z0 z0Var = this.e;
        if (z0Var.Q == null) {
            z0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        z0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(z0Var.Q.U) : AndroidUtilities.getHostAuthority(z0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        d1 d1Var = z0Var.Q;
                        org.telegram.ui.ActionBar.c2 Z = c5.Z(d1Var.W, d1Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new p0(this, permissionRequest, resources, i10));
                        this.a = Z;
                        Z.show();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str = resources[0];
        d1 d1Var2 = z0Var.Q;
        if (d1Var2.W == null) {
            permissionRequest.deny();
            return;
        }
        if (d1Var2.s()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            d1 d1Var3 = z0Var.Q;
            org.telegram.ui.ActionBar.c2 Z2 = c5.Z(d1Var3.W, d1Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new o0(this, permissionRequest, str, i11));
            this.a = Z2;
            Z2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            d1 d1Var4 = z0Var.Q;
            org.telegram.ui.ActionBar.c2 Z3 = c5.Z(d1Var4.W, d1Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new o0(this, permissionRequest, str, i10));
            this.a = Z3;
            Z3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        z0 z0Var = this.e;
        if (c2Var == null) {
            z0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        z0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        z0 z0Var = this.e;
        d1 d1Var = z0Var.Q;
        if (d1Var == null || d1Var.w == null) {
            z0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        z0Var.c("onProgressChanged " + i10 + "%");
        z0Var.Q.w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        z0 z0Var = this.e;
        HashMap hashMap = z0Var.P;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        z0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(z0Var.getUrl(), z0Var.L) || z0Var.O == null || bitmap.getWidth() > z0Var.O.getWidth())) {
            z0Var.O = bitmap;
            z0Var.L = z0Var.getUrl();
            z0Var.M = true;
            z0.a(z0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(z0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(z0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        z0 z0Var = this.e;
        z0Var.c("onReceivedTitle title=" + str);
        if (!z0Var.h) {
            z0Var.J = true;
            z0Var.K = str;
        }
        d1 d1Var = z0Var.Q;
        if (d1Var != null) {
            d1Var.I();
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
        z0 z0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(z0Var.getContext());
        if (findActivity == null) {
            z0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        d1 d1Var = z0Var.Q;
        if (d1Var == null) {
            z0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = d1Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        z0Var.Q.x = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        z0Var.c("onShowFileChooser: true");
        return true;
    }
}
