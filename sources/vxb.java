// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vxb implements rt8 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ wxb b;

    public vxb(wxb wxbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = wxbVar;
        this.a = tL_forumTopic;
    }

    @Override // rt8
    public final void v() {
        zxb zxbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        zxbVar.Z(tL_forumTopic.id);
        gm.d3(new b7b(this, tL_forumTopic, (byte) 21), 300L);
    }

    @Override // rt8
    public final void f(zo7 zo7Var) {
    }
}
