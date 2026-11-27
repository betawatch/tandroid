// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.function.Consumer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ue2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ue2(Object obj, long j, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
    }

    private final void a() {
        int i;
        ju1 ju1Var = (ju1) this.c;
        ArrayList arrayList = (ArrayList) this.d;
        zu1 zu1Var = ju1Var.a;
        i = ((e) zu1Var).currentAccount;
        jj.q0(r7a.B(i).p0(arrayList, this.b, false, false, true, 0, 0, null, -1, 0L, zu1Var.k7(), zu1Var.y5), null, zu1Var);
    }

    private final void b() {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.c;
        ky1 ky1Var = (ky1) this.d;
        int i = ChatActivityEnterView.X7;
        ky1Var.run();
        vye.c(chatActivityEnterView.R, this.b);
    }

    private final void c() {
        n12 n12Var = (n12) this.c;
        vnb vnbVar = (vnb) this.d;
        jj.J(n12Var.getContext(), this.b, new xz1(n12Var, (byte) 15), vnbVar);
    }

    private final void d() {
        z52 z52Var;
        b62 b62Var = (b62) this.c;
        z52 z52Var2 = (z52) this.d;
        c62 c62Var = b62Var.Q;
        if (!c62Var.r.J1 && b62Var.E == this.b && (z52Var = b62Var.G) == z52Var2) {
            c62Var.K = z52Var;
            c62Var.N = z52Var.a.a;
            c62Var.L = false;
            b62Var.H = 0.0f;
            b62Var.invalidate();
            ValueAnimator valueAnimator = c62Var.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            c62Var.M = ofFloat;
            ofFloat.addUpdateListener(new x52(b62Var, (byte) 1));
            c62Var.M.setDuration(200L);
            c62Var.M.start();
            z52 z52Var3 = c62Var.K;
            RectF e = z52Var3.e(z52Var3.c());
            RectF b = c62Var.K.b();
            c62Var.H = (((c62Var.E - e.left) / e.width()) + 0.5f) / 2.0f;
            c62Var.G = (c62Var.F - e.top) / e.height();
            c62Var.I = b.width();
            c62Var.J = b.height();
            try {
                c62Var.performHapticFeedback(0, 2);
            } catch (Exception unused) {
            }
        }
    }

    private final void e() {
        bg2 bg2Var = (bg2) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        bg2Var.getMessagesController().d0(bg2Var.N, user);
        bg2Var.z0(this.b);
        if (bg2Var.n == null || user == null || !d31.a(bg2Var)) {
            return;
        }
        d31.D(bg2Var, user, bg2Var.n.title).j();
    }

    private final void f() {
        boolean z;
        boolean z2;
        boolean z3;
        pg3 pg3Var = (pg3) this.c;
        og3 og3Var = (og3) this.d;
        c6b c6bVar = pg3Var.s;
        ArrayList arrayList = pg3Var.y;
        uj3 uj3Var = pg3Var.f0;
        if (uj3Var == null || uj3Var.getParentActivity() == null) {
            return;
        }
        int i = og3Var.b;
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                z = true;
                break;
            }
            long j = ((mg3) arrayList.get(i2)).c;
            if (j != yac.h(pg3Var.f).n && c6bVar.K(j)) {
                z = false;
                break;
            }
            i2++;
        }
        if (og3Var.G && (!z || arrayList.size() == 1)) {
            arrayList2.add(Long.valueOf(og3Var.F));
            z3 = false;
            z2 = true;
        } else if (og3Var.G || !c6bVar.K(og3Var.F)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (c6bVar.J(((mg3) arrayList.get(i3)).c)) {
                    arrayList2.add(Long.valueOf(((mg3) arrayList.get(i3)).c));
                } else if (i3 <= i) {
                    i--;
                }
            }
            z2 = false;
            z3 = false;
        } else {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                long j2 = ((mg3) arrayList.get(i4)).c;
                if (!og3Var.G && c6bVar.K(j2)) {
                    arrayList2.add(Long.valueOf(j2));
                }
                if (j2 == og3Var.F) {
                    i = arrayList2.size() - 1;
                }
            }
            z2 = false;
            z3 = true;
        }
        lcb orCreateStoryViewer = uj3Var.getOrCreateStoryViewer();
        orCreateStoryViewer.t(new kt((Object) pg3Var, this.b, (byte) 13));
        Context context = pg3Var.getContext();
        l6b a = l6b.a(pg3Var.h);
        a.e = new t41((byte) 4, pg3Var, z2);
        a.f = pg3Var.b == 1;
        a.h = z3;
        a.n = z2;
        a.r = true;
        orCreateStoryViewer.K(context, null, arrayList2, i, null, null, a, false);
    }

    private final void g() {
        uj3 uj3Var = (uj3) this.c;
        o30 o30Var = (o30) this.d;
        if (uj3Var.H.bot_admin_rights == null) {
            o30Var.run();
        } else {
            uj3Var.getMessagesController().d5(-this.b, uj3Var.getMessagesController().X1(Long.valueOf(uj3Var.I)), uj3Var.H.bot_admin_rights, null, false, uj3Var, true, true, null, o30Var, new ht2(o30Var, (byte) 24));
        }
    }

    private final void h() {
        yx4 yx4Var = (yx4) this.c;
        pcc pccVar = (pcc) this.d;
        e S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        yx4Var.dismiss();
        if (pccVar != null) {
            pccVar.a(Boolean.FALSE);
        }
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.b);
        bundle.putBoolean("open_gifts", true);
        S.presentFragment(new ProfileActivity(bundle, null));
    }

    private final void i() {
        j95 j95Var = (j95) this.c;
        TLRPC.Updates updates = (TLRPC.Updates) this.d;
        j95Var.getClass();
        TLRPC.Update update = updates.update;
        int i = 0;
        if (update instanceof TL_update.TL_updateNewMessage) {
            TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
            if (message != null && (message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                i = message.id;
            }
        } else if (update instanceof TL_update.TL_updateMessageID) {
            i = ((TL_update.TL_updateMessageID) update).id;
        } else if (updates.updates != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= updates.updates.size()) {
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i2);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                    if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = message2.id;
                        break;
                    }
                    i2++;
                } else {
                    if (update2 instanceof TL_update.TL_updateMessageID) {
                        i = ((TL_update.TL_updateMessageID) update2).id;
                        break;
                    }
                    i2++;
                }
            }
        }
        vc2 vc2Var = j95Var.T2;
        if (vc2Var == null || i == 0) {
            return;
        }
        HashMap hashMap = vc2Var.k;
        Long valueOf = Long.valueOf(this.b);
        uc2 uc2Var = new uc2();
        uc2Var.a = i;
        uc2Var.b = true;
        uc2Var.c = System.currentTimeMillis();
        hashMap.put(valueOf, uc2Var);
        j95Var.E0(true);
    }

    private final void j() {
        ((iw5) this.c).Hd(this.b, (TLRPC.Chat) this.d);
    }

    private final void k() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        Long l = (Long) this.d;
        e S = LaunchActivity.S();
        if (S != null) {
            zu1 ha = zu1.ha(l.longValue());
            S.presentFragment(ha);
            TLRPC.Chat M0 = uc7.s1(launchActivity.P).M0(Long.valueOf(-l.longValue()));
            if (M0 != null) {
                hl.d3(new y06(ha, this.b, M0, (byte) 0), 250L);
            }
        }
    }

    private final void l() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        j16 j16Var = (j16) this.d;
        String str = LaunchActivity.C1;
        hl.c3(new ls5((Object) launchActivity, (Object) jf7.Y(launchActivity.P).g0(this.b), (Object) j16Var, (byte) 10));
    }

    private final void m() {
        uc6 uc6Var = (uc6) this.c;
        TLObject tLObject = (TLObject) this.d;
        if (uc6Var.F != null) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            byte b = 0;
            int i = 0;
            while (i < messages_messages.messages.size()) {
                if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                    messages_messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            uc6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
            uc6Var.getMessagesController().j4(messages_messages.users, false);
            uc6Var.getMessagesController().c4(messages_messages.chats, false);
            zh6 zh6Var = uc6Var.getLocationController().c;
            ArrayList<TLRPC.Message> arrayList = messages_messages.messages;
            long j = this.b;
            zh6Var.k(j, arrayList);
            uc6Var.getNotificationCenter().k(jn7.I4, Long.valueOf(j));
            uc6Var.j0(messages_messages.messages);
            uc6Var.getLocationController().j(uc6Var.m0);
            if (uc6Var.Q0 == null) {
                dc6 dc6Var = new dc6(uc6Var, b);
                uc6Var.Q0 = dc6Var;
                hl.d3(dc6Var, 5000L);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05cb A[Catch: Exception -> 0x05ef, all -> 0x05f3, TryCatch #0 {Exception -> 0x05ef, blocks: (B:184:0x03f2, B:185:0x03f8, B:280:0x056f, B:283:0x0585, B:285:0x058f, B:289:0x0597, B:291:0x05a1, B:296:0x05ab, B:298:0x05cb, B:299:0x05d2, B:301:0x05d8, B:302:0x05de), top: B:183:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x05d8 A[Catch: Exception -> 0x05ef, all -> 0x05f3, TryCatch #0 {Exception -> 0x05ef, blocks: (B:184:0x03f2, B:185:0x03f8, B:280:0x056f, B:283:0x0585, B:285:0x058f, B:289:0x0597, B:291:0x05a1, B:296:0x05ab, B:298:0x05cb, B:299:0x05d2, B:301:0x05d8, B:302:0x05de), top: B:183:0x03f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05dd  */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v4, types: [boolean, int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        SQLiteCursor sQLiteCursor;
        Consumer consumer;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        SQLiteCursor sQLiteCursor2;
        SQLiteCursor queryFinalized;
        String str;
        String str2;
        SparseArray sparseArray;
        HashSet hashSet;
        zh6 zh6Var;
        int size;
        int i;
        byte b;
        String str3;
        String str4;
        SparseArray sparseArray2;
        HashSet hashSet2;
        TLRPC.MessageReplyHeader messageReplyHeader;
        NativeByteBuffer byteBufferValue;
        SparseArray sparseArray3;
        HashSet hashSet3;
        int i2;
        ArrayList arrayList3;
        Boolean bool;
        byte b2 = 6;
        int i3 = 2;
        int i4 = 1;
        ?? r9 = 0;
        switch (this.a) {
            case 0:
                jn7.f(((af2) this.c).currentAccount).k(68, Long.valueOf(this.b), (TLRPC.UserFull) this.d);
                return;
            case 1:
                id6 id6Var = (id6) this.c;
                long j = this.b;
                TLObject tLObject = (TLObject) this.d;
                id6Var.H.e(j);
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                int i5 = 0;
                while (i5 < messages_messages.messages.size()) {
                    if (!(messages_messages.messages.get(i5).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                        messages_messages.messages.remove(i5);
                        i5--;
                    }
                    i5++;
                }
                id6Var.getMessagesStorage().j1(messages_messages.users, messages_messages.chats, true, true);
                id6Var.getMessagesController().j4(messages_messages.users, false);
                id6Var.getMessagesController().c4(messages_messages.chats, false);
                id6Var.c.k(j, messages_messages.messages);
                jn7.e().k(jn7.I4, Long.valueOf(j), Integer.valueOf(id6Var.currentAccount));
                return;
            case 2:
                uc7 uc7Var = (uc7) this.c;
                long j2 = this.b;
                TL_update.TL_updateMessageWidgetData tL_updateMessageWidgetData = (TL_update.TL_updateMessageWidgetData) this.d;
                int i6 = uc7Var.currentAccount;
                int i7 = tL_updateMessageWidgetData.msg_id;
                String str5 = tL_updateMessageWidgetData.public_data;
                long j3 = tL_updateMessageWidgetData.public_data_hash;
                String str6 = tL_updateMessageWidgetData.chat_data;
                for (h0d h0dVar : k0d.a.values()) {
                    if (!h0dVar.k && h0dVar.b == i6 && h0dVar.c == j2 && h0dVar.d == i7) {
                        if (str5 != null) {
                            h0dVar.s = j3;
                            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = h0dVar.t;
                            if (tL_messageMediaWidget != null) {
                                tL_messageMediaWidget.public_data_hash = j3;
                            }
                        }
                        k0d.a(h0dVar, str6 != null ? k0d.D(str6) : h0dVar.q, str5 != null ? k0d.D(str5) : h0dVar.r);
                    }
                }
                return;
            case 3:
                uc7 uc7Var2 = (uc7) this.c;
                TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) this.d;
                long j4 = this.b;
                uc7Var2.j4(tL_chatInviteJoinResultWebView.users, false);
                bq0.b(uc7Var2.currentAccount).c(-j4, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                return;
            case 4:
                uc7 uc7Var3 = (uc7) this.c;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) this.d;
                long j5 = this.b;
                uc7Var3.j4(tL_messages_invitedUsers.updates.users, false);
                uc7Var3.c4(tL_messages_invitedUsers.updates.chats, false);
                jj.f(uc7Var3.currentAccount, uc7Var3.M0(Long.valueOf(j5)), tL_messages_invitedUsers);
                return;
            case 5:
                jf7 jf7Var = (jf7) this.c;
                long j6 = this.b;
                Consumer consumer2 = (Consumer) this.d;
                String str7 = ")";
                String str8 = " AND mid IN (";
                try {
                    SQLiteDatabase sQLiteDatabase = jf7Var.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT top_message, data, topic_message, unread_count, max_read_id, unread_mentions, unread_reactions, read_outbox, pinned, total_messages_count, nopaid_messages_exception, unread_poll_votes FROM topics WHERE did = " + j6 + " ORDER BY pinned ASC", new Object[0]);
                    arrayList2 = null;
                    SparseArray sparseArray4 = null;
                    HashSet hashSet4 = null;
                    while (queryFinalized2.next()) {
                        try {
                            if (arrayList2 == null) {
                                try {
                                    try {
                                        ArrayList arrayList4 = new ArrayList();
                                        try {
                                            sparseArray3 = new SparseArray();
                                            hashSet3 = new HashSet();
                                            arrayList2 = arrayList4;
                                        } catch (Exception e) {
                                            e = e;
                                            consumer = consumer2;
                                            sQLiteCursor = queryFinalized2;
                                            z = i4;
                                            arrayList = arrayList4;
                                            try {
                                                jf7Var.n(e, z);
                                                if (sQLiteCursor != null) {
                                                }
                                                arrayList2 = arrayList;
                                                consumer.x(arrayList2);
                                                return;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (sQLiteCursor != null) {
                                                }
                                                throw th;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteCursor = queryFinalized2;
                                        if (sQLiteCursor != null) {
                                            sQLiteCursor.dispose();
                                        }
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    consumer = consumer2;
                                    arrayList = arrayList2;
                                    sQLiteCursor = queryFinalized2;
                                    z = i4;
                                }
                            } else {
                                sparseArray3 = sparseArray4;
                                hashSet3 = hashSet4;
                            }
                            try {
                                int intValue = queryFinalized2.intValue(r9);
                                NativeByteBuffer byteBufferValue2 = queryFinalized2.byteBufferValue(i4);
                                if (byteBufferValue2 != 0) {
                                    i2 = i4;
                                    try {
                                        TLRPC.TL_forumTopic TLdeserialize = TLRPC.TL_forumTopic.TLdeserialize(byteBufferValue2, byteBufferValue2.readInt32(r9), r9);
                                        if (TLdeserialize != null) {
                                            TLdeserialize.top_message = intValue;
                                            ArrayList arrayList5 = (ArrayList) sparseArray3.get(intValue);
                                            if (arrayList5 == null) {
                                                arrayList3 = new ArrayList();
                                                sparseArray3.put(intValue, arrayList3);
                                            } else {
                                                arrayList3 = arrayList5;
                                            }
                                            arrayList3.add(TLdeserialize);
                                            hashSet3.add(Integer.valueOf(intValue));
                                            arrayList2.add(TLdeserialize);
                                            NativeByteBuffer byteBufferValue3 = queryFinalized2.byteBufferValue(i3);
                                            TLdeserialize.topicStartMessage = TLRPC.Message.TLdeserialize(byteBufferValue3, byteBufferValue3.readInt32(false), false);
                                            byteBufferValue3.reuse();
                                            TLdeserialize.unread_count = queryFinalized2.intValue(3);
                                            TLdeserialize.read_inbox_max_id = queryFinalized2.intValue(4);
                                            TLdeserialize.unread_mentions_count = queryFinalized2.intValue(5);
                                            TLdeserialize.unread_reactions_count = queryFinalized2.intValue(6);
                                            TLdeserialize.read_outbox_max_id = queryFinalized2.intValue(7);
                                            int intValue2 = queryFinalized2.intValue(8) - 1;
                                            TLdeserialize.pinnedOrder = intValue2;
                                            TLdeserialize.pinned = intValue2 >= 0 ? i2 : 0;
                                            TLdeserialize.totalMessagesCount = queryFinalized2.intValue(9);
                                            TLdeserialize.nopaid_messages_exception = queryFinalized2.intValue(10) != 0 ? i2 : 0;
                                            TLdeserialize.unread_poll_votes_count = queryFinalized2.intValue(11);
                                        }
                                        byteBufferValue2.reuse();
                                    } catch (Exception e3) {
                                        e = e3;
                                        consumer = consumer2;
                                        arrayList = arrayList2;
                                        sQLiteCursor = queryFinalized2;
                                        z = i2;
                                        jf7Var.n(e, z);
                                        if (sQLiteCursor != null) {
                                        }
                                        arrayList2 = arrayList;
                                        consumer.x(arrayList2);
                                        return;
                                    }
                                } else {
                                    i2 = i4;
                                }
                                sparseArray4 = sparseArray3;
                                hashSet4 = hashSet3;
                                i4 = i2;
                                i3 = 2;
                                r9 = 0;
                            } catch (Exception e4) {
                                e = e4;
                                i2 = i4;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            consumer = consumer2;
                            sQLiteCursor2 = queryFinalized2;
                        } catch (Throwable th3) {
                            th = th3;
                            sQLiteCursor2 = queryFinalized2;
                        }
                    }
                    int i8 = i4;
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = new ArrayList();
                    zh6 zh6Var2 = new zh6();
                    zh6 zh6Var3 = new zh6();
                    if (arrayList2 == null || arrayList2.isEmpty()) {
                        consumer = consumer2;
                        sQLiteCursor2 = queryFinalized2;
                    } else {
                        SQLiteDatabase sQLiteDatabase2 = jf7Var.b;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT mid, data, replydata FROM messages_v2 WHERE uid = ");
                        sb.append(j6);
                        sb.append(" AND mid IN (");
                        sQLiteCursor2 = queryFinalized2;
                        HashSet hashSet5 = hashSet4;
                        try {
                            try {
                                sb.append(TextUtils.join(",", hashSet5));
                                sb.append(")");
                                String sb2 = sb.toString();
                                consumer = consumer2;
                                int i9 = 0;
                                try {
                                    queryFinalized = sQLiteDatabase2.queryFinalized(sb2, new Object[0]);
                                    while (queryFinalized.next()) {
                                        try {
                                            int intValue3 = queryFinalized.intValue(i9);
                                            NativeByteBuffer byteBufferValue4 = queryFinalized.byteBufferValue(i8);
                                            if (byteBufferValue4 != null) {
                                                arrayList = arrayList2;
                                                try {
                                                    TLRPC.Message TLdeserialize2 = TLRPC.Message.TLdeserialize(byteBufferValue4, byteBufferValue4.readInt32(false), false);
                                                    if (TLdeserialize2 != null) {
                                                        str3 = str7;
                                                        str4 = str8;
                                                        TLdeserialize2.readAttachPath(byteBufferValue4, yac.h(jf7Var.currentAccount).n);
                                                    } else {
                                                        str3 = str7;
                                                        str4 = str8;
                                                    }
                                                    byteBufferValue4.reuse();
                                                    hashSet5.remove(Integer.valueOf(intValue3));
                                                    sparseArray2 = sparseArray4;
                                                    ArrayList arrayList8 = (ArrayList) sparseArray2.get(intValue3);
                                                    if (arrayList8 != null) {
                                                        for (int i10 = 0; i10 < arrayList8.size(); i10++) {
                                                            ((TLRPC.TL_forumTopic) arrayList8.get(i10)).topMessage = TLdeserialize2;
                                                        }
                                                    }
                                                    jf7.d(TLdeserialize2, arrayList6, arrayList7, null);
                                                    try {
                                                        messageReplyHeader = TLdeserialize2.reply_to;
                                                    } catch (Exception e6) {
                                                        e = e6;
                                                        hashSet2 = hashSet5;
                                                    }
                                                    if (messageReplyHeader != null && messageReplyHeader.reply_to_msg_id != 0 && jf7.s0(TLdeserialize2.action)) {
                                                        if (queryFinalized.isNull(2) || (byteBufferValue = queryFinalized.byteBufferValue(2)) == null) {
                                                            hashSet2 = hashSet5;
                                                        } else {
                                                            TLRPC.Message TLdeserialize3 = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                                            TLdeserialize2.replyMessage = TLdeserialize3;
                                                            hashSet2 = hashSet5;
                                                            try {
                                                                TLdeserialize3.readAttachPath(byteBufferValue, jf7Var.getUserConfig().n);
                                                                byteBufferValue.reuse();
                                                                TLRPC.Message message = TLdeserialize2.replyMessage;
                                                                if (message != null) {
                                                                    jf7.d(message, arrayList6, arrayList7, null);
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                jf7Var.n(e, true);
                                                                sparseArray4 = sparseArray2;
                                                                hashSet5 = hashSet2;
                                                                arrayList2 = arrayList;
                                                                str7 = str3;
                                                                str8 = str4;
                                                                i9 = 0;
                                                                i8 = 1;
                                                            }
                                                        }
                                                        if (TLdeserialize2.replyMessage == null) {
                                                            jf7.c(TLdeserialize2, zh6Var2, zh6Var3);
                                                        }
                                                        sparseArray4 = sparseArray2;
                                                        hashSet5 = hashSet2;
                                                        arrayList2 = arrayList;
                                                        str7 = str3;
                                                        str8 = str4;
                                                        i9 = 0;
                                                        i8 = 1;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    sQLiteCursor = sQLiteCursor2;
                                                    z = 1;
                                                    jf7Var.n(e, z);
                                                    if (sQLiteCursor != null) {
                                                    }
                                                    arrayList2 = arrayList;
                                                    consumer.x(arrayList2);
                                                    return;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                                str3 = str7;
                                                str4 = str8;
                                                sparseArray2 = sparseArray4;
                                            }
                                            hashSet2 = hashSet5;
                                            sparseArray4 = sparseArray2;
                                            hashSet5 = hashSet2;
                                            arrayList2 = arrayList;
                                            str7 = str3;
                                            str8 = str4;
                                            i9 = 0;
                                            i8 = 1;
                                        } catch (Exception e9) {
                                            e = e9;
                                            arrayList = arrayList2;
                                            sQLiteCursor = sQLiteCursor2;
                                            z = 1;
                                            jf7Var.n(e, z);
                                            if (sQLiteCursor != null) {
                                            }
                                            arrayList2 = arrayList;
                                            consumer.x(arrayList2);
                                            return;
                                        }
                                    }
                                    arrayList = arrayList2;
                                    str = str7;
                                    str2 = str8;
                                    sparseArray = sparseArray4;
                                    hashSet = hashSet5;
                                } catch (Exception e10) {
                                    e = e10;
                                    arrayList = arrayList2;
                                    z = 1;
                                    sQLiteCursor = sQLiteCursor2;
                                    jf7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    arrayList2 = arrayList;
                                    consumer.x(arrayList2);
                                    return;
                                }
                                try {
                                    queryFinalized.dispose();
                                    if (!hashSet.isEmpty()) {
                                        ?? r8 = 0;
                                        SQLiteCursor queryFinalized3 = jf7Var.b.queryFinalized("SELECT mid, data FROM messages_topics WHERE uid = " + j6 + str2 + TextUtils.join(",", hashSet) + str, new Object[0]);
                                        while (queryFinalized3.next()) {
                                            try {
                                                int intValue4 = queryFinalized3.intValue(r8);
                                                NativeByteBuffer byteBufferValue5 = queryFinalized3.byteBufferValue(1);
                                                if (byteBufferValue5 != 0) {
                                                    TLRPC.Message TLdeserialize4 = TLRPC.Message.TLdeserialize(byteBufferValue5, byteBufferValue5.readInt32(r8), r8);
                                                    if (TLdeserialize4 != null) {
                                                        zh6Var = zh6Var3;
                                                        try {
                                                            TLdeserialize4.readAttachPath(byteBufferValue5, yac.h(jf7Var.currentAccount).n);
                                                        } catch (Exception e11) {
                                                            e = e11;
                                                            jf7Var.n(e, true);
                                                            size = arrayList.size();
                                                            i = 0;
                                                            while (i < size) {
                                                            }
                                                            arrayList2 = arrayList;
                                                            jf7Var.H0(zh6Var2, zh6Var, arrayList6, arrayList7, 0);
                                                            ArrayList arrayList9 = new ArrayList();
                                                            ArrayList arrayList10 = new ArrayList();
                                                            if (!arrayList7.isEmpty()) {
                                                            }
                                                            if (arrayList6.isEmpty()) {
                                                            }
                                                            hl.c3(new ud7(jf7Var, arrayList10, arrayList9, b));
                                                            jf7Var.G0(arrayList2, j6);
                                                            sQLiteCursor2.dispose();
                                                            consumer.x(arrayList2);
                                                            return;
                                                        }
                                                    } else {
                                                        zh6Var = zh6Var3;
                                                    }
                                                    byteBufferValue5.reuse();
                                                    hashSet.remove(Integer.valueOf(intValue4));
                                                    jf7.d(TLdeserialize4, arrayList6, arrayList7, null);
                                                    ArrayList arrayList11 = (ArrayList) sparseArray.get(intValue4);
                                                    if (arrayList11 != null) {
                                                        for (int i11 = 0; i11 < arrayList11.size(); i11++) {
                                                            ((TLRPC.TL_forumTopic) arrayList11.get(i11)).topMessage = TLdeserialize4;
                                                        }
                                                    }
                                                } else {
                                                    zh6Var = zh6Var3;
                                                }
                                                zh6Var3 = zh6Var;
                                                r8 = 0;
                                            } catch (Exception e12) {
                                                e = e12;
                                                zh6Var = zh6Var3;
                                            }
                                        }
                                    }
                                    zh6Var = zh6Var3;
                                    size = arrayList.size();
                                    i = 0;
                                    while (i < size) {
                                        ArrayList arrayList12 = arrayList;
                                        Object obj = arrayList12.get(i);
                                        i++;
                                        long n = wf3.n(((TLRPC.TL_forumTopic) obj).from_id);
                                        if (n != 0) {
                                            if (n > 0) {
                                                if (!arrayList6.contains(Long.valueOf(n))) {
                                                    arrayList6.add(Long.valueOf(n));
                                                }
                                            } else if (!arrayList7.contains(Long.valueOf(n))) {
                                                arrayList7.add(Long.valueOf(n));
                                            }
                                        }
                                        arrayList = arrayList12;
                                    }
                                    arrayList2 = arrayList;
                                    jf7Var.H0(zh6Var2, zh6Var, arrayList6, arrayList7, 0);
                                    ArrayList arrayList92 = new ArrayList();
                                    ArrayList arrayList102 = new ArrayList();
                                    if (!arrayList7.isEmpty()) {
                                        jf7Var.P(TextUtils.join(",", arrayList7), arrayList92);
                                    }
                                    if (arrayList6.isEmpty()) {
                                        b = 0;
                                        jf7Var.k0(arrayList6, arrayList102, false);
                                    } else {
                                        b = 0;
                                    }
                                    hl.c3(new ud7(jf7Var, arrayList102, arrayList92, b));
                                    jf7Var.G0(arrayList2, j6);
                                } catch (Exception e13) {
                                    e = e13;
                                    z = 1;
                                    sQLiteCursor = sQLiteCursor2;
                                    jf7Var.n(e, z);
                                    if (sQLiteCursor != null) {
                                    }
                                    arrayList2 = arrayList;
                                    consumer.x(arrayList2);
                                    return;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                consumer = consumer2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            sQLiteCursor = sQLiteCursor2;
                            if (sQLiteCursor != null) {
                            }
                            throw th;
                        }
                    }
                    sQLiteCursor2.dispose();
                } catch (Exception e15) {
                    e = e15;
                    consumer = consumer2;
                    sQLiteCursor = null;
                    arrayList = null;
                } catch (Throwable th5) {
                    th = th5;
                    sQLiteCursor = null;
                }
                consumer.x(arrayList2);
                return;
            case 6:
                ip7 ip7Var = (ip7) this.c;
                long j7 = this.b;
                tp8 tp8Var = (tp8) this.d;
                HashSet hashSet6 = new HashSet();
                Iterator<Map.Entry<String, ?>> it = uc7.s1(ip7Var.currentAccount).W3.getAll().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (key.startsWith("notify2_" + j7)) {
                        Integer z2 = Utilities.z(key.replace("notify2_" + j7, ""));
                        int intValue5 = z2.intValue();
                        if (intValue5 != 0 && ip7Var.getMessagesController().p2(j7, intValue5, null) != ip7Var.getMessagesController().p2(j7, 0L, null)) {
                            hashSet6.add(z2);
                        }
                    }
                }
                hl.c3(new pl7(tp8Var, hashSet6, b2));
                return;
            case 7:
                wx9 wx9Var = (wx9) this.c;
                TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.d;
                long j8 = this.b;
                wx9Var.getClass();
                if (tL_dialog.folder_id == 1) {
                    SharedPreferences.Editor edit = uc7.s1(wx9Var.currentAccount).W3.edit();
                    edit.putBoolean("dialog_bar_archived" + j8, true);
                    edit.commit();
                }
                wx9Var.getMessagesController().R.k(tL_dialog.id, tL_dialog);
                wx9Var.getMessagesController().y.add(tL_dialog);
                wx9Var.getMessagesController().h5(null);
                wx9Var.getNotificationCenter().k(3, new Object[0]);
                return;
            case 8:
                a5c a5cVar = (a5c) this.c;
                jn7.f(a5cVar.currentAccount).k(jn7.M1, (r47) this.d, Boolean.FALSE, Boolean.valueOf(a5cVar.A(this.b)));
                return;
            case 9:
                a5c a5cVar2 = (a5c) this.c;
                long j9 = this.b;
                String str9 = (String) this.d;
                synchronized (a5cVar2) {
                    a5cVar2.d.put(Long.valueOf(j9), str9);
                    LongSparseArray longSparseArray = a5cVar2.a;
                    bool = Boolean.TRUE;
                    longSparseArray.put(j9, bool);
                    a5cVar2.H();
                }
                jn7.f(a5cVar2.currentAccount).k(jn7.P1, Long.valueOf(j9), bool);
                return;
            case 10:
                boolean[] zArr = (boolean[]) this.c;
                long j10 = this.b;
                y41[] y41VarArr = (y41[]) this.d;
                zArr[0] = false;
                if (j10 == -1) {
                    y41VarArr[0].setText(ob6.M0(2131743568, null));
                    yob.X(y41VarArr[0], aob.p7, null);
                    return;
                } else {
                    y41VarArr[0].setText(ob6.a0(null, null, 2131746962, Long.valueOf(j10)));
                    yob.X(y41VarArr[0], aob.w6, null);
                    return;
                }
            case 11:
                n20 n20Var = (n20) this.c;
                long j11 = this.b;
                Exception exc = (Exception) this.d;
                i30 i30Var = (i30) n20Var.c;
                if (j11 == i30Var.o) {
                    i30Var.n = null;
                    int i12 = i30Var.G;
                    if (i12 != 10 && i12 != 9) {
                        i30Var.g(exc);
                        return;
                    }
                    i30Var.h.a("capture error after session end", exc);
                    i30Var.c();
                    i30Var.t();
                    return;
                }
                return;
            case 12:
                z21 z21Var = (z21) this.c;
                e eVar = (e) this.d;
                long j12 = this.b;
                if (z21Var != null) {
                    z21Var.run();
                }
                if (eVar != null) {
                    eVar.presentFragment(zu1.ha(j12));
                    return;
                }
                return;
            case 13:
                long[] jArr = (long[]) this.c;
                long j13 = this.b;
                l77 l77Var = (l77) this.d;
                jArr[0] = j13;
                l77Var.run();
                return;
            case 14:
                zu1 zu1Var = (zu1) this.c;
                zu1Var.getMessagesController().o0(this.b, ((r47) this.d).e1(), zu1Var.l6);
                return;
            case 15:
                a();
                return;
            case 16:
                b();
                return;
            case 17:
                c();
                return;
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                f();
                return;
            case 21:
                g();
                return;
            case 22:
                ov4 ov4Var = (ov4) this.c;
                lv4 lv4Var = (lv4) this.d;
                long j14 = this.b;
                lv4Var.d = null;
                ov4Var.m(j14);
                return;
            case 23:
                h();
                return;
            case 24:
                i();
                return;
            case 25:
                j();
                return;
            case 26:
                k();
                return;
            case 27:
                l();
                return;
            case 28:
                m();
                return;
            default:
                ls6 ls6Var = (ls6) this.c;
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.d;
                long j15 = this.b;
                ls6Var.getClass();
                try {
                    SQLitePreparedStatement executeFast = ls6Var.getMessagesStorage().b.executeFast("REPLACE INTO bot_info_v2 VALUES(?, ?, ?)");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(botInfo.getObjectSize());
                    botInfo.serializeToStream(nativeByteBuffer);
                    executeFast.bindLong(1, botInfo.user_id);
                    executeFast.bindLong(2, j15);
                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                    executeFast.step();
                    nativeByteBuffer.reuse();
                    executeFast.dispose();
                    return;
                } catch (Exception e16) {
                    cc4.g(e16, true);
                    return;
                }
        }
    }

    public /* synthetic */ ue2(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
    }
}
