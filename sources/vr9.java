// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vr9 {
    public long a;
    public boolean b;
    public int c;
    public k47 d;
    public int e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public int j;
    public int k;

    public static vr9 a(int i, TLRPC.Message message) {
        vr9 vr9Var = new vr9();
        vr9Var.a = k47.Q1(z8c.h(i).e(), message);
        vr9Var.b = false;
        vr9Var.c = message.id;
        vr9Var.d = new k47(i, message, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        return vr9Var;
    }

    public static vr9 b(int i, TLRPC.savedDialog saveddialog, ArrayList arrayList) {
        TLRPC.Message message;
        vr9 vr9Var = new vr9();
        vr9Var.a = pg3.n(saveddialog.peer);
        vr9Var.b = saveddialog.pinned;
        vr9Var.c = saveddialog.top_message;
        vr9Var.f = saveddialog.unread_count;
        vr9Var.g = saveddialog.read_inbox_max_id;
        vr9Var.h = saveddialog.read_outbox_max_id;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                message = null;
                break;
            }
            message = (TLRPC.Message) arrayList.get(i2);
            if (vr9Var.c == message.id) {
                break;
            }
            i2++;
        }
        TLRPC.Message message2 = message;
        if (message2 != null) {
            vr9Var.d = new k47(i, message2, null, null, null, null, null, false, false, 0L, false, false, true, 0);
        }
        return vr9Var;
    }

    public final int c() {
        TLRPC.Message message;
        k47 k47Var = this.d;
        return (k47Var == null || (message = k47Var.k) == null) ? this.j : (message.flags & 32768) != 0 ? message.edit_date : message.date;
    }

    public final boolean d() {
        TLRPC.Message message;
        k47 k47Var = this.d;
        return (k47Var == null || (message = k47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionHistoryClear)) ? false : true;
    }
}
