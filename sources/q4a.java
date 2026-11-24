// default package

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class q4a implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ q4a(hh2 hh2Var, TLRPC.TL_error tL_error, TLObject tLObject, int[] iArr, ArrayList arrayList, boolean z, TLRPC.User user) {
        this.b = hh2Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = iArr;
        this.h = arrayList;
        this.e = z;
        this.n = user;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v88 */
    /* JADX WARN: Type inference failed for: r5v89 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r5;
        int i;
        boolean z;
        a6a a6aVar;
        String str;
        int i2;
        int i3;
        boolean z2;
        TLRPC.Updates updates;
        a6a a6aVar2;
        TLRPC.Message message;
        vh6 vh6Var;
        final int[] iArr;
        int i4;
        final k47 k47Var;
        ArrayList arrayList;
        final SparseArray sparseArray;
        TLRPC.Updates updates2;
        a6a a6aVar3;
        TLRPC.Message message2;
        ArrayList arrayList2;
        boolean z3;
        TLRPC.Updates updates3;
        a6a a6aVar4;
        vh6 vh6Var2;
        ArrayList<TLRPC.Update> arrayList3;
        ArrayList arrayList4;
        int i5;
        String J1;
        TLRPC.MessageReplyHeader messageReplyHeader;
        int i6;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                a6a a6aVar5 = (a6a) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                boolean z5 = this.e;
                ArrayList arrayList7 = (ArrayList) this.h;
                ArrayList arrayList8 = (ArrayList) this.n;
                TLObject tLObject2 = (TLObject) this.f;
                if (tL_error == null) {
                    SparseArray sparseArray2 = new SparseArray();
                    vh6 vh6Var3 = new vh6();
                    TLRPC.Updates updates4 = (TLRPC.Updates) tLObject;
                    ArrayList<TLRPC.Update> arrayList9 = updates4.updates;
                    ArrayList arrayList10 = new ArrayList();
                    vh6 vh6Var4 = null;
                    final boolean z6 = z5;
                    i = 2;
                    int i7 = 0;
                    a6a a6aVar6 = a6aVar5;
                    while (i7 < arrayList9.size()) {
                        TLRPC.Update update = arrayList9.get(i7);
                        if (update instanceof TL_update.TL_updateMessageID) {
                            TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) update;
                            vh6Var3.k(Integer.valueOf(tL_updateMessageID.id), tL_updateMessageID.random_id);
                            arrayList9.remove(i7);
                            i7--;
                            z3 = z4;
                            updates3 = updates4;
                            vh6Var2 = vh6Var3;
                            arrayList3 = arrayList9;
                            arrayList4 = arrayList10;
                            a6aVar4 = a6aVar6;
                        } else {
                            boolean z7 = z4;
                            a6a a6aVar7 = a6aVar6;
                            if (update instanceof TL_update.TL_updateNewMessage) {
                                TL_update.TL_updateNewMessage tL_updateNewMessage = (TL_update.TL_updateNewMessage) update;
                                TLRPC.Message message3 = tL_updateNewMessage.message;
                                sparseArray2.put(message3.id, message3);
                                z3 = z7;
                                updates3 = updates4;
                                Utilities.d.c(new d5a(a6aVar7, tL_updateNewMessage, (byte) 0));
                                arrayList9.remove(i7);
                                i7--;
                                a6aVar4 = a6aVar7;
                                vh6Var2 = vh6Var3;
                                arrayList3 = arrayList9;
                                arrayList4 = arrayList10;
                            } else {
                                z3 = z7;
                                updates3 = updates4;
                                if (update instanceof TL_update.TL_updateNewEphemeralMessage) {
                                    TL_update.TL_updateNewEphemeralMessage tL_updateNewEphemeralMessage = (TL_update.TL_updateNewEphemeralMessage) update;
                                    TLRPC.TL_message b = d54.b(tL_updateNewEphemeralMessage.message);
                                    sparseArray2.put(b.id, b);
                                    arrayList10.add(tL_updateNewEphemeralMessage.message);
                                    arrayList9.remove(i7);
                                    i7--;
                                    a6aVar4 = a6aVar7;
                                    vh6Var2 = vh6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                } else if (update instanceof TL_update.TL_updateNewChannelMessage) {
                                    TL_update.TL_updateNewChannelMessage tL_updateNewChannelMessage = (TL_update.TL_updateNewChannelMessage) update;
                                    long R1 = oc7.R1(tL_updateNewChannelMessage);
                                    TLRPC.Chat L0 = a6aVar7.getMessagesController().L0(Long.valueOf(R1));
                                    if ((L0 != null && !L0.megagroup) || (messageReplyHeader = tL_updateNewChannelMessage.message.reply_to) == null || (messageReplyHeader.reply_to_top_id == 0 && messageReplyHeader.reply_to_msg_id == 0)) {
                                        vh6Var2 = vh6Var3;
                                    } else {
                                        if (vh6Var4 == null) {
                                            vh6Var4 = new vh6();
                                        }
                                        long B0 = k47.B0(tL_updateNewChannelMessage.message);
                                        SparseArray sparseArray3 = (SparseArray) vh6Var4.f(B0);
                                        if (sparseArray3 == null) {
                                            sparseArray3 = new SparseArray();
                                            vh6Var4.k(sparseArray3, B0);
                                        }
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = tL_updateNewChannelMessage.message.reply_to;
                                        int i8 = messageReplyHeader2.reply_to_top_id;
                                        if (i8 == 0) {
                                            i8 = messageReplyHeader2.reply_to_msg_id;
                                        }
                                        TLRPC.MessageReplies messageReplies = (TLRPC.MessageReplies) sparseArray3.get(i8);
                                        if (messageReplies == null) {
                                            messageReplies = new TLRPC.TL_messageReplies();
                                            sparseArray3.put(i8, messageReplies);
                                        }
                                        TLRPC.Peer peer = tL_updateNewChannelMessage.message.from_id;
                                        if (peer != null) {
                                            vh6Var2 = vh6Var3;
                                            messageReplies.recent_repliers.add(0, peer);
                                        } else {
                                            vh6Var2 = vh6Var3;
                                        }
                                        messageReplies.replies++;
                                    }
                                    TLRPC.Message message4 = tL_updateNewChannelMessage.message;
                                    sparseArray2.put(message4.id, message4);
                                    Utilities.d.c(new e5a(a6aVar7, tL_updateNewChannelMessage, (byte) 0));
                                    arrayList9.remove(i7);
                                    int i9 = i7 - 1;
                                    if (tL_updateNewChannelMessage.message.pinned) {
                                        arrayList5 = arrayList10;
                                        arrayList3 = arrayList9;
                                        i6 = i9;
                                        a6aVar4 = a6aVar7;
                                        Utilities.d.c(new m3a(a6aVar7, tL_updateNewChannelMessage, R1, (byte) 1));
                                    } else {
                                        a6aVar4 = a6aVar7;
                                        i6 = i9;
                                        arrayList3 = arrayList9;
                                        arrayList5 = arrayList10;
                                    }
                                    arrayList4 = arrayList5;
                                    i7 = i6;
                                } else {
                                    a6aVar4 = a6aVar7;
                                    vh6Var2 = vh6Var3;
                                    arrayList3 = arrayList9;
                                    arrayList4 = arrayList10;
                                    if (update instanceof TL_update.TL_updateNewScheduledMessage) {
                                        TLRPC.Message message5 = ((TL_update.TL_updateNewScheduledMessage) update).message;
                                        sparseArray2.put(message5.id, message5);
                                        arrayList3.remove(i7);
                                        i7--;
                                        z6 = z3;
                                    } else if (update instanceof TL_update.TL_updateQuickReplyMessage) {
                                        pz8 f = pz8.f(a6aVar4.currentAccount);
                                        if (arrayList7.isEmpty()) {
                                            i5 = 0;
                                            J1 = null;
                                        } else {
                                            i5 = 0;
                                            J1 = k47.J1(((k47) arrayList7.get(0)).k);
                                        }
                                        f.j(update, J1, (arrayList7.isEmpty() ? null : Integer.valueOf(k47.I1(((k47) arrayList7.get(i5)).k))).intValue());
                                        TLRPC.Message message6 = ((TL_update.TL_updateQuickReplyMessage) update).message;
                                        sparseArray2.put(message6.id, message6);
                                        arrayList3.remove(i7);
                                        i7--;
                                        a6aVar4 = a6aVar4;
                                    }
                                }
                            }
                            z6 = false;
                        }
                        i7++;
                        arrayList9 = arrayList3;
                        arrayList10 = arrayList4;
                        updates4 = updates3;
                        z4 = z3;
                        vh6Var3 = vh6Var2;
                        a6aVar6 = a6aVar4;
                    }
                    boolean z8 = z4;
                    TLRPC.Updates updates5 = updates4;
                    vh6 vh6Var5 = vh6Var3;
                    ArrayList arrayList11 = arrayList10;
                    if (arrayList11.isEmpty()) {
                        i2 = z8;
                    } else {
                        boolean z9 = z8;
                        a6aVar6.getMessagesStorage().c1(arrayList11, z9);
                        i2 = z9;
                    }
                    char c = 3;
                    char c2 = 4;
                    if (vh6Var4 != null) {
                        a6aVar6.getMessagesStorage().X0(null, null, vh6Var4, i2);
                        nm7 notificationCenter = a6aVar6.getNotificationCenter();
                        Object[] objArr = new Object[4];
                        i3 = 0;
                        objArr[0] = null;
                        objArr[i2] = null;
                        objArr[2] = vh6Var4;
                        objArr[3] = Boolean.TRUE;
                        notificationCenter.k(78, objArr);
                    } else {
                        i3 = 0;
                    }
                    int[] iArr2 = new int[i2];
                    vh6 vh6Var6 = vh6Var5;
                    iArr2[i3] = i3;
                    final int[] iArr3 = {i3};
                    final ArrayList arrayList12 = new ArrayList();
                    int i10 = 0;
                    a6a a6aVar8 = a6aVar6;
                    while (i10 < arrayList7.size()) {
                        k47 k47Var2 = (k47) arrayList7.get(i10);
                        String str2 = (String) arrayList8.get(i10);
                        final TLRPC.Message message7 = k47Var2.k;
                        char c3 = c;
                        final int i11 = message7.id;
                        char c4 = c2;
                        final ArrayList arrayList13 = new ArrayList();
                        a6a a6aVar9 = a6aVar8;
                        Integer num = (Integer) vh6Var6.f(message7.random_id);
                        if (num == null || (message = (TLRPC.Message) sparseArray2.get(num.intValue())) == null) {
                            z2 = z5;
                            updates = updates5;
                            a6aVar2 = a6aVar9;
                            z = true;
                            Utilities.d.c(new n3a(a6aVar2, updates, (byte) 1));
                            a6aVar = a6aVar2;
                            r5 = z2;
                        } else {
                            k47.B0(message);
                            arrayList13.add(message);
                            if ((message.flags & 33554432) != 0) {
                                TLRPC.Message message8 = k47Var2.k;
                                message8.ttl_period = message.ttl_period;
                                message8.flags |= 33554432;
                            }
                            if (tLObject2 instanceof TLRPC.TL_messages_sendMedia) {
                                k47 k47Var3 = (k47) arrayList7.get(0);
                                int i12 = i10;
                                int i13 = message.id;
                                k47Var = k47Var2;
                                ArrayList arrayList14 = arrayList8;
                                sparseArray = sparseArray2;
                                HashMap<String, String> hashMap = message.params;
                                vh6Var = vh6Var6;
                                iArr = iArr2;
                                updates2 = updates5;
                                i4 = i12;
                                message2 = message;
                                a6aVar3 = a6aVar9;
                                arrayList2 = arrayList12;
                                a6aVar3.y0(k47Var3, message2, i13, arrayList14, false, -1, hashMap);
                                arrayList = arrayList14;
                            } else {
                                vh6Var = vh6Var6;
                                iArr = iArr2;
                                i4 = i10;
                                k47Var = k47Var2;
                                arrayList = arrayList8;
                                sparseArray = sparseArray2;
                                updates2 = updates5;
                                a6aVar3 = a6aVar9;
                                message2 = message;
                                arrayList2 = arrayList12;
                                a6aVar3.y0(k47Var, message2, message2.id, Collections.singletonList(str2), false, -1, message2.params);
                            }
                            final int o1 = k47Var.o1();
                            message7.id = message2.id;
                            int i14 = message2.quick_reply_shortcut_id;
                            message7.quick_reply_shortcut_id = i14;
                            if (i14 != 0) {
                                message7.flags |= TLObject.FLAG_30;
                            }
                            final long j = message2.grouped_id;
                            if (!z5) {
                                Integer num2 = (Integer) a6aVar3.getMessagesController().Q.get(Long.valueOf(message2.dialog_id));
                                if (num2 == null) {
                                    num2 = Integer.valueOf(a6aVar3.getMessagesStorage().S(message2.dialog_id, message2.out));
                                    a6aVar3.getMessagesController().Q.put(Long.valueOf(message2.dialog_id), num2);
                                }
                                message2.unread = num2.intValue() < message2.id;
                            }
                            iArr[0] = iArr[0] + 1;
                            arrayList2.add(Integer.valueOf(i11));
                            a6aVar3.getStatsController().i(a.f(), 1, 1);
                            message7.send_state = 0;
                            message7.errorAllowedPriceStars = 0L;
                            message7.errorNewPriceStars = 0L;
                            nm7 notificationCenter2 = a6aVar3.getNotificationCenter();
                            Integer valueOf = Integer.valueOf(i11);
                            Integer valueOf2 = Integer.valueOf(message7.id);
                            Long valueOf3 = Long.valueOf(message7.dialog_id);
                            Long valueOf4 = Long.valueOf(j);
                            Integer valueOf5 = Integer.valueOf(o1);
                            Boolean valueOf6 = Boolean.valueOf(z6);
                            arrayList12 = arrayList2;
                            final a6a a6aVar10 = a6aVar3;
                            Object[] objArr2 = new Object[7];
                            objArr2[0] = valueOf;
                            objArr2[1] = valueOf2;
                            objArr2[2] = message7;
                            objArr2[c3] = valueOf3;
                            objArr2[c4] = valueOf4;
                            objArr2[5] = valueOf5;
                            objArr2[6] = valueOf6;
                            notificationCenter2.k(21, objArr2);
                            nm7 notificationCenter3 = a6aVar10.getNotificationCenter();
                            Integer valueOf7 = Integer.valueOf(i11);
                            Integer valueOf8 = Integer.valueOf(message7.id);
                            Long valueOf9 = Long.valueOf(message7.dialog_id);
                            Long valueOf10 = Long.valueOf(j);
                            Integer valueOf11 = Integer.valueOf(o1);
                            Boolean valueOf12 = Boolean.valueOf(z6);
                            Object[] objArr3 = new Object[7];
                            objArr3[0] = valueOf7;
                            objArr3[1] = valueOf8;
                            objArr3[2] = message7;
                            objArr3[c3] = valueOf9;
                            objArr3[c4] = valueOf10;
                            objArr3[5] = valueOf11;
                            objArr3[6] = valueOf12;
                            notificationCenter3.k(22, objArr3);
                            mp3 mp3Var = a6aVar10.getMessagesStorage().a;
                            final boolean z10 = z5;
                            a6aVar8 = a6aVar10;
                            mp3Var.c(new Runnable() { // from class: f5a
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
                                /* JADX WARN: Type inference failed for: r1v2 */
                                /* JADX WARN: Type inference failed for: r1v5 */
                                /* JADX WARN: Type inference failed for: r1v6 */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void run() {
                                    ?? r1;
                                    boolean z11;
                                    final TLRPC.Message message9 = message7;
                                    boolean c5 = k47.c5(message9);
                                    final boolean z12 = z6;
                                    if (c5) {
                                        r1 = 9;
                                    } else {
                                        if (message9.quick_reply_shortcut_id == 0 && message9.quick_reply_shortcut == null) {
                                            z11 = z12;
                                            final a6a a6aVar11 = a6a.this;
                                            cf7 messagesStorage = a6aVar11.getMessagesStorage();
                                            long j2 = message9.random_id;
                                            long B1 = k47.B1(message9.peer_id);
                                            final int i15 = i11;
                                            boolean z13 = z11;
                                            messagesStorage.X1(j2, B1, Integer.valueOf(i15), message9.id, 0, z13 ? 1 : 0, message9.quick_reply_shortcut_id);
                                            a6aVar11.getMessagesStorage().g1(arrayList13, true, false, false, 0, false, z13 ? 1 : 0, message9.quick_reply_shortcut_id);
                                            if (k47.e3(message9)) {
                                                long B12 = k47.B1(message9.peer_id);
                                                ArrayList arrayList15 = new ArrayList(1);
                                                arrayList15.add(Integer.valueOf(message9.id));
                                                a6aVar11.getMessagesStorage().M0(B12, arrayList15, false, false, z13 ? 1 : 0, (int) k47.Z1(a6aVar11.currentAccount, message9, 0));
                                                a6aVar11.getMessagesStorage().O1(B12, -B12, arrayList15, null);
                                                gm.c3(new s3a(a6aVar11, B12, arrayList15, (byte) 1));
                                            }
                                            final int[] iArr4 = iArr3;
                                            final int[] iArr5 = iArr;
                                            final boolean z14 = z10;
                                            final k47 k47Var4 = k47Var;
                                            final SparseArray sparseArray4 = sparseArray;
                                            final ArrayList arrayList16 = arrayList12;
                                            final long j3 = j;
                                            final int i16 = o1;
                                            gm.c3(new Runnable() { // from class: b4a
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    boolean z15;
                                                    int i17;
                                                    int[] iArr6 = iArr4;
                                                    int i18 = iArr6[0] + 1;
                                                    iArr6[0] = i18;
                                                    int i19 = iArr5[0];
                                                    a6a a6aVar12 = a6a.this;
                                                    boolean z16 = z14;
                                                    boolean z17 = z12;
                                                    if (i18 != i19 || z16 == z17) {
                                                        z15 = z17;
                                                    } else {
                                                        long B02 = k47.B0(k47Var4.k);
                                                        if (z17) {
                                                            SparseArray sparseArray5 = sparseArray4;
                                                            if (sparseArray5.size() > 1) {
                                                                i17 = sparseArray5.keyAt(0);
                                                                z15 = z17;
                                                                a6aVar12.getMessagesController().X(arrayList16, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                            }
                                                        }
                                                        i17 = 0;
                                                        z15 = z17;
                                                        a6aVar12.getMessagesController().X(arrayList16, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                    }
                                                    hs6 mediaDataController = a6aVar12.getMediaDataController();
                                                    TLRPC.Message message10 = message9;
                                                    mediaDataController.x0(message10.dialog_id);
                                                    nm7 notificationCenter4 = a6aVar12.getNotificationCenter();
                                                    int i20 = i15;
                                                    Integer valueOf13 = Integer.valueOf(i20);
                                                    Integer valueOf14 = Integer.valueOf(message10.id);
                                                    Long valueOf15 = Long.valueOf(message10.dialog_id);
                                                    long j4 = j3;
                                                    Long valueOf16 = Long.valueOf(j4);
                                                    int i21 = i16;
                                                    notificationCenter4.k(nm7.J, valueOf13, valueOf14, message10, valueOf15, valueOf16, Integer.valueOf(i21), Boolean.valueOf(z15));
                                                    a6aVar12.getNotificationCenter().k(nm7.K, Integer.valueOf(i20), Integer.valueOf(message10.id), message10, Long.valueOf(message10.dialog_id), Long.valueOf(j4), Integer.valueOf(i21), Boolean.valueOf(z15));
                                                    a6aVar12.c0(i20);
                                                    a6aVar12.h0(i20, z16);
                                                }
                                            });
                                        }
                                        r1 = 5;
                                    }
                                    z11 = r1;
                                    final a6a a6aVar112 = a6a.this;
                                    cf7 messagesStorage2 = a6aVar112.getMessagesStorage();
                                    long j22 = message9.random_id;
                                    long B13 = k47.B1(message9.peer_id);
                                    final int i152 = i11;
                                    boolean z132 = z11;
                                    messagesStorage2.X1(j22, B13, Integer.valueOf(i152), message9.id, 0, z132 ? 1 : 0, message9.quick_reply_shortcut_id);
                                    a6aVar112.getMessagesStorage().g1(arrayList13, true, false, false, 0, false, z132 ? 1 : 0, message9.quick_reply_shortcut_id);
                                    if (k47.e3(message9)) {
                                    }
                                    final int[] iArr42 = iArr3;
                                    final int[] iArr52 = iArr;
                                    final boolean z142 = z10;
                                    final k47 k47Var42 = k47Var;
                                    final SparseArray sparseArray42 = sparseArray;
                                    final ArrayList arrayList162 = arrayList12;
                                    final long j32 = j;
                                    final int i162 = o1;
                                    gm.c3(new Runnable() { // from class: b4a
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            boolean z15;
                                            int i17;
                                            int[] iArr6 = iArr42;
                                            int i18 = iArr6[0] + 1;
                                            iArr6[0] = i18;
                                            int i19 = iArr52[0];
                                            a6a a6aVar12 = a6a.this;
                                            boolean z16 = z142;
                                            boolean z17 = z12;
                                            if (i18 != i19 || z16 == z17) {
                                                z15 = z17;
                                            } else {
                                                long B02 = k47.B0(k47Var42.k);
                                                if (z17) {
                                                    SparseArray sparseArray5 = sparseArray42;
                                                    if (sparseArray5.size() > 1) {
                                                        i17 = sparseArray5.keyAt(0);
                                                        z15 = z17;
                                                        a6aVar12.getMessagesController().X(arrayList162, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                                    }
                                                }
                                                i17 = 0;
                                                z15 = z17;
                                                a6aVar12.getMessagesController().X(arrayList162, null, null, B02, false, z16 ? 1 : 0, false, 0L, null, 0, (z15 || z16) ? false : true, i17);
                                            }
                                            hs6 mediaDataController = a6aVar12.getMediaDataController();
                                            TLRPC.Message message10 = message9;
                                            mediaDataController.x0(message10.dialog_id);
                                            nm7 notificationCenter4 = a6aVar12.getNotificationCenter();
                                            int i20 = i152;
                                            Integer valueOf13 = Integer.valueOf(i20);
                                            Integer valueOf14 = Integer.valueOf(message10.id);
                                            Long valueOf15 = Long.valueOf(message10.dialog_id);
                                            long j4 = j32;
                                            Long valueOf16 = Long.valueOf(j4);
                                            int i21 = i162;
                                            notificationCenter4.k(nm7.J, valueOf13, valueOf14, message10, valueOf15, valueOf16, Integer.valueOf(i21), Boolean.valueOf(z15));
                                            a6aVar12.getNotificationCenter().k(nm7.K, Integer.valueOf(i20), Integer.valueOf(message10.id), message10, Long.valueOf(message10.dialog_id), Long.valueOf(j4), Integer.valueOf(i21), Boolean.valueOf(z15));
                                            a6aVar12.c0(i20);
                                            a6aVar12.h0(i20, z16);
                                        }
                                    });
                                }
                            });
                            i10 = i4 + 1;
                            z5 = z10;
                            updates5 = updates2;
                            iArr2 = iArr;
                            sparseArray2 = sparseArray;
                            c = c3;
                            c2 = c4;
                            vh6Var6 = vh6Var;
                            arrayList8 = arrayList;
                        }
                    }
                    z2 = z5;
                    updates = updates5;
                    z = false;
                    a6aVar2 = a6aVar8;
                    Utilities.d.c(new n3a(a6aVar2, updates, (byte) 1));
                    a6aVar = a6aVar2;
                    r5 = z2;
                } else {
                    r5 = z5;
                    i = 2;
                    ik.c0(a6aVar5.currentAccount, tL_error, null, tLObject2, new Object[0]);
                    z = true;
                    a6aVar = a6aVar5;
                }
                if (z) {
                    int i15 = 0;
                    while (i15 < arrayList7.size()) {
                        k47 k47Var4 = (k47) arrayList7.get(i15);
                        TLRPC.Message message9 = k47Var4.k;
                        a6aVar.getMessagesStorage().K0(r5, message9);
                        int i16 = i;
                        message9.send_state = i16;
                        if (r5 == 0 && tL_error != null && (str = tL_error.text) != null && str.startsWith("ALLOW_PAYMENT_REQUIRED_")) {
                            jva.v(a6aVar.currentAccount, false);
                            message9.errorAllowedPriceStars = jva.l(tLObject2);
                            message9.errorNewPriceStars = Long.parseLong(tL_error.text.substring(23));
                            jva.v(a6aVar.currentAccount, false).d0(Arrays.asList(k47Var4));
                            a6aVar.getMessagesStorage().U1(k47.B0(message9), message9);
                        }
                        a6aVar.getNotificationCenter().k(23, Integer.valueOf(message9.id));
                        a6aVar.c0(message9.id);
                        a6aVar.h0(message9.id, r5);
                        i15++;
                        i = i16;
                    }
                    break;
                }
                break;
            case 1:
                a6a a6aVar11 = (a6a) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLRPC.Message message10 = (TLRPC.Message) this.h;
                TLObject tLObject3 = (TLObject) this.d;
                k47 k47Var5 = (k47) this.n;
                boolean z11 = this.e;
                TLObject tLObject4 = (TLObject) this.f;
                if (tL_error2 != null) {
                    ik.c0(a6aVar11.currentAccount, tL_error2, null, tLObject4, new Object[0]);
                    a6aVar11.h0(message10.id, z11);
                    a6aVar11.k0(k47Var5);
                    break;
                } else {
                    String str3 = message10.attachPath;
                    TLRPC.Updates updates6 = (TLRPC.Updates) tLObject3;
                    ArrayList<TLRPC.Update> arrayList15 = updates6.updates;
                    message10.send_state = 0;
                    ArrayList arrayList16 = new ArrayList();
                    arrayList16.add(message10);
                    a6aVar11.getMessagesStorage().g1(arrayList16, false, true, false, 0, false, 0, 0L);
                    qwb qwbVar = a6aVar11.getMessagesController().g4;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) qwbVar.e.f(qwb.p(message10.id, -message10.dialog_id));
                    if (tL_forumTopic != null) {
                        tL_forumTopic.topMessage = message10;
                        qwbVar.y(-message10.dialog_id, true);
                    }
                    Utilities.d.c(new g5a(a6aVar11, updates6, message10, z11, (byte) 1));
                    break;
                }
            case 2:
                ((hh2) this.b).d0((TLRPC.TL_error) this.c, (TLObject) this.d, (int[]) this.f, (ArrayList) this.h, this.e, (TLRPC.User) this.n);
                break;
            case 3:
                x07 x07Var = (x07) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject5 = (TLObject) this.d;
                TLRPC.TL_chatInviteImporter tL_chatInviteImporter = (TLRPC.TL_chatInviteImporter) this.f;
                boolean z12 = this.e;
                TLRPC.User user = (TLRPC.User) this.h;
                TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = (TLRPC.TL_messages_hideChatJoinRequest) this.n;
                int i17 = x07Var.k;
                ArrayList arrayList17 = x07Var.e;
                d dVar = x07Var.g;
                if (dVar != null && dVar.getParentActivity() != null) {
                    if (tL_error3 != null) {
                        ik.c0(i17, tL_error3, dVar, tL_messages_hideChatJoinRequest, new Object[0]);
                        break;
                    } else {
                        TLRPC.TL_updates tL_updates = (TLRPC.TL_updates) tLObject5;
                        if (!tL_updates.chats.isEmpty()) {
                            oc7.r1(i17).a3(0, tL_updates.chats.get(0).id, true);
                        }
                        int i18 = 0;
                        while (true) {
                            if (i18 < arrayList17.size()) {
                                if (((TLRPC.TL_chatInviteImporter) arrayList17.get(i18)).user_id == tL_chatInviteImporter.user_id) {
                                    arrayList17.remove(i18);
                                } else {
                                    i18++;
                                }
                            }
                        }
                        q07 q07Var = x07Var.f;
                        x07 x07Var2 = q07Var.c;
                        int i19 = 0;
                        while (true) {
                            arrayList6 = x07Var2.c;
                            if (i19 < arrayList6.size()) {
                                x07 x07Var3 = x07Var2;
                                if (((TLRPC.TL_chatInviteImporter) arrayList6.get(i19)).user_id != tL_chatInviteImporter.user_id) {
                                    i19++;
                                    x07Var2 = x07Var3;
                                }
                            } else {
                                i19 = -1;
                            }
                        }
                        if (i19 >= 0) {
                            arrayList6.remove(i19);
                            q07Var.s((!q07Var.c.B ? 1 : 0) + i19);
                            if (arrayList6.isEmpty()) {
                                q07Var.s(1);
                            }
                        }
                        x07Var.f(x07Var.t, false, true);
                        if (z12) {
                            g31 g31Var = new g31(dVar.getParentActivity(), dVar.getResourceProvider());
                            bf0 bf0Var = g31Var.a;
                            bf0Var.setRoundRadius(gm.L(15.0f));
                            bf0Var.f(user, new pc0(0, user));
                            String k = m9c.k(user, true);
                            String a0 = x07Var.a ? jb6.a0("HasBeenAddedToChannel", null, 2131749121, k) : jb6.a0("HasBeenAddedToGroup", null, 2131749120, k);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a0);
                            int indexOf = a0.indexOf(k);
                            spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, k.length() + indexOf, 18);
                            g31Var.b.setText(spannableStringBuilder);
                            if (arrayList17.isEmpty()) {
                                u31.g(dVar, g31Var, 2750).j();
                            } else {
                                u31.f(x07Var.h, g31Var, 2750).j();
                            }
                        }
                        r6 t = dVar.getActionBar().t();
                        if (TextUtils.isEmpty(x07Var.t) && x07Var.l) {
                            t.j(0).setVisibility(arrayList17.isEmpty() ? 8 : 0);
                            break;
                        }
                    }
                }
                break;
            case 4:
                File file = (File) this.b;
                ArrayList arrayList18 = (ArrayList) this.h;
                d dVar2 = (d) this.c;
                yv1 yv1Var = (yv1) this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                boolean z13 = this.e;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.n;
                arrayList18.add(new jo6(0, file.getAbsolutePath(), 0, false, 0, 0));
                PhotoViewer.r0().T1(dVar2.getParentActivity(), null, dVar2.getResourceProvider());
                PhotoViewer.r0().o1(arrayList18, 0, 11, false, new n2b(), yv1Var);
                PhotoViewer.r0().U(document, z13 ? document : null, false, null);
                hx2.e().T = z13 ? tL_messages_stickerSet : null;
                break;
            default:
                ((p5c) this.b).z0((TLRPC.TL_error) this.c, this.e, (TLObject) this.d, (byte[]) this.f, (String) this.h, (TL_account.passwordInputSettings) this.n);
                break;
        }
    }

    public /* synthetic */ q4a(x07 x07Var, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z, TLRPC.User user, TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest) {
        this.b = x07Var;
        this.c = tL_error;
        this.d = tLObject;
        this.f = tL_chatInviteImporter;
        this.e = z;
        this.h = user;
        this.n = tL_messages_hideChatJoinRequest;
    }

    public /* synthetic */ q4a(a6a a6aVar, TLRPC.TL_error tL_error, TLObject tLObject, boolean z, ArrayList arrayList, ArrayList arrayList2, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = tL_error;
        this.d = tLObject;
        this.e = z;
        this.h = arrayList;
        this.n = arrayList2;
        this.f = tLObject2;
    }

    public /* synthetic */ q4a(a6a a6aVar, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, k47 k47Var, String str, HashMap hashMap, boolean z, TLObject tLObject2) {
        this.b = a6aVar;
        this.c = tL_error;
        this.h = message;
        this.d = tLObject;
        this.n = k47Var;
        this.e = z;
        this.f = tLObject2;
    }

    public /* synthetic */ q4a(p5c p5cVar, TLRPC.TL_error tL_error, boolean z, TLObject tLObject, byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.b = p5cVar;
        this.c = tL_error;
        this.e = z;
        this.d = tLObject;
        this.f = bArr;
        this.h = str;
        this.n = passwordinputsettings;
    }

    public /* synthetic */ q4a(File file, ArrayList arrayList, d dVar, yv1 yv1Var, TLRPC.Document document, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.b = file;
        this.h = arrayList;
        this.c = dVar;
        this.d = yv1Var;
        this.f = document;
        this.e = z;
        this.n = tL_messages_stickerSet;
    }
}
