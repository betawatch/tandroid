// default package

import android.app.Activity;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.ValueCallback;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.utils.twidget.x;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ptc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ptc(TLObject tLObject, vxc vxcVar) {
        this.a = (byte) 16;
        this.c = tLObject;
        this.b = vxcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        SQLiteCursor sQLiteCursor;
        ArrayList arrayList;
        cf7 cf7Var = (cf7) this.b;
        txc txcVar = (txc) this.c;
        long j = txcVar.c;
        int i = txcVar.d;
        ArrayList arrayList2 = new ArrayList();
        SQLiteCursor sQLiteCursor2 = null;
        r11 = null;
        r11 = null;
        SQLiteCursor sQLiteCursor3 = null;
        SQLiteCursor sQLiteCursor4 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                Locale locale = Locale.US;
                SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT local FROM widget_state WHERE uid = " + j + " AND mid = " + i, new Object[0]);
                try {
                    if (queryFinalized.next() && !queryFinalized.isNull(0)) {
                        sQLiteCursor3 = queryFinalized.stringValue(0);
                    }
                    queryFinalized.dispose();
                    SQLiteCursor queryFinalized2 = cf7Var.b.queryFinalized("SELECT width, height, anchor FROM widget_heights WHERE uid = " + j + " AND mid = " + i + " ORDER BY date DESC", new Object[0]);
                    while (queryFinalized2.next()) {
                        try {
                            arrayList2.add(new int[]{queryFinalized2.intValue(0), queryFinalized2.intValue(1), queryFinalized2.intValue(2)});
                        } catch (Exception e) {
                            SQLiteCursor sQLiteCursor5 = sQLiteCursor3;
                            sQLiteCursor4 = queryFinalized2;
                            e = e;
                            sQLiteCursor = sQLiteCursor5;
                            cf7Var.n(e, true);
                            if (sQLiteCursor4 != null) {
                                sQLiteCursor4.dispose();
                            }
                            sQLiteCursor2 = sQLiteCursor;
                            Object[] objArr = {sQLiteCursor2, arrayList2};
                            arrayList = (ArrayList) objArr[1];
                            if (!arrayList.isEmpty()) {
                            }
                            gm.c3(new ptc(txcVar, objArr, (byte) 15));
                        } catch (Throwable th) {
                            th = th;
                            sQLiteCursor2 = queryFinalized2;
                            if (sQLiteCursor2 != null) {
                                sQLiteCursor2.dispose();
                            }
                            throw th;
                        }
                    }
                    queryFinalized2.dispose();
                    sQLiteCursor2 = sQLiteCursor3;
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = sQLiteCursor3;
                    sQLiteCursor4 = queryFinalized;
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor2 = queryFinalized;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            sQLiteCursor = null;
        }
        Object[] objArr2 = {sQLiteCursor2, arrayList2};
        arrayList = (ArrayList) objArr2[1];
        if (!arrayList.isEmpty()) {
            uxc k = wxc.k(txcVar.a());
            synchronized (k) {
                if (k.a.isEmpty()) {
                    for (int i2 = 0; i2 < arrayList.size() && i2 < 4; i2++) {
                        k.a.add((int[]) arrayList.get(i2));
                    }
                }
            }
        }
        gm.c3(new ptc(txcVar, objArr2, (byte) 15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:295:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        TLRPC.WebPage webPage;
        rm1 rm1Var;
        InputStream inputStream;
        String str;
        StringBuilder sb;
        TL_bots.TL_botProfileWidget tL_botProfileWidget;
        cyc cycVar;
        hyc hycVar;
        cyc cycVar2;
        d S;
        cyc cycVar3;
        byte b = 3;
        TLRPC.WebPage webPage2 = null;
        r6 = null;
        r6 = null;
        View view = null;
        switch (this.a) {
            case 0:
                qtc qtcVar = (qtc) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = qtcVar.F;
                i = ((d) wallpapersListActivity).currentAccount;
                oc7.r1(i).d4(tL_contacts_resolvedPeer.users, false);
                i2 = ((d) wallpapersListActivity).currentAccount;
                oc7.r1(i2).X3(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().j1(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str2 = qtcVar.y;
                qtcVar.y = null;
                qtcVar.F(str2, "", false);
                return;
            case 1:
                int[] iArr = (int[]) this.b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.c;
                int i3 = iArr[0];
                if (i3 != 0) {
                    connectionsManager.cancelRequest(i3, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 2:
                a8 a8Var = (a8) this.b;
                a8Var.setEnabled(((bvc) this.c).b() != null);
                a8Var.animate().alpha(a8Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 3:
                ((wu) this.b).g0.a((Integer) this.c);
                return;
            case 4:
                uuc uucVar = (uuc) this.b;
                String str3 = (String) this.c;
                oc7 messagesController = uucVar.getMessagesController();
                messagesController.getClass();
                TL_account.toggleWebBrowserSettingsException togglewebbrowsersettingsexception = new TL_account.toggleWebBrowserSettingsException();
                togglewebbrowsersettingsexception.url = str3;
                togglewebbrowsersettingsexception.delete = true;
                messagesController.getConnectionsManager().sendRequestTyped(togglewebbrowsersettingsexception, new k87(messagesController, b));
                uucVar.a.g3.O(true);
                return;
            case 5:
                bvc bvcVar = (bvc) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i4 = bvcVar.a;
                bvcVar.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    oc7.r1(i4).d4(tL_messages_webPage.users, false);
                    oc7.r1(i4).X3(tL_messages_webPage.chats, false);
                    webPage = tL_messages_webPage.webpage;
                    bvcVar.h = webPage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        webPage = (TLRPC.TL_webPage) tLObject;
                        if (webPage.cached_page instanceof TL_iv.TL_page) {
                            bvcVar.h = webPage;
                        }
                    }
                    bvcVar.h = null;
                    webPage = null;
                }
                if (webPage == null || webPage.cached_page != null) {
                    webPage2 = webPage;
                } else {
                    bvcVar.h = null;
                }
                if (!gda.t0 && webPage2 != null && (rm1Var = bvcVar.l) != null) {
                    rm1Var.run();
                }
                bvcVar.c();
                return;
            case 6:
                ((bvc) this.b).m.remove((ptc) this.c);
                return;
            case 7:
                final svc svcVar = (svc) this.b;
                svcVar.e.b.evaluateJavascript((String) this.c, new ValueCallback() { // from class: rvc
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        String str4 = (String) obj;
                        svc svcVar2 = svc.this;
                        String[] strArr = svcVar2.c;
                        strArr[0] = strArr[0].replace(svcVar2.d, "/signature/".concat(str4.substring(1, str4.length() - 1)));
                        svcVar2.b.countDown();
                    }
                });
                return;
            case 8:
                bwc bwcVar = (bwc) this.b;
                awc awcVar = (awc) this.c;
                bwcVar.getClass();
                byte[] bArr = new byte[65536];
                try {
                    inputStream = awcVar.b.getInputStream();
                } catch (Exception unused) {
                    bwcVar.d(awcVar, true);
                    return;
                }
                while (true) {
                    synchronized (bwcVar.a) {
                        while (!bwcVar.u && bwcVar.m.get(Integer.valueOf(awcVar.a)) == awcVar && (!bwcVar.t || !awcVar.e || awcVar.c == 0)) {
                            bwcVar.a.wait();
                        }
                        if (!bwcVar.u && bwcVar.m.get(Integer.valueOf(awcVar.a)) == awcVar) {
                            int read = inputStream.read(bArr, 0, (int) Math.min(65536L, awcVar.c));
                            if (read < 0) {
                                bwcVar.d(awcVar, true);
                                return;
                            }
                            if (read != 0) {
                                byte[] bArr2 = new byte[read];
                                System.arraycopy(bArr, 0, bArr2, 0, read);
                                synchronized (bwcVar.a) {
                                    if (!bwcVar.u && bwcVar.m.get(Integer.valueOf(awcVar.a)) == awcVar && bwcVar.t) {
                                        awcVar.c -= read;
                                        bwcVar.n(2, awcVar.a, bArr2);
                                    }
                                }
                            }
                        }
                        bwcVar.d(awcVar, true);
                        return;
                    }
                }
                return;
            case 9:
                bwc bwcVar2 = (bwc) this.b;
                String str4 = (String) this.c;
                bwcVar2.getClass();
                try {
                    byte[] decode = Base64.decode(str4.substring(14), 2);
                    if (decode.length < 8 || decode.length > 1048584) {
                        bwcVar2.h();
                    } else {
                        bwcVar2.m(decode);
                    }
                    return;
                } catch (IllegalArgumentException e) {
                    fc4.g(e, true);
                    bwcVar2.h();
                    return;
                }
            case 10:
                ((bwc) this.b).m((byte[]) this.c);
                return;
            case 11:
                twc twcVar = (twc) this.b;
                String str5 = (String) this.c;
                uwc uwcVar = twcVar.a;
                Activity parentActivity = uwcVar.getParentActivity();
                k47 k47Var = uwcVar.n;
                if (parentActivity != null) {
                    if (e21.a) {
                        fc4.b(str5);
                    }
                    str5.getClass();
                    if (str5.equals("share_game")) {
                        k47Var.k.with_my_score = false;
                    } else if (str5.equals("share_score")) {
                        k47Var.k.with_my_score = true;
                    }
                    uwcVar.showDialog(tca.G0(uwcVar.getParentActivity(), k47Var, null, false, uwcVar.h));
                    return;
                }
                return;
            case 12:
                txc txcVar = (txc) this.b;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = (TLRPC.TL_messageMediaWidget) this.c;
                txcVar.t = tL_messageMediaWidget;
                txcVar.s = tL_messageMediaWidget.public_data_hash;
                wxc.a(txcVar, wxc.D(tL_messageMediaWidget.chat_data), wxc.D(tL_messageMediaWidget.public_data));
                return;
            case 13:
                ((tm3) this.b).a(null, (TLRPC.TL_error) this.c);
                return;
            case 14:
                a();
                return;
            case 15:
                txc txcVar2 = (txc) this.b;
                String str6 = (String) ((Object[]) this.c)[0];
                HashMap hashMap = wxc.c;
                txcVar2.B = true;
                String a = txcVar2.a();
                if (str6 != null && !hashMap.containsKey(a)) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("local", new JSONObject(str6));
                        hashMap.put(a, jSONObject);
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                    }
                }
                cyc cycVar4 = txcVar2.v;
                if (cycVar4 != null) {
                    JSONObject jSONObject2 = (JSONObject) hashMap.get(a);
                    try {
                        str = jb6.D0().y.toLanguageTag();
                    } catch (Exception unused2) {
                        str = null;
                    }
                    String jSONObject3 = jSONObject2 != null ? jSONObject2.toString() : null;
                    cycVar4.s = str;
                    cycVar4.t = jSONObject3;
                }
                al9 al9Var = txcVar2.w;
                if (al9Var != null && (cycVar4 == null || cycVar4.h <= 0)) {
                    al9Var.o0("cached heights read");
                }
                if (txcVar2.C) {
                    txcVar2.C = false;
                    if (txcVar2.z > 0 && cycVar4 != null) {
                        wxc.B(txcVar2);
                    }
                }
                wxc.o();
                return;
            case 16:
                TLObject tLObject2 = (TLObject) this.c;
                vxc vxcVar = (vxc) this.b;
                ConcurrentHashMap concurrentHashMap = wxc.a;
                TLRPC.messages_WidgetPublicData messages_widgetpublicdata = tLObject2 instanceof TLRPC.messages_WidgetPublicData ? (TLRPC.messages_WidgetPublicData) tLObject2 : null;
                vxcVar.f = 0;
                long j = vxcVar.b;
                int i5 = vxcVar.a;
                long j2 = vxcVar.c;
                HashMap hashMap2 = wxc.l;
                if (j2 != 0) {
                    sb = new StringBuilder();
                    sb.append(i5);
                    sb.append("/bot");
                    sb.append(j2);
                } else {
                    sb = new StringBuilder();
                    sb.append(i5);
                    sb.append("/");
                    sb.append(j);
                }
                if (hashMap2.get(sb.toString()) == vxcVar) {
                    if (messages_widgetpublicdata != null) {
                        int i6 = messages_widgetpublicdata.period;
                        vxcVar.e = i6 <= 0 ? 30 : Math.max(5, Math.min(3600, i6));
                        if (messages_widgetpublicdata instanceof TLRPC.TL_messages_widgetPublicData) {
                            TLRPC.TL_messages_widgetPublicData tL_messages_widgetPublicData = (TLRPC.TL_messages_widgetPublicData) messages_widgetpublicdata;
                            long j3 = tL_messages_widgetPublicData.hash;
                            vxcVar.d = j3;
                            String str7 = tL_messages_widgetPublicData.data;
                            if (j2 != 0) {
                                String D = wxc.D(str7);
                                for (txc txcVar3 : concurrentHashMap.values()) {
                                    if (txcVar3.o && txcVar3.b == i5 && txcVar3.n == j2) {
                                        txcVar3.s = j3;
                                        wxc.a(txcVar3, txcVar3.q, D);
                                    }
                                }
                                TLRPC.UserFull X1 = oc7.r1(i5).X1(j2);
                                if (X1 != null && (tL_botProfileWidget = X1.bot_profile_widget) != null) {
                                    tL_botProfileWidget.public_data = str7;
                                    tL_botProfileWidget.public_data_hash = j3;
                                }
                            } else {
                                String D2 = wxc.D(str7);
                                for (txc txcVar4 : concurrentHashMap.values()) {
                                    if (txcVar4.b == i5 && txcVar4.l == j && !txcVar4.k && (!TextUtils.equals(txcVar4.r, D2) || txcVar4.s != j3)) {
                                        txcVar4.s = j3;
                                        wxc.a(txcVar4, txcVar4.q, D2);
                                        TLRPC.TL_messageMediaWidget tL_messageMediaWidget2 = txcVar4.t;
                                        if (tL_messageMediaWidget2 != null) {
                                            tL_messageMediaWidget2.public_data_hash = j3;
                                        }
                                        cf7 Y = cf7.Y(i5);
                                        Y.a.c(new dd2(Y, txcVar4.d, txcVar4.c, str7 == null ? "" : str7, j3, (String) null));
                                    }
                                }
                            }
                        }
                    }
                    gm.d3(vxcVar.g, vxcVar.e * 1000);
                    return;
                }
                return;
            case 17:
                ((x) this.b).q((zxc) this.c, "did not make a session in 15000 ms");
                return;
            case 18:
                z zVar = (z) this.b;
                String str8 = (String) this.c;
                if (zVar.A || (cycVar = zVar.R) == null || (hycVar = cycVar.g) == null) {
                    return;
                }
                if (hycVar.F || (hycVar.w && hycVar.E)) {
                    hycVar.a.setCursor(str8);
                    return;
                }
                return;
            case 19:
                z zVar2 = (z) this.b;
                JSONObject jSONObject4 = (JSONObject) this.c;
                if (zVar2.A || (cycVar2 = zVar2.R) == null || cycVar2.d == null) {
                    return;
                }
                txc g = wxc.g(cycVar2);
                String optString = jSONObject4.optString("kind");
                if (!"openLink".equals(optString) && !"openTelegramLink".equals(optString)) {
                    if ("haptic".equals(optString)) {
                        if (g != null && g.z != 0) {
                            al9 al9Var2 = g.y;
                            if (al9Var2 != null) {
                                view = al9Var2.W;
                            } else {
                                ss0 ss0Var = g.p;
                                if (ss0Var != null) {
                                    view = ss0Var.h;
                                }
                            }
                        }
                        if (view != null) {
                            String optString2 = jSONObject4.optString("haptic");
                            if ("selection".equals(optString2)) {
                                b = 4;
                            } else if ("notification".equals(optString2)) {
                                b = 16;
                            }
                            view.performHapticFeedback(b);
                            return;
                        }
                        return;
                    }
                    return;
                }
                String optString3 = jSONObject4.optString("url");
                boolean equals = "openTelegramLink".equals(optString);
                if (TextUtils.isEmpty(optString3) || wxc.i || (S = LaunchActivity.S()) == null || S.getParentActivity() == null) {
                    return;
                }
                Activity parentActivity2 = S.getParentActivity();
                if (equals) {
                    l11.u(parentActivity2, optString3);
                    return;
                }
                wxc.i = true;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, S.getResourceProvider(), parentActivity2);
                alertDialog$Builder.a.S = jb6.M0(2131742535, null);
                alertDialog$Builder.a.U = jb6.a0(null, null, 2131742536, optString3);
                alertDialog$Builder.j(jb6.M0(2131747550, null), new uxb(parentActivity2, optString3, (byte) 13));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                he heVar = alertDialog$Builder.a;
                heVar.setOnDismissListener(new g5((byte) 7));
                if (S.showDialog(heVar) == null) {
                    wxc.i = false;
                    return;
                }
                return;
            default:
                z zVar3 = (z) this.b;
                zVar3.U = ((Exception) this.c).toString();
                if (zVar3.A || (cycVar3 = zVar3.R) == null) {
                    return;
                }
                cycVar3.g(zVar3.U);
                return;
        }
    }

    public /* synthetic */ ptc(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
