package org.telegram.ui.web;

import ag.m2;
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
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.m5;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.u80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dg0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i10) {
        this.a = i10;
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
        int i10 = this.a;
        JSONObject jSONObject = null;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        final int i12 = 0;
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
                    z0Var.F(str4, "failed", false);
                    break;
                }
            case 1:
                z0 z0Var2 = (z0) obj5;
                x0 x0Var = (x0) obj4;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    z0Var2.y(x0Var, "file_download_requested", z0.A("cancelled", "status"));
                    break;
                } else {
                    Context context = z0Var2.getContext();
                    String p5 = h20.p(z0Var2.U);
                    final m2 m2Var = new m2(z0Var2, x0Var, str5, str6, 15);
                    HashMap hashMap = xh.f0.g;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String L0 = cd.L0(2131753095, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = org.telegram.messenger.i0.W2(cd.a0(null, null, 2131753096, p5));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = org.telegram.messenger.i0.L(44.0f);
                    int i13 = t6.Ci;
                    ShapeDrawable L2 = t6.L(L, t6.x0(null, i13, false));
                    w6 N = a7.N(i13);
                    imageView.setBackground(L2);
                    a7.k(imageView, L2, N, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, b6.t(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView g10 = m5.g(context, 1, 15.0f);
                    g10.setTypeface(org.telegram.messenger.i0.o());
                    g10.setText(str6);
                    a7.V(g10, t6.n5, null);
                    linearLayout2.addView(g10, b6.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    f6 f6Var = new f6(context, true, true, true);
                    f6Var.setTextSize(org.telegram.messenger.i0.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    u80 u80Var = new u80(org.telegram.messenger.i0.L(55.0f), f6Var);
                    int i14 = t6.se;
                    u80Var.a(t6.r1(0.35f, t6.x0(null, i14, false)), t6.r1(0.075f, t6.x0(null, i14, false)));
                    spannableString.setSpan(u80Var, 0, 1, 33);
                    f6Var.setText(spannableString);
                    qh.d dVar = new qh.d(f6Var, 28);
                    HashMap hashMap2 = xh.f0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        dVar.a((String) pair.first, (Long) pair.second);
                    } else {
                        new xh.y(str5, dVar).execute(str5);
                    }
                    a7.Z(f6Var, i14, null);
                    linearLayout2.addView(f6Var, b6.o(-1, 15));
                    linearLayout.addView(linearLayout2, b6.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.o(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.h(cd.L0(2131752589, null), new org.telegram.ui.ActionBar.u1() { // from class: xh.x
                        @Override // org.telegram.ui.ActionBar.u1
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i15) {
                            switch (i12) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        m2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        m2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(cd.L0(2131753097, null), new org.telegram.ui.ActionBar.u1() { // from class: xh.x
                        @Override // org.telegram.ui.ActionBar.u1
                        public final void h(org.telegram.ui.ActionBar.x1 x1Var2, int i15) {
                            switch (i11) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        m2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        m2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    x1Var.setOnDismissListener(new mg.g(16, zArr, m2Var));
                    x1Var.show();
                    break;
                }
            case 2:
                z0 z0Var3 = (z0) obj5;
                x0 x0Var2 = (x0) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != z0Var3.a || !z0Var3.o(x0Var2)) {
                    z0Var3.g("onBotWebMessage ignored after document change");
                    break;
                } else {
                    z0Var3.E(z0Var3.r0, x0Var2, str7, str8);
                    break;
                }
            case 3:
                z0 z0Var4 = (z0) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                z0Var4.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        vp.r1(z0Var4.M).L3((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    z0Var4.Y(tL_error.text);
                }
                x1Var2.dismiss();
                break;
            case 4:
                String str9 = (String) obj2;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String str12 = (String) obj;
                v0 v0Var = ((u0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(cd.L0(2131742954, null));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) v0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    z0 z0Var5 = v0Var.Q;
                    if (z0Var5 != null) {
                        new cc(z0Var5, z0Var5.e).Q(R.raw.ic_download, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131742953, str12))).k(true);
                        break;
                    }
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
                break;
            case 5:
                BotWebViewContainer$WebViewProxy botWebViewContainer$WebViewProxy = (BotWebViewContainer$WebViewProxy) obj5;
                String str13 = (String) obj2;
                byte[] bArr = (byte[]) obj4;
                String str14 = (String) obj3;
                String str15 = (String) obj;
                v0 v0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    z0 z0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - z0Var6.P > 10000) {
                        v0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        z0Var6.P = 0L;
                        Context context2 = v0Var2.getContext();
                        Activity W = org.telegram.messenger.i0.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.I1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !v0Var2.isAttachedToWindow()) {
                            v0Var2.d("window.navigator.__share__receive(\"security\")");
                            break;
                        } else {
                            LaunchActivity launchActivity2 = (LaunchActivity) W;
                            try {
                                JSONObject jSONObject2 = new JSONObject(str13);
                                str = jSONObject2.optString("url", null);
                                try {
                                    str2 = jSONObject2.optString("text", null);
                                } catch (Exception e7) {
                                    e = e7;
                                    str2 = null;
                                }
                                try {
                                    str3 = jSONObject2.optString("title", null);
                                } catch (Exception e10) {
                                    e = e10;
                                    f8.g(e, true);
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
                                    launchActivity2.r1 = new ag.l(botWebViewContainer$WebViewProxy, 27);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, cd.L0(2131745477, null)), 521);
                                    return;
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
                                File file = null;
                                while (true) {
                                    if (file == null || file.exists()) {
                                        File z10 = b8.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(b8.q(str14 == null ? "file" : str14));
                                        sb3.append(i12 > 0 ? i0.a.j(i12, " (", ")") : "");
                                        file = new File(z10, sb3.toString());
                                        i12++;
                                    } else {
                                        try {
                                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                                            fileOutputStream.write(bArr);
                                            fileOutputStream.close();
                                        } catch (Exception e12) {
                                            f8.g(e12, true);
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
                                                    org.telegram.messenger.w0.d();
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
                                        } catch (Exception e13) {
                                            f8.g(e13, true);
                                        }
                                    }
                                }
                            } else {
                                intent2.setType("text/plain");
                            }
                            launchActivity2.r1 = new ag.l(botWebViewContainer$WebViewProxy, 27);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, cd.L0(2131745477, null)), 521);
                        }
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                dg0 dg0Var = (dg0) obj3;
                String str16 = (String) obj2;
                q1 q1Var = (q1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    boolean z11 = v2.a;
                    webView.onPause();
                    webView.destroy();
                    org.telegram.messenger.i0.E2(webView);
                    org.telegram.messenger.i0.E2(dg0Var);
                    try {
                        jSONObject = new JSONObject(str16);
                    } catch (Exception e14) {
                        f8.g(e14, true);
                    }
                    q1Var.a(jSONObject);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(Object obj, String str, Serializable serializable, String str2, String str3, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = str;
        this.e = serializable;
        this.f = str2;
        this.c = str3;
    }

    public /* synthetic */ x(z0 z0Var, TLObject tLObject, x0 x0Var, String str, String str2) {
        this.a = 1;
        this.b = z0Var;
        this.c = tLObject;
        this.e = x0Var;
        this.d = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x(z0 z0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.x1 x1Var) {
        this.a = 3;
        this.b = z0Var;
        this.c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f = x1Var;
    }

    public /* synthetic */ x(z0 z0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = z0Var;
        this.e = tL_error;
        this.d = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }
}
