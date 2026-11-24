// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rf4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public pf4 g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public rf4(int i, int i2, String str) {
        this.h = true;
        this.a = i;
        this.c = str;
        this.e = null;
        this.d = i2;
    }

    public final boolean a() {
        byte b = this.d;
        return b == 0 || b == 1 || b == 2 || b == 3 || b == 5;
    }

    public final boolean b(rf4 rf4Var) {
        if (this.d != rf4Var.d) {
            return a() && rf4Var.a();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rf4(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
        this.h = true;
        this.a = i;
        this.b = i2;
        this.e = messagesFilter;
        this.d = i3;
    }
}
