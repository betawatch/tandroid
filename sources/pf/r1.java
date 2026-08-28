package pf;

import android.text.TextUtils;
import ih.q5;
import java.util.ArrayList;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.lg;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.y01;
import org.telegram.ui.ai1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 {
    public static volatile r1[] g = new r1[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            h[i9] = new Object();
        }
    }

    public r1(int i9) {
        this.a = i9;
    }

    public static r1 f(int i9) {
        r1 r1Var;
        r1 r1Var2 = g[i9];
        if (r1Var2 != null) {
            return r1Var2;
        }
        synchronized (h[i9]) {
            try {
                r1Var = g[i9];
                if (r1Var == null) {
                    r1[] r1VarArr = g;
                    r1 r1Var3 = new r1(i9);
                    r1VarArr[i9] = r1Var3;
                    r1Var = r1Var3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r1Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        q1 q1Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                q1Var = null;
                break;
            }
            Object obj = arrayList.get(i9);
            i9++;
            q1Var = (q1) obj;
            if (TextUtils.equals(str, q1Var.b)) {
                break;
            }
        }
        if (q1Var != null) {
            arrayList.remove(q1Var);
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

    public final q1 c(long j10) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            q1 q1Var = (q1) obj;
            if (q1Var.a == j10) {
                return q1Var;
            }
        }
        return null;
    }

    public final q1 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            q1 q1Var = (q1) obj;
            if (TextUtils.equals(str, q1Var.b)) {
                return q1Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i9 >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((q1) arrayList2.get(i9)).b)) {
                arrayList.add((q1) arrayList2.get(i9));
            }
            i9++;
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
    public final void i(Runnable runnable, boolean z10) {
        String substring;
        long j10;
        long j11;
        int i9;
        long j12;
        long j13;
        long j14;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i10 = 1;
        this.e = true;
        int i11 = this.a;
        if (z10) {
            MessagesStorage messagesStorage = MessagesStorage.getInstance(i11);
            messagesStorage.getStorageQueue().postRunnable(new lg((Object) this, messagesStorage, UserConfig.getInstance(i11).getClientUserId(), runnable, 12));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        long j15 = 0;
        tL_messages_getQuickReplies.hash = 0L;
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i13 >= arrayList.size()) {
                ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getQuickReplies, new bf.a(this, 27));
                return;
            }
            q1 q1Var = (q1) arrayList.get(i13);
            long calcHash = MediaDataController.calcHash(tL_messages_getQuickReplies.hash, q1Var.a);
            tL_messages_getQuickReplies.hash = calcHash;
            String str = q1Var.b;
            if (str == null) {
                j10 = j15;
            } else {
                substring = Utilities.MD5(str).substring(i12, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                long j16 = 16;
                if (j16 >= j15) {
                    long j17 = (Long.MAX_VALUE / j16) << i10;
                    j10 = j15;
                    j11 = j17 + ((((-1) - (j17 * j16)) ^ Long.MIN_VALUE) >= (j16 ^ Long.MIN_VALUE) ? 1 : 0);
                } else if (Long.MAX_VALUE < (j16 ^ Long.MIN_VALUE)) {
                    j10 = j15;
                    j11 = j10;
                } else {
                    j11 = 1;
                    j10 = j15;
                }
                int i14 = (substring.charAt(i12) != '+' || length <= i10) ? 0 : 1;
                long j18 = j10;
                while (i14 < length) {
                    int digit = Character.digit(substring.charAt(i14), 16);
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
                            i9 = i13;
                            j13 = -1;
                            if (digit <= ((int) j13)) {
                                break loop0;
                            }
                        } else {
                            j12 = (-1) - j16;
                        }
                        i9 = i13;
                        j13 = j12;
                        if (digit <= ((int) j13)) {
                        }
                    } else {
                        i9 = i13;
                    }
                    j18 = (j18 * j16) + digit;
                    i14++;
                    i13 = i9;
                }
                j15 = j18;
            }
            int i15 = i13;
            long calcHash2 = MediaDataController.calcHash(calcHash, j15);
            tL_messages_getQuickReplies.hash = calcHash2;
            long calcHash3 = MediaDataController.calcHash(calcHash2, q1Var.e == null ? j10 : r6.getId());
            tL_messages_getQuickReplies.hash = calcHash3;
            MessageObject messageObject = q1Var.e;
            if (messageObject == null || (message = messageObject.messageOwner) == null || (message.flags & 32768) == 0) {
                j14 = j10;
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, j14);
            } else {
                tL_messages_getQuickReplies.hash = MediaDataController.calcHash(calcHash3, message.edit_date);
                j14 = j10;
            }
            i13 = i15 + 1;
            j15 = j14;
            i10 = 1;
            i12 = 0;
        }
        throw new NumberFormatException("Too large for unsigned long: ".concat(substring.toString()));
    }

    public final boolean j(final TLRPC.Update update, String str, int i9) {
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new y01(this, ((TL_update.TL_updateQuickReplyMessage) update).message, str, i9, 13));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final int i10 = 0;
            b(new Runnable(this) { // from class: pf.p1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q1 q1Var;
                    switch (i10) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.b;
                            ArrayList arrayList2 = r1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i11);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= arrayList3.size()) {
                                        q1Var = null;
                                    } else if (((q1) arrayList3.get(i12)).a == tL_quickReply.shortcut_id) {
                                        q1Var = (q1) arrayList3.get(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.a = tL_quickReply.shortcut_id;
                                q1Var.b = tL_quickReply.shortcut;
                                q1Var.f = tL_quickReply.count;
                                q1Var.c = i11;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            r1 r1Var2 = this.b;
                            ArrayList arrayList4 = r1Var2.b;
                            int i13 = r1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    break;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.a = tL_quickReply2.shortcut_id;
                                q1Var2.b = tL_quickReply2.shortcut;
                                q1Var2.f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            r1 r1Var3 = this.b;
                            int i15 = r1Var3.a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.b.remove(c11);
                                r1Var3.a(c11.b);
                                int i16 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            r1 r1Var4 = this.b;
                            int i17 = r1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    r1Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                    messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
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
            final int i11 = 1;
            b(new Runnable(this) { // from class: pf.p1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q1 q1Var;
                    switch (i11) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.b;
                            ArrayList arrayList2 = r1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i112 = 0; i112 < arrayList.size(); i112++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i112);
                                int i12 = 0;
                                while (true) {
                                    if (i12 >= arrayList3.size()) {
                                        q1Var = null;
                                    } else if (((q1) arrayList3.get(i12)).a == tL_quickReply.shortcut_id) {
                                        q1Var = (q1) arrayList3.get(i12);
                                    } else {
                                        i12++;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.a = tL_quickReply.shortcut_id;
                                q1Var.b = tL_quickReply.shortcut;
                                q1Var.f = tL_quickReply.count;
                                q1Var.c = i112;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            r1 r1Var2 = this.b;
                            ArrayList arrayList4 = r1Var2.b;
                            int i13 = r1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    break;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.a = tL_quickReply2.shortcut_id;
                                q1Var2.b = tL_quickReply2.shortcut;
                                q1Var2.f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            r1 r1Var3 = this.b;
                            int i15 = r1Var3.a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.b.remove(c11);
                                r1Var3.a(c11.b);
                                int i16 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            r1 r1Var4 = this.b;
                            int i17 = r1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    r1Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                    messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
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
            final int i12 = 2;
            b(new Runnable(this) { // from class: pf.p1
                public final /* synthetic */ r1 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    q1 q1Var;
                    switch (i12) {
                        case 0:
                            ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                            r1 r1Var = this.b;
                            ArrayList arrayList2 = r1Var.b;
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList2.clear();
                            for (int i112 = 0; i112 < arrayList.size(); i112++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList.get(i112);
                                int i122 = 0;
                                while (true) {
                                    if (i122 >= arrayList3.size()) {
                                        q1Var = null;
                                    } else if (((q1) arrayList3.get(i122)).a == tL_quickReply.shortcut_id) {
                                        q1Var = (q1) arrayList3.get(i122);
                                    } else {
                                        i122++;
                                    }
                                }
                                if (q1Var == null) {
                                    q1Var = new q1();
                                }
                                q1Var.a = tL_quickReply.shortcut_id;
                                q1Var.b = tL_quickReply.shortcut;
                                q1Var.f = tL_quickReply.count;
                                q1Var.c = i112;
                                q1Var.d = tL_quickReply.top_message;
                                MessageObject messageObject = q1Var.e;
                                if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                    q1Var.e = null;
                                }
                                arrayList2.add(q1Var);
                                r1Var.a(q1Var.b);
                            }
                            r1Var.l();
                            NotificationCenter.getInstance(r1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 1:
                            r1 r1Var2 = this.b;
                            ArrayList arrayList4 = r1Var2.b;
                            int i13 = r1Var2.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                            q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                            if (c10 != null) {
                                c10.b = tL_quickReply2.shortcut;
                                c10.f = tL_quickReply2.count;
                                c10.d = tL_quickReply2.top_message;
                                MessageObject messageObject2 = c10.e;
                                if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                    c10.e = null;
                                    long clientUserId = UserConfig.getInstance(i13).getClientUserId();
                                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i13);
                                    messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                    break;
                                }
                            } else {
                                q1 q1Var2 = new q1();
                                q1Var2.a = tL_quickReply2.shortcut_id;
                                q1Var2.b = tL_quickReply2.shortcut;
                                q1Var2.f = tL_quickReply2.count;
                                q1Var2.d = tL_quickReply2.top_message;
                                for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                    ((q1) arrayList4.get(i14)).c = i14;
                                }
                                arrayList4.add(q1Var2);
                                r1Var2.a(q1Var2.b);
                            }
                            r1Var2.l();
                            NotificationCenter.getInstance(i13).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        case 2:
                            r1 r1Var3 = this.b;
                            int i15 = r1Var3.a;
                            q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                            if (c11 != null) {
                                r1Var3.b.remove(c11);
                                r1Var3.a(c11.b);
                                int i16 = c11.a;
                                MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                                messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                                r1Var3.l();
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            }
                            break;
                        default:
                            r1 r1Var4 = this.b;
                            int i17 = r1Var4.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                            q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c12 != null) {
                                int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c12.f = size;
                                if (size <= 0) {
                                    r1Var4.b.remove(c12);
                                }
                                ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                                MessageObject messageObject3 = c12.e;
                                if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                    r1Var4.l();
                                    NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                    break;
                                } else {
                                    c12.e = null;
                                    long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                    MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                    messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
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
        final int i13 = 3;
        b(new Runnable(this) { // from class: pf.p1
            public final /* synthetic */ r1 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q1 q1Var;
                switch (i13) {
                    case 0:
                        ArrayList<TLRPC.TL_quickReply> arrayList = ((TL_update.TL_updateQuickReplies) update).quick_replies;
                        r1 r1Var = this.b;
                        ArrayList arrayList2 = r1Var.b;
                        ArrayList arrayList3 = new ArrayList(arrayList2);
                        arrayList2.clear();
                        for (int i112 = 0; i112 < arrayList.size(); i112++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList.get(i112);
                            int i122 = 0;
                            while (true) {
                                if (i122 >= arrayList3.size()) {
                                    q1Var = null;
                                } else if (((q1) arrayList3.get(i122)).a == tL_quickReply.shortcut_id) {
                                    q1Var = (q1) arrayList3.get(i122);
                                } else {
                                    i122++;
                                }
                            }
                            if (q1Var == null) {
                                q1Var = new q1();
                            }
                            q1Var.a = tL_quickReply.shortcut_id;
                            q1Var.b = tL_quickReply.shortcut;
                            q1Var.f = tL_quickReply.count;
                            q1Var.c = i112;
                            q1Var.d = tL_quickReply.top_message;
                            MessageObject messageObject = q1Var.e;
                            if (messageObject != null && messageObject.getId() != tL_quickReply.top_message) {
                                q1Var.e = null;
                            }
                            arrayList2.add(q1Var);
                            r1Var.a(q1Var.b);
                        }
                        r1Var.l();
                        NotificationCenter.getInstance(r1Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 1:
                        r1 r1Var2 = this.b;
                        ArrayList arrayList4 = r1Var2.b;
                        int i132 = r1Var2.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update).quick_reply;
                        q1 c10 = r1Var2.c(tL_quickReply2.shortcut_id);
                        if (c10 != null) {
                            c10.b = tL_quickReply2.shortcut;
                            c10.f = tL_quickReply2.count;
                            c10.d = tL_quickReply2.top_message;
                            MessageObject messageObject2 = c10.e;
                            if (messageObject2 != null && messageObject2.getId() != tL_quickReply2.top_message) {
                                c10.e = null;
                                long clientUserId = UserConfig.getInstance(i132).getClientUserId();
                                MessagesStorage messagesStorage = MessagesStorage.getInstance(i132);
                                messagesStorage.getStorageQueue().postRunnable(new lg(r1Var2, messagesStorage, c10, clientUserId));
                                break;
                            }
                        } else {
                            q1 q1Var2 = new q1();
                            q1Var2.a = tL_quickReply2.shortcut_id;
                            q1Var2.b = tL_quickReply2.shortcut;
                            q1Var2.f = tL_quickReply2.count;
                            q1Var2.d = tL_quickReply2.top_message;
                            for (int i14 = 0; i14 < arrayList4.size(); i14++) {
                                ((q1) arrayList4.get(i14)).c = i14;
                            }
                            arrayList4.add(q1Var2);
                            r1Var2.a(q1Var2.b);
                        }
                        r1Var2.l();
                        NotificationCenter.getInstance(i132).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        break;
                    case 2:
                        r1 r1Var3 = this.b;
                        int i15 = r1Var3.a;
                        q1 c11 = r1Var3.c(((TL_update.TL_updateDeleteQuickReply) update).shortcut_id);
                        if (c11 != null) {
                            r1Var3.b.remove(c11);
                            r1Var3.a(c11.b);
                            int i16 = c11.a;
                            MessagesStorage messagesStorage2 = MessagesStorage.getInstance(i15);
                            messagesStorage2.getStorageQueue().postRunnable(new qd(messagesStorage2, i16, 27));
                            r1Var3.l();
                            NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                            break;
                        }
                        break;
                    default:
                        r1 r1Var4 = this.b;
                        int i17 = r1Var4.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update;
                        q1 c12 = r1Var4.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c12 != null) {
                            int size = c12.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c12.f = size;
                            if (size <= 0) {
                                r1Var4.b.remove(c12);
                            }
                            ArrayList<Integer> arrayList5 = tL_updateDeleteQuickReplyMessages.messages;
                            MessageObject messageObject3 = c12.e;
                            if (!arrayList5.contains(Integer.valueOf(messageObject3 != null ? messageObject3.getId() : c12.d)) && c12.e != null) {
                                r1Var4.l();
                                NotificationCenter.getInstance(i17).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                                break;
                            } else {
                                c12.e = null;
                                long clientUserId2 = UserConfig.getInstance(i17).getClientUserId();
                                MessagesStorage messagesStorage3 = MessagesStorage.getInstance(i17);
                                messagesStorage3.getStorageQueue().postRunnable(new lg(r1Var4, messagesStorage3, c12, clientUserId2));
                                break;
                            }
                        }
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i9, String str) {
        q1 c10 = c(i9);
        if (c10 == null) {
            return;
        }
        c10.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i9;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i10 = this.a;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_editQuickReplyShortcut, new q5(21));
        l();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
    }

    public final void l() {
        MessagesStorage messagesStorage = MessagesStorage.getInstance(this.a);
        messagesStorage.getStorageQueue().postRunnable(new ai1(17, this, messagesStorage));
    }
}
