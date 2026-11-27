// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
        hl.d3(new bcb((Object) this, (Object) tL_forumTopic, (byte) 16), 300L);
    }

    @Override // yu8
    public final void i(vp7 vp7Var) {
    }
}
