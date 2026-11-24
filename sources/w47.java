// default package

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w47 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w47(eta etaVar, na7 na7Var, long j) {
        this.a = (byte) 17;
        this.d = etaVar;
        this.b = na7Var;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f5  */
    @Override // org.telegram.tgnet.RequestDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Integer num;
        Integer num2;
        Integer num3;
        long j;
        byte b = 1;
        boolean z = false;
        switch (this.a) {
            case 0:
                int i = 0;
                byte b2 = 2;
                na7 na7Var = (na7) this.b;
                long j2 = this.c;
                ka7 ka7Var = (ka7) this.d;
                na7Var.getClass();
                Integer num4 = null;
                if (tLObject instanceof TLRPC.messages_SponsoredMessages) {
                    TLRPC.messages_SponsoredMessages messages_sponsoredmessages = (TLRPC.messages_SponsoredMessages) tLObject;
                    if (messages_sponsoredmessages.messages.isEmpty()) {
                        num3 = null;
                    } else {
                        if ((messages_sponsoredmessages instanceof TLRPC.TL_messages_sponsoredMessages) && (messages_sponsoredmessages.flags & 1) > 0) {
                            num4 = Integer.valueOf(messages_sponsoredmessages.posts_between);
                        }
                        ArrayList arrayList = new ArrayList();
                        gl.d3(new t67(na7Var, messages_sponsoredmessages, b2));
                        vf6 vf6Var = new vf6();
                        vf6 vf6Var2 = new vf6();
                        for (int i2 = 0; i2 < messages_sponsoredmessages.users.size(); i2++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i2);
                            vf6Var.k(user, user.id);
                        }
                        for (int i3 = 0; i3 < messages_sponsoredmessages.chats.size(); i3++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i3);
                            vf6Var2.k(chat, chat.id);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i4 = -10000000;
                        while (i < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = na7Var.w1(j2);
                            tL_message.flags |= 256;
                            tL_message.date = na7Var.getConnectionsManager().getCurrentTime();
                            int i5 = i4 - 1;
                            tL_message.id = i4;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            k27 k27Var = new k27(na7Var.currentAccount, (TLRPC.Message) tL_message, vf6Var, vf6Var2, true, true);
                            k27Var.R0 = tL_sponsoredMessage.random_id;
                            k27Var.S0 = tL_sponsoredMessage.title;
                            k27Var.T0 = tL_sponsoredMessage.url;
                            k27Var.U0 = tL_sponsoredMessage.recommended;
                            k27Var.V0 = tL_sponsoredMessage.photo;
                            k27Var.W0 = tL_sponsoredMessage.sponsor_info;
                            k27Var.X0 = tL_sponsoredMessage.additional_info;
                            k27Var.Y0 = tL_sponsoredMessage.button_text;
                            k27Var.b1 = tL_sponsoredMessage.can_report;
                            k27Var.Z0 = tL_sponsoredMessage.color;
                            k27Var.a1 = tL_sponsoredMessage.media;
                            k27Var.K5();
                            k27Var.B2 = new ArrayList();
                            k27Var.r0(true);
                            arrayList.add(k27Var);
                            i++;
                            i4 = i5;
                        }
                        num3 = num4;
                        num4 = arrayList;
                    }
                    num2 = num3;
                    num = num4;
                } else {
                    num = null;
                    num2 = null;
                }
                gl.d3(new o77((Object) na7Var, (Object) num, j2, (Object) ka7Var, (Object) num2, (byte) 9));
                break;
            case 1:
                na7 na7Var2 = (na7) this.b;
                long j3 = this.c;
                wy9 wy9Var = (wy9) this.d;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    na7Var2.U3(tL_contacts_found.chats, false);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < tL_contacts_found.chats.size(); i6++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i6);
                        TLRPC.InputPeer j1 = na7.j1(chat2);
                        if (chat2.id != j3 && hc2.R(chat2)) {
                            arrayList2.add(j1);
                        }
                    }
                    gl.d3(new z20(wy9Var, arrayList2, (byte) 8));
                    break;
                }
                break;
            case 2:
                ((ConferenceCall) this.b).lambda$requestLastBlock$3(this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 3:
                na7 na7Var3 = (na7) this.b;
                long j4 = this.c;
                sx5 sx5Var = (sx5) this.d;
                String str = LaunchActivity.C1;
                gl.d3(new m77(tLObject, na7Var3, j4, sx5Var));
                break;
            case 4:
                hq6 hq6Var = (hq6) this.b;
                long j5 = this.c;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    hq6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        fl5.S(messages_messages.messages);
                        hq6Var.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        hq6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        if (!arrayList3.isEmpty()) {
                            hq6Var.getMessagesStorage().a.c(new go6((Object) hq6Var, (Object) arrayList3, j5, (byte) 1));
                            break;
                        }
                    }
                }
                hq6Var.getMessagesStorage().Z1(j5, tL_messages_getMessages.id, false, -1, 0, false, null);
                break;
            case 5:
                na7 na7Var4 = (na7) this.b;
                long j6 = this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs.chats.addAll(tL_messages_peerDialogs.chats);
                        j = j6;
                        na7Var4.L3(tL_messages_dialogs, null, null, tL_dialog.folder_id, 0, 1, na7Var4.C4, false, false, false);
                        if (j != 0) {
                            na7Var4.getMessagesStorage().n1(j);
                        }
                        na7Var4.S0.e(chat3.id);
                        break;
                    }
                }
                j = j6;
                if (j != 0) {
                }
                na7Var4.S0.e(chat3.id);
                break;
            case 6:
                na7 na7Var5 = (na7) this.b;
                long j7 = this.c;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    na7Var5.Q3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull L0 = na7Var5.L0(j7);
                    if (L0 != null) {
                        if (L0 instanceof TLRPC.TL_chatFull) {
                            L0.flags |= 262144;
                        }
                        if (L0 instanceof TLRPC.TL_channelFull) {
                            L0.flags |= TLObject.FLAG_30;
                        }
                        L0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        na7Var5.getMessagesStorage().K1(L0, false);
                    }
                    gl.d3(new r57(na7Var5, j7, (byte) 16));
                    break;
                }
                break;
            case 7:
                na7 na7Var6 = (na7) this.b;
                long j8 = this.c;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    vf6 vf6Var3 = new vf6();
                    vf6 vf6Var4 = new vf6();
                    vf6 vf6Var5 = new vf6();
                    SparseIntArray sparseIntArray = (SparseIntArray) vf6Var3.f(j8);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) vf6Var4.f(j8);
                    SparseArray sparseArray = (SparseArray) vf6Var5.f(j8);
                    for (int i7 = 0; i7 < tL_messages_getMessagesViews.id.size() && i7 < tL_messages_messageViews.views.size(); i7++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i7);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                vf6Var3.k(sparseIntArray, j8);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                vf6Var4.k(sparseIntArray2, j8);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                vf6Var5.k(sparseArray, j8);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.replies);
                        }
                    }
                    na7Var6.getMessagesStorage().j1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    na7Var6.getMessagesStorage().X0(vf6Var3, vf6Var4, vf6Var5, false);
                    gl.d3(new vz4((Object) na7Var6, (Object) tL_messages_messageViews, (Object) vf6Var3, (Object) vf6Var4, (Object) vf6Var5, (byte) 22));
                    break;
                }
                break;
            case 8:
                na7 na7Var7 = (na7) this.b;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j9 = this.c;
                if (tL_error != null) {
                    gl.d3(new nn6(na7Var7, tL_error, tL_channels_inviteToChannel, b));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    na7Var7.Q3(tL_messages_invitedUsers.updates, false);
                    gl.d3(new de2((Object) na7Var7, (Object) tL_messages_invitedUsers, j9, (byte) 4));
                    break;
                }
                break;
            case 9:
                na7 na7Var8 = (na7) this.b;
                zf7 zf7Var = (zf7) this.d;
                long j10 = this.c;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    na7Var8.L4 = (TLRPC.TL_exportedContactToken) tLObject;
                    gl.e3(new t67(na7Var8, zf7Var, (byte) 11), Math.max(0L, 0 - (System.currentTimeMillis() - j10)));
                    break;
                } else {
                    na7Var8.K4 = false;
                    break;
                }
            case 10:
                na7 na7Var9 = (na7) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j11 = this.c;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i8 = messages_messages2.count;
                    if (i8 == 0) {
                        i8 = messages_messages2.messages.size();
                    }
                    int i9 = i8;
                    ad7 messagesStorage = na7Var9.getMessagesStorage();
                    messagesStorage.a.c(new yb7(messagesStorage, 0L, -inputPeer.channel_id, i9, (byte) 7));
                }
                if (j11 != 0) {
                    na7Var9.getMessagesStorage().n1(j11);
                    break;
                }
                break;
            case 11:
                gl.d3(new m77(this.b, (Object) tLObject, this.c, this.d, (byte) 15));
                break;
            case 12:
                na7 na7Var10 = (na7) this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j12 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    na7Var10.g4(messages_messages3.messages, dialog.id);
                    if (messages_messages3.messages.isEmpty()) {
                        gl.d3(new q87(na7Var10, dialog, null == true ? 1 : 0));
                    } else {
                        if (w01.a) {
                            fa4.b("checkLastDialogMessage for " + dialog.id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog2 = new TLRPC.TL_dialog();
                        tL_dialog2.flags = dialog.flags;
                        tL_dialog2.top_message = message.id;
                        tL_dialog2.last_message_date = message.date;
                        tL_dialog2.notify_settings = dialog.notify_settings;
                        tL_dialog2.pts = dialog.pts;
                        tL_dialog2.unread_count = dialog.unread_count;
                        tL_dialog2.unread_mark = dialog.unread_mark;
                        tL_dialog2.unread_mentions_count = dialog.unread_mentions_count;
                        tL_dialog2.unread_reactions_count = dialog.unread_reactions_count;
                        tL_dialog2.unread_poll_votes_count = dialog.unread_poll_votes_count;
                        tL_dialog2.read_inbox_max_id = dialog.read_inbox_max_id;
                        tL_dialog2.read_outbox_max_id = dialog.read_outbox_max_id;
                        tL_dialog2.pinned = dialog.pinned;
                        tL_dialog2.pinnedNum = dialog.pinnedNum;
                        tL_dialog2.folder_id = dialog.folder_id;
                        long j13 = dialog.id;
                        tL_dialog2.id = j13;
                        message.dialog_id = j13;
                        tL_messages_dialogs2.users.addAll(messages_messages3.users);
                        tL_messages_dialogs2.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs2.dialogs.add(tL_dialog2);
                        tL_messages_dialogs2.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs2.count = 1;
                        Utilities.d.c(new mn6(na7Var10, tL_messages_dialogs2, z, b));
                        na7Var10.getMessagesStorage().g1(messages_messages3.messages, true, true, false, na7Var10.getDownloadController().l(), true, 0, 0L);
                    }
                }
                if (j12 != 0) {
                    na7Var10.getMessagesStorage().n1(j12);
                }
                gl.d3(new q87(na7Var10, dialog, b));
                break;
            case 13:
                final oz8 oz8Var = (oz8) this.b;
                long j14 = this.c;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                int i10 = oz8Var.f;
                if (tLObject instanceof Vector) {
                    final ArrayList arrayList4 = new ArrayList();
                    final ArrayList arrayList5 = new ArrayList();
                    ArrayList<T> arrayList6 = ((Vector) tLObject).objects;
                    int size2 = arrayList6.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList6.get(i11);
                        i11++;
                        if (obj instanceof Long) {
                            Long l = (Long) obj;
                            if (j14 != l.longValue()) {
                                arrayList4.add(l);
                                arrayList5.add(0);
                            }
                        } else if (obj instanceof TLRPC.TL_readParticipantDate) {
                            TLRPC.TL_readParticipantDate tL_readParticipantDate = (TLRPC.TL_readParticipantDate) obj;
                            long j15 = tL_readParticipantDate.user_id;
                            int i12 = tL_readParticipantDate.date;
                            if (j14 != j15) {
                                arrayList4.add(Long.valueOf(j15));
                                arrayList5.add(Integer.valueOf(i12));
                            }
                        }
                    }
                    arrayList4.add(Long.valueOf(j14));
                    arrayList5.add(0);
                    final ArrayList arrayList7 = new ArrayList();
                    final lw8 lw8Var = new lw8(oz8Var, arrayList7, (byte) 7);
                    if (hc2.T(chat4)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = na7.q1(i10).k4.N0.f();
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = na7.q1(i10).f1(chat4.id);
                        final byte b3 = 0;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: lz8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b3) {
                                    case 0:
                                        final byte b4 = 0;
                                        final oz8 oz8Var2 = oz8Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final lw8 lw8Var2 = lw8Var;
                                        gl.d3(new Runnable() { // from class: mz8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b5 = b4;
                                                lw8 lw8Var3 = lw8Var2;
                                                ArrayList arrayList11 = arrayList10;
                                                ArrayList arrayList12 = arrayList9;
                                                ArrayList arrayList13 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                oz8 oz8Var3 = oz8Var2;
                                                switch (b5) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                na7.q1(oz8Var3.f).Z3(user2, false, false);
                                                                int indexOf = arrayList13.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList12.add(new nz8(((Integer) arrayList11.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lw8Var3.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                na7.q1(oz8Var3.f).Z3(user3, false, false);
                                                                int indexOf2 = arrayList13.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new nz8(((Integer) arrayList11.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        lw8Var3.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final oz8 oz8Var3 = oz8Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final lw8 lw8Var3 = lw8Var;
                                        gl.d3(new Runnable() { // from class: mz8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                lw8 lw8Var32 = lw8Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                oz8 oz8Var32 = oz8Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                na7.q1(oz8Var32.f).Z3(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                na7.q1(oz8Var32.f).Z3(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        TLRPC.TL_messages_getFullChat tL_messages_getFullChat = new TLRPC.TL_messages_getFullChat();
                        tL_messages_getFullChat.chat_id = chat4.id;
                        final byte b4 = 1;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: lz8
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b4) {
                                    case 0:
                                        final byte b42 = 0;
                                        final oz8 oz8Var2 = oz8Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final lw8 lw8Var2 = lw8Var;
                                        gl.d3(new Runnable() { // from class: mz8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b42;
                                                lw8 lw8Var32 = lw8Var2;
                                                ArrayList arrayList112 = arrayList10;
                                                ArrayList arrayList122 = arrayList9;
                                                ArrayList arrayList132 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                oz8 oz8Var32 = oz8Var2;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                na7.q1(oz8Var32.f).Z3(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                na7.q1(oz8Var32.f).Z3(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final oz8 oz8Var3 = oz8Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final lw8 lw8Var3 = lw8Var;
                                        gl.d3(new Runnable() { // from class: mz8
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                lw8 lw8Var32 = lw8Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                oz8 oz8Var32 = oz8Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                na7.q1(oz8Var32.f).Z3(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                na7.q1(oz8Var32.f).Z3(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new nz8(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        lw8Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                        break;
                    }
                }
                break;
            case 14:
                nm9 nm9Var = (nm9) this.b;
                int[] iArr = (int[]) this.d;
                long j16 = this.c;
                int i13 = nm9Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    na7.q1(i13).a4(groupparticipants.users, false);
                    na7.q1(i13).U3(groupparticipants.chats, false);
                    if (nm9Var.P != null) {
                        y6c.h(i13).e();
                        ArrayList arrayList8 = new ArrayList();
                        for (int i14 : iArr) {
                            ArrayList<TLRPC.GroupCallParticipant> arrayList9 = groupparticipants.participants;
                            int size3 = arrayList9.size();
                            int i15 = 0;
                            while (true) {
                                if (i15 < size3) {
                                    TLRPC.GroupCallParticipant groupCallParticipant = arrayList9.get(i15);
                                    i15++;
                                    TLRPC.GroupCallParticipant groupCallParticipant2 = groupCallParticipant;
                                    if (groupCallParticipant2.source == i14) {
                                        arrayList8.add(new VoIPService.RequestedParticipant(groupCallParticipant2, i14));
                                    }
                                }
                            }
                        }
                        nm9Var.P.onMediaDescriptionAvailable(j16, (VoIPService.RequestedParticipant[]) arrayList8.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 15:
                gl.d3(new o77(this.b, this.d, (Object) tLObject, this.c, (Object) tL_error, (byte) 15));
                break;
            case 16:
                gl.d3(new mx8(this.b, (Object) tLObject, this.c, this.d, (byte) 9));
                break;
            case 17:
                eta etaVar = (eta) this.d;
                na7 na7Var11 = (na7) this.b;
                long j17 = this.c;
                etaVar.getClass();
                gl.d3(new o77(etaVar, tLObject, na7Var11, tL_error, j17));
                break;
            case 18:
                pub pubVar = (pub) this.b;
                long j18 = this.c;
                awb awbVar = (awb) this.d;
                pubVar.getClass();
                gl.d3(new mx8((Object) pubVar, (Object) tLObject, j18, (Object) awbVar, (byte) 15));
                break;
            case 19:
                gl.d3(new o77(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 22));
                break;
            default:
                gl.d3(new o77(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 21));
                break;
        }
    }

    public /* synthetic */ w47(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public /* synthetic */ w47(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
