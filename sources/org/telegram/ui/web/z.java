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
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
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
                a1 a1Var = (a1) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    a1Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    a1Var.C(str4, "failed", false);
                    break;
                }
            case 1:
                a1 a1Var2 = (a1) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                a1Var2.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        MessagesController.getInstance(a1Var2.J).processUpdates((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    a1Var2.S(tL_error.text);
                }
                d2Var.dismiss();
                break;
            case 2:
                String str5 = (String) obj2;
                String str6 = (String) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj;
                x0 x0Var = ((w0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str5));
                    request.setMimeType(str6);
                    request.addRequestHeader("User-Agent", str7);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str8);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str8);
                    DownloadManager downloadManager = (DownloadManager) x0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    a1 a1Var3 = x0Var.N;
                    if (a1Var3 != null) {
                        new qc(a1Var3, a1Var3.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str8))).k(true);
                        break;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
                break;
            case 3:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str9 = (String) obj2;
                byte[] bArr = (byte[]) obj4;
                String str10 = (String) obj3;
                String str11 = (String) obj;
                x0 x0Var2 = botWebViewContainer$WebViewProxy.b;
                long currentTimeMillis = System.currentTimeMillis();
                a1 a1Var4 = botWebViewContainer$WebViewProxy.a;
                if (currentTimeMillis - a1Var4.M > 10000) {
                    x0Var2.d("window.navigator.__share__receive(\"security\")");
                    break;
                } else {
                    a1Var4.M = 0L;
                    Context context = x0Var2.getContext();
                    Activity findActivity = AndroidUtilities.findActivity(context);
                    if (findActivity == null && (launchActivity = LaunchActivity.D1) != null) {
                        findActivity = launchActivity;
                    }
                    if (context == null || findActivity == null || !(findActivity instanceof LaunchActivity) || findActivity.isFinishing() || !x0Var2.isAttachedToWindow()) {
                        x0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        LaunchActivity launchActivity2 = (LaunchActivity) findActivity;
                        try {
                            jSONObject = new JSONObject(str9);
                            str = jSONObject.optString("url", null);
                            try {
                                str2 = jSONObject.optString("text", null);
                            } catch (Exception e10) {
                                e = e10;
                                str2 = null;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            str = null;
                            str2 = null;
                        }
                        try {
                            str3 = jSONObject.optString("title", null);
                        } catch (Exception e12) {
                            e = e12;
                            FileLog.e(e);
                            str3 = null;
                            StringBuilder sb = new StringBuilder();
                            if (str3 != null) {
                            }
                            if (str2 != null) {
                            }
                            if (str != null) {
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.putExtra("android.intent.extra.TEXT", sb.toString());
                            if (bArr == null) {
                            }
                            launchActivity2.n1 = new dg.h0(botWebViewContainer$WebViewProxy, 29);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        if (str3 != null) {
                            sb2.append(str3);
                        }
                        if (str2 != null) {
                            if (sb2.length() > 0) {
                                sb2.append("\n");
                            }
                            sb2.append(str2);
                        }
                        if (str != null) {
                            if (sb2.length() > 0) {
                                sb2.append("\n");
                            }
                            sb2.append(str);
                        }
                        Intent intent2 = new Intent("android.intent.action.SEND");
                        intent2.putExtra("android.intent.extra.TEXT", sb2.toString());
                        if (bArr == null) {
                            while (true) {
                                if (file == null || file.exists()) {
                                    File directory = FileLoader.getDirectory(4);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(FileLoader.fixFileName(str10 == null ? "file" : str10));
                                    sb3.append(i11 > 0 ? l.d.k(i11, " (", ")") : "");
                                    file = new File(directory, sb3.toString());
                                    i11++;
                                } else {
                                    try {
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        fileOutputStream.write(bArr);
                                        fileOutputStream.close();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
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
                                    } catch (Exception e14) {
                                        FileLog.e(e14);
                                    }
                                }
                            }
                        } else {
                            intent2.setType("text/plain");
                        }
                        launchActivity2.n1 = new dg.h0(botWebViewContainer$WebViewProxy, 29);
                        launchActivity2.startActivityForResult(Intent.createChooser(intent2, LocaleController.getString(R.string.ShareFile)), 521);
                    }
                }
                break;
            default:
                boolean[] zArr = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                b2 b2Var = (b2) obj3;
                String str12 = (String) obj2;
                z1 z1Var = (z1) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        webView.onPause();
                        webView.destroy();
                        AndroidUtilities.removeFromParent(webView);
                        AndroidUtilities.removeFromParent(b2Var);
                    }
                    try {
                        file = new JSONObject(str12);
                    } catch (Exception e15) {
                        FileLog.e(e15);
                    }
                    z1Var.run(file);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ z(a1 a1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = 1;
        this.b = a1Var;
        this.c = tLObject;
        this.e = strArr;
        this.d = tL_error;
        this.f = d2Var;
    }

    public /* synthetic */ z(a1 a1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = a1Var;
        this.d = tL_error;
        this.e = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }

    public /* synthetic */ z(boolean[] zArr, WebView webView, b2 b2Var, String str, z1 z1Var) {
        this.a = 4;
        this.b = zArr;
        this.d = webView;
        this.f = b2Var;
        this.e = str;
        this.c = z1Var;
    }
}
