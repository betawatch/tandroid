// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yxb extends ja {
    public final TLRPC.TL_forumTopic c;

    public yxb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || yxb.class != obj.getClass()) {
            return false;
        }
        yxb yxbVar = (yxb) obj;
        if (this.a != yxbVar.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = yxbVar.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
