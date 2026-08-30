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
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.z4;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l4;
import org.telegram.ui.p3;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class t0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.d2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ w0 e;

    public t0(w0 w0Var, Context context, boolean z4, long j10) {
        this.e = w0Var;
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
        e0 e0Var;
        w0 w0Var = this.e;
        w0Var.c("onCloseWindow " + webView);
        a1 a1Var = w0Var.N;
        if (a1Var == null || (e0Var = a1Var.c) == null) {
            Runnable runnable = w0Var.P;
            if (runnable != null) {
                runnable.run();
                w0Var.P = null;
            }
        } else {
            e0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z10, Message message) {
        p2 U;
        String str = "onCreateWindow isDialog=" + z4 + " isUserGesture=" + z10 + " resultMsg=" + message;
        w0 w0Var = this.e;
        w0Var.c(str);
        String url = w0Var.getUrl();
        if (!MessagesController.getInstance(UserConfig.selectedAccount).isWebBrowserInAppEnabled()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new s0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (w0Var.N == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        l4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.r0 != null) {
            int i10 = 0;
            while (true) {
                p3[] p3VarArr = createArticleViewer.r0;
                if (i10 >= p3VarArr.length) {
                    break;
                }
                p3 p3Var = p3VarArr[i10];
                if (p3Var != null) {
                    p3Var.f.setOpener(w0Var);
                }
                i10++;
            }
        }
        w0 w0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        p3 p3Var2 = createArticleViewer.r0[0];
        if (p3Var2 != null && p3Var2.f()) {
            if (createArticleViewer.r0[0].getWebView() == null) {
                createArticleViewer.r0[0].f.c();
            }
            w0Var2 = createArticleViewer.r0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            w0Var2.y = url;
        }
        w0Var.c("onCreateWindow: newWebView=" + w0Var2);
        if (w0Var2 == null) {
            createArticleViewer.o(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(w0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        w0 w0Var = this.e;
        if (d2Var == null) {
            w0Var.c("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        w0Var.c("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        w0 w0Var = this.e;
        a1 a1Var = w0Var.N;
        int i10 = 0;
        if (a1Var == null || a1Var.T == null) {
            w0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        w0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z4 = this.c;
        String userName = z4 ? UserObject.getUserName(w0Var.N.R) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        a1 a1Var2 = w0Var.N;
        org.telegram.ui.ActionBar.d2 Z = z4.Z(a1Var2.T, a1Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z4 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new n0(this, callback, str, i10));
        this.a = Z;
        Z.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        a1 a1Var = this.e.N;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, a1Var == null ? null : a1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 2));
        d2Var.setOnDismissListener(new q0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        a1 a1Var = this.e.N;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, a1Var == null ? null : a1Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, i10));
        d2Var.setOnDismissListener(new q0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        a1 a1Var = this.e.N;
        f6 f6Var = a1Var == null ? null : a1Var.e;
        int i10 = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.a;
        d2Var.O = name;
        d2Var.Q = str2;
        vt vtVar = new vt(context, f6Var);
        vtVar.lineYFix = true;
        vtVar.setTextSize(1, 18.0f);
        vtVar.setTextColor(j6.v0(j6.j5, f6Var));
        vtVar.setHintColor(j6.v0(j6.Xh, f6Var));
        vtVar.setFocusable(true);
        vtVar.setInputType(147457);
        vtVar.setLineColors(j6.v0(j6.k6, f6Var), j6.v0(j6.l6, f6Var), j6.v0(j6.p7, f6Var));
        vtVar.setImeOptions(6);
        vtVar.setBackgroundDrawable(null);
        vtVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        vtVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(vtVar, b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new m(2, zArr, jsPromptResult));
        int i11 = 29;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new androidx.car.app.utils.a(zArr, jsPromptResult, vtVar, i11));
        alertDialog$Builder.j(new gg.g(14, zArr, jsPromptResult));
        d2Var.L = new cg.h0(vtVar, i11);
        vtVar.setOnEditorActionListener(new r0(zArr, jsPromptResult, vtVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new o0(vtVar, i10));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        if (d2Var != null) {
            d2Var.dismiss();
            this.a = null;
        }
        w0 w0Var = this.e;
        if (w0Var.N == null) {
            w0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        w0Var.c("onPermissionRequest " + permissionRequest);
        boolean z4 = this.c;
        String userName = z4 ? UserObject.getUserName(w0Var.N.R) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        a1 a1Var = w0Var.N;
                        org.telegram.ui.ActionBar.d2 Z = z4.Z(a1Var.T, a1Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new m0(this, permissionRequest, resources, i10));
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
        a1 a1Var2 = w0Var.N;
        if (a1Var2.T == null) {
            permissionRequest.deny();
            return;
        }
        if (a1Var2.p()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            a1 a1Var3 = w0Var.N;
            org.telegram.ui.ActionBar.d2 Z2 = z4.Z(a1Var3.T, a1Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new l0(this, permissionRequest, str, i11));
            this.a = Z2;
            Z2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            a1 a1Var4 = w0Var.N;
            org.telegram.ui.ActionBar.d2 Z3 = z4.Z(a1Var4.T, a1Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z4 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z4 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new l0(this, permissionRequest, str, i10));
            this.a = Z3;
            Z3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.d2 d2Var = this.a;
        w0 w0Var = this.e;
        if (d2Var == null) {
            w0Var.c("onPermissionRequestCanceled: no dialog");
            return;
        }
        w0Var.c("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i10) {
        w0 w0Var = this.e;
        a1 a1Var = w0Var.N;
        if (a1Var == null || a1Var.w == null) {
            w0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        w0Var.c("onProgressChanged " + i10 + "%");
        w0Var.N.w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        w0 w0Var = this.e;
        HashMap hashMap = w0Var.M;
        StringBuilder sb = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb.append(str);
        w0Var.c(sb.toString());
        if (bitmap != null && (!TextUtils.equals(w0Var.getUrl(), w0Var.I) || w0Var.L == null || bitmap.getWidth() > w0Var.L.getWidth())) {
            w0Var.L = bitmap;
            w0Var.I = w0Var.getUrl();
            w0Var.J = true;
            w0.a(w0Var);
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(w0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(w0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        w0 w0Var = this.e;
        w0Var.c("onReceivedTitle title=" + str);
        if (!w0Var.h) {
            w0Var.G = true;
            w0Var.H = str;
        }
        a1 a1Var = w0Var.N;
        if (a1Var != null) {
            a1Var.E();
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
        w0 w0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(w0Var.getContext());
        if (findActivity == null) {
            w0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        a1 a1Var = w0Var.N;
        if (a1Var == null) {
            w0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = a1Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        w0Var.N.x = valueCallback;
        boolean z4 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z4) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        w0Var.c("onShowFileChooser: true");
        return true;
    }
}
