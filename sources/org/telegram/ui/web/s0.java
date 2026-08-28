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
import g7.e6;
import java.util.HashMap;
import kh.i9;
import mh.m2;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.y4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei1;
import org.telegram.ui.l4;
import org.telegram.ui.p3;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class s0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 a;
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
        e0 e0Var;
        v0 v0Var = this.e;
        v0Var.c("onCloseWindow " + webView);
        y0 y0Var = v0Var.M;
        if (y0Var == null || (e0Var = y0Var.c) == null) {
            Runnable runnable = v0Var.O;
            if (runnable != null) {
                runnable.run();
                v0Var.O = null;
            }
        } else {
            e0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        o2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
        v0 v0Var = this.e;
        v0Var.c(str);
        String url = v0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new r0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (v0Var.M == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        l4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.q0 != null) {
            int i9 = 0;
            while (true) {
                p3[] p3VarArr = createArticleViewer.q0;
                if (i9 >= p3VarArr.length) {
                    break;
                }
                p3 p3Var = p3VarArr[i9];
                if (p3Var != null) {
                    p3Var.f.setOpener(v0Var);
                }
                i9++;
            }
        }
        v0 v0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        p3 p3Var2 = createArticleViewer.q0[0];
        if (p3Var2 != null && p3Var2.f()) {
            if (createArticleViewer.q0[0].getWebView() == null) {
                createArticleViewer.q0[0].f.c();
            }
            v0Var2 = createArticleViewer.q0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            v0Var2.y = url;
        }
        v0Var.c("onCreateWindow: newWebView=" + v0Var2);
        if (v0Var2 == null) {
            createArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(v0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        v0 v0Var = this.e;
        if (c2Var == null) {
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
        y0 y0Var = v0Var.M;
        int i9 = 0;
        if (y0Var == null || y0Var.S == null) {
            v0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        v0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(v0Var.M.Q) : AndroidUtilities.getHostAuthority(v0Var.getUrl());
        y0 y0Var2 = v0Var.M;
        org.telegram.ui.ActionBar.c2 Z = y4.Z(y0Var2.S, y0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new n0(this, callback, str, i9));
        this.a = Z;
        Z.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        y0 y0Var = this.e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, y0Var == null ? null : y0Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new p0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i9 = 1;
        int i10 = 0;
        boolean[] zArr = {false};
        y0 y0Var = this.e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, y0Var == null ? null : y0Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new o0(zArr, jsResult, i10));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new o0(zArr, jsResult, i9));
        c2Var.setOnDismissListener(new p0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        y0 y0Var = this.e.M;
        b6 b6Var = y0Var == null ? null : y0Var.e;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        mt mtVar = new mt(context, b6Var);
        mtVar.lineYFix = true;
        mtVar.setTextSize(1, 18.0f);
        mtVar.setTextColor(f6.v0(f6.j5, b6Var));
        mtVar.setHintColor(f6.v0(f6.Xh, b6Var));
        mtVar.setFocusable(true);
        mtVar.setInputType(147457);
        mtVar.setLineColors(f6.v0(f6.k6, b6Var), f6.v0(f6.l6, b6Var), f6.v0(f6.p7, b6Var));
        mtVar.setImeOptions(6);
        mtVar.setBackgroundDrawable(null);
        mtVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        mtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(mtVar, e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new ei1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new hq0(zArr, jsPromptResult, mtVar, 3));
        alertDialog$Builder.j(new bg.j(17, zArr, jsPromptResult));
        c2Var.K = new i9(mtVar, 6);
        mtVar.setOnEditorActionListener(new q0(zArr, jsPromptResult, mtVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new m2(mtVar, 16));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.a = null;
        }
        v0 v0Var = this.e;
        if (v0Var.M == null) {
            v0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        v0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(v0Var.M.Q) : AndroidUtilities.getHostAuthority(v0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i9 = 0;
        int i10 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        y0 y0Var = v0Var.M;
                        org.telegram.ui.ActionBar.c2 Z = y4.Z(y0Var.S, y0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new m0(this, permissionRequest, resources, i9));
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
        y0 y0Var2 = v0Var.M;
        if (y0Var2.S == null) {
            permissionRequest.deny();
            return;
        }
        if (y0Var2.p()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            y0 y0Var3 = v0Var.M;
            org.telegram.ui.ActionBar.c2 Z2 = y4.Z(y0Var3.S, y0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new l0(this, permissionRequest, str, i10));
            this.a = Z2;
            Z2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            y0 y0Var4 = v0Var.M;
            org.telegram.ui.ActionBar.c2 Z3 = y4.Z(y0Var4.S, y0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new l0(this, permissionRequest, str, i9));
            this.a = Z3;
            Z3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        v0 v0Var = this.e;
        if (c2Var == null) {
            v0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        v0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i9) {
        v0 v0Var = this.e;
        y0 y0Var = v0Var.M;
        if (y0Var == null || y0Var.w == null) {
            v0Var.c("onProgressChanged " + i9 + "%: no container");
            return;
        }
        v0Var.c("onProgressChanged " + i9 + "%");
        v0Var.M.w.accept(Float.valueOf(((float) i9) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        v0 v0Var = this.e;
        HashMap hashMap = v0Var.L;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        v0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(v0Var.getUrl(), v0Var.H) || v0Var.K == null || bitmap.getWidth() > v0Var.K.getWidth())) {
            v0Var.K = bitmap;
            v0Var.H = v0Var.getUrl();
            v0Var.I = true;
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
            v0Var.F = true;
            v0Var.G = str;
        }
        y0 y0Var = v0Var.M;
        if (y0Var != null) {
            y0Var.E();
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
        Activity findActivity = AndroidUtilities.findActivity(v0Var.getContext());
        if (findActivity == null) {
            v0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        y0 y0Var = v0Var.M;
        if (y0Var == null) {
            v0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = y0Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        v0Var.M.x = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        v0Var.c("onShowFileChooser: true");
        return true;
    }
}
