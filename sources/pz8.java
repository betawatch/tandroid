// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pz8 {
    public static volatile pz8[] g = new pz8[4];
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

    public pz8(int i) {
        this.a = i;
    }

    public static pz8 f(int i) {
        pz8 pz8Var;
        pz8 pz8Var2 = g[i];
        if (pz8Var2 != null) {
            return pz8Var2;
        }
        synchronized (h[i]) {
            pz8Var = g[i];
            if (pz8Var == null) {
                pz8[] pz8VarArr = g;
                pz8 pz8Var3 = new pz8(i);
                pz8VarArr[i] = pz8Var3;
                pz8Var = pz8Var3;
            }
        }
        return pz8Var;
    }

    public static boolean g(String str) {
        return "hello".equalsIgnoreCase(str) || "away".equalsIgnoreCase(str);
    }

    public final void a(String str) {
        oz8 oz8Var;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                oz8Var = null;
                break;
            }
            Object obj = arrayList.get(i);
            i++;
            oz8Var = (oz8) obj;
            if (TextUtils.equals(str, oz8Var.b)) {
                break;
            }
        }
        if (oz8Var != null) {
            arrayList.remove(oz8Var);
            nm7.f(this.a).k(nm7.F1, new Object[0]);
        }
    }

    public final void b(Runnable runnable) {
        if (this.f) {
            runnable.run();
        } else {
            i(runnable, true);
        }
    }

    public final oz8 c(long j) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oz8 oz8Var = (oz8) obj;
            if (oz8Var.a == j) {
                return oz8Var;
            }
        }
        return null;
    }

    public final oz8 d(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            oz8 oz8Var = (oz8) obj;
            if (TextUtils.equals(str, oz8Var.b)) {
                return oz8Var;
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
            if (!g(((oz8) arrayList2.get(i)).b)) {
                arrayList.add((oz8) arrayList2.get(i));
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
            cf7 Y = cf7.Y(i2);
            Y.a.c(new p97((Object) this, (Object) Y, z8c.h(i2).e(), (Object) runnable, (byte) 29));
            return;
        }
        TLRPC.TL_messages_getQuickReplies tL_messages_getQuickReplies = new TLRPC.TL_messages_getQuickReplies();
        tL_messages_getQuickReplies.hash = 0L;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            ArrayList arrayList = this.b;
            if (i4 >= arrayList.size()) {
                ConnectionsManager.getInstance(i2).sendRequest(tL_messages_getQuickReplies, new r15(this, (byte) 23));
                return;
            }
            oz8 oz8Var = (oz8) arrayList.get(i4);
            long r = hs6.r(tL_messages_getQuickReplies.hash, oz8Var.a);
            tL_messages_getQuickReplies.hash = r;
            String str = oz8Var.b;
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
            long r2 = hs6.r(r, j);
            tL_messages_getQuickReplies.hash = r2;
            long r3 = hs6.r(r2, oz8Var.e == null ? 0L : r0.e1());
            tL_messages_getQuickReplies.hash = r3;
            k47 k47Var = oz8Var.e;
            if (k47Var == null || (message = k47Var.k) == null || (message.flags & 32768) == 0) {
                tL_messages_getQuickReplies.hash = hs6.r(r3, 0L);
            } else {
                tL_messages_getQuickReplies.hash = hs6.r(r3, message.edit_date);
            }
            i4++;
            i = 1;
            i3 = 0;
        }
    }

    public final boolean j(final TLRPC.Update update, String str, int i) {
        final byte b = 1;
        if (update instanceof TL_update.TL_updateQuickReplyMessage) {
            b(new v36((Object) this, (Object) ((TL_update.TL_updateQuickReplyMessage) update).message, (Object) str, i, (byte) 23));
            return true;
        }
        if (update instanceof TL_update.TL_updateQuickReplies) {
            final byte b2 = 2;
            b(new Runnable(this) { // from class: mz8
                public final /* synthetic */ pz8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    oz8 oz8Var;
                    byte b3 = b2;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b3) {
                        case 0:
                            int i2 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i3 = c.a;
                                cf7 Y = cf7.Y(i2);
                                Y.a.c(new xc7(Y, i3, (byte) 5));
                                pz8Var.l();
                                nm7.f(i2).k(nm7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i4 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k47Var != null ? k47Var.e1() : c2.d)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i4).k(nm7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = z8c.h(i4).e();
                                    cf7 Y2 = cf7.Y(i4);
                                    Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        oz8Var = null;
                                    } else if (((oz8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        oz8Var = (oz8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i5;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(nm7.F1, new Object[0]);
                            break;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i7 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i7).e();
                                    cf7 Y3 = cf7.Y(i7);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((oz8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i7).k(nm7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (update instanceof TL_update.TL_updateNewQuickReply) {
            final byte b3 = 3;
            b(new Runnable(this) { // from class: mz8
                public final /* synthetic */ pz8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    oz8 oz8Var;
                    byte b32 = b3;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i3 = c.a;
                                cf7 Y = cf7.Y(i2);
                                Y.a.c(new xc7(Y, i3, (byte) 5));
                                pz8Var.l();
                                nm7.f(i2).k(nm7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i4 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k47Var != null ? k47Var.e1() : c2.d)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i4).k(nm7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = z8c.h(i4).e();
                                    cf7 Y2 = cf7.Y(i4);
                                    Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        oz8Var = null;
                                    } else if (((oz8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        oz8Var = (oz8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i5;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(nm7.F1, new Object[0]);
                            break;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i7 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i7).e();
                                    cf7 Y3 = cf7.Y(i7);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((oz8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i7).k(nm7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        final byte b4 = 0;
        if (update instanceof TL_update.TL_updateDeleteQuickReply) {
            b(new Runnable(this) { // from class: mz8
                public final /* synthetic */ pz8 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    oz8 oz8Var;
                    byte b32 = b4;
                    pz8 pz8Var = this.b;
                    TLRPC.Update update2 = update;
                    switch (b32) {
                        case 0:
                            int i2 = pz8Var.a;
                            oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                            if (c != null) {
                                pz8Var.b.remove(c);
                                pz8Var.a(c.b);
                                int i3 = c.a;
                                cf7 Y = cf7.Y(i2);
                                Y.a.c(new xc7(Y, i3, (byte) 5));
                                pz8Var.l();
                                nm7.f(i2).k(nm7.F1, new Object[0]);
                                break;
                            }
                            break;
                        case 1:
                            pz8 pz8Var2 = this.b;
                            int i4 = pz8Var2.a;
                            TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                            oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                            if (c2 != null) {
                                int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                                c2.f = size;
                                if (size <= 0) {
                                    pz8Var2.b.remove(c2);
                                }
                                ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                                k47 k47Var = c2.e;
                                if (!arrayList.contains(Integer.valueOf(k47Var != null ? k47Var.e1() : c2.d)) && c2.e != null) {
                                    pz8Var2.l();
                                    nm7.f(i4).k(nm7.F1, new Object[0]);
                                    break;
                                } else {
                                    c2.e = null;
                                    long e = z8c.h(i4).e();
                                    cf7 Y2 = cf7.Y(i4);
                                    Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                    break;
                                }
                            }
                            break;
                        case 2:
                            ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                            ArrayList arrayList3 = pz8Var.b;
                            ArrayList arrayList4 = new ArrayList(arrayList3);
                            arrayList3.clear();
                            for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                                TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= arrayList4.size()) {
                                        oz8Var = null;
                                    } else if (((oz8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                        oz8Var = (oz8) arrayList4.get(i6);
                                    } else {
                                        i6++;
                                    }
                                }
                                if (oz8Var == null) {
                                    oz8Var = new oz8();
                                }
                                oz8Var.a = tL_quickReply.shortcut_id;
                                oz8Var.b = tL_quickReply.shortcut;
                                oz8Var.f = tL_quickReply.count;
                                oz8Var.c = i5;
                                oz8Var.d = tL_quickReply.top_message;
                                k47 k47Var2 = oz8Var.e;
                                if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                    oz8Var.e = null;
                                }
                                arrayList3.add(oz8Var);
                                pz8Var.a(oz8Var.b);
                            }
                            pz8Var.l();
                            nm7.f(pz8Var.a).k(nm7.F1, new Object[0]);
                            break;
                        default:
                            pz8 pz8Var3 = this.b;
                            ArrayList arrayList5 = pz8Var3.b;
                            int i7 = pz8Var3.a;
                            TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                            oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                            if (c3 != null) {
                                c3.b = tL_quickReply2.shortcut;
                                c3.f = tL_quickReply2.count;
                                c3.d = tL_quickReply2.top_message;
                                k47 k47Var3 = c3.e;
                                if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                    c3.e = null;
                                    long e2 = z8c.h(i7).e();
                                    cf7 Y3 = cf7.Y(i7);
                                    Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                    break;
                                }
                            } else {
                                oz8 oz8Var2 = new oz8();
                                oz8Var2.a = tL_quickReply2.shortcut_id;
                                oz8Var2.b = tL_quickReply2.shortcut;
                                oz8Var2.f = tL_quickReply2.count;
                                oz8Var2.d = tL_quickReply2.top_message;
                                for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                    ((oz8) arrayList5.get(i8)).c = i8;
                                }
                                arrayList5.add(oz8Var2);
                                pz8Var3.a(oz8Var2.b);
                            }
                            pz8Var3.l();
                            nm7.f(i7).k(nm7.F1, new Object[0]);
                            break;
                    }
                }
            });
            return true;
        }
        if (!(update instanceof TL_update.TL_updateDeleteQuickReplyMessages)) {
            return false;
        }
        b(new Runnable(this) { // from class: mz8
            public final /* synthetic */ pz8 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                oz8 oz8Var;
                byte b32 = b;
                pz8 pz8Var = this.b;
                TLRPC.Update update2 = update;
                switch (b32) {
                    case 0:
                        int i2 = pz8Var.a;
                        oz8 c = pz8Var.c(((TL_update.TL_updateDeleteQuickReply) update2).shortcut_id);
                        if (c != null) {
                            pz8Var.b.remove(c);
                            pz8Var.a(c.b);
                            int i3 = c.a;
                            cf7 Y = cf7.Y(i2);
                            Y.a.c(new xc7(Y, i3, (byte) 5));
                            pz8Var.l();
                            nm7.f(i2).k(nm7.F1, new Object[0]);
                            break;
                        }
                        break;
                    case 1:
                        pz8 pz8Var2 = this.b;
                        int i4 = pz8Var2.a;
                        TL_update.TL_updateDeleteQuickReplyMessages tL_updateDeleteQuickReplyMessages = (TL_update.TL_updateDeleteQuickReplyMessages) update2;
                        oz8 c2 = pz8Var2.c(tL_updateDeleteQuickReplyMessages.shortcut_id);
                        if (c2 != null) {
                            int size = c2.f - tL_updateDeleteQuickReplyMessages.messages.size();
                            c2.f = size;
                            if (size <= 0) {
                                pz8Var2.b.remove(c2);
                            }
                            ArrayList<Integer> arrayList = tL_updateDeleteQuickReplyMessages.messages;
                            k47 k47Var = c2.e;
                            if (!arrayList.contains(Integer.valueOf(k47Var != null ? k47Var.e1() : c2.d)) && c2.e != null) {
                                pz8Var2.l();
                                nm7.f(i4).k(nm7.F1, new Object[0]);
                                break;
                            } else {
                                c2.e = null;
                                long e = z8c.h(i4).e();
                                cf7 Y2 = cf7.Y(i4);
                                Y2.a.c(new nz8(pz8Var2, Y2, c2, e, (byte) 0));
                                break;
                            }
                        }
                        break;
                    case 2:
                        ArrayList<TLRPC.TL_quickReply> arrayList2 = ((TL_update.TL_updateQuickReplies) update2).quick_replies;
                        ArrayList arrayList3 = pz8Var.b;
                        ArrayList arrayList4 = new ArrayList(arrayList3);
                        arrayList3.clear();
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            TLRPC.TL_quickReply tL_quickReply = arrayList2.get(i5);
                            int i6 = 0;
                            while (true) {
                                if (i6 >= arrayList4.size()) {
                                    oz8Var = null;
                                } else if (((oz8) arrayList4.get(i6)).a == tL_quickReply.shortcut_id) {
                                    oz8Var = (oz8) arrayList4.get(i6);
                                } else {
                                    i6++;
                                }
                            }
                            if (oz8Var == null) {
                                oz8Var = new oz8();
                            }
                            oz8Var.a = tL_quickReply.shortcut_id;
                            oz8Var.b = tL_quickReply.shortcut;
                            oz8Var.f = tL_quickReply.count;
                            oz8Var.c = i5;
                            oz8Var.d = tL_quickReply.top_message;
                            k47 k47Var2 = oz8Var.e;
                            if (k47Var2 != null && k47Var2.e1() != tL_quickReply.top_message) {
                                oz8Var.e = null;
                            }
                            arrayList3.add(oz8Var);
                            pz8Var.a(oz8Var.b);
                        }
                        pz8Var.l();
                        nm7.f(pz8Var.a).k(nm7.F1, new Object[0]);
                        break;
                    default:
                        pz8 pz8Var3 = this.b;
                        ArrayList arrayList5 = pz8Var3.b;
                        int i7 = pz8Var3.a;
                        TLRPC.TL_quickReply tL_quickReply2 = ((TL_update.TL_updateNewQuickReply) update2).quick_reply;
                        oz8 c3 = pz8Var3.c(tL_quickReply2.shortcut_id);
                        if (c3 != null) {
                            c3.b = tL_quickReply2.shortcut;
                            c3.f = tL_quickReply2.count;
                            c3.d = tL_quickReply2.top_message;
                            k47 k47Var3 = c3.e;
                            if (k47Var3 != null && k47Var3.e1() != tL_quickReply2.top_message) {
                                c3.e = null;
                                long e2 = z8c.h(i7).e();
                                cf7 Y3 = cf7.Y(i7);
                                Y3.a.c(new nz8(pz8Var3, Y3, c3, e2, (byte) 0));
                                break;
                            }
                        } else {
                            oz8 oz8Var2 = new oz8();
                            oz8Var2.a = tL_quickReply2.shortcut_id;
                            oz8Var2.b = tL_quickReply2.shortcut;
                            oz8Var2.f = tL_quickReply2.count;
                            oz8Var2.d = tL_quickReply2.top_message;
                            for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                                ((oz8) arrayList5.get(i8)).c = i8;
                            }
                            arrayList5.add(oz8Var2);
                            pz8Var3.a(oz8Var2.b);
                        }
                        pz8Var3.l();
                        nm7.f(i7).k(nm7.F1, new Object[0]);
                        break;
                }
            }
        });
        return true;
    }

    public final void k(int i, String str) {
        oz8 c = c(i);
        if (c == null) {
            return;
        }
        c.b = str;
        TLRPC.TL_messages_editQuickReplyShortcut tL_messages_editQuickReplyShortcut = new TLRPC.TL_messages_editQuickReplyShortcut();
        tL_messages_editQuickReplyShortcut.shortcut_id = i;
        tL_messages_editQuickReplyShortcut.shortcut = str;
        int i2 = this.a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_editQuickReplyShortcut, new nf2((byte) 7));
        l();
        nm7.f(i2).k(nm7.F1, new Object[0]);
    }

    public final void l() {
        cf7 Y = cf7.Y(this.a);
        Y.a.c(new ey8(this, Y, (byte) 6));
    }
}
