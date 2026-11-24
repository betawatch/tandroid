// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.o;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ qt(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, xl6 xl6Var, xl6 xl6Var2, xl6 xl6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = xl6Var;
        this.h = xl6Var2;
        this.n = xl6Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0528, code lost:
    
        if (r6.chat.has_geo != false) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0635  */
    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v23, types: [android.app.Activity, org.telegram.ui.LaunchActivity, tg0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        kz5 kz5Var;
        LaunchActivity launchActivity;
        p pVar;
        u21 b0;
        int i;
        int i2;
        byte b = this.a;
        byte b2 = 4;
        int i3 = this.d;
        byte b3 = 0;
        ?? r11 = 1;
        ?? r112 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.c;
        byte b4 = 3;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                o oVar = (o) obj6;
                vt vtVar = (vt) obj4;
                TLObject tLObject = (TLObject) obj5;
                String str = (String) obj3;
                nt ntVar = (nt) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (oVar.H0 != 0 && i3 == oVar.J0) {
                    if (vtVar != null) {
                        vtVar.b();
                    }
                    oVar.H0 = 0;
                    oVar.Z(false);
                    if (oVar.W) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            na7.q1(oVar.Y).a4(tL_messages_webPage.users, false);
                            na7.q1(oVar.Y).U3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) ntVar.run()).booleanValue()) {
                                    if (na7.q1(oVar.Y).M2(tL_messages_getWebPage.url)) {
                                        oVar.d(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        d01.t(oVar.M, tL_messages_getWebPage.url);
                                        break;
                                    }
                                }
                            } else {
                                oVar.e(webPage, str, 1);
                                break;
                            }
                        } else {
                            if (tLObject instanceof TLRPC.TL_webPage) {
                                TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                                if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                                    oVar.e(tL_webPage, str, 1);
                                    break;
                                }
                            }
                            if (!((Boolean) ntVar.run()).booleanValue()) {
                                if (na7.q1(oVar.Y).M2(tL_messages_getWebPage.url)) {
                                    oVar.d(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    d01.t(oVar.M, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                hv0 hv0Var = (hv0) obj6;
                String str2 = (String) obj3;
                TLObject tLObject2 = (TLObject) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                cv0 cv0Var = (cv0) obj2;
                ev0 ev0Var = (ev0) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("req_id", str2);
                    if (tLObject2 instanceof TLRPC.TL_dataJSON) {
                        jSONObject2.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject2).data).nextValue());
                    } else if (tL_error != null) {
                        jSONObject2.put("error", tL_error.text);
                    }
                    hv0.t(i3, cv0Var, ev0Var, "custom_method_invoked", jSONObject2);
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    hv0Var.Y(null);
                    return;
                }
            case 2:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i4 = this.d;
                ConnectionsManager.getInstance(i4).sendRequest(togglegroupcallsettings, new l81(i4, inputGroupCall, (String[]) obj4, (FrameLayout) obj5, (l46) obj3, (fx0) obj2, (wjb) obj));
                break;
            case 3:
                TLObject tLObject3 = (TLObject) obj5;
                hd hdVar = (hd) obj6;
                Context context = (Context) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj3;
                wjb wjbVar = (wjb) obj2;
                fa5 fa5Var = (fa5) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    hdVar.dismiss();
                    z81.l0(context, this.d, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, wjbVar, true, true);
                } else {
                    hdVar.dismiss();
                }
                gl.d3(fa5Var);
                break;
            case 4:
                c cVar = (c) obj6;
                hjc hjcVar = (hjc) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                zic zicVar = (zic) obj;
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ja8 S5 = chatActivityEnterView.F3.S5(hjcVar, (lj9) obj5);
                if (S5 == null) {
                    gl.B2(hjcVar);
                    break;
                } else {
                    int F0 = chatActivityEnterView.F0(bkb.D8);
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        djc djcVar = i5 < arrayList2.size() ? (djc) arrayList2.get(i5) : null;
                        if (djcVar == null) {
                            Context context2 = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList.get(i5);
                            boolean z = i5 == i3;
                            s33 s33Var = jm3.I0;
                            S5.d(new k7(context2, charSequence, null, F0, z), 44, new eg((Object) zicVar, i5, (byte) 22));
                        } else {
                            Context context3 = chatActivityEnterView.getContext();
                            CharSequence charSequence2 = (CharSequence) arrayList.get(i5);
                            String str3 = djcVar.a;
                            boolean z2 = i5 == i3;
                            s33 s33Var2 = jm3.I0;
                            k7 k7Var = new k7(context3, charSequence2, str3, F0, z2);
                            S5.d(k7Var, 54, null);
                            k7Var.setOnClickListener(new og((Object) cVar, (Object) djcVar, F0, (Object) S5, (byte) 3));
                        }
                        i5++;
                    }
                    S5.J = new hq1(hjcVar, (byte) 10);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    S5.F = iArr[1];
                    S5.H = gl.L(316.0f);
                    S5.i();
                    break;
                }
            case 5:
                TLObject tLObject4 = (TLObject) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                jn1 jn1Var = (jn1) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList3.set(i3, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList4.size()) {
                    jn1Var.run();
                    break;
                }
                break;
            case 6:
                w25 w25Var = (w25) obj6;
                s25 s25Var = (s25) obj4;
                String str4 = (String) obj3;
                y05 y05Var = (y05) obj2;
                p8c p8cVar = (p8c) obj;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    String str5 = s25Var.d;
                    tonconnectsession = s25Var.a;
                    JSONObject put2 = jSONObject3.put("id", str5);
                    if (i3 < 0) {
                        put2.put("result", obj5);
                    } else {
                        if (str4 == null) {
                            str4 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i3).put("message", str4));
                    }
                    put = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(y05Var, tonconnectsession, s25Var.h, s25Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", s25Var.i).put("disconnect", i3 < 0 && "disconnect".equals(s25Var.e));
                } catch (Exception e2) {
                    jSONObject = null;
                    r8 = w25.h("encrypt response", e2);
                }
                if (!na7.q1(w25Var.a).X3.edit().putString(w25.k(tonconnectsession.id, s25Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                gl.d3(new vz4((Object) w25Var, (Object) jSONObject, (Object) p8cVar, (String) r8, (Object) s25Var, (byte) 1));
                break;
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj6;
                Context context4 = (Context) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                JSONObject jSONObject4 = (JSONObject) obj3;
                wjb wjbVar2 = (wjb) obj2;
                h35 h35Var = (h35) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i6 = this.d;
                    org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(i6);
                    String x = C.x();
                    byte[] D = C.D();
                    if (x == null || D == null || C.b == null) {
                        u21.c0(k96.M0(2131742696, null));
                        h35Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i6).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject4.optString("method"))) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject("payload");
                                w25.G(x, jSONObject5);
                                k35.c(context4, i6, user, jSONObject5, x, (byte[]) D.clone(), wjbVar2, h35Var);
                            } else {
                                JSONObject jSONObject6 = jSONObject4.getJSONObject("transaction");
                                w25.I(jSONObject6, x, currentTime);
                                k35.d(context4, i6, user, new v25(jSONObject6), x, (byte[]) D.clone(), wjbVar2, h35Var);
                            }
                            break;
                        } catch (Exception e3) {
                            u21.c0(w25.h("widget call", e3));
                            h35Var.a();
                            return;
                        }
                    }
                }
                break;
            case 8:
                n95.a((hd) obj6, (c01) obj4, (TLObject) obj5, this.d, (Activity) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj5;
                hd hdVar2 = (hd) obj2;
                kz5 kz5Var2 = (kz5) obj;
                String str6 = (String) obj3;
                String str7 = LaunchActivity.C1;
                ArrayList arrayList5 = launchActivity2.e0;
                if (!launchActivity2.isFinishing()) {
                    if (tL_error2 != null) {
                        kz5Var = kz5Var2;
                        launchActivity = launchActivity2;
                        if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED") && LaunchActivity.S() != null) {
                            ir2.v(null, 2131748960, u21.b0(LaunchActivity.S()), R.raw.linkbroken, 36);
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String M0 = k96.M0(R.string.AppName, null);
                        hd hdVar3 = alertDialog$Builder.a;
                        hdVar3.S = M0;
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                        }
                        alertDialog$Builder.j(k96.M0(2131747638, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else if (launchActivity2.p0 != null) {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (hc2.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!hc2.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            na7.q1(i3).S3(chatInvite.chat, false);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(chatInvite.chat);
                            ad7.Y(i3).j1(null, arrayList6, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList5.isEmpty() || na7.q1(i3).A(bundle, (d) b00.f(1, arrayList5), null, null)) {
                                boolean[] zArr2 = new boolean[1];
                                hdVar2.setOnCancelListener(new gn1(zArr2, r11 == true ? 1 : 0));
                                if (!chatInvite.chat.forum) {
                                    na7.q1(i3).p0(-chatInvite.chat.id, 0, new sz5(launchActivity2, kz5Var2, zArr2, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity2.t0(qvb.F0(launchActivity2, bundle2));
                                }
                            }
                            kz5Var = kz5Var2;
                        }
                        kz5Var = kz5Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            d dVar = (d) b00.f(1, arrayList5);
                            dVar.showDialog(new fu5(launchActivity2, chatInvite, str6, dVar, dVar instanceof mu1 ? ((mu1) dVar).Ba : null));
                        } else {
                            long j = tL_starsSubscriptionPricing.amount;
                            na7.q1(i3).S3(chatInvite.chat, false);
                            gta.v(launchActivity2.P, false).h0(str6, chatInvite, new jy(launchActivity2, j, b4));
                        }
                    } else {
                        kz5Var = kz5Var2;
                        launchActivity = launchActivity2;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                        String M02 = k96.M0(R.string.AppName, null);
                        hd hdVar32 = alertDialog$Builder2.a;
                        hdVar32.S = M02;
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            hdVar32.U = k96.M0(2131750670, null);
                        } else if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED")) {
                            hdVar32.S = k96.M0(2131750863, null);
                            hdVar32.U = k96.M0(2131748960, null);
                        } else {
                            hdVar32.U = k96.M0(2131748883, null);
                        }
                        alertDialog$Builder2.j(k96.M0(2131747638, null), null);
                        launchActivity.F0(alertDialog$Builder2);
                    }
                    try {
                        kz5Var.run();
                        break;
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLObject tLObject6 = (TLObject) obj5;
                c01 c01Var = (c01) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                na7 na7Var = (na7) obj;
                String str8 = (String) obj3;
                String str9 = LaunchActivity.C1;
                if (tLObject6 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject6;
                    na7Var.Z3(user2, false, false);
                    if (l7c.C(user2)) {
                        if (c01Var != null) {
                            c01Var.b();
                        }
                        launchActivity3.m0(i3, user2.id, null);
                        break;
                    } else {
                        launchActivity3.X(i3, user2, str8, c01Var);
                        break;
                    }
                } else {
                    if (c01Var != null) {
                        c01Var.b();
                    }
                    StringBuilder sb = new StringBuilder("cant import contact token, err=");
                    sb.append(tL_error3 == null ? null : tL_error3.text);
                    fa4.d(sb.toString());
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        yjb.x(null, 2131747942, u21.b0(Q), null);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                cj3 cj3Var = (cj3) obj4;
                d dVar2 = (d) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                String str10 = (String) obj3;
                String str11 = LaunchActivity.C1;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    hq6.d0(i3).G0(false, true, new vz4((Object) launchActivity4, (Object) cj3Var, (Object) dVar2, (Object) user3, (Object) str10, (byte) 10));
                    break;
                }
                break;
            case 12:
                ?? r5 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj5;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                kz5 kz5Var3 = (kz5) obj;
                String str12 = (String) obj3;
                String str13 = LaunchActivity.C1;
                if (tL_error4 != null) {
                    boolean equalsIgnoreCase = "SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text);
                    ArrayList arrayList7 = r5.e0;
                    if (equalsIgnoreCase) {
                        b0 = u21.b0((d) b00.f(1, arrayList7));
                        i = 2131747202;
                    } else {
                        b0 = u21.b0((d) b00.f(1, arrayList7));
                        i = 2131747203;
                    }
                    yjb.x(null, i, b0, null);
                } else if (!r5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        y0a y0aVar = r5.Y0;
                        r5.Y0 = null;
                        gta.v(r5.P, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new ay5(kz5Var3, r112 == true ? 1 : 0), new my5(y0aVar, b3));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            na7.q1(i3).a4(paymentForm.users, false);
                            pVar = new p(paymentForm, null, str12, r5.N().getLastFragment());
                        } else {
                            pVar = tLObject7 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (pVar != null) {
                            y0a y0aVar2 = r5.Y0;
                            if (y0aVar2 != null) {
                                r5.Y0 = null;
                                pVar.a1 = new ny5(y0aVar2, b3);
                            }
                            r5.t0(pVar);
                        }
                    }
                }
                try {
                    kz5Var3.run();
                    break;
                } catch (Exception e5) {
                    fa4.g(e5, true);
                    return;
                }
            case 13:
                ve6 ve6Var = (ve6) obj6;
                String str14 = (String) obj3;
                fi0 fi0Var = (fi0) obj4;
                List list = (List) obj5;
                String str15 = (String) obj2;
                String str16 = (String) obj;
                mf6 mf6Var = ve6Var.w;
                StringBuilder p = ug8.p("LoginBilling queried \"", str14, "\" product: ");
                p.append(ci0.i(fi0Var.a));
                fa4.b(p.toString());
                int i7 = fi0Var.a;
                if (i7 != 0) {
                    ve6Var.e = "BILLING_".concat(ci0.i(i7));
                    new u21(mf6Var.a0, null).H(R.raw.error, k96.a0(null, null, 2131743639, ci0.i(fi0Var.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    kl8 kl8Var = (kl8) list.get(0);
                    gl8 a = kl8Var.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_inputStorePaymentAuthCode.currency)) * (a.b / 1000000.0d));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str15) ? "" : str15;
                    tL_inputStorePaymentAuthCode.phone_number = str16;
                    int i8 = this.d;
                    tL_inputStorePaymentAuthCode.premium_days = i8;
                    StringBuilder p2 = ug8.p("LoginBilling found \"", str14, "\" product, with currency=");
                    p2.append(tL_inputStorePaymentAuthCode.currency);
                    p2.append(" amount=");
                    p2.append(tL_inputStorePaymentAuthCode.amount);
                    p2.append("; phone=");
                    p2.append(str16);
                    p2.append(", phone_code_hash=");
                    p2.append(str15);
                    fa4.b(p2.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i2 = ((d) mf6Var).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_payments_canPurchaseStore, new l81(ve6Var, a, i8, kl8Var, tL_inputStorePaymentAuthCode, str14, tL_payments_canPurchaseStore, (byte) 3), 10);
                    break;
                } else {
                    ve6Var.e = "PRODUCT_NOT_FOUND";
                    new u21(mf6Var.a0, null).H(R.raw.error, k96.a0(null, null, 2131743639, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 14:
                ArrayList arrayList8 = (ArrayList) obj6;
                ArrayList arrayList9 = (ArrayList) obj4;
                Integer num = (Integer) obj5;
                xl6 xl6Var = (xl6) obj3;
                xl6 xl6Var2 = (xl6) obj2;
                xl6 xl6Var3 = (xl6) obj;
                String[] strArr = MediaController.W1;
                boolean U0 = PhotoViewer.r0().U0();
                int i9 = this.d;
                if (!U0 || MediaController.h2) {
                    MediaController.c2 = arrayList8;
                    MediaController.d2 = arrayList9;
                    MediaController.e2 = null;
                    MediaController.b2 = xl6Var2;
                    MediaController.a2 = xl6Var;
                    kk7.e().k(kk7.q2, Integer.valueOf(i9), arrayList8, arrayList9, num);
                    break;
                } else {
                    qt qtVar = MediaController.e2;
                    if (qtVar != null) {
                        gl.r(qtVar);
                    }
                    qt qtVar2 = new qt(i9, arrayList8, arrayList9, num, xl6Var, xl6Var2, xl6Var3);
                    MediaController.e2 = qtVar2;
                    gl.e3(qtVar2, 1000L);
                    break;
                }
                break;
            case 15:
                ArrayList arrayList10 = (ArrayList) obj4;
                vf6 vf6Var = (vf6) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj5;
                na7 na7Var2 = (na7) obj;
                kz6 kz6Var = ((gz6) obj6).h;
                if (kz6Var.k0 != 0 && i3 == kz6Var.j0 && kz6Var.E != null && kz6Var.y != null) {
                    kz6Var.W(vf6Var, arrayList10, false);
                    if (tL_error5 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject8;
                        na7Var2.a4(tL_channels_channelParticipants.users, false);
                        na7Var2.U3(tL_channels_channelParticipants.chats, false);
                        kz6Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e6 = y6c.h(kz6Var.f).e();
                            for (int i10 = 0; i10 < tL_channels_channelParticipants.participants.size(); i10++) {
                                long B1 = k27.B1(tL_channels_channelParticipants.participants.get(i10).peer);
                                if (kz6Var.E.h(B1) < 0 && ((B1 != 0 || kz6Var.E.h(e6) < 0) && (kz6Var.l0 || (B1 != e6 && B1 != 0)))) {
                                    if (B1 < 0) {
                                        TLRPC.Chat K0 = na7Var2.K0(Long.valueOf(-B1));
                                        if (K0 == null) {
                                            break;
                                        } else {
                                            kz6Var.y.add(K0);
                                        }
                                    } else {
                                        TLRPC.User V1 = na7Var2.V1(Long.valueOf(B1));
                                        if (V1 == null) {
                                            break;
                                        } else {
                                            kz6Var.y.add(V1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    kz6Var.f();
                    kz6Var.W.a(!kz6Var.y.isEmpty());
                }
                kz6Var.k0 = 0;
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str17 = (String) obj3;
                boolean[] zArr3 = (boolean[]) obj5;
                String[] strArr2 = (String[]) obj2;
                String str18 = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                if (profileActivity.getParentActivity() != null) {
                    cs5 I = cs5.I(profileActivity, view);
                    I.X(profileActivity.a.V0(view, false));
                    I.w = false;
                    I.b(R.drawable.msg_copy, k96.M0(2131751755, null), new j45((Object) profileActivity, (Object) str17, i3, (byte) 25), false);
                    I.k(R.drawable.msg_translate, k96.M0(2131743717, null), new jw6(profileActivity, strArr2, str18, str17, (byte) 29), zArr3[0]);
                    I.a0();
                    break;
                }
                break;
            case 17:
                StringBuilder sb2 = new StringBuilder();
                ls6.u(sb2, na7.q1(i3).N2, "/", (String) obj3, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new cq8((lca) obj6, (Context) obj5, sb3, sb3, (wjb) obj2, (d) obj).show();
                break;
            case 18:
                z3a z3aVar = (z3a) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj4;
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) obj2;
                k3a k3aVar = (k3a) obj;
                String str19 = (String) obj3;
                if (tLObject9 instanceof TLRPC.TL_messageMediaDocument) {
                    TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = new TLRPC.TL_inputMediaUploadedPhoto();
                    tL_inputMediaUploadedPhoto.live_photo = true;
                    tL_inputMediaUploadedPhoto.file = inputFile;
                    tL_inputMediaUploadedPhoto.spoiler = tL_inputMediaUploadedDocument.spoiler;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputMediaUploadedPhoto.video = tL_inputDocument;
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject9).document;
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    byte[] bArr = document.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) k3aVar.c;
                    if (i3 >= 0 && i3 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i3).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList11 = k3aVar.A;
                    if (arrayList11 != null && i3 >= 0 && i3 < arrayList11.size()) {
                        k3aVar.A.set(i3, tL_inputMediaUploadedPhoto);
                    }
                    k3aVar.j = null;
                    k3aVar.i = null;
                    HashMap hashMap = k3aVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str19 + "_ct");
                    }
                    z3aVar.z0(k3aVar, tL_inputMediaUploadedPhoto, null, str19);
                    break;
                } else {
                    k3aVar.c();
                    break;
                }
                break;
            default:
                TLObject tLObject10 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((hd) obj6).dismiss();
                if (tLObject10 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject10;
                    hq6.d0(i3).L1(tL_messages_stickerSet, true);
                    if (!hq6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                        hq6.d0(i3).h2(null, tLObject10, 2, null, false, false);
                    }
                    gl.e3(new iya(tLObject10, document2, b2), 250L);
                    break;
                } else if (tL_error6 != null) {
                    if (ab4.r(tL_error6.text)) {
                        ab4.n(i3).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        u21.e0(tL_error6);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qt(hd hdVar, c01 c01Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = hdVar;
        this.f = c01Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public /* synthetic */ qt(hd hdVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = hdVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ qt(hv0 hv0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, cv0 cv0Var, ev0 ev0Var) {
        this.a = (byte) 1;
        this.e = hv0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = cv0Var;
        this.n = ev0Var;
    }

    public /* synthetic */ qt(ve6 ve6Var, String str, fi0 fi0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = ve6Var;
        this.b = str;
        this.f = fi0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public /* synthetic */ qt(gz6 gz6Var, int i, ArrayList arrayList, vf6 vf6Var, TLRPC.TL_error tL_error, TLObject tLObject, na7 na7Var) {
        this.a = (byte) 15;
        this.e = gz6Var;
        this.d = i;
        this.f = arrayList;
        this.b = vf6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = na7Var;
    }

    public /* synthetic */ qt(gk7 gk7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = gk7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ qt(lca lcaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, wjb wjbVar, d dVar) {
        this.a = (byte) 17;
        this.e = lcaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = wjbVar;
        this.n = dVar;
    }

    public /* synthetic */ qt(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ qt(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ qt(TLObject tLObject, hd hdVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, wjb wjbVar, fa5 fa5Var) {
        this.a = (byte) 3;
        this.c = tLObject;
        this.e = hdVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = wjbVar;
        this.n = fa5Var;
    }

    public /* synthetic */ qt(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, jn1 jn1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = jn1Var;
    }

    public /* synthetic */ qt(c cVar, hjc hjcVar, lj9 lj9Var, ArrayList arrayList, ArrayList arrayList2, int i, zic zicVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = hjcVar;
        this.c = lj9Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = zicVar;
    }

    public /* synthetic */ qt(LaunchActivity launchActivity, TLObject tLObject, int i, cj3 cj3Var, d dVar, TLRPC.User user, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = cj3Var;
        this.h = dVar;
        this.n = user;
        this.b = str;
    }

    public /* synthetic */ qt(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, hd hdVar, kz5 kz5Var, String str) {
        this.a = (byte) 9;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = hdVar;
        this.n = kz5Var;
        this.b = str;
    }

    public /* synthetic */ qt(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, kz5 kz5Var, int i, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = kz5Var;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ qt(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
        this.a = (byte) 16;
        this.e = profileActivity;
        this.f = view;
        this.b = str;
        this.d = i;
        this.c = zArr;
        this.h = strArr;
        this.n = str2;
    }
}
