// default package

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class tu0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tu0(dl1 dl1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.a = (byte) 24;
        this.d = dl1Var;
        this.c = tL_premiumGiftOption;
        this.b = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03d2, code lost:
    
        if (r9.equals("allowScroll") == false) goto L182;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        String str2;
        byte b = this.a;
        byte b2 = 8;
        byte b3 = 4;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        r5 = null;
        String url = null;
        mediaMetadataRetriever = null;
        boolean z2 = true;
        int i = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj;
                try {
                    rv0 rv0Var = botWebViewContainer$BotWebViewProxy.a;
                    if (rv0Var != null) {
                        boolean z3 = rv0.R0;
                        rv0Var.C(botWebViewContainer$BotWebViewProxy, rv0Var.d(), str3, str4);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                String str5 = (String) obj2;
                String str6 = (String) obj;
                rv0 rv0Var2 = ((BotWebViewContainer$WebViewProxy) obj3).a;
                if (rv0Var2 != null) {
                    boolean z4 = rv0.R0;
                    if (rv0Var2.p0 || rv0Var2.c == null) {
                        return;
                    }
                    if (rv0Var2.H0 != null && !TextUtils.equals(rv0Var2.getOriginHost(), rv0Var2.H0)) {
                        rv0Var2.e("onWebEventReceived ignore " + str5);
                        return;
                    }
                    rv0Var2.e("onWebEventReceived " + str5 + " " + str6);
                    str5.getClass();
                    switch (str5.hashCode()) {
                        case -1695046810:
                            if (str5.equals("actionBarColor")) {
                                b3 = 0;
                                break;
                            }
                            b3 = -1;
                            break;
                        case -462720700:
                            if (str5.equals("navigationBarColor")) {
                                b3 = 1;
                                break;
                            }
                            b3 = -1;
                            break;
                        case 479731943:
                            if (str5.equals("oauth_request")) {
                                b3 = 2;
                                break;
                            }
                            b3 = -1;
                            break;
                        case 675009138:
                            if (str5.equals("siteName")) {
                                b3 = 3;
                                break;
                            }
                            b3 = -1;
                            break;
                        case 997530486:
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    switch (b3) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str6);
                                boolean equals = TextUtils.equals(str5, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                nv0 nv0Var = rv0Var2.a;
                                if (nv0Var != null) {
                                    if (equals) {
                                        nv0Var.s = true;
                                        nv0Var.x = argb;
                                    } else {
                                        nv0Var.w = true;
                                        nv0Var.y = argb;
                                    }
                                    int i2 = nv0.W;
                                    nv0Var.e();
                                }
                                rv0Var2.c.o(argb, equals);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            rv0Var2.e("oauth_request " + str6);
                            if (rv0Var2.a != null) {
                                String originHost = rv0Var2.getOriginHost();
                                if (TextUtils.isEmpty(originHost)) {
                                    return;
                                }
                                try {
                                    String optString = new JSONObject(str6).optString("url");
                                    rv0Var2.v("oauth_supported", rv0.x(1, "version"));
                                    if (TextUtils.isEmpty(optString)) {
                                        return;
                                    }
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i3 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i3 | 12;
                                    ConnectionsManager.getInstance(rv0Var2.N).sendRequest(tL_messages_requestUrlAuth, new au0((Object) rv0Var2, (Object) tL_messages_requestUrlAuth, (Object) optString, (Object) originHost, (byte) 1), 2);
                                    return;
                                } catch (Exception e2) {
                                    cc4.g(e2, true);
                                    return;
                                }
                            }
                            return;
                        case 3:
                            rv0Var2.e("siteName " + str6);
                            nv0 nv0Var2 = rv0Var2.a;
                            if (nv0Var2 != null) {
                                nv0Var2.r = str6;
                                nv0Var2.e();
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str6);
                                z = jSONArray2.optBoolean(0, true);
                                try {
                                    z2 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z = true;
                            }
                            if (rv0Var2.getParent() instanceof i22) {
                                i22 i22Var = (i22) rv0Var2.getParent();
                                i22Var.P = z;
                                i22Var.Q = z2;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                boolean z5 = ((TLObject) obj2) instanceof TLRPC.TL_boolTrue;
                xw0 xw0Var = ((sw0) obj3).d;
                if (!z5) {
                    new d31(xw0Var.r0, xw0Var.G).Z(tL_error).k(true);
                    return;
                }
                pw0 pw0Var = xw0Var.E;
                pw0Var.getClass();
                pw0Var.v("emoji_status_access_requested", rv0.x("cancelled", "status"));
                return;
            case 3:
                ((e) obj2).presentFragment((zu1) obj);
                ((yx0) obj3).c = false;
                return;
            case 4:
                yx0 yx0Var = (yx0) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                xx0 xx0Var = (xx0) obj;
                while (i < arrayList.size()) {
                    if (((vx0) arrayList.get(i)).a == xx0Var) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                yx0Var.invalidate();
                return;
            case 5:
                xz0 xz0Var = (xz0) obj3;
                nz0 nz0Var = (nz0) obj2;
                vz0 vz0Var = (vz0) obj;
                if (xz0Var.d.get(Long.valueOf(nz0Var.a)) == nz0Var && nz0Var.k.get(vz0Var.a) == vz0Var && vz0Var.i == null && xz0Var.c == 2) {
                    xz0Var.r(nz0Var, vz0Var);
                    return;
                }
                return;
            case 6:
                g41 g41Var = (g41) obj3;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tL_error2 != null) {
                    g41Var.f.b(false);
                    d31.e0(tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    g41Var.f.b(false);
                    xnb.x(null, 2131743534, d31.b0(g41Var), null);
                    return;
                } else {
                    if (g41Var.F != null) {
                        g41Var.getMessagesController().f3(g41Var.getUserConfig().f(), 0, true, null);
                    }
                    g41Var.finishFragment();
                    return;
                }
            case 7:
                r41 r41Var = (r41) obj3;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj;
                ArrayList arrayList2 = r41Var.b;
                if (!(((TLObject) obj2) instanceof TLRPC.TL_boolTrue)) {
                    cc4.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList2.contains(tL_businessChatLink)) {
                    arrayList2.remove(tL_businessChatLink);
                    jn7.f(r41Var.a).k(jn7.J1, new Object[0]);
                }
                r41Var.f();
                return;
            case 8:
                r41 r41Var2 = (r41) obj3;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) obj2;
                ConnectionsManager.getInstance(r41Var2.a).sendRequest(deletebusinesschatlink, new ql(r41Var2, (TL_account.TL_businessChatLink) obj, b2));
                return;
            case 9:
                z61 z61Var = (z61) obj3;
                ArrayList arrayList3 = (ArrayList) obj2;
                id idVar = (id) obj;
                while (i < arrayList3.size()) {
                    ((c71) arrayList3.get(i)).a.delete();
                    i++;
                }
                hl.c3(new z21(z61Var, idVar, b3));
                return;
            case 10:
                b71 b71Var = (b71) obj3;
                Pair pair = (Pair) obj2;
                pcc pccVar = (pcc) obj;
                HashMap hashMap = b71Var.c;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    b71Var.c = hashMap;
                }
                ArrayList arrayList4 = (ArrayList) hashMap.get(pair);
                if (arrayList4 == null) {
                    HashMap hashMap2 = b71Var.c;
                    arrayList4 = new ArrayList();
                    hashMap2.put(pair, arrayList4);
                }
                arrayList4.add(pccVar);
                return;
            case 11:
                w71 w71Var = (w71) obj3;
                c71 c71Var = (c71) obj2;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj;
                String str7 = "";
                try {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                        try {
                            try {
                                mediaMetadataRetriever2.setDataSource(w71Var.getContext(), Uri.fromFile(c71Var.a));
                                str2 = mediaMetadataRetriever2.extractMetadata(7);
                                try {
                                    str7 = mediaMetadataRetriever2.extractMetadata(2);
                                    try {
                                        mediaMetadataRetriever2.release();
                                    } catch (Throwable unused4) {
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    str = str2;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    cc4.g(e, true);
                                    if (mediaMetadataRetriever != null) {
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (Throwable unused5) {
                                        }
                                    }
                                    str2 = str;
                                    hl.c3(new la7((Object) w71Var, (Object) c71Var, (Object) tL_documentAttributeAudio, (Object) str2, (Object) str7, (byte) 11));
                                    return;
                                }
                            } catch (Throwable th) {
                                th = th;
                                mediaMetadataRetriever = mediaMetadataRetriever2;
                                if (mediaMetadataRetriever != null) {
                                    try {
                                        mediaMetadataRetriever.release();
                                    } catch (Throwable unused6) {
                                    }
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            str = "";
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e5) {
                    e = e5;
                    str = "";
                }
                hl.c3(new la7((Object) w71Var, (Object) c71Var, (Object) tL_documentAttributeAudio, (Object) str2, (Object) str7, (byte) 11));
                return;
            case 12:
                ((e81) obj3).b.y.finishFragment();
                ((zu1) obj2).m8(((h81) obj).h);
                return;
            case 13:
                ((i91) obj3).f0((TLObject) obj, (TLRPC.TL_error) obj2);
                return;
            case 14:
                hl.g(((String[]) obj3)[0]);
                new d31(((nx0) obj2).F, (vnb) obj).i(ob6.M0(2131748675, null)).j();
                return;
            case 15:
                ((ve1) obj3).h0((id) obj2, (TLRPC.User) obj);
                return;
            case 16:
                ((wf1) obj3).U0((TLObject) obj, (TLRPC.TL_error) obj2);
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj2;
                hl.g(connectedbotstarref.url);
                d31.b0((ng1) obj3).I(R.raw.copy, ob6.M0(2131754326, null), hl.S2(ob6.a0(null, null, 2131754327, cc.J0(connectedbotstarref.commission_permille), lbc.r((TLRPC.User) obj)))).j();
                return;
            case 18:
                ((ng1) obj3).F0((TLObject) obj2, (id) obj);
                return;
            case 19:
                TLObject tLObject2 = (TLObject) obj2;
                znb znbVar = (znb) obj;
                HashMap hashMap3 = ((uh1) obj3).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    znbVar.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r = xb4.r(null, wallPaper.document);
                if (hashMap3.containsKey(r)) {
                    return;
                }
                hashMap3.put(r, znbVar);
                xb4.G(znbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 20:
                gi1 gi1Var = (gi1) obj3;
                TLObject tLObject3 = (TLObject) obj;
                if (((TLRPC.TL_error) obj2) == null) {
                    gi1Var.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                gi1Var.d0 = false;
                i56 i56Var = gi1Var.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = gi1Var.e0;
                i56Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 21:
                ((w1b) obj3).showDialog(ij1.J((vnb) obj, (Activity) obj2, false));
                return;
            case 22:
                ij1 ij1Var = (ij1) obj3;
                TLObject tLObject4 = (TLObject) obj2;
                Activity activity = (Activity) obj;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    m01.u(activity, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                hl.d3(new ni1(ij1Var, b3), 1000L);
                return;
            case 23:
                dl1 dl1Var = (dl1) obj3;
                uqc.I0(dl1Var.getContext(), dl1Var.I, (TL_wallet.walletTransaction) obj2, null, null, null, (wk1) obj, dl1Var.h1);
                return;
            case 24:
                dl1 dl1Var2 = (dl1) obj3;
                dl1Var2.g1.f0(dl1Var2, (TLRPC.TL_premiumGiftOption) obj, (String) obj2);
                return;
            case 25:
                ((zu1) obj3).S9((TLRPC.User) obj2, (TLRPC.EmojiStatus) obj);
                return;
            case 26:
                r47 r47Var = (r47) obj2;
                CharacterStyle characterStyle = (CharacterStyle) obj;
                sz1 sz1Var = ((zu1) obj3).c4;
                if (sz1Var != null) {
                    if (characterStyle instanceof i8c) {
                        url = "@";
                    } else if ((characterStyle instanceof URLSpan) && !(characterStyle instanceof no4)) {
                        url = ((URLSpan) characterStyle).getURL();
                    }
                    sz1Var.b(r47Var, url);
                    return;
                }
                return;
            case 27:
                hl.c3(new jj1((hu0) obj, ((zu1) obj3).getMessagesStorage().g0(((TLRPC.TL_contact) obj2).user_id), b2));
                return;
            case 28:
                zu1 zu1Var = (zu1) obj3;
                TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) obj2;
                jj.Q(zu1Var.getParentActivity(), suggestedPost != null ? suggestedPost.schedule_date : 0L, new ie((Object) zu1Var, (Object) suggestedPost, obj, (byte) 13), zu1Var.getResourceProvider(), 0).o1();
                return;
            default:
                ((zu1) obj3).r8((oj) obj2, (Runnable) obj);
                return;
        }
    }

    public /* synthetic */ tu0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
