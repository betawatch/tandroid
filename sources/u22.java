// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
