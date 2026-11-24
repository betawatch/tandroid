// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zv5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ew5 b;
    public final /* synthetic */ TLRPC.TL_chatInviteJoinResultWebView c;
    public final /* synthetic */ long d;

    public /* synthetic */ zv5(ew5 ew5Var, TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView, long j, byte b) {
        this.a = b;
        this.b = ew5Var;
        this.c = tL_chatInviteJoinResultWebView;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = this.c;
        ew5 ew5Var = this.b;
        switch (b) {
            case 0:
                oc7.r1(ew5Var.a).d4(tL_chatInviteJoinResultWebView.users, false);
                br0.b(ew5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
            default:
                oc7.r1(ew5Var.a).d4(tL_chatInviteJoinResultWebView.users, false);
                br0.b(ew5Var.a).c(this.d, tL_chatInviteJoinResultWebView.bot_id, tL_chatInviteJoinResultWebView.query_id, false);
                break;
        }
    }
}
