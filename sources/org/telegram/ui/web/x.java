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
import bi.u3;
import c8.ha;
import di.o7;
import di.s2;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.r2;
import org.telegram.messenger.t10;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sq0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ x(Object obj, WebView webView, Object obj2, String str, Object obj3, int i7) {
        this.a = i7;
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
        int i7 = this.a;
        JSONObject jSONObject = null;
        final int i10 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        final int i11 = 0;
        switch (i7) {
            case 0:
                x0 x0Var = (x0) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    x0Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    x0Var.G(str4, "failed", false);
                    break;
                }
            case 1:
                x0 x0Var2 = (x0) obj5;
                o7 o7Var = (o7) obj4;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    x0Var2.x(o7Var, "file_download_requested", x0.A("cancelled", "status"));
                    break;
                } else {
                    Context context = x0Var2.getContext();
                    String p10 = t10.p(x0Var2.U);
                    final s2 s2Var = new s2(x0Var2, o7Var, str5, str6, 15);
                    HashMap hashMap = hi.g0.g;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = hd.M0(2131753095, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.g0.X2(hd.a0(null, null, 2131753096, p10));
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
                    linearLayout.addView(imageView, ha.t(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView g10 = k5.g(context, 1, 15.0f);
                    g10.setTypeface(org.telegram.messenger.g0.o());
                    g10.setText(str6);
                    r6.V(g10, k6.n5, null);
                    linearLayout2.addView(g10, ha.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    j6 j6Var = new j6(context, true, true, true);
                    j6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    b80 b80Var = new b80(org.telegram.messenger.g0.L(55.0f), j6Var);
                    int i13 = k6.se;
                    b80Var.a(k6.r1(0.35f, k6.x0(null, i13, false)), k6.r1(0.075f, k6.x0(null, i13, false)));
                    spannableString.setSpan(b80Var, 0, 1, 33);
                    j6Var.setText(spannableString);
                    ai.e eVar = new ai.e(j6Var, 28);
                    HashMap hashMap2 = hi.g0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        eVar.a((String) pair.first, (Long) pair.second);
                    } else {
                        new hi.a0(str5, eVar).execute(str5);
                    }
                    r6.Z(j6Var, i13, null);
                    linearLayout2.addView(j6Var, ha.o(-1, 15));
                    linearLayout.addView(linearLayout2, ha.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.o(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.h(hd.M0(2131752589, null), new org.telegram.ui.ActionBar.r1() { // from class: hi.z
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i14) {
                            switch (i11) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        s2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        s2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(hd.M0(2131753097, null), new org.telegram.ui.ActionBar.r1() { // from class: hi.z
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void g(org.telegram.ui.ActionBar.u1 u1Var2, int i14) {
                            switch (i10) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        s2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        s2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    u1Var.setOnDismissListener(new u3(2, zArr, s2Var));
                    u1Var.show();
                    break;
                }
            case 2:
                x0 x0Var3 = (x0) obj5;
                o7 o7Var2 = (o7) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != x0Var3.a || !x0Var3.o(o7Var2)) {
                    x0Var3.g("onBotWebMessage ignored after document change");
                    break;
                } else {
                    x0Var3.F(x0Var3.r0, o7Var2, str7, str8);
                    break;
                }
            case 3:
                x0 x0Var4 = (x0) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                x0Var4.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        qp.s1(x0Var4.M).O3((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    x0Var4.Z(tL_error.text);
                }
                u1Var2.dismiss();
                break;
            case 4:
                String str9 = (String) obj2;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String str12 = (String) obj;
                u0 u0Var = ((t0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(hd.M0(2131742929, null));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) u0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    x0 x0Var5 = u0Var.Q;
                    if (x0Var5 != null) {
                        new hc(x0Var5, x0Var5.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131742928, str12))).k(true);
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
                u0 u0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    x0 x0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - x0Var6.P > 10000) {
                        u0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        x0Var6.P = 0L;
                        Context context2 = u0Var2.getContext();
                        Activity W = org.telegram.messenger.g0.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.G1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !u0Var2.isAttachedToWindow()) {
                            u0Var2.d("window.navigator.__share__receive(\"security\")");
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
                                    launchActivity2.p1 = new ii.c(botWebViewContainer$WebViewProxy, 16);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, hd.M0(2131745460, null)), 521);
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
                                        File z9 = w7.z(4);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(w7.q(str14 == null ? "file" : str14));
                                        sb3.append(i11 > 0 ? jg.g.k(i11, " (", ")") : "");
                                        file = new File(z9, sb3.toString());
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
                            launchActivity2.p1 = new ii.c(botWebViewContainer$WebViewProxy, 16);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, hd.M0(2131745460, null)), 521);
                        }
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                sq0 sq0Var = (sq0) obj3;
                String str16 = (String) obj2;
                p1 p1Var = (p1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    boolean z10 = r2.a;
                    webView.onPause();
                    webView.destroy();
                    org.telegram.messenger.g0.E2(webView);
                    org.telegram.messenger.g0.E2(sq0Var);
                    try {
                        jSONObject = new JSONObject(str16);
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                    p1Var.a(jSONObject);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x(Object obj, String str, Serializable serializable, String str2, String str3, int i7) {
        this.a = i7;
        this.b = obj;
        this.d = str;
        this.e = serializable;
        this.f = str2;
        this.c = str3;
    }

    public /* synthetic */ x(x0 x0Var, TLObject tLObject, o7 o7Var, String str, String str2) {
        this.a = 1;
        this.b = x0Var;
        this.c = tLObject;
        this.e = o7Var;
        this.d = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x(x0 x0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 3;
        this.b = x0Var;
        this.c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f = u1Var;
    }

    public /* synthetic */ x(x0 x0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = x0Var;
        this.e = tL_error;
        this.d = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }
}
