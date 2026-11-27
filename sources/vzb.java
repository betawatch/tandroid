// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vzb implements yu8 {
    public final /* synthetic */ TLRPC.TL_forumTopic a;
    public final /* synthetic */ wzb b;

    public vzb(wzb wzbVar, TLRPC.TL_forumTopic tL_forumTopic) {
        this.b = wzbVar;
        this.a = tL_forumTopic;
    }

    @Override // yu8
    public final void l() {
        zzb zzbVar = this.b.a;
        TLRPC.TL_forumTopic tL_forumTopic = this.a;
        zzbVar.Y(tL_forumTopic.id);
        hl.d3(new hab((Object) this, (Object) tL_forumTopic, (byte) 17), 300L);
    }

    @Override // yu8
    public final void i(vp7 vp7Var) {
    }
}
