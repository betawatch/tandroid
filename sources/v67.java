// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v67 {
    public final nk a;
    public final long b;

    public v67(nk nkVar, long j) {
        this.a = nkVar;
        this.b = j;
    }

    public static v67 a() {
        return new v67(nk.h(0L, ok.a), 0L);
    }

    public static v67 b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new v67(nk.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        nk nkVar = this.a;
        if (nkVar != null && !nkVar.l()) {
            suggestedPost.price = nkVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
