// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
