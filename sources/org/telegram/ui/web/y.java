package org.telegram.ui.web;

import android.location.Location;
import android.net.Uri;
import android.util.LongSparseArray;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.o6;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.i8;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.tn;
import ph.d3;
import ph.n3;
import ph.p2;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0 z0Var;
        f0 f0Var;
        t1 t1Var;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        switch (this.a) {
            case 0:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                if (botWebViewContainer$BotWebViewProxy != null && (z0Var = botWebViewContainer$BotWebViewProxy.a) != null && (f0Var = z0Var.c) != null) {
                    f0Var.f(arrayList);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                int i11 = 0;
                b1.c.addAll(0, arrayList2);
                for (int i12 = 0; i12 < longSparseArray.size(); i12++) {
                    b1.d.put(longSparseArray.keyAt(i12), (a1) longSparseArray.valueAt(i12));
                }
                b1.b = true;
                b1.a = false;
                ArrayList arrayList3 = b1.e;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i11 < size) {
                        Object obj = arrayList3.get(i11);
                        i11++;
                        ((Utilities.Callback) obj).run(arrayList2);
                    }
                    b1.e = null;
                    break;
                }
                break;
            case 2:
                c1 c1Var = (c1) this.c;
                ArrayList arrayList4 = (ArrayList) this.b;
                d1 d1Var = c1Var.h;
                ArrayList arrayList5 = d1Var.f;
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                d1Var.h = false;
                o51 o51Var = d1Var.a;
                if (o51Var != null) {
                    o51Var.U2.N(true);
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                g1Var.setEnabled(((d2) this.b).b() != null);
                g1Var.animate().alpha(g1Var.isEnabled() ? 1.0f : 0.5f);
                break;
            case 4:
                ((org.telegram.ui.o0) this.c).b0.run((Integer) this.b);
                break;
            case 5:
                w1 w1Var = (w1) this.c;
                w1Var.getMessagesController().removeWebBrowserException((String) this.b);
                w1Var.a.U2.N(true);
                break;
            case 6:
                d2 d2Var = (d2) this.c;
                TLObject tLObject = (TLObject) this.b;
                int i13 = d2Var.a;
                d2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i13).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i13).putChats(tL_messages_webPage.chats, false);
                    d2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            d2Var.h = tL_webPage;
                        }
                    }
                    d2Var.h = null;
                }
                TLRPC.WebPage webPage = d2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    d2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && d2Var.h != null && (t1Var = d2Var.l) != null) {
                    t1Var.run();
                }
                d2Var.c();
                break;
            case 7:
                ((d2) this.c).m.remove((y) this.b);
                break;
            case 8:
                ph.j jVar = (ph.j) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.b;
                if (userFull != null) {
                    jVar.S = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar.U = starrefprogram;
                    if (starrefprogram == null) {
                        jVar.S = true;
                        jVar.U = jVar.F0();
                        jVar.T = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar.T = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar.U;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar.H0(true);
                break;
            case 9:
                p2 p2Var = (p2) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.b;
                p2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    p2Var.g(botappsettings, true);
                    break;
                }
                break;
            case 10:
                p2 p2Var2 = (p2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (!p2Var2.Y) {
                    if (tL_error != null) {
                        p2Var2.k(false);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(p2Var2.p0, 60000L);
                        break;
                    }
                }
                break;
            case 11:
                p2 p2Var3 = (p2) this.c;
                mc Q = new tc(p2Var3.l0, p2Var3.A).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q.j = 5000;
                Q.k(true);
                break;
            case 12:
                d3 d3Var = (d3) this.c;
                d3Var.getMessagesController().openApp((TLRPC.User) this.b, d3Var.getClassGuid());
                break;
            case 13:
                d3 d3Var2 = (d3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                d3Var2.getClass();
                d3Var2.presentFragment(tn.R9(connectedbotstarref.bot_id));
                break;
            case 14:
                n3 n3Var = (n3) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (!n3Var.P) {
                    if (tL_error2 != null) {
                        n3Var.b.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(n3Var.Q, 60000L);
                        break;
                    }
                }
                break;
            case 15:
                n3 n3Var2 = (n3) this.c;
                mc Q2 = new tc(n3Var2.b.getContainer(), n3Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q2.j = 5000;
                Q2.k(true);
                break;
            case 16:
                qh.q qVar = (qh.q) this.c;
                rh.e eVar = (rh.e) this.b;
                qVar.getClass();
                qVar.presentFragment(tn.R9(eVar.b.id));
                break;
            case 17:
                ((qh.i0) this.c).s.presentFragment(tn.R9(((rh.e) this.b).b.id));
                break;
            case 18:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.c, this.b);
                break;
            case 19:
                r4.b bVar = (r4.b) this.c;
                Uri uri = (Uri) this.b;
                bVar.r = false;
                bVar.b(uri);
                break;
            case 20:
                rf.c cVar = (rf.c) this.c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.b);
                int i14 = cVar.C;
                MessagesController.getInstance(i14).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i14).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i14).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                break;
            case 21:
                rf.a0 a0Var = (rf.a0) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                int i15 = a0Var.o0;
                ArrayList arrayList6 = a0Var.G;
                a0Var.O = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList6.isEmpty()) {
                        arrayList6.clear();
                        a0Var.l();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i15).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i15).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList6.addAll(tL_contacts_sponsoredPeers.peers);
                    a0Var.l();
                    break;
                }
                break;
            case 22:
                rf.a0 a0Var2 = (rf.a0) this.c;
                View view = (View) this.b;
                a0Var2.i0 = false;
                a0Var2.k0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                rf.a0 a0Var3 = (rf.a0) this.c;
                StringBuilder sb2 = (StringBuilder) this.b;
                a0Var3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(a0Var3.o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 24:
                rf.d1 d1Var2 = (rf.d1) this.c;
                String str = (String) this.b;
                d1Var2.E = str;
                if (d1Var2.r) {
                    d1Var2.f.g(str, true, false, d1Var2.s, d1Var2.v, d1Var2.x, d1Var2.w, -1, 1);
                }
                int i16 = UserConfig.selectedAccount;
                ArrayList arrayList7 = new ArrayList(ContactsController.getInstance(i16).contacts);
                d1Var2.y = true;
                int i17 = d1Var2.B;
                d1Var2.B = i17 + 1;
                d1Var2.A = i17;
                d1Var2.l();
                Utilities.searchQueue.postRunnable(new o6(d1Var2, str, i17, arrayList7, i16, 3));
                break;
            case 25:
                rf.k1 k1Var = (rf.k1) this.c;
                ArrayList arrayList8 = (ArrayList) this.b;
                int i18 = k1Var.m;
                try {
                    MessagesStorage.getInstance(i18).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i18).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i19 = 0;
                    while (true) {
                        if (i19 < arrayList8.size() && i19 != 100) {
                            rf.i1 i1Var = (rf.i1) arrayList8.get(i19);
                            executeFast.requery();
                            executeFast.bindString(1, i1Var.a);
                            executeFast.bindInteger(2, i1Var.b);
                            executeFast.step();
                            i19++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList8.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i18).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList8.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((rf.i1) arrayList8.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i18).getDatabase().commitTransaction();
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
                break;
            case 26:
                sf.g gVar = (sf.g) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                gVar.e = false;
                TL_account.connectedBots connectedbots = tLObject3 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject3 : null;
                gVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(gVar.a).putUsers(gVar.c.users, false);
                }
                gVar.b = System.currentTimeMillis();
                gVar.f = true;
                gVar.d();
                break;
            case 27:
                sf.f0.R((sf.f0) this.c, (i8) this.b);
                break;
            case 28:
                MessagesController.getInstance(((sf.l0) this.c).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.b), false);
                break;
            default:
                sf.x0 x0Var = (sf.x0) this.c;
                w41 w41Var = (w41) this.b;
                x0Var.getClass();
                x0Var.X(w41Var.d);
                break;
        }
    }

    public /* synthetic */ y(ArrayList arrayList, LongSparseArray longSparseArray) {
        this.a = 1;
        this.b = arrayList;
        this.c = longSparseArray;
    }
}
