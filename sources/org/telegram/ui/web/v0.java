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
import k7.b6;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n4;
import org.telegram.ui.r3;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class v0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ y0 e;

    public v0(y0 y0Var, Context context, boolean z4, long j10) {
        this.e = y0Var;
        this.b = context;
        this.c = z4;
        this.d = j10;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        g0 g0Var;
        y0 y0Var = this.e;
        y0Var.c("onCloseWindow " + webView);
        c1 c1Var = y0Var.N;
        if (c1Var == null || (g0Var = c1Var.c) == null) {
            Runnable runnable = y0Var.R;
            if (runnable != null) {
                runnable.run();
                y0Var.R = null;
            }
        } else {
            g0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        p2 U;
        String str = "onCreateWindow isDialog=" + z4 + " isUserGesture=" + z10 + " resultMsg=" + message;
        y0 y0Var = this.e;
        y0Var.c(str);
        String url = y0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new u0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (y0Var.N == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        n4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.r0 != null) {
            int i10 = 0;
            while (true) {
                r3[] r3VarArr = createArticleViewer.r0;
                if (i10 >= r3VarArr.length) {
                    break;
                }
                r3 r3Var = r3VarArr[i10];
                if (r3Var != null) {
                    r3Var.f.setOpener(y0Var);
                }
                i10++;
            }
        }
        y0 y0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        r3 r3Var2 = createArticleViewer.r0[0];
        if (r3Var2 != null && r3Var2.f()) {
            if (createArticleViewer.r0[0].getWebView() == null) {
                createArticleViewer.r0[0].f.c();
            }
            y0Var2 = createArticleViewer.r0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            y0Var2.y = url;
        }
        y0Var.c("onCreateWindow: newWebView=" + y0Var2);
        if (y0Var2 == null) {
            createArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(y0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        y0 y0Var = this.e;
        if (d2Var == null) {
            y0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        y0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        y0 y0Var = this.e;
        c1 c1Var = y0Var.N;
        int i10 = 0;
        if (c1Var == null || c1Var.T == null) {
            y0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        y0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z4 = this.c;
        String userName = z4 ? UserObject.getUserName(y0Var.N.R) : AndroidUtilities.getHostAuthority(y0Var.getUrl());
        c1 c1Var2 = y0Var.N;
        org.telegram.ui.ActionBar.d2 Z = z4.Z(c1Var2.T, c1Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z4 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new p0(this, callback, str, i10));
        this.a = Z;
        Z.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        c1 c1Var = this.e.N;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, c1Var == null ? null : c1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, 2));
        d2Var.setOnDismissListener(new s0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        c1 c1Var = this.e.N;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, c1Var == null ? null : c1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new r0(zArr, jsResult, i10));
        d2Var.setOnDismissListener(new s0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        c1 c1Var = this.e.N;
        f6 f6Var = c1Var == null ? null : c1Var.e;
        int i10 = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        ut utVar = new ut(context, f6Var);
        utVar.lineYFix = true;
        utVar.setTextSize(1, 18.0f);
        utVar.setTextColor(j6.v0(j6.j5, f6Var));
        utVar.setHintColor(j6.v0(j6.Xh, f6Var));
        utVar.setFocusable(true);
        utVar.setInputType(147457);
        utVar.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        utVar.setImeOptions(6);
        utVar.setBackgroundDrawable(null);
        utVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        utVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(utVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m(2, zArr, jsPromptResult));
        int i11 = 29;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(zArr, jsPromptResult, utVar, i11));
        alertDialog$Builder.j(new gg.g(13, zArr, jsPromptResult));
        d2Var.L = new cg.h0(utVar, i11);
        utVar.setOnEditorActionListener(new t0(zArr, jsPromptResult, utVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new q0(utVar, i10));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var != null) {
            d2Var.dismiss();
            this.a = null;
        }
        y0 y0Var = this.e;
        if (y0Var.N == null) {
            y0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        y0Var.c("onPermissionRequest " + permissionRequest);
        boolean z4 = this.c;
        String userName = z4 ? UserObject.getUserName(y0Var.N.R) : AndroidUtilities.getHostAuthority(y0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        c1 c1Var = y0Var.N;
                        org.telegram.ui.ActionBar.d2 Z = z4.Z(c1Var.T, c1Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new o0(this, permissionRequest, resources, i10));
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
        c1 c1Var2 = y0Var.N;
        if (c1Var2.T == null) {
            permissionRequest.deny();
            return;
        }
        if (c1Var2.s()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            c1 c1Var3 = y0Var.N;
            org.telegram.ui.ActionBar.d2 Z2 = z4.Z(c1Var3.T, c1Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new n0(this, permissionRequest, str, i11));
            this.a = Z2;
            Z2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            c1 c1Var4 = y0Var.N;
            org.telegram.ui.ActionBar.d2 Z3 = z4.Z(c1Var4.T, c1Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z4 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new n0(this, permissionRequest, str, i10));
            this.a = Z3;
            Z3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        y0 y0Var = this.e;
        if (d2Var == null) {
            y0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        y0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        y0 y0Var = this.e;
        c1 c1Var = y0Var.N;
        if (c1Var == null || c1Var.w == null) {
            y0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        y0Var.c("onProgressChanged " + i10 + "%");
        y0Var.N.w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        y0 y0Var = this.e;
        HashMap hashMap = y0Var.M;
        StringBuilder sb = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb.append(str);
        y0Var.c(sb.toString());
        if (bitmap != null && (!TextUtils.equals(y0Var.getUrl(), y0Var.I) || y0Var.L == null || bitmap.getWidth() > y0Var.L.getWidth())) {
            y0Var.L = bitmap;
            y0Var.I = y0Var.getUrl();
            y0Var.J = true;
            y0.a(y0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(y0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(y0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        y0 y0Var = this.e;
        y0Var.c("onReceivedTitle title=" + str);
        if (!y0Var.h) {
            y0Var.G = true;
            y0Var.H = str;
        }
        c1 c1Var = y0Var.N;
        if (c1Var != null) {
            c1Var.I();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z4) {
        this.e.c("onReceivedTouchIconUrl url=" + str + " precomposed=" + z4);
        super.onReceivedTouchIconUrl(webView, str, z4);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        y0 y0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(y0Var.getContext());
        if (findActivity == null) {
            y0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        c1 c1Var = y0Var.N;
        if (c1Var == null) {
            y0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = c1Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        y0Var.N.x = valueCallback;
        boolean z4 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z4) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        y0Var.c("onShowFileChooser: true");
        return true;
    }
}
