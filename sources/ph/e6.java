package ph;

import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.location.Location;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.car.app.hardware.common.CarResultStub;
import java.io.InputStream;
import java.nio.ByteBuffer;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0199 A[LOOP:0: B:2:0x000e->B:33:0x0199, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0195 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        rf.j jVar = (rf.j) this.c;
        byte[] bArr = (byte[]) this.b;
        int i10 = 0;
        int i11 = 0;
        while (i11 < bArr.length) {
            if (bArr.length - i11 < 8) {
                jVar.f();
                return;
            }
            int i12 = bArr[i11] & 255;
            int i13 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8) | (bArr[i11 + 3] & 255);
            long j10 = ((bArr[i11 + 4] & 255) << 24) | ((bArr[i11 + 5] & 255) << 16) | ((bArr[i11 + 6] & 255) << 8) | (255 & bArr[i11 + 7]);
            int i14 = i11 + 8;
            long j11 = i14 + j10;
            if (j10 > 1048576 || j11 > bArr.length) {
                jVar.f();
                return;
            }
            int i15 = (int) j10;
            byte[] bArr2 = new byte[i15];
            System.arraycopy(bArr, i14, bArr2, i10, i15);
            boolean z4 = true;
            if (i13 != 0) {
                synchronized (jVar.a) {
                    try {
                        rf.i iVar = (rf.i) jVar.k.get(Integer.valueOf(i13));
                        if (iVar == null) {
                            if (i12 != 2 && i12 != 4 && i12 != 3) {
                                z4 = false;
                            }
                        } else if (i12 == 2) {
                            if (i15 != 0) {
                                synchronized (jVar.a) {
                                    try {
                                        long j12 = iVar.d;
                                        long j13 = i15;
                                        if (j12 >= j13) {
                                            iVar.d = j12 - j13;
                                            try {
                                                iVar.b.getOutputStream().write(bArr2);
                                                synchronized (jVar.a) {
                                                    try {
                                                        if (jVar.k.get(Integer.valueOf(iVar.a)) == iVar) {
                                                            iVar.d += j13;
                                                            jVar.j(4, iVar.a, ByteBuffer.allocate(4).putInt(i15).array());
                                                        }
                                                    } catch (Throwable th2) {
                                                        throw th2;
                                                    }
                                                }
                                            } catch (Exception unused) {
                                                jVar.c(iVar, true);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else if (i12 == 4 && i15 == 4) {
                            long j14 = ByteBuffer.wrap(bArr2).getInt() & 4294967295L;
                            if (j14 != 0) {
                                synchronized (jVar.a) {
                                    try {
                                        long j15 = iVar.c;
                                        if (j15 <= 4294967295L - j14) {
                                            iVar.c = j15 + j14;
                                            jVar.a.notifyAll();
                                            z4 = true;
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            if (i12 == 3 && i15 == 0) {
                                jVar.c(iVar, false);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (!z4) {
                            }
                        }
                    } finally {
                    }
                }
                if (!z4) {
                }
            } else if (i12 == 17 && i15 == 0) {
                synchronized (jVar.a) {
                    try {
                        if (!jVar.p && !jVar.o) {
                            jVar.o = true;
                            ArrayList arrayList = new ArrayList(jVar.k.values());
                            int size = arrayList.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList.get(i16);
                                i16++;
                                rf.i iVar2 = (rf.i) obj;
                                iVar2.e = true;
                                jVar.j(1, iVar2.a, null);
                            }
                            rf.d dVar = jVar.s;
                            jVar.a.notifyAll();
                            if (dVar != null) {
                                AndroidUtilities.runOnUIThread(new ga(dVar, 4));
                            }
                        }
                    } finally {
                    }
                }
                if (!z4) {
                }
            } else if (i12 == 5 && i15 <= 64) {
                jVar.j(6, i10, bArr2);
                if (!z4) {
                    jVar.f();
                    return;
                } else {
                    i11 = (int) j11;
                    i10 = 0;
                }
            }
            z4 = false;
            if (!z4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        int i10;
        switch (this.a) {
            case 0:
                l6.R((l6) this.c, (TLObject) this.b);
                return;
            case 1:
                t6 t6Var = (t6) this.c;
                TLObject tLObject = (TLObject) this.b;
                t6Var.e1 = 0;
                if (tLObject instanceof Vector) {
                    t6Var.V0 = new ArrayList();
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
                            t6Var.V0.add(tL_inputDocument);
                        }
                    }
                    return;
                }
                return;
            case 2:
                c7.R((c7) this.c, (TLObject) this.b);
                return;
            case 3:
                c7 c7Var = (c7) this.c;
                TextView textView = (TextView) this.b;
                ClipboardManager clipboardManager = (ClipboardManager) c7Var.getContext().getSystemService("clipboard");
                org.telegram.ui.Cells.f3 f3Var = c7Var.V.b;
                boolean z4 = (TextUtils.isEmpty(f3Var.getText()) || TextUtils.equals(f3Var.getText(), "https://") || TextUtils.isEmpty(f3Var.getText().toString())) && clipboardManager != null && clipboardManager.hasPrimaryClip();
                org.telegram.ui.b.p(textView.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.7f).scaleY(z4 ? 1.0f : 0.7f), mr.h, 300L);
                return;
            case 4:
                e8 e8Var = (e8) this.c;
                HashMap<Long, Integer> smallGroupsParticipantsCount = ((MessagesStorage) this.b).getSmallGroupsParticipantsCount();
                if (smallGroupsParticipantsCount == null || smallGroupsParticipantsCount.isEmpty()) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new e6(5, e8Var, smallGroupsParticipantsCount));
                return;
            case 5:
                e8 e8Var2 = (e8) this.c;
                HashMap hashMap = (HashMap) this.b;
                if (e8Var2.M == null) {
                    e8Var2.M = new HashMap();
                }
                e8Var2.M.putAll(hashMap);
                return;
            case 6:
                d dVar = (d) this.c;
                Runnable runnable = (Runnable) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 7:
                ma maVar = (ma) this.c;
                Bitmap bitmap = (Bitmap) this.b;
                if (!maVar.k || maVar.i) {
                    return;
                }
                maVar.d.add(new la(maVar, bitmap));
                maVar.k = false;
                maVar.n.invalidate();
                return;
            case 8:
                int[] iArr = (int[]) this.c;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.b;
                int i12 = iArr[0];
                if (i12 != 0) {
                    connectionsManager.cancelRequest(i12, true);
                    iArr[0] = 0;
                    return;
                }
                return;
            case 9:
                CarResultStub.lambda$notifyResults$1((Map.Entry) this.c, this.b);
                return;
            case 10:
                rf.j jVar = (rf.j) this.c;
                rf.i iVar = (rf.i) this.b;
                byte[] bArr = new byte[65536];
                try {
                    InputStream inputStream = iVar.b.getInputStream();
                    while (true) {
                        synchronized (jVar.a) {
                            while (!jVar.p && jVar.k.get(Integer.valueOf(iVar.a)) == iVar && (!jVar.o || !iVar.e || iVar.c == 0)) {
                                try {
                                    jVar.a.wait();
                                } finally {
                                }
                            }
                            if (!jVar.p && jVar.k.get(Integer.valueOf(iVar.a)) == iVar) {
                                int read = inputStream.read(bArr, 0, (int) Math.min(65536L, iVar.c));
                                if (read < 0) {
                                    jVar.c(iVar, true);
                                    return;
                                }
                                if (read != 0) {
                                    byte[] bArr2 = new byte[read];
                                    System.arraycopy(bArr, 0, bArr2, 0, read);
                                    synchronized (jVar.a) {
                                        try {
                                            if (!jVar.p && jVar.k.get(Integer.valueOf(iVar.a)) == iVar && jVar.o) {
                                                iVar.c -= read;
                                                jVar.j(2, iVar.a, bArr2);
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception unused) {
                    jVar.c(iVar, true);
                    return;
                }
                break;
            case 11:
                a();
                return;
            case 12:
                rh.j jVar2 = (rh.j) this.c;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.b;
                if (userFull != null) {
                    jVar2.T = false;
                    TL_payments.starRefProgram starrefprogram = userFull.starref_program;
                    jVar2.V = starrefprogram;
                    if (starrefprogram == null) {
                        jVar2.T = true;
                        jVar2.V = jVar2.F0();
                        jVar2.U = null;
                    } else {
                        TL_payments.starRefProgram starrefprogram2 = new TL_payments.starRefProgram();
                        jVar2.U = starrefprogram2;
                        TL_payments.starRefProgram starrefprogram3 = jVar2.V;
                        starrefprogram2.commission_permille = starrefprogram3.commission_permille;
                        starrefprogram2.duration_months = starrefprogram3.duration_months;
                    }
                }
                jVar2.H0(true);
                return;
            case 13:
                rh.p2 p2Var = (rh.p2) this.c;
                TLRPC.UserFull userFull2 = (TLRPC.UserFull) this.b;
                p2Var.getClass();
                if (userFull2 == null || (botInfo = userFull2.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
                    return;
                }
                p2Var.g(botappsettings, true);
                return;
            case 14:
                rh.p2 p2Var2 = (rh.p2) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                if (p2Var2.Z) {
                    return;
                }
                if (tL_error != null) {
                    p2Var2.k(false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(p2Var2.q0, 60000L);
                    return;
                }
            case 15:
                rh.p2 p2Var3 = (rh.p2) this.c;
                ic Q = new qc(p2Var3.m0, p2Var3.B).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q.j = 5000;
                Q.k(true);
                return;
            case 16:
                rh.d3 d3Var = (rh.d3) this.c;
                d3Var.getMessagesController().openApp((TLRPC.User) this.b, d3Var.getClassGuid());
                return;
            case 17:
                rh.d3 d3Var2 = (rh.d3) this.c;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                d3Var2.getClass();
                d3Var2.presentFragment(zn.R9(connectedbotstarref.bot_id));
                return;
            case 18:
                rh.n3 n3Var = (rh.n3) this.c;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                if (n3Var.Q) {
                    return;
                }
                if (tL_error2 != null) {
                    n3Var.b.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(n3Var.R, 60000L);
                    return;
                }
            case 19:
                rh.n3 n3Var2 = (rh.n3) this.c;
                ic Q2 = new qc(n3Var2.b.getContainer(), n3Var2.a).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags((String) this.b));
                Q2.j = 5000;
                Q2.k(true);
                return;
            case 20:
                sh.q qVar = (sh.q) this.c;
                th.e eVar = (th.e) this.b;
                qVar.getClass();
                qVar.presentFragment(zn.R9(eVar.b.id));
                return;
            case 21:
                ((sh.i0) this.c).s.presentFragment(zn.R9(((th.e) this.b).b.id));
                return;
            case 22:
                tf.c cVar = (tf.c) this.c;
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.b);
                int i13 = cVar.D;
                MessagesController.getInstance(i13).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i13).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i13).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = cVar.v;
                cVar.v = null;
                cVar.H(cVar.w, location, false);
                return;
            case 23:
                tf.z zVar = (tf.z) this.c;
                TLObject tLObject2 = (TLObject) this.b;
                int i14 = zVar.p0;
                ArrayList arrayList = zVar.H;
                zVar.P = 0;
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeersEmpty) {
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    arrayList.clear();
                    zVar.l();
                    return;
                }
                if (tLObject2 instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject2;
                    MessagesController.getInstance(i14).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i14).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList.addAll(tL_contacts_sponsoredPeers.peers);
                    zVar.l();
                    return;
                }
                return;
            case 24:
                tf.z zVar2 = (tf.z) this.c;
                View view = (View) this.b;
                zVar2.j0 = false;
                zVar2.l0 = null;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 25:
                tf.z zVar3 = (tf.z) this.c;
                StringBuilder sb = (StringBuilder) this.b;
                zVar3.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(zVar3.p0).getDatabase().executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 26:
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
                return;
            case 27:
                tf.j1 j1Var = (tf.j1) this.c;
                ArrayList arrayList3 = (ArrayList) this.b;
                int i17 = j1Var.m;
                try {
                    MessagesStorage.getInstance(i17).getDatabase().beginTransaction();
                    SQLitePreparedStatement executeFast = MessagesStorage.getInstance(i17).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    int i18 = 0;
                    while (true) {
                        if (i18 < arrayList3.size() && i18 != 100) {
                            tf.h1 h1Var = (tf.h1) arrayList3.get(i18);
                            executeFast.requery();
                            executeFast.bindString(1, h1Var.a);
                            executeFast.bindInteger(2, h1Var.b);
                            executeFast.step();
                            i18++;
                        }
                    }
                    executeFast.dispose();
                    if (arrayList3.size() > 100) {
                        SQLitePreparedStatement executeFast2 = MessagesStorage.getInstance(i17).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (i10 = 100; i10 < arrayList3.size(); i10++) {
                            executeFast2.requery();
                            executeFast2.bindString(1, ((tf.h1) arrayList3.get(i10)).a);
                            executeFast2.step();
                        }
                        executeFast2.dispose();
                    }
                    MessagesStorage.getInstance(i17).getDatabase().commitTransaction();
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            case 28:
                u4.b bVar = (u4.b) this.c;
                Uri uri = (Uri) this.b;
                bVar.r = false;
                bVar.b(uri);
                return;
            default:
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
                return;
        }
    }
}
