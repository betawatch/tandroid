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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class p87 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p87(hxa hxaVar, uc7 uc7Var, long j) {
        this.a = (byte) 18;
        this.d = hxaVar;
        this.b = uc7Var;
        this.c = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x023c  */
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
        int i = 0;
        switch (this.a) {
            case 0:
                byte b2 = 4;
                uc7 uc7Var = (uc7) this.b;
                long j2 = this.c;
                rc7 rc7Var = (rc7) this.d;
                uc7Var.getClass();
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
                        hl.c3(new t87(uc7Var, messages_sponsoredmessages, b2));
                        zh6 zh6Var = new zh6();
                        zh6 zh6Var2 = new zh6();
                        for (int i2 = 0; i2 < messages_sponsoredmessages.users.size(); i2++) {
                            TLRPC.User user = messages_sponsoredmessages.users.get(i2);
                            zh6Var.k(user.id, user);
                        }
                        for (int i3 = 0; i3 < messages_sponsoredmessages.chats.size(); i3++) {
                            TLRPC.Chat chat = messages_sponsoredmessages.chats.get(i3);
                            zh6Var2.k(chat.id, chat);
                        }
                        int size = messages_sponsoredmessages.messages.size();
                        int i4 = -10000000;
                        zh6 zh6Var3 = zh6Var;
                        while (i < size) {
                            TLRPC.TL_sponsoredMessage tL_sponsoredMessage = messages_sponsoredmessages.messages.get(i);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            if (!tL_sponsoredMessage.entities.isEmpty()) {
                                tL_message.entities = tL_sponsoredMessage.entities;
                                tL_message.flags |= 128;
                            }
                            tL_message.peer_id = uc7Var.y1(j2);
                            tL_message.flags |= 256;
                            tL_message.date = uc7Var.getConnectionsManager().getCurrentTime();
                            int i5 = i4 - 1;
                            tL_message.id = i4;
                            tL_message.message = tL_sponsoredMessage.message;
                            TLRPC.MessageMedia messageMedia = tL_sponsoredMessage.media;
                            if (messageMedia != null) {
                                tL_message.flags |= 512;
                            }
                            tL_message.media = messageMedia;
                            zh6 zh6Var4 = zh6Var3;
                            r47 r47Var = new r47(uc7Var.currentAccount, (TLRPC.Message) tL_message, zh6Var4, zh6Var2, true, true);
                            r47Var.R0 = tL_sponsoredMessage.random_id;
                            r47Var.S0 = tL_sponsoredMessage.title;
                            r47Var.T0 = tL_sponsoredMessage.url;
                            r47Var.U0 = tL_sponsoredMessage.recommended;
                            r47Var.V0 = tL_sponsoredMessage.photo;
                            r47Var.W0 = tL_sponsoredMessage.sponsor_info;
                            r47Var.X0 = tL_sponsoredMessage.additional_info;
                            r47Var.Y0 = tL_sponsoredMessage.button_text;
                            r47Var.b1 = tL_sponsoredMessage.can_report;
                            r47Var.Z0 = tL_sponsoredMessage.color;
                            r47Var.a1 = tL_sponsoredMessage.media;
                            r47Var.K5();
                            r47Var.B2 = new ArrayList();
                            r47Var.r0(true);
                            arrayList.add(r47Var);
                            i++;
                            zh6Var3 = zh6Var4;
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
                hl.c3(new da7((Object) uc7Var, (Object) num, j2, (Object) rc7Var, (Object) num2, (byte) 9));
                break;
            case 1:
                uc7 uc7Var2 = (uc7) this.b;
                long j3 = this.c;
                q2a q2aVar = (q2a) this.d;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    uc7Var2.c4(tL_contacts_found.chats, false);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < tL_contacts_found.chats.size(); i6++) {
                        TLRPC.Chat chat2 = tL_contacts_found.chats.get(i6);
                        TLRPC.InputPeer l1 = uc7.l1(chat2);
                        if (chat2.id != j3 && xc2.R(chat2)) {
                            arrayList2.add(l1);
                        }
                    }
                    hl.c3(new a30(q2aVar, arrayList2, (byte) 9));
                    break;
                }
                break;
            case 2:
                ((ConferenceCall) this.b).lambda$requestLastBlock$3(this.c, (Runnable) this.d, tLObject, tL_error);
                break;
            case 3:
                uc7 uc7Var3 = (uc7) this.b;
                long j4 = this.c;
                ls5 ls5Var = (ls5) this.d;
                String str = LaunchActivity.C1;
                hl.c3(new ba7(tLObject, uc7Var3, j4, ls5Var));
                break;
            case 4:
                ls6 ls6Var = (ls6) this.b;
                long j5 = this.c;
                TLRPC.TL_messages_getMessages tL_messages_getMessages = (TLRPC.TL_messages_getMessages) this.d;
                if (tL_error == null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    ls6.N1(messages_messages.messages);
                    if (!messages_messages.messages.isEmpty()) {
                        in5.S(messages_messages.messages);
                        ls6Var.m(messages_messages.messages, messages_messages.users, messages_messages.chats, false, false);
                        ls6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                        ArrayList<TLRPC.Message> arrayList3 = messages_messages.messages;
                        if (!arrayList3.isEmpty()) {
                            ls6Var.getMessagesStorage().a.c(new cq6((Object) ls6Var, (Object) arrayList3, j5, (byte) 1));
                            break;
                        }
                    }
                }
                ls6Var.getMessagesStorage().Z1(j5, tL_messages_getMessages.id, false, -1, 0, false, null);
                break;
            case 5:
                uc7 uc7Var4 = (uc7) this.b;
                long j6 = this.c;
                TLRPC.TL_messages_setChatAvailableReactions tL_messages_setChatAvailableReactions = (TLRPC.TL_messages_setChatAvailableReactions) this.d;
                if (tLObject != null) {
                    uc7Var4.Y3((TLRPC.Updates) tLObject, false);
                    TLRPC.ChatFull N0 = uc7Var4.N0(j6);
                    if (N0 != null) {
                        if (N0 instanceof TLRPC.TL_chatFull) {
                            N0.flags |= 262144;
                        }
                        if (N0 instanceof TLRPC.TL_channelFull) {
                            N0.flags |= TLObject.FLAG_30;
                        }
                        N0.available_reactions = tL_messages_setChatAvailableReactions.available_reactions;
                        uc7Var4.getMessagesStorage().K1(N0, false);
                    }
                    hl.c3(new t77(uc7Var4, j6, (byte) 16));
                    break;
                }
                break;
            case 6:
                uc7 uc7Var5 = (uc7) this.b;
                long j7 = this.c;
                TLRPC.TL_messages_getMessagesViews tL_messages_getMessagesViews = (TLRPC.TL_messages_getMessagesViews) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_messageViews tL_messages_messageViews = (TLRPC.TL_messages_messageViews) tLObject;
                    zh6 zh6Var5 = new zh6();
                    zh6 zh6Var6 = new zh6();
                    zh6 zh6Var7 = new zh6();
                    SparseIntArray sparseIntArray = (SparseIntArray) zh6Var5.f(j7);
                    SparseIntArray sparseIntArray2 = (SparseIntArray) zh6Var6.f(j7);
                    SparseArray sparseArray = (SparseArray) zh6Var7.f(j7);
                    for (int i7 = 0; i7 < tL_messages_getMessagesViews.id.size() && i7 < tL_messages_messageViews.views.size(); i7++) {
                        TLRPC.TL_messageViews tL_messageViews = tL_messages_messageViews.views.get(i7);
                        if ((tL_messageViews.flags & 1) != 0) {
                            if (sparseIntArray == null) {
                                sparseIntArray = new SparseIntArray();
                                zh6Var5.k(j7, sparseIntArray);
                            }
                            sparseIntArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.views);
                        }
                        if ((tL_messageViews.flags & 2) != 0) {
                            if (sparseIntArray2 == null) {
                                sparseIntArray2 = new SparseIntArray();
                                zh6Var6.k(j7, sparseIntArray2);
                            }
                            sparseIntArray2.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.forwards);
                        }
                        if ((tL_messageViews.flags & 4) != 0) {
                            if (sparseArray == null) {
                                sparseArray = new SparseArray();
                                zh6Var7.k(j7, sparseArray);
                            }
                            sparseArray.put(tL_messages_getMessagesViews.id.get(i7).intValue(), tL_messageViews.replies);
                        }
                    }
                    uc7Var5.getMessagesStorage().j1(tL_messages_messageViews.users, tL_messages_messageViews.chats, true, true);
                    uc7Var5.getMessagesStorage().X0(zh6Var5, zh6Var6, zh6Var7, false);
                    hl.c3(new tw4((Object) uc7Var5, (Object) tL_messages_messageViews, (Object) zh6Var5, (Object) zh6Var6, (Object) zh6Var7, (byte) 25));
                    break;
                }
                break;
            case 7:
                uc7 uc7Var6 = (uc7) this.b;
                TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel = (TLRPC.TL_channels_inviteToChannel) this.d;
                long j8 = this.c;
                if (tL_error != null) {
                    hl.c3(new es6((Object) uc7Var6, (Object) tL_error, (Object) tL_channels_inviteToChannel, b));
                    break;
                } else if (tLObject instanceof TLRPC.TL_messages_invitedUsers) {
                    TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) tLObject;
                    uc7Var6.Y3(tL_messages_invitedUsers.updates, false);
                    hl.c3(new ue2((Object) uc7Var6, (Object) tL_messages_invitedUsers, j8, (byte) 4));
                    break;
                }
                break;
            case 8:
                uc7 uc7Var7 = (uc7) this.b;
                ii7 ii7Var = (ii7) this.d;
                long j9 = this.c;
                if (tLObject instanceof TLRPC.TL_exportedContactToken) {
                    uc7Var7.M4 = (TLRPC.TL_exportedContactToken) tLObject;
                    hl.d3(new t87(uc7Var7, ii7Var, (byte) 7), Math.max(0L, 0 - (System.currentTimeMillis() - j9)));
                    break;
                } else {
                    uc7Var7.L4 = false;
                    break;
                }
            case 9:
                hl.c3(new da7(this.b, (Object) tL_error, (Object) tLObject, this.c, this.d, (byte) 10));
                break;
            case 10:
                uc7 uc7Var8 = (uc7) this.b;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) this.d;
                long j10 = this.c;
                TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                if (messages_messages2 != null) {
                    int i8 = messages_messages2.count;
                    if (i8 == 0) {
                        i8 = messages_messages2.messages.size();
                    }
                    int i9 = i8;
                    jf7 messagesStorage = uc7Var8.getMessagesStorage();
                    messagesStorage.a.c(new ae7(messagesStorage, 0L, -inputPeer.channel_id, i9, (byte) 3));
                }
                if (j10 != 0) {
                    uc7Var8.getMessagesStorage().n1(j10);
                    break;
                }
                break;
            case 11:
                hl.c3(new ba7(this.b, (Object) tLObject, this.c, this.d, (byte) 15));
                break;
            case 12:
                uc7 uc7Var9 = (uc7) this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                long j11 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages3 = (TLRPC.messages_Messages) tLObject;
                    uc7Var9.p4(messages_messages3.messages, dialog.id);
                    if (messages_messages3.messages.isEmpty()) {
                        hl.c3(new ya7(uc7Var9, dialog, false ? 1 : 0));
                    } else {
                        if (f11.a) {
                            cc4.b("checkLastDialogMessage for " + dialog.id + " has message");
                        }
                        TLRPC.TL_messages_dialogs tL_messages_dialogs = new TLRPC.TL_messages_dialogs();
                        TLRPC.Message message = messages_messages3.messages.get(0);
                        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
                        tL_dialog.flags = dialog.flags;
                        tL_dialog.top_message = message.id;
                        tL_dialog.last_message_date = message.date;
                        tL_dialog.notify_settings = dialog.notify_settings;
                        tL_dialog.pts = dialog.pts;
                        tL_dialog.unread_count = dialog.unread_count;
                        tL_dialog.unread_mark = dialog.unread_mark;
                        tL_dialog.unread_mentions_count = dialog.unread_mentions_count;
                        tL_dialog.unread_reactions_count = dialog.unread_reactions_count;
                        tL_dialog.unread_poll_votes_count = dialog.unread_poll_votes_count;
                        tL_dialog.read_inbox_max_id = dialog.read_inbox_max_id;
                        tL_dialog.read_outbox_max_id = dialog.read_outbox_max_id;
                        tL_dialog.pinned = dialog.pinned;
                        tL_dialog.pinnedNum = dialog.pinnedNum;
                        tL_dialog.folder_id = dialog.folder_id;
                        tL_dialog.spam = uc7Var9.r2(dialog.id);
                        long j12 = dialog.id;
                        tL_dialog.id = j12;
                        message.dialog_id = j12;
                        tL_messages_dialogs.users.addAll(messages_messages3.users);
                        tL_messages_dialogs.chats.addAll(messages_messages3.chats);
                        tL_messages_dialogs.dialogs.add(tL_dialog);
                        tL_messages_dialogs.messages.addAll(messages_messages3.messages);
                        tL_messages_dialogs.count = 1;
                        Utilities.d.c(new ds6(uc7Var9, false ? 1 : 0, tL_messages_dialogs, b));
                        uc7Var9.getMessagesStorage().g1(messages_messages3.messages, true, true, false, uc7Var9.getDownloadController().l(), true, 0, 0L);
                    }
                }
                if (j11 != 0) {
                    uc7Var9.getMessagesStorage().n1(j11);
                }
                hl.c3(new ya7(uc7Var9, dialog, b));
                break;
            case 13:
                uc7 uc7Var10 = (uc7) this.b;
                long j13 = this.c;
                TLRPC.Chat chat3 = (TLRPC.Chat) this.d;
                if (tLObject != null) {
                    TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = (TLRPC.TL_messages_peerDialogs) tLObject;
                    if (!tL_messages_peerDialogs.dialogs.isEmpty() && !tL_messages_peerDialogs.chats.isEmpty()) {
                        TLRPC.TL_dialog tL_dialog2 = (TLRPC.TL_dialog) tL_messages_peerDialogs.dialogs.get(0);
                        j = j13;
                        TLRPC.TL_messages_dialogs tL_messages_dialogs2 = new TLRPC.TL_messages_dialogs();
                        tL_messages_dialogs2.dialogs.addAll(tL_messages_peerDialogs.dialogs);
                        tL_messages_dialogs2.messages.addAll(tL_messages_peerDialogs.messages);
                        tL_messages_dialogs2.users.addAll(tL_messages_peerDialogs.users);
                        tL_messages_dialogs2.chats.addAll(tL_messages_peerDialogs.chats);
                        uc7Var10.T3(tL_messages_dialogs2, null, null, tL_dialog2.folder_id, 0, 1, uc7Var10.D4, false, false, false);
                        if (j != 0) {
                            uc7Var10.getMessagesStorage().n1(j);
                        }
                        uc7Var10.S0.e(chat3.id);
                        break;
                    }
                }
                j = j13;
                if (j != 0) {
                }
                uc7Var10.S0.e(chat3.id);
                break;
            case 14:
                final c39 c39Var = (c39) this.b;
                long j14 = this.c;
                TLRPC.Chat chat4 = (TLRPC.Chat) this.d;
                int i10 = c39Var.f;
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
                    final z09 z09Var = new z09(c39Var, arrayList7, (byte) 5);
                    if (xc2.T(chat4)) {
                        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
                        tL_channels_getParticipants.limit = uc7.s1(i10).k4.V0.f();
                        tL_channels_getParticipants.offset = 0;
                        tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                        tL_channels_getParticipants.channel = uc7.s1(i10).h1(chat4.id);
                        final byte b3 = 0;
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_getParticipants, new RequestDelegate() { // from class: y29
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b3) {
                                    case 0:
                                        final byte b4 = 0;
                                        final c39 c39Var2 = c39Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final z09 z09Var2 = z09Var;
                                        hl.c3(new Runnable() { // from class: z29
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b5 = b4;
                                                z09 z09Var3 = z09Var2;
                                                ArrayList arrayList11 = arrayList10;
                                                ArrayList arrayList12 = arrayList9;
                                                ArrayList arrayList13 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                c39 c39Var3 = c39Var2;
                                                switch (b5) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                uc7.s1(c39Var3.f).i4(user2, false, false);
                                                                int indexOf = arrayList13.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList12.add(new b39(((Integer) arrayList11.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z09Var3.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                uc7.s1(c39Var3.f).i4(user3, false, false);
                                                                int indexOf2 = arrayList13.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList12.add(new b39(((Integer) arrayList11.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        z09Var3.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final c39 c39Var3 = c39Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final z09 z09Var3 = z09Var;
                                        hl.c3(new Runnable() { // from class: z29
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                z09 z09Var32 = z09Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                c39 c39Var32 = c39Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                uc7.s1(c39Var32.f).i4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                uc7.s1(c39Var32.f).i4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
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
                        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getFullChat, new RequestDelegate() { // from class: y29
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error2) {
                                switch (b4) {
                                    case 0:
                                        final byte b42 = 0;
                                        final c39 c39Var2 = c39Var;
                                        final ArrayList arrayList8 = arrayList4;
                                        final ArrayList arrayList9 = arrayList7;
                                        final ArrayList arrayList10 = arrayList5;
                                        final z09 z09Var2 = z09Var;
                                        hl.c3(new Runnable() { // from class: z29
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b42;
                                                z09 z09Var32 = z09Var2;
                                                ArrayList arrayList112 = arrayList10;
                                                ArrayList arrayList122 = arrayList9;
                                                ArrayList arrayList132 = arrayList8;
                                                TLObject tLObject3 = tLObject2;
                                                c39 c39Var32 = c39Var2;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                uc7.s1(c39Var32.f).i4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                uc7.s1(c39Var32.f).i4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final byte b5 = 1;
                                        final c39 c39Var3 = c39Var;
                                        final ArrayList arrayList11 = arrayList4;
                                        final ArrayList arrayList12 = arrayList7;
                                        final ArrayList arrayList13 = arrayList5;
                                        final z09 z09Var3 = z09Var;
                                        hl.c3(new Runnable() { // from class: z29
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte b52 = b5;
                                                z09 z09Var32 = z09Var3;
                                                ArrayList arrayList112 = arrayList13;
                                                ArrayList arrayList122 = arrayList12;
                                                ArrayList arrayList132 = arrayList11;
                                                TLObject tLObject3 = tLObject2;
                                                c39 c39Var32 = c39Var3;
                                                switch (b52) {
                                                    case 0:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject3;
                                                            for (int i13 = 0; i13 < tL_channels_channelParticipants.users.size(); i13++) {
                                                                TLRPC.User user2 = tL_channels_channelParticipants.users.get(i13);
                                                                uc7.s1(c39Var32.f).i4(user2, false, false);
                                                                int indexOf = arrayList132.indexOf(Long.valueOf(user2.id));
                                                                if (!user2.self && indexOf >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf)).intValue(), user2));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
                                                        break;
                                                    default:
                                                        if (tLObject3 != null) {
                                                            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject3;
                                                            for (int i14 = 0; i14 < tL_messages_chatFull.users.size(); i14++) {
                                                                TLRPC.User user3 = tL_messages_chatFull.users.get(i14);
                                                                uc7.s1(c39Var32.f).i4(user3, false, false);
                                                                int indexOf2 = arrayList132.indexOf(Long.valueOf(user3.id));
                                                                if (!user3.self && indexOf2 >= 0) {
                                                                    arrayList122.add(new b39(((Integer) arrayList112.get(indexOf2)).intValue(), user3));
                                                                }
                                                            }
                                                        }
                                                        z09Var32.run();
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
            case 15:
                dq9 dq9Var = (dq9) this.b;
                int[] iArr = (int[]) this.d;
                long j16 = this.c;
                int i13 = dq9Var.e;
                if (tLObject instanceof TL_phone.groupParticipants) {
                    TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
                    uc7.s1(i13).j4(groupparticipants.users, false);
                    uc7.s1(i13).c4(groupparticipants.chats, false);
                    if (dq9Var.P != null) {
                        yac.h(i13).e();
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
                        dq9Var.P.onMediaDescriptionAvailable(j16, (VoIPService.RequestedParticipant[]) arrayList8.toArray(new VoIPService.RequestedParticipant[0]));
                        break;
                    }
                }
                break;
            case 16:
                hl.c3(new da7(this.b, this.d, (Object) tLObject, this.c, (Object) tL_error, (byte) 16));
                break;
            case 17:
                hl.c3(new y09(this.b, (Object) tLObject, this.c, this.d, (byte) 9));
                break;
            case 18:
                hxa hxaVar = (hxa) this.d;
                uc7 uc7Var11 = (uc7) this.b;
                long j17 = this.c;
                hxaVar.getClass();
                hl.c3(new da7(hxaVar, tLObject, uc7Var11, tL_error, j17));
                break;
            case 19:
                qyb qybVar = (qyb) this.b;
                long j18 = this.c;
                d0c d0cVar = (d0c) this.d;
                qybVar.getClass();
                hl.c3(new y09((Object) qybVar, (Object) tLObject, j18, (Object) d0cVar, (byte) 15));
                break;
            case 20:
                hl.c3(new da7(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 23));
                break;
            default:
                hl.c3(new da7(this.b, this.d, (Object) tLObject, (Object) tL_error, this.c, (byte) 22));
                break;
        }
    }

    public /* synthetic */ p87(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = j;
        this.d = obj2;
    }

    public /* synthetic */ p87(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }
}
