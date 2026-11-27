// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ TLRPC.User c;

    public /* synthetic */ wn1(zu1 zu1Var, TLRPC.User user, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.presentFragment(zu1.ha(user.id));
                break;
            default:
                zu1Var.Da(user);
                break;
        }
    }
}
