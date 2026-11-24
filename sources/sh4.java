// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sh4 {
    public final int a;
    public final int b;
    public final String c;
    public final byte d;
    public final TLRPC.MessagesFilter e;
    public TLObject f;
    public qh4 g;
    public boolean h;

    /* JADX WARN: Multi-variable type inference failed */
    public sh4(int i, int i2, String str) {
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

    public final boolean b(sh4 sh4Var) {
        if (this.d != sh4Var.d) {
            return a() && sh4Var.a();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sh4(int i, int i2, TLRPC.MessagesFilter messagesFilter, int i3) {
        this.h = true;
        this.a = i;
        this.b = i2;
        this.e = messagesFilter;
        this.d = i3;
    }
}
