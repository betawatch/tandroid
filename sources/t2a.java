// default package

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class t2a implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ z3a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ k27 h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ t2a(z3a z3aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = z3aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k27Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x068c  */
    /* JADX WARN: Type inference failed for: r1v8, types: [ad7] */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [pf0, z3a] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        k27 k27Var;
        TLRPC.Message message3;
        ?? r6;
        boolean z;
        ?? r5;
        String str;
        int i;
        k27 k27Var2;
        boolean z2;
        boolean z3;
        int i2;
        TLRPC.Updates updates;
        int i3;
        boolean z4;
        z3a z3aVar;
        boolean z5;
        String str2;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        byte b;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j;
        ArrayList<TLRPC.Update> arrayList3;
        z3a z3aVar2;
        boolean z6;
        int i4;
        boolean z7;
        switch (this.a) {
            case 0:
                z3a z3aVar3 = this.b;
                TLRPC.TL_error tL_error = this.d;
                TLRPC.Message message4 = this.e;
                TLObject tLObject = this.f;
                k27 k27Var3 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z8 = this.c;
                TLObject tLObject2 = this.s;
                if (tL_error != null) {
                    ij.c0(z3aVar3.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z3aVar3.h0(message4.id, z8);
                    z3aVar3.k0(k27Var3);
                    break;
                } else {
                    String str4 = message4.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList4 = updates2.updates;
                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                        TLRPC.Update update = arrayList4.get(i5);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            ox8.f(z3aVar3.currentAccount).j(update, k27.J1(message4), k27.I1(message4));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            fl5.R(message);
                            z3aVar3.y0(k27Var3, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new e3a(z3aVar3, updates2, message4, z8, (byte) 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new e3a(z3aVar3, updates2, message4, z8, (byte) 0));
                }
            default:
                z3a z3aVar4 = this.b;
                boolean z9 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                k27 k27Var4 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject4 = this.s;
                if (tL_error2 == null) {
                    int i6 = message5.id;
                    ArrayList arrayList5 = new ArrayList();
                    boolean z10 = message5.date == 2147483646;
                    if (tLObject3 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject3;
                        i = i6;
                        z3aVar4.y0(k27Var4, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        z3a z3aVar5 = z3aVar4;
                        int o1 = k27Var4.o1();
                        int i7 = tL_updateShortSentMessage.id;
                        message5.id = i7;
                        message5.local_id = i7;
                        message5.date = tL_updateShortSentMessage.date;
                        message5.entities = tL_updateShortSentMessage.entities;
                        message5.out = tL_updateShortSentMessage.out;
                        if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                            message5.ttl_period = tL_updateShortSentMessage.ttl_period;
                            message5.flags |= 33554432;
                        }
                        TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                        if (messageMedia != null) {
                            message5.media = messageMedia;
                            message5.flags |= 512;
                            fl5.R(message5);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message5.message = tL_updateShortSentMessage.message;
                        }
                        if (!message5.entities.isEmpty()) {
                            message5.flags |= 128;
                        }
                        Integer num = (Integer) z3aVar5.getMessagesController().Q.get(Long.valueOf(message5.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(z3aVar5.getMessagesStorage().S(message5.dialog_id, message5.out));
                            z3aVar5.getMessagesController().Q.put(Long.valueOf(message5.dialog_id), num);
                        }
                        message5.unread = num.intValue() < message5.id;
                        Utilities.d.c(new tj9(z3aVar5, tL_updateShortSentMessage, (byte) 24));
                        arrayList5.add(message5);
                        i2 = o1;
                        k27Var2 = k27Var4;
                        z3 = false;
                        z2 = false;
                        z3aVar2 = z3aVar5;
                    } else {
                        byte b2 = 1;
                        i = i6;
                        z3a z3aVar6 = z3aVar4;
                        if (tLObject3 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject3;
                            ArrayList<TLRPC.Update> arrayList6 = updates3.updates;
                            ArrayList arrayList7 = new ArrayList();
                            boolean z11 = z9;
                            vf6 vf6Var = null;
                            TLRPC.Message message6 = null;
                            int i8 = 0;
                            while (i8 < arrayList6.size()) {
                                TLRPC.Update update2 = arrayList6.get(i8);
                                TLRPC.Updates updates4 = updates3;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message7 = tL_updateNewMessage.message;
                                    z5 = z11;
                                    if (message7.action != null) {
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        str2 = str5;
                                        z11 = z5;
                                        b = 1;
                                        i8 += b;
                                        b2 = b;
                                        arrayList6 = arrayList;
                                        updates3 = updates4;
                                        arrayList7 = arrayList2;
                                        str5 = str2;
                                    } else {
                                        arrayList5.add(message7);
                                        str2 = str5;
                                        Utilities.d.c(new b3a(z3aVar6, tL_updateNewMessage, (byte) 2));
                                        arrayList6.remove(i8);
                                        i8--;
                                        b = b2;
                                        arrayList = arrayList6;
                                        z11 = z5;
                                        message6 = message7;
                                        arrayList2 = arrayList7;
                                        i8 += b;
                                        b2 = b;
                                        arrayList6 = arrayList;
                                        updates3 = updates4;
                                        arrayList7 = arrayList2;
                                        str5 = str2;
                                    }
                                } else {
                                    z5 = z11;
                                    str2 = str5;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        TLRPC.TL_message b3 = t34.b(tL_updateNewEphemeralMessage.message);
                                        arrayList5.add(b3);
                                        arrayList7.add(tL_updateNewEphemeralMessage.message);
                                        arrayList6.remove(i8);
                                        i8--;
                                        b = b2;
                                        message6 = b3;
                                        arrayList = arrayList6;
                                        arrayList2 = arrayList7;
                                        z11 = z5;
                                    } else {
                                        if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                            TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                            ArrayList arrayList8 = arrayList7;
                                            long Q1 = na7.Q1(tL_updateNewChannelMessage);
                                            TLRPC.Chat K0 = z3aVar6.getMessagesController().K0(Long.valueOf(Q1));
                                            if (!(K0 == null || K0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                                j = Q1;
                                            } else {
                                                if (vf6Var == null) {
                                                    vf6Var = new vf6();
                                                }
                                                j = Q1;
                                                long B0 = k27.B0(tL_updateNewChannelMessage.message);
                                                SparseArray sparseArray = (SparseArray) vf6Var.f(B0);
                                                if (sparseArray == null) {
                                                    sparseArray = new SparseArray();
                                                    vf6Var.k(sparseArray, B0);
                                                }
                                                TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                                int i9 = messageReplyHeader2.reply_to_top_id;
                                                if (i9 == 0) {
                                                    i9 = messageReplyHeader2.reply_to_msg_id;
                                                }
                                                TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i9);
                                                if (messageReplies == null) {
                                                    messageReplies = new TLRPC.TL_messageReplies();
                                                    sparseArray.put(i9, messageReplies);
                                                }
                                                TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                                if (peer != null) {
                                                    messageReplies.recent_repliers.add(0, peer);
                                                }
                                                messageReplies.replies++;
                                            }
                                            vf6 vf6Var2 = vf6Var;
                                            TLRPC.Message message8 = tL_updateNewChannelMessage.message;
                                            arrayList5.add(message8);
                                            Utilities.d.c(new c3a(z3aVar6, tL_updateNewChannelMessage, b2));
                                            arrayList6.remove(i8);
                                            i8--;
                                            if (tL_updateNewChannelMessage.message.pinned) {
                                                long j2 = j;
                                                arrayList3 = arrayList6;
                                                arrayList2 = arrayList8;
                                                message6 = message8;
                                                Utilities.d.c(new k1a(z3aVar6, tL_updateNewChannelMessage, j2, (byte) 0));
                                            } else {
                                                arrayList3 = arrayList6;
                                                arrayList2 = arrayList8;
                                                message6 = message8;
                                            }
                                            vf6Var = vf6Var2;
                                            arrayList = arrayList3;
                                        } else {
                                            arrayList = arrayList6;
                                            arrayList2 = arrayList7;
                                            if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                                TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                                int i10 = 0;
                                                while (true) {
                                                    if (i10 < arrayList5.size()) {
                                                        if (((TLRPC.Message) arrayList5.get(i10)).id == tL_updateNewScheduledMessage.message.id) {
                                                            arrayList5.remove(i10);
                                                        } else {
                                                            i10++;
                                                        }
                                                    }
                                                }
                                                TLRPC.Message message9 = tL_updateNewScheduledMessage.message;
                                                arrayList5.add(message9);
                                                arrayList.remove(i8);
                                                i8--;
                                                message6 = message9;
                                                b = 1;
                                                z11 = true;
                                            } else {
                                                if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                                    ox8.f(z3aVar6.currentAccount).j(update2, k27.J1(k27Var4.k), k27.I1(k27Var4.k));
                                                    TLRPC.Message message10 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                                    arrayList5.add(message10);
                                                    arrayList.remove(i8);
                                                    i8--;
                                                    message6 = message10;
                                                } else if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                    TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                    if (k27.B0(k27Var4.k) == cf3.n(tL_updateDeleteScheduledMessages.peer)) {
                                                        ArrayList<Integer> arrayList9 = tL_updateDeleteScheduledMessages.messages;
                                                        int size = arrayList9.size();
                                                        int i11 = 0;
                                                        while (i11 < size) {
                                                            Integer num2 = arrayList9.get(i11);
                                                            i11++;
                                                            int intValue = num2.intValue();
                                                            ArrayList<Integer> arrayList10 = arrayList9;
                                                            int i12 = 0;
                                                            while (true) {
                                                                if (i12 >= arrayList5.size()) {
                                                                    break;
                                                                } else if (((TLRPC.Message) arrayList5.get(i12)).id == intValue) {
                                                                    arrayList5.remove(i12);
                                                                } else {
                                                                    i12++;
                                                                }
                                                            }
                                                            arrayList9 = arrayList10;
                                                        }
                                                        arrayList.remove(i8);
                                                        i8--;
                                                    }
                                                }
                                                z11 = z5;
                                                b = 1;
                                            }
                                        }
                                        b = 1;
                                        z11 = false;
                                    }
                                    i8 += b;
                                    b2 = b;
                                    arrayList6 = arrayList;
                                    updates3 = updates4;
                                    arrayList7 = arrayList2;
                                    str5 = str2;
                                }
                            }
                            boolean z12 = b2;
                            TLRPC.Updates updates5 = updates3;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList6;
                            ArrayList arrayList12 = arrayList7;
                            boolean z13 = z11;
                            String str6 = str5;
                            if (!arrayList12.isEmpty()) {
                                z3aVar6.getMessagesStorage().c1(arrayList12, z12);
                            }
                            if (vf6Var != null) {
                                z3aVar6.getMessagesStorage().X0(null, null, vf6Var, z12);
                                kk7 notificationCenter = z3aVar6.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[z12 ? 1 : 0] = null;
                                objArr[2] = vf6Var;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(77, objArr);
                            }
                            TLRPC.Message message11 = message6;
                            if (message11 != null) {
                                k27.B0(message11);
                                if (z10 && message11.date != 2147483646) {
                                    z13 = false;
                                }
                                fl5.R(message11);
                                if (!z13) {
                                    Integer num3 = (Integer) z3aVar6.getMessagesController().Q.get(Long.valueOf(message11.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(z3aVar6.getMessagesStorage().S(message11.dialog_id, message11.out));
                                        z3aVar6.getMessagesController().Q.put(Long.valueOf(message11.dialog_id), num3);
                                    }
                                    message11.unread = num3.intValue() < message11.id;
                                }
                                TLRPC.Message message12 = k27Var4.k;
                                message12.post_author = message11.post_author;
                                if ((message11.flags & 33554432) != 0) {
                                    message12.ttl_period = message11.ttl_period;
                                    message12.flags |= 33554432;
                                }
                                message12.entities = message11.entities;
                                int i13 = message11.quick_reply_shortcut_id;
                                message12.quick_reply_shortcut_id = i13;
                                if (i13 != 0) {
                                    message12.flags |= TLObject.FLAG_30;
                                }
                                updates = updates5;
                                z3aVar6.y0(k27Var4, message11, message11.id, Collections.singletonList(str6), false, -1, hashMap2);
                                k27Var2 = k27Var4;
                                z3aVar = z3aVar6;
                                i3 = k27Var2.o1();
                                message5.id = message11.id;
                                z4 = false;
                            } else {
                                k27Var2 = k27Var4;
                                updates = updates5;
                                if (w01.a) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                                        sb.append(arrayList11.get(i14).getClass().getSimpleName());
                                        sb.append(", ");
                                    }
                                    fa4.b("can't find message in updates " + ((Object) sb));
                                }
                                i3 = 0;
                                z4 = true;
                                z3aVar = z3aVar6;
                            }
                            z2 = z13;
                            Utilities.d.c(new l1a(z3aVar, updates, (byte) 0));
                            i2 = i3;
                            z3 = z4;
                            z3aVar2 = z3aVar;
                        } else {
                            k27Var2 = k27Var4;
                            z2 = z9;
                            z3 = false;
                            i2 = 0;
                            z3aVar2 = z3aVar6;
                        }
                    }
                    if ((k27.n1(message5) instanceof TLRPC.TL_messageMediaGeoLive) && message5.via_bot_id == 0 && TextUtils.isEmpty(message5.via_bot_name)) {
                        eb6 locationController = z3aVar2.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        vf6 vf6Var3 = locationController.a;
                        db6 db6Var = new db6();
                        i4 = i2;
                        db6Var.a = message5.dialog_id;
                        db6Var.b = message5.id;
                        TLRPC.MessageMedia messageMedia3 = message5.media;
                        db6Var.d = messageMedia3.period;
                        int i15 = messageMedia3.proximity_notification_radius;
                        db6Var.f = i15;
                        db6Var.g = i15;
                        int i16 = locationController.currentAccount;
                        db6Var.e = i16;
                        z6 = z3;
                        db6Var.h = new k27(i16, message5, false, false);
                        if (db6Var.d == Integer.MAX_VALUE) {
                            db6Var.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            db6Var.c = locationController.getConnectionsManager().getCurrentTime() + db6Var.d;
                        }
                        db6 db6Var2 = (db6) vf6Var3.f(db6Var.a);
                        vf6Var3.k(db6Var, db6Var.a);
                        if (db6Var2 != null) {
                            arrayList13.remove(db6Var2);
                        }
                        arrayList13.add(db6Var);
                        locationController.l(db6Var, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        gl.c3(new sx5(locationController, db6Var2, db6Var, (byte) 15));
                    } else {
                        z6 = z3;
                        i4 = i2;
                    }
                    if (z6) {
                        z7 = z9;
                        k27Var = k27Var2;
                        message3 = message5;
                    } else {
                        z3aVar2.getStatsController().i(a.f(), 1, 1);
                        message5.send_state = 0;
                        message5.errorNewPriceStars = 0L;
                        message5.errorAllowedPriceStars = 0L;
                        if (z9 != z2) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new k27(k27Var2.K1, k27Var2.k, true, true));
                            z7 = z9;
                            message3 = message5;
                            z3aVar2.getMessagesStorage().a.c(new ce1(z3aVar2, arrayList5, z9, z2, message5, arrayList14, arrayList15, i));
                            k27Var = k27Var2;
                        } else {
                            boolean z14 = z9;
                            message3 = message5;
                            int i17 = i;
                            z3aVar2.getNotificationCenter().k(21, Integer.valueOf(i17), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), 0L, Integer.valueOf(i4), Boolean.valueOf(z14));
                            k27Var = k27Var2;
                            z3aVar2.getNotificationCenter().k(22, Integer.valueOf(i17), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), 0L, Integer.valueOf(i4), Boolean.valueOf(z14));
                            z3aVar2.getMessagesStorage().a.c(new m1a(z3aVar2, z14, message3, i17, arrayList5, i4));
                            z7 = z14;
                        }
                    }
                    z = z6;
                    r5 = z3aVar2;
                    r6 = z7;
                } else {
                    k27Var = k27Var4;
                    z3a z3aVar7 = z3aVar4;
                    message3 = message5;
                    r6 = z9;
                    ij.c0(z3aVar7.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    z = true;
                    r5 = z3aVar7;
                }
                if (z) {
                    r5.getMessagesStorage().K0(r6, message3);
                    message3.send_state = 2;
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        gta.v(r5.currentAccount, false);
                        message3.errorAllowedPriceStars = gta.l(tLObject4);
                        message3.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                        gta.v(r5.currentAccount, false).d0(Arrays.asList(k27Var));
                        r5.getMessagesStorage().U1(k27.B0(message3), message3);
                    }
                    r5.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r5.c0(message3.id);
                    r5.h0(message3.id, r6);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t2a(z3a z3aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k27 k27Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = z3aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k27Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
