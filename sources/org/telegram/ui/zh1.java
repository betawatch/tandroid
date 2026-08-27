package org.telegram.ui;

import android.app.Activity;
import android.database.Cursor;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import androidx.car.app.hardware.common.CarResultStub;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zh1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:21|22|23|(3:70|71|(10:73|74|(2:65|66)|27|(1:29)|30|31|32|(1:(1:35))(7:37|38|39|40|41|42|43)|36))|25|(0)|27|(0)|30|31|32|(0)(0)|36) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00b3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        org.telegram.messenger.FileLog.e(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        org.telegram.ui.web.z0 z0Var;
        org.telegram.ui.web.f0 f0Var;
        nh.f0 f0Var2;
        int i12;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        r6 = null;
        r6 = null;
        String str3 = null;
        ArrayList arrayList = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r6 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                ai1 ai1Var = (ai1) this.b;
                String str4 = (String) this.c;
                ai1Var.d.clear();
                ai1Var.e.clear();
                ai1Var.f = true;
                ai1Var.F(str4, "", true);
                ai1Var.h = str4;
                ai1Var.l();
                ai1Var.y = null;
                return;
            case 1:
                ai1 ai1Var2 = (ai1) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                WallpapersListActivity wallpapersListActivity = ai1Var2.A;
                i10 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                MessagesController.getInstance(i10).putUsers(tL_contacts_resolvedPeer.users, false);
                i11 = ((org.telegram.ui.ActionBar.n2) wallpapersListActivity).currentAccount;
                MessagesController.getInstance(i11).putChats(tL_contacts_resolvedPeer.chats, false);
                wallpapersListActivity.getMessagesStorage().putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                String str5 = ai1Var2.x;
                ai1Var2.x = null;
                ai1Var2.F(str5, "", false);
                return;
            case 2:
                gi1 gi1Var = (gi1) this.b;
                String str6 = (String) this.c;
                hi1 hi1Var = gi1Var.a;
                Activity parentActivity = hi1Var.getParentActivity();
                MessageObject messageObject = hi1Var.n;
                if (parentActivity == null) {
                    return;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d(str6);
                }
                str6.getClass();
                if (str6.equals("share_game")) {
                    messageObject.messageOwner.with_my_score = false;
                } else if (str6.equals("share_score")) {
                    messageObject.messageOwner.with_my_score = true;
                }
                hi1Var.showDialog(org.telegram.ui.Components.sp0.N0(hi1Var.getParentActivity(), messageObject, null, false, hi1Var.h));
                return;
            case 3:
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                if (botWebViewContainer$BotWebViewProxy == null || (z0Var = botWebViewContainer$BotWebViewProxy.a) == null || (f0Var = z0Var.c) == null) {
                    return;
                }
                f0Var.f(arrayList2);
                return;
            case 4:
                ArrayList arrayList3 = (ArrayList) this.b;
                LongSparseArray longSparseArray = (LongSparseArray) this.c;
                org.telegram.ui.web.b1.c.addAll(0, arrayList3);
                for (int i14 = 0; i14 < longSparseArray.size(); i14++) {
                    org.telegram.ui.web.b1.d.put(longSparseArray.keyAt(i14), (org.telegram.ui.web.a1) longSparseArray.valueAt(i14));
                }
                org.telegram.ui.web.b1.b = true;
                org.telegram.ui.web.b1.a = false;
                ArrayList arrayList4 = org.telegram.ui.web.b1.e;
                if (arrayList4 != null) {
                    int size = arrayList4.size();
                    while (i13 < size) {
                        Object obj = arrayList4.get(i13);
                        i13++;
                        ((Utilities.Callback) obj).run(arrayList3);
                    }
                    org.telegram.ui.web.b1.e = null;
                    return;
                }
                return;
            case 5:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                org.telegram.ui.web.d1 d1Var = c1Var.h;
                ArrayList arrayList6 = d1Var.f;
                arrayList6.clear();
                arrayList6.addAll(arrayList5);
                d1Var.h = false;
                org.telegram.ui.Components.e51 e51Var = d1Var.a;
                if (e51Var != null) {
                    e51Var.U2.N(true);
                    return;
                }
                return;
            case 6:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.b;
                f1Var.setEnabled(((org.telegram.ui.web.c2) this.c).b() != null);
                f1Var.animate().alpha(f1Var.isEnabled() ? 1.0f : 0.5f);
                return;
            case 7:
                ((o0) this.b).b0.run((Integer) this.c);
                return;
            case 8:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.b;
                v1Var.getMessagesController().removeWebBrowserException((String) this.c);
                v1Var.a.U2.N(true);
                return;
            case 9:
                org.telegram.ui.web.c2 c2Var = (org.telegram.ui.web.c2) this.b;
                TLObject tLObject = (TLObject) this.c;
                int i15 = c2Var.a;
                c2Var.g = true;
                if (tLObject instanceof TLRPC.TL_messages_webPage) {
                    TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                    MessagesController.getInstance(i15).putUsers(tL_messages_webPage.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_webPage.chats, false);
                    c2Var.h = tL_messages_webPage.webpage;
                } else {
                    if (tLObject instanceof TLRPC.TL_webPage) {
                        TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                        if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                            c2Var.h = tL_webPage;
                        }
                    }
                    c2Var.h = null;
                }
                TLRPC.WebPage webPage = c2Var.h;
                if (webPage != null && webPage.cached_page == null) {
                    c2Var.h = null;
                }
                if (!SharedConfig.onlyLocalInstantView && c2Var.h != null && (f0Var2 = c2Var.l) != null) {
                    f0Var2.run();
                }
                c2Var.c();
                return;
            case 10:
                ((org.telegram.ui.web.c2) this.b).m.remove((zh1) this.c);
                return;
            case 11:
                p4.b bVar = (p4.b) this.b;
                Uri uri = (Uri) this.c;
                bVar.r = false;
                bVar.b(uri);
                return;
            case 12:
                pf.c cVar = (pf.c) this.b;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer2 = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.c);
                int i16 = cVar.C;
                MessagesController.getInstance(i16).putUsers(tL_contacts_resolvedPeer2.users, false);
                MessagesController.getInstance(i16).putChats(tL_contacts_resolvedPeer2.chats, false);
                MessagesStorage.getInstance(i16).putUsersAndChats(tL_contacts_resolvedPeer2.users, tL_contacts_resolvedPeer2.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                return;
            case 13:
                pf.z zVar = (pf.z) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                int i17 = zVar.o0;
                ArrayList arrayList7 = zVar.G;
                zVar.O = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList7.isEmpty()) {
                        return;
                    }
                    arrayList7.clear();
                    zVar.l();
                    return;
                }
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i17).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i17).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList7.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar.l();
                    return;
                }
                return;
            case 14:
                pf.z zVar2 = (pf.z) this.b;
                View view = (View) this.c;
                zVar2.i0 = false;
                zVar2.k0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 15:
                pf.z zVar3 = (pf.z) this.b;
                StringBuilder sb2 = (StringBuilder) this.c;
                zVar3.getClass();
                try {
                    sb2.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(zVar3.o0).getDatabase().executeFast(sb2.toString()).stepThis().dispose();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 16:
                pf.c1 c1Var2 = (pf.c1) this.b;
                String str7 = (String) this.c;
                c1Var2.E = str7;
                if (c1Var2.r) {
                    c1Var2.f.g(str7, true, false, c1Var2.s, c1Var2.v, c1Var2.x, c1Var2.w, -1, 1);
                }
                int i18 = UserConfig.selectedAccount;
                ArrayList arrayList8 = new ArrayList(ContactsController.getInstance(i18).contacts);
                c1Var2.y = true;
                int i19 = c1Var2.B;
                c1Var2.B = i19 + 1;
                c1Var2.A = i19;
                c1Var2.l();
                Utilities.searchQueue.postRunnable(new nh.j4(c1Var2, str7, i19, arrayList8, i18, 3));
                return;
            case 17:
                pf.j1 j1Var = (pf.j1) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                int i20 = j1Var.m;
                try {
                    MessagesStorage.getInstance(i20).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i20).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    while (true) {
                        if (i13 < arrayList9.size() && i13 != 100) {
                            pf.h1 h1Var = (pf.h1) arrayList9.get(i13);
                            executeFast.requery();
                            executeFast.bindString(1, h1Var.a);
                            executeFast.bindInteger(2, h1Var.b);
                            executeFast.step();
                            i13++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList9.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i20).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i12 = 100; i12 < arrayList9.size(); i12++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((pf.h1) arrayList9.get(i12)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i20).getDatabase().commitTransaction();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 18:
                qf.h hVar = (qf.h) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                hVar.e = false;
                TL_account.connectedBots connectedbots = tLObject3 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject3 : null;
                hVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(hVar.a).putUsers(hVar.c.users, false);
                }
                hVar.b = System.currentTimeMillis();
                hVar.f = true;
                hVar.d();
                return;
            case 19:
                qf.g0.R((qf.g0) this.b, (org.telegram.ui.Components.xl) this.c);
                return;
            case 20:
                MessagesController.getInstance(((qf.m0) this.b).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                return;
            case 21:
                qf.y0 y0Var = (qf.y0) this.b;
                org.telegram.ui.Components.n41 n41Var = (org.telegram.ui.Components.n41) this.c;
                y0Var.getClass();
                y0Var.X(n41Var.d);
                return;
            case 22:
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                qf.p1 p1Var = (qf.p1) this.c;
                try {
                    try {
                        sQLitePreparedStatement2 = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement2.requery();
                        sQLitePreparedStatement2.bindInteger(1, p1Var.a);
                        sQLitePreparedStatement2.bindString(2, p1Var.b);
                        sQLitePreparedStatement2.bindInteger(3, p1Var.c);
                        sQLitePreparedStatement2.bindInteger(4, p1Var.f);
                        sQLitePreparedStatement2.step();
                    } catch (Throwable th) {
                        if (sQLitePreparedStatement2 != null) {
                            sQLitePreparedStatement2.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                    if (sQLitePreparedStatement2 == null) {
                        return;
                    }
                }
                sQLitePreparedStatement2.dispose();
                return;
            case 23:
                qf.q1 q1Var = (qf.q1) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                ArrayList arrayList10 = q1Var.b;
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i13 < arrayList10.size()) {
                            qf.p1 p1Var2 = (qf.p1) arrayList10.get(i13);
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindInteger(1, p1Var2.a);
                            sQLitePreparedStatement.bindString(2, p1Var2.b);
                            sQLitePreparedStatement.bindInteger(3, p1Var2.c);
                            sQLitePreparedStatement.bindInteger(4, p1Var2.f);
                            sQLitePreparedStatement.step();
                            i13++;
                        }
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    } catch (Exception e12) {
                        FileLog.e(e12);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th2;
                }
            case 24:
                qf.q1 q1Var2 = (qf.q1) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                ArrayList arrayList11 = q1Var2.b;
                int i21 = q1Var2.a;
                if (tLObject4 instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject4;
                    MessagesController.getInstance(i21).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i21).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i21).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList12 = new ArrayList();
                    for (int i22 = 0; i22 < tL_messages_quickReplies.quick_replies.size(); i22++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i22);
                        qf.p1 p1Var3 = new qf.p1();
                        p1Var3.a = tL_quickReply.shortcut_id;
                        p1Var3.b = tL_quickReply.shortcut;
                        p1Var3.f = tL_quickReply.count;
                        p1Var3.d = tL_quickReply.top_message;
                        p1Var3.c = i22;
                        int i23 = 0;
                        while (true) {
                            if (i23 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i23);
                                if (message.id != tL_quickReply.top_message) {
                                    i23++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject2 = new MessageObject(i21, message, false, true);
                            p1Var3.e = messageObject2;
                            messageObject2.generateThumbs(false);
                            p1Var3.e.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList12.add(p1Var3);
                    }
                    arrayList = arrayList12;
                }
                q1Var2.e = false;
                if (arrayList != null) {
                    arrayList11.clear();
                    arrayList11.addAll(arrayList);
                }
                q1Var2.f = true;
                q1Var2.l();
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 25:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.b, this.c);
                return;
            case 26:
                String[] strArr = (String[]) this.b;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.c;
                rh.q a2 = rh.q.a(strArr[0], AndroidUtilities.dp(26.0f), false);
                if (a2 == null) {
                    a2 = rh.q.a(LocaleController.getString(R.string.ArticleLatexError), AndroidUtilities.dp(26.0f), false);
                } else {
                    r7 = false;
                }
                AndroidUtilities.runOnUIThread(new op0(callback2, a2 != null ? a2.a : null, r7, 12));
                return;
            case 27:
                rh.v vVar = (rh.v) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                vVar.c0 = false;
                vVar.d0 = 0;
                lh.d dVar = vVar.b0;
                dVar.setLoading(false);
                if (!(tLObject5 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject5).result;
                if (richMessage == null) {
                    AndroidUtilities.shakeViewSpring(dVar, 4.0f);
                    return;
                }
                vVar.e0 = richMessage;
                vVar.Y.set(richMessage);
                dVar.g(LocaleController.getString(R.string.ArticleAIAddToPage), true, true);
                vVar.P();
                org.telegram.ui.Components.b51 b51Var = vVar.V;
                if (b51Var != null) {
                    b51Var.N(true);
                    return;
                }
                return;
            case 28:
                rh.p3 p3Var = (rh.p3) this.b;
                Uri uri2 = (Uri) this.c;
                try {
                    str = AndroidUtilities.getPath(uri2);
                } catch (Exception e13) {
                    FileLog.e(e13);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !com.google.android.recaptcha.internal.a.v(str)) {
                    try {
                        query = p3Var.getContext().getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e14) {
                        e = e14;
                        str2 = null;
                        FileLog.e(e);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e15) {
                                        e = e15;
                                        FileLog.e(e);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + SharedConfig.getLastLocalId();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(FileLoader.getDirectory(4), "rich_document_" + Math.abs(uri2.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            AndroidUtilities.copyFile(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
                            }
                        } catch (Throwable th3) {
                            try {
                                query.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = p3Var.getContext().getContentResolver().openInputStream(uri2);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !com.google.android.recaptcha.internal.a.v(str)) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new zh1(29, p3Var, str));
                return;
            default:
                ((rh.p3) this.b).c2((String) this.c);
                return;
        }
    }
}
