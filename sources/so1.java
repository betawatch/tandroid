// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class so1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ TLRPC.TL_error e;
    public final /* synthetic */ int f;
    public final /* synthetic */ r47 h;
    public final /* synthetic */ TLRPC.TL_messages_getDiscussionMessage n;
    public final /* synthetic */ TLRPC.Chat r;
    public final /* synthetic */ int s;
    public final /* synthetic */ r47 w;

    public /* synthetic */ so1(zu1 zu1Var, int i, TLObject tLObject, TLRPC.TL_error tL_error, int i2, r47 r47Var, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, TLRPC.Chat chat, int i3, r47 r47Var2, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = i;
        this.d = tLObject;
        this.e = tL_error;
        this.f = i2;
        this.h = r47Var;
        this.n = tL_messages_getDiscussionMessage;
        this.r = chat;
        this.s = i3;
        this.w = r47Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zu1 zu1Var = this.b;
                zu1Var.z6(new so1(zu1Var, this.c, this.d, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 1));
                break;
            default:
                zu1 zu1Var2 = this.b;
                if (this.c == zu1Var2.ad) {
                    zu1Var2.cd = -1;
                    TLObject tLObject = this.d;
                    if (tLObject == null) {
                        if ("CHANNEL_PRIVATE".equals(this.e.text)) {
                            uc7.f5(ob6.M0(2131752419, null), zu1Var2);
                            zu1Var2.dd = 0;
                            zu1Var2.ed = false;
                            zu1Var2.A0.i1();
                            break;
                        }
                    } else {
                        zu1Var2.hd = (TLRPC.messages_Messages) tLObject;
                    }
                    zu1Var2.Qa(zu1Var2.gd, zu1Var2.hd, this.f, this.h, this.n, this.r, this.s, this.w);
                    break;
                }
                break;
        }
    }
}
