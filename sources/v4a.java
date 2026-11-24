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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class v4a implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ k47 h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ v4a(a6a a6aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = a6aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k47Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x068c  */
    /* JADX WARN: Type inference failed for: r1v8, types: [cf7] */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [a6a, pg0] */
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
        k47 k47Var;
        TLRPC.Message message3;
        ?? r6;
        boolean z;
        ?? r5;
        String str;
        int i;
        k47 k47Var2;
        boolean z2;
        boolean z3;
        int i2;
        TLRPC.Updates updates;
        int i3;
        boolean z4;
        a6a a6aVar;
        boolean z5;
        String str2;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        byte b;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j;
        ArrayList<TLRPC.Update> arrayList3;
        a6a a6aVar2;
        boolean z6;
        int i4;
        boolean z7;
        switch (this.a) {
            case 0:
                a6a a6aVar3 = this.b;
                TLRPC.TL_error tL_error = this.d;
                TLRPC.Message message4 = this.e;
                TLObject tLObject = this.f;
                k47 k47Var3 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z8 = this.c;
                TLObject tLObject2 = this.s;
                if (tL_error != null) {
                    ik.c0(a6aVar3.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    a6aVar3.h0(message4.id, z8);
                    a6aVar3.k0(k47Var3);
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
                            pz8.f(a6aVar3.currentAccount).j(update, k47.J1(message4), k47.I1(message4));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            fn5.R(message);
                            a6aVar3.y0(k47Var3, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new g5a(a6aVar3, updates2, message4, z8, (byte) 0));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new g5a(a6aVar3, updates2, message4, z8, (byte) 0));
                }
            default:
                a6a a6aVar4 = this.b;
                boolean z9 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject3 = this.f;
                k47 k47Var4 = this.h;
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
                        a6aVar4.y0(k47Var4, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        a6a a6aVar5 = a6aVar4;
                        int o1 = k47Var4.o1();
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
                            fn5.R(message5);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message5.message = tL_updateShortSentMessage.message;
                        }
                        if (!message5.entities.isEmpty()) {
                            message5.flags |= 128;
                        }
                        Integer num = (Integer) a6aVar5.getMessagesController().Q.get(Long.valueOf(message5.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(a6aVar5.getMessagesStorage().S(message5.dialog_id, message5.out));
                            a6aVar5.getMessagesController().Q.put(Long.valueOf(message5.dialog_id), num);
                        }
                        message5.unread = num.intValue() < message5.id;
                        Utilities.d.c(new il9(a6aVar5, tL_updateShortSentMessage, (byte) 26));
                        arrayList5.add(message5);
                        i2 = o1;
                        k47Var2 = k47Var4;
                        z3 = false;
                        z2 = false;
                        a6aVar2 = a6aVar5;
                    } else {
                        byte b2 = 1;
                        i = i6;
                        a6a a6aVar6 = a6aVar4;
                        if (tLObject3 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject3;
                            ArrayList<TLRPC.Update> arrayList6 = updates3.updates;
                            ArrayList arrayList7 = new ArrayList();
                            boolean z11 = z9;
                            vh6 vh6Var = null;
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
                                        Utilities.d.c(new d5a(a6aVar6, tL_updateNewMessage, (byte) 2));
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
                                        TLRPC.TL_message b3 = d54.b(tL_updateNewEphemeralMessage.message);
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
                                            long R1 = oc7.R1(tL_updateNewChannelMessage);
                                            TLRPC.Chat L0 = a6aVar6.getMessagesController().L0(Long.valueOf(R1));
                                            if (!(L0 == null || L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                                j = R1;
                                            } else {
                                                if (vh6Var == null) {
                                                    vh6Var = new vh6();
                                                }
                                                j = R1;
                                                long B0 = k47.B0(tL_updateNewChannelMessage.message);
                                                SparseArray sparseArray = (SparseArray) vh6Var.f(B0);
                                                if (sparseArray == null) {
                                                    sparseArray = new SparseArray();
                                                    vh6Var.k(sparseArray, B0);
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
                                            vh6 vh6Var2 = vh6Var;
                                            TLRPC.Message message8 = tL_updateNewChannelMessage.message;
                                            arrayList5.add(message8);
                                            Utilities.d.c(new e5a(a6aVar6, tL_updateNewChannelMessage, b2));
                                            arrayList6.remove(i8);
                                            i8--;
                                            if (tL_updateNewChannelMessage.message.pinned) {
                                                long j2 = j;
                                                arrayList3 = arrayList6;
                                                arrayList2 = arrayList8;
                                                message6 = message8;
                                                Utilities.d.c(new m3a(a6aVar6, tL_updateNewChannelMessage, j2, (byte) 0));
                                            } else {
                                                arrayList3 = arrayList6;
                                                arrayList2 = arrayList8;
                                                message6 = message8;
                                            }
                                            vh6Var = vh6Var2;
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
                                                    pz8.f(a6aVar6.currentAccount).j(update2, k47.J1(k47Var4.k), k47.I1(k47Var4.k));
                                                    TLRPC.Message message10 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                                    arrayList5.add(message10);
                                                    arrayList.remove(i8);
                                                    i8--;
                                                    message6 = message10;
                                                } else if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                    TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                    if (k47.B0(k47Var4.k) == pg3.n(tL_updateDeleteScheduledMessages.peer)) {
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
                                a6aVar6.getMessagesStorage().c1(arrayList12, z12);
                            }
                            if (vh6Var != null) {
                                a6aVar6.getMessagesStorage().X0(null, null, vh6Var, z12);
                                nm7 notificationCenter = a6aVar6.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[z12 ? 1 : 0] = null;
                                objArr[2] = vh6Var;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(78, objArr);
                            }
                            TLRPC.Message message11 = message6;
                            if (message11 != null) {
                                k47.B0(message11);
                                if (z10 && message11.date != 2147483646) {
                                    z13 = false;
                                }
                                fn5.R(message11);
                                if (!z13) {
                                    Integer num3 = (Integer) a6aVar6.getMessagesController().Q.get(Long.valueOf(message11.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(a6aVar6.getMessagesStorage().S(message11.dialog_id, message11.out));
                                        a6aVar6.getMessagesController().Q.put(Long.valueOf(message11.dialog_id), num3);
                                    }
                                    message11.unread = num3.intValue() < message11.id;
                                }
                                TLRPC.Message message12 = k47Var4.k;
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
                                a6aVar6.y0(k47Var4, message11, message11.id, Collections.singletonList(str6), false, -1, hashMap2);
                                k47Var2 = k47Var4;
                                a6aVar = a6aVar6;
                                i3 = k47Var2.o1();
                                message5.id = message11.id;
                                z4 = false;
                            } else {
                                k47Var2 = k47Var4;
                                updates = updates5;
                                if (e21.a) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i14 = 0; i14 < arrayList11.size(); i14++) {
                                        sb.append(arrayList11.get(i14).getClass().getSimpleName());
                                        sb.append(", ");
                                    }
                                    fc4.b("can't find message in updates " + ((Object) sb));
                                }
                                i3 = 0;
                                z4 = true;
                                a6aVar = a6aVar6;
                            }
                            z2 = z13;
                            Utilities.d.c(new n3a(a6aVar, updates, (byte) 0));
                            i2 = i3;
                            z3 = z4;
                            a6aVar2 = a6aVar;
                        } else {
                            k47Var2 = k47Var4;
                            z2 = z9;
                            z3 = false;
                            i2 = 0;
                            a6aVar2 = a6aVar6;
                        }
                    }
                    if ((k47.n1(message5) instanceof TLRPC.TL_messageMediaGeoLive) && message5.via_bot_id == 0 && TextUtils.isEmpty(message5.via_bot_name)) {
                        dd6 locationController = a6aVar2.getLocationController();
                        ArrayList arrayList13 = locationController.b;
                        vh6 vh6Var3 = locationController.a;
                        cd6 cd6Var = new cd6();
                        i4 = i2;
                        cd6Var.a = message5.dialog_id;
                        cd6Var.b = message5.id;
                        TLRPC.MessageMedia messageMedia3 = message5.media;
                        cd6Var.d = messageMedia3.period;
                        int i15 = messageMedia3.proximity_notification_radius;
                        cd6Var.f = i15;
                        cd6Var.g = i15;
                        int i16 = locationController.currentAccount;
                        cd6Var.e = i16;
                        z6 = z3;
                        cd6Var.h = new k47(i16, message5, false, false);
                        if (cd6Var.d == Integer.MAX_VALUE) {
                            cd6Var.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        } else {
                            cd6Var.c = locationController.getConnectionsManager().getCurrentTime() + cd6Var.d;
                        }
                        cd6 cd6Var2 = (cd6) vh6Var3.f(cd6Var.a);
                        vh6Var3.k(cd6Var, cd6Var.a);
                        if (cd6Var2 != null) {
                            arrayList13.remove(cd6Var2);
                        }
                        arrayList13.add(cd6Var);
                        locationController.l(cd6Var, 0);
                        locationController.w = SystemClock.elapsedRealtime() - 25000;
                        gm.c3(new dt5(locationController, cd6Var2, cd6Var, (byte) 17));
                    } else {
                        z6 = z3;
                        i4 = i2;
                    }
                    if (z6) {
                        z7 = z9;
                        k47Var = k47Var2;
                        message3 = message5;
                    } else {
                        a6aVar2.getStatsController().i(a.f(), 1, 1);
                        message5.send_state = 0;
                        message5.errorNewPriceStars = 0L;
                        message5.errorAllowedPriceStars = 0L;
                        if (z9 != z2) {
                            ArrayList arrayList14 = new ArrayList();
                            arrayList14.add(Integer.valueOf(i));
                            ArrayList arrayList15 = new ArrayList();
                            arrayList15.add(new k47(k47Var2.K1, k47Var2.k, true, true));
                            z7 = z9;
                            message3 = message5;
                            a6aVar2.getMessagesStorage().a.c(new kf1(a6aVar2, arrayList5, z9, z2, message5, arrayList14, arrayList15, i));
                            k47Var = k47Var2;
                        } else {
                            boolean z14 = z9;
                            message3 = message5;
                            int i17 = i;
                            a6aVar2.getNotificationCenter().k(21, Integer.valueOf(i17), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), 0L, Integer.valueOf(i4), Boolean.valueOf(z14));
                            k47Var = k47Var2;
                            a6aVar2.getNotificationCenter().k(22, Integer.valueOf(i17), Integer.valueOf(message3.id), message3, Long.valueOf(message3.dialog_id), 0L, Integer.valueOf(i4), Boolean.valueOf(z14));
                            a6aVar2.getMessagesStorage().a.c(new o3a(a6aVar2, z14, message3, i17, arrayList5, i4));
                            z7 = z14;
                        }
                    }
                    z = z6;
                    r5 = a6aVar2;
                    r6 = z7;
                } else {
                    k47Var = k47Var4;
                    a6a a6aVar7 = a6aVar4;
                    message3 = message5;
                    r6 = z9;
                    ik.c0(a6aVar7.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    z = true;
                    r5 = a6aVar7;
                }
                if (z) {
                    r5.getMessagesStorage().K0(r6, message3);
                    message3.send_state = 2;
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        jva.v(r5.currentAccount, false);
                        message3.errorAllowedPriceStars = jva.l(tLObject4);
                        message3.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                        jva.v(r5.currentAccount, false).d0(Arrays.asList(k47Var));
                        r5.getMessagesStorage().U1(k47.B0(message3), message3);
                    }
                    r5.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r5.c0(message3.id);
                    r5.h0(message3.id, r6);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v4a(a6a a6aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = k47Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
