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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.o;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class st implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ st(int i, ArrayList arrayList, ArrayList arrayList2, Integer num, do6 do6Var, do6 do6Var2, do6 do6Var3) {
        this.a = (byte) 14;
        this.d = i;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = num;
        this.b = do6Var;
        this.h = do6Var2;
        this.n = do6Var3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:140:0x03fc, code lost:
    
        if (r14.chat.has_geo != false) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0501  */
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
        p pVar;
        d31 b0;
        int i;
        tg5 tg5Var;
        LaunchActivity launchActivity;
        int i2;
        byte b = this.a;
        byte b2 = 3;
        byte b3 = 2;
        int i3 = this.d;
        byte b4 = 0;
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
                wt wtVar = (wt) obj4;
                TLObject tLObject = (TLObject) obj5;
                String str = (String) obj3;
                qt qtVar = (qt) obj2;
                TLRPC.TL_messages_getWebPage tL_messages_getWebPage = (TLRPC.TL_messages_getWebPage) obj;
                if (oVar.H0 != 0 && i3 == oVar.J0) {
                    if (wtVar != null) {
                        wtVar.b();
                    }
                    oVar.H0 = 0;
                    oVar.Z(false);
                    if (oVar.W) {
                        if (tLObject instanceof TLRPC.TL_messages_webPage) {
                            TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                            uc7.s1(oVar.Y).j4(tL_messages_webPage.users, false);
                            uc7.s1(oVar.Y).c4(tL_messages_webPage.chats, false);
                            TLRPC.WebPage webPage = tL_messages_webPage.webpage;
                            if (webPage == null || !(webPage.cached_page instanceof TL_iv.TL_page)) {
                                if (!((Boolean) qtVar.run()).booleanValue()) {
                                    if (uc7.s1(oVar.Y).T2(tL_messages_getWebPage.url)) {
                                        oVar.d(1, tL_messages_getWebPage.url);
                                        break;
                                    } else {
                                        m01.u(oVar.M, tL_messages_getWebPage.url);
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
                            if (!((Boolean) qtVar.run()).booleanValue()) {
                                if (uc7.s1(oVar.Y).T2(tL_messages_getWebPage.url)) {
                                    oVar.d(1, tL_messages_getWebPage.url);
                                    break;
                                } else {
                                    m01.u(oVar.M, tL_messages_getWebPage.url);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                rv0 rv0Var = (rv0) obj6;
                String str2 = (String) obj3;
                TLObject tLObject2 = (TLObject) obj5;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj4;
                nv0 nv0Var = (nv0) obj2;
                pv0 pv0Var = (pv0) obj;
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("req_id", str2);
                    if (tLObject2 instanceof TLRPC.TL_dataJSON) {
                        jSONObject2.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject2).data).nextValue());
                    } else if (tL_error != null) {
                        jSONObject2.put("error", tL_error.text);
                    }
                    rv0.t(i3, nv0Var, pv0Var, "custom_method_invoked", jSONObject2);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    rv0Var.Y(null);
                    return;
                }
            case 2:
                TLObject tLObject3 = (TLObject) obj5;
                id idVar = (id) obj6;
                Context context = (Context) obj4;
                TL_phone.exportGroupCallInvite exportgroupcallinvite = (TL_phone.exportGroupCallInvite) obj3;
                vnb vnbVar = (vnb) obj2;
                gc5 gc5Var = (gc5) obj;
                if (tLObject3 instanceof TL_phone.exportedGroupCallInvite) {
                    idVar.dismiss();
                    i91.l0(context, this.d, exportgroupcallinvite.call, ((TL_phone.exportedGroupCallInvite) tLObject3).link, vnbVar, true, true);
                } else {
                    idVar.dismiss();
                }
                hl.c3(gc5Var);
                break;
            case 3:
                TLRPC.InputGroupCall inputGroupCall = (TLRPC.InputGroupCall) obj6;
                TL_phone.toggleGroupCallSettings togglegroupcallsettings = new TL_phone.toggleGroupCallSettings();
                togglegroupcallsettings.call = inputGroupCall;
                togglegroupcallsettings.reset_invite_hash = true;
                int i4 = this.d;
                ConnectionsManager.getInstance(i4).sendRequest(togglegroupcallsettings, new u81(i4, inputGroupCall, (String[]) obj4, (FrameLayout) obj5, (p66) obj3, (nx0) obj2, (vnb) obj));
                break;
            case 4:
                c cVar2 = (c) obj6;
                tnc tncVar = (tnc) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                ArrayList arrayList2 = (ArrayList) obj2;
                nnc nncVar = (nnc) obj;
                ChatActivityEnterView chatActivityEnterView = cVar2.a;
                ae8 a6 = chatActivityEnterView.E3.a6(tncVar, (wz4) obj5);
                if (a6 == null) {
                    hl.B2(tncVar);
                    break;
                } else {
                    int J0 = chatActivityEnterView.J0(aob.E8);
                    int i5 = 0;
                    while (i5 < arrayList.size()) {
                        pnc pncVar = i5 < arrayList2.size() ? (pnc) arrayList2.get(i5) : null;
                        if (pncVar == null) {
                            Context context2 = chatActivityEnterView.getContext();
                            CharSequence charSequence = (CharSequence) arrayList.get(i5);
                            boolean z = i5 == i3;
                            k43 k43Var = bn3.J0;
                            a6.e(new l7(context2, charSequence, null, J0, z), 44, new zd((Object) nncVar, i5, (byte) 22));
                            cVar = cVar2;
                        } else {
                            Context context3 = chatActivityEnterView.getContext();
                            CharSequence charSequence2 = (CharSequence) arrayList.get(i5);
                            String str3 = pncVar.a;
                            boolean z2 = i5 == i3;
                            k43 k43Var2 = bn3.J0;
                            l7 l7Var = new l7(context3, charSequence2, str3, J0, z2);
                            a6.e(l7Var, 54, null);
                            cVar = cVar2;
                            int i6 = J0;
                            J0 = i6;
                            l7Var.setOnClickListener(new jf((Object) cVar, (Object) pncVar, i6, (Object) a6, (byte) 2));
                        }
                        i5++;
                        cVar2 = cVar;
                    }
                    a6.J = new go1(tncVar, (byte) 15);
                    int[] iArr = new int[2];
                    chatActivityEnterView.getLocationInWindow(iArr);
                    a6.F = iArr[1];
                    a6.H = hl.L(316.0f);
                    a6.j();
                    break;
                }
            case 5:
                TLObject tLObject4 = (TLObject) obj5;
                ArrayList arrayList3 = (ArrayList) obj4;
                AtomicInteger atomicInteger = (AtomicInteger) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                on1 on1Var = (on1) obj;
                if (((TLRPC.TL_error) obj6) == null && (tLObject4 instanceof TLRPC.TL_channels_channelParticipants)) {
                    arrayList3.set(i3, (TLRPC.TL_channels_channelParticipants) tLObject4);
                }
                atomicInteger.getAndIncrement();
                if (atomicInteger.get() == arrayList4.size()) {
                    on1Var.run();
                    break;
                }
                break;
            case 6:
                a55 a55Var = (a55) obj6;
                w45 w45Var = (w45) obj4;
                String str4 = (String) obj3;
                c35 c35Var = (c35) obj2;
                pcc pccVar = (pcc) obj;
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    String str5 = w45Var.d;
                    tonconnectsession = w45Var.a;
                    JSONObject put2 = jSONObject3.put("id", str5);
                    if (i3 < 0) {
                        put2.put("result", obj5);
                    } else {
                        if (str4 == null) {
                            str4 = "Could not complete request";
                        }
                        put2.put("error", new JSONObject().put("code", i3).put("message", str4));
                    }
                    put = new JSONObject().put("body", WalletEngine2.tonConnectCrypto(c35Var, tonconnectsession, w45Var.h, w45Var.g, new JSONObject().put("encrypt", put2)).getString("body")).put("traceId", w45Var.i).put("disconnect", i3 < 0 && "disconnect".equals(w45Var.e));
                } catch (Exception e2) {
                    h = a55.h("encrypt response", e2);
                    jSONObject = null;
                }
                if (!uc7.s1(a55Var.a).Y3.edit().putString(a55.k(tonconnectsession.id, w45Var.b), put.toString()).commit()) {
                    throw new IllegalStateException("Could not save TON Connect response");
                }
                jSONObject = put;
                h = null;
                hl.c3(new tw4((Object) a55Var, (Object) jSONObject, (Object) pccVar, (Object) h, (Object) w45Var, (byte) 4));
                break;
            case 7:
                boolean[] zArr = (boolean[]) obj6;
                Context context4 = (Context) obj4;
                TLRPC.User user = (TLRPC.User) obj5;
                JSONObject jSONObject4 = (JSONObject) obj3;
                vnb vnbVar2 = (vnb) obj2;
                l55 l55Var = (l55) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    int i7 = this.d;
                    org.telegram.ui.Wallet.c C = org.telegram.ui.Wallet.c.C(i7);
                    String x = C.x();
                    byte[] D = C.D();
                    if (x == null || D == null || C.b == null) {
                        d31.c0(ob6.M0(2131742590, null));
                        l55Var.a();
                        break;
                    } else {
                        int currentTime = ConnectionsManager.getInstance(i7).getCurrentTime();
                        try {
                            if ("signData".equals(jSONObject4.optString("method"))) {
                                JSONObject jSONObject5 = jSONObject4.getJSONObject("payload");
                                a55.G(x, jSONObject5);
                                o55.c(context4, i7, user, jSONObject5, x, (byte[]) D.clone(), vnbVar2, l55Var);
                            } else {
                                JSONObject jSONObject6 = jSONObject4.getJSONObject("transaction");
                                a55.I(jSONObject6, x, currentTime);
                                o55.d(context4, i7, user, new z45(jSONObject6), x, (byte[]) D.clone(), vnbVar2, l55Var);
                            }
                            break;
                        } catch (Exception e3) {
                            d31.c0(a55.h("widget call", e3));
                            l55Var.a();
                            return;
                        }
                    }
                }
                break;
            case 8:
                ob5.a((id) obj6, (l01) obj4, (TLObject) obj5, this.d, (Activity) obj3, (TLRPC.TL_inputGroupCallSlug) obj2, (TLRPC.TL_error) obj);
                break;
            case 9:
                LaunchActivity launchActivity2 = (LaunchActivity) obj6;
                TLObject tLObject5 = (TLObject) obj5;
                l01 l01Var = (l01) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                uc7 uc7Var = (uc7) obj;
                String str6 = (String) obj3;
                String str7 = LaunchActivity.C1;
                if (tLObject5 instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) tLObject5;
                    uc7Var.i4(user2, false, false);
                    if (lbc.D(user2)) {
                        if (l01Var != null) {
                            l01Var.b();
                        }
                        launchActivity2.m0(i3, user2.id, null);
                        break;
                    } else {
                        launchActivity2.X(i3, user2, str6, l01Var);
                        break;
                    }
                } else {
                    if (l01Var != null) {
                        l01Var.b();
                    }
                    StringBuilder sb = new StringBuilder("cant import contact token, err=");
                    sb.append(tL_error2 == null ? null : tL_error2.text);
                    cc4.d(sb.toString());
                    e Q = LaunchActivity.Q();
                    if (Q != null) {
                        xnb.x(null, 2131747865, d31.b0(Q), null);
                        break;
                    }
                }
                break;
            case 10:
                LaunchActivity launchActivity3 = (LaunchActivity) obj6;
                uj3 uj3Var = (uj3) obj4;
                e eVar = (e) obj2;
                TLRPC.User user3 = (TLRPC.User) obj;
                String str8 = (String) obj3;
                String str9 = LaunchActivity.C1;
                if (((TLObject) obj5) instanceof TLRPC.TL_boolTrue) {
                    ls6.d0(i3).G0(false, true, new tw4((Object) launchActivity3, (Object) uj3Var, (Object) eVar, (Object) user3, (Object) str8, (byte) 11));
                    break;
                }
                break;
            case 11:
                LaunchActivity launchActivity4 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj4;
                TLObject tLObject6 = (TLObject) obj5;
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = (TLRPC.TL_inputInvoiceSlug) obj2;
                tg5 tg5Var2 = (tg5) obj;
                String str10 = (String) obj3;
                String str11 = LaunchActivity.C1;
                if (tL_error3 != null) {
                    boolean equalsIgnoreCase = "SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error3.text);
                    ArrayList arrayList5 = launchActivity4.e0;
                    if (equalsIgnoreCase) {
                        b0 = d31.b0((e) c00.g(1, arrayList5));
                        i = 2131747122;
                    } else {
                        b0 = d31.b0((e) c00.g(1, arrayList5));
                        i = 2131747123;
                    }
                    xnb.x(null, i, b0, null);
                } else if (!launchActivity4.isFinishing()) {
                    if (tLObject6 instanceof TLRPC.TL_payments_paymentFormStars) {
                        r4a r4aVar = launchActivity4.Y0;
                        launchActivity4.Y0 = null;
                        jxa.v(launchActivity4.P, false).X(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject6, new b06(tg5Var2, c == true ? 1 : 0), new m06(r4aVar, b4));
                        break;
                    } else {
                        if (tLObject6 instanceof TLRPC.PaymentForm) {
                            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject6;
                            uc7.s1(i3).j4(paymentForm.users, false);
                            pVar = new p(paymentForm, null, str10, launchActivity4.N().getLastFragment());
                        } else {
                            pVar = tLObject6 instanceof TLRPC.PaymentReceipt ? new p((TLRPC.PaymentReceipt) tLObject6) : null;
                        }
                        if (pVar != null) {
                            r4a r4aVar2 = launchActivity4.Y0;
                            if (r4aVar2 != null) {
                                launchActivity4.Y0 = null;
                                pVar.a1 = new n06(r4aVar2, b4);
                            }
                            launchActivity4.t0(pVar);
                        }
                    }
                }
                try {
                    tg5Var2.run();
                    break;
                } catch (Exception e4) {
                    cc4.g(e4, true);
                    return;
                }
            case 12:
                LaunchActivity launchActivity5 = (LaunchActivity) obj6;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj4;
                TLObject tLObject7 = (TLObject) obj5;
                id idVar2 = (id) obj2;
                tg5 tg5Var3 = (tg5) obj;
                String str12 = (String) obj3;
                String str13 = LaunchActivity.C1;
                ArrayList arrayList6 = launchActivity5.e0;
                if (!launchActivity5.isFinishing()) {
                    if (tL_error4 != null) {
                        tg5Var = tg5Var3;
                        launchActivity = launchActivity5;
                        if (tL_error4.text.startsWith("INVITE_HASH_EXPIRED") && LaunchActivity.S() != null) {
                            bs2.v(null, 2131748906, d31.b0(LaunchActivity.S()), R.raw.linkbroken, 36);
                        }
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(launchActivity);
                        String M0 = ob6.M0(R.string.AppName, null);
                        id idVar3 = alertDialog$Builder.a;
                        idVar3.S = M0;
                        if (!tL_error4.text.startsWith("FLOOD_WAIT")) {
                        }
                        alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                        launchActivity.F0(alertDialog$Builder);
                    } else if (launchActivity5.p0 != null) {
                        TLRPC.ChatInvite chatInvite = (TLRPC.ChatInvite) tLObject7;
                        TLRPC.Chat chat = chatInvite.chat;
                        if (chat != null) {
                            if (xc2.l0(chat)) {
                                TLRPC.Chat chat2 = chatInvite.chat;
                                if (!chat2.kicked) {
                                    if (!xc2.t0(chat2)) {
                                        if (!(chatInvite instanceof TLRPC.TL_chatInvitePeek)) {
                                            break;
                                        }
                                    }
                                }
                            }
                            uc7.s1(i3).a4(chatInvite.chat, false);
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.add(chatInvite.chat);
                            kf7.a0(i3).n1(null, arrayList7, false, true);
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", chatInvite.chat.id);
                            if (arrayList6.isEmpty() || uc7.s1(i3).C(bundle, (e) c00.g(1, arrayList6), null, null)) {
                                boolean[] zArr2 = new boolean[1];
                                idVar2.setOnCancelListener(new zn1(zArr2, c2 == true ? 1 : 0));
                                if (!chatInvite.chat.forum) {
                                    uc7.s1(i3).r0(-chatInvite.chat.id, 0, new v16(launchActivity5, tg5Var3, zArr2, bundle, chatInvite));
                                    break;
                                } else {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putLong("chat_id", chatInvite.chat.id);
                                    launchActivity5.t0(tzb.G0(launchActivity5, bundle2));
                                }
                            }
                            tg5Var = tg5Var3;
                        }
                        tg5Var = tg5Var3;
                        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = chatInvite.subscription_pricing;
                        if (tL_starsSubscriptionPricing == null || chatInvite.can_refulfill_subscription) {
                            e eVar2 = (e) c00.g(1, arrayList6);
                            eVar2.showDialog(new jw5(launchActivity5, chatInvite, str12, eVar2, eVar2 instanceof zu1 ? ((zu1) eVar2).Ba : null));
                        } else {
                            long j = tL_starsSubscriptionPricing.amount;
                            uc7.s1(i3).a4(chatInvite.chat, false);
                            jxa.v(launchActivity5.P, false).i0(str12, chatInvite, new ky(launchActivity5, j, b2));
                        }
                    } else {
                        tg5Var = tg5Var3;
                        launchActivity = launchActivity5;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(launchActivity);
                        String M02 = ob6.M0(R.string.AppName, null);
                        id idVar32 = alertDialog$Builder2.a;
                        idVar32.S = M02;
                        if (!tL_error4.text.startsWith("FLOOD_WAIT")) {
                            idVar32.U = ob6.M0(2131750647, null);
                        } else if (tL_error4.text.startsWith("INVITE_HASH_EXPIRED")) {
                            idVar32.S = ob6.M0(2131750840, null);
                            idVar32.U = ob6.M0(2131748906, null);
                        } else {
                            idVar32.U = ob6.M0(2131748829, null);
                        }
                        alertDialog$Builder2.j(ob6.M0(2131747558, null), null);
                        launchActivity.F0(alertDialog$Builder2);
                    }
                    try {
                        tg5Var.run();
                        break;
                    } catch (Exception e5) {
                        cc4.g(e5, true);
                        return;
                    }
                }
                break;
            case 13:
                zg6 zg6Var = (zg6) obj6;
                String str14 = (String) obj3;
                gi0 gi0Var = (gi0) obj4;
                List list = (List) obj5;
                String str15 = (String) obj2;
                String str16 = (String) obj;
                qh6 qh6Var = zg6Var.w;
                StringBuilder p = ik8.p("LoginBilling queried \"", str14, "\" product: ");
                p.append(di0.i(gi0Var.a));
                cc4.b(p.toString());
                int i8 = gi0Var.a;
                if (i8 != 0) {
                    zg6Var.e = "BILLING_".concat(di0.i(i8));
                    new d31(qh6Var.a0, null).H(R.raw.error, ob6.a0(null, null, 2131743533, di0.i(gi0Var.a)));
                    break;
                } else if (list != null && !list.isEmpty()) {
                    wo8 wo8Var = (wo8) list.get(0);
                    to8 a = wo8Var.a();
                    TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                    tL_inputStorePaymentAuthCode.currency = a.c;
                    tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, di0.h().g(tL_inputStorePaymentAuthCode.currency)) * (a.b / 1000000.0d));
                    tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str15) ? "" : str15;
                    tL_inputStorePaymentAuthCode.phone_number = str16;
                    int i9 = this.d;
                    tL_inputStorePaymentAuthCode.premium_days = i9;
                    StringBuilder p2 = ik8.p("LoginBilling found \"", str14, "\" product, with currency=");
                    p2.append(tL_inputStorePaymentAuthCode.currency);
                    p2.append(" amount=");
                    p2.append(tL_inputStorePaymentAuthCode.amount);
                    p2.append("; phone=");
                    p2.append(str16);
                    p2.append(", phone_code_hash=");
                    p2.append(str15);
                    cc4.b(p2.toString());
                    TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                    tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                    i2 = ((e) qh6Var).currentAccount;
                    ConnectionsManager.getInstance(i2).sendRequest(tL_payments_canPurchaseStore, new u81(zg6Var, a, i9, wo8Var, tL_inputStorePaymentAuthCode, str14, tL_payments_canPurchaseStore, (byte) 3), 10);
                    break;
                } else {
                    zg6Var.e = "PRODUCT_NOT_FOUND";
                    new d31(qh6Var.a0, null).H(R.raw.error, ob6.a0(null, null, 2131743533, "PRODUCT_NOT_FOUND"));
                    break;
                }
            case 14:
                ArrayList arrayList8 = (ArrayList) obj6;
                ArrayList arrayList9 = (ArrayList) obj4;
                Integer num = (Integer) obj5;
                do6 do6Var = (do6) obj3;
                do6 do6Var2 = (do6) obj2;
                do6 do6Var3 = (do6) obj;
                String[] strArr = MediaController.W1;
                boolean V0 = PhotoViewer.q0().V0();
                int i10 = this.d;
                if (!V0 || MediaController.h2) {
                    MediaController.c2 = arrayList8;
                    MediaController.d2 = arrayList9;
                    MediaController.e2 = null;
                    MediaController.b2 = do6Var2;
                    MediaController.a2 = do6Var;
                    jn7.e().k(jn7.r2, Integer.valueOf(i10), arrayList8, arrayList9, num);
                    break;
                } else {
                    st stVar = MediaController.e2;
                    if (stVar != null) {
                        hl.r(stVar);
                    }
                    st stVar2 = new st(i10, arrayList8, arrayList9, num, do6Var, do6Var2, do6Var3);
                    MediaController.e2 = stVar2;
                    hl.d3(stVar2, 1000L);
                    break;
                }
                break;
            case 15:
                ArrayList arrayList10 = (ArrayList) obj4;
                zh6 zh6Var = (zh6) obj3;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                TLObject tLObject8 = (TLObject) obj5;
                uc7 uc7Var2 = (uc7) obj;
                r17 r17Var = ((n17) obj6).h;
                if (r17Var.k0 != 0 && i3 == r17Var.j0 && r17Var.E != null && r17Var.y != null) {
                    r17Var.W(zh6Var, arrayList10, false);
                    if (tL_error5 == null) {
                        TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject8;
                        uc7Var2.j4(tL_channels_channelParticipants.users, false);
                        uc7Var2.c4(tL_channels_channelParticipants.chats, false);
                        r17Var.y.isEmpty();
                        if (!tL_channels_channelParticipants.participants.isEmpty()) {
                            long e6 = yac.h(r17Var.f).e();
                            for (int i11 = 0; i11 < tL_channels_channelParticipants.participants.size(); i11++) {
                                long B1 = r47.B1(tL_channels_channelParticipants.participants.get(i11).peer);
                                if (r17Var.E.h(B1) < 0 && ((B1 != 0 || r17Var.E.h(e6) < 0) && (r17Var.l0 || (B1 != e6 && B1 != 0)))) {
                                    if (B1 < 0) {
                                        TLRPC.Chat M03 = uc7Var2.M0(Long.valueOf(-B1));
                                        if (M03 == null) {
                                            break;
                                        } else {
                                            r17Var.y.add(M03);
                                        }
                                    } else {
                                        TLRPC.User X1 = uc7Var2.X1(Long.valueOf(B1));
                                        if (X1 == null) {
                                            break;
                                        } else {
                                            r17Var.y.add(X1);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    r17Var.f();
                    r17Var.W.a(!r17Var.y.isEmpty());
                }
                r17Var.k0 = 0;
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
                    fu5 I = fu5.I(profileActivity, view);
                    I.X(profileActivity.a.W0(view, false));
                    I.w = false;
                    I.b(R.drawable.msg_copy, ob6.M0(2131751732, null), new l65((Object) profileActivity, (Object) str17, i3, (byte) 26), false);
                    I.k(R.drawable.msg_translate, ob6.M0(2131743611, null), new oy6(profileActivity, strArr2, str18, str17, (byte) 27), zArr3[0]);
                    I.a0();
                    break;
                }
                break;
            case 17:
                StringBuilder sb2 = new StringBuilder();
                qu6.u(sb2, uc7.s1(i3).N2, "/", (String) obj3, "/c/");
                sb2.append(((TL_stars.TL_starGiftCollection) obj4).collection_id);
                String sb3 = sb2.toString();
                new ot8((cga) obj6, (Context) obj5, sb3, sb3, (vnb) obj2, (e) obj).show();
                break;
            case 18:
                r7a r7aVar = (r7a) obj6;
                TLObject tLObject9 = (TLObject) obj5;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj4;
                TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = (TLRPC.TL_inputMediaUploadedDocument) obj2;
                d7a d7aVar = (d7a) obj;
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
                    TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) d7aVar.c;
                    if (i3 >= 0 && i3 < tL_messages_sendMultiMedia.multi_media.size()) {
                        tL_messages_sendMultiMedia.multi_media.get(i3).media = tL_inputMediaUploadedPhoto;
                    }
                    ArrayList arrayList11 = d7aVar.A;
                    if (arrayList11 != null && i3 >= 0 && i3 < arrayList11.size()) {
                        d7aVar.A.set(i3, tL_inputMediaUploadedPhoto);
                    }
                    d7aVar.j = null;
                    d7aVar.i = null;
                    HashMap hashMap = d7aVar.E;
                    if (hashMap != null) {
                        hashMap.remove(str19 + "_ct");
                    }
                    r7aVar.z0(d7aVar, tL_inputMediaUploadedPhoto, null, str19);
                    break;
                } else {
                    d7aVar.c();
                    break;
                }
                break;
            default:
                TLObject tLObject10 = (TLObject) obj5;
                TLRPC.Document document2 = (TLRPC.Document) obj4;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj3;
                TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet = (TLRPC.TL_stickers_addStickerToSet) obj;
                ((id) obj6).dismiss();
                if (tLObject10 instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject10;
                    ls6.d0(i3).L1(tL_messages_stickerSet, true);
                    if (!ls6.d0(i3).D0(tL_messages_stickerSet.set.id, true)) {
                        ls6.d0(i3).h2(null, tLObject10, 2, null, false, false);
                    }
                    hl.d3(new n3b(tLObject10, document2, b3), 250L);
                    break;
                } else if (tL_error6 != null) {
                    if (xc4.r(tL_error6.text)) {
                        xc4.n(i3).u(new Object[]{tL_stickers_addStickerToSet}, obj2);
                        break;
                    } else {
                        d31.e0(tL_error6);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ st(id idVar, l01 l01Var, TLObject tLObject, int i, Activity activity, TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug, TLRPC.TL_error tL_error) {
        this.a = (byte) 8;
        this.e = idVar;
        this.f = l01Var;
        this.c = tLObject;
        this.d = i;
        this.b = activity;
        this.h = tL_inputGroupCallSlug;
        this.n = tL_error;
    }

    public /* synthetic */ st(id idVar, TLObject tLObject, int i, TLRPC.Document document, TLRPC.TL_error tL_error, Object obj, TLRPC.TL_stickers_addStickerToSet tL_stickers_addStickerToSet) {
        this.a = (byte) 19;
        this.e = idVar;
        this.c = tLObject;
        this.d = i;
        this.f = document;
        this.b = tL_error;
        this.h = obj;
        this.n = tL_stickers_addStickerToSet;
    }

    public /* synthetic */ st(rv0 rv0Var, String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, nv0 nv0Var, pv0 pv0Var) {
        this.a = (byte) 1;
        this.e = rv0Var;
        this.b = str;
        this.c = tLObject;
        this.f = tL_error;
        this.d = i;
        this.h = nv0Var;
        this.n = pv0Var;
    }

    public /* synthetic */ st(zg6 zg6Var, String str, gi0 gi0Var, List list, String str2, String str3, int i) {
        this.a = (byte) 13;
        this.e = zg6Var;
        this.b = str;
        this.f = gi0Var;
        this.c = list;
        this.h = str2;
        this.n = str3;
        this.d = i;
    }

    public /* synthetic */ st(n17 n17Var, int i, ArrayList arrayList, zh6 zh6Var, TLRPC.TL_error tL_error, TLObject tLObject, uc7 uc7Var) {
        this.a = (byte) 15;
        this.e = n17Var;
        this.d = i;
        this.f = arrayList;
        this.b = zh6Var;
        this.h = tL_error;
        this.c = tLObject;
        this.n = uc7Var;
    }

    public /* synthetic */ st(fn7 fn7Var, TLObject tLObject, Object obj, TLObject tLObject2, Object obj2, int i, String str, byte b) {
        this.a = b;
        this.e = fn7Var;
        this.c = tLObject;
        this.f = obj;
        this.h = tLObject2;
        this.n = obj2;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ st(cga cgaVar, int i, String str, TL_stars.TL_starGiftCollection tL_starGiftCollection, Context context, vnb vnbVar, e eVar) {
        this.a = (byte) 17;
        this.e = cgaVar;
        this.d = i;
        this.b = str;
        this.f = tL_starGiftCollection;
        this.c = context;
        this.h = vnbVar;
        this.n = eVar;
    }

    public /* synthetic */ st(Object obj, int i, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.d = i;
        this.f = obj2;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ st(Object obj, Object obj2, int i, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = i;
        this.c = obj3;
        this.b = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ st(TLObject tLObject, id idVar, Context context, int i, TL_phone.exportGroupCallInvite exportgroupcallinvite, vnb vnbVar, gc5 gc5Var) {
        this.a = (byte) 2;
        this.c = tLObject;
        this.e = idVar;
        this.f = context;
        this.d = i;
        this.b = exportgroupcallinvite;
        this.h = vnbVar;
        this.n = gc5Var;
    }

    public /* synthetic */ st(TLRPC.TL_error tL_error, TLObject tLObject, ArrayList arrayList, int i, AtomicInteger atomicInteger, ArrayList arrayList2, on1 on1Var) {
        this.a = (byte) 5;
        this.e = tL_error;
        this.c = tLObject;
        this.f = arrayList;
        this.d = i;
        this.b = atomicInteger;
        this.h = arrayList2;
        this.n = on1Var;
    }

    public /* synthetic */ st(c cVar, tnc tncVar, wz4 wz4Var, ArrayList arrayList, ArrayList arrayList2, int i, nnc nncVar) {
        this.a = (byte) 4;
        this.e = cVar;
        this.f = tncVar;
        this.c = wz4Var;
        this.b = arrayList;
        this.h = arrayList2;
        this.d = i;
        this.n = nncVar;
    }

    public /* synthetic */ st(LaunchActivity launchActivity, TLObject tLObject, int i, uj3 uj3Var, e eVar, TLRPC.User user, String str) {
        this.a = (byte) 10;
        this.e = launchActivity;
        this.c = tLObject;
        this.d = i;
        this.f = uj3Var;
        this.h = eVar;
        this.n = user;
        this.b = str;
    }

    public /* synthetic */ st(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, int i, id idVar, tg5 tg5Var, String str) {
        this.a = (byte) 12;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.d = i;
        this.h = idVar;
        this.n = tg5Var;
        this.b = str;
    }

    public /* synthetic */ st(LaunchActivity launchActivity, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, tg5 tg5Var, int i, String str) {
        this.a = (byte) 11;
        this.e = launchActivity;
        this.f = tL_error;
        this.c = tLObject;
        this.h = tL_inputInvoiceSlug;
        this.n = tg5Var;
        this.d = i;
        this.b = str;
    }

    public /* synthetic */ st(ProfileActivity profileActivity, View view, String str, int i, boolean[] zArr, String[] strArr, String str2) {
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
