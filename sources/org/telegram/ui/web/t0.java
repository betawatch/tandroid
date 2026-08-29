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
import i7.f6;
import java.util.HashMap;
import nh.m6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.st;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fi1;
import org.telegram.ui.m4;
import org.telegram.ui.q3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class t0 extends WebChromeClient {
    public org.telegram.ui.ActionBar.c2 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ w0 e;

    public t0(w0 w0Var, Context context, boolean z10, long j10) {
        this.e = w0Var;
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
        f0 f0Var;
        w0 w0Var = this.e;
        w0Var.c("onCloseWindow " + webView);
        z0 z0Var = w0Var.M;
        if (z0Var == null || (f0Var = z0Var.c) == null) {
            Runnable runnable = w0Var.O;
            if (runnable != null) {
                runnable.run();
                w0Var.O = null;
            }
        } else {
            f0Var.y();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        o2 U;
        String str = "onCreateWindow isDialog=" + z10 + " isUserGesture=" + z11 + " resultMsg=" + message;
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
        if (w0Var.M == null || (U = LaunchActivity.U()) == null) {
            return false;
        }
        if (U.getParentLayout() instanceof ActionBarLayout) {
            U = ((ActionBarLayout) U.getParentLayout()).getSheetFragment();
        }
        m4 createArticleViewer = U.createArticleViewer(true);
        if (createArticleViewer.q0 != null) {
            int i10 = 0;
            while (true) {
                q3[] q3VarArr = createArticleViewer.q0;
                if (i10 >= q3VarArr.length) {
                    break;
                }
                q3 q3Var = q3VarArr[i10];
                if (q3Var != null) {
                    q3Var.f.setOpener(w0Var);
                }
                i10++;
            }
        }
        w0 w0Var2 = null;
        createArticleViewer.N(null, null, null, null);
        q3 q3Var2 = createArticleViewer.q0[0];
        if (q3Var2 != null && q3Var2.f()) {
            if (createArticleViewer.q0[0].getWebView() == null) {
                createArticleViewer.q0[0].f.c();
            }
            w0Var2 = createArticleViewer.q0[0].getWebView();
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
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        w0 w0Var = this.e;
        if (c2Var == null) {
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
        z0 z0Var = w0Var.M;
        int i10 = 0;
        if (z0Var == null || z0Var.S == null) {
            w0Var.c("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        w0Var.c("onGeolocationPermissionsShowPrompt " + str);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(w0Var.M.Q) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        z0 z0Var2 = w0Var.M;
        org.telegram.ui.ActionBar.c2 Z = c5.Z(z0Var2.S, z0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new o0(this, callback, str, i10));
        this.a = Z;
        Z.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        z0 z0Var = this.e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, z0Var == null ? null : z0Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, 2));
        c2Var.setOnDismissListener(new q0(zArr, jsResult, 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        int i10 = 1;
        int i11 = 0;
        boolean[] zArr = {false};
        z0 z0Var = this.e.M;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b, 0, z0Var == null ? null : z0Var.e);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new p0(zArr, jsResult, i11));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new p0(zArr, jsResult, i10));
        c2Var.setOnDismissListener(new q0(zArr, jsResult, 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        z0 z0Var = this.e.M;
        c6 c6Var = z0Var == null ? null : z0Var.e;
        int i10 = 1;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        String name = this.c ? DialogObject.getName(this.d) : LocaleController.formatString(R.string.WebsiteSays, str);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = name;
        c2Var.P = str2;
        st stVar = new st(context, c6Var);
        stVar.lineYFix = true;
        stVar.setTextSize(1, 18.0f);
        stVar.setTextColor(g6.v0(g6.j5, c6Var));
        stVar.setHintColor(g6.v0(g6.Xh, c6Var));
        stVar.setFocusable(true);
        stVar.setInputType(147457);
        stVar.setLineColors(g6.v0(g6.k6, c6Var), g6.v0(g6.l6, c6Var), g6.v0(g6.p7, c6Var));
        stVar.setImeOptions(6);
        stVar.setBackgroundDrawable(null);
        stVar.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        stVar.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(stVar, f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new fi1(zArr, jsPromptResult));
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.Components.voip.w1(zArr, jsPromptResult, stVar, i10));
        alertDialog$Builder.j(new eg.g(14, zArr, jsPromptResult));
        c2Var.K = new nh.b0(stVar, 9);
        stVar.setOnEditorActionListener(new r0(zArr, jsPromptResult, stVar, alertDialog$Builder.o()));
        AndroidUtilities.runOnUIThread(new m6(stVar, 25));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        if (c2Var != null) {
            c2Var.dismiss();
            this.a = null;
        }
        w0 w0Var = this.e;
        if (w0Var.M == null) {
            w0Var.c("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        w0Var.c("onPermissionRequest " + permissionRequest);
        boolean z10 = this.c;
        String userName = z10 ? UserObject.getUserName(w0Var.M.Q) : AndroidUtilities.getHostAuthority(w0Var.getUrl());
        String[] resources = permissionRequest.getResources();
        int i10 = 0;
        int i11 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        z0 z0Var = w0Var.M;
                        org.telegram.ui.ActionBar.c2 Z = c5.Z(z0Var.S, z0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new n0(this, permissionRequest, resources, i10));
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
        z0 z0Var2 = w0Var.M;
        if (z0Var2.S == null) {
            permissionRequest.deny();
            return;
        }
        if (z0Var2.p()) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            z0 z0Var3 = w0Var.M;
            org.telegram.ui.ActionBar.c2 Z2 = c5.Z(z0Var3.S, z0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new m0(this, permissionRequest, str, i11));
            this.a = Z2;
            Z2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            z0 z0Var4 = w0Var.M;
            org.telegram.ui.ActionBar.c2 Z3 = c5.Z(z0Var4.S, z0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(z10 ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new m0(this, permissionRequest, str, i10));
            this.a = Z3;
            Z3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        org.telegram.ui.ActionBar.c2 c2Var = this.a;
        w0 w0Var = this.e;
        if (c2Var == null) {
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
        z0 z0Var = w0Var.M;
        if (z0Var == null || z0Var.w == null) {
            w0Var.c("onProgressChanged " + i10 + "%: no container");
            return;
        }
        w0Var.c("onProgressChanged " + i10 + "%");
        w0Var.M.w.accept(Float.valueOf(((float) i10) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        w0 w0Var = this.e;
        HashMap hashMap = w0Var.L;
        StringBuilder sb2 = new StringBuilder("onReceivedIcon favicon=");
        if (bitmap == null) {
            str = BuildConfig.BETA_URL;
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        sb2.append(str);
        w0Var.c(sb2.toString());
        if (bitmap != null && (!TextUtils.equals(w0Var.getUrl(), w0Var.H) || w0Var.K == null || bitmap.getWidth() > w0Var.K.getWidth())) {
            w0Var.K = bitmap;
            w0Var.H = w0Var.getUrl();
            w0Var.I = true;
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
            w0Var.F = true;
            w0Var.G = str;
        }
        z0 z0Var = w0Var.M;
        if (z0Var != null) {
            z0Var.E();
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
        w0 w0Var = this.e;
        Activity findActivity = AndroidUtilities.findActivity(w0Var.getContext());
        if (findActivity == null) {
            w0Var.c("onShowFileChooser: no activity, false");
            return false;
        }
        z0 z0Var = w0Var.M;
        if (z0Var == null) {
            w0Var.c("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = z0Var.x;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        w0Var.M.x = valueCallback;
        boolean z10 = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z10) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        findActivity.startActivityForResult(createIntent, 3000);
        w0Var.c("onShowFileChooser: true");
        return true;
    }
}
