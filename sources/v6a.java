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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class v6a implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ r7a b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.Message e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ r47 h;
    public final /* synthetic */ HashMap n;
    public final /* synthetic */ String r;
    public final /* synthetic */ TLObject s;

    public /* synthetic */ v6a(r7a r7aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = r7aVar;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = r47Var;
        this.r = str;
        this.n = hashMap;
        this.c = z;
        this.s = tLObject2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05bd  */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v82 */
    /* JADX WARN: Type inference failed for: r6v9, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        TLRPC.Message message2;
        r47 r47Var;
        TLRPC.Message message3;
        int i;
        ?? r6;
        boolean z;
        r7a r7aVar;
        String str;
        int i2;
        r47 r47Var2;
        int i3;
        boolean z2;
        int i4;
        ?? r5;
        int i5;
        r7a r7aVar2;
        int i6;
        boolean z3;
        boolean z4;
        String str2;
        ArrayList<TLRPC.Update> arrayList;
        ArrayList arrayList2;
        TLRPC.Updates updates;
        r7a r7aVar3;
        TLRPC.MessageReplyHeader messageReplyHeader;
        long j;
        zh6 zh6Var;
        TLRPC.Message message4;
        r7a r7aVar4;
        int i7;
        boolean z5;
        r7a r7aVar5;
        r7a r7aVar6;
        switch (this.a) {
            case 0:
                r7a r7aVar7 = this.b;
                TLRPC.TL_error tL_error = this.d;
                TLRPC.Message message5 = this.e;
                TLObject tLObject = this.f;
                r47 r47Var3 = this.h;
                String str3 = this.r;
                HashMap hashMap = this.n;
                boolean z6 = this.c;
                TLObject tLObject2 = this.s;
                if (tL_error != null) {
                    jj.c0(r7aVar7.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    r7aVar7.h0(message5.id, z6);
                    r7aVar7.k0(r47Var3);
                    break;
                } else {
                    String str4 = message5.attachPath;
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList3 = updates2.updates;
                    for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                        TLRPC.Update update = arrayList3.get(i8);
                        if (update instanceof TL_update.TL_updateEditMessage) {
                            message2 = ((TL_update.TL_updateEditMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateEditChannelMessage) {
                            message2 = ((TL_update.TL_updateEditChannelMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                            message2 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                        } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                            b19.f(r7aVar7.currentAccount).j(update, r47.J1(message5), r47.I1(message5));
                            message2 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                        }
                        message = message2;
                        if (message != null) {
                            in5.R(message);
                            r7aVar7.y0(r47Var3, message, message.id, Collections.singletonList(str3), false, -1, hashMap);
                        }
                        Utilities.d.c(new e5a(r7aVar7, updates2, message5, z6, (byte) 1));
                        break;
                    }
                    message = null;
                    if (message != null) {
                    }
                    Utilities.d.c(new e5a(r7aVar7, updates2, message5, z6, (byte) 1));
                }
            default:
                r7a r7aVar8 = this.b;
                boolean z7 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                TLRPC.Message message6 = this.e;
                TLObject tLObject3 = this.f;
                r47 r47Var4 = this.h;
                HashMap hashMap2 = this.n;
                String str5 = this.r;
                TLObject tLObject4 = this.s;
                if (tL_error2 == null) {
                    int i9 = message6.id;
                    ArrayList arrayList4 = new ArrayList();
                    boolean z8 = message6.date == 2147483646;
                    if (tLObject3 instanceof TLRPC.TL_updateShortSentMessage) {
                        TLRPC.TL_updateShortSentMessage tL_updateShortSentMessage = (TLRPC.TL_updateShortSentMessage) tLObject3;
                        i2 = i9;
                        r7aVar8.y0(r47Var4, null, tL_updateShortSentMessage.id, Collections.singletonList(null), false, -1, hashMap2);
                        r7a r7aVar9 = r7aVar8;
                        int o1 = r47Var4.o1();
                        int i10 = tL_updateShortSentMessage.id;
                        message6.id = i10;
                        message6.local_id = i10;
                        message6.date = tL_updateShortSentMessage.date;
                        message6.entities = tL_updateShortSentMessage.entities;
                        message6.out = tL_updateShortSentMessage.out;
                        if ((tL_updateShortSentMessage.flags & 33554432) != 0) {
                            message6.ttl_period = tL_updateShortSentMessage.ttl_period;
                            message6.flags |= 33554432;
                        }
                        TLRPC.MessageMedia messageMedia = tL_updateShortSentMessage.media;
                        if (messageMedia != null) {
                            message6.media = messageMedia;
                            message6.flags |= 512;
                            in5.R(message6);
                        }
                        TLRPC.MessageMedia messageMedia2 = tL_updateShortSentMessage.media;
                        if (((messageMedia2 instanceof TLRPC.TL_messageMediaGame) || (messageMedia2 instanceof TLRPC.TL_messageMediaInvoice)) && !TextUtils.isEmpty(tL_updateShortSentMessage.message)) {
                            message6.message = tL_updateShortSentMessage.message;
                        }
                        if (!message6.entities.isEmpty()) {
                            message6.flags |= 128;
                        }
                        Integer num = (Integer) r7aVar9.getMessagesController().Q.get(Long.valueOf(message6.dialog_id));
                        if (num == null) {
                            num = Integer.valueOf(r7aVar9.getMessagesStorage().S(message6.dialog_id, message6.out));
                            r7aVar9.getMessagesController().Q.put(Long.valueOf(message6.dialog_id), num);
                        }
                        message6.unread = num.intValue() < message6.id;
                        Utilities.d.c(new en9(r7aVar9, tL_updateShortSentMessage, (byte) 22));
                        arrayList4.add(message6);
                        i4 = o1;
                        r47Var2 = r47Var4;
                        i3 = 2;
                        z2 = false;
                        r7aVar6 = r7aVar9;
                    } else {
                        i2 = i9;
                        r7a r7aVar10 = r7aVar8;
                        if (tLObject3 instanceof TLRPC.Updates) {
                            TLRPC.Updates updates3 = (TLRPC.Updates) tLObject3;
                            ArrayList<TLRPC.Update> arrayList5 = updates3.updates;
                            ArrayList arrayList6 = new ArrayList();
                            boolean z9 = z7;
                            TLRPC.Updates updates4 = updates3;
                            TLRPC.Message message7 = null;
                            zh6 zh6Var2 = null;
                            int i11 = 0;
                            r7a r7aVar11 = r7aVar10;
                            while (i11 < arrayList5.size()) {
                                TLRPC.Update update2 = arrayList5.get(i11);
                                boolean z10 = z9;
                                if (update2 instanceof TL_update.TL_updateNewMessage) {
                                    TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update2;
                                    TLRPC.Message message8 = tL_updateNewMessage.message;
                                    str2 = str5;
                                    if (message8.action == null) {
                                        arrayList4.add(message8);
                                        Utilities.d.c(new h5a(r7aVar11, tL_updateNewMessage, (byte) 0));
                                        arrayList5.remove(i11);
                                        i11--;
                                        r7aVar3 = r7aVar11;
                                        arrayList = arrayList5;
                                        updates = updates4;
                                        z9 = z10;
                                        message7 = message8;
                                        arrayList2 = arrayList6;
                                        i11++;
                                        arrayList5 = arrayList;
                                        str5 = str2;
                                        arrayList6 = arrayList2;
                                        r7aVar11 = r7aVar3;
                                        updates4 = updates;
                                    }
                                    r7aVar3 = r7aVar11;
                                    arrayList = arrayList5;
                                    arrayList2 = arrayList6;
                                    updates = updates4;
                                } else {
                                    str2 = str5;
                                    if (update2 instanceof TL_update.TL_updateNewEphemeralMessage) {
                                        TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update2;
                                        message7 = o44.b(tL_updateNewEphemeralMessage.message);
                                        arrayList4.add(message7);
                                        arrayList6.add(tL_updateNewEphemeralMessage.message);
                                        arrayList5.remove(i11);
                                        i11--;
                                        r7aVar3 = r7aVar11;
                                        arrayList = arrayList5;
                                        arrayList2 = arrayList6;
                                        updates = updates4;
                                    } else {
                                        if (update2 instanceof TL_update.TL_updateNewChannelMessage) {
                                            TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update2;
                                            ArrayList arrayList7 = arrayList6;
                                            long S1 = uc7.S1(tL_updateNewChannelMessage);
                                            TLRPC.Chat M0 = r7aVar11.getMessagesController().M0(Long.valueOf(S1));
                                            if (!(M0 == null || M0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                                j = S1;
                                            } else {
                                                if (zh6Var2 == null) {
                                                    zh6Var2 = new zh6();
                                                }
                                                j = S1;
                                                long B0 = r47.B0(tL_updateNewChannelMessage.message);
                                                SparseArray sparseArray = (SparseArray) zh6Var2.f(B0);
                                                if (sparseArray == null) {
                                                    sparseArray = new SparseArray();
                                                    zh6Var2.k(B0, sparseArray);
                                                }
                                                TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                                int i12 = messageReplyHeader2.reply_to_top_id;
                                                if (i12 == 0) {
                                                    i12 = messageReplyHeader2.reply_to_msg_id;
                                                }
                                                TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray.get(i12);
                                                if (messageReplies == null) {
                                                    messageReplies = new TLRPC.TL_messageReplies();
                                                    sparseArray.put(i12, messageReplies);
                                                }
                                                TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                                if (peer != null) {
                                                    messageReplies.recent_repliers.add(0, peer);
                                                }
                                                messageReplies.replies++;
                                            }
                                            zh6 zh6Var3 = zh6Var2;
                                            TLRPC.Message message9 = tL_updateNewChannelMessage.message;
                                            arrayList4.add(message9);
                                            Utilities.d.c(new i5a(r7aVar11, tL_updateNewChannelMessage, (byte) 0));
                                            arrayList5.remove(i11);
                                            i11--;
                                            if (tL_updateNewChannelMessage.message.pinned) {
                                                updates = updates4;
                                                message4 = message9;
                                                arrayList = arrayList5;
                                                zh6Var = zh6Var3;
                                                long j2 = j;
                                                arrayList2 = arrayList7;
                                                Utilities.d.c(new j5a(r7aVar11, tL_updateNewChannelMessage, j2, (byte) 0));
                                            } else {
                                                updates = updates4;
                                                arrayList2 = arrayList7;
                                                zh6Var = zh6Var3;
                                                message4 = message9;
                                                arrayList = arrayList5;
                                            }
                                            r7aVar3 = r7aVar11;
                                            message7 = message4;
                                            zh6Var2 = zh6Var;
                                        } else {
                                            arrayList = arrayList5;
                                            arrayList2 = arrayList6;
                                            updates = updates4;
                                            if (update2 instanceof TL_update.TL_updateNewScheduledMessage) {
                                                TL_update.TL_updateNewScheduledMessage tL_updateNewScheduledMessage = (TL_update.TL_updateNewScheduledMessage) update2;
                                                int i13 = 0;
                                                while (true) {
                                                    if (i13 < arrayList4.size()) {
                                                        if (((TLRPC.Message) arrayList4.get(i13)).id == tL_updateNewScheduledMessage.message.id) {
                                                            arrayList4.remove(i13);
                                                        } else {
                                                            i13++;
                                                        }
                                                    }
                                                }
                                                message7 = tL_updateNewScheduledMessage.message;
                                                arrayList4.add(message7);
                                                arrayList.remove(i11);
                                                i11--;
                                                r7aVar3 = r7aVar11;
                                                z9 = true;
                                                i11++;
                                                arrayList5 = arrayList;
                                                str5 = str2;
                                                arrayList6 = arrayList2;
                                                r7aVar11 = r7aVar3;
                                                updates4 = updates;
                                            } else {
                                                if (update2 instanceof TL_update.TL_updateQuickReplyMessage) {
                                                    b19.f(r7aVar11.currentAccount).j(update2, r47.J1(r47Var4.k), r47.I1(r47Var4.k));
                                                    message7 = ((TL_update.TL_updateQuickReplyMessage) update2).message;
                                                    arrayList4.add(message7);
                                                    arrayList.remove(i11);
                                                    i11--;
                                                } else if (update2 instanceof TL_update.TL_updateDeleteScheduledMessages) {
                                                    TL_update.TL_updateDeleteScheduledMessages tL_updateDeleteScheduledMessages = (TL_update.TL_updateDeleteScheduledMessages) update2;
                                                    if (r47.B0(r47Var4.k) == wf3.n(tL_updateDeleteScheduledMessages.peer)) {
                                                        ArrayList<Integer> arrayList8 = tL_updateDeleteScheduledMessages.messages;
                                                        int size = arrayList8.size();
                                                        int i14 = 0;
                                                        r7a r7aVar12 = r7aVar11;
                                                        while (i14 < size) {
                                                            Integer num2 = arrayList8.get(i14);
                                                            i14++;
                                                            int intValue = num2.intValue();
                                                            ArrayList<Integer> arrayList9 = arrayList8;
                                                            r7a r7aVar13 = r7aVar12;
                                                            int i15 = 0;
                                                            while (true) {
                                                                if (i15 >= arrayList4.size()) {
                                                                    break;
                                                                } else if (((TLRPC.Message) arrayList4.get(i15)).id == intValue) {
                                                                    arrayList4.remove(i15);
                                                                } else {
                                                                    i15++;
                                                                }
                                                            }
                                                            arrayList8 = arrayList9;
                                                            r7aVar12 = r7aVar13;
                                                        }
                                                        r7aVar3 = r7aVar12;
                                                        arrayList.remove(i11);
                                                        i11--;
                                                    }
                                                }
                                                r7aVar3 = r7aVar11;
                                            }
                                        }
                                        z9 = false;
                                        i11++;
                                        arrayList5 = arrayList;
                                        str5 = str2;
                                        arrayList6 = arrayList2;
                                        r7aVar11 = r7aVar3;
                                        updates4 = updates;
                                    }
                                }
                                z9 = z10;
                                i11++;
                                arrayList5 = arrayList;
                                str5 = str2;
                                arrayList6 = arrayList2;
                                r7aVar11 = r7aVar3;
                                updates4 = updates;
                            }
                            r7a r7aVar14 = r7aVar11;
                            ArrayList arrayList10 = arrayList6;
                            boolean z11 = z9;
                            String str6 = str5;
                            TLRPC.Updates updates5 = updates4;
                            ArrayList<TLRPC.Update> arrayList11 = arrayList5;
                            if (arrayList10.isEmpty()) {
                                r5 = 1;
                            } else {
                                r5 = 1;
                                r7aVar14.getMessagesStorage().c1(arrayList10, true);
                            }
                            if (zh6Var2 != null) {
                                r7aVar14.getMessagesStorage().X0(null, null, zh6Var2, r5);
                                jn7 notificationCenter = r7aVar14.getNotificationCenter();
                                Object[] objArr = new Object[4];
                                objArr[0] = null;
                                objArr[r5] = null;
                                i5 = 2;
                                objArr[2] = zh6Var2;
                                objArr[3] = Boolean.TRUE;
                                notificationCenter.k(78, objArr);
                            } else {
                                i5 = 2;
                            }
                            if (message7 != null) {
                                r47.B0(message7);
                                if (z8 && message7.date != 2147483646) {
                                    z11 = false;
                                }
                                in5.R(message7);
                                if (!z11) {
                                    Integer num3 = (Integer) r7aVar14.getMessagesController().Q.get(Long.valueOf(message7.dialog_id));
                                    if (num3 == null) {
                                        num3 = Integer.valueOf(r7aVar14.getMessagesStorage().S(message7.dialog_id, message7.out));
                                        r7aVar14.getMessagesController().Q.put(Long.valueOf(message7.dialog_id), num3);
                                    }
                                    message7.unread = num3.intValue() < message7.id;
                                }
                                TLRPC.Message message10 = r47Var4.k;
                                message10.post_author = message7.post_author;
                                if ((message7.flags & 33554432) != 0) {
                                    message10.ttl_period = message7.ttl_period;
                                    message10.flags |= 33554432;
                                }
                                message10.entities = message7.entities;
                                int i16 = message7.quick_reply_shortcut_id;
                                message10.quick_reply_shortcut_id = i16;
                                if (i16 != 0) {
                                    message10.flags |= TLObject.FLAG_30;
                                }
                                TLRPC.Message message11 = message7;
                                i3 = i5;
                                r7aVar14.y0(r47Var4, message11, message7.id, Collections.singletonList(str6), false, -1, hashMap2);
                                r47Var2 = r47Var4;
                                r7aVar2 = r7aVar14;
                                i6 = r47Var2.o1();
                                message6.id = message11.id;
                                z3 = false;
                            } else {
                                r47Var2 = r47Var4;
                                i3 = i5;
                                r7aVar2 = r7aVar14;
                                if (f11.a) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i17 = 0; i17 < arrayList11.size(); i17++) {
                                        sb.append(arrayList11.get(i17).getClass().getSimpleName());
                                        sb.append(", ");
                                    }
                                    cc4.b("can't find message in updates " + ((Object) sb));
                                }
                                i6 = 0;
                                z3 = true;
                            }
                            Utilities.d.c(new k5a(r7aVar2, updates5, (byte) 0));
                            i4 = i6;
                            z4 = z3;
                            z2 = z11;
                            r7aVar4 = r7aVar2;
                            if (!(r47.n1(message6) instanceof TLRPC.TL_messageMediaGeoLive) && message6.via_bot_id == 0 && TextUtils.isEmpty(message6.via_bot_name)) {
                                id6 locationController = r7aVar4.getLocationController();
                                ArrayList arrayList12 = locationController.b;
                                zh6 zh6Var4 = locationController.a;
                                hd6 hd6Var = new hd6();
                                i = i3;
                                r47Var = r47Var2;
                                hd6Var.a = message6.dialog_id;
                                hd6Var.b = message6.id;
                                TLRPC.MessageMedia messageMedia3 = message6.media;
                                hd6Var.d = messageMedia3.period;
                                int i18 = messageMedia3.proximity_notification_radius;
                                hd6Var.f = i18;
                                hd6Var.g = i18;
                                int i19 = locationController.currentAccount;
                                hd6Var.e = i19;
                                hd6Var.h = new r47(i19, message6, false, false);
                                if (hd6Var.d == Integer.MAX_VALUE) {
                                    hd6Var.c = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                } else {
                                    hd6Var.c = locationController.getConnectionsManager().getCurrentTime() + hd6Var.d;
                                }
                                hd6 hd6Var2 = (hd6) zh6Var4.f(hd6Var.a);
                                i7 = i4;
                                zh6Var4.k(hd6Var.a, hd6Var);
                                if (hd6Var2 != null) {
                                    arrayList12.remove(hd6Var2);
                                }
                                arrayList12.add(hd6Var);
                                locationController.l(hd6Var, 0);
                                locationController.w = SystemClock.elapsedRealtime() - 25000;
                                hl.c3(new ls5(locationController, hd6Var2, hd6Var, (byte) 20));
                            } else {
                                i = i3;
                                r47Var = r47Var2;
                                i7 = i4;
                            }
                            if (z4) {
                                r7aVar4.getStatsController().i(a.f(), 1, 1);
                                message6.send_state = 0;
                                message6.errorNewPriceStars = 0L;
                                message6.errorAllowedPriceStars = 0L;
                                if (z7 != z2) {
                                    ArrayList arrayList13 = new ArrayList();
                                    arrayList13.add(Integer.valueOf(i2));
                                    ArrayList arrayList14 = new ArrayList();
                                    r47 r47Var5 = r47Var;
                                    arrayList14.add(new r47(r47Var5.K1, r47Var5.k, true, true));
                                    z5 = z7;
                                    message3 = message6;
                                    r7aVar4.getMessagesStorage().a.c(new le1(r7aVar4, arrayList4, z7, z2, message6, arrayList13, arrayList14, i2));
                                    r7aVar5 = r7aVar4;
                                } else {
                                    boolean z12 = z7;
                                    message3 = message6;
                                    int i20 = i2;
                                    jn7 notificationCenter2 = r7aVar4.getNotificationCenter();
                                    Integer valueOf = Integer.valueOf(i20);
                                    Integer valueOf2 = Integer.valueOf(message3.id);
                                    Long valueOf3 = Long.valueOf(message3.dialog_id);
                                    Integer valueOf4 = Integer.valueOf(i7);
                                    Boolean valueOf5 = Boolean.valueOf(z12);
                                    Object[] objArr2 = new Object[7];
                                    objArr2[0] = valueOf;
                                    objArr2[1] = valueOf2;
                                    objArr2[i] = message3;
                                    objArr2[3] = valueOf3;
                                    objArr2[4] = 0L;
                                    objArr2[5] = valueOf4;
                                    objArr2[6] = valueOf5;
                                    notificationCenter2.k(21, objArr2);
                                    jn7 notificationCenter3 = r7aVar4.getNotificationCenter();
                                    Integer valueOf6 = Integer.valueOf(i20);
                                    Integer valueOf7 = Integer.valueOf(message3.id);
                                    r7a r7aVar15 = r7aVar4;
                                    Long valueOf8 = Long.valueOf(message3.dialog_id);
                                    Integer valueOf9 = Integer.valueOf(i7);
                                    Boolean valueOf10 = Boolean.valueOf(z12);
                                    Object[] objArr3 = new Object[7];
                                    objArr3[0] = valueOf6;
                                    objArr3[1] = valueOf7;
                                    objArr3[i] = message3;
                                    objArr3[3] = valueOf8;
                                    objArr3[4] = 0L;
                                    objArr3[5] = valueOf9;
                                    objArr3[6] = valueOf10;
                                    notificationCenter3.k(22, objArr3);
                                    r7a r7aVar16 = r7aVar15;
                                    r7aVar15.getMessagesStorage().a.c(new l5a(r7aVar16, z12, message3, i20, arrayList4, i7));
                                    r7aVar5 = r7aVar16;
                                    z5 = z12;
                                }
                            } else {
                                z5 = z7;
                                message3 = message6;
                                r7aVar5 = r7aVar4;
                            }
                            z = z4;
                            r7aVar = r7aVar5;
                            r6 = z5;
                        } else {
                            r47Var2 = r47Var4;
                            i3 = 2;
                            z2 = z7;
                            i4 = 0;
                            r7aVar6 = r7aVar10;
                        }
                    }
                    z4 = false;
                    r7aVar4 = r7aVar6;
                    if (!(r47.n1(message6) instanceof TLRPC.TL_messageMediaGeoLive)) {
                    }
                    i = i3;
                    r47Var = r47Var2;
                    i7 = i4;
                    if (z4) {
                    }
                    z = z4;
                    r7aVar = r7aVar5;
                    r6 = z5;
                } else {
                    r47Var = r47Var4;
                    r7a r7aVar17 = r7aVar8;
                    message3 = message6;
                    i = 2;
                    r6 = z7;
                    jj.c0(r7aVar17.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    z = true;
                    r7aVar = r7aVar17;
                }
                if (z) {
                    r7aVar.getMessagesStorage().K0(r6, message3);
                    message3.send_state = i;
                    if (tL_error2 != null && (str = tL_error2.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                        jxa.v(r7aVar.currentAccount, false);
                        message3.errorAllowedPriceStars = jxa.l(tLObject4);
                        message3.errorNewPriceStars = Long.parseLong(tL_error2.text.substring(23));
                        jxa.v(r7aVar.currentAccount, false).e0(Arrays.asList(r47Var));
                        r7aVar.getMessagesStorage().U1(r47.B0(message3), message3);
                    }
                    r7aVar.getNotificationCenter().k(23, Integer.valueOf(message3.id));
                    r7aVar.c0(message3.id);
                    r7aVar.h0(message3.id, r6);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ v6a(r7a r7aVar, boolean z, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, r47 r47Var, HashMap hashMap, String str, TLObject tLObject2) {
        this.b = r7aVar;
        this.c = z;
        this.d = tL_error;
        this.e = message;
        this.f = tLObject;
        this.h = r47Var;
        this.n = hashMap;
        this.r = str;
        this.s = tLObject2;
    }
}
