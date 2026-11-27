// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class u22 implements z22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ u22(TLRPC.User user, byte b) {
        this.a = b;
        this.b = user;
    }

    @Override // z22
    public final String run() {
        f78 f;
        StringBuilder sb;
        String str;
        byte b = this.a;
        TLRPC.User user = this.b;
        switch (b) {
            case 0:
                f = f78.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
            default:
                f = f78.f();
                sb = new StringBuilder("+");
                str = user.phone;
                break;
        }
        return xnb.k(sb, str, f);
    }
}
