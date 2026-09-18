package org.telegram.ui.web;

import ai.da;
import ai.e4;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.text.SpannableString;
import android.util.Pair;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b0(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.e = webView;
        this.f = obj2;
        this.d = str;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARN: Type inference failed for: r0v64, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r5v3, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v12, types: [android.view.View, java.lang.Object, org.telegram.ui.Components.n6] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        LaunchActivity launchActivity;
        int i10 = this.a;
        File file = null;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        final int i12 = 0;
        switch (i10) {
            case 0:
                d1 d1Var = (d1) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    d1Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    d1Var.G(str4, "failed", false);
                    break;
                }
            case 1:
                d1 d1Var2 = (d1) obj5;
                da daVar = (da) obj4;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    d1Var2.y(daVar, "file_download_requested", d1.B("cancelled", "status"));
                    break;
                } else {
                    Context context = d1Var2.getContext();
                    String userName = UserObject.getUserName(d1Var2.U);
                    final e4 e4Var = new e4(d1Var2, daVar, str5, str6, 14);
                    HashMap hashMap = ei.l0.g;
                    ?? alertDialog$Builder = new AlertDialog$Builder(context);
                    String string = LocaleController.getString(R.string.BotDownloadFileTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                    c2Var.R = string;
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotDownloadFileText, userName));
                    ?? linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setBackground(j6.K(AndroidUtilities.dp(44.0f), j6.w0(null, j6.Oh, false)));
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, x5.t(44, 44, 19, 0, 0, 10, 0));
                    ?? linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView g10 = org.telegram.messenger.w1.g(context, 1, 15.0f);
                    g10.setTypeface(AndroidUtilities.bold());
                    g10.setText(str6);
                    g10.setTextColor(j6.w0(null, j6.n5, false));
                    linearLayout2.addView(g10, x5.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    ?? n6Var = new n6(context, true, true, true);
                    n6Var.setTextSize(AndroidUtilities.dp(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    h90 h90Var = new h90(AndroidUtilities.dp(55.0f), n6Var);
                    int i13 = j6.Ed;
                    h90Var.a(j6.l1(0.35f, j6.w0(null, i13, false)), j6.l1(0.075f, j6.w0(null, i13, false)));
                    spannableString.setSpan(h90Var, 0, 1, 33);
                    n6Var.setText(spannableString);
                    bi.v vVar = new bi.v(n6Var, 14);
                    HashMap hashMap2 = ei.l0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        vVar.run((String) pair.first, (Long) pair.second);
                    } else {
                        new ei.f0(str5, vVar).execute(str5);
                    }
                    n6Var.setTextColor(j6.w0(null, i13, false));
                    linearLayout2.addView(n6Var, x5.n(-1, 15));
                    linearLayout.addView(linearLayout2, x5.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.n(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new org.telegram.ui.ActionBar.b2() { // from class: ei.d0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                            switch (i12) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        e4Var.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        e4Var.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(LocaleController.getString(R.string.BotDownloadFileDownload), new org.telegram.ui.ActionBar.b2() { // from class: ei.d0
                        @Override // org.telegram.ui.ActionBar.b2
                        public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i14) {
                            switch (i11) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        e4Var.run(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        e4Var.run(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    c2Var.setOnDismissListener(new ei.e0(i12, zArr, e4Var));
                    c2Var.show();
                    break;
                }
            case 2:
                d1 d1Var3 = (d1) obj5;
                da daVar2 = (da) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != d1Var3.a || !d1Var3.p(daVar2)) {
                    d1Var3.h("onBotWebMessage ignored after document change");
                    break;
                } else {
                    d1Var3.F(d1Var3.r0, daVar2, str7, str8);
                    break;
                }
            case 3:
                d1 d1Var4 = (d1) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) obj3;
                d1Var4.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        MessagesController.getInstance(d1Var4.M).processUpdates((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    d1Var4.Z(tL_error.text);
                }
                c2Var2.dismiss();
                break;
            case 4:
                String str9 = (String) obj2;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String str12 = (String) obj;
                z0 z0Var = ((y0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) z0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    d1 d1Var5 = z0Var.Q;
                    if (d1Var5 != null) {
                        new vc(d1Var5, d1Var5.e).Q(R.raw.ic_download, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str12))).k(true);
                        break;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
                break;
            case 5:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str13 = (String) obj2;
                byte[] bArr = (byte[]) obj4;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                z0 z0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d1 d1Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - d1Var6.P > 10000) {
                        z0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        d1Var6.P = 0L;
                        Context context2 = z0Var2.getContext();
                        Activity findActivity = AndroidUtilities.findActivity(context2);
                        if (findActivity == null && (launchActivity = LaunchActivity.G1) != null) {
                            findActivity = launchActivity;
                        }
                        if (context2 == null || findActivity == null || !(findActivity instanceof LaunchActivity) || findActivity.isFinishing() || !z0Var2.isAttachedToWindow()) {
                            z0Var2.d("window.navigator.__share__receive(\"security\")");
                            break;
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) findActivity;
                            try {
                                JSONObject jSONObject = new JSONObject(str13);
                                str = jSONObject.optString("url", null);
                                try {
                                    str2 = jSONObject.optString("text", null);
                                    try {
                                        str3 = jSONObject.optString("title", null);
                                    } catch (Exception e7) {
                                        e = e7;
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
                                        launchActivity2.q1 = new b1(botWebViewContainer$WebViewProxy, i12);
                                        launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                                        return;
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    str2 = null;
                                }
                            } catch (Exception e11) {
                                e = e11;
                                str = null;
                                str2 = null;
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
                                int i14 = 0;
                                while (true) {
                                    if (file == null || file.exists()) {
                                        File directory = FileLoader.getDirectory(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(FileLoader.fixFileName(str14 == null ? "file" : str14));
                                        sb3.append(i14 > 0 ? hg.k0.j(i14, " (", ")") : "");
                                        file = new File(directory, sb3.toString());
                                        i14++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                        try {
                                            if (str15 == null) {
                                                intent2.setType("text/plain");
                                            } else {
                                                intent2.setType(str15);
                                            }
                                            if (str14 != null) {
                                                intent2.putExtra("android.intent.extra.TITLE", str14);
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
                                        } catch (Exception e13) {
                                            FileLog.e(e13);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.q1 = new b1(botWebViewContainer$WebViewProxy, i12);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, LocaleController.getString(R.string.ShareFile)), 521);
                        }
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                c2 c2Var3 = (c2) obj3;
                String str16 = (String) obj2;
                a2 a2Var = (a2) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                        webView.onPause();
                        webView.destroy();
                        AndroidUtilities.removeFromParent(webView);
                        AndroidUtilities.removeFromParent(c2Var3);
                    }
                    try {
                        file = new JSONObject(str16);
                    } catch (Exception e14) {
                        FileLog.e(e14);
                    }
                    a2Var.run(file);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.e = serializable;
        this.f = str2;
        this.c = str3;
    }

    public /* synthetic */ b0(d1 d1Var, TLObject tLObject, da daVar, String str, String str2) {
        this.a = 1;
        this.b = d1Var;
        this.c = tLObject;
        this.e = daVar;
        this.d = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ b0(d1 d1Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.c2 c2Var) {
        this.a = 3;
        this.b = d1Var;
        this.c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f = c2Var;
    }

    public /* synthetic */ b0(d1 d1Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = d1Var;
        this.e = tL_error;
        this.d = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }
}
