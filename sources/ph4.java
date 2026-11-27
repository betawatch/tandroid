// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ph4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public nh4 g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public ph4(int i, int i2, String str) {
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

    public final boolean b(ph4 ph4Var) {
        if (this.d != ph4Var.d) {
            return a() && ph4Var.a();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ph4(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
        this.h = true;
        this.a = i;
        this.b = i2;
        this.e = messagesFilter;
        this.d = i3;
    }
}
