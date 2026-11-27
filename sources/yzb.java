// default package

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class yzb extends ka {
    public final TLRPC.TL_forumTopic c;

    public yzb(int i, TLRPC.TL_forumTopic tL_forumTopic) {
        super(i, false);
        this.c = tL_forumTopic;
    }

    public final boolean equals(Object obj) {
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this == obj) {
            return true;
        }
        if (obj == null || yzb.class != obj.getClass()) {
            return false;
        }
        yzb yzbVar = (yzb) obj;
        if (this.a != yzbVar.a) {
            return false;
        }
        TLRPC.TL_forumTopic tL_forumTopic2 = this.c;
        return tL_forumTopic2 == null || (tL_forumTopic = yzbVar.c) == null || tL_forumTopic2.id == tL_forumTopic.id;
    }
}
