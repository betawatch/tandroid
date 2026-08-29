package org.telegram.ui.web;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.webkit.WebView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = str;
        this.d = serializable;
        this.f = str2;
        this.c = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1 A[LOOP:0: B:60:0x00f1->B:94:0x017e, LOOP_START, PHI: r2 r4
      0x00f1: PHI (r2v8 java.io.File) = (r2v0 java.io.File), (r2v9 java.io.File) binds: [B:59:0x00ef, B:94:0x017e] A[DONT_GENERATE, DONT_INLINE]
      0x00f1: PHI (r4v2 int) = (r4v0 int), (r4v3 int) binds: [B:59:0x00ef, B:94:0x017e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018c  */
    /* JADX WARN: Type inference failed for: r0v45, types: [org.json.JSONObject] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        JSONObject jSONObject;
        LaunchActivity launchActivity;
        int i10 = this.a;
        File file = null;
        int i11 = 0;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (i10) {
            case 0:
                z0 z0Var = (z0) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    z0Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    z0Var.C(str4, "failed", false);
                    break;
                }
            case 1:
                z0 z0Var2 = (z0) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                z0Var2.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        MessagesController.getInstance(z0Var2.I).processUpdates((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    z0Var2.S(tL_error.text);
                }
                c2Var.dismiss();
                break;
            case 2:
                String str5 = (String) obj2;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj;
                w0 w0Var = ((v0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str5));
                    request.setMimeType(str6);
                    request.addRequestHeader("User-Agent", str7);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str8);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str8);
                    DownloadManager downloadManager = (DownloadManager) w0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    z0 z0Var3 = w0Var.M;
                    if (z0Var3 != null) {
                        new tc(z0Var3, z0Var3.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str8))).k(true);
                        break;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
                break;
            case 3:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str9 = (String) obj2;
                byte[] bArr = (byte[]) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj;
                w0 w0Var2 = botWebViewContainer$WebViewProxy.b;
                long currentTimeMillis = System.currentTimeMillis();
                z0 z0Var4 = botWebViewContainer$WebViewProxy.a;
                if (currentTimeMillis - z0Var4.L > 10000) {
                    w0Var2.d("window.navigator.__share__receive(\"security\")");
                    break;
                } else {
                    z0Var4.L = 0L;
                    Context context = w0Var2.getContext();
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null && (launchActivity = LaunchActivity.C1) != null) {
                        findActivity = launchActivity;
                    }
                    if (context == null || findActivity == null || !(findActivity instanceof LaunchActivity) || findActivity.isFinishing() || !w0Var2.isAttachedToWindow()) {
                        w0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        LaunchActivity launchActivity2 = (LaunchActivity) findActivity;
                        try {
                            jSONObject = new JSONObject(str9);
                            str = jSONObject.optString("url", null);
                            try {
                                str2 = jSONObject.optString("text", null);
                            } catch (Exception e11) {
                                e = e11;
                                str2 = null;
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = null;
                            str2 = null;
                        }
                        try {
                            str3 = jSONObject.optString("title", null);
                        } catch (Exception e13) {
                            e = e13;
                            FileLog.e(e);
                            str3 = null;
                            StringBuilder sb2 = new StringBuilder();
                            if (str3 != null) {
                            }
                            if (str2 != null) {
                            }
                            if (str != null) {
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                            if (bArr == null) {
                            }
                            launchActivity2.m1 = new nh.b0(botWebViewContainer$WebViewProxy, 10);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                            return;
                        }
                        StringBuilder sb22 = new StringBuilder();
                        if (str3 != null) {
                            sb22.append(str3);
                        }
                        if (str2 != null) {
                            if (sb22.length() > 0) {
                                sb22.append("\n");
                            }
                            sb22.append(str2);
                        }
                        if (str != null) {
                            if (sb22.length() > 0) {
                                sb22.append("\n");
                            }
                            sb22.append(str);
                        }
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.TEXT", sb22.toString());
                        if (bArr == null) {
                            while (true) {
                                if (file == null || file.exists()) {
                                    File directory = FileLoader.getDirectory(4);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(FileLoader.fixFileName(str10 == null ? "file" : str10));
                                    sb3.append(i11 > 0 ? j7.l1.l(i11, " (", ")") : "");
                                    file = new File(directory, sb3.toString());
                                    i11++;
                                } else {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                    } catch (Exception e14) {
                                        FileLog.e(e14);
                                    }
                                    try {
                                        if (str11 == null) {
                                            intent2.setType("text/plain");
                                        } else {
                                            intent2.setType(str11);
                                        }
                                        if (str10 != null) {
                                            intent2.putExtra("android.intent.extra.TITLE", str10);
                                        }
                                        if (Build.VERSION.SDK_INT >= 24) {
                                            try {
                                                intent2.putExtra("android.intent.extra.STREAM", FileProvider.d(launchActivity2, ApplicationLoader.getApplicationId() + ".provider", file));
                                                intent2.setFlags(1);
                                            } catch (Exception unused) {
                                                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                        } else {
                                            intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                        }
                                    } catch (Exception e15) {
                                        FileLog.e(e15);
                                    }
                                }
                            }
                        } else {
                            intent2.setType("text/plain");
                        }
                        launchActivity2.m1 = new nh.b0(botWebViewContainer$WebViewProxy, 10);
                        launchActivity2.startActivityForResult(Intent.createChooser(intent2, LocaleController.getString(R.string.ShareFile)), 521);
                    }
                }
                break;
            default:
                boolean[] zArr = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                z1 z1Var = (z1) obj3;
                String str12 = (String) obj2;
                x1 x1Var = (x1) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        webView.onPause();
                        webView.destroy();
                        AndroidUtilities.removeFromParent(webView);
                        AndroidUtilities.removeFromParent(z1Var);
                    }
                    try {
                        file = new JSONObject(str12);
                    } catch (Exception e16) {
                        FileLog.e(e16);
                    }
                    x1Var.run(file);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a0(z0 z0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 1;
        this.b = z0Var;
        this.c = tLObject;
        this.e = strArr;
        this.d = tL_error;
        this.f = c2Var;
    }

    public /* synthetic */ a0(z0 z0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = z0Var;
        this.d = tL_error;
        this.e = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }

    public /* synthetic */ a0(boolean[] zArr, WebView webView, z1 z1Var, String str, x1 x1Var) {
        this.a = 4;
        this.b = zArr;
        this.d = webView;
        this.f = z1Var;
        this.e = str;
        this.c = x1Var;
    }
}
