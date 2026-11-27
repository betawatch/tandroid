// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
