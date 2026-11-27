// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vt1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ju1 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ vt1(ju1 ju1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = ju1Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        ju1 ju1Var = this.b;
        switch (b) {
            case 0:
                d31.b0(ju1Var.a).Q(R.raw.contact_check, 36, ob6.a0(null, null, 2131742467, chat.title)).k(true);
                break;
            case 1:
                ju1Var.n(chat);
                break;
            case 2:
                ju1Var.a(chat);
                break;
            default:
                ju1Var.a.Ba(chat);
                break;
        }
    }
}
