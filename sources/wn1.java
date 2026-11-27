// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
