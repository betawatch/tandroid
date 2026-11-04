package org.telegram.ui.web;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ShapeDrawable;
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
import b8.mf;
import ci.h3;
import ei.p7;
import gi.j8;
import gi.q4;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.r2;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.x70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yg0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ y(Object obj, WebView webView, Object obj2, String str, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.e = webView;
        this.f = obj2;
        this.d = str;
        this.c = obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String str2;
        String str3;
        LaunchActivity launchActivity;
        int i3 = this.a;
        JSONObject jSONObject = null;
        final int i10 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        final int i11 = 0;
        switch (i3) {
            case 0:
                w0 w0Var = (w0) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    w0Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    w0Var.F(str4, "failed", false);
                    break;
                }
            case 1:
                w0 w0Var2 = (w0) obj5;
                p7 p7Var = (p7) obj4;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    w0Var2.x(p7Var, "file_download_requested", w0.A("cancelled", "status"));
                    break;
                } else {
                    Context context = w0Var2.getContext();
                    String p10 = l10.p(w0Var2.V);
                    final ai.v1 v1Var = new ai.v1(w0Var2, p7Var, str5, str6, 16);
                    HashMap hashMap = ii.i0.g;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = bd.M0(2131753095, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = org.telegram.messenger.g0.X2(bd.a0(null, null, 2131753096, p10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = org.telegram.messenger.g0.L(44.0f);
                    int i12 = k6.Ci;
                    ShapeDrawable L2 = k6.L(L, k6.x0(null, i12, false));
                    n6 N = r6.N(i12);
                    imageView.setBackground(L2);
                    r6.k(imageView, L2, N, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, mf.t(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView g7 = k5.g(context, 1, 15.0f);
                    g7.setTypeface(org.telegram.messenger.g0.o());
                    g7.setText(str6);
                    r6.V(g7, k6.n5, null);
                    linearLayout2.addView(g7, mf.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    h6 h6Var = new h6(context, true, true, true);
                    h6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    x70 x70Var = new x70(org.telegram.messenger.g0.L(55.0f), h6Var);
                    int i13 = k6.se;
                    x70Var.a(k6.r1(0.35f, k6.x0(null, i13, false)), k6.r1(0.075f, k6.x0(null, i13, false)));
                    spannableString.setSpan(x70Var, 0, 1, 33);
                    h6Var.setText(spannableString);
                    q4 q4Var = new q4(h6Var, 8);
                    HashMap hashMap2 = ii.i0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        q4Var.a((String) pair.first, (Long) pair.second);
                    } else {
                        new ii.c0(str5, q4Var).execute(str5);
                    }
                    r6.Z(h6Var, i13, null);
                    linearLayout2.addView(h6Var, mf.o(-1, 15));
                    linearLayout.addView(linearLayout2, mf.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.o(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.h(bd.M0(2131752589, null), new org.telegram.ui.ActionBar.p1() { // from class: ii.b0
                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                            switch (i11) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        v1Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        v1Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(bd.M0(2131753097, null), new org.telegram.ui.ActionBar.p1() { // from class: ii.b0
                        @Override // org.telegram.ui.ActionBar.p1
                        public final void g(org.telegram.ui.ActionBar.s1 s1Var2, int i14) {
                            switch (i10) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        v1Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        v1Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    s1Var.setOnDismissListener(new h3(2, zArr, v1Var));
                    s1Var.show();
                    break;
                }
            case 2:
                w0 w0Var3 = (w0) obj5;
                p7 p7Var2 = (p7) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != w0Var3.a || !w0Var3.o(p7Var2)) {
                    w0Var3.g("onBotWebMessage ignored after document change");
                    break;
                } else {
                    w0Var3.E(w0Var3.s0, p7Var2, str7, str8);
                    break;
                }
            case 3:
                w0 w0Var4 = (w0) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj3;
                w0Var4.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        hp.s1(w0Var4.N).O3((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    w0Var4.Y(tL_error.text);
                }
                s1Var2.dismiss();
                break;
            case 4:
                String str9 = (String) obj2;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String str12 = (String) obj;
                t0 t0Var = ((s0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(bd.M0(2131742938, null));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) t0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    w0 w0Var5 = t0Var.R;
                    if (w0Var5 != null) {
                        new fc(w0Var5, w0Var5.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131742937, str12))).k(true);
                        break;
                    }
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
                break;
            case 5:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str13 = (String) obj2;
                byte[] bArr = (byte[]) obj4;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                t0 t0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    w0 w0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - w0Var6.Q > 10000) {
                        t0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        w0Var6.Q = 0L;
                        Context context2 = t0Var2.getContext();
                        Activity W = org.telegram.messenger.g0.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.K1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !t0Var2.isAttachedToWindow()) {
                            t0Var2.d("window.navigator.__share__receive(\"security\")");
                            break;
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) W;
                            try {
                                JSONObject jSONObject2 = new JSONObject(str13);
                                str = jSONObject2.optString("url", null);
                                try {
                                    str2 = jSONObject2.optString("text", null);
                                } catch (Exception e11) {
                                    e = e11;
                                    str2 = null;
                                }
                                try {
                                    str3 = jSONObject2.optString("title", null);
                                } catch (Exception e12) {
                                    e = e12;
                                    a8.g(e, true);
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
                                    launchActivity2.s1 = new j8(botWebViewContainer$WebViewProxy, 19);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, bd.M0(2131745469, null)), 521);
                                    return;
                                }
                            } catch (Exception e13) {
                                e = e13;
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
                                File file = null;
                                while (true) {
                                    if (file == null || file.exists()) {
                                        File z10 = w7.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(w7.q(str14 == null ? "file" : str14));
                                        sb3.append(i11 > 0 ? k2.p1.j(i11, " (", ")") : "");
                                        file = new File(z10, sb3.toString());
                                        i11++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e14) {
                                            a8.g(e14, true);
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
                                                    StringBuilder sb4 = new StringBuilder();
                                                    org.telegram.messenger.t0.d();
                                                    sb4.append("org.telegram.messenger.beta");
                                                    sb4.append(".provider");
                                                    intent2.putExtra("android.intent.extra.STREAM", FileProvider.d(launchActivity2, sb4.toString(), file));
                                                    intent2.setFlags(1);
                                                } catch (Exception unused) {
                                                    intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                                }
                                            } else {
                                                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                                            }
                                        } catch (Exception e15) {
                                            a8.g(e15, true);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.s1 = new j8(botWebViewContainer$WebViewProxy, 19);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, bd.M0(2131745469, null)), 521);
                        }
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                yg0 yg0Var = (yg0) obj3;
                String str16 = (String) obj2;
                n1 n1Var = (n1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    boolean z11 = r2.a;
                    webView.onPause();
                    webView.destroy();
                    org.telegram.messenger.g0.E2(webView);
                    org.telegram.messenger.g0.E2(yg0Var);
                    try {
                        jSONObject = new JSONObject(str16);
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                    n1Var.a(jSONObject);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ y(Object obj, String str, Serializable serializable, String str2, String str3, int i3) {
        this.a = i3;
        this.b = obj;
        this.d = str;
        this.e = serializable;
        this.f = str2;
        this.c = str3;
    }

    public /* synthetic */ y(w0 w0Var, TLObject tLObject, p7 p7Var, String str, String str2) {
        this.a = 1;
        this.b = w0Var;
        this.c = tLObject;
        this.e = p7Var;
        this.d = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ y(w0 w0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.s1 s1Var) {
        this.a = 3;
        this.b = w0Var;
        this.c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f = s1Var;
    }

    public /* synthetic */ y(w0 w0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = w0Var;
        this.e = tL_error;
        this.d = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }
}
