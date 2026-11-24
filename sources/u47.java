// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class u47 {
    public final nj a;
    public final long b;

    public u47(nj njVar, long j) {
        this.a = njVar;
        this.b = j;
    }

    public static u47 a() {
        return new u47(nj.h(0L, oj.a), 0L);
    }

    public static u47 b(TLRPC.SuggestedPost suggestedPost) {
        return suggestedPost == null ? a() : new u47(nj.m(suggestedPost.price), suggestedPost.schedule_date);
    }

    public final TLRPC.SuggestedPost c() {
        TLRPC.SuggestedPost suggestedPost = new TLRPC.SuggestedPost();
        nj njVar = this.a;
        if (njVar != null && !njVar.l()) {
            suggestedPost.price = njVar.q();
        }
        long j = this.b;
        if (j > 0) {
            suggestedPost.schedule_date = (int) j;
            suggestedPost.flags |= 1;
        }
        return suggestedPost;
    }
}
