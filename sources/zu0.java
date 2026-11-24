// default package

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
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zu0 extends WebChromeClient {
    public hd a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ cv0 e;

    public zu0(cv0 cv0Var, Context context, boolean z, long j) {
        this.e = cv0Var;
        this.b = context;
        this.c = z;
        this.d = j;
    }

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
    }

    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        ku0 ku0Var;
        cv0 cv0Var = this.e;
        cv0Var.b("onCloseWindow " + webView);
        hv0 hv0Var = cv0Var.R;
        if (hv0Var == null || (ku0Var = hv0Var.c) == null) {
            Runnable runnable = cv0Var.V;
            if (runnable != null) {
                runnable.run();
                cv0Var.V = null;
            }
        } else {
            ku0Var.z();
        }
        super.onCloseWindow(webView);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        d S;
        String str = "onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message;
        cv0 cv0Var = this.e;
        cv0Var.b(str);
        String url = cv0Var.getUrl();
        if (!na7.q1(y6c.t0).L2()) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebViewClient(new yu0(this, webView2));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
        if (cv0Var.R == null || (S = LaunchActivity.S()) == null) {
            return false;
        }
        if (S.getParentLayout() instanceof ActionBarLayout) {
            S = ((ActionBarLayout) S.getParentLayout()).getSheetFragment();
        }
        o createArticleViewer = S.createArticleViewer(true);
        if (createArticleViewer.v0 != null) {
            int i = 0;
            while (true) {
                m[] mVarArr = createArticleViewer.v0;
                if (i >= mVarArr.length) {
                    break;
                }
                m mVar = mVarArr[i];
                if (mVar != null) {
                    mVar.f.setOpener(cv0Var);
                }
                i++;
            }
        }
        cv0 cv0Var2 = null;
        createArticleViewer.L(null, null, null, null);
        m mVar2 = createArticleViewer.v0[0];
        if (mVar2 != null && mVar2.e()) {
            if (createArticleViewer.v0[0].getWebView() == null) {
                createArticleViewer.v0[0].f.a();
            }
            cv0Var2 = createArticleViewer.v0[0].getWebView();
        }
        if (!TextUtils.isEmpty(url)) {
            cv0Var2.E = url;
        }
        cv0Var.b("onCreateWindow: newWebView=" + cv0Var2);
        if (cv0Var2 == null) {
            createArticleViewer.l(true, true);
            return false;
        }
        ((WebView.WebViewTransport) message.obj).setWebView(cv0Var2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsHidePrompt() {
        hd hdVar = this.a;
        cv0 cv0Var = this.e;
        if (hdVar == null) {
            cv0Var.b("onGeolocationPermissionsHidePrompt: no dialog");
            return;
        }
        cv0Var.b("onGeolocationPermissionsHidePrompt: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        cv0 cv0Var = this.e;
        hv0 hv0Var = cv0Var.R;
        byte b = 0;
        if (hv0Var == null || hv0Var.a0 == null) {
            cv0Var.b("onGeolocationPermissionsShowPrompt: no container");
            callback.invoke(str, false, false);
            return;
        }
        cv0Var.b("onGeolocationPermissionsShowPrompt " + str);
        boolean z = this.c;
        String q = z ? l7c.q(cv0Var.R.V) : gl.J0(cv0Var.getUrl(), false);
        hv0 hv0Var2 = cv0Var.R;
        hd W = ij.W(hv0Var2.a0, hv0Var2.e, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, k96.a0(null, null, z ? 2131752891 : 2131742643, q), k96.a0(null, null, z ? 2131752890 : 2131742642, q), new tu0(this, callback, str, b));
        this.a = W;
        W.show();
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        boolean[] zArr = {false};
        hv0 hv0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hv0Var == null ? null : hv0Var.e, this.b);
        String k = this.c ? cf3.k(y6c.t0, this.d) : k96.a0(null, null, 2131742639, str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = k;
        hdVar.U = str2;
        alertDialog$Builder.j(k96.M0(2131747638, null), new vu0(zArr, jsResult, (byte) 2));
        hdVar.setOnDismissListener(new wu0(zArr, jsResult, (byte) 1));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        byte b = 1;
        byte b2 = 0;
        boolean[] zArr = {false};
        hv0 hv0Var = this.e.R;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, hv0Var == null ? null : hv0Var.e, this.b);
        String k = this.c ? cf3.k(y6c.t0, this.d) : k96.a0(null, null, 2131742639, str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = k;
        hdVar.U = str2;
        alertDialog$Builder.g(k96.M0(2131752577, null), new vu0(zArr, jsResult, b2));
        alertDialog$Builder.j(k96.M0(2131747638, null), new vu0(zArr, jsResult, b));
        hdVar.setOnDismissListener(new wu0(zArr, jsResult, (byte) 0));
        alertDialog$Builder.o();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        hv0 hv0Var = this.e.R;
        wjb wjbVar = hv0Var == null ? null : hv0Var.e;
        byte b = 0;
        boolean[] zArr = {false};
        Context context = this.b;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        String k = this.c ? cf3.k(y6c.t0, this.d) : k96.a0(null, null, 2131742639, str);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = k;
        hdVar.U = str2;
        gt3 gt3Var = new gt3(context, wjbVar);
        gt3Var.s0 = true;
        gt3Var.setTextSize(1, 18.0f);
        zkb.X(gt3Var, bkb.i5, wjbVar);
        zkb.l(gt3Var, 34, bkb.Ni, wjbVar);
        gt3Var.setFocusable(true);
        gt3Var.setInputType(147457);
        zkb.F(gt3Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        gt3Var.setImeOptions(6);
        gt3Var.setBackgroundDrawable(null);
        gt3Var.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        gt3Var.setText(str3);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(gt3Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        hdVar.a = gl.L(292.0f);
        alertDialog$Builder.g(k96.M0(2131752577, null), new o(zArr, jsPromptResult, (byte) 25));
        alertDialog$Builder.j(k96.M0(2131747638, null), new ie(zArr, (Object) jsPromptResult, (Object) gt3Var, (byte) 6));
        alertDialog$Builder.i(new cf(zArr, jsPromptResult, (byte) 8));
        hdVar.P = new uu0(gt3Var, b);
        gt3Var.setOnEditorActionListener(new xu0(zArr, jsPromptResult, gt3Var, alertDialog$Builder.o(), (byte) 0));
        gl.d3(new oz(gt3Var, (byte) 28));
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        hd hdVar = this.a;
        if (hdVar != null) {
            hdVar.dismiss();
            this.a = null;
        }
        cv0 cv0Var = this.e;
        if (cv0Var.R == null) {
            cv0Var.b("onPermissionRequest: no container");
            permissionRequest.deny();
            return;
        }
        cv0Var.b("onPermissionRequest " + permissionRequest);
        byte b = 0;
        boolean z = this.c;
        String q = z ? l7c.q(cv0Var.R.V) : gl.J0(cv0Var.getUrl(), false);
        String[] resources = permissionRequest.getResources();
        byte b2 = 1;
        if (resources.length != 1) {
            if (resources.length == 2) {
                if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                        hv0 hv0Var = cv0Var.R;
                        hd W = ij.W(hv0Var.a0, hv0Var.e, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, k96.a0(null, null, z ? 2131752896 : 2131742647, q), k96.a0(null, null, z ? 2131752895 : 2131742646, q), new su0(this, permissionRequest, resources, b));
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
        hv0 hv0Var2 = cv0Var.R;
        if (hv0Var2.a0 == null) {
            permissionRequest.deny();
            return;
        }
        if (hv0Var2.Q0 != null) {
            permissionRequest.grant(resources);
            return;
        }
        str.getClass();
        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
            hv0 hv0Var3 = cv0Var.R;
            hd W2 = ij.W(hv0Var3.a0, hv0Var3.e, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, k96.a0(null, null, z ? 2131752894 : 2131742645, q), k96.a0(null, null, z ? 2131752893 : 2131742644, q), new ru0(this, permissionRequest, str, b2));
            this.a = W2;
            W2.show();
            return;
        }
        if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
            hv0 hv0Var4 = cv0Var.R;
            hd W3 = ij.W(hv0Var4.a0, hv0Var4.e, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, k96.a0(null, null, z ? 2131752889 : 2131742641, q), k96.a0(null, null, z ? 2131752888 : 2131742640, q), new ru0(this, permissionRequest, str, b));
            this.a = W3;
            W3.show();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        hd hdVar = this.a;
        cv0 cv0Var = this.e;
        if (hdVar == null) {
            cv0Var.b("onPermissionRequestCanceled: no dialog");
            return;
        }
        cv0Var.b("onPermissionRequestCanceled: dialog.dismiss");
        this.a.dismiss();
        this.a = null;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        cv0 cv0Var = this.e;
        hv0 hv0Var = cv0Var.R;
        if (hv0Var == null || hv0Var.x == null) {
            cv0Var.b("onProgressChanged " + i + "%: no container");
            return;
        }
        cv0Var.b("onProgressChanged " + i + "%");
        cv0Var.R.x.accept(Float.valueOf(((float) i) / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView webView, Bitmap bitmap) {
        String str;
        cv0 cv0Var = this.e;
        HashMap hashMap = cv0Var.Q;
        if (bitmap == null) {
            str = "null";
        } else {
            str = bitmap.getWidth() + "x" + bitmap.getHeight();
        }
        cv0Var.b("onReceivedIcon favicon=".concat(str));
        if (bitmap != null && (!TextUtils.equals(cv0Var.getUrl(), cv0Var.M) || cv0Var.P == null || bitmap.getWidth() > cv0Var.P.getWidth())) {
            cv0Var.P = bitmap;
            cv0Var.M = cv0Var.getUrl();
            cv0Var.N = true;
            cv0Var.e();
        }
        Bitmap bitmap2 = (Bitmap) hashMap.get(cv0Var.getUrl());
        if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
            hashMap.put(cv0Var.getUrl(), bitmap);
        }
        super.onReceivedIcon(webView, bitmap);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        cv0 cv0Var = this.e;
        cv0Var.b("onReceivedTitle title=" + str);
        if (!cv0Var.h) {
            cv0Var.K = true;
            cv0Var.L = str;
        }
        hv0 hv0Var = cv0Var.R;
        if (hv0Var != null) {
            hv0Var.F();
        }
        super.onReceivedTitle(webView, str);
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.e.b("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
        super.onReceivedTouchIconUrl(webView, str, z);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        cv0 cv0Var = this.e;
        Activity W = gl.W(cv0Var.getContext());
        if (W == null) {
            cv0Var.b("onShowFileChooser: no activity, false");
            return false;
        }
        hv0 hv0Var = cv0Var.R;
        if (hv0Var == null) {
            cv0Var.b("onShowFileChooser: no container, false");
            return false;
        }
        ValueCallback valueCallback2 = hv0Var.y;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue(null);
        }
        cv0Var.R.y = valueCallback;
        boolean z = fileChooserParams.getMode() == 1;
        Intent createIntent = fileChooserParams.createIntent();
        if (z) {
            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        W.startActivityForResult(createIntent, 3000);
        cv0Var.b("onShowFileChooser: true");
        return true;
    }
}
