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
import java.util.concurrent.CountDownLatch;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
import org.telegram.ui.web.BotWebViewContainer$WebViewProxy;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tv0 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tv0(cm1 cm1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
        this.a = (byte) 24;
        this.d = cm1Var;
        this.c = tL_premiumGiftOption;
        this.b = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03c8, code lost:
    
        if (r9.equals("allowScroll") == false) goto L176;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        String str;
        byte b = this.a;
        byte b2 = 4;
        Object obj = 7;
        char c = 7;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        r5 = null;
        String url = null;
        mediaMetadataRetriever = null;
        boolean z2 = true;
        int i = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                try {
                    qw0 qw0Var = botWebViewContainer$BotWebViewProxy.a;
                    if (qw0Var != null) {
                        boolean z3 = qw0.R0;
                        qw0Var.C(botWebViewContainer$BotWebViewProxy, qw0Var.d(), str2, str3);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                qw0 qw0Var2 = ((BotWebViewContainer$WebViewProxy) obj4).a;
                if (qw0Var2 != null) {
                    boolean z4 = qw0.R0;
                    if (qw0Var2.p0 || qw0Var2.c == null) {
                        return;
                    }
                    if (qw0Var2.H0 != null && !TextUtils.equals(qw0Var2.getOriginHost(), qw0Var2.H0)) {
                        qw0Var2.e("onWebEventReceived ignore " + str4);
                        return;
                    }
                    qw0Var2.e("onWebEventReceived " + str4 + " " + str5);
                    str4.getClass();
                    switch (str4.hashCode()) {
                        case -1695046810:
                            if (str4.equals("actionBarColor")) {
                                b2 = 0;
                                break;
                            }
                            b2 = -1;
                            break;
                        case -462720700:
                            if (str4.equals("navigationBarColor")) {
                                b2 = 1;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 479731943:
                            if (str4.equals("oauth_request")) {
                                b2 = 2;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 675009138:
                            if (str4.equals("siteName")) {
                                b2 = 3;
                                break;
                            }
                            b2 = -1;
                            break;
                        case 997530486:
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        case 0:
                        case 1:
                            try {
                                JSONArray jSONArray = new JSONArray(str5);
                                boolean equals = TextUtils.equals(str4, "actionBarColor");
                                int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                                mw0 mw0Var = qw0Var2.a;
                                if (mw0Var != null) {
                                    if (equals) {
                                        mw0Var.s = true;
                                        mw0Var.x = argb;
                                    } else {
                                        mw0Var.w = true;
                                        mw0Var.y = argb;
                                    }
                                    int i2 = mw0.W;
                                    mw0Var.e();
                                }
                                qw0Var2.c.o(argb, equals);
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        case 2:
                            qw0Var2.e("oauth_request " + str5);
                            if (qw0Var2.a != null) {
                                String originHost = qw0Var2.getOriginHost();
                                if (TextUtils.isEmpty(originHost)) {
                                    return;
                                }
                                try {
                                    String optString = new JSONObject(str5).optString("url");
                                    qw0Var2.v("oauth_supported", qw0.x(1, "version"));
                                    if (TextUtils.isEmpty(optString)) {
                                        return;
                                    }
                                    TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                                    tL_messages_requestUrlAuth.url = optString;
                                    int i3 = tL_messages_requestUrlAuth.flags;
                                    tL_messages_requestUrlAuth.in_app_origin = originHost;
                                    tL_messages_requestUrlAuth.flags = i3 | 12;
                                    ConnectionsManager.getInstance(qw0Var2.N).sendRequest(tL_messages_requestUrlAuth, new av0((Object) qw0Var2, (Object) tL_messages_requestUrlAuth, (Object) optString, (Object) originHost, (byte) 1), 2);
                                    return;
                                } catch (Exception e2) {
                                    fc4.g(e2, true);
                                    return;
                                }
                            }
                            return;
                        case 3:
                            qw0Var2.e("siteName " + str5);
                            mw0 mw0Var2 = qw0Var2.a;
                            if (mw0Var2 != null) {
                                mw0Var2.r = str5;
                                mw0Var2.e();
                                return;
                            }
                            return;
                        case 4:
                            try {
                                JSONArray jSONArray2 = new JSONArray(str5);
                                z = jSONArray2.optBoolean(0, true);
                                try {
                                    z2 = jSONArray2.optBoolean(1, true);
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                                z = true;
                            }
                            if (qw0Var2.getParent() instanceof d32) {
                                d32 d32Var = (d32) qw0Var2.getParent();
                                d32Var.P = z;
                                d32Var.Q = z2;
                                return;
                            }
                            return;
                        default:
                            return;
                    }
                }
                return;
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                boolean z5 = ((TLObject) obj3) instanceof TLRPC.TL_boolTrue;
                wx0 wx0Var = ((rx0) obj4).d;
                if (!z5) {
                    new c41(wx0Var.r0, wx0Var.G).Z(tL_error).k(true);
                    return;
                }
                ox0 ox0Var = wx0Var.E;
                ox0Var.getClass();
                ox0Var.v("emoji_status_access_requested", qw0.x("cancelled", "status"));
                return;
            case 3:
                ((d) obj3).presentFragment((yv1) obj2);
                ((xy0) obj4).c = false;
                return;
            case 4:
                xy0 xy0Var = (xy0) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                wy0 wy0Var = (wy0) obj2;
                while (i < arrayList.size()) {
                    if (((uy0) arrayList.get(i)).a == wy0Var) {
                        arrayList.remove(i);
                        i--;
                    }
                    i++;
                }
                xy0Var.invalidate();
                return;
            case 5:
                w01 w01Var = (w01) obj4;
                m01 m01Var = (m01) obj3;
                u01 u01Var = (u01) obj2;
                if (w01Var.d.get(Long.valueOf(m01Var.a)) == m01Var && m01Var.k.get(u01Var.a) == u01Var && u01Var.i == null && w01Var.c == 2) {
                    w01Var.r(m01Var, u01Var);
                    return;
                }
                return;
            case 6:
                f51 f51Var = (f51) obj4;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj3;
                TLObject tLObject = (TLObject) obj2;
                if (tL_error2 != null) {
                    f51Var.f.b(false);
                    c41.e0(tL_error2);
                    return;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    f51Var.f.b(false);
                    mlb.y(null, 2131743566, c41.b0(f51Var), null);
                    return;
                } else {
                    if (f51Var.F != null) {
                        f51Var.getMessagesController().b3(f51Var.getUserConfig().f(), 0, true, null);
                    }
                    f51Var.finishFragment();
                    return;
                }
            case 7:
                q51 q51Var = (q51) obj4;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) obj2;
                ArrayList arrayList2 = q51Var.b;
                if (!(((TLObject) obj3) instanceof TLRPC.TL_boolTrue)) {
                    fc4.g(new RuntimeException("Unexpected response from server!"), true);
                    return;
                }
                if (arrayList2.contains(tL_businessChatLink)) {
                    arrayList2.remove(tL_businessChatLink);
                    nm7.f(q51Var.a).k(nm7.J1, new Object[0]);
                }
                q51Var.f();
                return;
            case 8:
                q51 q51Var2 = (q51) obj4;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = (String) obj3;
                ConnectionsManager.getInstance(q51Var2.a).sendRequest(deletebusinesschatlink, new pm(q51Var2, (TL_account.TL_businessChatLink) obj2, (byte) 8));
                return;
            case 9:
                y71 y71Var = (y71) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                he heVar = (he) obj2;
                while (i < arrayList3.size()) {
                    ((b81) arrayList3.get(i)).a.delete();
                    i++;
                }
                gm.c3(new y31(y71Var, heVar, (byte) 5));
                return;
            case 10:
                a81 a81Var = (a81) obj4;
                Pair pair = (Pair) obj3;
                qac qacVar = (qac) obj2;
                HashMap hashMap = a81Var.c;
                if (hashMap == null) {
                    hashMap = new HashMap();
                    a81Var.c = hashMap;
                }
                ArrayList arrayList4 = (ArrayList) hashMap.get(pair);
                if (arrayList4 == null) {
                    HashMap hashMap2 = a81Var.c;
                    arrayList4 = new ArrayList();
                    hashMap2.put(pair, arrayList4);
                }
                arrayList4.add(qacVar);
                return;
            case 11:
                w81 w81Var = (w81) obj4;
                b81 b81Var = (b81) obj3;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) obj2;
                String str6 = "";
                try {
                    try {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever2.setDataSource(w81Var.getContext(), Uri.fromFile(b81Var.a));
                                    str = mediaMetadataRetriever2.extractMetadata(7);
                                    try {
                                        str6 = mediaMetadataRetriever2.extractMetadata(2);
                                        mediaMetadataRetriever2.release();
                                        obj = str;
                                    } catch (Exception e3) {
                                        e = e3;
                                        mediaMetadataRetriever = mediaMetadataRetriever2;
                                        obj = str;
                                        fc4.g(e, true);
                                        if (mediaMetadataRetriever != null) {
                                            mediaMetadataRetriever.release();
                                            obj = obj;
                                        }
                                        gm.c3(new da7((Object) w81Var, (Object) b81Var, (Object) tL_documentAttributeAudio, obj, (Object) str6, (byte) 11));
                                        return;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                    if (mediaMetadataRetriever != null) {
                                        try {
                                            mediaMetadataRetriever.release();
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                str = "";
                            }
                        } catch (Throwable unused5) {
                        }
                    } catch (Exception e5) {
                        e = e5;
                        obj = "";
                    }
                    gm.c3(new da7((Object) w81Var, (Object) b81Var, (Object) tL_documentAttributeAudio, obj, (Object) str6, (byte) 11));
                    return;
                } catch (Throwable th2) {
                    th = th2;
                }
            case 12:
                ((f91) obj4).b.y.finishFragment();
                ((yv1) obj3).l8(((i91) obj2).h);
                return;
            case 13:
                ((ia1) obj4).g0((TLObject) obj2, (TLRPC.TL_error) obj3);
                return;
            case 14:
                gm.g(((String[]) obj4)[0]);
                new c41(((my0) obj3).F, (ylb) obj2).i(jb6.M0(2131748678, null)).j();
                return;
            case 15:
                ((uf1) obj4).i0((he) obj3, (TLRPC.User) obj2);
                return;
            case 16:
                ((vg1) obj4).U0((TLObject) obj2, (TLRPC.TL_error) obj3);
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj3;
                gm.g(connectedbotstarref.url);
                c41.b0((mh1) obj4).I(R.raw.copy, jb6.M0(2131754330, null), gm.S2(jb6.a0(null, null, 2131754331, bc.J0(connectedbotstarref.commission_permille), m9c.r((TLRPC.User) obj2)))).j();
                return;
            case 18:
                ((mh1) obj4).F0((TLObject) obj3, (he) obj2);
                return;
            case 19:
                TLObject tLObject2 = (TLObject) obj3;
                bmb bmbVar = (bmb) obj2;
                HashMap hashMap3 = ((ti1) obj4).x;
                if (!(tLObject2 instanceof TLRPC.TL_wallPaper)) {
                    bmbVar.f = true;
                    return;
                }
                TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) tLObject2;
                String r = bc4.r(null, wallPaper.document);
                if (hashMap3.containsKey(r)) {
                    return;
                }
                hashMap3.put(r, bmbVar);
                bc4.G(bmbVar.F).X(wallPaper.document, wallPaper, 1, 1);
                return;
            case 20:
                fj1 fj1Var = (fj1) obj4;
                TLObject tLObject3 = (TLObject) obj2;
                if (((TLRPC.TL_error) obj3) == null) {
                    fj1Var.e0 = (TLRPC.TL_chatInviteExported) ((TLRPC.TL_messages_exportedChatInvites) tLObject3).invites.get(0);
                }
                fj1Var.d0 = false;
                f56 f56Var = fj1Var.R;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = fj1Var.e0;
                f56Var.setLink(tL_chatInviteExported != null ? tL_chatInviteExported.link : null);
                return;
            case 21:
                ((xza) obj4).showDialog(ik1.J((ylb) obj2, (Activity) obj3, false));
                return;
            case 22:
                ik1 ik1Var = (ik1) obj4;
                TLObject tLObject4 = (TLObject) obj3;
                Activity activity = (Activity) obj2;
                if (tLObject4 instanceof TLRPC.TL_payments_starsRevenueAdsAccountUrl) {
                    l11.u(activity, ((TLRPC.TL_payments_starsRevenueAdsAccountUrl) tLObject4).url);
                }
                gm.d3(new mj1(ik1Var, b2), 1000L);
                return;
            case 23:
                cm1 cm1Var = (cm1) obj4;
                goc.J0(cm1Var.getContext(), cm1Var.I, (TL_wallet.walletTransaction) obj3, null, null, null, (vl1) obj2, cm1Var.h1);
                return;
            case 24:
                cm1 cm1Var2 = (cm1) obj4;
                cm1Var2.g1.g0(cm1Var2, (TLRPC.TL_premiumGiftOption) obj2, (String) obj3);
                return;
            case 25:
                yv1 yv1Var = (yv1) obj4;
                yv1Var.f = ((cf7) obj3).g0(yv1Var.h.user_id);
                ((CountDownLatch) obj2).countDown();
                return;
            case 26:
                k47 k47Var = (k47) obj3;
                CharacterStyle characterStyle = (CharacterStyle) obj2;
                n02 n02Var = ((yv1) obj4).c4;
                if (n02Var != null) {
                    if (characterStyle instanceof j6c) {
                        url = "@";
                    } else if ((characterStyle instanceof URLSpan) && !(characterStyle instanceof jo4)) {
                        url = ((URLSpan) characterStyle).getURL();
                    }
                    n02Var.b(k47Var, url);
                    return;
                }
                return;
            case 27:
                gm.c3(new uj1((hv0) obj2, ((yv1) obj4).getMessagesStorage().g0(((TLRPC.TL_contact) obj3).user_id), c));
                return;
            case 28:
                ((yv1) obj4).R9((TLRPC.User) obj3, (TLRPC.EmojiStatus) obj2);
                return;
            default:
                ((vs9) obj3).dismiss();
                ((yv1) obj4).presentFragment(ProfileActivity.S2(((TLRPC.User) obj2).id));
                return;
        }
    }

    public /* synthetic */ tv0(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }
}
