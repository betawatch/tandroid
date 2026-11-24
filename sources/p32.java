// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class p32 implements u32 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ p32(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // u32
    public final String run() {
        r58 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = r58.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = r58.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return mlb.l(sb, str, f);
    }
}
