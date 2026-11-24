// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class svb implements or8 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ tvb b;

    public svb(tvb tvbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = tvbVar;
        this.a = tL_forumTopic;
    }

    @Override // or8
    public final void n() {
        wvb wvbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        wvbVar.Y(tL_forumTopic.id);
        gl.d3(new a5b(this, tL_forumTopic, (byte) 19), 300L);
    }

    @Override // or8
    public final void h(vm7 vm7Var) {
    }
}
