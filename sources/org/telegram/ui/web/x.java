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
import bi.i2;
import c8.ma;
import fi.f7;
import hi.e7;
import hi.t6;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.s2;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0193  */
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
        int i10 = 4;
        JSONObject jSONObject = null;
        final int i11 = 1;
        Object obj = this.c;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.b;
        final int i12 = 0;
        switch (i7) {
            case 0:
                v0 v0Var = (v0) obj5;
                String str4 = (String) obj2;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj3;
                TLObject tLObject = (TLObject) obj;
                if (((TLRPC.TL_error) obj4) == null) {
                    v0Var.c.n(tL_inputInvoiceSlug, str4, tLObject);
                    break;
                } else {
                    v0Var.G(str4, "failed", false);
                    break;
                }
            case 1:
                v0 v0Var2 = (v0) obj5;
                f7 f7Var = (f7) obj4;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                if (!(((TLObject) obj) instanceof TLRPC.TL_boolTrue)) {
                    v0Var2.x(f7Var, "file_download_requested", v0.A("cancelled", "status"));
                    break;
                } else {
                    Context context = v0Var2.getContext();
                    String q10 = o10.q(v0Var2.V);
                    final i2 i2Var = new i2(v0Var2, f7Var, str5, str6, 16);
                    HashMap hashMap = ki.h0.g;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
                    String M0 = gd.M0(2131753093, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = org.telegram.messenger.g0.W2(gd.a0(null, null, 2131753094, q10));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setPadding(org.telegram.messenger.g0.L(22.0f), 0, org.telegram.messenger.g0.L(22.0f), 0);
                    linearLayout.setOrientation(0);
                    ImageView imageView = new ImageView(context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    int L = org.telegram.messenger.g0.L(44.0f);
                    int i13 = n6.Fi;
                    ShapeDrawable L2 = n6.L(L, n6.x0(null, i13, false));
                    q6 M = u6.M(i13);
                    imageView.setBackground(L2);
                    u6.j(imageView, L2, M, null, null);
                    imageView.setImageResource(R.drawable.msg_round_file_s);
                    linearLayout.addView(imageView, ma.t(44, 44, 19, 0, 0, 10, 0));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setTextSize(1, 15.0f);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setText(str6);
                    u6.U(textView, n6.n5, null);
                    linearLayout2.addView(textView, ma.k(0.0f, 0.0f, 0.0f, 3.0f, -1, -2));
                    org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, true);
                    n6Var.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    SpannableString spannableString = new SpannableString("l");
                    p80 p80Var = new p80(org.telegram.messenger.g0.L(55.0f), n6Var);
                    int i14 = n6.ve;
                    p80Var.a(n6.r1(0.35f, n6.x0(null, i14, false)), n6.r1(0.075f, n6.x0(null, i14, false)));
                    spannableString.setSpan(p80Var, 0, 1, 33);
                    n6Var.setText(spannableString);
                    e7 e7Var = new e7(n6Var, 18);
                    HashMap hashMap2 = ki.h0.h;
                    if (hashMap2.containsKey(str5)) {
                        Pair pair = (Pair) hashMap2.get(str5);
                        e7Var.a((String) pair.first, (Long) pair.second);
                    } else {
                        new ki.b0(str5, e7Var).execute(str5);
                    }
                    u6.Y(n6Var, i14, null);
                    linearLayout2.addView(n6Var, ma.o(-1, 15));
                    linearLayout.addView(linearLayout2, ma.t(-1, -2, 23, 0, 0, 0, 2));
                    alertDialog$Builder.o(linearLayout);
                    final boolean[] zArr = new boolean[1];
                    alertDialog$Builder.h(gd.M0(2131752578, null), new org.telegram.ui.ActionBar.r1() { // from class: ki.a0
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i15) {
                            switch (i12) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        i2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        i2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    alertDialog$Builder.k(gd.M0(2131753095, null), new org.telegram.ui.ActionBar.r1() { // from class: ki.a0
                        @Override // org.telegram.ui.ActionBar.r1
                        public final void h(org.telegram.ui.ActionBar.u1 u1Var2, int i15) {
                            switch (i11) {
                                case 0:
                                    boolean[] zArr2 = zArr;
                                    if (!zArr2[0]) {
                                        i2Var.a(Boolean.FALSE);
                                        zArr2[0] = true;
                                        break;
                                    }
                                    break;
                                default:
                                    boolean[] zArr3 = zArr;
                                    if (!zArr3[0]) {
                                        i2Var.a(Boolean.TRUE);
                                        zArr3[0] = true;
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    u1Var.setOnDismissListener(new di.u1(4, zArr, i2Var));
                    u1Var.show();
                    break;
                }
            case 2:
                v0 v0Var3 = (v0) obj5;
                f7 f7Var2 = (f7) obj3;
                String str7 = (String) obj2;
                String str8 = (String) obj;
                if (((WebView) obj4) != v0Var3.a || !v0Var3.o(f7Var2)) {
                    v0Var3.g("onBotWebMessage ignored after document change");
                    break;
                } else {
                    v0Var3.F(v0Var3.s0, f7Var2, str7, str8);
                    break;
                }
            case 3:
                v0 v0Var4 = (v0) obj5;
                TLObject tLObject2 = (TLObject) obj;
                String[] strArr = (String[]) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj3;
                v0Var4.getClass();
                if (tLObject2 != null) {
                    strArr[0] = "allowed";
                    if (tLObject2 instanceof TLRPC.Updates) {
                        mp.u1(v0Var4.N).V3((TLRPC.Updates) tLObject2, false);
                    }
                }
                if (tL_error != null) {
                    v0Var4.Z(tL_error.text);
                }
                u1Var2.dismiss();
                break;
            case 4:
                String str9 = (String) obj2;
                String str10 = (String) obj4;
                String str11 = (String) obj3;
                String str12 = (String) obj;
                s0 s0Var = ((r0) obj5).a;
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str9));
                    request.setMimeType(str10);
                    request.addRequestHeader("User-Agent", str11);
                    request.setDescription(gd.M0(2131742670, null));
                    request.setTitle(str12);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str12);
                    DownloadManager downloadManager = (DownloadManager) s0Var.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    v0 v0Var5 = s0Var.R;
                    if (v0Var5 != null) {
                        new lc(v0Var5, v0Var5.e).Q(R.raw.ic_download, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131742669, str12))).k(true);
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
                s0 s0Var2 = botWebViewContainer$WebViewProxy.b;
                if (botWebViewContainer$WebViewProxy.a != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    v0 v0Var6 = botWebViewContainer$WebViewProxy.a;
                    if (currentTimeMillis - v0Var6.Q > 10000) {
                        s0Var2.d("window.navigator.__share__receive(\"security\")");
                        break;
                    } else {
                        v0Var6.Q = 0L;
                        Context context2 = s0Var2.getContext();
                        Activity W = org.telegram.messenger.g0.W(context2);
                        if (W == null && (launchActivity = LaunchActivity.H1) != null) {
                            W = launchActivity;
                        }
                        if (context2 == null || W == null || !(W instanceof LaunchActivity) || W.isFinishing() || !s0Var2.isAttachedToWindow()) {
                            s0Var2.d("window.navigator.__share__receive(\"security\")");
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
                                    launchActivity2.q1 = new t6(botWebViewContainer$WebViewProxy, 22);
                                    launchActivity2.startActivityForResult(Intent.createChooser(intent, gd.M0(2131745264, null)), 521);
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
                                        File z10 = w7.z(i10);
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append(w7.q(str14 == null ? "file" : str14));
                                        sb3.append(i12 > 0 ? i5.c.j(i12, " (", ")") : "");
                                        file = new File(z10, sb3.toString());
                                        i12++;
                                        i10 = 4;
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
                            launchActivity2.q1 = new t6(botWebViewContainer$WebViewProxy, 22);
                            launchActivity2.startActivityForResult(Intent.createChooser(intent2, gd.M0(2131745264, null)), 521);
                        }
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) obj5;
                WebView webView = (WebView) obj4;
                ih0 ih0Var = (ih0) obj3;
                String str16 = (String) obj2;
                o1 o1Var = (o1) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    boolean z11 = s2.a;
                    webView.onPause();
                    webView.destroy();
                    org.telegram.messenger.g0.E2(webView);
                    org.telegram.messenger.g0.E2(ih0Var);
                    try {
                        jSONObject = new JSONObject(str16);
                    } catch (Exception e16) {
                        a8.g(e16, true);
                    }
                    o1Var.a(jSONObject);
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

    public /* synthetic */ x(v0 v0Var, TLObject tLObject, f7 f7Var, String str, String str2) {
        this.a = 1;
        this.b = v0Var;
        this.c = tLObject;
        this.e = f7Var;
        this.d = str;
        this.f = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ x(v0 v0Var, TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.u1 u1Var) {
        this.a = 3;
        this.b = v0Var;
        this.c = tLObject;
        this.d = strArr;
        this.e = tL_error;
        this.f = u1Var;
    }

    public /* synthetic */ x(v0 v0Var, TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        this.a = 0;
        this.b = v0Var;
        this.e = tL_error;
        this.d = str;
        this.f = tL_inputInvoiceSlug;
        this.c = tLObject;
    }
}
