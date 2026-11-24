// default package

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Base64;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class w25 {
    public final int a;
    public final c b;
    public final HashSet c = new HashSet();
    public final ArrayList d = new ArrayList();
    public int e;
    public final ConnectionsManager f;
    public s25 g;
    public boolean h;

    public w25(c cVar) {
        this.e = -1;
        int i = cVar.a;
        this.a = i;
        this.b = cVar;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        this.f = connectionsManager;
        if (this.e >= 0) {
            return;
        }
        this.e = connectionsManager.sendRequestTyped(new TL_wallet.tonConnectGetSessions(), new hc((byte) 0), new ur4((Object) this, (byte) 7));
    }

    public static String C(String str) {
        if (TextUtils.isEmpty(str)) {
            return k96.M0(2131742709, null);
        }
        if (str.length() <= 10) {
            return str;
        }
        return str.substring(0, 4) + "…" + str.substring(str.length() - 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Type inference failed for: r2v27, types: [gk7, h25] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static cj7 D(Context context, final int i, final r25 r25Var, final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, final wjb wjbVar, final f25 f25Var, final Runnable runnable) {
        TLRPC.WebDocument webDocument;
        boolean z;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr;
        String J0;
        String M0;
        smc smcVar;
        boolean isAttachedToWindow;
        int i2;
        TextView textView;
        c cVar;
        final c C = c.C(i);
        boolean z2 = tL_urlAuthResultRequest != null;
        final TL_wallet.tonConnectSession tonconnectsession = z2 ? null : r25Var.e;
        TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr2 = {null};
        LinearLayout j = de9.j(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        final ImageView k = tb4.k(context, R.drawable.ic_ab_close);
        k.setScaleType(ImageView.ScaleType.CENTER);
        int i3 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i3, wjbVar), 1, -1);
        vkb M = zkb.M(i3);
        k.setBackground(f0);
        zkb.j(k, f0, null, M, wjbVar);
        int i4 = bkb.F6;
        zkb.s(k, i4, wjbVar, PorterDuff.Mode.SRC_IN);
        ote.a(k);
        frameLayout.addView(k, nme.d(48, 48.0f, 51, 4.0f, 0.0f, 0.0f, 0.0f));
        be0 be0Var = new be0(context);
        be0Var.setRoundRadius(gl.L(38.0f));
        if (z2) {
            pb0 pb0Var = new pb0((wjb) null);
            pb0Var.q(tL_urlAuthResultRequest.bot);
            be0Var.f(tL_urlAuthResultRequest.bot, pb0Var);
        } else {
            TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
            if (tonconnectmanifest != null && (webDocument = tonconnectmanifest.icon) != null) {
                z = z2;
                inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
                be0Var.p(gl5.p(usc.c(webDocument)), "76_76", null, tonconnectsession.manifest);
                frameLayout.addView(be0Var, nme.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
                j.addView(frameLayout, nme.o(-1, -2));
                TextView textView2 = new TextView(context);
                textView2.setTypeface(gl.o());
                textView2.setTextSize(1, 20.0f);
                textView2.setGravity(17);
                if (z) {
                    TL_wallet.tonConnectManifest tonconnectmanifest2 = tonconnectsession.manifest;
                    if (tonconnectmanifest2 != null) {
                        textView2.setText(k96.V(null, null, 2131742917, tonconnectmanifest2.name));
                    } else {
                        textView2.setText(k96.M0(2131742916, null));
                    }
                } else {
                    textView2.setText(k96.V(null, null, 2131742917, l7c.r(tL_urlAuthResultRequest.bot)));
                }
                zkb.X(textView2, i4, wjbVar);
                j.addView(textView2, nme.t(-2, -2, 49, 36, 16, 36, 0));
                J0 = !z ? tL_urlAuthResultRequest.domain : gl.J0(r25Var.b, false);
                if (!TextUtils.isEmpty(J0)) {
                    j.addView(g(context, J0, wjbVar), nme.t(-2, -2, 49, 36, 6, 36, 0));
                }
                TextView textView3 = new TextView(context);
                textView3.setTextSize(1, 14.0f);
                textView3.setGravity(17);
                if (!z) {
                    C.g.getClass();
                    if (!w(r25Var)) {
                        M0 = k96.M0(2131742920, null);
                        textView3.setText(M0);
                        zkb.X(textView3, i4, wjbVar);
                        j.addView(textView3, nme.t(-2, -2, 49, 36, 16, 36, 28));
                        FrameLayout frameLayout2 = new FrameLayout(context);
                        j.addView(frameLayout2, nme.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                        smcVar = new smc(context, R.drawable.wallet_card_qr, 46);
                        smcVar.l(C);
                        isAttachedToWindow = smcVar.isAttachedToWindow();
                        i2 = kk7.c4;
                        if (isAttachedToWindow || (cVar = smcVar.a0) == null) {
                            textView = textView3;
                        } else {
                            textView = textView3;
                            int i5 = smcVar.W;
                            if (i5 != i || cVar != C) {
                                kk7.f(i5).n(smcVar, i2);
                            }
                        }
                        smcVar.W = i;
                        smcVar.a0 = C;
                        if (smcVar.isAttachedToWindow() && smcVar.a0 != null) {
                            kk7.f(i).b(smcVar, i2);
                        }
                        frameLayout2.addView(smcVar);
                        TextView textView4 = new TextView(context);
                        textView4.setTextSize(1, 14.0f);
                        de9.q(textView4, 17, null, 2131742919);
                        zkb.X(textView4, bkb.y6, wjbVar);
                        j.addView(textView4, nme.t(-2, -2, 49, 36, 16, 36, 28));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(0);
                        linearLayout.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                        j.addView(linearLayout, nme.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                        final u41 u41Var = new u41(wjbVar, context, true);
                        u41Var.setRoundRadius(24);
                        u41Var.e();
                        u41Var.setText(k96.M0(2131742936, null));
                        linearLayout.addView(u41Var, nme.m(1.0f, 0, 44, 0, 6, 0));
                        final u41 i6 = yjb.i(24, wjbVar, context, true);
                        i6.setText(k96.M0(2131742921, null));
                        linearLayout.addView(i6, nme.m(1.0f, 0, 44, 6, 0, 0));
                        final cj7 cj7Var = new cj7(context, j, wjbVar);
                        cj7Var.z0 = new p25(i6);
                        final boolean z3 = z;
                        final oo6 oo6Var = new oo6(z3, i6, C, tonconnectsession, r25Var, textView2, be0Var, textView);
                        final ?? r2 = new gk7() { // from class: h25
                            @Override // gk7
                            public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                                if (!z3 && objArr.length > 1) {
                                    Object obj = objArr[1];
                                    if (obj instanceof TL_wallet.tonConnectSession) {
                                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                        if (tonconnectsession2.id == tonconnectsession.id) {
                                            r25Var.e = tonconnectsession2;
                                        }
                                    }
                                }
                                oo6Var.run();
                            }
                        };
                        kk7.f(i).a(r2, i2);
                        oo6Var.run();
                        final boolean[] zArr = {false};
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr3 = inputtonconnectoauthsessionArr;
                        cj7Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i25
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                                kk7.f(i).n(r2, kk7.c4);
                                boolean[] zArr2 = zArr;
                                if (zArr2[0]) {
                                    return;
                                }
                                zArr2[0] = true;
                                if (!z3 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr3[0]) == null) {
                                    runnable.run();
                                } else {
                                    f25Var.a(inputtonconnectoauthsession);
                                }
                            }
                        });
                        cj7Var.show();
                        k.setOnClickListener(new j25(cj7Var, (byte) 0));
                        u41Var.setOnClickListener(new xf3((Object) i6, (Object) cj7Var, (byte) 19));
                        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr4 = inputtonconnectoauthsessionArr;
                        i6.setOnClickListener(new View.OnClickListener() { // from class: k25
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                c cVar2 = C;
                                w25 w25Var = cVar2.g;
                                u41 u41Var2 = u41.this;
                                if (u41Var2.R) {
                                    return;
                                }
                                u41Var2.setLoading(true);
                                u41 u41Var3 = u41Var;
                                byte b = 0;
                                u41Var3.setEnabled(false);
                                ImageView imageView = k;
                                imageView.setEnabled(false);
                                f25 f25Var2 = new f25(u41Var2, u41Var3, imageView, cj7Var, wjbVar, oo6Var);
                                if (!z3) {
                                    w25Var.getClass();
                                    gl.c3(new jf4((Object) w25Var, (Object) r25Var, (Object) f25Var2, (byte) 14));
                                    return;
                                }
                                String x = cVar2.x();
                                byte[] D = cVar2.D();
                                byte[] bArr = D == null ? null : (byte[]) D.clone();
                                ae2 ae2Var = new ae2((Object) inputtonconnectoauthsessionArr4, (Object) f25Var2, (byte) 22);
                                w25Var.getClass();
                                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                                    ae2Var.a(null, "Missing wallet login request data");
                                    return;
                                }
                                try {
                                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                                    tonconnectcreatesession.manifest_url = b00.j(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                                    w25Var.f.sendRequestTyped(tonconnectcreatesession, new hc(b), new v15(w25Var, (Object) ae2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                                } catch (JSONException e) {
                                    ae2Var.a(null, w25.h("prepare OAuth request", e));
                                }
                            }
                        });
                        return cj7Var;
                    }
                }
                M0 = k96.M0(2131742918, null);
                textView3.setText(M0);
                zkb.X(textView3, i4, wjbVar);
                j.addView(textView3, nme.t(-2, -2, 49, 36, 16, 36, 28));
                FrameLayout frameLayout22 = new FrameLayout(context);
                j.addView(frameLayout22, nme.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
                smcVar = new smc(context, R.drawable.wallet_card_qr, 46);
                smcVar.l(C);
                isAttachedToWindow = smcVar.isAttachedToWindow();
                i2 = kk7.c4;
                if (isAttachedToWindow) {
                }
                textView = textView3;
                smcVar.W = i;
                smcVar.a0 = C;
                if (smcVar.isAttachedToWindow()) {
                    kk7.f(i).b(smcVar, i2);
                }
                frameLayout22.addView(smcVar);
                TextView textView42 = new TextView(context);
                textView42.setTextSize(1, 14.0f);
                de9.q(textView42, 17, null, 2131742919);
                zkb.X(textView42, bkb.y6, wjbVar);
                j.addView(textView42, nme.t(-2, -2, 49, 36, 16, 36, 28));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
                j.addView(linearLayout2, nme.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
                final u41 u41Var2 = new u41(wjbVar, context, true);
                u41Var2.setRoundRadius(24);
                u41Var2.e();
                u41Var2.setText(k96.M0(2131742936, null));
                linearLayout2.addView(u41Var2, nme.m(1.0f, 0, 44, 0, 6, 0));
                final u41 i62 = yjb.i(24, wjbVar, context, true);
                i62.setText(k96.M0(2131742921, null));
                linearLayout2.addView(i62, nme.m(1.0f, 0, 44, 6, 0, 0));
                final cj7 cj7Var2 = new cj7(context, j, wjbVar);
                cj7Var2.z0 = new p25(i62);
                final boolean z32 = z;
                final oo6 oo6Var2 = new oo6(z32, i62, C, tonconnectsession, r25Var, textView2, be0Var, textView);
                final h25 r22 = new gk7() { // from class: h25
                    @Override // gk7
                    public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                        if (!z32 && objArr.length > 1) {
                            Object obj = objArr[1];
                            if (obj instanceof TL_wallet.tonConnectSession) {
                                TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                                if (tonconnectsession2.id == tonconnectsession.id) {
                                    r25Var.e = tonconnectsession2;
                                }
                            }
                        }
                        oo6Var2.run();
                    }
                };
                kk7.f(i).a(r22, i2);
                oo6Var2.run();
                final boolean[] zArr2 = {false};
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr32 = inputtonconnectoauthsessionArr;
                cj7Var2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i25
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                        kk7.f(i).n(r22, kk7.c4);
                        boolean[] zArr22 = zArr2;
                        if (zArr22[0]) {
                            return;
                        }
                        zArr22[0] = true;
                        if (!z32 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr32[0]) == null) {
                            runnable.run();
                        } else {
                            f25Var.a(inputtonconnectoauthsession);
                        }
                    }
                });
                cj7Var2.show();
                k.setOnClickListener(new j25(cj7Var2, (byte) 0));
                u41Var2.setOnClickListener(new xf3((Object) i62, (Object) cj7Var2, (byte) 19));
                final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr42 = inputtonconnectoauthsessionArr;
                i62.setOnClickListener(new View.OnClickListener() { // from class: k25
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        c cVar2 = C;
                        w25 w25Var = cVar2.g;
                        u41 u41Var22 = u41.this;
                        if (u41Var22.R) {
                            return;
                        }
                        u41Var22.setLoading(true);
                        u41 u41Var3 = u41Var2;
                        byte b = 0;
                        u41Var3.setEnabled(false);
                        ImageView imageView = k;
                        imageView.setEnabled(false);
                        f25 f25Var2 = new f25(u41Var22, u41Var3, imageView, cj7Var2, wjbVar, oo6Var2);
                        if (!z32) {
                            w25Var.getClass();
                            gl.c3(new jf4((Object) w25Var, (Object) r25Var, (Object) f25Var2, (byte) 14));
                            return;
                        }
                        String x = cVar2.x();
                        byte[] D = cVar2.D();
                        byte[] bArr = D == null ? null : (byte[]) D.clone();
                        ae2 ae2Var = new ae2((Object) inputtonconnectoauthsessionArr42, (Object) f25Var2, (byte) 22);
                        w25Var.getClass();
                        TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                        if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                            ae2Var.a(null, "Missing wallet login request data");
                            return;
                        }
                        try {
                            JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                            TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                            tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                            tonconnectcreatesession.manifest_url = b00.j(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                            w25Var.f.sendRequestTyped(tonconnectcreatesession, new hc(b), new v15(w25Var, (Object) ae2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                        } catch (JSONException e) {
                            ae2Var.a(null, w25.h("prepare OAuth request", e));
                        }
                    }
                });
                return cj7Var2;
            }
        }
        z = z2;
        inputtonconnectoauthsessionArr = inputtonconnectoauthsessionArr2;
        frameLayout.addView(be0Var, nme.d(76, 76.0f, 49, 0.0f, 32.0f, 0.0f, 0.0f));
        j.addView(frameLayout, nme.o(-1, -2));
        TextView textView22 = new TextView(context);
        textView22.setTypeface(gl.o());
        textView22.setTextSize(1, 20.0f);
        textView22.setGravity(17);
        if (z) {
        }
        zkb.X(textView22, i4, wjbVar);
        j.addView(textView22, nme.t(-2, -2, 49, 36, 16, 36, 0));
        if (!z) {
        }
        if (!TextUtils.isEmpty(J0)) {
        }
        TextView textView32 = new TextView(context);
        textView32.setTextSize(1, 14.0f);
        textView32.setGravity(17);
        if (!z) {
        }
        M0 = k96.M0(2131742918, null);
        textView32.setText(M0);
        zkb.X(textView32, i4, wjbVar);
        j.addView(textView32, nme.t(-2, -2, 49, 36, 16, 36, 28));
        FrameLayout frameLayout222 = new FrameLayout(context);
        j.addView(frameLayout222, nme.k(0.0f, -12.0f, 0.0f, -12.0f, -1, -2));
        smcVar = new smc(context, R.drawable.wallet_card_qr, 46);
        smcVar.l(C);
        isAttachedToWindow = smcVar.isAttachedToWindow();
        i2 = kk7.c4;
        if (isAttachedToWindow) {
        }
        textView = textView32;
        smcVar.W = i;
        smcVar.a0 = C;
        if (smcVar.isAttachedToWindow()) {
        }
        frameLayout222.addView(smcVar);
        TextView textView422 = new TextView(context);
        textView422.setTextSize(1, 14.0f);
        de9.q(textView422, 17, null, 2131742919);
        zkb.X(textView422, bkb.y6, wjbVar);
        j.addView(textView422, nme.t(-2, -2, 49, 36, 16, 36, 28));
        LinearLayout linearLayout22 = new LinearLayout(context);
        linearLayout22.setOrientation(0);
        linearLayout22.setPadding(gl.L(16.0f), 0, gl.L(16.0f), 0);
        j.addView(linearLayout22, nme.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        final u41 u41Var22 = new u41(wjbVar, context, true);
        u41Var22.setRoundRadius(24);
        u41Var22.e();
        u41Var22.setText(k96.M0(2131742936, null));
        linearLayout22.addView(u41Var22, nme.m(1.0f, 0, 44, 0, 6, 0));
        final u41 i622 = yjb.i(24, wjbVar, context, true);
        i622.setText(k96.M0(2131742921, null));
        linearLayout22.addView(i622, nme.m(1.0f, 0, 44, 6, 0, 0));
        final cj7 cj7Var22 = new cj7(context, j, wjbVar);
        cj7Var22.z0 = new p25(i622);
        final boolean z322 = z;
        final oo6 oo6Var22 = new oo6(z322, i622, C, tonconnectsession, r25Var, textView22, be0Var, textView);
        final h25 r222 = new gk7() { // from class: h25
            @Override // gk7
            public final void didReceivedNotification(int i7, int i8, Object[] objArr) {
                if (!z322 && objArr.length > 1) {
                    Object obj = objArr[1];
                    if (obj instanceof TL_wallet.tonConnectSession) {
                        TL_wallet.tonConnectSession tonconnectsession2 = (TL_wallet.tonConnectSession) obj;
                        if (tonconnectsession2.id == tonconnectsession.id) {
                            r25Var.e = tonconnectsession2;
                        }
                    }
                }
                oo6Var22.run();
            }
        };
        kk7.f(i).a(r222, i2);
        oo6Var22.run();
        final boolean[] zArr22 = {false};
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr322 = inputtonconnectoauthsessionArr;
        cj7Var22.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: i25
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                TL_wallet.inputTonConnectOauthSession inputtonconnectoauthsession;
                kk7.f(i).n(r222, kk7.c4);
                boolean[] zArr222 = zArr22;
                if (zArr222[0]) {
                    return;
                }
                zArr222[0] = true;
                if (!z322 || (inputtonconnectoauthsession = inputtonconnectoauthsessionArr322[0]) == null) {
                    runnable.run();
                } else {
                    f25Var.a(inputtonconnectoauthsession);
                }
            }
        });
        cj7Var22.show();
        k.setOnClickListener(new j25(cj7Var22, (byte) 0));
        u41Var22.setOnClickListener(new xf3((Object) i622, (Object) cj7Var22, (byte) 19));
        final TL_wallet.inputTonConnectOauthSession[] inputtonconnectoauthsessionArr422 = inputtonconnectoauthsessionArr;
        i622.setOnClickListener(new View.OnClickListener() { // from class: k25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c cVar2 = C;
                w25 w25Var = cVar2.g;
                u41 u41Var222 = u41.this;
                if (u41Var222.R) {
                    return;
                }
                u41Var222.setLoading(true);
                u41 u41Var3 = u41Var22;
                byte b = 0;
                u41Var3.setEnabled(false);
                ImageView imageView = k;
                imageView.setEnabled(false);
                f25 f25Var2 = new f25(u41Var222, u41Var3, imageView, cj7Var22, wjbVar, oo6Var22);
                if (!z322) {
                    w25Var.getClass();
                    gl.c3(new jf4((Object) w25Var, (Object) r25Var, (Object) f25Var2, (byte) 14));
                    return;
                }
                String x = cVar2.x();
                byte[] D = cVar2.D();
                byte[] bArr = D == null ? null : (byte[]) D.clone();
                ae2 ae2Var = new ae2((Object) inputtonconnectoauthsessionArr422, (Object) f25Var2, (byte) 22);
                w25Var.getClass();
                TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest2 = tL_urlAuthResultRequest;
                if (!tL_urlAuthResultRequest2.request_wallet || tL_urlAuthResultRequest2.bot == null || TextUtils.isEmpty(tL_urlAuthResultRequest2.domain) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 512) || !TLObject.hasFlag(tL_urlAuthResultRequest2.flags, 1024) || TextUtils.isEmpty(tL_urlAuthResultRequest2.tc_client_id) || x == null || bArr == null) {
                    ae2Var.a(null, "Missing wallet login request data");
                    return;
                }
                try {
                    JSONArray put = new JSONArray().put(new JSONObject().put("name", "ton_addr")).put(new JSONObject().put("name", "ton_proof").put("payload", "tc-login:" + tL_urlAuthResultRequest2.bot.id + ":" + tL_urlAuthResultRequest2.tc_client_id + ":" + tL_urlAuthResultRequest2.tc_session_id));
                    TL_wallet.tonConnectCreateSession tonconnectcreatesession = new TL_wallet.tonConnectCreateSession();
                    tonconnectcreatesession.dapp_client_id = tL_urlAuthResultRequest2.tc_client_id;
                    tonconnectcreatesession.manifest_url = b00.j(new StringBuilder("https://"), tL_urlAuthResultRequest2.domain, "/tonconnect-manifest.json");
                    w25Var.f.sendRequestTyped(tonconnectcreatesession, new hc(b), new v15(w25Var, (Object) ae2Var, (TLObject) tL_urlAuthResultRequest2, x, bArr, (Object) put, (byte) 2));
                } catch (JSONException e) {
                    ae2Var.a(null, w25.h("prepare OAuth request", e));
                }
            }
        });
        return cj7Var22;
    }

    public static LinearLayout F(Context context, String str, wjb wjbVar) {
        LinearLayout j = de9.j(context, 1);
        int L = gl.L(16.0f);
        int i = bkb.c6;
        ShapeDrawable b0 = bkb.b0(L, bkb.v0(i, wjbVar));
        vkb M = zkb.M(i);
        j.setBackground(b0);
        zkb.j(j, b0, M, null, wjbVar);
        ld5 ld5Var = new ld5(context, wjbVar);
        ld5Var.setText(str);
        j.addView(ld5Var, nme.o(-1, -2));
        return j;
    }

    public static void G(String str, JSONObject jSONObject) {
        H(str, jSONObject);
        switch (x(TeXSymbolParser.TYPE_ATTR, jSONObject)) {
            case "binary":
                String x = x("bytes", jSONObject);
                if (!x.matches("[A-Za-z0-9+/]*={0,2}") || !Base64.encodeToString(Base64.decode(x, 2), 2).replace("=", "").equals(x.replace("=", ""))) {
                    w26.j("Invalid base64 data");
                    break;
                }
                break;
            case "cell":
                x("schema", jSONObject);
                if (!WalletEngine2.isValidCellBoc(x("cell", jSONObject))) {
                    w26.j("Invalid data cell");
                    break;
                }
                break;
            case "text":
                x("text", jSONObject);
                break;
            default:
                w26.j("Unknown signing data type");
                break;
        }
    }

    public static void H(String str, JSONObject jSONObject) {
        if (jSONObject.has("network") && !"-239".equals(x("network", jSONObject))) {
            w26.j("Wrong network");
        } else {
            if (!jSONObject.has("from") || WalletEngine2.sameTonConnectAddress(x("from", jSONObject), str)) {
                return;
            }
            w26.j("Wrong signer");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() <= 4294967295L) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void I(JSONObject jSONObject, String str, int i) {
        H(str, jSONObject);
        if (jSONObject.has("valid_until")) {
            Object obj = jSONObject.get("valid_until");
            if (obj instanceof Number) {
                Number number = (Number) obj;
                if (number.doubleValue() == number.longValue()) {
                    if (number.longValue() > i) {
                    }
                }
            }
            w26.j("Invalid or expired transaction");
            return;
        }
        if (jSONObject.has("items")) {
            w26.j("Structured transactions are not supported");
            return;
        }
        long optLong = jSONObject.optLong("valid_until", 0L);
        JSONArray jSONArray = jSONObject.getJSONArray("messages");
        if (jSONArray.length() == 0 || jSONArray.length() > 255 || optLong < 0) {
            throw new JSONException("Invalid transaction");
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        long j = 0;
        while (i2 < jSONArray.length()) {
            u25 u25Var = new u25(jSONArray.getJSONObject(i2));
            long j2 = u25Var.e;
            long j3 = j + j2;
            if (!((j2 ^ j) < 0) && !((j ^ j3) >= 0)) {
                throw new ArithmeticException();
            }
            arrayList.add(u25Var);
            i2++;
            j = j3;
        }
        DesugarCollections.unmodifiableList(arrayList);
    }

    public static SpannableStringBuilder a(long j) {
        String s = c.s(j, true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s);
        int indexOf = s.indexOf(46);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.6875f), indexOf, spannableStringBuilder.length(), 33);
        }
        if (spannableStringBuilder.length() == 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != 'x') {
            spannableStringBuilder.append((CharSequence) " x");
        }
        cm2 cm2Var = new cm2(R.drawable.wallet_gram_small, 2);
        cm2Var.d = false;
        cm2Var.c(gl.L(16.0f));
        spannableStringBuilder.setSpan(cm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static LinearLayout b(Context context, CharSequence charSequence, CharSequence charSequence2, SpannableStringBuilder spannableStringBuilder, String str, wjb wjbVar) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(gl.L(12.0f), gl.L(5.0f), gl.L(12.0f), gl.L(5.0f));
        ImageView imageView = new ImageView(context);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{-14899731, -15431455});
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        imageView.setImageResource(R.drawable.mini_gram_24);
        imageView.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
        linearLayout.addView(imageView, nme.q(46, 46, 0.0f, 16, 0, 0, 12, 0));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(48);
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 16.0f);
        int i = bkb.F6;
        zkb.X(textView, i, wjbVar);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setText(charSequence);
        LinearLayout.LayoutParams o = nme.o(-1, -2);
        o.weight = 0.0f;
        linearLayout2.addView(textView, o);
        if (!TextUtils.isEmpty(charSequence2)) {
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            zkb.X(textView2, bkb.y6, wjbVar);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setText(charSequence2);
            linearLayout2.addView(textView2, nme.k(0.0f, 3.0f, 0.0f, 0.0f, -1, -2));
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView3 = new TextView(context);
            m17 m17Var = new m17(0, false, false, null);
            m17Var.x = false;
            m17Var.w = Integer.valueOf(bkb.v0(bkb.Zl, wjbVar));
            textView3.setBackground(m17Var);
            textView3.setPadding(gl.L(19.0f), gl.L(9.0f), gl.L(15.0f), gl.L(8.0f));
            textView3.setTextSize(1, 15.0f);
            zkb.X(textView3, i, wjbVar);
            textView3.setMaxLines(2);
            textView3.setText(str);
            linearLayout2.addView(textView3, nme.k(0.0f, 6.0f, 0.0f, 0.0f, -2, -2));
        }
        linearLayout.addView(linearLayout2, nme.p(0, -2, 1.0f, 16));
        if (!TextUtils.isEmpty(spannableStringBuilder)) {
            TextView textView4 = new TextView(context);
            textView4.setTypeface(gl.o());
            textView4.setTextSize(1, 14.0f);
            textView4.setGravity(21);
            textView4.setText(spannableStringBuilder);
            if (spannableStringBuilder.toString().startsWith("+")) {
                i = bkb.kk;
            }
            zkb.X(textView4, i, wjbVar);
            linearLayout.addView(textView4, nme.q(-2, -2, 0.0f, 16, 8, 0, 0, 0));
        }
        return linearLayout;
    }

    public static JSONObject f(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, byte[] bArr2, int i) {
        if (tonconnectsession.client_id == null) {
            w26.j("Missing registered session key");
            return null;
        }
        JSONObject jSONObject = new JSONObject(WalletEngine2.tonConnectCrypto(y05Var, tonconnectsession, str, bArr, new JSONObject().put("decrypt", Base64.encodeToString(bArr2, 2))).getString("plaintext"));
        Object obj = jSONObject.get("id");
        if (!(obj instanceof String) || !((String) obj).matches("[\\x20-\\x7e]{1,100}")) {
            w26.j("Request ID must contain 1–100 printable ASCII characters");
            return null;
        }
        try {
            String string = jSONObject.getString("method");
            JSONArray jSONArray = jSONObject.getJSONArray("params");
            if ("disconnect".equals(string)) {
                if (jSONArray.length() != 0) {
                    throw new IllegalArgumentException("Disconnect takes no parameters");
                }
            } else if ("sendTransaction".equals(string) || "signMessage".equals(string)) {
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON transaction parameter");
                }
                JSONObject jSONObject2 = new JSONObject(jSONArray.getString(0));
                I(jSONObject2, str, i);
                jSONObject.put("transaction", jSONObject2);
            } else if (!"signData".equals(string)) {
                jSONObject.put("errorCode", 400).put("errorMessage", "Method is not supported");
            } else {
                if (jSONArray.length() != 1 || !(jSONArray.get(0) instanceof String)) {
                    throw new IllegalArgumentException("Expected one JSON data parameter");
                }
                JSONObject jSONObject3 = new JSONObject(jSONArray.getString(0));
                G(str, jSONObject3);
                jSONObject.put("data", jSONObject3);
            }
        } catch (Exception e) {
            jSONObject.put("errorCode", 1).put("errorMessage", e.getMessage());
        }
        if (tonconnectsession.closed || tonconnectsession.closing || tonconnectsession.pending || tonconnectsession.manifest == null) {
            jSONObject.put("errorCode", 100).put("errorMessage", "Unknown app");
        }
        return jSONObject;
    }

    public static TextView g(Context context, String str, wjb wjbVar) {
        TextView textView = new TextView(context);
        ug8.v(textView, 1, 14.0f);
        zkb.X(textView, bkb.Ei, wjbVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        textView.setText(spannableStringBuilder);
        return textView;
    }

    public static String h(String str, Exception exc) {
        fa4.e("[gram-wallet] TON Connect ".concat(str), exc);
        String message = exc.getMessage();
        return (message == null || message.isEmpty()) ? exc.getClass().getSimpleName() : message;
    }

    public static SpannableStringBuilder j(long j) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString("GRAM");
        spannableString.setSpan(new cm2(R.drawable.wallet_gram_large, 0), 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString).append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) c.s(-j, true)).append((CharSequence) " ");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) k96.M0(2131749341, null));
        spannableStringBuilder.setSpan(new ForegroundColorSpan(-9577217), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public static String k(long j, long j2) {
        StringBuilder o = ug8.o(j, "tonconnect_reply.", ".");
        o.append(j2);
        return o.toString();
    }

    public static void m(String str, String str2) {
        if (str2 != null) {
            fa4.d("[gram-wallet] TON Connect " + str + ": " + str2);
        }
    }

    public static String n(String str) {
        URI create = URI.create(str);
        if ("https".equalsIgnoreCase(create.getScheme()) && create.getHost() != null) {
            return create.getHost().toLowerCase(Locale.ROOT);
        }
        w26.j("Manifest URL must use HTTPS and include a host");
        return null;
    }

    public static void q(Context context, int i, long j, int i2, wjb wjbVar, t36 t36Var) {
        c C = c.C(i);
        w25 w25Var = C.g;
        u15 u15Var = new u15(context, i, C, wjbVar, t36Var);
        if (w25Var.h || w25Var.g != null) {
            u15Var.a(null, "A TON Connect request is already open");
            return;
        }
        String string = na7.q1(w25Var.a).X3.getString(k(j, i2), null);
        if (string == null) {
            w25Var.h = true;
            w25Var.b.x0(new o57((Object) w25Var, j, (Object) u15Var, i2, (byte) 6));
            return;
        }
        w25Var.h = true;
        x15 x15Var = new x15(w25Var, u15Var, (byte) 0);
        try {
            w25Var.E(j, i2, new JSONObject(string), x15Var);
        } catch (Exception e) {
            x15Var.a(h("restore response", e));
        }
    }

    public static t25 r(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, String str2, String str3, String str4, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject = new JSONObject(str2);
        if (!str3.equals(jSONObject.getString("manifestUrl"))) {
            w26.j("Manifest URL changed");
            return null;
        }
        String n = n(str3);
        TL_wallet.tonConnectManifest tonconnectmanifest = tonconnectsession.manifest;
        if (tonconnectmanifest != null && n.equals(n(tonconnectmanifest.url))) {
            return s(y05Var, tonconnectsession, str, bArr, jSONObject.getJSONArray("items"), n, str4, tonconnectchallenge, i);
        }
        w26.j("Manifest domain does not match the connection request");
        return null;
    }

    public static t25 s(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, JSONArray jSONArray, String str2, String str3, TL_wallet.tonConnectChallenge tonconnectchallenge, int i) {
        JSONObject jSONObject;
        String str4;
        int i2;
        String str5;
        String str6;
        y05 y05Var2 = y05Var;
        JSONArray jSONArray2 = jSONArray;
        if (jSONArray2.length() == 0) {
            w26.j("Empty connect request");
            return null;
        }
        String str7 = "account";
        JSONObject put = new JSONObject().put("account", tonconnectchallenge != null);
        HashSet hashSet = new HashSet();
        int i3 = 0;
        while (true) {
            String str8 = "ton_proof";
            TL_wallet.walletOwnershipProof walletownershipproof = null;
            String str9 = "ton_addr";
            if (i3 >= jSONArray2.length()) {
                if (!hashSet.contains("ton_addr")) {
                    w26.j("Missing ton_addr item");
                    return null;
                }
                if (tonconnectchallenge != null) {
                    put.put("challenge", Base64.encodeToString(tonconnectchallenge.challenge, 2));
                }
                JSONObject jSONObject2 = WalletEngine2.tonConnectCrypto(y05Var2, tonconnectsession, str, bArr, put);
                if (tonconnectchallenge == null) {
                    return new t25(jSONObject2);
                }
                if (tonconnectchallenge.event_id < 0) {
                    w26.j("Invalid connect event ID");
                    return null;
                }
                JSONArray jSONArray3 = new JSONArray();
                int i4 = 0;
                while (i4 < jSONArray2.length()) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i4);
                    String string = jSONObject3.getString("name");
                    if (str9.equals(string)) {
                        jSONArray3.put(jSONObject2.getJSONObject(str7));
                        jSONObject = jSONObject2;
                        str4 = str9;
                        i2 = i4;
                        str5 = str7;
                        str6 = str8;
                    } else if (str8.equals(string)) {
                        String string2 = jSONObject3.getString("payload");
                        str4 = str9;
                        i2 = i4;
                        JSONObject jSONObject4 = WalletEngine2.tonConnectCrypto(y05Var2, tonconnectsession, str, bArr, new JSONObject().put("proofDomain", str2).put("proofPayload", string2).put("timestamp", i));
                        str5 = str7;
                        TL_wallet.walletOwnershipProof walletownershipproof2 = new TL_wallet.walletOwnershipProof();
                        walletownershipproof2.timestamp = i;
                        str6 = str8;
                        jSONObject = jSONObject2;
                        walletownershipproof2.signature = Base64.decode(jSONObject4.getString("signature"), 2);
                        jSONArray3.put(new JSONObject().put("name", string).put("proof", new JSONObject().put("timestamp", i).put("domain", new JSONObject().put("lengthBytes", str2.getBytes(StandardCharsets.UTF_8).length).put("value", str2)).put("payload", string2).put("signature", jSONObject4.getString("signature"))));
                        walletownershipproof = walletownershipproof2;
                    } else {
                        jSONObject = jSONObject2;
                        str4 = str9;
                        i2 = i4;
                        str5 = str7;
                        str6 = str8;
                        jSONArray3.put(new JSONObject().put("name", string).put("error", new JSONObject().put("code", 400).put("message", "Method is not supported")));
                    }
                    i4 = i2 + 1;
                    y05Var2 = y05Var;
                    jSONArray2 = jSONArray;
                    str9 = str4;
                    str7 = str5;
                    str8 = str6;
                    jSONObject2 = jSONObject;
                }
                JSONObject jSONObject5 = jSONObject2;
                JSONObject put2 = new JSONObject().put("event", "connect").put("id", tonconnectchallenge.event_id).put("payload", new JSONObject().put("items", jSONArray3).put("device", new JSONObject().put("platform", "android").put("appName", "telegram").put("appVersion", w01.c).put("maxProtocolVersion", 2).put("features", new JSONArray().put(new JSONObject().put("name", "SendTransaction").put("maxMessages", kk7.d4)).put(new JSONObject().put("name", "SignMessage").put("maxMessages", kk7.d4)).put(new JSONObject().put("name", "SignData").put("types", new JSONArray().put("text").put("binary").put("cell"))))));
                if (str3 != null) {
                    put2.put("response", new JSONObject().put("error", new JSONObject().put("code", 400).put("message", "Embedded request is not supported")));
                }
                JSONObject jSONObject6 = WalletEngine2.tonConnectCrypto(y05Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", put2));
                jSONObject6.put("challengeAnswer", jSONObject5.getString("challengeAnswer"));
                t25 t25Var = new t25(jSONObject6);
                t25Var.d = walletownershipproof;
                return t25Var;
            }
            JSONObject jSONObject7 = jSONArray2.getJSONObject(i3);
            int i5 = i3;
            if (!hashSet.add(jSONObject7.getString("name"))) {
                w26.j("Duplicate connect item");
                return null;
            }
            if ("ton_addr".equals(jSONObject7.getString("name")) && jSONObject7.has("network") && !"-239".equals(jSONObject7.getString("network"))) {
                w26.j("Requested network does not match the wallet network");
                return null;
            }
            if ("ton_proof".equals(jSONObject7.getString("name"))) {
                if (str2.replaceFirst("\\.$", "").equals("telegram.org")) {
                    w26.j("The telegram.org proof domain is reserved for wallet import");
                    return null;
                }
                jSONObject7.getString("payload");
            }
            i3 = i5 + 1;
        }
    }

    public static t25 t(y05 y05Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr, long j) {
        if (j < 0 || tonconnectsession.client_id == null) {
            w26.j("Invalid disconnect session or event ID");
            return null;
        }
        return new t25(WalletEngine2.tonConnectCrypto(y05Var, tonconnectsession, str, bArr, new JSONObject().put("encrypt", new JSONObject().put("event", "disconnect").put("id", j).put("payload", new JSONObject()))));
    }

    public static TextView v(Context context, CharSequence charSequence, int i, wjb wjbVar) {
        TextView textView = new TextView(context);
        textView.setText(charSequence);
        textView.setTextSize(1, i);
        zkb.X(textView, bkb.F6, wjbVar);
        textView.setGravity(17);
        return textView;
    }

    public static boolean w(r25 r25Var) {
        if (r25Var != null) {
            try {
                JSONArray jSONArray = new JSONObject(r25Var.a).getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if ("ton_proof".equals(jSONArray.getJSONObject(i).optString("name"))) {
                        return true;
                    }
                }
            } catch (Exception e) {
                h("read proof request", e);
            }
        }
        return false;
    }

    public static String x(String str, JSONObject jSONObject) {
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        w26.j(str.concat(" must be a string"));
        return null;
    }

    public static String z(TLRPC.TL_error tL_error, String str) {
        String str2;
        if (tL_error == null) {
            str2 = str.concat(" returned an empty or unsuccessful response");
        } else {
            str2 = tL_error.text;
            if (str2 == null) {
                str2 = "RPC error " + tL_error.code;
            }
        }
        StringBuilder p = ug8.p("[gram-wallet] TON Connect ", str, ": ");
        p.append(tL_error == null ? "" : de9.l(new StringBuilder("code="), tL_error.code, " "));
        p.append(str2);
        fa4.d(p.toString());
        return str2;
    }

    public final boolean A(s25 s25Var) {
        if (s25Var.q) {
            return false;
        }
        String str = s25Var.h;
        c cVar = this.b;
        return Objects.equals(str, cVar.x()) && Arrays.equals(s25Var.g, cVar.D());
    }

    public final void B(s25 s25Var, y05 y05Var, p8c p8cVar) {
        WalletEngine2 walletEngine2 = this.b.b;
        if (walletEngine2 != null) {
            boolean A = A(s25Var);
            int i = s25Var.b;
            TL_wallet.tonConnectSession tonconnectsession = s25Var.a;
            if (A && !i(s25Var)) {
                String string = na7.q1(this.a).X3.getString(k(tonconnectsession.id, i).concat(".transfer"), null);
                if (string == null) {
                    walletEngine2.prepareTonConnectTransfer(y05Var, s25Var.f, "ton-connect:" + tonconnectsession.id + ":" + i, new eu0((Object) this, (Object) s25Var, (Object) y05Var, (Object) p8cVar, (byte) 9));
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    TL_wallet.sendTransfer sendtransfer = new TL_wallet.sendTransfer();
                    sendtransfer.user_id = new TLRPC.TL_inputUserEmpty();
                    sendtransfer.data_normal = Base64.decode(jSONObject.getString("boc"), 2);
                    sendtransfer.random_id = jSONObject.getLong("randomId");
                    this.f.sendRequestTyped(sendtransfer, new hc((byte) 0), new jl1(this, p8cVar, s25Var, y05Var, sendtransfer, (byte) 6));
                    return;
                } catch (Exception e) {
                    p8cVar.a(h("restore transfer", e));
                    return;
                }
            }
        }
        y(s25Var, y05Var, null, 0, "Wallet unavailable or request expired", p8cVar);
    }

    public final void E(long j, int i, JSONObject jSONObject, p8c p8cVar) {
        TL_wallet.tonConnectSubmitResponse tonconnectsubmitresponse = new TL_wallet.tonConnectSubmitResponse();
        tonconnectsubmitresponse.session_id = j;
        tonconnectsubmitresponse.msg_id = i;
        tonconnectsubmitresponse.trace_id = jSONObject.optString("traceId", null);
        tonconnectsubmitresponse.body = Base64.decode(jSONObject.optString("body"), 2);
        this.f.sendRequestTyped(tonconnectsubmitresponse, new hc((byte) 0), new yg(this, p8cVar, jSONObject, j, i));
    }

    public final boolean c(r25 r25Var, TL_wallet.tonConnectSession tonconnectsession, String str, byte[] bArr) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectSession tonconnectsession2 = r25Var.e;
        if (tonconnectsession2.closed || tonconnectsession2.closing || tonconnectsession2.manifest_error != null || (tonconnectmanifest = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectsession.manifest.url) || !Objects.equals(r25Var.e.manifest.name, tonconnectsession.manifest.name)) {
            return false;
        }
        TLRPC.WebDocument webDocument = r25Var.e.manifest.icon;
        TLRPC.WebDocument webDocument2 = tonconnectsession.manifest.icon;
        if ((webDocument != webDocument2 && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))) || !Arrays.equals(r25Var.e.nonce, tonconnectsession.nonce)) {
            return false;
        }
        c cVar = this.b;
        return str.equals(cVar.x()) && Arrays.equals(bArr, cVar.D());
    }

    public final void d(int i, long j, p8c p8cVar) {
        long j2 = i;
        na7.q1(this.a).X3.edit().remove(k(j, j2)).remove(k(j, j2).concat(".transfer")).apply();
        s25 s25Var = this.g;
        if (s25Var != null && s25Var.a.id == j && s25Var.b == i) {
            s25Var.n = true;
        }
        p8cVar.a(null);
    }

    public final void e(s25 s25Var, boolean z, p8c p8cVar) {
        boolean z2 = s25Var.m;
        TL_wallet.tonConnectSession tonconnectsession = s25Var.a;
        if (z2) {
            return;
        }
        if (s25Var.n || i(s25Var) || !A(s25Var) || !(z || s25Var.l >= 0 || "disconnect".equals(s25Var.e) || s25Var.p)) {
            p8cVar.a("Request expired, was processed, or the wallet changed");
            return;
        }
        s25Var.m = true;
        ht htVar = new ht(this, s25Var, p8cVar, (byte) 21);
        String string = na7.q1(this.a).X3.getString(k(tonconnectsession.id, s25Var.b), null);
        if (string == null) {
            this.b.E(true, false, false, new k05(this, htVar, s25Var, z, (byte) 1));
            return;
        }
        try {
            try {
                E(tonconnectsession.id, s25Var.b, new JSONObject(string), htVar);
            } catch (Exception e) {
                e = e;
                htVar = htVar;
                htVar.a(h("restore response", e));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final boolean i(s25 s25Var) {
        long currentTime = this.f.getCurrentTime();
        if (s25Var.c <= currentTime) {
            return true;
        }
        v25 v25Var = s25Var.f;
        if (v25Var == null) {
            return false;
        }
        long j = v25Var.a;
        return j != 0 && j <= currentTime;
    }

    public final /* synthetic */ void l(TL_wallet.tonConnectSession tonconnectsession, String str, w52 w52Var) {
        if (this.c.remove(Long.valueOf(tonconnectsession.id))) {
            if (str == null) {
                Collection.-EL.removeIf(this.d, new w15(tonconnectsession, (byte) 1));
                this.b.S();
            }
            w52Var.a(str);
        }
    }

    public final void o(int i, long j) {
        s25 s25Var = this.g;
        if (s25Var == null || s25Var.a.id != j || s25Var.b != i || s25Var.m) {
            return;
        }
        s25Var.n = true;
        Runnable runnable = s25Var.r;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void p(TL_wallet.tonConnectSession tonconnectsession) {
        TL_wallet.tonConnectManifest tonconnectmanifest;
        TL_wallet.tonConnectManifest tonconnectmanifest2;
        TLRPC.WebDocument webDocument;
        TLRPC.WebDocument webDocument2;
        w15 w15Var = new w15(tonconnectsession, (byte) 0);
        ArrayList arrayList = this.d;
        Collection.-EL.removeIf(arrayList, w15Var);
        if (!tonconnectsession.closed) {
            arrayList.add(tonconnectsession);
        }
        s25 s25Var = this.g;
        if (s25Var != null) {
            TL_wallet.tonConnectSession tonconnectsession2 = s25Var.a;
            if (tonconnectsession2.id == tonconnectsession.id && (tonconnectsession.closed || tonconnectsession.closing || !Objects.equals(tonconnectsession.client_id, tonconnectsession2.client_id) || !Arrays.equals(tonconnectsession.nonce, tonconnectsession2.nonce) || (tonconnectmanifest = tonconnectsession.manifest) == null || (tonconnectmanifest2 = tonconnectsession2.manifest) == null || !Objects.equals(tonconnectmanifest.url, tonconnectmanifest2.url) || !Objects.equals(tonconnectsession.manifest.name, tonconnectsession2.manifest.name) || ((webDocument = tonconnectsession.manifest.icon) != (webDocument2 = tonconnectsession2.manifest.icon) && (webDocument == null || webDocument2 == null || !Objects.equals(webDocument.url, webDocument2.url))))) {
                s25Var.q = true;
                o(s25Var.b, tonconnectsession.id);
            }
        }
        kk7.f(this.a).k(kk7.c4, this.b, tonconnectsession);
    }

    public final void u(s25 s25Var) {
        s25Var.r = null;
        if (s25Var.m || this.g != s25Var) {
            return;
        }
        this.g = null;
    }

    public final void y(s25 s25Var, y05 y05Var, Object obj, int i, String str, p8c p8cVar) {
        Utilities.e.c(new qt((Object) this, (Object) s25Var, i, obj, (Object) str, (Object) y05Var, (Object) p8cVar, (byte) 6));
    }
}
