// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class uu1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iv1 b;
    public final /* synthetic */ TLRPC.Chat c;

    public /* synthetic */ uu1(iv1 iv1Var, TLRPC.Chat chat, byte b) {
        this.a = b;
        this.b = iv1Var;
        this.c = chat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.Chat chat = this.c;
        iv1 iv1Var = this.b;
        switch (b) {
            case 0:
                iv1Var.n(chat);
                break;
            case 1:
                iv1Var.a(chat);
                break;
            case 2:
                iv1Var.a.Aa(chat);
                break;
            default:
                c41.b0(iv1Var.a).Q(R.raw.contact_check, 36, jb6.a0(null, null, 2131742499, chat.title)).k(true);
                break;
        }
    }
}
