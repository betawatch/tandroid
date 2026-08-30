package uf;

import android.text.TextUtils;
import java.util.ArrayList;
import nh.p5;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ci;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ct;
import ph.j8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class p1 {
    public static volatile p1[] g = new p1[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            h[i10] = new Object();
        }
    }

    public p1(int i10) {
        this.a = i10;
    }

    public static p1 f(int i10) {
        p1 p1Var;
        p1 p1Var2 = g[i10];
        if (p1Var2 != null) {
            return p1Var2;
        }
        synchronized (h[i10]) {
            try {
                p1Var = g[i10];
                if (p1Var == null) {
                    p1[] p1VarArr = g;
                    p1 p1Var3 = new p1(i10);
                    p1VarArr[i10] = p1Var3;
                    p1Var = p1Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p1Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        o1 o1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                o1Var = null;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            o1Var = (o1) obj;
            if (TextUtils.equals(str, o1Var.b)) {
                break;
            }
        }
        if (o1Var != null) {
            arrayList.remove(o1Var);
            NotificationCenter.getInstance(this.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final o1 c(long j10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            if (o1Var.a == j10) {
                return o1Var;
            }
        }
        return null;
    }

    public final o1 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            o1 o1Var = (o1) obj;
            if (TextUtils.equals(str, o1Var.b)) {
                return o1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i10 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((o1) arrayList2.get(i10)).b)) {
                arrayList.add((o1) arrayList2.get(i10));
            }
            i10++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x010e A[EDGE_INSN: B:58:0x010e->B:59:0x010e BREAK  A[LOOP:0: B:11:0x003d->B:28:0x0168, LOOP_LABEL: LOOP:0: B:11:0x003d->B:28:0x0168], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z4) {
        String substring;
        long j10;
        long j11;
        int i10;
        long j12;
        long j13;
        long j14;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i11 = 1;
        this.e = true;
        int i12 = this.a;
        if (z4) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
            messagesStorage.getStorageQueue().postRunnable(new ci(this, messagesStorage, UserConfig.getInstance(i12).getClientUserId(), runnable, 12));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j15 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i14 >= arrayList.size()) {
                ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getQuickReplies, new gf.a(this, 27));
                return;
            }
            o1 o1Var = (o1) arrayList.get(i14);
            long calcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, o1Var.a);
            tL_messages_getQuickReplies.hash = calcHash;
            String str = o1Var.b;
            if (str == null) {
                j10 = j15;
            } else {
                substring = Utilities.MD5(str).substring(i13, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j16 = 16;
                if (j16 >= j15) {
                    long j17 = (Long.MAX_VALUE / j16) << i11;
                    j10 = j15;
                    j11 = j17 + ((((-1) - (j17 * j16)) ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? 1 : 0);
                } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                    j10 = j15;
                    j11 = j10;
                } else {
                    j11 = 1;
                    j10 = j15;
                }
                int i15 = (substring.charAt(i13) != '+' || length <= i11) ? 0 : 1;
                long j18 = j10;
                while (i15 < length) {
                    int digit = Character.digit(substring.charAt(i15), 16);
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j18 < j10 || j18 > j11) {
                        break loop0;
                    }
                    if (j18 == j11) {
                        if (j16 >= j15) {
                            long j19 = (-1) - (((Long.MAX_VALUE / j16) << 1) * j16);
                            j12 = j19 - ((j19 ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? j16 : j10);
                        } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                            i10 = i14;
                            j13 = -1;
                            if (digit <= ((int) j13)) {
                                break loop0;
                            }
                        } else {
                            j12 = (-1) - j16;
                        }
                        i10 = i14;
                        j13 = j12;
                        if (digit <= ((int) j13)) {
                        }
                    } else {
                        i10 = i14;
                    }
                    j18 = (j18 * j16) + digit;
                    i15++;
                    i14 = i10;
                }
                j15 = j18;
            }
            int i16 = i14;
            long calcHash2 = MediaDataController.calcHash(calcHash, j15);
            tL_messages_getQuickReplies.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, o1Var.e == null ? j10 : r6.getId());
            tL_messages_getQuickReplies.hash = calcHash3;
            MessageObject messageObject = o1Var.e;
            if (messageObject == null || (message = messageObject.messageOwner) == null || (message.flags & 32768) == 0) {
                j14 = j10;
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, j14);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, message.edit_date);
                j14 = j10;
            }
            i14 = i16 + 1;
            j15 = j14;
            i11 = 1;
            i13 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i10) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new ct(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i10, 16));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i11 = 0;
            b(new Runnable(this) { // from class: uf.n1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o1 o1Var;
                    switch (i11) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.b;
                            ArrayList arrayList2 = p1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i12);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList3.size()) {
                                        o1Var = null;
                                    } else if (((o1) arrayList3.get(i13)).a == tL_quickReply.shortcut_id) {
                                        o1Var = (o1) arrayList3.get(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.a = tL_quickReply.shortcut_id;
                                o1Var.b = tL_quickReply.shortcut;
                                o1Var.f = tL_quickReply.count;
                                o1Var.c = i12;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            ArrayList arrayList4 = p1Var2.b;
                            int i14 = p1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ci(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    break;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.a = tL_quickReply2.shortcut_id;
                                o1Var2.b = tL_quickReply2.shortcut;
                                o1Var2.f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            int i16 = p1Var3.a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.b.remove(c10);
                                p1Var3.a(c10.b);
                                int i17 = c10.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new j8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            int i18 = p1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    p1Var4.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c11.d)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new ci(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final int i12 = 1;
            b(new Runnable(this) { // from class: uf.n1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o1 o1Var;
                    switch (i12) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.b;
                            ArrayList arrayList2 = p1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= arrayList3.size()) {
                                        o1Var = null;
                                    } else if (((o1) arrayList3.get(i13)).a == tL_quickReply.shortcut_id) {
                                        o1Var = (o1) arrayList3.get(i13);
                                    } else {
                                        i13++;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.a = tL_quickReply.shortcut_id;
                                o1Var.b = tL_quickReply.shortcut;
                                o1Var.f = tL_quickReply.count;
                                o1Var.c = i122;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            ArrayList arrayList4 = p1Var2.b;
                            int i14 = p1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ci(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    break;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.a = tL_quickReply2.shortcut_id;
                                o1Var2.b = tL_quickReply2.shortcut;
                                o1Var2.f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            int i16 = p1Var3.a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.b.remove(c10);
                                p1Var3.a(c10.b);
                                int i17 = c10.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new j8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            int i18 = p1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    p1Var4.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c11.d)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new ci(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            final int i13 = 2;
            b(new Runnable(this) { // from class: uf.n1
                public final /* synthetic */ p1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    o1 o1Var;
                    switch (i13) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            p1 p1Var = this.b;
                            ArrayList arrayList2 = p1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i122 = 0; i122 < arrayList.size(); i122++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                                int i132 = 0;
                                while (true) {
                                    if (i132 >= arrayList3.size()) {
                                        o1Var = null;
                                    } else if (((o1) arrayList3.get(i132)).a == tL_quickReply.shortcut_id) {
                                        o1Var = (o1) arrayList3.get(i132);
                                    } else {
                                        i132++;
                                    }
                                }
                                if (o1Var == null) {
                                    o1Var = new o1();
                                }
                                o1Var.a = tL_quickReply.shortcut_id;
                                o1Var.b = tL_quickReply.shortcut;
                                o1Var.f = tL_quickReply.count;
                                o1Var.c = i122;
                                o1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = o1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    o1Var.e = null;
                                }
                                arrayList2.add(o1Var);
                                p1Var.a(o1Var.b);
                            }
                            p1Var.l();
                            NotificationCenter.getInstance(p1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            p1 p1Var2 = this.b;
                            ArrayList arrayList4 = p1Var2.b;
                            int i14 = p1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c3.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long clientUserId = UserConfig.getInstance(i14).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i14);
                                    messagesStorage.getStorageQueue().postRunnable(new ci(p1Var2, messagesStorage, c3, clientUserId, 13));
                                    break;
                                }
                            } else {
                                o1 o1Var2 = new o1();
                                o1Var2.a = tL_quickReply2.shortcut_id;
                                o1Var2.b = tL_quickReply2.shortcut;
                                o1Var2.f = tL_quickReply2.count;
                                o1Var2.d = tL_quickReply2.top_message;
                                for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                    ((o1) arrayList4.get(i15)).c = i15;
                                }
                                arrayList4.add(o1Var2);
                                p1Var2.a(o1Var2.b);
                            }
                            p1Var2.l();
                            NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            p1 p1Var3 = this.b;
                            int i16 = p1Var3.a;
                            o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c10 != null) {
                                p1Var3.b.remove(c10);
                                p1Var3.a(c10.b);
                                int i17 = c10.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                                messagesStorage2.getStorageQueue().postRunnable(new j8(messagesStorage2, i17, 2));
                                p1Var3.l();
                                NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            p1 p1Var4 = this.b;
                            int i18 = p1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c11 != null) {
                                int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c11.f = size;
                                if (size <= 0) {
                                    p1Var4.b.remove(c11);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c11.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c11.d)) && c11.e != null) {
                                    p1Var4.l();
                                    NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c11.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                    messagesStorage3.getStorageQueue().postRunnable(new ci(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        final int i14 = 3;
        b(new Runnable(this) { // from class: uf.n1
            public final /* synthetic */ p1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                o1 o1Var;
                switch (i14) {
                    case 0:
                        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        p1 p1Var = this.b;
                        ArrayList arrayList2 = p1Var.b;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList2.clear();
                        for (int i122 = 0; i122 < arrayList.size(); i122++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i122);
                            int i132 = 0;
                            while (true) {
                                if (i132 >= arrayList3.size()) {
                                    o1Var = null;
                                } else if (((o1) arrayList3.get(i132)).a == tL_quickReply.shortcut_id) {
                                    o1Var = (o1) arrayList3.get(i132);
                                } else {
                                    i132++;
                                }
                            }
                            if (o1Var == null) {
                                o1Var = new o1();
                            }
                            o1Var.a = tL_quickReply.shortcut_id;
                            o1Var.b = tL_quickReply.shortcut;
                            o1Var.f = tL_quickReply.count;
                            o1Var.c = i122;
                            o1Var.d = tL_quickReply.top_message;
                            MessageObject messageObject = o1Var.e;
                            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                o1Var.e = null;
                            }
                            arrayList2.add(o1Var);
                            p1Var.a(o1Var.b);
                        }
                        p1Var.l();
                        NotificationCenter.getInstance(p1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 1:
                        p1 p1Var2 = this.b;
                        ArrayList arrayList4 = p1Var2.b;
                        int i142 = p1Var2.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        o1 c3 = p1Var2.c(tL_quickReply2.shortcut_id);
                        if (c3 != null) {
                            c3.b = tL_quickReply2.shortcut;
                            c3.f = tL_quickReply2.count;
                            c3.d = tL_quickReply2.top_message;
                            MessageObject messageObject2 = c3.e;
                            if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                c3.e = null;
                                long clientUserId = UserConfig.getInstance(i142).getClientUserId();
                                MessagesStorage messagesStorage = MessagesStorage.getInstance(i142);
                                messagesStorage.getStorageQueue().postRunnable(new ci(p1Var2, messagesStorage, c3, clientUserId, 13));
                                break;
                            }
                        } else {
                            o1 o1Var2 = new o1();
                            o1Var2.a = tL_quickReply2.shortcut_id;
                            o1Var2.b = tL_quickReply2.shortcut;
                            o1Var2.f = tL_quickReply2.count;
                            o1Var2.d = tL_quickReply2.top_message;
                            for (int i15 = 0; i15 < arrayList4.size(); i15++) {
                                ((o1) arrayList4.get(i15)).c = i15;
                            }
                            arrayList4.add(o1Var2);
                            p1Var2.a(o1Var2.b);
                        }
                        p1Var2.l();
                        NotificationCenter.getInstance(i142).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 2:
                        p1 p1Var3 = this.b;
                        int i16 = p1Var3.a;
                        o1 c10 = p1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c10 != null) {
                            p1Var3.b.remove(c10);
                            p1Var3.a(c10.b);
                            int i17 = c10.a;
                            MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i16);
                            messagesStorage2.getStorageQueue().postRunnable(new j8(messagesStorage2, i17, 2));
                            p1Var3.l();
                            NotificationCenter.getInstance(i16).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        }
                        break;
                    default:
                        p1 p1Var4 = this.b;
                        int i18 = p1Var4.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        o1 c11 = p1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c11 != null) {
                            int size = c11.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c11.f = size;
                            if (size <= 0) {
                                p1Var4.b.remove(c11);
                            }
                            ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                            MessageObject messageObject3 = c11.e;
                            if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c11.d)) && c11.e != null) {
                                p1Var4.l();
                                NotificationCenter.getInstance(i18).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            } else {
                                c11.e = null;
                                long clientUserId2 = UserConfig.getInstance(i18).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i18);
                                messagesStorage3.getStorageQueue().postRunnable(new ci(p1Var4, messagesStorage3, c11, clientUserId2, 13));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i10, String str) {
        o1 c3 = c(i10);
        if (c3 == null) {
            return;
        }
        c3.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i10;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i11 = this.a;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_editQuickReplyShortcut, new p5(21));
        l();
        NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new v0(2, this, messagesStorage));
    }
}
