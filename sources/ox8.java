// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ox8 {
    public static volatile ox8[] g = new ox8[4];
    public static final Object[] h = new Object[4];
    public final int a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public boolean f;

    static {
        for (int i = 0; i < 4; i++) {
            h[i] = new Object();
        }
    }

    public ox8(int i) {
        this.a = i;
    }

    public static ox8 f(int i) {
        ox8 ox8Var;
        ox8 ox8Var2 = g[i];
        if (ox8Var2 != null) {
            return ox8Var2;
        }
        synchronized (h[i]) {
            ox8Var = g[i];
            if (ox8Var == null) {
                ox8[] ox8VarArr = g;
                ox8 ox8Var3 = new ox8(i);
                ox8VarArr[i] = ox8Var3;
                ox8Var = ox8Var3;
            }
        }
        return ox8Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        nx8 nx8Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                nx8Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            nx8Var = (nx8) obj;
            if (TextUtils.equals(str, nx8Var.b)) {
                break;
            }
        }
        if (nx8Var != null) {
            arrayList.remove(nx8Var);
            kk7.f(this.a).k(kk7.E1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final nx8 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nx8 nx8Var = (nx8) obj;
            if (nx8Var.a == j) {
                return nx8Var;
            }
        }
        return null;
    }

    public final nx8 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nx8 nx8Var = (nx8) obj;
            if (TextUtils.equals(str, nx8Var.b)) {
                return nx8Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = this.d;
        arrayList.clear();
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i >= arrayList2.size()) {
                return arrayList;
            }
            if (!g(((nx8) arrayList2.get(i)).b)) {
                arrayList.add((nx8) arrayList2.get(i));
            }
            i++;
        }
    }

    public final void h() {
        i(null, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b0, code lost:
    
        throw new java.lang.NumberFormatException("Too large for unsigned long: ".concat(r11.toString()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Runnable runnable, boolean z) {
        long j;
        TLRPC.Message message;
        if (this.e || this.f) {
            return;
        }
        int i = 1;
        this.e = true;
        int i2 = this.a;
        if (z) {
            ad7 Y = ad7.Y(i2);
            Y.a.c(new m77((Object) this, (Object) Y, y6c.h(i2).e(), (Object) runnable, (byte) 29));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        tL_messages_getQuickReplies.hash = 0L;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplies, new n35(this, (byte) 22));
                return;
            }
            nx8 nx8Var = (nx8) arrayList.get(i4);
            long r = hq6.r(tL_messages_getQuickReplies.hash, nx8Var.a);
            tL_messages_getQuickReplies.hash = r;
            String str = nx8Var.b;
            if (str == null) {
                j = 0;
            } else {
                int i5 = 16;
                String substring = Utilities.a(str).substring(i3, 16);
                int length = substring.length();
                if (length == 0) {
                    throw new NumberFormatException("empty string");
                }
                int i6 = (substring.charAt(i3) != '+' || length <= i) ? i3 : i;
                long j2 = 0;
                while (i6 < length) {
                    int digit = Character.digit(substring.charAt(i6), i5);
                    if (digit == -1) {
                        throw new NumberFormatException(substring.toString());
                    }
                    if (j2 < 0 || j2 > 1152921504606846975L || (j2 == 1152921504606846975L && digit > 15)) {
                        break loop0;
                    }
                    j2 = (j2 << 4) + digit;
                    i6++;
                    length = length;
                    i5 = 16;
                }
                j = j2;
            }
            long r2 = hq6.r(r, j);
            tL_messages_getQuickReplies.hash = r2;
            long r3 = hq6.r(r2, nx8Var.e == null ? 0L : r0.e1());
            tL_messages_getQuickReplies.hash = r3;
            k27 k27Var = nx8Var.e;
            if (k27Var == null || (message = k27Var.k) == null || (message.flags & 32768) == 0) {
                tL_messages_getQuickReplies.hash = hq6.r(r3, 0L);
            } else {
                tL_messages_getQuickReplies.hash = hq6.r(r3, message.edit_date);
            }
            i4++;
            i = 1;
            i3 = 0;
        }
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        final byte b = 1;
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new q76((Object) this, (Object) ((TL_update.TL_updateQuickReplyMessage) update).message, (Object) str, i, (byte) 22));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final byte b2 = 2;
            b(new Runnable(this) { // from class: lx8
                public final /* synthetic */ ox8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx8 nx8Var;
                    byte b3 = b2;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b3) {
                        case 0:
                            int i2 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i3 = c.a;
                                ad7 Y = ad7.Y(i2);
                                Y.a.c(new wa7(Y, i3, (byte) 5));
                                ox8Var.l();
                                kk7.f(i2).k(kk7.E1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i4 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k27Var != null ? k27Var.e1() : c2.d)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i4).k(kk7.E1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = y6c.h(i4).e();
                                    ad7 Y2 = ad7.Y(i4);
                                    Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        nx8Var = null;
                                    } else if (((nx8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        nx8Var = (nx8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i5;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(kk7.E1, new Object[0]);
                            break;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i7 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i7).e();
                                    ad7 Y3 = ad7.Y(i7);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((nx8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i7).k(kk7.E1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final byte b3 = 3;
            b(new Runnable(this) { // from class: lx8
                public final /* synthetic */ ox8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx8 nx8Var;
                    byte b32 = b3;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i3 = c.a;
                                ad7 Y = ad7.Y(i2);
                                Y.a.c(new wa7(Y, i3, (byte) 5));
                                ox8Var.l();
                                kk7.f(i2).k(kk7.E1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i4 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k27Var != null ? k27Var.e1() : c2.d)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i4).k(kk7.E1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = y6c.h(i4).e();
                                    ad7 Y2 = ad7.Y(i4);
                                    Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        nx8Var = null;
                                    } else if (((nx8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        nx8Var = (nx8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i5;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(kk7.E1, new Object[0]);
                            break;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i7 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i7).e();
                                    ad7 Y3 = ad7.Y(i7);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((nx8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i7).k(kk7.E1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        final byte b4 = 0;
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) { // from class: lx8
                public final /* synthetic */ ox8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    nx8 nx8Var;
                    byte b32 = b4;
                    ox8 ox8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = ox8Var.a;
                            nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                ox8Var.b.remove(c);
                                ox8Var.a(c.b);
                                int i3 = c.a;
                                ad7 Y = ad7.Y(i2);
                                Y.a.c(new wa7(Y, i3, (byte) 5));
                                ox8Var.l();
                                kk7.f(i2).k(kk7.E1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            ox8 ox8Var2 = this.b;
                            int i4 = ox8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    ox8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k27 k27Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k27Var != null ? k27Var.e1() : c2.d)) && c2.e != null) {
                                    ox8Var2.l();
                                    kk7.f(i4).k(kk7.E1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = y6c.h(i4).e();
                                    ad7 Y2 = ad7.Y(i4);
                                    Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = ox8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        nx8Var = null;
                                    } else if (((nx8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        nx8Var = (nx8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (nx8Var == null) {
                                    nx8Var = new nx8();
                                }
                                nx8Var.a = tL_quickReply.shortcut_id;
                                nx8Var.b = tL_quickReply.shortcut;
                                nx8Var.f = tL_quickReply.count;
                                nx8Var.c = i5;
                                nx8Var.d = tL_quickReply.top_message;
                                k27 k27Var2 = nx8Var.e;
                                if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                    nx8Var.e = null;
                                }
                                arrayList3.add(nx8Var);
                                ox8Var.a(nx8Var.b);
                            }
                            ox8Var.l();
                            kk7.f(ox8Var.a).k(kk7.E1, new Object[0]);
                            break;
                        default:
                            ox8 ox8Var3 = this.b;
                            ArrayList arrayList5 = ox8Var3.b;
                            int i7 = ox8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k27 k27Var3 = c3.e;
                                if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = y6c.h(i7).e();
                                    ad7 Y3 = ad7.Y(i7);
                                    Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                nx8 nx8Var2 = new nx8();
                                nx8Var2.a = tL_quickReply2.shortcut_id;
                                nx8Var2.b = tL_quickReply2.shortcut;
                                nx8Var2.f = tL_quickReply2.count;
                                nx8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((nx8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(nx8Var2);
                                ox8Var3.a(nx8Var2.b);
                            }
                            ox8Var3.l();
                            kk7.f(i7).k(kk7.E1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        b(new Runnable(this) { // from class: lx8
            public final /* synthetic */ ox8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                nx8 nx8Var;
                byte b32 = b;
                ox8 ox8Var = this.b;
                TLRPC.Update update2 = update;
                switch (b32) {
                    case 0:
                        int i2 = ox8Var.a;
                        nx8 c = ox8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                        if (c != null) {
                            ox8Var.b.remove(c);
                            ox8Var.a(c.b);
                            int i3 = c.a;
                            ad7 Y = ad7.Y(i2);
                            Y.a.c(new wa7(Y, i3, (byte) 5));
                            ox8Var.l();
                            kk7.f(i2).k(kk7.E1, new Object[0]);
                            break;
                        }
                        break;
                    case 1:
                        ox8 ox8Var2 = this.b;
                        int i4 = ox8Var2.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                        nx8 c2 = ox8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c2 != null) {
                            int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c2.f = size;
                            if (size <= 0) {
                                ox8Var2.b.remove(c2);
                            }
                            ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                            k27 k27Var = c2.e;
                            if (!arrayList.contains(Integer.valueOf(k27Var != null ? k27Var.e1() : c2.d)) && c2.e != null) {
                                ox8Var2.l();
                                kk7.f(i4).k(kk7.E1, new Object[0]);
                                break;
                            } else {
                                c2.e = null;
                                long e = y6c.h(i4).e();
                                ad7 Y2 = ad7.Y(i4);
                                Y2.a.c(new mx8(ox8Var2, Y2, c2, e, (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 2:
                        ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                        ArrayList arrayList3 = ox8Var.b;
                        ArrayList arrayList4 = new ArrayList(arrayList3);
                        arrayList3.clear();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= arrayList4.size()) {
                                    nx8Var = null;
                                } else if (((nx8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                    nx8Var = (nx8) arrayList4.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                            if (nx8Var == null) {
                                nx8Var = new nx8();
                            }
                            nx8Var.a = tL_quickReply.shortcut_id;
                            nx8Var.b = tL_quickReply.shortcut;
                            nx8Var.f = tL_quickReply.count;
                            nx8Var.c = i5;
                            nx8Var.d = tL_quickReply.top_message;
                            k27 k27Var2 = nx8Var.e;
                            if (k27Var2 != null && k27Var2.e1() != tL_quickReply.top_message) {
                                nx8Var.e = null;
                            }
                            arrayList3.add(nx8Var);
                            ox8Var.a(nx8Var.b);
                        }
                        ox8Var.l();
                        kk7.f(ox8Var.a).k(kk7.E1, new Object[0]);
                        break;
                    default:
                        ox8 ox8Var3 = this.b;
                        ArrayList arrayList5 = ox8Var3.b;
                        int i7 = ox8Var3.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                        nx8 c3 = ox8Var3.c(tL_quickReply2.shortcut_id);
                        if (c3 != null) {
                            c3.b = tL_quickReply2.shortcut;
                            c3.f = tL_quickReply2.count;
                            c3.d = tL_quickReply2.top_message;
                            k27 k27Var3 = c3.e;
                            if (k27Var3 != null && k27Var3.e1() != tL_quickReply2.top_message) {
                                c3.e = null;
                                long e2 = y6c.h(i7).e();
                                ad7 Y3 = ad7.Y(i7);
                                Y3.a.c(new mx8(ox8Var3, Y3, c3, e2, (byte) 0));
                                break;
                            }
                        } else {
                            nx8 nx8Var2 = new nx8();
                            nx8Var2.a = tL_quickReply2.shortcut_id;
                            nx8Var2.b = tL_quickReply2.shortcut;
                            nx8Var2.f = tL_quickReply2.count;
                            nx8Var2.d = tL_quickReply2.top_message;
                            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                ((nx8) arrayList5.get(i8)).c = i8;
                            }
                            arrayList5.add(nx8Var2);
                            ox8Var3.a(nx8Var2.b);
                        }
                        ox8Var3.l();
                        kk7.f(i7).k(kk7.E1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i, String str) {
        nx8 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new ce2((byte) 7));
        l();
        kk7.f(i2).k(kk7.E1, new Object[0]);
    }

    public final void l() {
        ad7 Y = ad7.Y(this.a);
        Y.a.c(new lw8(this, Y, (byte) 4));
    }
}
