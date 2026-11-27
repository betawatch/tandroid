// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ro1 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ TLRPC.TL_attachMenuBot c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ TLRPC.User e;

    public /* synthetic */ ro1(zu1 zu1Var, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        this.b = zu1Var;
        this.c = tL_attachMenuBot;
        this.d = tL_error;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.User user = this.e;
        TLRPC.TL_error tL_error = this.d;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.l9(tL_attachMenuBot, tL_error, user);
                break;
            default:
                zu1Var.j9(tL_attachMenuBot, tL_error, user);
                break;
        }
    }

    public /* synthetic */ ro1(zu1 zu1Var, TLRPC.TL_error tL_error, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.User user) {
        this.b = zu1Var;
        this.d = tL_error;
        this.c = tL_attachMenuBot;
        this.e = user;
    }
}
