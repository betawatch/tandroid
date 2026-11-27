// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class sp6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;

    public /* synthetic */ sp6(long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error, TL_phone.getGroupCallChainBlocks getgroupcallchainblocks) {
        this.a = (byte) 1;
        this.c = conferenceCall;
        this.d = getgroupcallchainblocks;
        this.b = j;
        this.e = tLObject;
        this.f = tL_error;
        this.h = atomicBoolean;
        this.n = atomicInteger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // java.lang.Runnable
    public final void run() {
        ls6 ls6Var;
        boolean z;
        Runnable runnable;
        boolean z2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        byte b = this.a;
        long j = this.b;
        int i = 0;
        Object obj = this.n;
        Object obj2 = this.h;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                ls6 ls6Var2 = (ls6) obj6;
                qsb qsbVar = (qsb) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                zh6 zh6Var = (zh6) obj2;
                Runnable runnable2 = (Runnable) obj;
                qsb.a((psb) obj5);
                psb d = qsb.d(qsbVar, "loadReplyMessagesForMessages: (encrypted) loading those messages from storage");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase = ls6Var2.getMessagesStorage().b;
                    Locale locale = Locale.US;
                    ?? r6 = 0;
                    SQLiteCursor queryFinalized = sQLiteDatabase.queryFinalized("SELECT m.data, m.mid, m.date, r.random_id FROM randoms_v2 as r INNER JOIN messages_v2 as m ON r.mid = m.mid AND r.uid = m.uid WHERE r.random_id IN(" + TextUtils.join(",", arrayList) + ")", new Object[0]);
                    while (true) {
                        boolean next = queryFinalized.next();
                        long j2 = this.b;
                        if (!next) {
                            int i2 = r6;
                            Runnable runnable3 = runnable2;
                            queryFinalized.dispose();
                            if (zh6Var.m() != 0) {
                                int i3 = i2;
                                while (i3 < zh6Var.m()) {
                                    ArrayList arrayList3 = (ArrayList) zh6Var.n(i3);
                                    int i4 = i2;
                                    while (i4 < arrayList3.size()) {
                                        TLRPC.MessageReplyHeader messageReplyHeader = ((r47) arrayList3.get(i4)).k.reply_to;
                                        if (messageReplyHeader != null) {
                                            ls6Var = ls6Var2;
                                            messageReplyHeader.reply_to_random_id = 0L;
                                        } else {
                                            ls6Var = ls6Var2;
                                        }
                                        i4++;
                                        ls6Var2 = ls6Var;
                                    }
                                    i3++;
                                    i2 = 0;
                                }
                            }
                            qsb.a(d);
                            hl.c3(new ba7((Object) ls6Var2, (Object) qsb.d(qsbVar, "loadReplyMessagesForMessages (encrypted) runOnUIThread: posting notification"), j2, (Object) arrayList2, (byte) 14));
                            if (runnable3 != null) {
                                runnable3.run();
                                break;
                            }
                        } else {
                            NativeByteBuffer byteBufferValue = queryFinalized.byteBufferValue(r6);
                            if (byteBufferValue != 0) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r6), r6);
                                runnable = runnable2;
                                TLdeserialize.readAttachPath(byteBufferValue, ls6Var2.getUserConfig().n);
                                byteBufferValue.reuse();
                                TLdeserialize.id = queryFinalized.intValue(1);
                                TLdeserialize.date = queryFinalized.intValue(2);
                                TLdeserialize.dialog_id = j2;
                                long longValue = queryFinalized.longValue(3);
                                ArrayList arrayList4 = (ArrayList) zh6Var.f(longValue);
                                zh6Var.l(longValue);
                                if (arrayList4 != null) {
                                    z = false;
                                    r47 r47Var = new r47(ls6Var2.currentAccount, TLdeserialize, false, false);
                                    arrayList2.add(r47Var);
                                    for (int i5 = 0; i5 < arrayList4.size(); i5++) {
                                        r47 r47Var2 = (r47) arrayList4.get(i5);
                                        r47Var2.C = r47Var;
                                        r47Var2.m();
                                        r47Var2.k.reply_to = new TLRPC.TL_messageReplyHeader();
                                        TLRPC.MessageReplyHeader messageReplyHeader2 = r47Var2.k.reply_to;
                                        messageReplyHeader2.flags |= 16;
                                        messageReplyHeader2.reply_to_msg_id = r47Var.L1();
                                    }
                                } else {
                                    z = false;
                                }
                            } else {
                                z = r6;
                                runnable = runnable2;
                            }
                            runnable2 = runnable;
                            r6 = z;
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 1:
                ((ConferenceCall) obj6).lambda$poll$7((TL_phone.getGroupCallChainBlocks) obj5, this.b, (TLObject) obj4, (TLRPC.TL_error) obj3, (AtomicBoolean) obj2, (AtomicInteger) obj);
                break;
            case 2:
                bt5 bt5Var = (bt5) obj6;
                ((id) obj5).b(400L);
                bt5.H0((Context) obj4, bt5Var.a, -j, ((TLRPC.TL_chatInviteExported) obj3).subscription_pricing, (TLRPC.TL_chatInviteImporter) obj2, (TLRPC.ChannelParticipant) obj, bt5Var.J0);
                break;
            case 3:
                zu1 zu1Var = (zu1) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.FileLocation[] fileLocationArr = (TLRPC.FileLocation[]) obj3;
                String str = (String) obj2;
                TLRPC.FileLocation[] fileLocationArr2 = (TLRPC.FileLocation[]) obj;
                if (((TLRPC.TL_error) obj6) == null) {
                    TLRPC.User X1 = zu1Var.getMessagesController().X1(Long.valueOf(zu1Var.getUserConfig().e()));
                    TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                    ArrayList<TLRPC.PhotoSize> arrayList5 = tL_photos_photo.photo.sizes;
                    TLRPC.PhotoSize w = xb4.w(arrayList5, jn7.f2, false, null, false);
                    TLRPC.PhotoSize w2 = xb4.w(arrayList5, 800, false, null, false);
                    TLRPC.VideoSize x = tL_photos_photo.photo.video_sizes.isEmpty() ? null : xb4.x(1000, tL_photos_photo.photo.video_sizes);
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    X1.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                    if (w != null) {
                        tL_userProfilePhoto.photo_small = w.location;
                    }
                    if (w2 != null) {
                        tL_userProfilePhoto.photo_big = w2.location;
                    }
                    if (w == null || fileLocationArr[0] == null) {
                        z2 = true;
                    } else {
                        xb4.G(zu1Var.getCurrentAccount());
                        File J = xb4.J(w, null, true, true);
                        xb4.G(zu1Var.getCurrentAccount());
                        xb4.J(fileLocationArr[0], null, true, true).renameTo(J);
                        StringBuilder sb = new StringBuilder();
                        sb.append(fileLocationArr[0].volume_id);
                        sb.append("_");
                        String l = uh9.l(sb, fileLocationArr[0].local_id, "@50_50");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(w.location.volume_id);
                        sb2.append("_");
                        String l2 = uh9.l(sb2, w.location.local_id, "@50_50");
                        z2 = true;
                        in5.z().O(l, l2, jn5.m(zu1Var.getCurrentAccount(), 1, X1));
                    }
                    if (x != null && str != null) {
                        xb4.G(zu1Var.getCurrentAccount());
                        new File(str).renameTo(xb4.J(x, "mp4", z2, z2));
                    } else if (w2 != null && fileLocationArr2[0] != null) {
                        xb4.G(zu1Var.getCurrentAccount());
                        File J2 = xb4.J(w2, null, true, true);
                        xb4.G(zu1Var.getCurrentAccount());
                        xb4.J(fileLocationArr2[0], null, true, true).renameTo(J2);
                    }
                    zu1Var.getMessagesController().U0(X1.id);
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(X1);
                    zu1Var.getMessagesStorage().j1(arrayList6, null, false, true);
                    TLRPC.UserFull Y1 = zu1Var.getMessagesController().Y1(j);
                    Y1.profile_photo = tL_photos_photo.photo;
                    zu1Var.getMessagesStorage().g2(Y1, false);
                    d31.b0(zu1Var).V(Collections.singletonList(X1), hl.S2(ob6.M0(2131754212, null)), hl.N2(ob6.M0(2131754213, null), -1, 0, new xn0(j, zu1Var), null), null).j();
                    break;
                }
                break;
            case 4:
                Activity activity = (Activity) obj5;
                vnb vnbVar = (vnb) obj4;
                nb9 nb9Var = new nb9(activity, vnbVar, this.b, (byte[]) obj3);
                nb9Var.J0((TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) obj6);
                nb9Var.u1 = new lyc((zu1) obj2, activity, vnbVar, (r47) obj, (byte) 13);
                nb9Var.show();
                break;
            case 5:
                qyb qybVar = (qyb) obj6;
                TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs = (TLRPC.TL_messages_savedDialogs) obj5;
                ArrayList arrayList7 = (ArrayList) obj3;
                HashSet hashSet = (HashSet) obj4;
                o30 o30Var = (o30) obj;
                qybVar.getMessagesController().j4(tL_messages_savedDialogs.users, false);
                qybVar.getMessagesController().c4(tL_messages_savedDialogs.chats, false);
                long j3 = this.b;
                qybVar.u(j3, arrayList7, (zh6) obj2, false, 2, -1);
                long j4 = -j3;
                qybVar.getMessagesStorage().z1(qybVar.getConnectionsManager().getCurrentTime(), j4, (List) qybVar.a.f(j3), true);
                qybVar.getMessagesStorage().g1(tL_messages_savedDialogs.messages, false, true, false, 0, false, 0, 0L);
                int size = arrayList7.size();
                while (i < size) {
                    Object obj7 = arrayList7.get(i);
                    i++;
                    hashSet.remove(Long.valueOf(wf3.n(((TLRPC.TL_forumTopic) obj7).from_id)));
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long longValue2 = ((Long) it.next()).longValue();
                    jf7 messagesStorage = qybVar.getMessagesStorage();
                    long j5 = j4;
                    j4 = j5;
                    messagesStorage.a.c(new xd7(messagesStorage, j5, longValue2, (byte) 2));
                    qybVar.s(j3, longValue2);
                }
                if (o30Var != null) {
                    o30Var.run();
                    break;
                }
                break;
            default:
                final l1c l1cVar = (l1c) obj6;
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) obj5;
                b8 b8Var = (b8) obj4;
                final fu5 fu5Var = (fu5) obj3;
                final TLRPC.User user = (TLRPC.User) obj2;
                final TLRPC.Chat chat = (TLRPC.Chat) obj;
                final boolean z3 = (channelParticipant instanceof TLRPC.TL_channelParticipantBanned) && (tL_chatBannedRights = channelParticipant.banned_rights) != null && tL_chatBannedRights.view_messages;
                b8Var.setVisibility(0);
                b8Var.setText(ob6.M0(z3 ? 2131743567 : 2131753719, null));
                final long j6 = this.b;
                b8Var.setOnClickListener(new View.OnClickListener() { // from class: x0c
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        l1c l1cVar2 = l1c.this;
                        int i6 = l1cVar2.e;
                        fu5Var.u();
                        boolean z4 = z3;
                        TLRPC.User user2 = user;
                        if (!z4) {
                            uc7.s1(i6).e0(j6, user2, null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = uc7.n1(user2);
                        tL_channels_editBanned.channel = uc7.i1(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i6).sendRequest(tL_channels_editBanned, new yp9(l1cVar2, (byte) 16));
                    }
                });
                break;
        }
    }

    public /* synthetic */ sp6(qyb qybVar, TLRPC.TL_messages_savedDialogs tL_messages_savedDialogs, long j, ArrayList arrayList, zh6 zh6Var, HashSet hashSet, o30 o30Var) {
        this.a = (byte) 5;
        this.c = qybVar;
        this.d = tL_messages_savedDialogs;
        this.b = j;
        this.f = arrayList;
        this.h = zh6Var;
        this.e = hashSet;
        this.n = o30Var;
    }

    public /* synthetic */ sp6(Object obj, Object obj2, Object obj3, long j, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
        this.f = obj4;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ sp6(Object obj, Object obj2, Object obj3, Object obj4, long j, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j;
        this.h = obj5;
        this.n = obj6;
    }

    public /* synthetic */ sp6(TLRPC.TL_error tL_error, zu1 zu1Var, TLObject tLObject, TLRPC.FileLocation[] fileLocationArr, String str, TLRPC.FileLocation[] fileLocationArr2, long j) {
        this.a = (byte) 3;
        this.c = tL_error;
        this.d = zu1Var;
        this.e = tLObject;
        this.f = fileLocationArr;
        this.h = str;
        this.n = fileLocationArr2;
        this.b = j;
    }
}
