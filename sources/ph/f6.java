package ph;

import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.hardware.common.CarResultStub;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        switch (this.a) {
            case 0:
                m6.R((m6) this.c, (TLObject) this.b);
                break;
            case 1:
                u6 u6Var = (u6) this.c;
                TLObject tLObject = (TLObject) this.b;
                u6Var.e1 = 0;
                if (tLObject instanceof Vector) {
                    u6Var.V0 = new ArrayList();
                    Vector vector = (Vector) tLObject;
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) vector.objects.get(i11);
                        TLRPC.Document document = stickerSetCovered.cover;
                        if (document == null && !stickerSetCovered.covers.isEmpty()) {
                            document = stickerSetCovered.covers.get(0);
                        }
                        if (document == null && (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered)) {
                            TLRPC.TL_stickerSetFullCovered tL_stickerSetFullCovered = (TLRPC.TL_stickerSetFullCovered) stickerSetCovered;
                            if (!tL_stickerSetFullCovered.documents.isEmpty()) {
                                document = tL_stickerSetFullCovered.documents.get(0);
                            }
                        }
                        if (document != null) {
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = document.id;
                            tL_inputDocument.access_hash = document.access_hash;
                            tL_inputDocument.file_reference = document.file_reference;
                            u6Var.V0.add(tL_inputDocument);
                        }
                    }
                    break;
                }
                break;
            case 2:
                d7.R((d7) this.c, (TLObject) this.b);
                break;
            case 3:
                d7 d7Var = (d7) this.c;
                TextView textView = (TextView) this.b;
                ClipboardManager clipboardManager = (ClipboardManager) d7Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.g3 g3Var = d7Var.V.b;
                boolean z4 = (TextUtils.isEmpty(g3Var.getText()) || TextUtils.equals(g3Var.getText(), "https://") || TextUtils.isEmpty(g3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                org.telegram.ui.b.p(textView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.7f).scaleY(z4 ? 1.0f : 0.7f), nr.h, 300L);
                break;
            case 4:
                f8 f8Var = (f8) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount != null && !smallGroupsParticipantsCount.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new f6(5, f8Var, smallGroupsParticipantsCount));
                    break;
                }
                break;
            case 5:
                f8 f8Var2 = (f8) this.c;
                HashMap hashMap = (HashMap) this.b;
                if (f8Var2.M == null) {
                    f8Var2.M = new HashMap();
                }
                f8Var2.M.putAll(hashMap);
                break;
            case 6:
                d dVar = (d) this.c;
                Runnable runnable = (Runnable) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
            case 7:
                ma maVar = (ma) this.c;
                Bitmap bitmap = (Bitmap) this.b;
                if (maVar.k && !maVar.i) {
                    maVar.d.add(new la(maVar, bitmap));
                    maVar.k = false;
                    maVar.n.invalidate();
                    break;
                }
                break;
            case 8:
                int[] iArr = (int[]) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.b;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 9:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.c, this.b);
                break;
            case 10:
                rh.k kVar = (rh.k) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.b;
                if (userFull != null) {
                    kVar.T = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    kVar.V = starrefprogram;
                    if (starrefprogram == null) {
                        kVar.T = true;
                        kVar.V = kVar.F0();
                        kVar.U = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        kVar.U = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = kVar.V;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                kVar.H0(true);
                break;
            case 11:
                rh.q2 q2Var = (rh.q2) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.b;
                q2Var.getClass();
                if (userFull2 != null && (botInfo = userFull2.bot_info) != null && (botappsettings = botInfo.app_settings) != null) {
                    q2Var.g(botappsettings, true);
                    break;
                }
                break;
            case 12:
                rh.q2 q2Var2 = (rh.q2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (!q2Var2.Z) {
                    if (tL_error != null) {
                        q2Var2.k(false);
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(q2Var2.q0, 60000L);
                        break;
                    }
                }
                break;
            case 13:
                rh.q2 q2Var3 = (rh.q2) this.c;
                ic Q = new qc(q2Var3.m0, q2Var3.B).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q.j = 5000;
                Q.k(true);
                break;
            case 14:
                rh.e3 e3Var = (rh.e3) this.c;
                e3Var.getMessagesController().openApp((TLRPC.User) this.b, e3Var.getClassGuid());
                break;
            case 15:
                rh.e3 e3Var2 = (rh.e3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                e3Var2.getClass();
                e3Var2.presentFragment(xn.R9(connectedbotstarref.bot_id));
                break;
            case 16:
                rh.o3 o3Var = (rh.o3) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (!o3Var.Q) {
                    if (tL_error2 != null) {
                        o3Var.b.dismiss();
                        break;
                    } else {
                        AndroidUtilities.runOnUIThread(o3Var.R, 60000L);
                        break;
                    }
                }
                break;
            case 17:
                rh.o3 o3Var2 = (rh.o3) this.c;
                ic Q2 = new qc(o3Var2.b.getContainer(), o3Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q2.j = 5000;
                Q2.k(true);
                break;
            case 18:
                sh.q qVar = (sh.q) this.c;
                th.e eVar = (th.e) this.b;
                qVar.getClass();
                qVar.presentFragment(xn.R9(eVar.b.id));
                break;
            case 19:
                ((sh.i0) this.c).s.presentFragment(xn.R9(((th.e) this.b).b.id));
                break;
            case 20:
                tf.c cVar = (tf.c) this.c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.b);
                int i13 = cVar.D;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                break;
            case 21:
                tf.z zVar = (tf.z) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                int i14 = zVar.p0;
                ArrayList arrayList = zVar.H;
                zVar.P = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (!arrayList.isEmpty()) {
                        arrayList.clear();
                        zVar.l();
                        break;
                    }
                } else if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i14).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar.l();
                    break;
                }
                break;
            case 22:
                tf.z zVar2 = (tf.z) this.c;
                View view = (View) this.b;
                zVar2.j0 = false;
                zVar2.l0 = null;
                if (view != null) {
                    view.invalidate();
                    break;
                }
                break;
            case 23:
                tf.z zVar3 = (tf.z) this.c;
                StringBuilder sb = (StringBuilder) this.b;
                zVar3.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(zVar3.p0).getDatabase().executeFast(sb.toString()).stepThis().dispose();
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 24:
                tf.c1 c1Var = (tf.c1) this.c;
                String str = (String) this.b;
                c1Var.F = str;
                if (c1Var.r) {
                    c1Var.f.g(str, true, false, c1Var.s, c1Var.v, c1Var.x, c1Var.w, -1, 1);
                }
                int i15 = UserConfig.selectedAccount;
                ArrayList arrayList2 = new ArrayList(ContactsController.getInstance(i15).contacts);
                c1Var.y = true;
                int i16 = c1Var.C;
                c1Var.C = i16 + 1;
                c1Var.B = i16;
                c1Var.l();
                Utilities.searchQueue.postRunnable(new org.telegram.messenger.p6(c1Var, str, i16, arrayList2, i15, 3));
                break;
            case 25:
                tf.k1 k1Var = (tf.k1) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                int i17 = k1Var.m;
                try {
                    MessagesStorage.getInstance(i17).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i17).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList3.size() && i18 != 100) {
                            tf.i1 i1Var = (tf.i1) arrayList3.get(i18);
                            executeFast.requery();
                            executeFast.bindString(1, i1Var.a);
                            executeFast.bindInteger(2, i1Var.b);
                            executeFast.step();
                            i18++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i17).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((tf.i1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i17).getDatabase().commitTransaction();
                    break;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
                break;
            case 26:
                u4.b bVar = (u4.b) this.c;
                Uri uri = (Uri) this.b;
                bVar.r = false;
                bVar.b(uri);
                break;
            case 27:
                uf.f fVar = (uf.f) this.c;
                TLObject tLObject3 = (TLObject) this.b;
                fVar.e = false;
                TL_account.connectedBots connectedbots = tLObject3 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject3 : null;
                fVar.c = connectedbots;
                if (connectedbots != null) {
                    MessagesController.getInstance(fVar.a).putUsers(fVar.c.users, false);
                }
                fVar.b = System.currentTimeMillis();
                fVar.f = true;
                fVar.d();
                break;
            case 28:
                uf.e0.R((uf.e0) this.c, (hm) this.b);
                break;
            default:
                MessagesController.getInstance(((uf.k0) this.c).currentAccount).processUpdates((TLRPC.Updates) ((TLObject) this.b), false);
                break;
        }
    }
}
