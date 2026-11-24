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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qu implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ qu(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, yn6 yn6Var, yn6 yn6Var2, yn6 yn6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = yn6Var;
        this.h = yn6Var2;
        this.n = yn6Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x051f, code lost:
    
        if (r14.chat.has_geo != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x062d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        c cVar;
        String h;
        JSONObject jSONObject;
        TL_wallet.tonConnectSession tonconnectsession;
        JSONObject put;
        k16 k16Var;
        LaunchActivity launchActivity;
        p pVar;
        c41 b0;
        int i;
        int i2;
        byte b = this.a;
        byte b2 = 3;
        int i3 = this.d;
        byte b3 = 0;
        char c = 1;
        char c2 = 1;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.b;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (b) {
            case 0:
                o oVar = (o) obj6;
                vu vuVar = (vu) obj4;
                TLObject tLObject = (TLObject) obj5;
                String str = (String) obj3;
                nu nuVar = (nu) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (oVar.H0 != 0 && i3 == oVar.J0) {
                    if (vuVar != null) {
                        vuVar.b();
                    }
                    oVar.H0 = 0;
                    oVar.Z(false);
                    if (oVar.W) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            oc7.r1(oVar.Y).d4(tL_messages_webPage.users, false);
                            oc7.r1(oVar.Y).X3(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) nuVar.run()).booleanValue()) {
                                    if (oc7.r1(oVar.Y).P2(tL_messages_getWebPage.url)) {
                                        oVar.d(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        l11.u(oVar.M, tL_messages_getWebPage.url);
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
                            if (!((Boolean) nuVar.run()).booleanValue()) {
                                if (oc7.r1(oVar.Y).P2(tL_messages_getWebPage.url)) {
                                    oVar.d(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    l11.u(oVar.M, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                qw0 qw0Var = (qw0) obj6;
                String str2 = (String) obj3;
                TLObject tLObject2 = (TLObject) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                mw0 mw0Var = (mw0) obj2;
                ow0 ow0Var = (ow0) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("req_id", str2);
                    if (tLObject2 instanceof TLRPC.TL_dataJSON) {
                        jSONObject2.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject2).data).nextValue());
                    } else if (tL_error != null) {
                        jSONObject2.put("error", tL_error.text);
                    }
                    qw0.t(i3, mw0Var, ow0Var, "custom_method_invoked", jSONObject2);
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    qw0Var.Y(null);
                    return;
                }
            case 2:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i4 = this.d;
                ConnectionsManager.getInstance(i4).sendRequest(togglegroupcallsettings, new u91(i4, inputGroupCall, (String[]) obj4, (FrameLayout) obj5, (l66) obj3, (my0) obj2, (ylb) obj));
                break;
            case 3:
                TLObject tLObject3 = (TLObject) obj5;
                he heVar = (he) obj6;
                Context context = (Context) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj3;
                ylb ylbVar = (ylb) obj2;
                dc5 dc5Var = (dc5) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    heVar.dismiss();
                    ia1.l0(context, this.d, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, ylbVar, true, true);
                } else {
                    heVar.dismiss();
                }
                gm.c3(dc5Var);
                break;
            case 4:
                c cVar2 = (c) obj6;
                hlc hlcVar = (hlc) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                zkc zkcVar = (zkc) obj;
                ChatActivityEnterView chatActivityEnterView = cVar2.a;
                mc8 a6 = chatActivityEnterView.F3.a6(hlcVar, (sz4) obj5);
                if (a6 == null) {
                    gm.B2(hlcVar);
                    break;
                } else {
                    int F0 = chatActivityEnterView.F0(cmb.D8);
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        dlc dlcVar = i5 < arrayList2.size() ? (dlc) arrayList2.get(i5) : null;
                        if (dlcVar == null) {
                            Context context2 = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList.get(i5);
                            boolean z = i5 == i3;
                            d53 d53Var = un3.I0;
                            a6.e(new k7(context2, charSequence, null, F0, z), 44, new eh((Object) zkcVar, i5, (byte) 22));
                            cVar = cVar2;
                        } else {
                            Context context3 = chatActivityEnterView.getContext();
                            CharSequence charSequence2 = (CharSequence) arrayList.get(i5);
                            String str3 = dlcVar.a;
                            boolean z2 = i5 == i3;
                            d53 d53Var2 = un3.I0;
                            k7 k7Var = new k7(context3, charSequence2, str3, F0, z2);
                            a6.e(k7Var, 54, null);
                            cVar = cVar2;
                            int i6 = F0;
                            F0 = i6;
                            k7Var.setOnClickListener(new ph((Object) cVar, (Object) dlcVar, i6, (Object) a6, (byte) 2));
                        }
                        i5++;
                        cVar2 = cVar;
                    }
                    a6.J = new fo1(hlcVar, (byte) 14);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    a6.F = iArr[1];
                    a6.H = gm.L(316.0f);
                    a6.j();
                    break;
                }
            case 5:
                TLObject tLObject4 = (TLObject) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                co1 co1Var = (co1) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList3.set(i3, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList4.size()) {
                    co1Var.run();
                    break;
                }
                break;
            case 6:
                w45 w45Var = (w45) obj6;
                s45 s45Var = (s45) obj4;
                String str4 = (String) obj3;
                y25 y25Var = (y25) obj2;
                qac qacVar = (qac) obj;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    String str5 = s45Var.d;
                    tonconnectsession = s45Var.a;
                    JSONObject put2 = jSONObject3.put("id", str5);
                    if (i3 < 0) {
                        put2.put("result", obj5);
                    } else {
                        if (str4 == null) {
                            str4 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i3).put("message", str4));
                    }
                    put = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(y25Var, tonconnectsession, s45Var.h, s45Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", s45Var.i).put("disconnect", i3 < 0 && "disconnect".equals(s45Var.e));
                } catch (Exception e2) {
                    h = w45.h("encrypt response", e2);
                    jSONObject = null;
                }
                if (!oc7.r1(w45Var.a).X3.edit().putString(w45.k(tonconnectsession.id, s45Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                h = null;
                gm.c3(new v15((Object) w45Var, (Object) jSONObject, (Object) qacVar, h, (Object) s45Var, (byte) 1));
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj6;
                Context context4 = (Context) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                JSONObject jSONObject4 = (JSONObject) obj3;
                ylb ylbVar2 = (ylb) obj2;
                h55 h55Var = (h55) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i7 = this.d;
                    org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(i7);
                    String x = C.x();
                    byte[] D = C.D();
                    if (x == null || D == null || C.b == null) {
                        c41.c0(jb6.M0(2131742622, null));
                        h55Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject4.optString("method"))) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject("payload");
                                w45.G(x, jSONObject5);
                                k55.c(context4, i7, user, jSONObject5, x, (byte[]) D.clone(), ylbVar2, h55Var);
                            } else {
                                JSONObject jSONObject6 = jSONObject4.getJSONObject("transaction");
                                w45.I(jSONObject6, x, currentTime);
                                k55.d(context4, i7, user, new v45(jSONObject6), x, (byte[]) D.clone(), ylbVar2, h55Var);
                            }
                            break;
                        } catch (Exception e3) {
                            c41.c0(w45.h("widget call", e3));
                            h55Var.a();
                            return;
                        }
                    }
                }
                break;
            case 8:
                lb5.a((he) obj6, (k11) obj4, (TLObject) obj5, this.d, (Activity) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj4;
                TLObject tLObject5 = (TLObject) obj5;
                he heVar2 = (he) obj2;
                k16 k16Var2 = (k16) obj;
                String str6 = (String) obj3;
                String str7 = LaunchActivity.C1;
                ArrayList arrayList5 = launchActivity2.e0;
                if (!launchActivity2.isFinishing()) {
                    if (tL_error2 != null) {
                        k16Var = k16Var2;
                        launchActivity = launchActivity2;
                        if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED") && LaunchActivity.S() != null) {
                            ts2.u(null, 2131748909, c41.b0(LaunchActivity.S()), R.raw.linkbroken, 36);
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String M0 = jb6.M0(R.string.AppName, null);
                        he heVar3 = alertDialog$Builder.a;
                        heVar3.S = M0;
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                        }
                        alertDialog$Builder.j(jb6.M0(2131747564, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else if (launchActivity2.p0 != null) {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject5;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (sd2.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!sd2.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            oc7.r1(i3).V3(chatInvite.chat, false);
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.add(chatInvite.chat);
                            cf7.Y(i3).j1(null, arrayList6, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList5.isEmpty() || oc7.r1(i3).A(bundle, (d) b10.f(1, arrayList5), null, null)) {
                                boolean[] zArr2 = new boolean[1];
                                heVar2.setOnCancelListener(new wo1(zArr2, c == true ? 1 : 0));
                                if (!chatInvite.chat.forum) {
                                    oc7.r1(i3).p0(-chatInvite.chat.id, 0, new s16(launchActivity2, k16Var2, zArr2, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity2.t0(sxb.G0(launchActivity2, bundle2));
                                }
                            }
                            k16Var = k16Var2;
                        }
                        k16Var = k16Var2;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            d dVar = (d) b10.f(1, arrayList5);
                            dVar.showDialog(new ew5(launchActivity2, chatInvite, str6, dVar, dVar instanceof yv1 ? ((yv1) dVar).Ba : null));
                        } else {
                            long j = tL_starsSubscriptionPricing.amount;
                            oc7.r1(i3).V3(chatInvite.chat, false);
                            jva.v(launchActivity2.P, false).h0(str6, chatInvite, new jz(launchActivity2, j, b2));
                        }
                    } else {
                        k16Var = k16Var2;
                        launchActivity = launchActivity2;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                        String M02 = jb6.M0(R.string.AppName, null);
                        he heVar32 = alertDialog$Builder2.a;
                        heVar32.S = M02;
                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                            heVar32.U = jb6.M0(2131750619, null);
                        } else if (tL_error2.text.startsWith("INVITE_HASH_EXPIRED")) {
                            heVar32.S = jb6.M0(2131750812, null);
                            heVar32.U = jb6.M0(2131748909, null);
                        } else {
                            heVar32.U = jb6.M0(2131748832, null);
                        }
                        alertDialog$Builder2.j(jb6.M0(2131747564, null), null);
                        launchActivity.F0(alertDialog$Builder2);
                    }
                    try {
                        k16Var.run();
                        break;
                    } catch (Exception e4) {
                        fc4.g(e4, true);
                        return;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                TLObject tLObject6 = (TLObject) obj5;
                k11 k11Var = (k11) obj4;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                oc7 oc7Var = (oc7) obj;
                String str8 = (String) obj3;
                String str9 = LaunchActivity.C1;
                if (tLObject6 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject6;
                    oc7Var.c4(user2, false, false);
                    if (m9c.D(user2)) {
                        if (k11Var != null) {
                            k11Var.b();
                        }
                        launchActivity3.m0(i3, user2.id, null);
                        break;
                    } else {
                        launchActivity3.X(i3, user2, str8, k11Var);
                        break;
                    }
                } else {
                    if (k11Var != null) {
                        k11Var.b();
                    }
                    StringBuilder sb = new StringBuilder("cant import contact token, err=");
                    sb.append(tL_error3 == null ? null : tL_error3.text);
                    fc4.d(sb.toString());
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        mlb.y(null, 2131747868, c41.b0(Q), null);
                        break;
                    }
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                nk3 nk3Var = (nk3) obj4;
                d dVar2 = (d) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                String str10 = (String) obj3;
                String str11 = LaunchActivity.C1;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    hs6.d0(i3).G0(false, true, new v15((Object) launchActivity4, (Object) nk3Var, (Object) dVar2, (Object) user3, (Object) str10, (byte) 10));
                    break;
                }
                break;
            case 12:
                LaunchActivity launchActivity5 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj5;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                k16 k16Var3 = (k16) obj;
                String str12 = (String) obj3;
                String str13 = LaunchActivity.C1;
                if (tL_error4 != null) {
                    boolean equalsIgnoreCase = "SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error4.text);
                    ArrayList arrayList7 = launchActivity5.e0;
                    if (equalsIgnoreCase) {
                        b0 = c41.b0((d) b10.f(1, arrayList7));
                        i = 2131747128;
                    } else {
                        b0 = c41.b0((d) b10.f(1, arrayList7));
                        i = 2131747129;
                    }
                    mlb.y(null, i, b0, null);
                } else if (!launchActivity5.isFinishing()) {
                    if (tLObject7 instanceof TLRPC.TL_payments_paymentFormStars) {
                        a3a a3aVar = launchActivity5.Y0;
                        launchActivity5.Y0 = null;
                        jva.v(launchActivity5.P, false).W(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject7, new zz5(k16Var3, c2 == true ? 1 : 0), new l06(a3aVar, b3));
                        break;
                    } else {
                        if (tLObject7 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject7;
                            oc7.r1(i3).d4(paymentForm.users, false);
                            pVar = new p(paymentForm, null, str12, launchActivity5.N().getLastFragment());
                        } else {
                            pVar = tLObject7 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject7) : null;
                        }
                        if (pVar != null) {
                            a3a a3aVar2 = launchActivity5.Y0;
                            if (a3aVar2 != null) {
                                launchActivity5.Y0 = null;
                                pVar.a1 = new m06(a3aVar2, b3);
                            }
                            launchActivity5.t0(pVar);
                        }
                    }
                }
                try {
                    k16Var3.run();
                    break;
                } catch (Exception e5) {
                    fc4.g(e5, true);
                    return;
                }
            case 13:
                wg6 wg6Var = (wg6) obj6;
                String str14 = (String) obj3;
                fj0 fj0Var = (fj0) obj4;
                List list = (List) obj5;
                String str15 = (String) obj2;
                String str16 = (String) obj;
                mh6 mh6Var = wg6Var.w;
                StringBuilder p = wi8.p("LoginBilling queried \"", str14, "\" product: ");
                p.append(cj0.i(fj0Var.a));
                fc4.b(p.toString());
                int i8 = fj0Var.a;
                if (i8 != 0) {
                    wg6Var.e = "BILLING_".concat(cj0.i(i8));
                    new c41(mh6Var.a0, null).H(R.raw.error, jb6.a0(null, null, 2131743565, cj0.i(fj0Var.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    ln8 ln8Var = (ln8) list.get(0);
                    in8 a = ln8Var.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_inputStorePaymentAuthCode.currency)) * (a.b / 1000000.0d));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str15) ? "" : str15;
                    tL_inputStorePaymentAuthCode.phone_number = str16;
                    int i9 = this.d;
                    tL_inputStorePaymentAuthCode.premium_days = i9;
                    StringBuilder p2 = wi8.p("LoginBilling found \"", str14, "\" product, with currency=");
                    p2.append(tL_inputStorePaymentAuthCode.currency);
                    p2.append(" amount=");
                    p2.append(tL_inputStorePaymentAuthCode.amount);
                    p2.append("; phone=");
                    p2.append(str16);
                    p2.append(", phone_code_hash=");
                    p2.append(str15);
                    fc4.b(p2.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i2 = ((d) mh6Var).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_payments_canPurchaseStore, new u91(wg6Var, a, i9, ln8Var, tL_inputStorePaymentAuthCode, str14, tL_payments_canPurchaseStore, (byte) 3), 10);
                    break;
                } else {
                    wg6Var.e = "PRODUCT_NOT_FOUND";
                    new c41(mh6Var.a0, null).H(R.raw.error, jb6.a0(null, null, 2131743565, "PRODUCT_NOT_FOUND"));
                    break;
                }
                break;
            case 14:
                ArrayList arrayList8 = (ArrayList) obj6;
                ArrayList arrayList9 = (ArrayList) obj4;
                Integer num = (Integer) obj5;
                yn6 yn6Var = (yn6) obj3;
                yn6 yn6Var2 = (yn6) obj2;
                yn6 yn6Var3 = (yn6) obj;
                String[] strArr = MediaController.W1;
                boolean V0 = PhotoViewer.r0().V0();
                int i10 = this.d;
                if (!V0 || MediaController.h2) {
                    MediaController.c2 = arrayList8;
                    MediaController.d2 = arrayList9;
                    MediaController.e2 = null;
                    MediaController.b2 = yn6Var2;
                    MediaController.a2 = yn6Var;
                    nm7.e().k(nm7.r2, Integer.valueOf(i10), arrayList8, arrayList9, num);
                    break;
                } else {
                    qu quVar = MediaController.e2;
                    if (quVar != null) {
                        gm.r(quVar);
                    }
                    qu quVar2 = new qu(i10, arrayList8, arrayList9, num, yn6Var, yn6Var2, yn6Var3);
                    MediaController.e2 = quVar2;
                    gm.d3(quVar2, 1000L);
                    break;
                }
            case 15:
                ArrayList arrayList10 = (ArrayList) obj4;
                vh6 vh6Var = (vh6) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj5;
                oc7 oc7Var2 = (oc7) obj;
                k17 k17Var = ((g17) obj6).h;
                if (k17Var.k0 != 0 && i3 == k17Var.j0 && k17Var.E != null && k17Var.y != null) {
                    k17Var.W(vh6Var, arrayList10, false);
                    if (tL_error5 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject8;
                        oc7Var2.d4(tL_channels_channelParticipants.users, false);
                        oc7Var2.X3(tL_channels_channelParticipants.chats, false);
                        k17Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e6 = z8c.h(k17Var.f).e();
                            for (int i11 = 0; i11 < tL_channels_channelParticipants.participants.size(); i11++) {
                                long B1 = k47.B1(tL_channels_channelParticipants.participants.get(i11).peer);
                                if (k17Var.E.h(B1) < 0 && ((B1 != 0 || k17Var.E.h(e6) < 0) && (k17Var.l0 || (B1 != e6 && B1 != 0)))) {
                                    if (B1 < 0) {
                                        TLRPC.Chat L0 = oc7Var2.L0(Long.valueOf(-B1));
                                        if (L0 == null) {
                                            break;
                                        } else {
                                            k17Var.y.add(L0);
                                        }
                                    } else {
                                        TLRPC.User W1 = oc7Var2.W1(Long.valueOf(B1));
                                        if (W1 == null) {
                                            break;
                                        } else {
                                            k17Var.y.add(W1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    k17Var.f();
                    k17Var.W.a(!k17Var.y.isEmpty());
                }
                k17Var.k0 = 0;
                break;
            case 16:
                ProfileActivity profileActivity = (ProfileActivity) obj6;
                View view = (View) obj4;
                String str17 = (String) obj3;
                boolean[] zArr3 = (boolean[]) obj5;
                String[] strArr2 = (String[]) obj2;
                String str18 = (String) obj;
                RectF rectF = ProfileActivity.e7;
                if (profileActivity.getParentActivity() != null) {
                    bu5 I = bu5.I(profileActivity, view);
                    I.X(profileActivity.a.V0(view, false));
                    I.w = false;
                    I.b(R.drawable.msg_copy, jb6.M0(2131751704, null), new h65((Object) profileActivity, (Object) str17, i3, (byte) 25), false);
                    I.k(R.drawable.msg_translate, jb6.M0(2131743643, null), new jy6(profileActivity, strArr2, str18, str17, (byte) 28), zArr3[0]);
                    I.a0();
                    break;
                }
                break;
            case 17:
                StringBuilder sb2 = new StringBuilder();
                kt6.v(sb2, oc7.r1(i3).N2, "/", (String) obj3, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new es8((lea) obj6, (Context) obj5, sb3, sb3, (ylb) obj2, (d) obj).show();
                break;
            case 18:
                a6a a6aVar = (a6a) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj4;
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) obj2;
                m5a m5aVar = (m5a) obj;
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
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) m5aVar.c;
                    if (i3 >= 0 && i3 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i3).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList11 = m5aVar.A;
                    if (arrayList11 != null && i3 >= 0 && i3 < arrayList11.size()) {
                        m5aVar.A.set(i3, tL_inputMediaUploadedPhoto);
                    }
                    m5aVar.j = null;
                    m5aVar.i = null;
                    HashMap hashMap = m5aVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str19 + "_ct");
                    }
                    a6aVar.z0(m5aVar, tL_inputMediaUploadedPhoto, null, str19);
                    break;
                } else {
                    m5aVar.c();
                    break;
                }
                break;
            default:
                TLObject tLObject10 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((he) obj6).dismiss();
                if (tLObject10 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject10;
                    hs6.d0(i3).L1(tL_messages_stickerSet, true);
                    if (!hs6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                        hs6.d0(i3).h2(null, tLObject10, 2, null, false, false);
                    }
                    gm.d3(new uva(tLObject10, document2, (byte) 6), 250L);
                    break;
                } else if (tL_error6 != null) {
                    if (ad4.r(tL_error6.text)) {
                        ad4.n(i3).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        c41.e0(tL_error6);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ qu(he heVar, k11 k11Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = heVar;
        this.f = k11Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public /* synthetic */ qu(he heVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = heVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ qu(qw0 qw0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, mw0 mw0Var, ow0 ow0Var) {
        this.a = (byte) 1;
        this.e = qw0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = mw0Var;
        this.n = ow0Var;
    }

    public /* synthetic */ qu(wg6 wg6Var, String str, fj0 fj0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = wg6Var;
        this.b = str;
        this.f = fj0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public /* synthetic */ qu(g17 g17Var, int i, ArrayList arrayList, vh6 vh6Var, TLRPC.TL_error tL_error, TLObject tLObject, oc7 oc7Var) {
        this.a = (byte) 15;
        this.e = g17Var;
        this.d = i;
        this.f = arrayList;
        this.b = vh6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = oc7Var;
    }

    public /* synthetic */ qu(jm7 jm7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = jm7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ qu(lea leaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, ylb ylbVar, d dVar) {
        this.a = (byte) 17;
        this.e = leaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = ylbVar;
        this.n = dVar;
    }

    public /* synthetic */ qu(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ qu(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ qu(TLObject tLObject, he heVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, ylb ylbVar, dc5 dc5Var) {
        this.a = (byte) 3;
        this.c = tLObject;
        this.e = heVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = ylbVar;
        this.n = dc5Var;
    }

    public /* synthetic */ qu(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, co1 co1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = co1Var;
    }

    public /* synthetic */ qu(c cVar, hlc hlcVar, sz4 sz4Var, ArrayList arrayList, ArrayList arrayList2, int i, zkc zkcVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = hlcVar;
        this.c = sz4Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = zkcVar;
    }

    public /* synthetic */ qu(LaunchActivity launchActivity, TLObject tLObject, int i, nk3 nk3Var, d dVar, TLRPC.User user, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = nk3Var;
        this.h = dVar;
        this.n = user;
        this.b = str;
    }

    public /* synthetic */ qu(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, he heVar, k16 k16Var, String str) {
        this.a = (byte) 9;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = heVar;
        this.n = k16Var;
        this.b = str;
    }

    public /* synthetic */ qu(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, k16 k16Var, int i, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = k16Var;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ qu(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
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
