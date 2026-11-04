package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rw implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rw(int i3, org.telegram.messenger.u10 u10Var, org.telegram.ui.Wallet.k0 k0Var) {
        this.a = 15;
        this.b = i3;
        this.c = u10Var;
        this.d = k0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:234:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x068a  */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, p2.k] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3;
        String str;
        PackageInfo packageInfo;
        boolean z10;
        boolean z11;
        FrameLayout frameLayout;
        String str2;
        org.telegram.ui.Components.fc a02;
        int i10;
        int i11;
        org.telegram.utils.twidget.u uVar;
        int i12 = 6;
        String str3 = null;
        int i13 = 1;
        switch (this.a) {
            case 0:
                sw swVar = (sw) this.c;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                int i14 = this.b;
                tw twVar = swVar.g;
                uw uwVar = swVar.h;
                uwVar.T1 = true;
                uwVar.getMessagesController().d(0, i14, dialog.id);
                uwVar.T1 = false;
                ArrayList W0 = uwVar.getMessagesController().W0(0);
                int indexOf = W0.indexOf(dialog);
                if (indexOf < 0) {
                    twVar.q(false);
                    break;
                } else {
                    ArrayList W02 = uwVar.getMessagesController().W0(1);
                    if (!W02.isEmpty() || indexOf != 1) {
                        uwVar.M4(true, true);
                        twVar.y.D();
                        twVar.q(true);
                        uwVar.z3();
                    }
                    if (W02.isEmpty()) {
                        W0.remove(0);
                        if (indexOf != 1) {
                            if (!uwVar.S1.isEmpty()) {
                                uwVar.S1.remove(0);
                            }
                            twVar.y.D();
                            twVar.q(true);
                            break;
                        } else {
                            uwVar.M4(true, true);
                            twVar.q(true);
                            uwVar.z3();
                            break;
                        }
                    }
                }
                break;
            case 1:
                x30 x30Var = (x30) this.c;
                org.telegram.ui.ActionBar.s1[] s1VarArr = (org.telegram.ui.ActionBar.s1[]) this.d;
                int i15 = this.b;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    s1Var.setOnCancelListener(new ci.b0(x30Var, i15, i12));
                    s1VarArr[0].show();
                    break;
                }
                break;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i16 = this.b;
                String str4 = LaunchActivity.E1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.az.j1;
                if (tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) {
                    try {
                        packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                        i3 = packageInfo.versionCode;
                    } catch (Exception e10) {
                        e = e10;
                        i3 = 0;
                    }
                    try {
                        str3 = packageInfo.versionName;
                    } catch (Exception e11) {
                        e = e11;
                        org.telegram.messenger.a8.g(e, true);
                        if (i3 == 0) {
                        }
                        if (str3 == null) {
                        }
                        str = tL_help_appUpdate.version;
                        if (str == null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (i3 == 0) {
                        i3 = org.telegram.messenger.az.d();
                    }
                    if (str3 == null) {
                        str3 = org.telegram.messenger.r2.c;
                    }
                    str = tL_help_appUpdate.version;
                    if (str == null && !org.telegram.messenger.az.U(str3, str)) {
                        org.telegram.messenger.az.j1 = tL_help_appUpdate;
                        org.telegram.messenger.az.k1 = i3;
                        org.telegram.messenger.az.y();
                        if (tL_help_appUpdate.can_not_skip) {
                            launchActivity.M0(i16, tL_help_appUpdate, false);
                        } else {
                            org.telegram.messenger.t0.u();
                            boolean z12 = org.telegram.messenger.r2.a;
                            org.telegram.messenger.t0.a.getClass();
                        }
                        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.Q4, new Object[0]);
                        break;
                    }
                }
                break;
            case 3:
                ph phVar = (ph) this.c;
                TLObject tLObject = (TLObject) this.d;
                int i17 = this.b;
                if (tLObject instanceof TLRPC.User) {
                    phVar.a = (TLRPC.User) tLObject;
                    org.telegram.messenger.hp.s1(i17).X3(phVar.a, false, false);
                }
                org.telegram.ui.Components.iz izVar = phVar.c;
                org.telegram.ui.Components.s70 s70Var = phVar.b;
                phVar.setEnabled(phVar.a != null);
                TLRPC.User user = phVar.a;
                if (user != null) {
                    s70Var.setText(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.a0(null, null, 2131748607, org.telegram.messenger.l10.p(user)), new ci.e3(phVar, user.id, 28)));
                }
                s70Var.animate().alpha(1.0f).setDuration(220L).start();
                izVar.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.s9(izVar)).start();
                break;
            case 4:
                yj0.c0((yj0) this.c, (org.telegram.messenger.wv) this.d, this.b);
                break;
            case 5:
                dl0 dl0Var = (dl0) this.c;
                int i18 = this.b;
                Intent intent = (Intent) this.d;
                if (i18 != -1) {
                    z10 = true;
                    if (i18 == 1) {
                        int i19 = x8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        org.telegram.messenger.a8.d(sb2.toString());
                        z11 = true;
                        dl0Var.N0(z11, false);
                        dl0Var.J0(false);
                        frameLayout = dl0Var.Q;
                        if (frameLayout == null) {
                            frameLayout.setClickable(z11);
                            break;
                        }
                    }
                } else {
                    Parcelable.Creator<x8.i> creator = x8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    x8.i iVar = (x8.i) (byteArrayExtra != null ? k8.c.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str2 = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (dl0Var.L0 == null && dl0Var.N0 == null) {
                                p7.d a10 = x7.t.a(string);
                                dl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a10.d, (String) a10.b);
                                rc.a aVar = (rc.a) a10.c;
                                dl0Var.y0 = aVar.a() + " *" + aVar.b();
                                dl0Var.z0();
                                z10 = true;
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            dl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            dl0Var.K0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                dl0Var.y0 = "Android Pay";
                            } else {
                                dl0Var.y0 = optString;
                            }
                            dl0Var.z0();
                            z10 = true;
                        } catch (JSONException e12) {
                            z10 = true;
                            org.telegram.messenger.a8.g(e12, true);
                        }
                    }
                }
                z11 = z10;
                dl0Var.N0(z11, false);
                dl0Var.J0(false);
                frameLayout = dl0Var.Q;
                if (frameLayout == null) {
                }
                break;
            case 6:
                fq0 fq0Var = (fq0) this.c;
                Uri uri = (Uri) this.d;
                int i20 = this.b;
                fq0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i21 = org.telegram.messenger.h10.t0;
                    Point point = org.telegram.messenger.g0.q;
                    org.telegram.ui.Components.t5 t5Var = new org.telegram.ui.Components.t5(file, true, 0L, 0, null, null, null, 0L, i21, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = t5Var.q(0L, false);
                    t5Var.u();
                    org.telegram.messenger.g0.h3(new rw(fq0Var, i20, q10, 7));
                    break;
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                    org.telegram.messenger.g0.h3(new sg0(fq0Var, 25));
                    return;
                }
            case 7:
                fq0 fq0Var2 = (fq0) this.c;
                int i22 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i22 == fq0Var2.a) {
                    fq0Var2.setImageBitmap(bitmap);
                    fq0Var2.c = true;
                    fq0Var2.b = false;
                    break;
                }
                break;
            case 8:
                pr0 pr0Var = (pr0) this.c;
                le leVar = (le) this.d;
                int i23 = this.b;
                leVar.a(Integer.valueOf(i23));
                pr0Var.c(i23 == 1 || i23 == 13);
                break;
            case 9:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i24 = this.b;
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.g(str5);
                if (i24 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.fc.a0(profileActivity);
                    i10 = 2131753721;
                } else {
                    a02 = org.telegram.ui.Components.fc.a0(profileActivity);
                    i10 = 2131744204;
                }
                org.telegram.messenger.camera.q.r(null, i10, a02);
                break;
            case 10:
                bw0 bw0Var = (bw0) this.c;
                u4.d1 d1Var = (u4.d1) this.d;
                int i25 = this.b;
                bw0Var.getClass();
                if (d1Var.b() == i25 && bw0Var.e.U2 == i25 && d1Var.f == 2) {
                    bw0Var.t(d1Var, i25);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.c;
                int i26 = this.b;
                org.telegram.ui.Components.j50 j50Var = (org.telegram.ui.Components.j50) this.d;
                org.telegram.ui.Components.fc.a0(d2Var).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.hp.s1(i26).o0(false);
                org.telegram.messenger.g0.h3(j50Var);
                break;
            case 12:
                org.telegram.messenger.video.a aVar2 = (org.telegram.messenger.video.a) this.c;
                org.telegram.ui.Components.fc fcVar = (org.telegram.ui.Components.fc) this.d;
                int i27 = this.b;
                aVar2.run();
                fcVar.c(org.telegram.messenger.bd.M0(2131754488, null)).j();
                org.telegram.messenger.hp.s1(i27).o0(false);
                break;
            case 13:
                w71 w71Var = (w71) this.c;
                le leVar2 = (le) this.d;
                int i28 = this.b;
                leVar2.a(Integer.valueOf(i28));
                w71Var.c(i28 == 1 || i28 == 13);
                break;
            case 14:
                org.telegram.ui.Wallet.w0 w0Var = (org.telegram.ui.Wallet.w0) this.c;
                oc.u uVar2 = (oc.u) this.d;
                int i29 = this.b;
                org.telegram.ui.Wallet.x0 x0Var = w0Var.c;
                if (x0Var.c(uVar2, i29)) {
                    x0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 15:
                int i30 = this.b;
                org.telegram.messenger.u10 u10Var = (org.telegram.messenger.u10) this.c;
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i30);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new c3.b(i13), new org.telegram.ui.Wallet.j(u10Var, k0Var, connectionsManager));
                break;
            case 16:
                Context context = (Context) this.c;
                int i31 = this.b;
                String str6 = ((TL_wallet.walletTransaction[]) this.d)[0].tx_hash;
                if (!TextUtils.isEmpty(str6)) {
                    String str7 = org.telegram.messenger.hp.s1(i31).H6;
                    if (TextUtils.isEmpty(str7)) {
                        str7 = "https://tonviewer.com/";
                    } else if (!str7.endsWith("/")) {
                        str7 = str7.concat("/");
                    }
                    StringBuilder h = t4.c.h(str7, "transaction/");
                    h.append(Uri.encode(str6));
                    sf.c.v(context, h.toString(), false);
                    break;
                }
                break;
            case 17:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.c;
                int i32 = this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.d;
                if (x5Var.f0 == i32) {
                    x5Var.f(bitmapArr);
                    x5Var.a.run();
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Wallet.e8 e8Var = (org.telegram.ui.Wallet.e8) this.c;
                int i33 = this.b;
                org.telegram.ui.Wallet.na naVar = (org.telegram.ui.Wallet.na) this.d;
                int i34 = i33 + 1;
                ArrayList arrayList = e8Var.w;
                if (i34 >= arrayList.size()) {
                    org.telegram.messenger.g0.v1(naVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.na) arrayList.get(i34)).a.requestFocus();
                    break;
                }
            case 19:
                org.telegram.ui.Wallet.ea eaVar = (org.telegram.ui.Wallet.ea) this.c;
                int i35 = this.b;
                org.telegram.ui.Wallet.na naVar2 = (org.telegram.ui.Wallet.na) this.d;
                int i36 = i35 + 1;
                ArrayList arrayList2 = eaVar.d;
                if (i36 >= arrayList2.size()) {
                    org.telegram.messenger.g0.v1(naVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.na) arrayList2.get(i36)).a.requestFocus();
                    break;
                }
            case 20:
                nc1 nc1Var = (nc1) this.c;
                int i37 = this.b;
                TLObject tLObject2 = (TLObject) this.d;
                HashMap hashMap = nc1Var.e;
                WallpapersListActivity wallpapersListActivity = nc1Var.F;
                ArrayList arrayList3 = nc1Var.d;
                if (i37 == nc1Var.w) {
                    nc1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        nc1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i38 = 0;
                        while (i38 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i38);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                org.telegram.messenger.bf bfVar = new org.telegram.messenger.bf();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                                    i11 = i13;
                                    TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(botInlineResult.photo.sizes, org.telegram.messenger.hs.r5, false, null, false);
                                    if (w10 != null) {
                                        bfVar.E = w10.w;
                                        bfVar.F = w10.h;
                                        bfVar.L = w10;
                                        bfVar.K = botInlineResult.photo;
                                        bfVar.G = w10.size;
                                        bfVar.M = w11;
                                        bfVar.B = botInlineResult.id;
                                        bfVar.H = 0;
                                        arrayList3.add(bfVar);
                                        hashMap.put(bfVar.B, bfVar);
                                    }
                                } else {
                                    i11 = i13;
                                    if (botInlineResult.content != null) {
                                        int i39 = 0;
                                        while (true) {
                                            if (i39 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i39);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    bfVar.E = documentAttribute.w;
                                                    bfVar.F = documentAttribute.h;
                                                } else {
                                                    i39++;
                                                }
                                            }
                                        }
                                        TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                        if (webDocument != null) {
                                            bfVar.D = webDocument.url;
                                        } else {
                                            bfVar.D = null;
                                        }
                                        TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                        bfVar.C = webDocument2.url;
                                        bfVar.G = webDocument2.size;
                                        bfVar.B = botInlineResult.id;
                                        bfVar.H = 0;
                                        arrayList3.add(bfVar);
                                        hashMap.put(bfVar.B, bfVar);
                                    }
                                }
                            } else {
                                i11 = i13;
                            }
                            i38++;
                            i13 = i11;
                        }
                        nc1Var.f = (size == arrayList3.size() || nc1Var.r == null) ? i13 : 0;
                    }
                    if (size != arrayList3.size()) {
                        int i40 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r3);
                        if (i40 != 0) {
                            nc1Var.g(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.I.o(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.L.c();
                    break;
                }
                break;
            case 21:
                org.telegram.utils.twidget.h0 h0Var = (org.telegram.utils.twidget.h0) this.c;
                int i41 = this.b;
                String str8 = (String) this.d;
                if (!h0Var.u && (uVar = h0Var.J) != null) {
                    if (i41 == 13) {
                        if (uVar.e != null && !TextUtils.isEmpty(str8)) {
                            org.telegram.messenger.g0.g(str8);
                            org.telegram.ui.ActionBar.d2 T = org.telegram.messenger.g0.I3() ? LaunchActivity.T() : null;
                            if (T != null) {
                                if (str8.length() > 80) {
                                    str8 = str8.substring(0, 80) + "…";
                                }
                                org.telegram.ui.Components.fc.a0(T).Q(R.raw.copy, 36, org.telegram.messenger.bd.a0(null, null, 2131742876, str8)).j();
                                break;
                            }
                        }
                    } else if (i41 == 14) {
                        boolean equals = "1".equals(str8);
                        if (uVar.A != equals) {
                            uVar.A = equals;
                            if (uVar.e != null) {
                                org.telegram.utils.twidget.p.C();
                                break;
                            }
                        }
                    } else {
                        try {
                            JSONObject jSONObject3 = new JSONObject(str8);
                            if (i41 != 19) {
                                org.telegram.utils.twidget.u uVar3 = h0Var.J;
                                long j10 = jSONObject3.getLong("id");
                                String string2 = jSONObject3.getString("data");
                                boolean optBoolean = jSONObject3.optBoolean("wallet");
                                if (uVar3.e == null) {
                                    uVar3.a(3, null, j10);
                                    break;
                                } else {
                                    org.telegram.utils.twidget.m h7 = org.telegram.utils.twidget.p.h(uVar3);
                                    if (h7 != null && h7.i && (!optBoolean || org.telegram.utils.twidget.p.D(h7))) {
                                        TLRPC.TL_widgetQueryTypeData tL_widgetQueryTypeData = new TLRPC.TL_widgetQueryTypeData();
                                        tL_widgetQueryTypeData.with_wallet = optBoolean;
                                        org.telegram.utils.twidget.p.u(h7, uVar3, j10, tL_widgetQueryTypeData, string2.getBytes(StandardCharsets.UTF_8));
                                        break;
                                    }
                                    uVar3.a(3, null, j10);
                                }
                            } else {
                                h0Var.J.i(jSONObject3.getLong("id"), jSONObject3.getJSONObject("call"));
                                break;
                            }
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 22:
                p2.j jVar = (p2.j) this.c;
                this.d.M(jVar.a, jVar.b, this.b);
                break;
            case 23:
                ((View) this.d).postOnAnimation(new org.telegram.ui.Wallet.f2((org.telegram.ui.Components.ax) this.c, this.b, i12));
                break;
            case 24:
                ((t4.d) ((ne.h) this.c).c).u(this.b, this.d);
                break;
            case 25:
                tg.i0 i0Var = (tg.i0) this.c;
                i0Var.e((tg.x0) this.d, this.b, i0Var.h);
                i0Var.h = null;
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.c;
                tg.g gVar = (tg.g) this.d;
                int i42 = this.b;
                if (f0Var.G0.getCurrentBrush() instanceof tg.g) {
                    f0Var.U0 = true;
                }
                f0Var.C(gVar);
                ug.g1 g1Var = f0Var.d1;
                int i43 = g1Var.d + 1;
                g1Var.a(i43);
                org.telegram.messenger.g0.R3(g1Var.a[i43], i42);
                g1Var.e = true;
                break;
        }
    }

    public /* synthetic */ rw(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ rw(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
